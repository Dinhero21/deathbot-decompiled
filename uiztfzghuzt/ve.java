// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Collections;
import java.util.HashMap;
import java.lang.reflect.Type;
import java.util.Map;

public final class ve
{
    private static final Map<Class<?>, Class<?>> a;
    private static final Map<Class<?>, Class<?>> b;
    
    private static void a(final Map<Class<?>, Class<?>> map, final Map<Class<?>, Class<?>> map2, final Class<?> clazz, final Class<?> clazz2) {
        map.put(clazz, clazz2);
        map2.put(clazz2, clazz);
    }
    
    public static boolean a(final Type type) {
        return ve.a.containsKey(type);
    }
    
    public static <T> Class<T> a(final Class<T> clazz) {
        final Class<?> clazz2 = ve.a.get(sd.a(clazz));
        try {
            final Class<?> clazz4;
            final Class<T> clazz3 = (Class<T>)(clazz4 = clazz2);
            if (xd.b != 0) {
                return (Class<T>)clazz4;
            }
            if (clazz3 != null) {
                return (Class<T>)clazz2;
            }
        }
        catch (kg kg) {
            throw kg;
        }
        Class<?> clazz4 = clazz;
        return (Class<T>)clazz4;
        clazz4 = clazz2;
        return (Class<T>)clazz4;
    }
    
    static {
        final HashMap<Class<?>, Class<?>> m = new HashMap<Class<?>, Class<?>>(16);
        final HashMap<Class<?>, Class<?>> i = new HashMap<Class<?>, Class<?>>(16);
        a(m, i, Boolean.TYPE, Boolean.class);
        a(m, i, Byte.TYPE, Byte.class);
        a(m, i, Character.TYPE, Character.class);
        a(m, i, Double.TYPE, Double.class);
        a(m, i, Float.TYPE, Float.class);
        a(m, i, Integer.TYPE, Integer.class);
        a(m, i, Long.TYPE, Long.class);
        a(m, i, Short.TYPE, Short.class);
        a(m, i, Void.TYPE, Void.class);
        a = Collections.unmodifiableMap((Map<?, ?>)m);
        b = Collections.unmodifiableMap((Map<?, ?>)i);
    }
}
