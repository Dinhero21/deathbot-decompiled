// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

public class x extends w
{
    private static final String z = "1.7.0-1.7.5";
    
    public x(final String s, final ab ab, final g g) {
        super(s, ab, g);
    }
    
    @Override
    public String toString() {
        return "1.7.0-1.7.5";
    }
    
    static {
        final char[] charArray = "'S]\u001e\";LD\u0007<#".toCharArray();
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
                            c2 = '\u0016';
                            break;
                        }
                        case 1: {
                            c2 = '}';
                            break;
                        }
                        case 2: {
                            c2 = 'j';
                            break;
                        }
                        case 3: {
                            c2 = '0';
                            break;
                        }
                        default: {
                            c2 = '\u0012';
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
