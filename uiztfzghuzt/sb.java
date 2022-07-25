// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.concurrent.atomic.AtomicLong;

final class sb extends nb<AtomicLong>
{
    final nb b;
    
    sb(final nb b) {
        this.b = b;
    }
    
    @Override
    public void a(final dg dg, final AtomicLong atomicLong) {
        this.b.a(dg, atomicLong.get());
    }
    
    @Override
    public AtomicLong a(final bg bg) {
        return new AtomicLong(this.b.a(bg).longValue());
    }
}
