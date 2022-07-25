// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class hc extends nb<Class>
{
    private static final String[] z;
    
    @Override
    public void a(final dg dg, final Class clazz) {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + clazz.getName() + ". Forgot to register a type adapter?");
    }
    
    @Override
    public Class a(final bg bg) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }
    
    static {
        final String[] array = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "\u001b\u00040@\u0012*\u0004!A_.\u001fdA\u001a)\u00156L\u001e6\u0019>@_;P.D\t;^(D\u0011=^\u0007I\u001e)\u0003j\u000595\u0002#J\u000bz\u0004+\u0005\r?\u0017-V\u000b?\u0002dD_.\t4@_;\u0014%U\u000b?\u0002{";
        int n4 = -1;
        String intern = null;
    Label_0077_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n6;
            final int n5 = n6 = (length = charArray.length);
            int n7 = 0;
            while (true) {
                Label_0154: {
                    if (n5 > 1) {
                        break Label_0154;
                    }
                    length = (n6 = n7);
                    do {
                        final char c = charArray[n6];
                        char c2 = '\0';
                        switch (n7 % 5) {
                            case 0: {
                                c2 = 'Z';
                                break;
                            }
                            case 1: {
                                c2 = 'p';
                                break;
                            }
                            case 2: {
                                c2 = 'D';
                                break;
                            }
                            case 3: {
                                c2 = '%';
                                break;
                            }
                            default: {
                                c2 = '\u007f';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n7;
                    } while (n5 == 0);
                }
                if (n5 > n7) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n4) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = 1));
                    s = "\u001b\u00040@\u0012*\u0004!A_.\u001fdV\u001a(\u0019%I\u0016 \u0015dO\u001e,\u0011jI\u001e4\u0017jf\u0013;\u00037\u001f_";
                    n4 = 0;
                    continue Label_0077_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "tP\u0002J\r=\u001f0\u0005\u000b5P6@\u00183\u00030@\rz\u0011dQ\u0006*\u0015dD\u001b;\u00000@\re";
                    n4 = 1;
                    continue Label_0077_Outer;
                }
                case 1: {
                    break Label_0077_Outer;
                }
            }
        }
        array[n3] = intern;
        z = new String[] { "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?", "Attempted to serialize java.lang.Class: ", ". Forgot to register a type adapter?" };
    }
}
