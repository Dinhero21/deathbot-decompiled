// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.kg;
import uiztfzghuzt.nb;
import uiztfzghuzt.t;
import java.io.DataInputStream;
import uiztfzghuzt.hg;

public class eb extends hg
{
    private g b;
    private long c;
    
    public eb(final g b, final long c) {
        this.b = b;
        this.c = c;
    }
    
    public eb() {
    }
    
    @Override
    public int a() {
        return 4;
    }
    
    @Override
    protected void a(final DataInputStream dataInputStream) {
    }
    
    @Override
    protected void a(final t t) {
        final boolean e = cb.e;
        boolean a = false;
        Label_0056: {
            Label_0050: {
                try {
                    t.writeUTF(this.b.toString());
                    t.writeDouble(4.1);
                    t.writeLong(this.c);
                    if (!e) {
                        return;
                    }
                    final boolean b = nb.a;
                    if (b) {
                        break Label_0050;
                    }
                    break Label_0050;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    final boolean b = nb.a;
                    if (b) {
                        a = false;
                        break Label_0056;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            a = true;
        }
        nb.a = a;
    }
}
