// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

class f implements Runnable
{
    final Bot a;
    
    f(final Bot a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        try {
            new ib(this.a).setVisible(true);
        }
        catch (Exception ex) {}
    }
}
