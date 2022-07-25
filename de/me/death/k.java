// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import java.io.DataOutput;
import java.io.EOFException;
import uiztfzghuzt.nb;
import java.io.InputStream;

public class k
{
    public static boolean a;
    private static final String[] z;
    
    public int a(final InputStream inputStream) {
        int n = 0;
        int n2 = 0;
        byte b;
        do {
            b = (byte)inputStream.read();
            n |= (b & 0x7F) << n2++ * 7;
            if (n2 > 32) {
                throw new RuntimeException("VarInt too big");
            }
        } while ((b & 0x80) == 0x80);
        return n;
    }
    
    public int[] b(final InputStream inputStream) {
        final boolean a = k.a;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int read;
        do {
            read = inputStream.read();
            ++n3;
            n |= (read & 0x7F) << n2++ * 7;
            if (n2 > 5) {
                throw new RuntimeException("VarInt too big");
            }
        } while ((read & 0x80) == 0x80);
        final int[] array = { n, n3 };
        int[] array2 = null;
        boolean a2 = false;
        Label_0101: {
            Label_0095: {
                try {
                    array2 = array;
                    if (!a) {
                        return array2;
                    }
                    final boolean b = nb.a;
                    if (b) {
                        break Label_0095;
                    }
                    break Label_0095;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = nb.a;
                    if (b) {
                        a2 = false;
                        break Label_0101;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            a2 = true;
        }
        nb.a = a2;
        return array2;
    }
    
    public String c(final InputStream inputStream) {
        final byte[] array = new byte[this.a(inputStream)];
        final int read = inputStream.read(array);
        try {
            if (array.length != read) {
                throw new EOFException();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return new String(array, "UTF-8");
    }
    
    public void a(int i, final DataOutput dataOutput) {
        final boolean a = k.a;
    Block_3:
        while (true) {
            int n = i & 0x7F;
            i >>>= 7;
            if (i != 0) {
                n |= 0x80;
            }
            dataOutput.writeByte((byte)n);
            while (i == 0) {
                if (!a) {
                    break Block_3;
                }
            }
        }
    }
    
    public void a(final String s, final DataOutput dataOutput) {
        final byte[] bytes = s.getBytes("UTF-8");
        this.a(bytes.length, dataOutput);
        dataOutput.write(bytes);
    }
    
    static {
        final String[] array = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "0Fq\u0016\u0005\u0012\u0007w0\u0004FEj8";
        int n3 = -1;
        String intern = null;
    Label_0062_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n5;
            final int n4 = n5 = (length = charArray.length);
            int n6 = 0;
            while (true) {
                Label_0137: {
                    if (n4 > 1) {
                        break Label_0137;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = 'f';
                                break;
                            }
                            case 1: {
                                c2 = '\'';
                                break;
                            }
                            case 2: {
                                c2 = '\u0003';
                                break;
                            }
                            case 3: {
                                c2 = '_';
                                break;
                            }
                            default: {
                                c2 = 'k';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n6;
                    } while (n4 == 0);
                }
                if (n4 > n6) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    array[n2] = intern;
                    n = (n2 = 1);
                    s = "3sErS";
                    n3 = 0;
                    continue Label_0062_Outer;
                }
                case 0: {
                    break Label_0062_Outer;
                }
            }
        }
        array[n] = intern;
        z = new String[] { "VarInt too big", "UTF-8" };
    }
}
