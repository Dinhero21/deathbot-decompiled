// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import java.io.DataOutputStream;

class fb extends Thread
{
    final v a;
    private final String b;
    private final DataOutputStream c;
    
    fb(final v a, final String b, final DataOutputStream c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        this.a.a(this.b, this.c, false);
    }
}
