// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Type;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;

final class ud implements GenericArrayType, Serializable
{
    private final Type a;
    private static final long serialVersionUID = 0L;
    private static final String z = "[]";
    
    public ud(final Type type) {
        this.a = td.d(type);
    }
    
    @Override
    public Type getGenericComponentType() {
        return this.a;
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
                    b2 = (a = (b3 = (o instanceof GenericArrayType)));
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
        return this.a.hashCode();
    }
    
    @Override
    public String toString() {
        return td.f(this.a) + "[]";
    }
    
    static {
        final char[] charArray = "Ka".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0106: {
                if (n > 1) {
                    break Label_0106;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '\u0010';
                            break;
                        }
                        case 1: {
                            c2 = '<';
                            break;
                        }
                        case 2: {
                            c2 = 'h';
                            break;
                        }
                        case 3: {
                            c2 = '\u0015';
                            break;
                        }
                        default: {
                            c2 = '\u0007';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
