// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.nb;
import uiztfzghuzt.t;
import uiztfzghuzt.kg;
import java.io.DataInputStream;
import java.net.InetAddress;
import uiztfzghuzt.hg;

public class db extends hg
{
    private boolean b;
    private InetAddress c;
    private short d;
    
    public db() {
    }
    
    public db(final InetAddress c, final short d) {
        this.c = c;
        this.d = d;
    }
    
    @Override
    protected void a(final DataInputStream dataInputStream) {
        final int unsignedByte = dataInputStream.readUnsignedByte();
        try {
            if (unsignedByte >= 128) {
                this.b = true;
            }
        }
        catch (kg kg) {
            throw kg;
        }
    }
    
    @Override
    protected void a(final t t) {
        final boolean e = cb.e;
        boolean e2 = false;
        Label_0047: {
            Label_0041: {
                try {
                    t.write(this.c.getAddress());
                    t.writeShort(this.d);
                    if (!nb.a) {
                        return;
                    }
                    final boolean b = e;
                    if (b) {
                        break Label_0041;
                    }
                    break Label_0041;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    final boolean b = e;
                    if (b) {
                        e2 = false;
                        break Label_0047;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            e2 = true;
        }
        cb.e = e2;
    }
    
    public boolean a() {
        return this.b;
    }
    
    @Override
    public int a() {
        return 2;
    }
}
