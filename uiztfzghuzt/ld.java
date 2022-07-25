// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.constant.Constable;
import java.util.HashMap;
import java.util.Map;

final class ld<T extends Enum<T>> extends nb<T>
{
    private final Map<String, T> b;
    private final Map<T, String> c;
    
    public ld(final Class<T> clazz) {
        final boolean ab = rf.ab;
        this.b = new HashMap<String, T>();
        this.c = new HashMap<T, String>();
        try {
            final T[] array = clazz.getEnumConstants();
            final int length = array.length;
            int i = 0;
            while (i < length) {
                final Enum<T> enum1 = array[i];
                String name = enum1.name();
                final pd pd = clazz.getField(name).getAnnotation(pd.class);
                Label_0205: {
                    Label_0201: {
                        Label_0174: {
                            Label_0096: {
                                try {
                                    if (ab) {
                                        break;
                                    }
                                    final pd pd2 = pd;
                                    final boolean b = ab;
                                    if (!b) {
                                        break Label_0096;
                                    }
                                    break Label_0201;
                                }
                                catch (NoSuchFieldException ex) {
                                    throw ex;
                                }
                                try {
                                    final pd pd2 = pd;
                                    final boolean b = ab;
                                    if (b) {
                                        break Label_0201;
                                    }
                                    if (pd2 == null) {
                                        break Label_0174;
                                    }
                                }
                                catch (NoSuchFieldException ex2) {
                                    throw ex2;
                                }
                            }
                            name = pd.a();
                            final String[] b2 = pd.b();
                            final int length2 = b2.length;
                            int j = 0;
                            while (j < length2) {
                                final String s = b2[j];
                                try {
                                    this.b.put(s, (T)enum1);
                                    ++j;
                                    if (ab) {
                                        break Label_0205;
                                    }
                                    if (!ab) {
                                        continue;
                                    }
                                }
                                catch (NoSuchFieldException ex3) {
                                    throw ex3;
                                }
                                break;
                            }
                        }
                        this.b.put(name, (T)enum1);
                        this.c.put((T)enum1, name);
                    }
                    ++i;
                }
                if (ab) {
                    break;
                }
            }
        }
        catch (NoSuchFieldException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public T a(final bg bg) {
        Label_0020: {
            p p;
            try {
                final Constable g;
                p = (p)(g = bg.g());
                if (rf.ab) {
                    return (T)g;
                }
                final p p2 = uiztfzghuzt.p.NULL;
                if (p == p2) {
                    break Label_0020;
                }
                return this.b.get(bg.l());
            }
            catch (kg kg) {
                throw kg;
            }
            try {
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
        Constable g = this.b.get(bg.l());
        return (T)g;
    }
    
    @Override
    public void a(final dg dg, final T t) {
        String s = null;
        Label_0033: {
            Constable value = null;
            Label_0030: {
                Label_0015: {
                    try {
                        value = t;
                        if (rf.ab) {
                            break Label_0030;
                        }
                        if (t == null) {
                            break Label_0015;
                        }
                        break Label_0015;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        if (t == null) {
                            s = null;
                            break Label_0033;
                        }
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                value = this.c.get(t);
            }
            s = (String)value;
        }
        dg.b(s);
    }
}
