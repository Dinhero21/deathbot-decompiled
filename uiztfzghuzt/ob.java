// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.text.ParseException;
import java.text.ParsePosition;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Date;

final class ob extends nb<Date>
{
    private final Class<? extends Date> b;
    private final DateFormat c;
    private final DateFormat d;
    private static final String[] z;
    
    ob(final Class<? extends Date> clazz, final String s) {
        this(clazz, new SimpleDateFormat(s, Locale.US), new SimpleDateFormat(s));
    }
    
    public ob(final Class<? extends Date> clazz, final int n, final int n2) {
        this(clazz, DateFormat.getDateTimeInstance(n, n2, Locale.US), DateFormat.getDateTimeInstance(n, n2));
    }
    
    ob(final Class<? extends Date> clazz, final DateFormat c, final DateFormat d) {
        Label_0084: {
            if (clazz != Date.class) {
                Label_0026: {
                    try {
                        if (clazz == java.sql.Date.class) {
                            break Label_0084;
                        }
                        final Class<java.sql.Date> clazz2 = (Class<java.sql.Date>)clazz;
                        final Class<Timestamp> clazz3 = Timestamp.class;
                        if (clazz2 != clazz3) {
                            break Label_0026;
                        }
                        break Label_0084;
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                    try {
                        final Class<java.sql.Date> clazz2 = (Class<java.sql.Date>)clazz;
                        final Class<Timestamp> clazz3 = Timestamp.class;
                        if (clazz2 != clazz3) {
                            throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + clazz);
                        }
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
            }
        }
        this.b = clazz;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void a(final dg dg, final Date date) {
        synchronized (this.d) {
            dg.b(this.c.format(date));
        }
    }
    
    @Override
    public Date a(final bg bg) {
        final int a = fb.a;
        try {
            if (bg.g() != p.STRING) {
                throw new ig("The date should be a string value");
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final Date a2 = this.a(bg.l());
        Label_0090: {
            Label_0071: {
                Class<? extends Date> b = null;
                Class<Date> clazz4 = null;
                Label_0060: {
                    Label_0054: {
                        Class<? extends Date> clazz;
                        Class<Date> clazz3;
                        try {
                            final Class<? extends Date> clazz2;
                            clazz = (b = (clazz2 = this.b));
                            final Serializable s;
                            clazz3 = (clazz4 = (Class<Date>)(s = Date.class));
                            if (a != 0) {
                                break Label_0060;
                            }
                            if (clazz == clazz3) {
                                return a2;
                            }
                            break Label_0054;
                        }
                        catch (IllegalArgumentException ex2) {
                            throw ex2;
                        }
                        try {
                            if (clazz == clazz3) {
                                return a2;
                            }
                        }
                        catch (IllegalArgumentException ex3) {
                            throw ex3;
                        }
                    }
                    Class<? extends Date> clazz2 = b = this.b;
                    Serializable s = clazz4 = (Class<Date>)Timestamp.class;
                    try {
                        if (a != 0) {
                            break Label_0090;
                        }
                        if (b == clazz4) {
                            break Label_0071;
                        }
                        break Label_0071;
                    }
                    catch (IllegalArgumentException ex4) {
                        throw ex4;
                    }
                }
                try {
                    if (b == clazz4) {
                        return new Timestamp(a2.getTime());
                    }
                }
                catch (IllegalArgumentException ex5) {
                    throw ex5;
                }
            }
            Class<? extends Date> clazz2 = this.b;
            Serializable s = java.sql.Date.class;
            try {
                if (clazz2 == s) {
                    return new java.sql.Date(a2.getTime());
                }
            }
            catch (IllegalArgumentException ex6) {
                throw ex6;
            }
        }
        throw new AssertionError();
    }
    
    private Date a(final String s) {
        synchronized (this.d) {
            try {
                return this.d.parse(s);
            }
            catch (ParseException ex2) {
                try {
                    return this.c.parse(s);
                }
                catch (ParseException ex3) {
                    try {
                        // monitorexit(this.d)
                        return zf.a(s, new ParsePosition(0));
                    }
                    catch (ParseException ex) {
                        throw new kg(s, ex);
                    }
                }
            }
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DefaultDateTypeAdapter");
        sb.append('(').append(this.d.getClass().getSimpleName()).append(')');
        return sb.toString();
    }
    
    static {
        final String[] array = new String[6];
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = 0))));
        String s = "=Z8\u001b>\u0015K\u001a\u001b?\u001ck'\n.8[?\n?\u001cM";
        int n7 = -1;
        String intern = null;
    Label_0123_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n9;
            final int n8 = n9 = (length = charArray.length);
            int n10 = 0;
            while (true) {
                Label_0198: {
                    if (n8 > 1) {
                        break Label_0198;
                    }
                    length = (n9 = n10);
                    do {
                        final char c = charArray[n9];
                        char c2 = '\0';
                        switch (n10 % 5) {
                            case 0: {
                                c2 = 'y';
                                break;
                            }
                            case 1: {
                                c2 = '?';
                                break;
                            }
                            case 2: {
                                c2 = '^';
                                break;
                            }
                            case 3: {
                                c2 = 'z';
                                break;
                            }
                            default: {
                                c2 = 'K';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n10;
                    } while (n8 == 0);
                }
                if (n8 > n10) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n7) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 1)))));
                    s = "-W;Z/\u0018K;Z8\u0011P+\u0016/Y];Z*YL*\b\"\u0017X~\f*\u0015J;";
                    n7 = 0;
                    continue Label_0123_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 2)))));
                    s = "Y]+\u000ek\u000e^-Z";
                    n7 = 1;
                    continue Label_0123_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 3)))));
                    s = "U\u001f";
                    n7 = 2;
                    continue Label_0123_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 4)))));
                    s = "U\u001f1\bk";
                    n7 = 3;
                    continue Label_0123_Outer;
                }
                case 3: {
                    array[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 5)))));
                    s = "=^*\u001fk\rF.\u001fk\u0014J-\u000ek\u001bZ~\u0015%\u001c\u001f1\u001ck";
                    n7 = 4;
                    continue Label_0123_Outer;
                }
                case 4: {
                    break Label_0123_Outer;
                }
            }
        }
        array[n6] = intern;
        z = new String[] { "DefaultDateTypeAdapter", "The date should be a string value", " but was ", ", ", ", or ", "Date type must be one of " };
    }
}
