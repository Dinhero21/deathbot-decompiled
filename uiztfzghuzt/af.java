// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Method;

final class af extends xe
{
    final Method a;
    
    af(final Method a) {
        this.a = a;
    }
    
    @Override
    public <T> T a(final Class<T> clazz) {
        xe.b(clazz);
        return (T)this.a.invoke(null, clazz, Object.class);
    }
}
