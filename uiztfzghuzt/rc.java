// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class rc extends nb<StringBuilder>
{
    @Override
    public StringBuilder a(final bg bg) {
        bg bg2 = null;
        Label_0020: {
            try {
                bg2 = bg;
                if (rf.ab) {
                    break Label_0020;
                }
                final p p = bg.g();
                final p p2 = uiztfzghuzt.p.NULL;
                if (p == p2) {
                    break Label_0020;
                }
                return new StringBuilder(bg.l());
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final p p = bg.g();
                final p p2 = uiztfzghuzt.p.NULL;
                if (p != p2) {
                    return new StringBuilder(bg.l());
                }
                bg2 = bg;
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        bg2.n();
        return null;
    }
    
    @Override
    public void a(final dg dg, final StringBuilder sb) {
        String string = null;
        Label_0024: {
            StringBuilder sb2 = null;
            Label_0021: {
                Label_0015: {
                    try {
                        sb2 = sb;
                        if (rf.ab) {
                            break Label_0021;
                        }
                        if (sb == null) {
                            break Label_0015;
                        }
                        break Label_0015;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        if (sb == null) {
                            string = null;
                            break Label_0024;
                        }
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                sb2 = sb;
            }
            string = sb2.toString();
        }
        dg.b(string);
    }
}
