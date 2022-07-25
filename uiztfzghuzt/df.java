// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Type;
import java.util.Collection;

public final class df implements md
{
    private final xd a;
    
    public df(final xd a) {
        this.a = a;
    }
    
    @Override
    public <T> nb<T> a(final ab ab, final ag<T> ag) {
        final Type b = ag.b();
        final Class<? super T> a = ag.a();
        Type type = null;
        Class<? super T> clazz3 = null;
        Label_0037: {
            Label_0031: {
                Class<Collection> clazz;
                Class<? super T> clazz2;
                try {
                    clazz = (Class<Collection>)(type = Collection.class);
                    clazz2 = (clazz3 = a);
                    if (rf.ab) {
                        break Label_0037;
                    }
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
                    final boolean b2 = clazz.isAssignableFrom(clazz2);
                    if (!b2) {
                        return null;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            type = b;
            clazz3 = a;
        }
        final Type a2 = td.a(type, clazz3);
        return (nb<T>)new yb(ab, a2, (nb<Object>)ab.a(ag.a(a2)), (ue<? extends Collection<Object>>)this.a.a(ag));
    }
}
