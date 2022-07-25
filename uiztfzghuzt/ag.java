// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ag<T>
{
    final Class<? super T> a;
    final Type b;
    final int c;
    public static int d;
    private static final String z = "Missing type parameter.";
    
    protected ag() {
        final int d = ag.d;
        this.b = a(this.getClass());
        this.a = (Class<? super T>)td.e(this.b);
        this.c = this.b.hashCode();
        if (d != 0) {
            boolean a = false;
            Label_0057: {
                try {
                    if (nb.a) {
                        a = false;
                        break Label_0057;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                a = true;
            }
            nb.a = a;
        }
    }
    
    ag(final Type type) {
        this.b = td.d(sd.a(type));
        this.a = (Class<? super T>)td.e(this.b);
        this.c = this.b.hashCode();
    }
    
    static Type a(final Class<?> clazz) {
        int d = ag.d;
        final Type genericSuperclass = clazz.getGenericSuperclass();
        Type type = null;
        Label_0036: {
            Label_0024: {
                ParameterizedType parameterizedType;
                try {
                    parameterizedType = (ParameterizedType)(type = genericSuperclass);
                    if (d != 0) {
                        break Label_0036;
                    }
                    final boolean b = parameterizedType instanceof Class;
                    if (b) {
                        break Label_0024;
                    }
                    break Label_0024;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = parameterizedType instanceof Class;
                    if (b) {
                        throw new RuntimeException("Missing type parameter.");
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            type = genericSuperclass;
        }
        final ParameterizedType parameterizedType2 = (ParameterizedType)type;
        Type d2;
        try {
            d2 = td.d(parameterizedType2.getActualTypeArguments()[0]);
            if (nb.a) {
                ag.d = ++d;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return d2;
    }
    
    public final Class<? super T> a() {
        return this.a;
    }
    
    public final Type b() {
        return this.b;
    }
    
    @Override
    public final int hashCode() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final int d = ag.d;
        Label_0037: {
            boolean b2 = false;
            boolean a = false;
            Label_0019: {
                boolean b;
                try {
                    b = (a = (b2 = (o instanceof ag)));
                    if (d != 0) {
                        break Label_0037;
                    }
                    if (b) {
                        break Label_0019;
                    }
                    return false;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (!b) {
                        return false;
                    }
                    b2 = (a = td.a(this.b, ((ag)o).b));
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (d != 0) {
                    return b2;
                }
                if (!a) {
                    return false;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        return true;
        b2 = false;
        return b2;
    }
    
    @Override
    public final String toString() {
        return td.f(this.b);
    }
    
    public static ag<?> a(final Type type) {
        return new ag<Object>(type);
    }
    
    public static <T> ag<T> b(final Class<T> clazz) {
        return new ag<T>(clazz);
    }
    
    static {
        final char[] charArray = ")T\"\u000b*\nZq\f:\u0014Xq\b\"\u0016\\<\u001d7\u0001O\u007f".toCharArray();
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
                            c2 = 'd';
                            break;
                        }
                        case 1: {
                            c2 = '=';
                            break;
                        }
                        case 2: {
                            c2 = 'Q';
                            break;
                        }
                        case 3: {
                            c2 = 'x';
                            break;
                        }
                        default: {
                            c2 = 'C';
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
