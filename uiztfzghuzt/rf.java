// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Calendar;
import java.util.Currency;
import java.util.UUID;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.BitSet;

public final class rf
{
    public static final nb<Class> a;
    public static final md b;
    public static final nb<BitSet> c;
    public static final md d;
    public static final nb<Boolean> e;
    public static final nb<Boolean> f;
    public static final md g;
    public static final nb<Number> h;
    public static final md i;
    public static final nb<Number> j;
    public static final md k;
    public static final nb<Number> l;
    public static final md m;
    public static final nb<AtomicInteger> n;
    public static final md o;
    public static final nb<AtomicBoolean> p;
    public static final md q;
    public static final nb<AtomicIntegerArray> r;
    public static final md s;
    public static final nb<Number> t;
    public static final nb<Number> u;
    public static final nb<Number> v;
    public static final nb<Number> w;
    public static final md x;
    public static final nb<Character> y;
    public static final md z;
    public static final nb<String> A;
    public static final nb<BigDecimal> B;
    public static final nb<BigInteger> C;
    public static final md D;
    public static final nb<StringBuilder> E;
    public static final md F;
    public static final nb<StringBuffer> G;
    public static final md H;
    public static final nb<URL> I;
    public static final md J;
    public static final nb<URI> K;
    public static final md L;
    public static final nb<InetAddress> M;
    public static final md N;
    public static final nb<UUID> O;
    public static final md P;
    public static final nb<Currency> Q;
    public static final md R;
    public static final md S;
    public static final nb<Calendar> T;
    public static final md U;
    public static final nb<Locale> V;
    public static final md W;
    public static final nb<fb> X;
    public static final md Y;
    public static final md Z;
    public static boolean ab;
    
    public static <TT> md a(final Class<TT> clazz, final nb<TT> nb) {
        return new uf(clazz, nb);
    }
    
    public static <TT> md a(final Class<TT> clazz, final Class<TT> clazz2, final nb<? super TT> nb) {
        return new vf(clazz, clazz2, nb);
    }
    
    public static <TT> md b(final Class<TT> clazz, final Class<? extends TT> clazz2, final nb<? super TT> nb) {
        return new wf(clazz, clazz2, nb);
    }
    
    public static <T1> md b(final Class<T1> clazz, final nb<T1> nb) {
        return new xf(clazz, nb);
    }
    
    static {
        a = new hc().a();
        b = a(Class.class, rf.a);
        c = new sc().a();
        d = a(BitSet.class, rf.c);
        e = new dd();
        f = new fd();
        g = a(Boolean.TYPE, Boolean.class, rf.e);
        h = new gd();
        i = a(Byte.TYPE, Byte.class, rf.h);
        j = new hd();
        k = a(Short.TYPE, Short.class, rf.j);
        l = new id();
        m = a(Integer.TYPE, Integer.class, rf.l);
        n = new jd().a();
        o = a(AtomicInteger.class, rf.n);
        p = new kd().a();
        q = a(AtomicBoolean.class, rf.p);
        r = new ic().a();
        s = a(AtomicIntegerArray.class, rf.r);
        t = new jc();
        u = new kc();
        v = new lc();
        w = new mc();
        x = a(Number.class, rf.w);
        y = new nc();
        z = a(Character.TYPE, Character.class, rf.y);
        A = new oc();
        B = new pc();
        C = new qc();
        D = a(String.class, rf.A);
        E = new rc();
        F = a(StringBuilder.class, rf.E);
        G = new tc();
        H = a(StringBuffer.class, rf.G);
        I = new uc();
        J = a(URL.class, rf.I);
        K = new vc();
        L = a(URI.class, rf.K);
        M = new wc();
        N = b(InetAddress.class, rf.M);
        O = new xc();
        P = a(UUID.class, rf.O);
        Q = new yc().a();
        R = a(Currency.class, rf.Q);
        S = new sf();
        T = new ad();
        U = b(Calendar.class, GregorianCalendar.class, rf.T);
        V = new bd();
        W = a(Locale.class, rf.V);
        X = new cd();
        Y = b(fb.class, rf.X);
        Z = new tf();
    }
}
