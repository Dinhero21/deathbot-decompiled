// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.lang.reflect.Type;

public final class xb<E> extends nb<Object>
{
    public static final md b;
    private final Class<E> c;
    private final nb<E> d;
    
    public xb(final ab ab, final nb<E> nb, final Class<E> c) {
        this.d = new gc<E>(ab, nb, c);
        this.c = c;
    }
    
    @Override
    public Object a(final bg bg) {
        final boolean ab = rf.ab;
        Label_0034: {
            bg bg2 = null;
            Label_0024: {
                try {
                    bg2 = bg;
                    if (ab) {
                        break Label_0024;
                    }
                    final p p = bg.g();
                    final p p2 = uiztfzghuzt.p.NULL;
                    if (p == p2) {
                        break Label_0024;
                    }
                    break Label_0034;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    final p p = bg.g();
                    final p p2 = uiztfzghuzt.p.NULL;
                    if (p != p2) {
                        break Label_0034;
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
        final ArrayList<E> list = new ArrayList<E>();
        bg.b();
    Label_0088:
        while (true) {
            while (bg.f()) {
                final E a = this.d.a(bg);
                try {
                    list.add(a);
                    if (ab) {
                        break Label_0088;
                    }
                    if (!ab) {
                        continue;
                    }
                }
                catch (kg kg3) {
                    throw kg3;
                }
                break;
                final int size = list.size();
                final Object instance = Array.newInstance(this.c, size);
                int i = 0;
                Object o = null;
                while (i < size) {
                    try {
                        o = instance;
                        if (ab) {
                            return o;
                        }
                        Array.set(o, i, list.get(i));
                        ++i;
                        if (!ab) {
                            continue;
                        }
                    }
                    catch (kg kg4) {
                        throw kg4;
                    }
                    break;
                }
                return o;
            }
            bg.c();
            continue Label_0088;
        }
    }
    
    @Override
    public void a(final dg dg, final Object o) {
        final boolean ab = rf.ab;
        Label_0030: {
            Label_0018: {
                try {
                    if (ab) {
                        break Label_0030;
                    }
                    final Object o2 = o;
                    if (o2 == null) {
                        break Label_0018;
                    }
                    break Label_0018;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    final Object o2 = o;
                    if (o2 == null) {
                        dg.i();
                        return;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            dg.c();
        }
        int i = 0;
        while (i < Array.getLength(o)) {
            final Object value = Array.get(o, i);
            try {
                this.d.a(dg, (E)value);
                ++i;
                if (ab) {
                    return;
                }
                if (!ab) {
                    continue;
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
            break;
        }
        dg.d();
    }
    
    static {
        b = new cf();
    }
}
