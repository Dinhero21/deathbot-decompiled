// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Date;
import java.sql.Timestamp;

final class sf implements md
{
    @Override
    public <T> nb<T> a(final ab ab, final ag<T> ag) {
        try {
            if (ag.a() != Timestamp.class) {
                return null;
            }
        }
        catch (kg kg) {
            throw kg;
        }
        return (nb<T>)new zc(this, ab.a(Date.class));
    }
}
