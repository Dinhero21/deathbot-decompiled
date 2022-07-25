// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

public enum q
{
    SOCKS4("SOCKS4", 0), 
    SOCKS5("SOCKS5", 1), 
    HTTPS("HTTPS", 2);
    
    private static final q[] a;
    private static final String[] z;
    
    static {
        final String[] array = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "\u0001\u0004dv\u0015g";
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
                                c2 = 'R';
                                break;
                            }
                            case 1: {
                                c2 = 'K';
                                break;
                            }
                            case 2: {
                                c2 = '\'';
                                break;
                            }
                            case 3: {
                                c2 = '=';
                                break;
                            }
                            default: {
                                c2 = 'F';
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
                    s = "\u001a\u001fsm\u0015";
                    n4 = 0;
                    continue Label_0077_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "\u0001\u0004dv\u0015f";
                    n4 = 1;
                    continue Label_0077_Outer;
                }
                case 1: {
                    break Label_0077_Outer;
                }
            }
        }
        array[n3] = intern;
        z = new String[] { "SOCKS5", "HTTPS", "SOCKS4" };
        a = new q[] { q.SOCKS4, q.SOCKS5, q.HTTPS };
    }
    
    private q(final String name, final int ordinal) {
    }
}
