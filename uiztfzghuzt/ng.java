// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Iterator;
import java.util.Map;
import java.util.AbstractSet;

class ng extends AbstractSet<Map.Entry<Object, Object>>
{
    final mg a;
    
    ng(final mg a) {
        this.a = a;
    }
    
    @Override
    public int size() {
        return this.a.d;
    }
    
    @Override
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new re(this);
    }
    
    @Override
    public boolean contains(final Object o) {
        Label_0025: {
            try {
                if (!(o instanceof Map.Entry)) {
                    return false;
                }
                final ng ng = this;
                final mg mg = ng.a;
                final Object o2 = o;
                final Map.Entry entry = (Map.Entry)o2;
                final te te = mg.a(entry);
                if (te != null) {
                    break Label_0025;
                }
                return false;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final ng ng = this;
                final mg mg = ng.a;
                final Object o2 = o;
                final Map.Entry entry = (Map.Entry)o2;
                final te te = mg.a(entry);
                if (te != null) {
                    return true;
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        return false;
    }
    
    @Override
    public boolean remove(final Object o) {
        final int b = xd.b;
        Label_0021: {
            boolean b2;
            try {
                b2 = (o instanceof Map.Entry);
                if (b != 0) {
                    return b2;
                }
                if (b2) {
                    break Label_0021;
                }
            }
            catch (kg kg) {
                throw kg;
            }
            return b2;
        }
        final te a = this.a.a((Map.Entry)o);
        Label_0048: {
            try {
                if (b != 0) {
                    return true;
                }
                final te te = a;
                if (te == null) {
                    return false;
                }
                break Label_0048;
            }
            catch (kg kg2) {
                throw kg2;
            }
            try {
                final te te = a;
                if (te == null) {
                    return false;
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
        }
        this.a.a(a, true);
        return true;
    }
    
    @Override
    public void clear() {
        this.a.clear();
    }
}
