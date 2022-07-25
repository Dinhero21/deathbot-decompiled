// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.kg;

public enum c
{
    NICKS("NICKS", 0), 
    RANDOM("RANDOM", 1), 
    FAKENICKS("FAKENICKS", 2);
    
    private static final String[] z;
    
    static {
        final String[] array = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "]P \u00163B";
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
                                c2 = '\u000f';
                                break;
                            }
                            case 1: {
                                c2 = '\u0011';
                                break;
                            }
                            case 2: {
                                c2 = 'n';
                                break;
                            }
                            case 3: {
                                c2 = 'R';
                                break;
                            }
                            default: {
                                c2 = '|';
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
                    s = "AX-\u0019/";
                    n4 = 0;
                    continue Label_0077_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "IP%\u00172FR%\u0001";
                    n4 = 1;
                    continue Label_0077_Outer;
                }
                case 1: {
                    break Label_0077_Outer;
                }
            }
        }
        array[n3] = intern;
        z = new String[] { "RANDOM", "NICKS", "FAKENICKS" };
        a = new c[] { c.NICKS, c.RANDOM, c.FAKENICKS };
    }
    
    private c(final String name, final int ordinal) {
    }
    
    public static c parse(final int n) {
        Label_0020: {
            Label_0014: {
                try {
                    final boolean b = n != 0;
                    if (de.me.death.b.b) {
                        break Label_0020;
                    }
                    if (n == 0) {
                        break Label_0014;
                    }
                    break Label_0014;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (n == 0) {
                        return c.RANDOM;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            final boolean b = n != 0;
            try {
                if (b) {
                    return c.NICKS;
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
        }
        return c.FAKENICKS;
    }
}
