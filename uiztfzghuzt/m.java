// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

public enum m
{
    DEFAULT("DEFAULT", 0) {
        n(final String s, final int n) {
        }
        
        @Override
        public fb serialize(final Long n) {
            return new jb(n);
        }
    }, 
    STRING("STRING", 1) {
        o(final String s, final int n) {
        }
        
        @Override
        public fb serialize(final Long obj) {
            return new jb(String.valueOf(obj));
        }
    };
    
    private static final m[] a;
    private static final String[] z;
    
    public abstract fb serialize(final Long p0);
    
    m(final String s, final int n, final n m) {
        this();
    }
    
    static {
        final String[] array = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "99n#T1(";
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
                Label_0137: {
                    if (n4 > 1) {
                        break Label_0137;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = '}';
                                break;
                            }
                            case 1: {
                                c2 = '|';
                                break;
                            }
                            case 2: {
                                c2 = '(';
                                break;
                            }
                            case 3: {
                                c2 = 'b';
                                break;
                            }
                            default: {
                                c2 = '\u0001';
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
                    s = ".(z+O:";
                    n3 = 0;
                    continue Label_0062_Outer;
                }
                case 0: {
                    break Label_0062_Outer;
                }
            }
        }
        array[n] = intern;
        z = new String[] { "DEFAULT", "STRING" };
        a = new m[] { m.DEFAULT, m.STRING };
    }
}
