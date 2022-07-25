// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.ArrayList;

public final class bc extends nb<Object>
{
    public static final md b;
    private final ab c;
    
    bc(final ab c) {
        this.c = c;
    }
    
    @Override
    public Object a(final bg bg) {
        final boolean ab = rf.ab;
        switch (jf.a[bg.g().ordinal()]) {
            case 1: {
                final ArrayList<Object> list = new ArrayList<Object>();
                bg.b();
                while (bg.f()) {
                    try {
                        list.add(this.a(bg));
                        if (ab) {
                            return list;
                        }
                        if (!ab) {
                            continue;
                        }
                    }
                    catch (IllegalStateException ex) {
                        throw ex;
                    }
                    break;
                }
                bg.c();
                return list;
            }
            case 2: {
                final mg<String, Object> mg = new mg<String, Object>();
                bg.d();
                while (bg.f()) {
                    try {
                        mg.put(bg.k(), this.a(bg));
                        if (ab) {
                            return mg;
                        }
                        if (!ab) {
                            continue;
                        }
                    }
                    catch (IllegalStateException ex2) {
                        throw ex2;
                    }
                    break;
                }
                bg.e();
                return mg;
            }
            case 3: {
                return bg.l();
            }
            case 4: {
                return bg.o();
            }
            case 5: {
                return bg.m();
            }
            case 6: {
                bg.n();
                return null;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }
    
    @Override
    public void a(final dg dg, final Object o) {
        final boolean ab = rf.ab;
        Label_0028: {
            Label_0018: {
                try {
                    if (ab) {
                        return;
                    }
                    final Object o2 = o;
                    if (o2 == null) {
                        break Label_0018;
                    }
                    break Label_0028;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                try {
                    final Object o2 = o;
                    if (o2 != null) {
                        break Label_0028;
                    }
                    dg.i();
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
            }
            return;
        }
        final nb<?> a = this.c.a(o.getClass());
        nb<?> nb2 = null;
        Label_0069: {
            Label_0056: {
                nb<?> nb;
                try {
                    nb = (nb2 = a);
                    if (ab) {
                        break Label_0069;
                    }
                    final boolean b = nb instanceof bc;
                    if (b) {
                        break Label_0056;
                    }
                    break Label_0056;
                }
                catch (IllegalStateException ex3) {
                    throw ex3;
                }
                try {
                    final boolean b = nb instanceof bc;
                    if (b) {
                        dg.e();
                        dg.f();
                        return;
                    }
                }
                catch (IllegalStateException ex4) {
                    throw ex4;
                }
            }
            nb2 = a;
        }
        nb2.a(dg, o);
    }
    
    static {
        b = new hf();
    }
}
