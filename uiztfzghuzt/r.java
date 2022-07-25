// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.math.BigDecimal;

public final class r extends Number
{
    private final String a;
    
    public r(final String a) {
        this.a = a;
    }
    
    @Override
    public int intValue() {
        try {
            return Integer.parseInt(this.a);
        }
        catch (NumberFormatException ex) {
            try {
                return (int)Long.parseLong(this.a);
            }
            catch (NumberFormatException ex2) {
                return new BigDecimal(this.a).intValue();
            }
        }
    }
    
    @Override
    public long longValue() {
        try {
            return Long.parseLong(this.a);
        }
        catch (NumberFormatException ex) {
            return new BigDecimal(this.a).longValue();
        }
    }
    
    @Override
    public float floatValue() {
        return Float.parseFloat(this.a);
    }
    
    @Override
    public double doubleValue() {
        return Double.parseDouble(this.a);
    }
    
    @Override
    public String toString() {
        return this.a;
    }
    
    private Object writeReplace() {
        return new BigDecimal(this.a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        final int b = xd.b;
        boolean b2 = false;
        Label_0091: {
            Label_0021: {
                Label_0020: {
                    try {
                        final Object o2 = this;
                        if (b != 0) {
                            break Label_0021;
                        }
                        final Object o3 = o;
                        if (this == o3) {
                            return true;
                        }
                        break Label_0020;
                    }
                    catch (NumberFormatException ex) {
                        throw ex;
                    }
                    try {
                        final Object o3 = o;
                        if (this == o3) {
                            return true;
                        }
                    }
                    catch (NumberFormatException ex2) {
                        throw ex2;
                    }
                }
                final Object o2 = o;
                try {
                    b2 = (o2 instanceof r);
                    if (b != 0) {
                        return b2;
                    }
                    if (!b2) {
                        break Label_0091;
                    }
                }
                catch (NumberFormatException ex3) {
                    throw ex3;
                }
            }
            final r r = (r)o;
            boolean equals = false;
            Label_0085: {
                Label_0089: {
                    Label_0071: {
                        String s2 = null;
                        String anObject = null;
                        Label_0059: {
                            String s;
                            String s3;
                            try {
                                s = (s2 = this.a);
                                s3 = (anObject = r.a);
                                if (b != 0) {
                                    break Label_0071;
                                }
                                if (s != s3) {
                                    break Label_0059;
                                }
                                break Label_0085;
                            }
                            catch (NumberFormatException ex4) {
                                throw ex4;
                            }
                            try {
                                if (s == s3) {
                                    break Label_0085;
                                }
                                s2 = this.a;
                                anObject = r.a;
                            }
                            catch (NumberFormatException ex5) {
                                throw ex5;
                            }
                        }
                        try {
                            equals = s2.equals(anObject);
                            if (b != 0) {
                                return equals;
                            }
                            if (!equals) {
                                break Label_0089;
                            }
                        }
                        catch (NumberFormatException ex6) {
                            throw ex6;
                        }
                    }
                    break Label_0085;
                }
                return equals;
            }
            return equals;
        }
        return b2;
    }
}
