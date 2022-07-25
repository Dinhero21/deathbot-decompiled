// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Method;

final class ze extends xe
{
    final Method a;
    final int b;
    
    ze(final Method a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public <T> T a(final Class<T> clazz) {
        xe.b(clazz);
        return (T)this.a.invoke(null, clazz, this.b);
    }
}
