// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public final class gb extends fb implements Iterable<fb>
{
    private final List<fb> b;
    
    public gb() {
        this.b = new ArrayList<fb>();
    }
    
    public void a(fb b) {
        Label_0018: {
            try {
                if (fb.a != 0) {
                    return;
                }
                if (b != null) {
                    break Label_0018;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            b = hb.b;
        }
        this.b.add(b);
    }
    
    public int a() {
        return this.b.size();
    }
    
    @Override
    public Iterator<fb> iterator() {
        return this.b.iterator();
    }
    
    public fb a(final int n) {
        return this.b.get(n);
    }
    
    @Override
    public String h() {
        fb fb = null;
        Label_0023: {
            List<fb> list;
            try {
                list = (List<fb>)(fb = (fb)this.b);
                if (uiztfzghuzt.fb.a != 0) {
                    return fb.h();
                }
                final int n = list.size();
                final int n2 = 1;
                if (n == n2) {
                    break Label_0023;
                }
                throw new IllegalStateException();
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final int n = list.size();
                final int n2 = 1;
                if (n != n2) {
                    throw new IllegalStateException();
                }
                fb = this.b.get(0);
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        return fb.h();
    }
    
    @Override
    public boolean equals(final Object o) {
        final int a = fb.a;
        Label_0056: {
            boolean b2 = false;
            boolean equals = false;
            Label_0036: {
                boolean b = false;
                Label_0022: {
                    Object o2 = null;
                    Label_0017: {
                        try {
                            o2 = o;
                            if (a != 0) {
                                break Label_0022;
                            }
                            final gb gb = this;
                            if (o != gb) {
                                break Label_0017;
                            }
                            return true;
                        }
                        catch (IllegalStateException ex) {
                            throw ex;
                        }
                        try {
                            final gb gb = this;
                            if (o == gb) {
                                return true;
                            }
                            o2 = o;
                        }
                        catch (IllegalStateException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        b = (equals = (b2 = (o2 instanceof gb)));
                        if (a != 0) {
                            break Label_0056;
                        }
                        if (b) {
                            break Label_0036;
                        }
                        return false;
                    }
                    catch (IllegalStateException ex3) {
                        throw ex3;
                    }
                }
                try {
                    if (!b) {
                        return false;
                    }
                    b2 = (equals = ((gb)o).b.equals(this.b));
                }
                catch (IllegalStateException ex4) {
                    throw ex4;
                }
            }
            try {
                if (a != 0) {
                    return b2;
                }
                if (!equals) {
                    return false;
                }
            }
            catch (IllegalStateException ex5) {
                throw ex5;
            }
        }
        return true;
        return false;
        b2 = true;
        return b2;
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
}
