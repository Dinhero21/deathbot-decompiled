// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;

class fe implements ue<Object>
{
    final Constructor a;
    final xd b;
    private static final String[] z;
    
    fe(final xd b, final Constructor a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public Object a() {
        try {
            return this.a.newInstance((Object[])null);
        }
        catch (InstantiationException cause) {
            throw new RuntimeException("Failed to invoke " + this.a + " with no args", cause);
        }
        catch (InvocationTargetException ex) {
            throw new RuntimeException("Failed to invoke " + this.a + " with no args", ex.getTargetException());
        }
        catch (IllegalAccessException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    static {
        final String[] array = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "_).N{}h3M>p&1Mu|h";
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
                                c2 = '\u0019';
                                break;
                            }
                            case 1: {
                                c2 = 'H';
                                break;
                            }
                            case 2: {
                                c2 = 'G';
                                break;
                            }
                            case 3: {
                                c2 = '\"';
                                break;
                            }
                            default: {
                                c2 = '\u001e';
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
                    s = "9?.Vv9&(\u0002\u007fk/4";
                    n3 = 0;
                    continue Label_0062_Outer;
                }
                case 0: {
                    break Label_0062_Outer;
                }
            }
        }
        array[n] = intern;
        z = new String[] { "Failed to invoke ", " with no args" };
    }
}
