// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class uf implements md
{
    final Class a;
    final nb b;
    private static final String[] z;
    
    uf(final Class a, final nb b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public <T> nb<T> a(final ab ab, final ag<T> ag) {
        try {
            if (ag.a() == this.a) {
                final nb b = this.b;
                return (nb<T>)b;
            }
        }
        catch (kg kg) {
            throw kg;
        }
        final nb b = null;
        return (nb<T>)b;
    }
    
    @Override
    public String toString() {
        return "Factory[type=" + this.a.getName() + ",adapter=" + this.b + "]";
    }
    
    static {
        final String[] array = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "\\\u0006&OV\u0004\u00020\u0013";
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
                                c2 = 'p';
                                break;
                            }
                            case 1: {
                                c2 = 'g';
                                break;
                            }
                            case 2: {
                                c2 = 'B';
                                break;
                            }
                            case 3: {
                                c2 = '.';
                                break;
                            }
                            default: {
                                c2 = '&';
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
                    s = "6\u0006!ZI\u0002\u001e\u0019Z_\u0000\u0002\u007f";
                    n3 = 0;
                    continue Label_0062_Outer;
                }
                case 0: {
                    break Label_0062_Outer;
                }
            }
        }
        array[n] = intern;
        z = new String[] { ",adapter=", "Factory[type=" };
    }
}
