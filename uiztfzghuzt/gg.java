// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.Cipher;

public class gg
{
    private byte[] a;
    private static final String[] z;
    
    public gg(final byte[] a) {
        final int a2 = hg.a;
        Label_0032: {
            if (a2 == 0) {
                try {
                    if (a.length != 16) {
                        break Label_0032;
                    }
                    this.a = a;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
            try {
                if (a2 != 0) {
                    throw new RuntimeException("Key must be 182 bit long");
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
    }
    
    public byte[] a(final byte[] input) {
        final Key a = this.a();
        final Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, a, new IvParameterSpec(new byte[16]));
        return instance.doFinal(input);
    }
    
    public byte[] b(final byte[] input) {
        final Key a = this.a();
        final Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, a, new IvParameterSpec(new byte[16]));
        return instance.doFinal(input);
    }
    
    private Key a() {
        return new SecretKeySpec(this.a, "AES");
    }
    
    static {
        final String[] array = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "nR\u000fsymTs\fqlDi\f[Ks52]";
        int n4 = -1;
        String intern = null;
    Label_0077_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n6;
            final int n5 = n6 = (length = charArray.length);
            int n7 = 0;
            while (true) {
                Label_0154: {
                    if (n5 > 1) {
                        break Label_0154;
                    }
                    length = (n6 = n7);
                    do {
                        final char c = charArray[n6];
                        char c2 = '\0';
                        switch (n7 % 5) {
                            case 0: {
                                c2 = '/';
                                break;
                            }
                            case 1: {
                                c2 = '\u0017';
                                break;
                            }
                            case 2: {
                                c2 = '\\';
                                break;
                            }
                            case 3: {
                                c2 = '\\';
                                break;
                            }
                            default: {
                                c2 = ':';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n7;
                    } while (n5 == 0);
                }
                if (n5 > n7) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n4) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = 1));
                    s = "dr%|WZd(|XJ7md\b\u000fu5(\u001aCx2;";
                    n4 = 0;
                    continue Label_0077_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "nR\u000f";
                    n4 = 1;
                    continue Label_0077_Outer;
                }
                case 1: {
                    break Label_0077_Outer;
                }
            }
        }
        array[n3] = intern;
        z = new String[] { "AES/CBC/PKCS5Padding", "Key must be 182 bit long", "AES" };
    }
}
