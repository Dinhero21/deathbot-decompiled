// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class mc extends nb<Number>
{
    private static final String z = "Expecting number, got: ";
    
    @Override
    public Number a(final bg bg) {
        final p g = bg.g();
        Label_0049: {
            try {
                if (rf.ab) {
                    return null;
                }
                final int[] array = yf.a;
                final p p = g;
                final int n = p.ordinal();
                final int n2 = array[n];
                switch (n2) {
                    case 4: {
                        break Label_0049;
                        break Label_0049;
                    }
                    case 1:
                    case 3: {
                        return new r(bg.l());
                    }
                    default: {
                        throw new kg("Expecting number, got: " + g);
                    }
                }
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final int[] array = yf.a;
                final p p = g;
                final int n = p.ordinal();
                final int n2 = array[n];
                switch (n2) {
                    case 4: {
                        bg.n();
                        break;
                    }
                    case 1:
                    case 3: {
                        return new r(bg.l());
                    }
                    default: {
                        throw new kg("Expecting number, got: " + g);
                    }
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        return null;
    }
    
    @Override
    public void a(final dg dg, final Number n) {
        dg.a(n);
    }
    
    static {
        final char[] charArray = "\u0001(d\u007f709z}t*%yx16|4};0j4".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0106: {
                if (n > 1) {
                    break Label_0106;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = 'D';
                            break;
                        }
                        case 1: {
                            c2 = 'P';
                            break;
                        }
                        case 2: {
                            c2 = '\u0014';
                            break;
                        }
                        case 3: {
                            c2 = '\u001a';
                            break;
                        }
                        default: {
                            c2 = 'T';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
