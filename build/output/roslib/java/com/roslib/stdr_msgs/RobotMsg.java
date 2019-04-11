package com.roslib.stdr_msgs;

import java.lang.*;

public class RobotMsg implements com.roslib.ros.Msg {
    public com.roslib.geometry_msgs.Pose2D initialPose;
    public com.roslib.stdr_msgs.FootprintMsg footprint;
    public com.roslib.stdr_msgs.LaserSensorMsg[] laserSensors;
    public com.roslib.stdr_msgs.SonarSensorMsg[] sonarSensors;
    public com.roslib.stdr_msgs.RfidSensorMsg[] rfidSensors;
    public com.roslib.stdr_msgs.CO2SensorMsg[] co2Sensors;
    public com.roslib.stdr_msgs.SoundSensorMsg[] soundSensors;
    public com.roslib.stdr_msgs.ThermalSensorMsg[] thermalSensors;
    public com.roslib.stdr_msgs.KinematicMsg kinematicModel;

    public RobotMsg() {
        this.initialPose = new com.roslib.geometry_msgs.Pose2D();
        this.footprint = new com.roslib.stdr_msgs.FootprintMsg();
        this.laserSensors = null;
        this.sonarSensors = null;
        this.rfidSensors = null;
        this.co2Sensors = null;
        this.soundSensors = null;
        this.thermalSensors = null;
        this.kinematicModel = new com.roslib.stdr_msgs.KinematicMsg();
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.initialPose.serialize(outbuffer, offset);
        offset = this.footprint.serialize(outbuffer, offset);
        int length_laserSensors = this.laserSensors != null ? this.laserSensors.length : 0;
        outbuffer[offset + 0] = (byte)((length_laserSensors >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_laserSensors >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_laserSensors >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_laserSensors >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_laserSensors; i++){
        offset = this.laserSensors[i].serialize(outbuffer, offset);
        }
        int length_sonarSensors = this.sonarSensors != null ? this.sonarSensors.length : 0;
        outbuffer[offset + 0] = (byte)((length_sonarSensors >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_sonarSensors >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_sonarSensors >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_sonarSensors >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_sonarSensors; i++){
        offset = this.sonarSensors[i].serialize(outbuffer, offset);
        }
        int length_rfidSensors = this.rfidSensors != null ? this.rfidSensors.length : 0;
        outbuffer[offset + 0] = (byte)((length_rfidSensors >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_rfidSensors >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_rfidSensors >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_rfidSensors >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_rfidSensors; i++){
        offset = this.rfidSensors[i].serialize(outbuffer, offset);
        }
        int length_co2Sensors = this.co2Sensors != null ? this.co2Sensors.length : 0;
        outbuffer[offset + 0] = (byte)((length_co2Sensors >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_co2Sensors >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_co2Sensors >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_co2Sensors >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_co2Sensors; i++){
        offset = this.co2Sensors[i].serialize(outbuffer, offset);
        }
        int length_soundSensors = this.soundSensors != null ? this.soundSensors.length : 0;
        outbuffer[offset + 0] = (byte)((length_soundSensors >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_soundSensors >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_soundSensors >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_soundSensors >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_soundSensors; i++){
        offset = this.soundSensors[i].serialize(outbuffer, offset);
        }
        int length_thermalSensors = this.thermalSensors != null ? this.thermalSensors.length : 0;
        outbuffer[offset + 0] = (byte)((length_thermalSensors >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_thermalSensors >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_thermalSensors >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_thermalSensors >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_thermalSensors; i++){
        offset = this.thermalSensors[i].serialize(outbuffer, offset);
        }
        offset = this.kinematicModel.serialize(outbuffer, offset);
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.initialPose.deserialize(inbuffer, offset);
        offset = this.footprint.deserialize(inbuffer, offset);
        int length_laserSensors = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_laserSensors |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_laserSensors |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_laserSensors |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_laserSensors > 0) {
            this.laserSensors = new com.roslib.stdr_msgs.LaserSensorMsg[length_laserSensors];
        }
        for (int i = 0; i < length_laserSensors; i++){
        offset = this.laserSensors[i].deserialize(inbuffer, offset);
        }
        int length_sonarSensors = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_sonarSensors |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_sonarSensors |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_sonarSensors |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_sonarSensors > 0) {
            this.sonarSensors = new com.roslib.stdr_msgs.SonarSensorMsg[length_sonarSensors];
        }
        for (int i = 0; i < length_sonarSensors; i++){
        offset = this.sonarSensors[i].deserialize(inbuffer, offset);
        }
        int length_rfidSensors = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_rfidSensors |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_rfidSensors |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_rfidSensors |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_rfidSensors > 0) {
            this.rfidSensors = new com.roslib.stdr_msgs.RfidSensorMsg[length_rfidSensors];
        }
        for (int i = 0; i < length_rfidSensors; i++){
        offset = this.rfidSensors[i].deserialize(inbuffer, offset);
        }
        int length_co2Sensors = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_co2Sensors |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_co2Sensors |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_co2Sensors |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_co2Sensors > 0) {
            this.co2Sensors = new com.roslib.stdr_msgs.CO2SensorMsg[length_co2Sensors];
        }
        for (int i = 0; i < length_co2Sensors; i++){
        offset = this.co2Sensors[i].deserialize(inbuffer, offset);
        }
        int length_soundSensors = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_soundSensors |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_soundSensors |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_soundSensors |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_soundSensors > 0) {
            this.soundSensors = new com.roslib.stdr_msgs.SoundSensorMsg[length_soundSensors];
        }
        for (int i = 0; i < length_soundSensors; i++){
        offset = this.soundSensors[i].deserialize(inbuffer, offset);
        }
        int length_thermalSensors = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_thermalSensors |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_thermalSensors |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_thermalSensors |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_thermalSensors > 0) {
            this.thermalSensors = new com.roslib.stdr_msgs.ThermalSensorMsg[length_thermalSensors];
        }
        for (int i = 0; i < length_thermalSensors; i++){
        offset = this.thermalSensors[i].deserialize(inbuffer, offset);
        }
        offset = this.kinematicModel.deserialize(inbuffer, offset);
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.initialPose.serializedLength();
        length += this.footprint.serializedLength();
        length += 4;
        int length_laserSensors = this.laserSensors != null ? this.laserSensors.length : 0;
        for (int i = 0; i < length_laserSensors; i++) {
        length += this.laserSensors[i].serializedLength();
        }
        length += 4;
        int length_sonarSensors = this.sonarSensors != null ? this.sonarSensors.length : 0;
        for (int i = 0; i < length_sonarSensors; i++) {
        length += this.sonarSensors[i].serializedLength();
        }
        length += 4;
        int length_rfidSensors = this.rfidSensors != null ? this.rfidSensors.length : 0;
        for (int i = 0; i < length_rfidSensors; i++) {
        length += this.rfidSensors[i].serializedLength();
        }
        length += 4;
        int length_co2Sensors = this.co2Sensors != null ? this.co2Sensors.length : 0;
        for (int i = 0; i < length_co2Sensors; i++) {
        length += this.co2Sensors[i].serializedLength();
        }
        length += 4;
        int length_soundSensors = this.soundSensors != null ? this.soundSensors.length : 0;
        for (int i = 0; i < length_soundSensors; i++) {
        length += this.soundSensors[i].serializedLength();
        }
        length += 4;
        int length_thermalSensors = this.thermalSensors != null ? this.thermalSensors.length : 0;
        for (int i = 0; i < length_thermalSensors; i++) {
        length += this.thermalSensors[i].serializedLength();
        }
        length += this.kinematicModel.serializedLength();
        return length;
    }

    public java.lang.String getType(){ return "stdr_msgs/RobotMsg"; }
    public java.lang.String getMD5(){ return "8dee8be159ceb167303b8e278e43f295"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
