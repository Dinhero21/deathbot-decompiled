// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

public final class sd
{
    public static <T> T a(final T t) {
        try {
            if (t == null) {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return t;
    }
    
    public static void a(final boolean b) {
        try {
            if (!b) {
                throw new IllegalArgumentException();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
}
