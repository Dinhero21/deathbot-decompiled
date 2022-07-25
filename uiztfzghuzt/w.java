// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.nio.CharBuffer;

public final class w
{
    public static long a(final Readable readable, final Appendable appendable) {
        final int b = u.b;
        s.a(readable);
        s.a(appendable);
        final CharBuffer allocate = CharBuffer.allocate(2048);
        long n = 0L;
        long n2 = 0L;
        while (readable.read(allocate) != -1) {
            allocate.flip();
            appendable.append(allocate);
            n2 = n + allocate.remaining();
            if (b != 0) {
                return n2;
            }
            n = n2;
            allocate.clear();
            if (b != 0) {
                boolean a = false;
                Label_0083: {
                    try {
                        if (nb.a) {
                            a = false;
                            break Label_0083;
                        }
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    a = true;
                }
                nb.a = a;
                break;
            }
        }
        return n2;
    }
    
    public static String a(final Readable readable) {
        return b(readable).toString();
    }
    
    private static StringBuilder b(final Readable readable) {
        final StringBuilder sb = new StringBuilder();
        a(readable, sb);
        return sb;
    }
}
