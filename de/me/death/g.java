// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.ib;
import uiztfzghuzt.kg;
import uiztfzghuzt.nb;

public class g
{
    private int a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private String i;
    private String j;
    private String k;
    private int l;
    private int m;
    private int n;
    private int o;
    private d p;
    private b q;
    private c r;
    private boolean s;
    private int t;
    private int u;
    private String v;
    private String w;
    public static int x;
    private static final String[] z;
    
    public g() {
        this.a = 100;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = 2;
        this.m = 25565;
        this.n = 0;
        this.o = 0;
        this.p = de.me.death.d.P4;
        this.q = de.me.death.b.BOTH;
        this.r = de.me.death.c.RANDOM;
        this.s = false;
        this.t = 15;
        this.u = 1;
        this.v = "127.0.0.1";
    }
    
    public g(final int a, final boolean b, final boolean c, final boolean d, final boolean e, final boolean f, final boolean g, final String v, final String i, final String j, final String k, final int m, final int n, final int o, final d p23, final b q, final c r, final boolean s, final int t, final boolean h, final int l, final int u, final String w) {
        final int x = de.me.death.g.x;
        this.a = 100;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = 2;
        this.m = 25565;
        this.n = 0;
        this.o = 0;
        this.p = de.me.death.d.P4;
        this.q = de.me.death.b.BOTH;
        this.r = de.me.death.c.RANDOM;
        this.s = false;
        this.t = 15;
        this.u = 1;
        this.v = "127.0.0.1";
        this.w = w;
        this.c = c;
        this.u = u;
        this.l = l;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.v = v;
        this.i = i;
        this.j = j;
        this.k = k;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p23;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.h = h;
        if (x != 0) {
            boolean a2 = false;
            Label_0285: {
                try {
                    if (nb.a) {
                        a2 = false;
                        break Label_0285;
                    }
                }
                catch (kg kg) {
                    throw kg;
                }
                a2 = true;
            }
            nb.a = a2;
        }
    }
    
    public int a() {
        return this.u;
    }
    
    public String b() {
        return this.v;
    }
    
    public int c() {
        return this.a;
    }
    
    public int d() {
        return this.l;
    }
    
    public boolean e() {
        return this.b;
    }
    
    public boolean f() {
        return this.c;
    }
    
    public boolean g() {
        return this.d;
    }
    
    public boolean h() {
        return this.e;
    }
    
    public boolean i() {
        return this.g;
    }
    
    public boolean j() {
        return this.h;
    }
    
    public String k() {
        return this.i;
    }
    
    public String l() {
        return this.j;
    }
    
    public String m() {
        return this.k;
    }
    
    public int n() {
        return this.m;
    }
    
    public int o() {
        return this.n;
    }
    
    public int p() {
        return this.o;
    }
    
    public d q() {
        return this.p;
    }
    
    public b r() {
        return this.q;
    }
    
    public c s() {
        return this.r;
    }
    
    public int t() {
        return this.t;
    }
    
    @Override
    public String toString() {
        int x = de.me.death.g.x;
        final ib ib = new ib();
        String string;
        try {
            ib.a("threads", this.a);
            ib.a("doublej", this.b);
            ib.a("stay", this.c);
            ib.a("spam", this.d);
            ib.a("ach", this.e);
            ib.a("console", this.f);
            ib.a("ping", this.g);
            ib.a("move", this.h);
            ib.a("msg", this.i);
            ib.a("login", this.j);
            ib.a("register", this.k);
            ib.a("jamount", this.l);
            ib.a("port", this.m);
            ib.a("amount", this.n);
            ib.a("stayl", this.o);
            ib.a("protocol", this.p.toString());
            ib.a("proxymode", this.q.toString());
            ib.a("nicks", this.r.toString());
            ib.a("premium", this.s);
            ib.a("nicksize", this.t);
            ib.a("spoofed", this.w);
            ib.a("pingamount", this.u);
            ib.a("address", this.v);
            string = ib.toString();
            if (nb.a) {
                de.me.death.g.x = ++x;
            }
        }
        catch (kg kg) {
            throw kg;
        }
        return string;
    }
    
    public boolean u() {
        try {
            if (this.w != null) {
                return true;
            }
        }
        catch (kg kg) {
            throw kg;
        }
        return false;
    }
    
    public String v() {
        return this.w;
    }
    
    static {
        final String[] array = new String[24];
        int n24;
        int n23;
        int n22;
        int n21;
        int n20;
        int n19;
        int n18;
        int n17;
        int n16;
        int n15;
        int n14;
        int n13;
        int n12;
        int n11;
        int n10;
        int n9;
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 0))))))))))))))))))))));
        String s = "]^\u001cYXB\\\u0005F";
        int n25 = -1;
        String intern = null;
    Label_0444_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n27;
            final int n26 = n27 = (length = charArray.length);
            int n28 = 0;
            while (true) {
                Label_0518: {
                    if (n26 > 1) {
                        break Label_0518;
                    }
                    length = (n27 = n28);
                    do {
                        final char c = charArray[n27];
                        char c2 = '\0';
                        switch (n28 % 5) {
                            case 0: {
                                c2 = 'l';
                                break;
                            }
                            case 1: {
                                c2 = 'l';
                                break;
                            }
                            case 2: {
                                c2 = '+';
                                break;
                            }
                            case 3: {
                                c2 = 'w';
                                break;
                            }
                            default: {
                                c2 = 'h';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n28;
                    } while (n26 == 0);
                }
                if (n26 > n28) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n25) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 1)))))))))))))))))))))));
                    s = "\u001f\u0018J\u000e";
                    n25 = 0;
                    continue Label_0444_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 2)))))))))))))))))))))));
                    s = "\r\u000fC";
                    n25 = 1;
                    continue Label_0444_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 3)))))))))))))))))))))));
                    s = "\r\u0001D\u0002\u0006\u0018";
                    n25 = 2;
                    continue Label_0444_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 4)))))))))))))))))))))));
                    s = "\u001f\u0018J\u000e\u0004";
                    n25 = 3;
                    continue Label_0444_Outer;
                }
                case 3: {
                    array[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 5)))))))))))))))))))))));
                    s = "\u0001\u001fL";
                    n25 = 4;
                    continue Label_0444_Outer;
                }
                case 4: {
                    array[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 6)))))))))))))))))))))));
                    s = "\u0001\u0003]\u0012";
                    n25 = 5;
                    continue Label_0444_Outer;
                }
                case 5: {
                    array[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 7)))))))))))))))))))))));
                    s = "\u0018\u0004Y\u0012\t\b\u001f";
                    n25 = 6;
                    continue Label_0444_Outer;
                }
                case 6: {
                    array[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 8)))))))))))))))))))))));
                    s = "\u001c\u001eN\u001a\u0001\u0019\u0001";
                    n25 = 7;
                    continue Label_0444_Outer;
                }
                case 7: {
                    array[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 9)))))))))))))))))))))));
                    s = "\u001c\u0005E\u0010\t\u0001\u0003^\u0019\u001c";
                    n25 = 8;
                    continue Label_0444_Outer;
                }
                case 8: {
                    array[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 10)))))))))))))))))))))));
                    s = "\u0006\rF\u0018\u001d\u0002\u0018";
                    n25 = 9;
                    continue Label_0444_Outer;
                }
                case 9: {
                    array[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 11)))))))))))))))))))))));
                    s = "\b\u0003^\u0015\u0004\t\u0006";
                    n25 = 10;
                    continue Label_0444_Outer;
                }
                case 10: {
                    array[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 12)))))))))))))))))))))));
                    s = "\u001f\u001cD\u0018\u000e\t\b";
                    n25 = 11;
                    continue Label_0444_Outer;
                }
                case 11: {
                    array[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 13)))))))))))))))))))))));
                    s = "\u001c\u0003Y\u0003";
                    n25 = 12;
                    continue Label_0444_Outer;
                }
                case 12: {
                    array[n14] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 14)))))))))))))))))))))));
                    s = "\u001f\u001cJ\u001a";
                    n25 = 13;
                    continue Label_0444_Outer;
                }
                case 13: {
                    array[n15] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 15)))))))))))))))))))))));
                    s = "\u001c\u001eD\u000f\u0011\u0001\u0003O\u0012";
                    n25 = 14;
                    continue Label_0444_Outer;
                }
                case 14: {
                    array[n16] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 16)))))))))))))))))))))));
                    s = "\r\bO\u0005\r\u001f\u001f";
                    n25 = 15;
                    continue Label_0444_Outer;
                }
                case 15: {
                    array[n17] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 17)))))))))))))))))))))));
                    s = "\u000f\u0003E\u0004\u0007\u0000\t";
                    n25 = 16;
                    continue Label_0444_Outer;
                }
                case 16: {
                    array[n18] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 18)))))))))))))))))))))));
                    s = "\u001c\u0005E\u0010";
                    n25 = 17;
                    continue Label_0444_Outer;
                }
                case 17: {
                    array[n19] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 19)))))))))))))))))))))));
                    s = "\u001e\tL\u001e\u001b\u0018\tY";
                    n25 = 18;
                    continue Label_0444_Outer;
                }
                case 18: {
                    array[n20] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 20)))))))))))))))))))))));
                    s = "\u001c\u001eD\u0003\u0007\u000f\u0003G";
                    n25 = 19;
                    continue Label_0444_Outer;
                }
                case 19: {
                    array[n21] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 21)))))))))))))))))))))));
                    s = "\u0000\u0003L\u001e\u0006";
                    n25 = 20;
                    continue Label_0444_Outer;
                }
                case 20: {
                    array[n22] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 22)))))))))))))))))))))));
                    s = "\u0002\u0005H\u001c\u001b\u0005\u0016N";
                    n25 = 21;
                    continue Label_0444_Outer;
                }
                case 21: {
                    array[n23] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 23)))))))))))))))))))))));
                    s = "\u0002\u0005H\u001c\u001b";
                    n25 = 22;
                    continue Label_0444_Outer;
                }
                case 22: {
                    break Label_0444_Outer;
                }
            }
        }
        array[n24] = intern;
        z = new String[] { "127.0.0.1", "stay", "ach", "amount", "stayl", "msg", "move", "threads", "premium", "pingamount", "jamount", "doublej", "spoofed", "port", "spam", "proxymode", "address", "console", "ping", "register", "protocol", "login", "nicksize", "nicks" };
    }
}
