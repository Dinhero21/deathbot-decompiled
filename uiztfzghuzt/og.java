// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Iterator;
import java.util.AbstractSet;

final class og extends AbstractSet<Object>
{
    final mg a;
    
    og(final mg a) {
        this.a = a;
    }
    
    @Override
    public int size() {
        return this.a.d;
    }
    
    @Override
    public Iterator<Object> iterator() {
        return new se(this);
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.a.containsKey(o);
    }
    
    @Override
    public boolean remove(final Object o) {
        try {
            if (this.a.b(o) != null) {
                return true;
            }
        }
        catch (kg kg) {
            throw kg;
        }
        return false;
    }
    
    @Override
    public void clear() {
        this.a.clear();
    }
}
