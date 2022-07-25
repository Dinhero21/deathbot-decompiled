// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Currency;

final class yc extends nb<Currency>
{
    @Override
    public Currency a(final bg bg) {
        return Currency.getInstance(bg.l());
    }
    
    @Override
    public void a(final dg dg, final Currency currency) {
        dg.b(currency.getCurrencyCode());
    }
}
