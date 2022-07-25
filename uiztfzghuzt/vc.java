// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.net.URISyntaxException;
import java.net.URI;

final class vc extends nb<URI>
{
    private static final String z = "null";
    
    @Override
    public URI a(final bg bg) {
        Label_0027: {
            Label_0020: {
                try {
                    final bg bg2 = bg;
                    if (rf.ab) {
                        break Label_0027;
                    }
                    final p p = bg.g();
                    final p p2 = uiztfzghuzt.p.NULL;
                    if (p == p2) {
                        break Label_0020;
                    }
                    break Label_0027;
                }
                catch (URISyntaxException ex) {
                    throw ex;
                }
                try {
                    final p p = bg.g();
                    final p p2 = uiztfzghuzt.p.NULL;
                    if (p == p2) {
                        bg.n();
                        return null;
                    }
                }
                catch (URISyntaxException ex2) {
                    throw ex2;
                }
            }
            try {
                final bg bg2 = bg;
                final String l = bg2.l();
                try {
                    if ("null".equals(l)) {
                        return null;
                    }
                }
                catch (URISyntaxException ex3) {
                    throw ex3;
                }
                return new URI(l);
            }
            catch (URISyntaxException ex4) {
                throw new jg(ex4);
            }
        }
    }
    
    @Override
    public void a(final dg dg, final URI uri) {
        String asciiString = null;
        Label_0024: {
            URI uri2 = null;
            Label_0021: {
                Label_0015: {
                    try {
                        uri2 = uri;
                        if (rf.ab) {
                            break Label_0021;
                        }
                        if (uri == null) {
                            break Label_0015;
                        }
                        break Label_0015;
                    }
                    catch (jg jg) {
                        throw jg;
                    }
                    try {
                        if (uri == null) {
                            asciiString = null;
                            break Label_0024;
                        }
                    }
                    catch (jg jg2) {
                        throw jg2;
                    }
                }
                uri2 = uri;
            }
            asciiString = uri2.toASCIIString();
        }
        dg.b(asciiString);
    }
    
    static {
        final char[] charArray = "6[\u0013C".toCharArray();
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
                            c2 = 'X';
                            break;
                        }
                        case 1: {
                            c2 = '.';
                            break;
                        }
                        case 2: {
                            c2 = '\u007f';
                            break;
                        }
                        case 3: {
                            c2 = '/';
                            break;
                        }
                        default: {
                            c2 = '#';
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
