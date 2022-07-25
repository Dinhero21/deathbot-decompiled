// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.HashMap;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ab
{
    private static final ag<?> a;
    private final ThreadLocal<Map<ag<?>, ub<?>>> b;
    private final Map<ag<?>, nb<?>> c;
    private final List<md> d;
    private final xd e;
    private final me f;
    private final z g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final ff m;
    private static final String[] z;
    
    public ab() {
        this(me.a, uiztfzghuzt.g.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, uiztfzghuzt.m.DEFAULT, Collections.emptyList());
    }
    
    ab(final me f, final z g, final Map<Type, cb<?>> map, final boolean h, final boolean b, final boolean j, final boolean i, final boolean k, final boolean l, final boolean b2, final m m, final List<md> list) {
        this.b = new ThreadLocal<Map<ag<?>, ub<?>>>();
        this.c = new ConcurrentHashMap<ag<?>, nb<?>>();
        this.e = new xd(map);
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = j;
        this.i = i;
        this.k = k;
        this.l = l;
        final ArrayList<md> list2 = new ArrayList<md>();
        list2.add(rf.Y);
        list2.add(bc.b);
        list2.add(f);
        list2.addAll((Collection<?>)list);
        list2.add(rf.D);
        list2.add(rf.m);
        list2.add(rf.g);
        list2.add(rf.i);
        list2.add(rf.k);
        final nb<Number> a = a(m);
        list2.add(rf.a(Long.TYPE, Long.class, a));
        list2.add(rf.a(Double.TYPE, Double.class, this.a(b2)));
        list2.add(rf.a(Float.TYPE, Float.class, this.b(b2)));
        list2.add(rf.x);
        list2.add(rf.o);
        list2.add(rf.q);
        list2.add(rf.a(AtomicLong.class, a(a)));
        list2.add(rf.a(AtomicLongArray.class, b(a)));
        list2.add(rf.s);
        list2.add(rf.z);
        list2.add(rf.F);
        list2.add(rf.H);
        list2.add(rf.a(BigDecimal.class, rf.B));
        list2.add(rf.a(BigInteger.class, rf.C));
        list2.add(rf.J);
        list2.add(rf.L);
        list2.add(rf.P);
        list2.add(rf.R);
        list2.add(rf.W);
        list2.add(rf.N);
        list2.add(rf.d);
        list2.add(zb.b);
        list2.add(rf.U);
        list2.add(ec.b);
        list2.add(dc.b);
        list2.add(rf.S);
        list2.add(xb.b);
        list2.add(rf.b);
        list2.add(new df(this.e));
        list2.add(new gf(this.e, b));
        list2.add(this.m = new ff(this.e));
        list2.add(rf.Z);
        list2.add(new kf(this.e, g, f, this.m));
        this.d = (List<md>)Collections.unmodifiableList((List<?>)list2);
    }
    
    private nb<Number> a(final boolean b) {
        try {
            if (b) {
                return rf.v;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return new pb(this);
    }
    
    private nb<Number> b(final boolean b) {
        try {
            if (b) {
                return rf.u;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return new qb(this);
    }
    
    static void a(final double d) {
        Label_0028: {
            boolean b2 = false;
            Label_0017: {
                boolean b;
                try {
                    b = (b2 = Double.isNaN(d));
                    if (fb.a != 0) {
                        break Label_0028;
                    }
                    if (!b) {
                        break Label_0017;
                    }
                    break Label_0028;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                try {
                    if (b) {
                        break Label_0028;
                    }
                    b2 = Double.isInfinite(d);
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            try {
                if (b2) {
                    throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
    }
    
    private static nb<Number> a(final m m) {
        try {
            if (m == m.DEFAULT) {
                return rf.t;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return new rb();
    }
    
    private static nb<AtomicLong> a(final nb<Number> nb) {
        return new sb(nb).a();
    }
    
    private static nb<AtomicLongArray> b(final nb<Number> nb) {
        return new tb(nb).a();
    }
    
    public <T> nb<T> a(final ag<T> obj) {
        final int a = fb.a;
        Map<ag<?>, nb<?>> c = null;
        ag<?> a2 = null;
        Label_0029: {
            Label_0028: {
                Label_0025: {
                    try {
                        c = this.c;
                        a2 = obj;
                        if (a != 0) {
                            break Label_0025;
                        }
                        if (obj != null) {
                            break Label_0028;
                        }
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                    a2 = ab.a;
                }
                break Label_0029;
            }
            a2 = obj;
        }
        final nb<T> nb = c.get(a2);
        Object value = null;
        Label_0061: {
            Label_0054: {
                nb<T> nb2;
                try {
                    nb2 = (nb<T>)(value = nb);
                    if (a != 0) {
                        break Label_0061;
                    }
                    if (nb2 != null) {
                        return nb;
                    }
                    break Label_0054;
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                try {
                    if (nb2 != null) {
                        return nb;
                    }
                }
                catch (IllegalArgumentException ex3) {
                    throw ex3;
                }
            }
            value = this.b.get();
        }
        Map<ag<?>, ub<?>> value2 = (Map<ag<?>, ub<?>>)value;
        boolean b = false;
        Object value3 = null;
        Label_0107: {
            Label_0100: {
                try {
                    final Map<ag<?>, ub<?>> map = (Map<ag<?>, ub<?>>)(value3 = value2);
                    if (a != 0) {
                        break Label_0107;
                    }
                    if (map != null) {
                        break Label_0100;
                    }
                }
                catch (IllegalArgumentException ex4) {
                    throw ex4;
                }
                value2 = new HashMap<ag<?>, ub<?>>();
                this.b.set(value2);
                b = true;
            }
            value3 = value2.get(obj);
        }
        final ub<?> ub = (ub<?>)value3;
        Label_0130: {
            ub<?> ub2;
            try {
                final ub<?> ub3;
                ub2 = (ub3 = ub);
                if (a != 0) {
                    break Label_0130;
                }
                if (ub2 != null) {
                    return (nb<T>)ub;
                }
                break Label_0130;
            }
            catch (IllegalArgumentException ex5) {
                throw ex5;
            }
            try {
                if (ub2 != null) {
                    return (nb<T>)ub;
                }
            }
            catch (IllegalArgumentException ex6) {
                throw ex6;
            }
            try {
                final ub<?> ub3 = new ub<Object>();
                final ub<?> ub4 = ub3;
                value2.put(obj, ub4);
                final Iterator<md> iterator = this.d.iterator();
                while (iterator.hasNext()) {
                    final nb<?> a3 = iterator.next().a(this, (ag<?>)obj);
                    nb<?> nb4 = null;
                    Label_0233: {
                        Label_0262: {
                            Label_0207: {
                                nb<?> nb3;
                                try {
                                    nb3 = (nb4 = a3);
                                    if (a != 0) {
                                        break Label_0233;
                                    }
                                    if (nb3 != null) {
                                        break Label_0207;
                                    }
                                    break Label_0262;
                                }
                                catch (IllegalArgumentException ex7) {
                                    throw ex7;
                                }
                                try {
                                    if (nb3 == null) {
                                        break Label_0262;
                                    }
                                    ub4.a(a3);
                                    this.c.put(obj, a3);
                                    nb4 = a3;
                                }
                                catch (IllegalArgumentException ex8) {
                                    throw ex8;
                                }
                            }
                            break Label_0233;
                        }
                        if (a != 0) {
                            break;
                        }
                        continue;
                    }
                    return (nb<T>)nb4;
                }
                throw new IllegalArgumentException("GSON cannot handle " + obj);
            }
            finally {
                try {
                    value2.remove(obj);
                    if (b) {
                        this.b.remove();
                    }
                }
                catch (IllegalArgumentException ex9) {
                    throw ex9;
                }
            }
        }
    }
    
    public <T> nb<T> a(md m, final ag<T> obj) {
        final int a = fb.a;
        boolean contains = false;
        Label_0032: {
            try {
                contains = this.d.contains(m);
                if (a != 0) {
                    break Label_0032;
                }
                if (contains) {
                    break Label_0032;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            m = this.m;
        }
        int n = contains ? 1 : 0;
        for (final md md : this.d) {
            Label_0103: {
                try {
                    if (n != 0) {
                        break Label_0103;
                    }
                    if (md != m) {
                        continue;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                n = 1;
                if (a == 0) {
                    continue;
                }
                boolean a2 = false;
                Label_0100: {
                    try {
                        if (nb.a) {
                            a2 = false;
                            break Label_0100;
                        }
                    }
                    catch (IllegalArgumentException ex3) {
                        throw ex3;
                    }
                    a2 = true;
                }
                nb.a = a2;
            }
            final nb<T> a3 = md.a(this, obj);
            nb<T> nb = null;
            Label_0128: {
                Label_0131: {
                    try {
                        nb = a3;
                        if (a != 0) {
                            return nb;
                        }
                        if (nb == null) {
                            break Label_0131;
                        }
                    }
                    catch (IllegalArgumentException ex4) {
                        throw ex4;
                    }
                    break Label_0128;
                }
                if (a != 0) {
                    break;
                }
                continue;
            }
            return nb;
        }
        throw new IllegalArgumentException("GSON cannot serialize " + obj);
    }
    
    public <T> nb<T> a(final Class<T> clazz) {
        return this.a((ag<T>)ag.b((Class<T>)clazz));
    }
    
    public bg a(final Reader reader) {
        final bg bg = new bg(reader);
        bg.a(this.l);
        return bg;
    }
    
    public <T> T a(final String s, final Class<T> clazz) {
        return ve.a(clazz).cast(this.a(s, (Type)clazz));
    }
    
    public <T> T a(final String s, final Type type) {
        try {
            if (s == null) {
                return null;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.a(new StringReader(s), type);
    }
    
    public <T> T a(final Reader reader, final Type type) {
        final bg a = this.a(reader);
        final Object a2 = this.a(a, type);
        a(a2, a);
        return (T)a2;
    }
    
    private static void a(final Object o, final bg bg) {
        try {
            Label_0018: {
                try {
                    if (o == null) {
                        return;
                    }
                    final bg bg2 = bg;
                    final p p2 = bg2.g();
                    final p p3 = p.END_DOCUMENT;
                    if (p2 != p3) {
                        break Label_0018;
                    }
                    return;
                }
                catch (c c) {
                    throw c;
                }
                try {
                    final bg bg2 = bg;
                    final p p2 = bg2.g();
                    final p p3 = p.END_DOCUMENT;
                    if (p2 != p3) {
                        throw new jg("JSON document was not fully consumed.");
                    }
                }
                catch (c c2) {
                    throw c2;
                }
            }
        }
        catch (c c3) {
            throw new kg(c3);
        }
        catch (IOException ex) {
            throw new jg(ex);
        }
    }
    
    public <T> T a(final bg bg, final Type type) {
        boolean b = true;
        final boolean a = bg.a();
        bg.a(true);
        try {
            bg.g();
            b = false;
            return this.a(ag.a(type)).a(bg);
        }
        catch (EOFException ex) {
            if (b) {
                return null;
            }
            throw new kg(ex);
        }
        catch (IllegalStateException ex2) {
            throw new kg(ex2);
        }
        catch (IOException ex3) {
            throw new kg(ex3);
        }
        finally {
            bg.a(a);
        }
    }
    
    @Override
    public String toString() {
        return "{serializeNulls:" + this.h + ",factories:" + this.d + ",instanceCreators:" + this.e + "}";
    }
    
    static {
        final String[] array = new String[8];
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 0))))));
        String s = "\u0007\u0015N\u0017\r#'o7B4fi8C$*dy";
        int n9 = -1;
        String intern = null;
    Label_0181_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n11;
            final int n10 = n11 = (length = charArray.length);
            int n12 = 0;
            while (true) {
                Label_0257: {
                    if (n10 > 1) {
                        break Label_0257;
                    }
                    length = (n11 = n12);
                    do {
                        final char c = charArray[n11];
                        char c2 = '\0';
                        switch (n12 % 5) {
                            case 0: {
                                c2 = '@';
                                break;
                            }
                            case 1: {
                                c2 = 'F';
                                break;
                            }
                            case 2: {
                                c2 = '\u0001';
                                break;
                            }
                            case 3: {
                                c2 = 'Y';
                                break;
                            }
                            default: {
                                c2 = '-';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n12;
                    } while (n10 == 0);
                }
                if (n10 > n12) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n9) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 1)))))));
                    s = "\n\u0015N\u0017\r$)b,@%(uyZ!5!7B4fg,A,?!:B.5t4H$h";
                    n9 = 0;
                    continue Label_0181_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 2)))))));
                    s = "`/ryC/2!8\r6'm0I`\"n,O,#!/L,3dyL3fq<_`\fR\u0016c`5q<N) h:L4/n7\u0003`\u0012nyB6#s+D$#!-E)5";
                    n9 = 1;
                    continue Label_0181_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 3)))))));
                    s = "`$d1L6/n+\u0001`3r<\r\u00075n7o5/m=H2hr<_)'m0W%\u0015q<N)'m\u001fA/'u0C'\u0016n0C4\u0010`5X%5)p\r-#u1B$h";
                    n9 = 2;
                    continue Label_0181_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 4)))))));
                    s = "l/o*Y!(b<n2#`-B25;";
                    n9 = 3;
                    continue Label_0181_Outer;
                }
                case 3: {
                    array[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 5)))))));
                    s = "l `:Y/4h<^z";
                    n9 = 4;
                    continue Label_0181_Outer;
                }
                case 4: {
                    array[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 6)))))));
                    s = ";5d+D!*h#H\u000e3m5^z";
                    n9 = 5;
                    continue Label_0181_Outer;
                }
                case 5: {
                    array[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 7)))))));
                    s = "\u0007\u0015N\u0017\r#'o7B4fr<_)'m0W%f";
                    n9 = 6;
                    continue Label_0181_Outer;
                }
                case 6: {
                    break Label_0181_Outer;
                }
            }
        }
        array[n8] = intern;
        z = new String[] { "GSON cannot handle ", "JSON document was not fully consumed.", " is not a valid double value as per JSON specification. To override this", " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.", ",instanceCreators:", ",factories:", "{serializeNulls:", "GSON cannot serialize " };
        a = ag.b((Class<?>)Object.class);
    }
}
