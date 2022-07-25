// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.io.OutputStream;

final class d extends OutputStream
{
    private static final String z = "ByteStreams.nullOutputStream()";
    
    @Override
    public void write(final int n) {
    }
    
    @Override
    public void write(final byte[] array) {
        s.a(array);
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        s.a(array);
    }
    
    @Override
    public String toString() {
        return "ByteStreams.nullOutputStream()";
    }
    
    static {
        final char[] charArray = " Z\u0016EG\u0016Q\u0007Ay\u0011\r\fUx\u000el\u0017Td\u0017W1Tf\u0007B\u000f\b=".toCharArray();
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
                            c2 = 'b';
                            break;
                        }
                        case 1: {
                            c2 = '#';
                            break;
                        }
                        case 2: {
                            c2 = 'b';
                            break;
                        }
                        case 3: {
                            c2 = ' ';
                            break;
                        }
                        default: {
                            c2 = '\u0014';
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
