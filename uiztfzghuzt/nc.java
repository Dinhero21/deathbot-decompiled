// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class nc extends nb<Character>
{
    private static final String z = "Expecting character, got: ";
    
    @Override
    public Character a(final bg bg) {
        final boolean ab = rf.ab;
        bg bg2 = null;
        Label_0030: {
            Label_0022: {
                try {
                    bg2 = bg;
                    if (ab) {
                        break Label_0030;
                    }
                    final p p = bg.g();
                    final p p2 = uiztfzghuzt.p.NULL;
                    if (p == p2) {
                        break Label_0022;
                    }
                    break Label_0022;
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
            bg2 = bg;
        }
        final String l = bg2.l();
        Label_0050: {
            int n;
            try {
                final int n2;
                n = (n2 = l.length());
                if (ab) {
                    return (char)n2;
                }
                final int n3 = 1;
                if (n != n3) {
                    break Label_0050;
                }
                break Label_0050;
            }
            catch (kg kg3) {
                throw kg3;
            }
            try {
                final int n3 = 1;
                if (n != n3) {
                    throw new kg("Expecting character, got: " + l);
                }
            }
            catch (kg kg4) {
                throw kg4;
            }
        }
        int n2 = l.charAt(0);
        return (char)n2;
    }
    
    @Override
    public void a(final dg dg, final Character c) {
        String value = null;
        Label_0024: {
            Character obj = null;
            Label_0021: {
                Label_0015: {
                    try {
                        obj = c;
                        if (rf.ab) {
                            break Label_0021;
                        }
                        if (c == null) {
                            break Label_0015;
                        }
                        break Label_0015;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        if (c == null) {
                            value = null;
                            break Label_0024;
                        }
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                obj = c;
            }
            value = String.valueOf(obj);
        }
        dg.b(value);
    }
    
    static {
        final char[] charArray = "WCmn\rfRslNqS|y\u000fqOxyB2\\r\u007fT2".toCharArray();
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
                            c2 = '\u0012';
                            break;
                        }
                        case 1: {
                            c2 = ';';
                            break;
                        }
                        case 2: {
                            c2 = '\u001d';
                            break;
                        }
                        case 3: {
                            c2 = '\u000b';
                            break;
                        }
                        default: {
                            c2 = 'n';
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
