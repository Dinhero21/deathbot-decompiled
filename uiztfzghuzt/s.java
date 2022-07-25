// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

public final class s
{
    public static int a;
    
    public static <T> T a(final T t) {
        Label_0014: {
            try {
                final T t2 = t;
                if (s.a != 0) {
                    return t2;
                }
                if (t == null) {
                    break Label_0014;
                }
                return t;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                if (t == null) {
                    throw new NullPointerException();
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        return t;
    }
}
