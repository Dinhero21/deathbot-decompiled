// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public abstract class xe
{
    private static final String[] z;
    
    public abstract <T> T a(final Class<T> p0);
    
    public static xe a() {
        try {
            final Class<?> forName = Class.forName("sun.misc.Unsafe");
            final Field declaredField = forName.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new ye(forName.getMethod("allocateInstance", Class.class), declaredField.get(null));
        }
        catch (Exception ex) {
            try {
                final Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int intValue = (int)declaredMethod.invoke(null, Object.class);
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new ze(declaredMethod2, intValue);
            }
            catch (Exception ex2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new af(declaredMethod3);
                }
                catch (Exception ex3) {
                    return new bf();
                }
            }
        }
    }
    
    static void b(final Class<?> clazz) {
        final int modifiers = clazz.getModifiers();
        Label_0057: {
            Label_0022: {
                boolean b;
                try {
                    final boolean b2;
                    b = (b2 = Modifier.isInterface(modifiers));
                    if (xd.b != 0) {
                        break Label_0057;
                    }
                    if (b) {
                        break Label_0022;
                    }
                    break Label_0022;
                }
                catch (UnsupportedOperationException ex) {
                    throw ex;
                }
                try {
                    if (b) {
                        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + clazz.getName());
                    }
                }
                catch (UnsupportedOperationException ex2) {
                    throw ex2;
                }
            }
            boolean b2 = Modifier.isAbstract(modifiers);
            try {
                if (b2) {
                    throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + clazz.getName());
                }
            }
            catch (UnsupportedOperationException ex3) {
                throw ex3;
            }
        }
    }
    
    static {
        final String[] array = new String[7];
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 0)))));
        String s = "\u0005^>n\u001c\u001fX3n$\u0018X1&\u0014";
        int n8 = -1;
        String intern = null;
    Label_0139_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n10;
            final int n9 = n10 = (length = charArray.length);
            int n11 = 0;
            while (true) {
                Label_0214: {
                    if (n9 > 1) {
                        break Label_0214;
                    }
                    length = (n10 = n11);
                    do {
                        final char c = charArray[n10];
                        char c2 = '\0';
                        switch (n11 % 5) {
                            case 0: {
                                c2 = 'v';
                                break;
                            }
                            case 1: {
                                c2 = '+';
                                break;
                            }
                            case 2: {
                                c2 = 'P';
                                break;
                            }
                            case 3: {
                                c2 = '@';
                                break;
                            }
                            default: {
                                c2 = 'q';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n11;
                    } while (n9 == 0);
                }
                if (n9 > n11) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n8) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 1))))));
                    s = "\u0002C5\u0015\u001f\u0005J6%";
                    n8 = 0;
                    continue Label_0139_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 2))))));
                    s = "\u0018N'\t\u001f\u0005_1.\u0012\u0013";
                    n8 = 1;
                    continue Label_0139_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 3))))));
                    s = "\u0017G</\u0012\u0017_5\t\u001f\u0005_1.\u0012\u0013";
                    n8 = 2;
                    continue Label_0139_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 4))))));
                    s = "\u0011N$\u0003\u001e\u0018X$2\u0004\u0015_?28\u0012";
                    n8 = 3;
                    continue Label_0139_Outer;
                }
                case 3: {
                    array[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 5))))));
                    s = "7I#4\u0003\u0017H$`\u0012\u001aJ#3Q\u0015J>g\u0005VI5`\u0018\u0018X$!\u001f\u0002B14\u0014\u0012\np\u0003\u001d\u0017X#`\u001f\u0017F5zQ";
                    n8 = 4;
                    continue Label_0139_Outer;
                }
                case 4: {
                    array[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 6))))));
                    s = "?E$%\u0003\u0010J3%Q\u0015J>g\u0005VI5`\u0018\u0018X$!\u001f\u0002B14\u0014\u0012\np\t\u001f\u0002N\"&\u0010\u0015Np.\u0010\u001bNj`";
                    n8 = 5;
                    continue Label_0139_Outer;
                }
                case 5: {
                    break Label_0139_Outer;
                }
            }
        }
        array[n7] = intern;
        z = new String[] { "sun.misc.Unsafe", "theUnsafe", "newInstance", "allocateInstance", "getConstructorId", "Abstract class can't be instantiated! Class name: ", "Interface can't be instantiated! Interface name: " };
    }
}
