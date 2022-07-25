// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

class e implements Runnable
{
    final Bot a;
    
    e(final Bot a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        while (true) {
            System.gc();
            try {
                Thread.sleep(500L);
            }
            catch (Exception ex) {}
        }
    }
}
