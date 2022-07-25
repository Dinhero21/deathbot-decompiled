// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.io.IOException;

public abstract class nb<T>
{
    public static boolean a;
    
    public abstract void a(final dg p0, final T p1);
    
    public final nb<T> a() {
        return (nb<T>)new vb(this);
    }
    
    public final fb a(final T t) {
        try {
            final eg eg = new eg();
            this.a(eg, t);
            return eg.a();
        }
        catch (IOException ex) {
            throw new jg(ex);
        }
    }
    
    public abstract T a(final bg p0);
}
