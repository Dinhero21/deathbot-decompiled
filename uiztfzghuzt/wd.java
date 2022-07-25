// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Type;
import java.io.Serializable;
import java.lang.reflect.WildcardType;

final class wd implements WildcardType, Serializable
{
    private final Type a;
    private final Type b;
    private static final long serialVersionUID = 0L;
    private static final String[] z;
    
    public wd(final Type[] array, final Type[] array2) {
        boolean b;
        if (array2.length <= 1) {
            b = true;
        }
        else {
            b = false;
        }
        Label_0092: {
            boolean b3 = false;
            Label_0070: {
                Label_0064: {
                    Label_0030: {
                        try {
                            sd.a(b);
                            if (array.length == 1) {
                                final boolean b2 = true;
                                break Label_0030;
                            }
                        }
                        catch (kg kg) {
                            throw kg;
                        }
                        final boolean b2 = false;
                        try {
                            sd.a(b2);
                            if (array2.length != 1) {
                                break Label_0092;
                            }
                            final Type[] array3 = array2;
                            final int n = 0;
                            final Type type = array3[n];
                            sd.a(type);
                            final Type[] array4 = array2;
                            final int n2 = 0;
                            final Type type2 = array4[n2];
                            td.h(type2);
                            final Type[] array5 = array;
                            final int n3 = 0;
                            final Type type3 = array5[n3];
                            final Class<Object> clazz = Object.class;
                            if (type3 == clazz) {
                                break Label_0064;
                            }
                            break Label_0064;
                        }
                        catch (kg kg2) {
                            throw kg2;
                        }
                    }
                    try {
                        final Type[] array3 = array2;
                        final int n = 0;
                        final Type type = array3[n];
                        sd.a(type);
                        final Type[] array4 = array2;
                        final int n2 = 0;
                        final Type type2 = array4[n2];
                        td.h(type2);
                        final Type[] array5 = array;
                        final int n3 = 0;
                        final Type type3 = array5[n3];
                        final Class<Object> clazz = Object.class;
                        if (type3 == clazz) {
                            b3 = true;
                            break Label_0070;
                        }
                    }
                    catch (kg kg3) {
                        throw kg3;
                    }
                }
                b3 = false;
            }
            sd.a(b3);
            this.b = td.d(array2[0]);
            this.a = Object.class;
            return;
        }
        sd.a(array[0]);
        td.h(array[0]);
        this.b = null;
        this.a = td.d(array[0]);
    }
    
    @Override
    public Type[] getUpperBounds() {
        return new Type[] { this.a };
    }
    
    @Override
    public Type[] getLowerBounds() {
        try {
            if (this.b != null) {
                return new Type[] { this.b };
            }
        }
        catch (kg kg) {
            throw kg;
        }
        return td.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        final int b = xd.b;
        Label_0031: {
            boolean b3 = false;
            boolean a = false;
            Label_0019: {
                boolean b2;
                try {
                    b2 = (a = (b3 = (o instanceof WildcardType)));
                    if (b != 0) {
                        break Label_0031;
                    }
                    if (b2) {
                        break Label_0019;
                    }
                    return false;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (!b2) {
                        return false;
                    }
                    b3 = (a = td.a(this, (Type)o));
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            try {
                if (b != 0) {
                    return b3;
                }
                if (!a) {
                    return false;
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
        }
        return true;
        b3 = false;
        return b3;
    }
    
    @Override
    public int hashCode() {
        try {
            if (this.b != null) {
                final int n = 31 + this.b.hashCode();
                return n ^ 31 + this.a.hashCode();
            }
        }
        catch (kg kg) {
            throw kg;
        }
        final int n = 1;
        return n ^ 31 + this.a.hashCode();
    }
    
    @Override
    public String toString() {
        Label_0048: {
            Label_0017: {
                Type type;
                try {
                    final Type type2;
                    type = (type2 = this.b);
                    if (xd.b != 0) {
                        break Label_0048;
                    }
                    if (type != null) {
                        break Label_0017;
                    }
                    break Label_0017;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (type != null) {
                        return "? super " + td.f(this.b);
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            Type type2 = this.a;
            try {
                if (type2 == Object.class) {
                    return "?";
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
        }
        return "? extends " + td.f(this.a);
    }
    
    static {
        final String[] array = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "/B\rBau\f\fI5";
        int n3 = -1;
        String intern = null;
    Label_0062_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n5;
            final int n4 = n5 = (length = charArray.length);
            int n6 = 0;
            while (true) {
                Label_0138: {
                    if (n4 > 1) {
                        break Label_0138;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = '\u0010';
                                break;
                            }
                            case 1: {
                                c2 = 'b';
                                break;
                            }
                            case 2: {
                                c2 = 'h';
                                break;
                            }
                            case 3: {
                                c2 = ':';
                                break;
                            }
                            default: {
                                c2 = '\u0015';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n6;
                    } while (n4 == 0);
                }
                if (n4 > n6) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    array[n2] = intern;
                    n = (n2 = 1);
                    s = "/B\u001bOeu\u0010H";
                    n3 = 0;
                    continue Label_0062_Outer;
                }
                case 0: {
                    break Label_0062_Outer;
                }
            }
        }
        array[n] = intern;
        z = new String[] { "? extends ", "? super " };
    }
}
