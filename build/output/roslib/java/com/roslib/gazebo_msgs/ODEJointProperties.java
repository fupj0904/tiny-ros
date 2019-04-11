package com.roslib.gazebo_msgs;

import java.lang.*;

public class ODEJointProperties implements com.roslib.ros.Msg {
    public double[] damping;
    public double[] hiStop;
    public double[] loStop;
    public double[] erp;
    public double[] cfm;
    public double[] stop_erp;
    public double[] stop_cfm;
    public double[] fudge_factor;
    public double[] fmax;
    public double[] vel;

    public ODEJointProperties() {
        this.damping = null;
        this.hiStop = null;
        this.loStop = null;
        this.erp = null;
        this.cfm = null;
        this.stop_erp = null;
        this.stop_cfm = null;
        this.fudge_factor = null;
        this.fmax = null;
        this.vel = null;
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        int length_damping = this.damping != null ? this.damping.length : 0;
        outbuffer[offset + 0] = (byte)((length_damping >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_damping >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_damping >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_damping >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_damping; i++){
        long bits_dampingi = Double.doubleToRawLongBits(this.damping[i]);
        outbuffer[offset + 0] = (byte)((bits_dampingi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_dampingi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_dampingi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_dampingi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_dampingi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_dampingi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_dampingi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_dampingi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_hiStop = this.hiStop != null ? this.hiStop.length : 0;
        outbuffer[offset + 0] = (byte)((length_hiStop >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_hiStop >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_hiStop >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_hiStop >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_hiStop; i++){
        long bits_hiStopi = Double.doubleToRawLongBits(this.hiStop[i]);
        outbuffer[offset + 0] = (byte)((bits_hiStopi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_hiStopi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_hiStopi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_hiStopi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_hiStopi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_hiStopi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_hiStopi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_hiStopi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_loStop = this.loStop != null ? this.loStop.length : 0;
        outbuffer[offset + 0] = (byte)((length_loStop >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_loStop >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_loStop >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_loStop >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_loStop; i++){
        long bits_loStopi = Double.doubleToRawLongBits(this.loStop[i]);
        outbuffer[offset + 0] = (byte)((bits_loStopi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_loStopi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_loStopi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_loStopi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_loStopi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_loStopi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_loStopi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_loStopi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_erp = this.erp != null ? this.erp.length : 0;
        outbuffer[offset + 0] = (byte)((length_erp >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_erp >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_erp >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_erp >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_erp; i++){
        long bits_erpi = Double.doubleToRawLongBits(this.erp[i]);
        outbuffer[offset + 0] = (byte)((bits_erpi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_erpi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_erpi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_erpi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_erpi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_erpi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_erpi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_erpi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_cfm = this.cfm != null ? this.cfm.length : 0;
        outbuffer[offset + 0] = (byte)((length_cfm >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_cfm >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_cfm >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_cfm >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_cfm; i++){
        long bits_cfmi = Double.doubleToRawLongBits(this.cfm[i]);
        outbuffer[offset + 0] = (byte)((bits_cfmi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_cfmi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_cfmi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_cfmi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_cfmi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_cfmi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_cfmi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_cfmi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_stop_erp = this.stop_erp != null ? this.stop_erp.length : 0;
        outbuffer[offset + 0] = (byte)((length_stop_erp >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_stop_erp >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_stop_erp >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_stop_erp >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_stop_erp; i++){
        long bits_stop_erpi = Double.doubleToRawLongBits(this.stop_erp[i]);
        outbuffer[offset + 0] = (byte)((bits_stop_erpi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_stop_erpi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_stop_erpi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_stop_erpi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_stop_erpi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_stop_erpi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_stop_erpi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_stop_erpi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_stop_cfm = this.stop_cfm != null ? this.stop_cfm.length : 0;
        outbuffer[offset + 0] = (byte)((length_stop_cfm >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_stop_cfm >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_stop_cfm >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_stop_cfm >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_stop_cfm; i++){
        long bits_stop_cfmi = Double.doubleToRawLongBits(this.stop_cfm[i]);
        outbuffer[offset + 0] = (byte)((bits_stop_cfmi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_stop_cfmi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_stop_cfmi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_stop_cfmi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_stop_cfmi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_stop_cfmi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_stop_cfmi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_stop_cfmi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_fudge_factor = this.fudge_factor != null ? this.fudge_factor.length : 0;
        outbuffer[offset + 0] = (byte)((length_fudge_factor >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_fudge_factor >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_fudge_factor >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_fudge_factor >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_fudge_factor; i++){
        long bits_fudge_factori = Double.doubleToRawLongBits(this.fudge_factor[i]);
        outbuffer[offset + 0] = (byte)((bits_fudge_factori >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_fudge_factori >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_fudge_factori >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_fudge_factori >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_fudge_factori >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_fudge_factori >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_fudge_factori >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_fudge_factori >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_fmax = this.fmax != null ? this.fmax.length : 0;
        outbuffer[offset + 0] = (byte)((length_fmax >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_fmax >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_fmax >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_fmax >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_fmax; i++){
        long bits_fmaxi = Double.doubleToRawLongBits(this.fmax[i]);
        outbuffer[offset + 0] = (byte)((bits_fmaxi >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_fmaxi >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_fmaxi >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_fmaxi >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_fmaxi >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_fmaxi >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_fmaxi >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_fmaxi >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        int length_vel = this.vel != null ? this.vel.length : 0;
        outbuffer[offset + 0] = (byte)((length_vel >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_vel >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_vel >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_vel >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_vel; i++){
        long bits_veli = Double.doubleToRawLongBits(this.vel[i]);
        outbuffer[offset + 0] = (byte)((bits_veli >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((bits_veli >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((bits_veli >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((bits_veli >> (8 * 3)) & 0xFF);
        outbuffer[offset + 4] = (byte)((bits_veli >> (8 * 4)) & 0xFF);
        outbuffer[offset + 5] = (byte)((bits_veli >> (8 * 5)) & 0xFF);
        outbuffer[offset + 6] = (byte)((bits_veli >> (8 * 6)) & 0xFF);
        outbuffer[offset + 7] = (byte)((bits_veli >> (8 * 7)) & 0xFF);
        offset += 8;
        }
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        int length_damping = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_damping |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_damping |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_damping |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_damping > 0) {
            this.damping = new double[length_damping];
        }
        for (int i = 0; i < length_damping; i++){
        long bits_dampingi = 0;
        bits_dampingi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_dampingi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_dampingi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_dampingi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_dampingi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_dampingi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_dampingi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_dampingi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.damping[i] = Double.longBitsToDouble(bits_dampingi);
        offset += 8;
        }
        int length_hiStop = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_hiStop |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_hiStop |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_hiStop |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_hiStop > 0) {
            this.hiStop = new double[length_hiStop];
        }
        for (int i = 0; i < length_hiStop; i++){
        long bits_hiStopi = 0;
        bits_hiStopi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_hiStopi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_hiStopi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_hiStopi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_hiStopi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_hiStopi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_hiStopi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_hiStopi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.hiStop[i] = Double.longBitsToDouble(bits_hiStopi);
        offset += 8;
        }
        int length_loStop = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_loStop |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_loStop |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_loStop |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_loStop > 0) {
            this.loStop = new double[length_loStop];
        }
        for (int i = 0; i < length_loStop; i++){
        long bits_loStopi = 0;
        bits_loStopi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_loStopi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_loStopi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_loStopi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_loStopi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_loStopi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_loStopi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_loStopi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.loStop[i] = Double.longBitsToDouble(bits_loStopi);
        offset += 8;
        }
        int length_erp = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_erp |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_erp |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_erp |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_erp > 0) {
            this.erp = new double[length_erp];
        }
        for (int i = 0; i < length_erp; i++){
        long bits_erpi = 0;
        bits_erpi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_erpi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_erpi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_erpi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_erpi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_erpi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_erpi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_erpi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.erp[i] = Double.longBitsToDouble(bits_erpi);
        offset += 8;
        }
        int length_cfm = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_cfm |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_cfm |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_cfm |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_cfm > 0) {
            this.cfm = new double[length_cfm];
        }
        for (int i = 0; i < length_cfm; i++){
        long bits_cfmi = 0;
        bits_cfmi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_cfmi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_cfmi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_cfmi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_cfmi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_cfmi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_cfmi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_cfmi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.cfm[i] = Double.longBitsToDouble(bits_cfmi);
        offset += 8;
        }
        int length_stop_erp = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_stop_erp |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_stop_erp |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_stop_erp |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_stop_erp > 0) {
            this.stop_erp = new double[length_stop_erp];
        }
        for (int i = 0; i < length_stop_erp; i++){
        long bits_stop_erpi = 0;
        bits_stop_erpi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_stop_erpi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_stop_erpi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_stop_erpi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_stop_erpi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_stop_erpi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_stop_erpi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_stop_erpi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.stop_erp[i] = Double.longBitsToDouble(bits_stop_erpi);
        offset += 8;
        }
        int length_stop_cfm = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_stop_cfm |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_stop_cfm |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_stop_cfm |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_stop_cfm > 0) {
            this.stop_cfm = new double[length_stop_cfm];
        }
        for (int i = 0; i < length_stop_cfm; i++){
        long bits_stop_cfmi = 0;
        bits_stop_cfmi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_stop_cfmi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_stop_cfmi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_stop_cfmi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_stop_cfmi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_stop_cfmi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_stop_cfmi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_stop_cfmi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.stop_cfm[i] = Double.longBitsToDouble(bits_stop_cfmi);
        offset += 8;
        }
        int length_fudge_factor = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_fudge_factor |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_fudge_factor |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_fudge_factor |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_fudge_factor > 0) {
            this.fudge_factor = new double[length_fudge_factor];
        }
        for (int i = 0; i < length_fudge_factor; i++){
        long bits_fudge_factori = 0;
        bits_fudge_factori |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_fudge_factori |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_fudge_factori |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_fudge_factori |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_fudge_factori |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_fudge_factori |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_fudge_factori |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_fudge_factori |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.fudge_factor[i] = Double.longBitsToDouble(bits_fudge_factori);
        offset += 8;
        }
        int length_fmax = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_fmax |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_fmax |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_fmax |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_fmax > 0) {
            this.fmax = new double[length_fmax];
        }
        for (int i = 0; i < length_fmax; i++){
        long bits_fmaxi = 0;
        bits_fmaxi |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_fmaxi |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_fmaxi |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_fmaxi |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_fmaxi |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_fmaxi |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_fmaxi |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_fmaxi |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.fmax[i] = Double.longBitsToDouble(bits_fmaxi);
        offset += 8;
        }
        int length_vel = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_vel |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_vel |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_vel |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_vel > 0) {
            this.vel = new double[length_vel];
        }
        for (int i = 0; i < length_vel; i++){
        long bits_veli = 0;
        bits_veli |= (long)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        bits_veli |= (long)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        bits_veli |= (long)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        bits_veli |= (long)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        bits_veli |= (long)((inbuffer[offset + 4] & 0xFF) << (8 * 4));
        bits_veli |= (long)((inbuffer[offset + 5] & 0xFF) << (8 * 5));
        bits_veli |= (long)((inbuffer[offset + 6] & 0xFF) << (8 * 6));
        bits_veli |= (long)((inbuffer[offset + 7] & 0xFF) << (8 * 7));
        this.vel[i] = Double.longBitsToDouble(bits_veli);
        offset += 8;
        }
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += 4;
        int length_damping = this.damping != null ? this.damping.length : 0;
        for (int i = 0; i < length_damping; i++) {
        length += 8;
        }
        length += 4;
        int length_hiStop = this.hiStop != null ? this.hiStop.length : 0;
        for (int i = 0; i < length_hiStop; i++) {
        length += 8;
        }
        length += 4;
        int length_loStop = this.loStop != null ? this.loStop.length : 0;
        for (int i = 0; i < length_loStop; i++) {
        length += 8;
        }
        length += 4;
        int length_erp = this.erp != null ? this.erp.length : 0;
        for (int i = 0; i < length_erp; i++) {
        length += 8;
        }
        length += 4;
        int length_cfm = this.cfm != null ? this.cfm.length : 0;
        for (int i = 0; i < length_cfm; i++) {
        length += 8;
        }
        length += 4;
        int length_stop_erp = this.stop_erp != null ? this.stop_erp.length : 0;
        for (int i = 0; i < length_stop_erp; i++) {
        length += 8;
        }
        length += 4;
        int length_stop_cfm = this.stop_cfm != null ? this.stop_cfm.length : 0;
        for (int i = 0; i < length_stop_cfm; i++) {
        length += 8;
        }
        length += 4;
        int length_fudge_factor = this.fudge_factor != null ? this.fudge_factor.length : 0;
        for (int i = 0; i < length_fudge_factor; i++) {
        length += 8;
        }
        length += 4;
        int length_fmax = this.fmax != null ? this.fmax.length : 0;
        for (int i = 0; i < length_fmax; i++) {
        length += 8;
        }
        length += 4;
        int length_vel = this.vel != null ? this.vel.length : 0;
        for (int i = 0; i < length_vel; i++) {
        length += 8;
        }
        return length;
    }

    public java.lang.String getType(){ return "gazebo_msgs/ODEJointProperties"; }
    public java.lang.String getMD5(){ return "a9e264dbf3eff8e202d2bebecf081639"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
