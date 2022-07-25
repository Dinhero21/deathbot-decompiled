// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class bf extends xe
{
    private static final String z = "Cannot allocate ";
    
    @Override
    public <T> T a(final Class<T> obj) {
        throw new UnsupportedOperationException("Cannot allocate " + obj);
    }
    
    static {
        final char[] charArray = "*?\u0007S\u0018\u001d~\bQ\u001b\u0006=\bI\u0012I".toCharArray();
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
                            c2 = 'i';
                            break;
                        }
                        case 1: {
                            c2 = '^';
                            break;
                        }
                        case 2: {
                            c2 = 'i';
                            break;
                        }
                        case 3: {
                            c2 = '=';
                            break;
                        }
                        default: {
                            c2 = 'w';
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
