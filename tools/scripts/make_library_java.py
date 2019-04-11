#!/usr/bin/python

from __future__ import print_function

__usage__ = """
python make_library.py <output_path>
"""
import traceback

import os, sys, re, hashlib

# for copying files
import shutil

def hashlib_md5sum(name, package, definition):
    str = package + "/" + name
    # parse definition
    for line in definition:
        # prep work
        line = line.strip().rstrip()
        value = None
        if line.find("#") > -1:
            line = line[0:line.find("#")]
        if line.find("=") > -1:
            try:
                value = line[line.find("=")+1:]
            except:
                value = '"' + line[line.find("=")+1:] + '"'
            line = line[0:line.find("=")]

        # find package/class name
        line = line.replace("\t", " ")
        l = line.split(" ")
        while "" in l:
            l.remove("")
        if len(l) < 2:
            continue
        ty, name = l[0:2]
        str = str + "|" + ty + " " + name
        if value != None:
            value = value.strip().rstrip()
            str = str + "=" + value
    hl = hashlib.md5()
    hl.update(str.encode(encoding='utf-8'))
    return hl.hexdigest()

def key_word_process(name):
    if name == 'package':
        return 'package_'
    elif name == 'interface':
        return 'interface_'
    else:
        return name

#####################################################################
# Data Types

class EnumerationType:
    """ For data values. """

    def __init__(self, name, ty, value):
        self.name = name
        self.type = ty
        self.value = value

    def make_declaration(self, f):
        cn = self.value.replace("\"","")
        if self.type == 'java.lang.String':
            f.write('    public static final %s %s = (%s)("%s");\n' % (self.type, self.name, self.type, cn) )
        else:
            f.write('    public static final %s %s = (%s)(%s);\n' % (self.type, self.name, self.type, self.value) )

class PrimitiveDataType:
    """ Our datatype is a java primitive. """
    def __init__(self, name, ty, bytes):
        self.name = name
        self.type = ty
        self.bytes = bytes
    def make_initializer(self, f, trailer):
        f.write('        this.%s = 0%s\n' % (self.name, trailer))

    def make_declaration(self, f):
        f.write('    public %s %s;\n' % (self.type, self.name) )

    def serialize(self, f):
        cn = self.name.replace("[","").replace("]","").split(".")[-1]
        if self.type == 'float':
            f.write('        int bits_%s = Float.floatToRawIntBits(%s);\n' % (cn, self.name) )
            for i in range(self.bytes):
                f.write('        outbuffer[offset + %d] = (byte)((bits_%s >> (8 * %d)) & 0xFF);\n' % (i, cn, i) )
        elif self.type == 'double':
            f.write('        long bits_%s = Double.doubleToRawLongBits(this.%s);\n' % (cn, self.name) )
            for i in range(self.bytes):
                f.write('        outbuffer[offset + %d] = (byte)((bits_%s >> (8 * %d)) & 0xFF);\n' % (i, cn, i) )
        else:
            for i in range(self.bytes):
                f.write('        outbuffer[offset + %d] = (byte)((this.%s >> (8 * %d)) & 0xFF);\n' % (i, self.name, i) )
        f.write('        offset += %s;\n' % (self.bytes) )

    def deserialize(self, f):
        cn = self.name.replace("[","").replace("]","").split(".")[-1]
        if self.type == 'float':
            f.write('        int bits_%s = 0;\n' % cn )
            for i in range(self.bytes):
                f.write('        bits_%s |= (int)((inbuffer[offset + %d] & 0xFF) << (8 * %d));\n' % (cn, i, i) )
            f.write('        this.%s = Float.intBitsToFloat(bits_%s);\n' % (self.name, cn) )
        elif self.type == 'double':
            f.write('        long bits_%s = 0;\n' % cn )
            for i in range(self.bytes):
                f.write('        bits_%s |= (long)((inbuffer[offset + %d] & 0xFF) << (8 * %d));\n' % (cn, i, i) )
            f.write('        this.%s = Double.longBitsToDouble(bits_%s);\n' % (self.name, cn) )
        else:
            f.write('        this.%s   = (%s)((inbuffer[offset + 0] & 0xFF) << (8 * 0));\n' % (self.name, self.type) )
            for i in range(self.bytes-1):
                f.write('        this.%s |= (%s)((inbuffer[offset + %d] & 0xFF) << (8 * %d));\n' % (self.name, self.type, i+1, i+1) )
        f.write('        offset += %s;\n' % (self.bytes) )

    def serializedLength(self, f):
        f.write('        length += %s;\n' % (self.bytes) )


class MessageDataType(PrimitiveDataType):
    """ For when our data type is another message. """

    def make_initializer(self, f, trailer):
        f.write('        this.%s = new %s();\n' % (self.name, self.type) )

    def serialize(self, f):
        f.write('        offset = this.%s.serialize(outbuffer, offset);\n' % self.name)

    def deserialize(self, f):
        f.write('        offset = this.%s.deserialize(inbuffer, offset);\n' % self.name)

    def serializedLength(self, f):
        f.write('        length += this.%s.serializedLength();\n' % self.name)


class StringDataType(PrimitiveDataType):
    """ Need to convert to signed char *. """

    def make_initializer(self, f, trailer):
        f.write('        this.%s = ""%s\n' % (self.name, trailer))

    def make_declaration(self, f):
        f.write('    public %s %s;\n' % (self.type, self.name) )

    def serialize(self, f):
        cn = self.name.replace("[","").replace("]","")
        f.write('        int length_%s = this.%s.getBytes().length;\n' % (cn,self.name) )
        f.write('        outbuffer[offset + 0] = (byte)((length_%s >> (8 * 0)) & 0xFF);\n' % (cn))
        f.write('        outbuffer[offset + 1] = (byte)((length_%s >> (8 * 1)) & 0xFF);\n' % (cn))
        f.write('        outbuffer[offset + 2] = (byte)((length_%s >> (8 * 2)) & 0xFF);\n' % (cn))
        f.write('        outbuffer[offset + 3] = (byte)((length_%s >> (8 * 3)) & 0xFF);\n' % (cn))
        f.write('        offset += 4;\n')
        f.write('        for (int k=0; k<length_%s; k++) {\n' % (cn))
        f.write('            outbuffer[offset + k] = (byte)((this.%s.getBytes())[k] & 0xFF);\n' % (self.name))
        f.write('        }\n')
        f.write('        offset += length_%s;\n' % cn)

    def deserialize(self, f):
        cn = self.name.replace("[","").replace("]","")
        f.write('        int length_%s = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));\n' % cn)
        f.write('        length_%s |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));\n' % cn)
        f.write('        length_%s |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));\n' % cn)
        f.write('        length_%s |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));\n' % cn)
        f.write('        offset += 4;\n')
        f.write('        byte[] bytes_%s = new byte[length_%s];\n' % (cn, cn) )
        f.write('        for(int k= 0; k< length_%s; k++){\n' %cn)
        f.write('            bytes_%s[k] = (byte)(inbuffer[k + offset] & 0xFF);\n' % cn)
        f.write('        }\n')
        f.write('        this.%s = new java.lang.String(bytes_%s);\n' % (self.name, cn) )
        f.write('        offset += length_%s;\n' % cn)

    def serializedLength(self, f):
        cn = self.name.replace("[","").replace("]","")
        f.write('        int length_%s = this.%s.getBytes().length;\n' % (cn,self.name) )
        f.write('        length += 4;\n')
        f.write('        length += length_%s;\n' % cn)


class TimeDataType(PrimitiveDataType):

    def __init__(self, name, ty, bytes):
        self.name = name
        self.type = ty
        self.sec = PrimitiveDataType(name+'.sec','long',4)
        self.nsec = PrimitiveDataType(name+'.nsec','long',4)

    def make_initializer(self, f, trailer):
        f.write('        this.%s = new %s();\n' % (self.name, self.type) )

    def make_declaration(self, f):
        f.write('    public %s %s;\n' % (self.type, self.name) )

    def serialize(self, f):
        self.sec.serialize(f)
        self.nsec.serialize(f)

    def deserialize(self, f):
        self.sec.deserialize(f)
        self.nsec.deserialize(f)

    def serializedLength(self, f):
        self.sec.serializedLength(f)
        self.nsec.serializedLength(f)


class ArrayDataType(PrimitiveDataType):

    def __init__(self, name, ty, bytes, cls, array_size=None):
        self.name = name
        self.type = ty
        self.bytes = bytes
        self.size = array_size
        self.cls = cls

    def make_initializer(self, f, trailer):
        if self.size == None:
            f.write('        this.%s = null;\n' % self.name)
        else:
            f.write('        this.%s = new %s[%s]%s\n' % (self.name, self.type, self.size, trailer))

    def make_declaration(self, f):
        f.write('    public %s[] %s;\n' % (self.type, self.name))

    def serialize(self, f):
        c = self.cls(self.name+"[i]", self.type, self.bytes)
        if self.size == None:
            # serialize length
            f.write('        int length_%s = this.%s != null ? this.%s.length : 0;\n' % (self.name, self.name, self.name) )
            f.write('        outbuffer[offset + 0] = (byte)((length_%s >> (8 * 0)) & 0xFF);\n' % self.name)
            f.write('        outbuffer[offset + 1] = (byte)((length_%s >> (8 * 1)) & 0xFF);\n' % self.name)
            f.write('        outbuffer[offset + 2] = (byte)((length_%s >> (8 * 2)) & 0xFF);\n' % self.name)
            f.write('        outbuffer[offset + 3] = (byte)((length_%s >> (8 * 3)) & 0xFF);\n' % self.name)
            f.write('        offset += 4;\n')
            f.write('        for (int i = 0; i < length_%s; i++){\n' % self.name)
            c.serialize(f)
            f.write('        }\n')
        else:
            f.write('        for (int i = 0; i < %d; i++){\n' % (self.size) )
            c.serialize(f)
            f.write('        }\n')

    def deserialize(self, f):
        if self.size == None:
            c = self.cls(self.name+"[i]", self.type, self.bytes)
            # deserialize length
            f.write('        int length_%s = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));\n' % self.name)
            f.write('        length_%s |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));\n' % self.name)
            f.write('        length_%s |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));\n' % self.name)
            f.write('        length_%s |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));\n' % self.name)
            f.write('        offset += 4;\n' )
            f.write('        if(length_%s > 0) {\n' % self.name)
            f.write('            this.%s = new %s[length_%s];\n' % (self.name, self.type, self.name))
            f.write('        }\n' )
            # copy to array
            f.write('        for (int i = 0; i < length_%s; i++){\n' % (self.name) )
            c.deserialize(f)
            f.write('        }\n')
        else:
            c = self.cls(self.name+"[i]", self.type, self.bytes)
            f.write('        for(int i = 0; i < %d; i++){\n' % (self.size) )
            c.deserialize(f)
            f.write('        }\n')

    def serializedLength(self, f):
        c = self.cls(self.name+"[i]", self.type, self.bytes)
        if self.size == None:
            # serialize length
            f.write('        length += 4;\n' )
            f.write('        int length_%s = this.%s != null ? this.%s.length : 0;\n' % (self.name, self.name, self.name) )
            f.write('        for (int i = 0; i < length_%s; i++) {\n' % self.name)
            c.serializedLength(f)
            f.write('        }\n')
        else:
            f.write('        for (int i = 0; i < %d; i++){\n' % (self.size) )
            c.serializedLength(f)
            f.write('        }\n')

class BoolDataType:
    def __init__(self, name, ty, bytes):
        self.name = name
        self.type = ty
        self.bytes = bytes
    def make_initializer(self, f, trailer):
        f.write('        this.%s = false%s\n' % (self.name, trailer))

    def make_declaration(self, f):
        f.write('    public %s %s;\n' % (self.type, self.name) )

    def serialize(self, f):
        f.write('        outbuffer[offset] = (byte)((%s ? 0x01 : 0x00) & 0xFF);\n' % (self.name) )
        f.write('        offset += %s;\n' % (self.bytes) )

    def deserialize(self, f):
        f.write('        this.%s = (%s)((inbuffer[offset] & 0xFF) != 0 ? true : false);\n' % (self.name, self.type) )
        f.write('        offset += %s;\n' % (self.bytes) )

    def serializedLength(self, f):
        f.write('        length += %s;\n' % (self.bytes) )


ROS_TO_EMBEDDED_TYPES = {
    'bool'    :   ('boolean',              1, BoolDataType, []),
    'byte'    :   ('byte',                 1, PrimitiveDataType, []),
    'int8'    :   ('byte',                 1, PrimitiveDataType, []),
    'char'    :   ('char',                 1, PrimitiveDataType, []),
    'uint8'   :   ('int',                  1, PrimitiveDataType, []),
    'int16'   :   ('short',                2, PrimitiveDataType, []),
    'uint16'  :   ('int',                  2, PrimitiveDataType, []),
    'int32'   :   ('int',                  4, PrimitiveDataType, []),
    'uint32'  :   ('long',                 4, PrimitiveDataType, []),
    'int64'   :   ('long',                 8, PrimitiveDataType, []),
    'uint64'  :   ('long',                 8, PrimitiveDataType, []),
    'float32' :   ('float',                4, PrimitiveDataType, []),
    'float64' :   ('double',               8, PrimitiveDataType, []),
    'time'    :   ('com.roslib.ros.Time',  8, TimeDataType, []),
    'duration':   ('com.roslib.ros.Duration',  8, TimeDataType, []),
    'string'  :   ('java.lang.String',  0, StringDataType, []),
    'Header'  :   ('com.roslib.std_msgs.Header',  0, MessageDataType, [])
}

#####################################################################
# Messages

class Message:
    """ Parses message definitions into something we can export. """
    def __init__(self, name, package, definition):

        self.name = name  # name of message/class
        self.package = package      # package we reside in
        self.includes = list()      # other files we must include

        self.data = list()          # data types for code generation
        self.enums = list()
        self.md5 = hashlib_md5sum(name, package, definition)

        # parse definition
        for line in definition:
            # prep work
            line = line.strip().rstrip()
            value = None
            if line.find("#") > -1:
                line = line[0:line.find("#")]
            if line.find("=") > -1:
                try:
                    value = line[line.find("=")+1:]
                except:
                    value = '"' + line[line.find("=")+1:] + '"';
                line = line[0:line.find("=")]

            # find package/class name
            line = line.replace("\t", " ")
            l = line.split(" ")
            while "" in l:
                l.remove("")
            if len(l) < 2:
                continue
            ty, name = l[0:2]
            if value != None:
                self.enums.append( EnumerationType(name, ROS_TO_EMBEDDED_TYPES[ty][0], value))
                continue

            try:
                type_package, type_name = ty.split("/")
            except:
                type_package = None
                type_name = ty
            type_array = False
            if type_name.find('[') > 0:
                type_array = True
                try:
                    type_array_size = int(type_name[type_name.find('[')+1:type_name.find(']')])
                except:
                    type_array_size = None
                type_name = type_name[0:type_name.find('[')]

            # convert to C type if primitive, expand name otherwise
            try:
                code_type = ROS_TO_EMBEDDED_TYPES[type_name][0]
                size = ROS_TO_EMBEDDED_TYPES[type_name][1]
                cls = ROS_TO_EMBEDDED_TYPES[type_name][2]
            except:
                if type_package == None:
                    type_package = self.package
                cls = MessageDataType
                code_type = "com.roslib."+type_package+"."+type_name
                size = 0

            name = key_word_process(name)

            if type_array:
                self.data.append( ArrayDataType(name, code_type, size, cls, type_array_size ) )
            else:
                self.data.append( cls(name, code_type, size) )

    def _write_id(self, f):
        f.write('')

    def _write_id_initializer(self, f):
        f.write('')

    def _write_id_serializer(self, f):
        f.write('')

    def _write_id_deserializer(self, f):
        f.write('')

    def _write_getID(self, f):
        f.write('    public long getID() { return 0; }\n')

    def _write_setID(self, f):
        f.write('    public void setID(long id) { }\n')

    def _write_serializer(self, f):
                # serializer
        f.write('    public int serialize(byte[] outbuffer, int start) {\n')
        f.write('        int offset = start;\n')
        self._write_id_serializer(f)
        for d in self.data:
            d.serialize(f)
        f.write('        return offset;\n');
        f.write('    }\n')
        f.write('\n')

    def _write_deserializer(self, f):
        # deserializer
        f.write('    public int deserialize(byte[] inbuffer, int start) {\n')
        f.write('        int offset = start;\n')
        self._write_id_deserializer(f)
        for d in self.data:
            d.deserialize(f)
        f.write('        return offset;\n');
        f.write('    }\n')
        f.write('\n')

    def _write_serializedLength(self, f):
        # serializedLength
        f.write('    public int serializedLength() {\n')
        f.write('        int length = 0;\n')
        for d in self.data:
            d.serializedLength(f)
        f.write('        return length;\n');
        f.write('    }\n')
        f.write('\n')

    def _write_std_includes(self, f):
        f.write('package com.roslib.%s;\n\n' % (self.package) )
        f.write('import java.lang.*;\n')

    def _write_msg_includes(self,f):
        for i in self.includes:
            f.write('import %s;\n' % i)

    def _write_constructor(self, f):
        f.write('    public %s() {\n' % (self.name))
        if self.data:
            for d in self.data:
                d.make_initializer(f, ';')
        self._write_id_initializer(f)
        f.write('    }\n\n')

    def _write_data(self, f):
        for d in self.data:
            d.make_declaration(f)
        for e in self.enums:
            e.make_declaration(f)
        f.write('\n')

    def _write_getType(self, f):
        f.write('    public java.lang.String getType(){ return "%s/%s"; }\n'%(self.package, self.name))

    def _write_getMD5(self, f):
        f.write('    public java.lang.String getMD5(){ return "%s"; }\n'%self.md5)

    def _write_impl(self, f):
        f.write('public class %s implements com.roslib.ros.Msg {\n' % self.name)
        self._write_id(f)
        self._write_data(f)
        self._write_constructor(f)
        self._write_serializer(f)
        self._write_deserializer(f)
        self._write_serializedLength(f)
        self._write_getType(f)
        self._write_getMD5(f)
        self._write_getID(f)
        self._write_setID(f)
        f.write('}\n')

    def make_header(self, f):
        self._write_std_includes(f)
        self._write_msg_includes(f)

        f.write('\n')
        self._write_impl(f)

class Service:
    def __init__(self, name, package, definition):
        """
        @param name -  name of service
        @param package - name of service package
        @param definition - list of lines of  definition
        """

        self.name = name
        self.package = package

        sep_line = len(definition)
        sep = re.compile('---*')
        for i in range(0, len(definition)):
            if (None!= re.match(sep, definition[i]) ):
                sep_line = i
                break
        self.req_def = definition[0:sep_line]
        self.resp_def = definition[sep_line+1:]

        self.req = Message(name+"Request", package, self.req_def)
        self.resp = Message(name+"Response", package, self.resp_def)

    def make_header(self, f):
        self.req._write_std_includes(f)
        includes = self.req.includes
        includes.extend(self.resp.includes)
        includes = list(set(includes))
        for inc in includes:
            f.write('import %s;\n' % inc)

        f.write('\n')
        f.write('public class %s {\n' % self.name)
        f.write('\n')
        f.write('public static final java.lang.String %s = "%s/%s";\n'%(self.name.upper(), self.package, self.name))

        def write_id(out):
            out.write('    private long __id__;\n')
        _write_id = lambda out: write_id(out)
        self.req._write_id = _write_id
        self.resp._write_id = _write_id

        def write_id_initializer(out):
            out.write('        this.__id__ = 0;\n')
        _write_id_initializer = lambda out: write_id_initializer(out)
        self.req._write_id_initializer = _write_id_initializer
        self.resp._write_id_initializer = _write_id_initializer

        def write_id_serializer(out):
            out.write('        outbuffer[offset + 0] = (byte)((this.__id__ >> (8 * 0)) & 0xFF);\n')
            out.write('        outbuffer[offset + 1] = (byte)((this.__id__ >> (8 * 1)) & 0xFF);\n')
            out.write('        outbuffer[offset + 2] = (byte)((this.__id__ >> (8 * 2)) & 0xFF);\n')
            out.write('        outbuffer[offset + 3] = (byte)((this.__id__ >> (8 * 3)) & 0xFF);\n')
            out.write('        offset += 4;\n')
        _write_id_serializer = lambda out: write_id_serializer(out)
        self.req._write_id_serializer = _write_id_serializer
        self.resp._write_id_serializer = _write_id_serializer

        def write_id_deserializer(out):
            out.write('        this.__id__  = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));\n')
            out.write('        this.__id__ |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));\n')
            out.write('        this.__id__ |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));\n')
            out.write('        this.__id__ |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));\n')
            out.write('        offset += 4;\n')
        _write_id_deserializer = lambda out: write_id_deserializer(out)
        self.req._write_id_deserializer = _write_id_deserializer
        self.resp._write_id_deserializer = _write_id_deserializer

        def write_getID(out):
            out.write('    public long getID() { return this.__id__; }\n')
        _write_getID = lambda out: write_getID(out)
        self.req._write_getID = _write_getID
        self.resp._write_getID = _write_getID

        def write_setID(out):
            out.write('    public void setID(long id) { this.__id__ = id; }\n')
        _write_setID = lambda out: write_setID(out)
        self.req._write_setID = _write_setID
        self.resp._write_setID = _write_setID

        def write_type(out, name):
            out.write('    public java.lang.String getType() { return %s; }\n'%(name))
        _write_getType = lambda out: write_type(out, self.name.upper())
        self.req._write_getType = _write_getType
        self.resp._write_getType = _write_getType

        f.write('\n')
        self.req._write_impl(f)
        f.write('\n')
        self.resp._write_impl(f)
        f.write('\n')

        f.write('}\n')

#####################################################################
# Make a Library

def MakeLibrary(pkg_dir, package, output_path):
    # find the messages in this package
    messages = list()
    if os.path.exists(pkg_dir+"/msg"):
        print('Exporting %s\n'%package)
        sys.stdout.write('  Messages:')
        sys.stdout.write('\n    ')
        for f in os.listdir(pkg_dir+"/msg"):
            if f.endswith(".msg"):
                msg_file = pkg_dir + "/msg/" + f
                # add to list of messages
                print('%s,'%f[0:-4], end='')
                definition = open(msg_file).readlines()
                messages.append( Message(f[0:-4], package, definition) )

    

    # find the services in this package
    if (os.path.exists(pkg_dir+"/srv/")):
        if messages == list():
            print('Exporting %s\n'%package)
        else:
            print('\n')
        sys.stdout.write('  Services:')
        sys.stdout.write('\n    ')
        for f in os.listdir(pkg_dir+"/srv"):
            if f.endswith(".srv"):
                srv_file = pkg_dir + "/srv/" + f
                # add to list of messages
                print('%s,'%f[0:-4], end='')
                definition = open(srv_file).readlines()
                messages.append( Service(f[0:-4], package, definition) )
        print('\n')
    elif messages != list():
        print('\n')

    # generate for each message
    output_path = output_path + "/" + package
    for msg in messages:
        if not os.path.exists(output_path):
            os.makedirs(output_path)
        header = open(output_path + "/" + msg.name + ".java", "w")
        msg.make_header(header)
        header.close()

def messages_generate(path):
    # gimme messages
    failed = []
    mydir = sys.argv[1] + "/msgs"
    for d in sorted(os.listdir(mydir)):
        for p in sorted(os.listdir(mydir + "/" + d)):
	    try:
	        MakeLibrary(mydir + "/" + d + "/" + p, p, path)
	    except Exception as e:
	        failed.append(p + " ("+str(e)+")")
	        print('[%s]: Unable to build messages: %s\n' % (p, str(e)))
	        print(traceback.format_exc())

    print('\n')
    if len(failed) > 0:
        print('*** Warning, failed to generate libraries for the following packages: ***')
        for f in failed:
            print('    %s'%f)
        raise Exception("Failed to generate libraries for: " + str(failed))
    print('\n')

def roslib_copy_roslib_files(path):
    os.makedirs(path+"ros")
    files = ['ros/Duration.java',
             'ros/Msg.java',
             'ros/CallbackSrvT.java',
             'ros/CallbackSubT.java',
             'ros/Hardware.java',
             'ros/NodeHandle.java',
             'ros/Publisher.java',
             'ros/ServiceClient.java',
             'ros/ServiceServer.java',
             'ros/Subscriber.java',
             'ros/SubscriberT.java',
             'ros/Time.java']

    mydir = sys.argv[1] + "/roslib/java/"
    for f in files:
        shutil.copy(mydir+f, path+f)

def roslib_copy_examples_files(path):
    os.makedirs(path+"examples/publisher")
    os.makedirs(path+"examples/subscriber")
    os.makedirs(path+"examples/service")
    os.makedirs(path+"examples/service_client")
    files = ['examples/publisher/ExamplePublisher.java',
             'examples/subscriber/ExampleSubscriber.java',
             'examples/service/ExampleService.java',
             'examples/service_client/ExampleServiceClient.java']

    mydir = sys.argv[1] + "/"
    for f in files:
        shutil.copy(mydir+f, path+f)

# Enforce correct inputs
if (len(sys.argv) < 2):
    print(__usage__)
    exit(1)

# Sanitize output path
path = sys.argv[2]
if path[-1] == "/":
    path = path[0:-1]
print("\nExporting to %s" % path)

roslib_copy_roslib_files(path+"/roslib/java/com/roslib/")
roslib_copy_examples_files(path+"/roslib/java/")
messages_generate(path+"/roslib/java/com/roslib")
