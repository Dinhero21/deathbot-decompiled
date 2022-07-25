// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

final class tb extends nb<AtomicLongArray>
{
    final nb b;
    
    tb(final nb b) {
        this.b = b;
    }
    
    @Override
    public void a(final dg dg, final AtomicLongArray atomicLongArray) {
        final int a = fb.a;
        dg.c();
        int i = 0;
        while (i < atomicLongArray.length()) {
            try {
                this.b.a(dg, atomicLongArray.get(i));
                ++i;
                if (a != 0) {
                    return;
                }
                if (a == 0) {
                    continue;
                }
            }
            catch (kg kg) {
                throw kg;
            }
            break;
        }
        dg.d();
    }
    
    @Override
    public AtomicLongArray a(final bg bg) {
        int a = fb.a;
        final ArrayList<Long> list = new ArrayList<Long>();
        bg.b();
    Label_0068:
        while (true) {
        Block_4_Outer:
            while (bg.f()) {
                final long longValue = this.b.a(bg).longValue();
                try {
                    list.add(longValue);
                    if (a != 0) {
                        break Label_0068;
                    }
                    if (a == 0) {
                        continue Block_4_Outer;
                    }
                }
                catch (kg kg) {
                    throw kg;
                }
                break;
                final int size = list.size();
                final AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                int i = 0;
                while (true) {
                    while (i < size) {
                        AtomicLongArray atomicLongArray2 = null;
                        Label_0134: {
                            try {
                                atomicLongArray2 = atomicLongArray;
                                if (a != 0) {
                                    break Label_0134;
                                }
                                atomicLongArray2.set(i, list.get(i));
                                ++i;
                                if (a == 0) {
                                    continue Block_4_Outer;
                                }
                            }
                            catch (kg kg2) {
                                throw kg2;
                            }
                            break;
                            try {
                                if (nb.a) {
                                    fb.a = ++a;
                                }
                            }
                            catch (kg kg3) {
                                throw kg3;
                            }
                        }
                        return atomicLongArray2;
                    }
                    continue;
                }
            }
            bg.c();
            continue Label_0068;
        }
    }
}
