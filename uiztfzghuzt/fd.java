// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class fd extends nb<Boolean>
{
    private static final String z = "null";
    
    @Override
    public Boolean a(final bg bg) {
        Label_0020: {
            try {
                final bg bg2 = bg;
                if (rf.ab) {
                    return Boolean.valueOf(bg2.l());
                }
                final p p = bg.g();
                final p p2 = uiztfzghuzt.p.NULL;
                if (p == p2) {
                    break Label_0020;
                }
                break Label_0020;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final p p = bg.g();
                final p p2 = uiztfzghuzt.p.NULL;
                if (p == p2) {
                    bg.n();
                    return null;
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        final bg bg2 = bg;
        return Boolean.valueOf(bg2.l());
    }
    
    @Override
    public void a(final dg dg, final Boolean b) {
        String string = null;
        Label_0025: {
            Boolean b2 = null;
            Label_0022: {
                Label_0015: {
                    try {
                        b2 = b;
                        if (rf.ab) {
                            break Label_0022;
                        }
                        if (b == null) {
                            break Label_0015;
                        }
                        break Label_0015;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        if (b == null) {
                            string = "null";
                            break Label_0025;
                        }
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                b2 = b;
            }
            string = b2.toString();
        }
        dg.b(string);
    }
    
    static {
        final char[] charArray = "\u001a\u000eN\u0001".toCharArray();
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
                            c2 = 't';
                            break;
                        }
                        case 1: {
                            c2 = '{';
                            break;
                        }
                        case 2: {
                            c2 = '\"';
                            break;
                        }
                        case 3: {
                            c2 = 'm';
                            break;
                        }
                        default: {
                            c2 = 'C';
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
