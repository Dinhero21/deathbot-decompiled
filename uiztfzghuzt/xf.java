// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class xf implements md
{
    final Class a;
    final nb b;
    private static final String[] z;
    
    xf(final Class a, final nb b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public <T2> nb<T2> a(final ab ab, final ag<T2> ag) {
        final Class<? super T2> a = ag.a();
        try {
            if (!this.a.isAssignableFrom(a)) {
                return null;
            }
        }
        catch (kg kg) {
            throw kg;
        }
        return (nb<T2>)new ed(this, a);
    }
    
    @Override
    public String toString() {
        return "Factory[typeHierarchy=" + this.a.getName() + ",adapter=" + this.b + "]";
    }
    
    static {
        final String[] array = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "\u0013m?`<'u\u0007`*%i\u0014}6'm.w;,1";
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
                                c2 = 'U';
                                break;
                            }
                            case 1: {
                                c2 = '\f';
                                break;
                            }
                            case 2: {
                                c2 = '\\';
                                break;
                            }
                            case 3: {
                                c2 = '\u0014';
                                break;
                            }
                            default: {
                                c2 = 'S';
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
                    s = "ym8u#!i.)";
                    n3 = 0;
                    continue Label_0062_Outer;
                }
                case 0: {
                    break Label_0062_Outer;
                }
            }
        }
        array[n] = intern;
        z = new String[] { "Factory[typeHierarchy=", ",adapter=" };
    }
}
