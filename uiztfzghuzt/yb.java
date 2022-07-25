// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Iterator;
import java.lang.reflect.Type;
import java.util.Collection;

final class yb<E> extends nb<Collection<E>>
{
    private final nb<E> b;
    private final ue<? extends Collection<E>> c;
    
    public yb(final ab ab, final Type type, final nb<E> nb, final ue<? extends Collection<E>> c) {
        this.b = new gc<E>(ab, nb, type);
        this.c = c;
    }
    
    @Override
    public Collection<E> a(final bg bg) {
        final boolean ab = rf.ab;
        Object o = null;
        Label_0040: {
            Label_0024: {
                p p;
                try {
                    p = (p)(o = bg.g());
                    if (ab) {
                        break Label_0040;
                    }
                    final p p2 = uiztfzghuzt.p.NULL;
                    if (p == p2) {
                        break Label_0024;
                    }
                    break Label_0024;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    final p p2 = uiztfzghuzt.p.NULL;
                    if (p == p2) {
                        bg.n();
                        return null;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            o = this.c.a();
        }
        final Collection<Object> collection = (Collection<Object>)o;
        bg.b();
        while (bg.f()) {
            final E a = this.b.a(bg);
            try {
                collection.add(a);
                if (ab) {
                    return (Collection<E>)collection;
                }
                if (!ab) {
                    continue;
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
            break;
        }
        bg.c();
        return (Collection<E>)collection;
    }
    
    @Override
    public void a(final dg dg, final Collection<E> collection) {
        final boolean ab = rf.ab;
        Collection<E> collection2 = null;
        Label_0031: {
            Label_0018: {
                try {
                    collection2 = collection;
                    if (ab) {
                        break Label_0031;
                    }
                    if (collection == null) {
                        break Label_0018;
                    }
                    break Label_0018;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (collection == null) {
                        dg.i();
                        return;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            dg.c();
            collection2 = collection;
        }
        for (final E next : collection2) {
            try {
                this.b.a(dg, next);
                if (ab) {
                    return;
                }
                if (!ab) {
                    continue;
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
            break;
        }
        dg.d();
    }
}
