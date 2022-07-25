// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.concurrent.atomic.AtomicInteger;

final class jd extends nb<AtomicInteger>
{
    @Override
    public AtomicInteger a(final bg bg) {
        try {
            return new AtomicInteger(bg.s());
        }
        catch (NumberFormatException ex) {
            throw new kg(ex);
        }
    }
    
    @Override
    public void a(final dg dg, final AtomicInteger atomicInteger) {
        dg.a((long)atomicInteger.get());
    }
}
