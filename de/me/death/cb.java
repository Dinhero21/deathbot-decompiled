// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.t;
import uiztfzghuzt.kg;
import java.io.DataInputStream;
import uiztfzghuzt.hg;

public class cb extends hg
{
    private double b;
    private boolean c;
    private String d;
    public static boolean e;
    
    public cb() {
        this.c = true;
    }
    
    public cb(final double b) {
        this.c = true;
        this.b = b;
    }
    
    @Override
    protected void a(final DataInputStream dataInputStream) {
        Label_0017: {
            try {
                if (cb.e) {
                    break Label_0017;
                }
                final DataInputStream dataInputStream2 = dataInputStream;
                final boolean b = dataInputStream2.readBoolean();
                if (!b) {
                    break Label_0017;
                }
                return;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final DataInputStream dataInputStream2 = dataInputStream;
                final boolean b = dataInputStream2.readBoolean();
                if (b) {
                    return;
                }
                this.c = false;
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        this.d = dataInputStream.readUTF();
    }
    
    public boolean a() {
        return this.c;
    }
    
    public String b() {
        return this.d;
    }
    
    @Override
    protected void a(final t t) {
        t.writeDouble(this.b);
    }
    
    @Override
    public int a() {
        return 1;
    }
}
