// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

class ub<T> extends nb<T>
{
    private nb<T> b;
    
    public void a(final nb<T> b) {
        ub ub = null;
        Label_0027: {
            Label_0017: {
                try {
                    ub = this;
                    if (fb.a != 0) {
                        break Label_0027;
                    }
                    final nb<T> nb = this.b;
                    if (nb != null) {
                        break Label_0017;
                    }
                    break Label_0017;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                try {
                    final nb<T> nb = this.b;
                    if (nb != null) {
                        throw new AssertionError();
                    }
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
            }
            ub = this;
        }
        ub.b = b;
    }
    
    @Override
    public T a(final bg bg) {
        Label_0017: {
            nb<T> nb;
            try {
                final T t;
                nb = (nb<T>)(t = (T)this.b);
                if (fb.a != 0) {
                    return t;
                }
                if (nb == null) {
                    break Label_0017;
                }
                return this.b.a(bg);
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (nb == null) {
                    throw new IllegalStateException();
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        return this.b.a(bg);
    }
    
    @Override
    public void a(final dg dg, final T t) {
        nb<T> nb2 = null;
        Label_0030: {
            Label_0017: {
                nb<T> nb;
                try {
                    nb = (nb2 = this.b);
                    if (fb.a != 0) {
                        break Label_0030;
                    }
                    if (nb == null) {
                        break Label_0017;
                    }
                    break Label_0017;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                try {
                    if (nb == null) {
                        throw new IllegalStateException();
                    }
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
            }
            nb2 = this.b;
        }
        nb2.a(dg, t);
    }
}
