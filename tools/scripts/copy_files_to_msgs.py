#!/usr/bin/python

import os, sys

pwd = os.getcwd()

__usage__ = """
python copy_files_to_msgs.py <path>
"""

# Enforce correct inputs
if (len(sys.argv) < 2):
    print(__usage__)
    exit(1)

# Sanitize output path
pkg_dir = sys.argv[1]
if pkg_dir[-1] == "/":
    pkg_dir = pkg_dir[0:-1]
print("\nCofy_msgs_from: %s" % pkg_dir)

for p in os.listdir(pkg_dir):
  if os.path.exists(pkg_dir+"/"+p+"/msg"):
    src=pkg_dir+"/"+p+"/msg"
    des=pwd+"/../../msgs/tmp/"+p+"/"
    print(pkg_dir + p + " -> " + pwd+"/../../msgs/tmp/"+p)
    os.system("mkdir -p %s/../../msgs/tmp/%s" % (pwd,p))
    os.system("cp -rf %s %s" % (src, des)); 
  if os.path.exists(pkg_dir+"/"+p+"/srv"):
    src=pkg_dir+"/"+p+"/srv"
    des=pwd+"/../../msgs/tmp/"+p+"/"
    print(pkg_dir + p + " -> " + pwd+"/../../msgs/tmp/"+p)
    os.system("mkdir -p %s/../../msgs/tmp/%s" % (pwd,p))
    os.system("cp -rf %s %s" % (src, des)); 

