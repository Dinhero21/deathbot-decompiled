// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.net.URL;

final class uc extends nb<URL>
{
    private static final String z = "null";
    
    @Override
    public URL a(final bg bg) {
        bg bg2 = null;
        Label_0028: {
            Label_0020: {
                try {
                    bg2 = bg;
                    if (rf.ab) {
                        break Label_0028;
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
            bg2 = bg;
        }
        final String l = bg2.l();
        try {
            if ("null".equals(l)) {
                return null;
            }
        }
        catch (kg kg3) {
            throw kg3;
        }
        return new URL(l);
    }
    
    @Override
    public void a(final dg dg, final URL url) {
        String externalForm = null;
        Label_0024: {
            URL url2 = null;
            Label_0021: {
                Label_0015: {
                    try {
                        url2 = url;
                        if (rf.ab) {
                            break Label_0021;
                        }
                        if (url == null) {
                            break Label_0015;
                        }
                        break Label_0015;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        if (url == null) {
                            externalForm = null;
                            break Label_0024;
                        }
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                url2 = url;
            }
            externalForm = url2.toExternalForm();
        }
        dg.b(externalForm);
    }
    
    static {
        final char[] charArray = "fpV\r".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0105: {
                if (n > 1) {
                    break Label_0105;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '\b';
                            break;
                        }
                        case 1: {
                            c2 = '\u0005';
                            break;
                        }
                        case 2: {
                            c2 = ':';
                            break;
                        }
                        case 3: {
                            c2 = 'a';
                            break;
                        }
                        default: {
                            c2 = '\u0007';
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
