// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Date;

public final class zb extends nb<Date>
{
    public static final md b;
    private final DateFormat c;
    private final DateFormat d;
    
    public zb() {
        this.c = DateFormat.getDateTimeInstance(2, 2, Locale.US);
        this.d = DateFormat.getDateTimeInstance(2, 2);
    }
    
    @Override
    public Date a(final bg bg) {
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
                return this.a(bg.l());
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final p p = bg.g();
                final p p2 = uiztfzghuzt.p.NULL;
                if (p != p2) {
                    return this.a(bg.l());
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
    
    private synchronized Date a(final String s) {
        try {
            return this.d.parse(s);
        }
        catch (ParseException ex2) {
            try {
                return this.c.parse(s);
            }
            catch (ParseException ex3) {
                try {
                    return zf.a(s, new ParsePosition(0));
                }
                catch (ParseException ex) {
                    throw new kg(s, ex);
                }
            }
        }
    }
    
    @Override
    public synchronized void a(final dg dg, final Date date) {
        Label_0024: {
            Label_0014: {
                try {
                    if (rf.ab) {
                        return;
                    }
                    final Date date2 = date;
                    if (date2 == null) {
                        break Label_0014;
                    }
                    break Label_0024;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    final Date date2 = date;
                    if (date2 != null) {
                        break Label_0024;
                    }
                    dg.i();
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            return;
        }
        dg.b(this.c.format(date));
    }
    
    static {
        b = new ef();
    }
}
