// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import java.net.Socket;
import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.security.Key;
import javax.crypto.Cipher;
import java.security.PrivateKey;
import java.net.InetAddress;
import uiztfzghuzt.gg;

public class z
{
    private gg a;
    private static final String[] z;
    
    public boolean a(final InetAddress inetAddress, final int n) {
        return false;
    }
    
    public String a() {
        return "Bot | v4";
    }
    
    public void a(final g g, final long n) {
    }
    
    public cb a(final double n) {
        throw new IllegalStateException();
    }
    
    private static byte[] a(final PrivateKey key, final byte[] input) {
        final Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        instance.init(2, key);
        return instance.doFinal(input);
    }
    
    private KeyPair b() {
        final KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
        instance.initialize(1024);
        return instance.genKeyPair();
    }
    
    private synchronized Socket c() {
        throw new IllegalStateException();
    }
    
    static {
        final String[] array = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "m\u0002x^2\u0001\u0001~^$\u0001\u0019\u007fP3DM~Fa@\u00037P3S\u0002e\u0019aQ\u0001rT2DMtZ/U\ftAae\bvA)c\u0002c\u0015.OMcB(U\u0019rG`";
        int n6 = -1;
        String intern = null;
    Label_0107_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0182: {
                    if (n7 > 1) {
                        break Label_0182;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = '!';
                                break;
                            }
                            case 1: {
                                c2 = 'm';
                                break;
                            }
                            case 2: {
                                c2 = '\u0017';
                                break;
                            }
                            case 3: {
                                c2 = '5';
                                break;
                            }
                            default: {
                                c2 = 'A';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n9;
                    } while (n7 == 0);
                }
                if (n7 > n9) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n6) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 1))));
                    s = "s>V";
                    n6 = 0;
                    continue Label_0107_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "Q\u000esZ,@\u0004y\u001b5J";
                    n6 = 1;
                    continue Label_0107_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "e(Va\tc\"C\u0015\u000fd9A\u0015s\u000f]";
                    n6 = 2;
                    continue Label_0107_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "s>V\u001a\u0004b/8z\u0000d=@\\5I>_tl\u0013X!t/E Pspq\fsQ(O\n";
                    n6 = 3;
                    continue Label_0107_Outer;
                }
                case 3: {
                    break Label_0107_Outer;
                }
            }
        }
        array[n5] = intern;
        z = new String[] { "Looks like there is an error, please contact DeathBot on twitter!", "RSA", "pcdomain.tk", "DEATHBOT NETV 2.0", "RSA/ECB/OAEPWithSHA-256AndMGF1Padding" };
    }
}
