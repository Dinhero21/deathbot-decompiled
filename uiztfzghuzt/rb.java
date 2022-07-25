// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class rb extends nb<Number>
{
    @Override
    public Number a(final bg bg) {
        Label_0020: {
            try {
                final bg bg2 = bg;
                if (fb.a != 0) {
                    return bg2.p();
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
        return bg2.p();
    }
    
    @Override
    public void a(final dg dg, final Number n) {
        Label_0014: {
            try {
                if (fb.a != 0) {
                    return;
                }
                final Number n2 = n;
                if (n2 == null) {
                    break Label_0014;
                }
                break Label_0014;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final Number n2 = n;
                if (n2 == null) {
                    dg.i();
                    return;
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        dg.b(n.toString());
    }
}
