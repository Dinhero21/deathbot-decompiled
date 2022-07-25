// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Method;

final class ye extends xe
{
    final Method a;
    final Object b;
    
    ye(final Method a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public <T> T a(final Class<T> clazz) {
        xe.b(clazz);
        return (T)this.a.invoke(this.b, clazz);
    }
}
