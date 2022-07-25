// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

final class ic extends nb<AtomicIntegerArray>
{
    @Override
    public AtomicIntegerArray a(final bg bg) {
        final boolean ab = rf.ab;
        final ArrayList<Object> list = new ArrayList<Object>();
        bg.b();
    Label_0069:
        while (true) {
        Block_3_Outer:
            while (bg.f()) {
                try {
                    final int n = bg.s();
                    list.add(n);
                    if (!ab) {
                        continue Block_3_Outer;
                    }
                    break Label_0069;
                }
                catch (NumberFormatException ex) {
                    throw new kg(ex);
                }
                break;
                int n = 0;
                final AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(n);
                int i = 0;
                while (true) {
                    while (i < n) {
                        AtomicIntegerArray atomicIntegerArray2 = null;
                        boolean ab2 = false;
                        Label_0149: {
                            Label_0143: {
                                Label_0128: {
                                    try {
                                        atomicIntegerArray2 = atomicIntegerArray;
                                        if (ab) {
                                            break Label_0128;
                                        }
                                        atomicIntegerArray2.set(i, list.get(i));
                                        ++i;
                                        if (!ab) {
                                            continue Block_3_Outer;
                                        }
                                    }
                                    catch (NumberFormatException ex2) {
                                        throw ex2;
                                    }
                                    break;
                                    try {
                                        if (!nb.a) {
                                            return atomicIntegerArray2;
                                        }
                                        final boolean b = ab;
                                        if (b) {
                                            break Label_0143;
                                        }
                                        break Label_0143;
                                    }
                                    catch (NumberFormatException ex3) {
                                        throw ex3;
                                    }
                                }
                                try {
                                    final boolean b = ab;
                                    if (b) {
                                        ab2 = false;
                                        break Label_0149;
                                    }
                                }
                                catch (NumberFormatException ex4) {
                                    throw ex4;
                                }
                            }
                            ab2 = true;
                        }
                        rf.ab = ab2;
                        return atomicIntegerArray2;
                    }
                    continue;
                }
            }
            bg.c();
            final int n = list.size();
            continue Label_0069;
        }
    }
    
    @Override
    public void a(final dg dg, final AtomicIntegerArray atomicIntegerArray) {
        final boolean ab = rf.ab;
        dg.c();
        int i = 0;
        while (i < atomicIntegerArray.length()) {
            try {
                dg.a((long)atomicIntegerArray.get(i));
                ++i;
                if (ab) {
                    return;
                }
                if (!ab) {
                    continue;
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            break;
        }
        dg.d();
    }
}
