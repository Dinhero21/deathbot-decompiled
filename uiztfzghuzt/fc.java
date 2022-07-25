// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

public final class fc<T> extends nb<T>
{
    private final mb<T> b;
    private final eb<T> c;
    final ab d;
    private final ag<T> e;
    private final md f;
    private final qf g;
    private nb<T> h;
    
    public fc(final mb<T> b, final eb<T> c, final ab d, final ag<T> e, final md f) {
        this.g = new qf(this, null);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public T a(final bg bg) {
        final boolean ab = rf.ab;
        Label_0032: {
            T t = null;
            Label_0019: {
                eb<T> eb;
                try {
                    eb = (eb<T>)(t = (T)this.c);
                    if (ab) {
                        return t;
                    }
                    if (eb == null) {
                        break Label_0019;
                    }
                    break Label_0032;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (eb != null) {
                        break Label_0032;
                    }
                    t = this.b().a(bg);
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            return t;
        }
        final fb a = we.a(bg);
        Label_0052: {
            fb fb;
            try {
                final Object a2;
                fb = (fb)(a2 = a);
                if (ab) {
                    return (T)a2;
                }
                final boolean b = fb.d();
                if (b) {
                    break Label_0052;
                }
                return this.c.a(a, this.e.b(), this.g);
            }
            catch (kg kg3) {
                throw kg3;
            }
            try {
                final boolean b = fb.d();
                if (b) {
                    return null;
                }
            }
            catch (kg kg4) {
                throw kg4;
            }
        }
        Object a2 = this.c.a(a, this.e.b(), this.g);
        return (T)a2;
    }
    
    @Override
    public void a(final dg dg, final T t) {
        Label_0029: {
            Label_0017: {
                mb<T> mb;
                try {
                    final T b;
                    mb = (mb<T>)(b = (T)this.b);
                    if (rf.ab) {
                        break Label_0029;
                    }
                    if (mb == null) {
                        break Label_0017;
                    }
                    break Label_0017;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (mb == null) {
                        this.b().a(dg, t);
                        return;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            T b = t;
            try {
                if (b == null) {
                    dg.i();
                    return;
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
        }
        we.a(this.b.a(t, this.e.b(), this.g), dg);
    }
    
    private nb<T> b() {
        final nb<T> h = this.h;
        nb<T> nb = null;
        Label_0023: {
            try {
                nb = h;
                if (rf.ab) {
                    return nb;
                }
                if (nb == null) {
                    break Label_0023;
                }
            }
            catch (kg kg) {
                throw kg;
            }
            return nb;
        }
        this.h = this.d.a(this.f, this.e);
        return nb;
    }
}
