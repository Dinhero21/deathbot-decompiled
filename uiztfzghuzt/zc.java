// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Date;
import java.sql.Timestamp;

class zc extends nb<Timestamp>
{
    final nb b;
    final sf c;
    
    zc(final sf c, final nb b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public Timestamp a(final bg bg) {
        final Date date = this.b.a(bg);
        try {
            if (date != null) {
                return new Timestamp(date.getTime());
            }
        }
        catch (kg kg) {
            throw kg;
        }
        return null;
    }
    
    @Override
    public void a(final dg dg, final Timestamp timestamp) {
        this.b.a(dg, timestamp);
    }
}
