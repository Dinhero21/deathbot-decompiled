// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import java.util.Iterator;
import uiztfzghuzt.kg;
import java.util.ArrayList;

public class i
{
    Bot a;
    private ArrayList<Thread> b;
    
    public i(final Bot a) {
        this.a = a;
        this.b = new ArrayList<Thread>();
    }
    
    public void a() {
        ArrayList<Thread> list = null;
    Label_0026_Outer:
        while (true) {
            final boolean l = j.l;
            final Iterator<Thread> iterator = this.b.iterator();
            while (true) {
                while (true) {
                    Label_0034: {
                        Object o;
                        try {
                            if (!l) {
                                break Label_0034;
                            }
                            o = iterator.next();
                        }
                        catch (kg kg) {
                            throw kg;
                        }
                        ((Thread)o).stop();
                    }
                    if (iterator.hasNext()) {
                        continue Label_0026_Outer;
                    }
                    break;
                }
                Object o;
                list = (ArrayList<Thread>)(o = this.b);
                if (!l) {
                    break;
                }
                continue;
            }
        }
        list.clear();
    }
    
    public void a(final g g) {
        final boolean l = j.l;
        this.a.d().a(g.r());
        int n = 0;
        while (true) {
            Label_0051: {
                if (!l) {
                    break Label_0051;
                }
                final gb e = new gb(g);
                this.b.add(e);
                e.start();
                ++n;
            }
            if (n >= g.c()) {
                return;
            }
            continue;
        }
    }
}
