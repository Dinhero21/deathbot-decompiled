// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

public final class hb extends fb
{
    public static final hb b;
    
    @Override
    public int hashCode() {
        return hb.class.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        final int a = fb.a;
        boolean b = false;
        Label_0036: {
            Label_0040: {
                Label_0022: {
                    Object o2 = null;
                    Label_0017: {
                        try {
                            o2 = this;
                            if (a != 0) {
                                break Label_0022;
                            }
                            final Object o3 = o;
                            if (this != o3) {
                                break Label_0017;
                            }
                            break Label_0036;
                        }
                        catch (kg kg) {
                            throw kg;
                        }
                        try {
                            final Object o3 = o;
                            if (this == o3) {
                                break Label_0036;
                            }
                            o2 = o;
                        }
                        catch (kg kg2) {
                            throw kg2;
                        }
                    }
                    try {
                        b = (o2 instanceof hb);
                        if (a != 0) {
                            return b;
                        }
                        if (!b) {
                            break Label_0040;
                        }
                    }
                    catch (kg kg3) {
                        throw kg3;
                    }
                }
                break Label_0036;
            }
            return b;
        }
        return b;
    }
    
    static {
        b = new hb();
    }
}
