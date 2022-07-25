// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.GregorianCalendar;
import java.util.Calendar;

final class ad extends nb<Calendar>
{
    private static final String[] z;
    
    @Override
    public Calendar a(final bg bg) {
        final boolean ab = rf.ab;
        bg bg2 = null;
        Label_0032: {
            Label_0024: {
                try {
                    bg2 = bg;
                    if (ab) {
                        break Label_0032;
                    }
                    final p p = bg.g();
                    final p p2 = uiztfzghuzt.p.NULL;
                    if (p == p2) {
                        break Label_0024;
                    }
                    break Label_0024;
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
            bg2 = bg;
        }
        bg2.d();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        while (bg.g() != p.END_OBJECT) {
            final String k = bg.k();
            final int s = bg.s();
            Label_0263: {
                int n12 = 0;
                Label_0261: {
                    Label_0247: {
                        int equals = 0;
                        Label_0236: {
                            Label_0215: {
                                int n11 = 0;
                                Label_0204: {
                                    Label_0183: {
                                        int n10 = 0;
                                        Label_0172: {
                                            Label_0151: {
                                                int n9 = 0;
                                                Label_0140: {
                                                    Label_0120: {
                                                        int n7 = 0;
                                                        Label_0109: {
                                                            Label_0094: {
                                                                try {
                                                                    if (ab) {
                                                                        return new GregorianCalendar(n, n2, n3, n4, n5, n6);
                                                                    }
                                                                    final String s2 = "year";
                                                                    final String s3 = k;
                                                                    final int n8;
                                                                    n7 = (n8 = (n9 = (n10 = (n11 = (equals = (n12 = (s2.equals(s3) ? 1 : 0)))))));
                                                                    final boolean b = ab;
                                                                    if (!b) {
                                                                        break Label_0094;
                                                                    }
                                                                    break Label_0120;
                                                                }
                                                                catch (kg kg3) {
                                                                    throw kg3;
                                                                }
                                                                try {
                                                                    final String s2 = "year";
                                                                    final String s3 = k;
                                                                    final int n8;
                                                                    n7 = (n8 = (n9 = (n10 = (n11 = (equals = (n12 = (s2.equals(s3) ? 1 : 0)))))));
                                                                    final boolean b = ab;
                                                                    if (b) {
                                                                        break Label_0120;
                                                                    }
                                                                    if (n8 == 0) {
                                                                        break Label_0109;
                                                                    }
                                                                }
                                                                catch (kg kg4) {
                                                                    throw kg4;
                                                                }
                                                            }
                                                            n = s;
                                                            try {
                                                                if (!ab) {
                                                                    break Label_0263;
                                                                }
                                                                n9 = (n7 = (n10 = (n11 = (equals = (n12 = ("month".equals(k) ? 1 : 0))))));
                                                            }
                                                            catch (kg kg5) {
                                                                throw kg5;
                                                            }
                                                        }
                                                        try {
                                                            if (ab) {
                                                                break Label_0151;
                                                            }
                                                            if (n7 == 0) {
                                                                break Label_0140;
                                                            }
                                                        }
                                                        catch (kg kg6) {
                                                            throw kg6;
                                                        }
                                                    }
                                                    n2 = s;
                                                    try {
                                                        if (!ab) {
                                                            break Label_0263;
                                                        }
                                                        n10 = (n9 = (n11 = (equals = (n12 = ("dayOfMonth".equals(k) ? 1 : 0)))));
                                                    }
                                                    catch (kg kg7) {
                                                        throw kg7;
                                                    }
                                                }
                                                try {
                                                    if (ab) {
                                                        break Label_0183;
                                                    }
                                                    if (n9 == 0) {
                                                        break Label_0172;
                                                    }
                                                }
                                                catch (kg kg8) {
                                                    throw kg8;
                                                }
                                            }
                                            n3 = s;
                                            try {
                                                if (!ab) {
                                                    break Label_0263;
                                                }
                                                n11 = (n10 = (equals = (n12 = ("hourOfDay".equals(k) ? 1 : 0))));
                                            }
                                            catch (kg kg9) {
                                                throw kg9;
                                            }
                                        }
                                        try {
                                            if (ab) {
                                                break Label_0215;
                                            }
                                            if (n10 == 0) {
                                                break Label_0204;
                                            }
                                        }
                                        catch (kg kg10) {
                                            throw kg10;
                                        }
                                    }
                                    n4 = s;
                                    try {
                                        if (!ab) {
                                            break Label_0263;
                                        }
                                        equals = (n11 = (n12 = ("minute".equals(k) ? 1 : 0)));
                                    }
                                    catch (kg kg11) {
                                        throw kg11;
                                    }
                                }
                                try {
                                    if (ab) {
                                        break Label_0247;
                                    }
                                    if (n11 == 0) {
                                        break Label_0236;
                                    }
                                }
                                catch (kg kg12) {
                                    throw kg12;
                                }
                            }
                            n5 = s;
                            try {
                                if (!ab) {
                                    break Label_0263;
                                }
                                n12 = (equals = ("second".equals(k) ? 1 : 0));
                            }
                            catch (kg kg13) {
                                throw kg13;
                            }
                        }
                        try {
                            if (ab) {
                                break Label_0261;
                            }
                            if (equals == 0) {
                                break Label_0263;
                            }
                        }
                        catch (kg kg14) {
                            throw kg14;
                        }
                    }
                    n12 = s;
                }
                n6 = n12;
            }
            if (ab) {
                break;
            }
        }
        bg.e();
        return new GregorianCalendar(n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void a(final dg dg, final Calendar calendar) {
        Label_0014: {
            try {
                if (rf.ab) {
                    return;
                }
                final Calendar calendar2 = calendar;
                if (calendar2 == null) {
                    break Label_0014;
                }
                break Label_0014;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final Calendar calendar2 = calendar;
                if (calendar2 == null) {
                    dg.i();
                    return;
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        dg.e();
        dg.a("year");
        dg.a((long)calendar.get(1));
        dg.a("month");
        dg.a((long)calendar.get(2));
        dg.a("dayOfMonth");
        dg.a((long)calendar.get(5));
        dg.a("hourOfDay");
        dg.a((long)calendar.get(11));
        dg.a("minute");
        dg.a((long)calendar.get(12));
        dg.a("second");
        dg.a((long)calendar.get(13));
        dg.f();
    }
    
    static {
        final String[] array = new String[6];
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = 0))));
        String s = "y[[A]q";
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
                                c2 = '\u0014';
                                break;
                            }
                            case 1: {
                                c2 = '2';
                                break;
                            }
                            case 2: {
                                c2 = '5';
                                break;
                            }
                            case 3: {
                                c2 = '4';
                                break;
                            }
                            default: {
                                c2 = ')';
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
                    s = "|]@FfrvTM";
                    n7 = 0;
                    continue Label_0123_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 2)))));
                    s = "pSL{OY][@A";
                    n7 = 1;
                    continue Label_0123_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 3)))));
                    s = "y][@A";
                    n7 = 2;
                    continue Label_0123_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 4)))));
                    s = "mWTF";
                    n7 = 3;
                    continue Label_0123_Outer;
                }
                case 3: {
                    array[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 5)))));
                    s = "gWV[Gp";
                    n7 = 4;
                    continue Label_0123_Outer;
                }
                case 4: {
                    break Label_0123_Outer;
                }
            }
        }
        array[n6] = intern;
        z = new String[] { "minute", "hourOfDay", "dayOfMonth", "month", "year", "second" };
    }
}
