// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.kg;
import uiztfzghuzt.nb;

public enum b
{
    NONE("NONE", 0), 
    SOCKS("SOCKS", 1), 
    HTTP("HTTP", 2), 
    BOTH("BOTH", 3);
    
    public static boolean b;
    private static final String[] z;
    
    static {
        final String[] array = new String[4];
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = 0));
        String s = "\u001a\u007f!g";
        int n5 = -1;
        String intern = null;
    Label_0092_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n7;
            final int n6 = n7 = (length = charArray.length);
            int n8 = 0;
            while (true) {
                Label_0166: {
                    if (n6 > 1) {
                        break Label_0166;
                    }
                    length = (n7 = n8);
                    do {
                        final char c = charArray[n7];
                        char c2 = '\0';
                        switch (n8 % 5) {
                            case 0: {
                                c2 = 'X';
                                break;
                            }
                            case 1: {
                                c2 = '0';
                                break;
                            }
                            case 2: {
                                c2 = 'u';
                                break;
                            }
                            case 3: {
                                c2 = '/';
                                break;
                            }
                            default: {
                                c2 = 'b';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n8;
                    } while (n6 == 0);
                }
                if (n6 > n8) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n5) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = 1)));
                    s = "\u0016\u007f;j";
                    n5 = 0;
                    continue Label_0092_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = 2)));
                    s = "\u000b\u007f6d1";
                    n5 = 1;
                    continue Label_0092_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = 3)));
                    s = "\u0010d!\u007f";
                    n5 = 2;
                    continue Label_0092_Outer;
                }
                case 2: {
                    break Label_0092_Outer;
                }
            }
        }
        array[n4] = intern;
        z = new String[] { "BOTH", "NONE", "SOCKS", "HTTP" };
        a = new b[] { de.me.death.b.NONE, de.me.death.b.SOCKS, de.me.death.b.HTTP, de.me.death.b.BOTH };
    }
    
    private b(final String name, final int ordinal) {
    }
}
