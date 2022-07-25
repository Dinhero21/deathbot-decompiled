// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class oc extends nb<String>
{
    @Override
    public String a(final bg bg) {
        final p g = bg.g();
        Label_0033: {
            Label_0022: {
                p p;
                p p3;
                try {
                    final p p2;
                    p = (p2 = g);
                    final p p4;
                    p3 = (p4 = uiztfzghuzt.p.NULL);
                    if (rf.ab) {
                        break Label_0033;
                    }
                    if (p == p3) {
                        break Label_0022;
                    }
                    break Label_0022;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (p == p3) {
                        bg.n();
                        return null;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            p p2 = g;
            p p4 = p.BOOLEAN;
            try {
                if (p2 == p4) {
                    return Boolean.toString(bg.m());
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
        }
        return bg.l();
    }
    
    @Override
    public void a(final dg dg, final String s) {
        dg.b(s);
    }
}
