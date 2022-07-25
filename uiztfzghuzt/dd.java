// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class dd extends nb<Boolean>
{
    @Override
    public Boolean a(final bg bg) {
        final boolean ab = rf.ab;
        Label_0044: {
            p p2 = null;
            p p4 = null;
            Label_0029: {
                Label_0022: {
                    p p;
                    p p3;
                    try {
                        p = (p2 = bg.g());
                        p3 = (p4 = uiztfzghuzt.p.NULL);
                        if (ab) {
                            break Label_0044;
                        }
                        if (p == p3) {
                            break Label_0022;
                        }
                        break Label_0029;
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
                try {
                    final bg bg2 = bg;
                    if (ab) {
                        return bg2.m();
                    }
                    p2 = bg.g();
                    p4 = p.STRING;
                }
                catch (kg kg3) {
                    throw kg3;
                }
            }
            try {
                if (p2 == p4) {
                    return Boolean.parseBoolean(bg.l());
                }
            }
            catch (kg kg4) {
                throw kg4;
            }
        }
        final bg bg2 = bg;
        return bg2.m();
    }
    
    @Override
    public void a(final dg dg, final Boolean b) {
        dg.a(b);
    }
}
