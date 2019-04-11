package com.roslib.gateway_msgs;

import java.lang.*;

public class ConnectionStatistics implements com.roslib.ros.Msg {
    public boolean gateway_available;
    public long time_since_last_seen;
    public float ping_latency_min;
    public float ping_latency_max;
    public float ping_latency_avg;
    public float ping_latency_mdev;
    public boolean network_info_available;
    public byte network_type;
    public float wireless_bitrate;
    public byte wireless_link_quality;
    public float wireless_signal_level;
    public float wireless_noise_level;
    public static final byte WIRED = (byte)( 1);
    public static final byte WIRELESS = (byte)( 2);
    public static final int MAX_TTL = (int)( 86400);

    public ConnectionStatistics() {
        this.gateway_available = false;
        this.time_since_last_seen = 0;
        this.ping_latency_min = 0;
        this.ping_latency_max = 0;
        this.ping_latency_avg = 0;
        this.ping_latency_mdev = 0;
        this.network_info_available = false;
        this.network_type = 0;
        this.wireless_bitrate = 0;
        this.wireless_link_quality = 0;
        this.wireless_signal_level = 0;
        this.wireless_noise_level = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset] = (byte)((gateway_available ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.time_since_last_seen >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.time_since_last_seen >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.time_since_last_seen >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.time_since_last_seen >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((this.time_since_last_seen >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((this.time_since_last_seen >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((this.time_since_last_seen >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((this.time_since_last_seen >> (8 * 7)) & 0xFF);
        offset += 8;
        int bits_ping_latency_min = Float.floatToRawIntBits(ping_latency_min);
        outbuffer[offset + 0] = (byte)((bits_ping_latency_min >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_ping_latency_min >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_ping_latency_min >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_ping_latency_min >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_ping_latency_max = Float.floatToRawIntBits(ping_latency_max);
        outbuffer[offset + 0] = (byte)((bits_ping_latency_max >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_ping_latency_max >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_ping_latency_max >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_ping_latency_max >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_ping_latency_avg = Float.floatToRawIntBits(ping_latency_avg);
        outbuffer[offset + 0] = (byte)((bits_ping_latency_avg >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_ping_latency_avg >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_ping_latency_avg >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_ping_latency_avg >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_ping_latency_mdev = Float.floatToRawIntBits(ping_latency_mdev);
        outbuffer[offset + 0] = (byte)((bits_ping_latency_mdev >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_ping_latency_mdev >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_ping_latency_mdev >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_ping_latency_mdev >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset] = (byte)((network_info_available ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.network_type >> (8 * 0)) & 0xFF);
        offset += 1;
        int bits_wireless_bitrate = Float.floatToRawIntBits(wireless_bitrate);
        outbuffer[offset + 0] = (byte)((bits_wireless_bitrate >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_wireless_bitrate >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_wireless_bitrate >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_wireless_bitrate >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.wireless_link_quality >> (8 * 0)) & 0xFF);
        offset += 1;
        int bits_wireless_signal_level = Float.floatToRawIntBits(wireless_signal_level);
        outbuffer[offset + 0] = (byte)((bits_wireless_signal_level >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_wireless_signal_level >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_wireless_signal_level >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_wireless_signal_level >> (8 * 3)) & 0xFF);
        offset += 4;
        int bits_wireless_noise_level = Float.floatToRawIntBits(wireless_noise_level);
        outbuffer[offset + 0] = (byte)((bits_wireless_noise_level >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_wireless_noise_level >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_wireless_noise_level >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_wireless_noise_level >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.gateway_available = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.time_since_last_seen   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.time_since_last_seen |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.time_since_last_seen |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.time_since_last_seen |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.time_since_last_seen |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        this.time_since_last_seen |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        this.time_since_last_seen |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        this.time_since_last_seen |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        offset += 8;
        int bits_ping_latency_min = 0;
        bits_ping_latency_min |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_ping_latency_min |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_ping_latency_min |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_ping_latency_min |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.ping_latency_min = Float.intBitsToFloat(bits_ping_latency_min);
        offset += 4;
        int bits_ping_latency_max = 0;
        bits_ping_latency_max |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_ping_latency_max |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_ping_latency_max |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_ping_latency_max |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.ping_latency_max = Float.intBitsToFloat(bits_ping_latency_max);
        offset += 4;
        int bits_ping_latency_avg = 0;
        bits_ping_latency_avg |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_ping_latency_avg |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_ping_latency_avg |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_ping_latency_avg |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.ping_latency_avg = Float.intBitsToFloat(bits_ping_latency_avg);
        offset += 4;
        int bits_ping_latency_mdev = 0;
        bits_ping_latency_mdev |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_ping_latency_mdev |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_ping_latency_mdev |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_ping_latency_mdev |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.ping_latency_mdev = Float.intBitsToFloat(bits_ping_latency_mdev);
        offset += 4;
        this.network_info_available = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.network_type   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int bits_wireless_bitrate = 0;
        bits_wireless_bitrate |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_wireless_bitrate |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_wireless_bitrate |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_wireless_bitrate |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.wireless_bitrate = Float.intBitsToFloat(bits_wireless_bitrate);
        offset += 4;
        this.wireless_link_quality   = (byte)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        offset += 1;
        int bits_wireless_signal_level = 0;
        bits_wireless_signal_level |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_wireless_signal_level |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_wireless_signal_level |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_wireless_signal_level |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.wireless_signal_level = Float.intBitsToFloat(bits_wireless_signal_level);
        offset += 4;
        int bits_wireless_noise_level = 0;
        bits_wireless_noise_level |= (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_wireless_noise_level |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_wireless_noise_level |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_wireless_noise_level |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        this.wireless_noise_level = Float.intBitsToFloat(bits_wireless_noise_level);
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 8;
        length += 4;
        length += 4;
        length += 4;
        length += 4;
        length += 1;
        length += 1;
        length += 4;
        length += 1;
        length += 4;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "gateway_msgs/ConnectionStatistics"; }
    public java.lang.String getMD5(){ return "5a094df81e613f8907d969d1ae54536f"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
