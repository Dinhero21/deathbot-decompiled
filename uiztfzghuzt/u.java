// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class u
{
    private static final OutputStream a;
    public static int b;
    
    public static t a() {
        return a(new ByteArrayOutputStream());
    }
    
    public static t a(final ByteArrayOutputStream byteArrayOutputStream) {
        return new v(s.a(byteArrayOutputStream));
    }
    
    static {
        a = new d();
    }
}
