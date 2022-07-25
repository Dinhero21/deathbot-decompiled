// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.lang.reflect.Type;
import java.util.Map;

public final class bb
{
    private me a;
    private m b;
    private z c;
    private final Map<Type, cb<?>> d;
    private final List<md> e;
    private final List<md> f;
    private boolean g;
    private String h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    
    public bb() {
        this.a = me.a;
        this.b = uiztfzghuzt.m.DEFAULT;
        this.c = uiztfzghuzt.g.IDENTITY;
        this.d = new HashMap<Type, cb<?>>();
        this.e = new ArrayList<md>();
        this.f = new ArrayList<md>();
        this.g = false;
        this.i = 2;
        this.j = 2;
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
    }
    
    public bb a() {
        this.n = true;
        return this;
    }
    
    public ab b() {
        final ArrayList<Object> list = new ArrayList<Object>(this.e.size() + this.f.size() + 3);
        list.addAll(this.e);
        Collections.reverse(list);
        Collections.reverse(this.f);
        list.addAll(this.f);
        this.a(this.h, this.i, this.j, (List<md>)list);
        return new ab(this.a, this.c, this.d, this.g, this.k, this.o, this.m, this.n, this.p, this.l, this.b, (List<md>)list);
    }
    
    private void a(final String s, final int n, final int n2, final List<md> list) {
        ob ob = null;
        ob ob2 = null;
        ob ob3 = null;
        Label_0116: {
            Label_0059: {
                try {
                    if (s == null || "".equals(s.trim())) {
                        break Label_0059;
                    }
                }
                catch (kg kg) {
                    throw kg;
                }
                ob = new ob(Date.class, s);
                ob2 = new ob(Timestamp.class, s);
                ob3 = new ob(java.sql.Date.class, s);
                break Label_0116;
                try {
                    if (n == 2 || n2 == 2) {
                        return;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            ob = new ob(Date.class, n, n2);
            ob2 = new ob(Timestamp.class, n, n2);
            ob3 = new ob(java.sql.Date.class, n, n2);
        }
        list.add(rf.a(Date.class, ob));
        list.add(rf.a(Timestamp.class, (nb<Timestamp>)ob2));
        list.add(rf.a(java.sql.Date.class, (nb<java.sql.Date>)ob3));
    }
}
