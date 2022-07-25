// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

class wb extends nb<Object>
{
    private nb<Object> b;
    final boolean c;
    final boolean d;
    final ab e;
    final ag f;
    final me g;
    
    wb(final me g, final boolean c, final boolean d, final ab e, final ag f) {
        this.g = g;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public Object a(final bg bg) {
        Label_0017: {
            try {
                final Object a = this;
                if (xd.b != 0) {
                    return a;
                }
                final boolean b = this.c;
                if (b) {
                    break Label_0017;
                }
                return this.b().a(bg);
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final boolean b = this.c;
                if (b) {
                    bg.t();
                    return null;
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        return this.b().a(bg);
    }
    
    @Override
    public void a(final dg dg, final Object o) {
        nb<Object> b = null;
        Label_0028: {
            Label_0017: {
                try {
                    b = this;
                    if (xd.b != 0) {
                        break Label_0028;
                    }
                    final boolean b2 = this.d;
                    if (b2) {
                        break Label_0017;
                    }
                    break Label_0017;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    final boolean b2 = this.d;
                    if (b2) {
                        dg.i();
                        return;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            b = this.b();
        }
        b.a(dg, o);
    }
    
    private nb<Object> b() {
        final nb<Object> b = this.b;
        nb<Object> nb = null;
        Label_0023: {
            try {
                nb = b;
                if (xd.b != 0) {
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
        this.b = this.e.a(this.g, (ag<Object>)this.f);
        return nb;
    }
}
