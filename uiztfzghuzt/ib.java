// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Map;
import java.util.Set;

public final class ib extends fb
{
    private final mg<String, fb> b;
    
    public ib() {
        this.b = new mg<String, fb>();
    }
    
    public void a(final String s, fb b) {
        Label_0018: {
            try {
                final fb fb = b;
                if (uiztfzghuzt.fb.a != 0) {
                    return;
                }
                if (fb != null) {
                    break Label_0018;
                }
            }
            catch (kg kg) {
                throw kg;
            }
            b = hb.b;
        }
        this.b.put(s, b);
    }
    
    public void a(final String s, final String s2) {
        this.a(s, this.a((Object)s2));
    }
    
    public void a(final String s, final Number n) {
        this.a(s, this.a(n));
    }
    
    public void a(final String s, final Boolean b) {
        this.a(s, this.a(b));
    }
    
    private fb a(final Object o) {
        try {
            if (o == null) {
                return hb.b;
            }
        }
        catch (kg kg) {
            throw kg;
        }
        return new jb(o);
    }
    
    public Set<Map.Entry<String, fb>> a() {
        return this.b.entrySet();
    }
    
    public boolean a(final String s) {
        return this.b.containsKey(s);
    }
    
    public fb b(final String s) {
        return this.b.get(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        final int a = fb.a;
        Label_0054: {
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
                            final ib ib = this;
                            if (o != ib) {
                                break Label_0017;
                            }
                            return true;
                        }
                        catch (kg kg) {
                            throw kg;
                        }
                        try {
                            final ib ib = this;
                            if (o == ib) {
                                return true;
                            }
                            o2 = o;
                        }
                        catch (kg kg2) {
                            throw kg2;
                        }
                    }
                    try {
                        b = (equals = (b2 = (o2 instanceof ib)));
                        if (a != 0) {
                            break Label_0054;
                        }
                        if (b) {
                            break Label_0036;
                        }
                        return false;
                    }
                    catch (kg kg3) {
                        throw kg3;
                    }
                }
                try {
                    if (!b) {
                        return false;
                    }
                    b2 = (equals = ((ib)o).b.equals(this.b));
                }
                catch (kg kg4) {
                    throw kg4;
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
            catch (kg kg5) {
                throw kg5;
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
