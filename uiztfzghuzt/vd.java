// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Arrays;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

final class vd implements ParameterizedType, Serializable
{
    private final Type a;
    private final Type b;
    private final Type[] c;
    private static final long serialVersionUID = 0L;
    private static final String z = ", ";
    
    public vd(final Type type, final Type type2, final Type... array) {
        if (type2 instanceof Class) {
            final Class clazz = (Class)type2;
            boolean b = false;
            Label_0046: {
                Label_0040: {
                    try {
                        if (Modifier.isStatic(clazz.getModifiers())) {
                            break Label_0040;
                        }
                        final Class clazz2 = clazz;
                        final Class clazz3 = clazz2.getEnclosingClass();
                        if (clazz3 == null) {
                            break Label_0040;
                        }
                        break Label_0040;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        final Class clazz2 = clazz;
                        final Class clazz3 = clazz2.getEnclosingClass();
                        if (clazz3 == null) {
                            b = true;
                            break Label_0046;
                        }
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                b = false;
            }
            final boolean b2 = b;
            boolean b4 = false;
            Label_0067: {
                Label_0061: {
                    try {
                        if (type != null) {
                            break Label_0061;
                        }
                        final boolean b3 = b2;
                        if (b3) {
                            break Label_0061;
                        }
                        break Label_0061;
                    }
                    catch (kg kg3) {
                        throw kg3;
                    }
                    try {
                        final boolean b3 = b2;
                        if (b3) {
                            b4 = true;
                            break Label_0067;
                        }
                    }
                    catch (kg kg4) {
                        throw kg4;
                    }
                }
                b4 = false;
            }
            sd.a(b4);
        }
        Type d = null;
        Label_0084: {
            try {
                if (type == null) {
                    d = null;
                    break Label_0084;
                }
            }
            catch (kg kg5) {
                throw kg5;
            }
            d = td.d(type);
        }
        this.a = d;
        this.b = td.d(type2);
        this.c = array.clone();
        int i = 0;
        final int length = this.c.length;
        try {
            while (i < length) {
                sd.a(this.c[i]);
                td.h(this.c[i]);
                this.c[i] = td.d(this.c[i]);
                ++i;
            }
        }
        catch (kg kg6) {
            throw kg6;
        }
    }
    
    @Override
    public Type[] getActualTypeArguments() {
        return this.c.clone();
    }
    
    @Override
    public Type getRawType() {
        return this.b;
    }
    
    @Override
    public Type getOwnerType() {
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
                    b2 = (a = (b3 = (o instanceof ParameterizedType)));
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
        return Arrays.hashCode(this.c) ^ this.b.hashCode() ^ td.a((Object)this.a);
    }
    
    @Override
    public String toString() {
        final int b = xd.b;
        final int length = this.c.length;
        try {
            if (length == 0) {
                return td.f(this.b);
            }
        }
        catch (kg kg) {
            throw kg;
        }
        final StringBuilder sb = new StringBuilder(30 * (length + 1));
        sb.append(td.f(this.b)).append("<").append(td.f(this.c[0]));
        int i = 1;
        while (i < length) {
            try {
                final StringBuilder sb2 = sb.append(", ").append(td.f(this.c[i]));
                if (b != 0) {
                    return sb2.toString();
                }
                ++i;
                if (b == 0) {
                    continue;
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
            break;
        }
        final StringBuilder sb2 = sb.append(">");
        return sb2.toString();
    }
    
    static {
        final char[] charArray = "!)".toCharArray();
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
                            c2 = '\r';
                            break;
                        }
                        case 1: {
                            c2 = '\t';
                            break;
                        }
                        case 2: {
                            c2 = '\u001f';
                            break;
                        }
                        case 3: {
                            c2 = '\u0010';
                            break;
                        }
                        default: {
                            c2 = '>';
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
