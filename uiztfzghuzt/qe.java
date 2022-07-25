// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.Iterator;

abstract class qe<T> implements Iterator<T>
{
    te<Object, Object> a;
    te<Object, Object> b;
    int c;
    final mg d;
    
    qe(final mg d) {
        this.d = d;
        this.a = (te<Object, Object>)this.d.f.d;
        this.b = null;
        this.c = this.d.e;
    }
    
    @Override
    public final boolean hasNext() {
        try {
            if (this.a != this.d.f) {
                return true;
            }
        }
        catch (NoSuchElementException ex) {
            throw ex;
        }
        return false;
    }
    
    final te<Object, Object> a() {
        final te<Object, Object> a = this.a;
        try {
            if (a == this.d.f) {
                throw new NoSuchElementException();
            }
        }
        catch (NoSuchElementException ex) {
            throw ex;
        }
        Label_0049: {
            try {
                final qe qe = this;
                if (xd.b != 0) {
                    return qe.b = a;
                }
                final mg mg = this.d;
                final int n = mg.e;
                final qe qe2 = this;
                final int n2 = qe2.c;
                if (n != n2) {
                    break Label_0049;
                }
                break Label_0049;
            }
            catch (NoSuchElementException ex2) {
                throw ex2;
            }
            try {
                final mg mg = this.d;
                final int n = mg.e;
                final qe qe2 = this;
                final int n2 = qe2.c;
                if (n != n2) {
                    throw new ConcurrentModificationException();
                }
            }
            catch (NoSuchElementException ex3) {
                throw ex3;
            }
        }
        this.a = a.d;
        final qe qe = this;
        return qe.b = a;
    }
    
    @Override
    public final void remove() {
        qe qe = null;
        Label_0044: {
            Label_0017: {
                try {
                    qe = this;
                    if (xd.b != 0) {
                        break Label_0044;
                    }
                    final te<Object, Object> te = this.b;
                    if (te == null) {
                        break Label_0017;
                    }
                    break Label_0017;
                }
                catch (NoSuchElementException ex) {
                    throw ex;
                }
                try {
                    final te<Object, Object> te = this.b;
                    if (te == null) {
                        throw new IllegalStateException();
                    }
                }
                catch (NoSuchElementException ex2) {
                    throw ex2;
                }
            }
            this.d.a(this.b, true);
            this.b = null;
            qe = this;
        }
        qe.c = this.d.e;
    }
}
