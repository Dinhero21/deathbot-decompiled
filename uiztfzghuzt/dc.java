// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.sql.Date;

public final class dc extends nb<Date>
{
    public static final md b;
    private final DateFormat c;
    private static final String z = "MMM d, yyyy";
    
    public dc() {
        this.c = new SimpleDateFormat("MMM d, yyyy");
    }
    
    @Override
    public synchronized Date a(final bg bg) {
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
                catch (ParseException ex) {
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
                catch (ParseException ex2) {
                    throw ex2;
                }
            }
            bg2.n();
            return null;
            try {
                return new Date(this.c.parse(bg.l()).getTime());
            }
            catch (ParseException ex3) {
                throw new kg(ex3);
            }
        }
    }
    
    @Override
    public synchronized void a(final dg dg, final Date date) {
        String format = null;
        Label_0018: {
            try {
                if (date == null) {
                    format = null;
                    break Label_0018;
                }
            }
            catch (kg kg) {
                throw kg;
            }
            format = this.c.format(date);
        }
        dg.b(format);
    }
    
    static {
        final char[] charArray = "3zpPQR\u0017D\tL\u0007".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0106: {
                if (n > 1) {
                    break Label_0106;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '~';
                            break;
                        }
                        case 1: {
                            c2 = '7';
                            break;
                        }
                        case 2: {
                            c2 = '=';
                            break;
                        }
                        case 3: {
                            c2 = 'p';
                            break;
                        }
                        default: {
                            c2 = '5';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                new String(charArray).intern();
                b = new nf();
                return;
            }
            continue;
        }
    }
}
