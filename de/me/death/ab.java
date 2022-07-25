// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.kg;
import uiztfzghuzt.q;
import uiztfzghuzt.fg;

public class ab extends fg
{
    private int h;
    
    public ab(final q q, final String s, final int n, final String s2, final String s3) {
        super(q, s, n, s2, s3);
    }
    
    public ab(final q q, final String s, final int n) {
        super(q, s, n);
    }
    
    public void a(final int h) {
        this.h = h;
    }
    
    public boolean b(final int n) {
        int n2;
        try {
            final int h;
            n2 = (h = this.h);
            if (k.a) {
                return h != 0;
            }
            final int n3 = n;
            if (n2 >= n3) {
                return true;
            }
            return false;
        }
        catch (kg kg) {
            throw kg;
        }
        try {
            final int n3 = n;
            if (n2 >= n3) {
                return true;
            }
        }
        catch (kg kg2) {
            throw kg2;
        }
        int h = 0;
        return h != 0;
    }
    
    public void a() {
        ++this.h;
    }
}
