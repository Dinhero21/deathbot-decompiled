// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.concurrent.atomic.AtomicBoolean;

final class kd extends nb<AtomicBoolean>
{
    @Override
    public AtomicBoolean a(final bg bg) {
        return new AtomicBoolean(bg.m());
    }
    
    @Override
    public void a(final dg dg, final AtomicBoolean atomicBoolean) {
        dg.b(atomicBoolean.get());
    }
}
