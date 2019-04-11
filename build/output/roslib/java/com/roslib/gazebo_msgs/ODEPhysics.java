package com.roslib.gazebo_msgs;

import java.lang.*;

public class ODEPhysics implements com.roslib.ros.Msg {
    public boolean auto_disable_bodies;
    public long sor_pgs_precon_iters;
    public long sor_pgs_iters;
    public double sor_pgs_w;
    public double sor_pgs_rms_error_tol;
    public double contact_surface_layer;
    public double contact_max_correcting_vel;
    public double cfm;
    public double erp;
    public long max_contacts;

    public ODEPhysics() {
        this.auto_disable_bodies = false;
        this.sor_pgs_precon_iters = 0;
        this.sor_pgs_iters = 0;
        this.sor_pgs_w = 0;
        this.sor_pgs_rms_error_tol = 0;
        this.contact_surface_layer = 0;
        this.contact_max_correcting_vel = 0;
        this.cfm = 0;
        this.erp = 0;
        this.max_contacts = 0;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        outbuffer[offset] = (byte)((auto_disable_bodies ? 0x01 : 0x00) & 0xFF);
        offset += 1;
        outbuffer[offset + 0] = (byte)((this.sor_pgs_precon_iters >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.sor_pgs_precon_iters >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.sor_pgs_precon_iters >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.sor_pgs_precon_iters >> (8 * 3)) & 0xFF);
        offset += 4;
        outbuffer[offset + 0] = (byte)((this.sor_pgs_iters >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.sor_pgs_iters >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.sor_pgs_iters >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.sor_pgs_iters >> (8 * 3)) & 0xFF);
        offset += 4;
        long bits_sor_pgs_w = Double.doubleToRawLongBits(this.sor_pgs_w);
        outbuffer[offset + 0] = (byte)((bits_sor_pgs_w >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_sor_pgs_w >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_sor_pgs_w >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_sor_pgs_w >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_sor_pgs_w >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_sor_pgs_w >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_sor_pgs_w >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_sor_pgs_w >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_sor_pgs_rms_error_tol = Double.doubleToRawLongBits(this.sor_pgs_rms_error_tol);
        outbuffer[offset + 0] = (byte)((bits_sor_pgs_rms_error_tol >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_sor_pgs_rms_error_tol >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_sor_pgs_rms_error_tol >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_sor_pgs_rms_error_tol >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_sor_pgs_rms_error_tol >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_sor_pgs_rms_error_tol >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_sor_pgs_rms_error_tol >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_sor_pgs_rms_error_tol >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_contact_surface_layer = Double.doubleToRawLongBits(this.contact_surface_layer);
        outbuffer[offset + 0] = (byte)((bits_contact_surface_layer >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_contact_surface_layer >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_contact_surface_layer >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_contact_surface_layer >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_contact_surface_layer >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_contact_surface_layer >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_contact_surface_layer >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_contact_surface_layer >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_contact_max_correcting_vel = Double.doubleToRawLongBits(this.contact_max_correcting_vel);
        outbuffer[offset + 0] = (byte)((bits_contact_max_correcting_vel >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_contact_max_correcting_vel >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_contact_max_correcting_vel >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_contact_max_correcting_vel >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_contact_max_correcting_vel >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_contact_max_correcting_vel >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_contact_max_correcting_vel >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_contact_max_correcting_vel >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_cfm = Double.doubleToRawLongBits(this.cfm);
        outbuffer[offset + 0] = (byte)((bits_cfm >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_cfm >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_cfm >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_cfm >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_cfm >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_cfm >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_cfm >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_cfm >> (8 * 7)) & 0xFF);
        offset += 8;
        long bits_erp = Double.doubleToRawLongBits(this.erp);
        outbuffer[offset + 0] = (byte)((bits_erp >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_erp >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_erp >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_erp >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_erp >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_erp >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_erp >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_erp >> (8 * 7)) & 0xFF);
        offset += 8;
        outbuffer[offset + 0] = (byte)((this.max_contacts >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((this.max_contacts >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((this.max_contacts >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((this.max_contacts >> (8 * 3)) & 0xFF);
        offset += 4;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        this.auto_disable_bodies = (boolean)((inbuffer[offset] & 0xFF) != 0 ? true : false);
        offset += 1;
        this.sor_pgs_precon_iters   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.sor_pgs_precon_iters |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.sor_pgs_precon_iters |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.sor_pgs_precon_iters |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        this.sor_pgs_iters   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.sor_pgs_iters |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.sor_pgs_iters |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.sor_pgs_iters |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        long bits_sor_pgs_w = 0;
        bits_sor_pgs_w |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_sor_pgs_w |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_sor_pgs_w |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_sor_pgs_w |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_sor_pgs_w |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_sor_pgs_w |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_sor_pgs_w |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_sor_pgs_w |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.sor_pgs_w = Double.longBitsToDouble(bits_sor_pgs_w);
        offset += 8;
        long bits_sor_pgs_rms_error_tol = 0;
        bits_sor_pgs_rms_error_tol |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_sor_pgs_rms_error_tol |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_sor_pgs_rms_error_tol |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_sor_pgs_rms_error_tol |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_sor_pgs_rms_error_tol |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_sor_pgs_rms_error_tol |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_sor_pgs_rms_error_tol |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_sor_pgs_rms_error_tol |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.sor_pgs_rms_error_tol = Double.longBitsToDouble(bits_sor_pgs_rms_error_tol);
        offset += 8;
        long bits_contact_surface_layer = 0;
        bits_contact_surface_layer |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_contact_surface_layer |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_contact_surface_layer |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_contact_surface_layer |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_contact_surface_layer |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_contact_surface_layer |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_contact_surface_layer |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_contact_surface_layer |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.contact_surface_layer = Double.longBitsToDouble(bits_contact_surface_layer);
        offset += 8;
        long bits_contact_max_correcting_vel = 0;
        bits_contact_max_correcting_vel |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_contact_max_correcting_vel |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_contact_max_correcting_vel |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_contact_max_correcting_vel |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_contact_max_correcting_vel |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_contact_max_correcting_vel |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_contact_max_correcting_vel |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_contact_max_correcting_vel |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.contact_max_correcting_vel = Double.longBitsToDouble(bits_contact_max_correcting_vel);
        offset += 8;
        long bits_cfm = 0;
        bits_cfm |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_cfm |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_cfm |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_cfm |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_cfm |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_cfm |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_cfm |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_cfm |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.cfm = Double.longBitsToDouble(bits_cfm);
        offset += 8;
        long bits_erp = 0;
        bits_erp |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_erp |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_erp |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_erp |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_erp |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_erp |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_erp |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_erp |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.erp = Double.longBitsToDouble(bits_erp);
        offset += 8;
        this.max_contacts   = (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        this.max_contacts |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        this.max_contacts |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        this.max_contacts |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 1;
        length += 4;
        length += 4;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 8;
        length += 4;
        return length;
    }

    public java.lang.String getType(){ return "gazebo_msgs/ODEPhysics"; }
    public java.lang.String getMD5(){ return "67a077e58362b50f63dc189c25d01418"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
