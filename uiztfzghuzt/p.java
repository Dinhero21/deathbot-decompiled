// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

public enum p
{
    BEGIN_ARRAY, 
    END_ARRAY, 
    BEGIN_OBJECT, 
    END_OBJECT, 
    NAME, 
    STRING, 
    NUMBER, 
    BOOLEAN, 
    NULL, 
    END_DOCUMENT;
    
    private static final String[] z;
    
    static {
        final String[] array = new String[10];
        int n10;
        int n9;
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 0))))))));
        String s = "ZKS8\bMWV>";
        int n11 = -1;
        String intern = null;
    Label_0190_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n13;
            final int n12 = n13 = (length = charArray.length);
            int n14 = 0;
            while (true) {
                Label_0265: {
                    if (n12 > 1) {
                        break Label_0265;
                    }
                    length = (n13 = n14);
                    do {
                        final char c = charArray[n13];
                        char c2 = '\0';
                        switch (n14 % 5) {
                            case 0: {
                                c2 = '\u001f';
                                break;
                            }
                            case 1: {
                                c2 = '\u0005';
                                break;
                            }
                            case 2: {
                                c2 = '\u0017';
                                break;
                            }
                            case 3: {
                                c2 = 'g';
                                break;
                            }
                            default: {
                                c2 = 'I';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n14;
                    } while (n12 == 0);
                }
                if (n12 > n14) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n11) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 1)))))))));
                    s = "ZKS8\u0006]OR$\u001d";
                    n11 = 0;
                    continue Label_0190_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 2)))))))));
                    s = "]JX+\f^K";
                    n11 = 1;
                    continue Label_0190_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 3)))))))));
                    s = "LQE.\u0007X";
                    n11 = 2;
                    continue Label_0190_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 4)))))))));
                    s = "ZKS8\rPFB*\fQQ";
                    n11 = 3;
                    continue Label_0190_Outer;
                }
                case 3: {
                    array[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 5)))))))));
                    s = "QPZ%\fM";
                    n11 = 4;
                    continue Label_0190_Outer;
                }
                case 4: {
                    array[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 6)))))))));
                    s = "]@P.\u0007@DE5\bF";
                    n11 = 5;
                    continue Label_0190_Outer;
                }
                case 5: {
                    array[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 7)))))))));
                    s = "QP[+";
                    n11 = 6;
                    continue Label_0190_Outer;
                }
                case 6: {
                    array[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 8)))))))));
                    s = "QDZ\"";
                    n11 = 7;
                    continue Label_0190_Outer;
                }
                case 7: {
                    array[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 9)))))))));
                    s = "]@P.\u0007@JU-\f\\Q";
                    n11 = 8;
                    continue Label_0190_Outer;
                }
                case 8: {
                    break Label_0190_Outer;
                }
            }
        }
        array[n10] = intern;
        z = new String[] { "END_ARRAY", "END_OBJECT", "BOOLEAN", "STRING", "END_DOCUMENT", "NUMBER", "BEGIN_ARRAY", "NULL", "NAME", "BEGIN_OBJECT" };
    }
}
