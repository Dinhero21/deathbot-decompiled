// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class gd extends nb<Number>
{
    @Override
    public Number a(final bg bg) {
        Label_0027: {
            Label_0020: {
                try {
                    final bg bg2 = bg;
                    if (rf.ab) {
                        break Label_0027;
                    }
                    final p p = bg.g();
                    final p p2 = uiztfzghuzt.p.NULL;
                    if (p == p2) {
                        break Label_0020;
                    }
                    break Label_0027;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                try {
                    final p p = bg.g();
                    final p p2 = uiztfzghuzt.p.NULL;
                    if (p == p2) {
                        bg.n();
                        return null;
                    }
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
            }
            try {
                final bg bg2 = bg;
                return (byte)bg2.s();
            }
            catch (NumberFormatException ex3) {
                throw new kg(ex3);
            }
        }
    }
    
    @Override
    public void a(final dg dg, final Number n) {
        dg.a(n);
    }
}
