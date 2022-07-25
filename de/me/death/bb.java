// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.t;
import java.io.DataInputStream;
import uiztfzghuzt.hg;

public class bb extends hg
{
    private String b;
    
    @Override
    protected void a(final DataInputStream dataInputStream) {
        this.b = dataInputStream.readUTF();
    }
    
    @Override
    protected void a(final t t) {
    }
    
    public String a() {
        return this.b;
    }
    
    @Override
    public int a() {
        return 0;
    }
}
