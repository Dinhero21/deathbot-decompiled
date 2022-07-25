// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

class pb extends nb<Number>
{
    final ab b;
    
    pb(final ab b) {
        this.b = b;
    }
    
    @Override
    public Double a(final bg bg) {
        Label_0020: {
            try {
                final bg bg2 = bg;
                if (fb.a != 0) {
                    return bg2.o();
                }
                final p p = bg.g();
                final p p2 = uiztfzghuzt.p.NULL;
                if (p == p2) {
                    break Label_0020;
                }
                break Label_0020;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final p p = bg.g();
                final p p2 = uiztfzghuzt.p.NULL;
                if (p == p2) {
                    bg.n();
                    return null;
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        final bg bg2 = bg;
        return bg2.o();
    }
    
    @Override
    public void a(final dg dg, final Number n) {
        Number n2 = null;
        Label_0022: {
            Label_0014: {
                try {
                    n2 = n;
                    if (fb.a != 0) {
                        break Label_0022;
                    }
                    if (n == null) {
                        break Label_0014;
                    }
                    break Label_0014;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (n == null) {
                        dg.i();
                        return;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            n2 = n;
        }
        ab.a(n2.doubleValue());
        dg.a(n);
    }
}
