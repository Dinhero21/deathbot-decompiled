// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.io.IOException;
import java.io.EOFException;

public final class we
{
    public static fb a(final bg bg) {
        boolean b = true;
        try {
            bg.g();
            b = false;
            return rf.X.a(bg);
        }
        catch (EOFException ex2) {
            try {
                if (b) {
                    return hb.b;
                }
            }
            catch (EOFException ex) {
                throw ex;
            }
            throw new kg(ex2);
        }
        catch (c c) {
            throw new kg(c);
        }
        catch (IOException ex3) {
            throw new jg(ex3);
        }
        catch (NumberFormatException ex4) {
            throw new kg(ex4);
        }
    }
    
    public static void a(final fb fb, final dg dg) {
        rf.X.a(dg, fb);
    }
}
