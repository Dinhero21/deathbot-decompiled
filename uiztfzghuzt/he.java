// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.EnumSet;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

class he implements ue<Object>
{
    final Type a;
    final xd b;
    private static final String z = "Invalid EnumSet type: ";
    
    he(final xd b, final Type a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public Object a() {
        final int b = xd.b;
        Type a = null;
        Label_0022: {
            Type type;
            try {
                type = (a = this.a);
                if (b != 0) {
                    break Label_0022;
                }
                final boolean b2 = type instanceof ParameterizedType;
                if (b2) {
                    break Label_0022;
                }
                throw new jg("Invalid EnumSet type: " + this.a.toString());
            }
            catch (jg jg) {
                throw jg;
            }
            try {
                final boolean b2 = type instanceof ParameterizedType;
                if (!b2) {
                    throw new jg("Invalid EnumSet type: " + this.a.toString());
                }
                a = ((ParameterizedType)this.a).getActualTypeArguments()[0];
            }
            catch (jg jg2) {
                throw jg2;
            }
        }
        final Class<Enum> clazz = (Class<Enum>)a;
        Class<Enum> clazz3 = null;
        Label_0056: {
            Class<Enum> clazz2;
            try {
                clazz2 = (clazz3 = clazz);
                if (b != 0) {
                    return EnumSet.noneOf(clazz3);
                }
                final boolean b3 = clazz2 instanceof Class;
                if (b3) {
                    break Label_0056;
                }
                throw new jg("Invalid EnumSet type: " + this.a.toString());
            }
            catch (jg jg3) {
                throw jg3;
            }
            try {
                final boolean b3 = clazz2 instanceof Class;
                if (!b3) {
                    throw new jg("Invalid EnumSet type: " + this.a.toString());
                }
                clazz3 = clazz;
            }
            catch (jg jg4) {
                throw jg4;
            }
        }
        return EnumSet.noneOf(clazz3);
    }
    
    static {
        final char[] charArray = "\u0001N8h@!DnLB=M\u001dlXhT7yIr\u0000".toCharArray();
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
                            c2 = 'H';
                            break;
                        }
                        case 1: {
                            c2 = ' ';
                            break;
                        }
                        case 2: {
                            c2 = 'N';
                            break;
                        }
                        case 3: {
                            c2 = '\t';
                            break;
                        }
                        default: {
                            c2 = ',';
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
