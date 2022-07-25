// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.fg;
import uiztfzghuzt.lg;

public class hb extends lg
{
    private ab e;
    
    public hb(final String s, final int n, final ab e) {
        super(s, n, e);
        this.e = e;
    }
    
    public hb(final String s, final int n, final ab e, final int n2) {
        super(s, n, e, n2);
        this.e = e;
    }
    
    @Override
    public void a(final fg fg, final int n) {
        try {
            super.a(fg, n);
            this.e.a(0);
        }
        catch (Exception ex) {
            this.e.a();
            throw ex;
        }
    }
}
