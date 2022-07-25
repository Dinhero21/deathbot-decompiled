// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.math.BigDecimal;

final class pc extends nb<BigDecimal>
{
    @Override
    public BigDecimal a(final bg bg) {
        Label_0030: {
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
                    break Label_0030;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                try {
                    final p p = bg.g();
                    final p p2 = uiztfzghuzt.p.NULL;
                    if (p != p2) {
                        break Label_0030;
                    }
                    bg2 = bg;
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
            }
            bg2.n();
            return null;
            try {
                return new BigDecimal(bg.l());
            }
            catch (NumberFormatException ex3) {
                throw new kg(ex3);
            }
        }
    }
    
    @Override
    public void a(final dg dg, final BigDecimal bigDecimal) {
        dg.a(bigDecimal);
    }
}
