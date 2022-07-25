// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Type;
import java.util.Map;

public final class gf implements md
{
    private final xd a;
    final boolean b;
    
    public gf(final xd a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public <T> nb<T> a(final ab ab, final ag<T> ag) {
        final Type b = ag.b();
        final Class<? super T> a = ag.a();
        Class<?> e = null;
        Label_0038: {
            Label_0031: {
                Class<Map> clazz;
                try {
                    clazz = (Class<Map>)(e = Map.class);
                    if (rf.ab) {
                        break Label_0038;
                    }
                    final Class<? super T> clazz2 = a;
                    final boolean b2 = clazz.isAssignableFrom(clazz2);
                    if (!b2) {
                        break Label_0031;
                    }
                    break Label_0031;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    final Class<? super T> clazz2 = a;
                    final boolean b2 = clazz.isAssignableFrom(clazz2);
                    if (!b2) {
                        return null;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            e = td.e(b);
        }
        final Type[] b3 = td.b(b, e);
        return (nb<T>)new ac(ab, b3[0], (nb<Object>)this.a(ab, b3[0]), b3[1], (nb<Object>)ab.a(ag.a(b3[1])), (ue<? extends Map<Object, Object>>)this.a.a(ag));
    }
    
    private nb<?> a(final ab ab, final Type type) {
        Label_0027: {
            Type type2 = null;
            Class<Boolean> type3 = null;
            Label_0017: {
                Class<Boolean> clazz;
                try {
                    type2 = type;
                    clazz = (type3 = Boolean.TYPE);
                    if (rf.ab) {
                        break Label_0027;
                    }
                    if (type != clazz) {
                        break Label_0017;
                    }
                    break Label_0027;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (type == clazz) {
                        break Label_0027;
                    }
                    type2 = type;
                    type3 = Boolean.class;
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            try {
                if (type2 == type3) {
                    return rf.f;
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
        }
        return ab.a(ag.a(type));
    }
}
