// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class wf implements md
{
    final Class a;
    final Class b;
    final nb c;
    private static final String[] z;
    
    wf(final Class a, final Class b, final nb c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public <T> nb<T> a(final ab ab, final ag<T> ag) {
        final Class<? super T> a = ag.a();
        Label_0035: {
            Class<? super T> clazz2 = null;
            Class clazz4 = null;
            Label_0023: {
                Class<? super T> clazz;
                Class clazz3;
                try {
                    clazz = (clazz2 = a);
                    clazz3 = (clazz4 = this.a);
                    if (rf.ab) {
                        break Label_0035;
                    }
                    if (clazz != clazz3) {
                        break Label_0023;
                    }
                    break Label_0035;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (clazz == clazz3) {
                        break Label_0035;
                    }
                    clazz2 = a;
                    clazz4 = this.b;
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            try {
                if (clazz2 == clazz4) {
                    return (nb<T>)this.c;
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "Factory[type=" + this.a.getName() + "+" + this.b.getName() + ",adapter=" + this.c + "]";
    }
    
    static {
        final String[] array = new String[2];
        int n2;
        int n = n2 = 0;
        String s = ">on@*\nwV@<\bk0";
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
                                c2 = 'x';
                                break;
                            }
                            case 1: {
                                c2 = '\u000e';
                                break;
                            }
                            case 2: {
                                c2 = '\r';
                                break;
                            }
                            case 3: {
                                c2 = '4';
                                break;
                            }
                            default: {
                                c2 = 'E';
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
                    s = "ToiU5\fk\u007f\t";
                    n3 = 0;
                    continue Label_0062_Outer;
                }
                case 0: {
                    break Label_0062_Outer;
                }
            }
        }
        array[n] = intern;
        z = new String[] { "Factory[type=", ",adapter=" };
    }
}
