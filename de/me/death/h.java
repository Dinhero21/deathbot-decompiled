// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.kg;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class h implements ActionListener
{
    final ib a;
    
    h(final ib a) {
        this.a = a;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        final long currentTimeMillis = System.currentTimeMillis();
        Label_0030: {
            try {
                if (ib.i) {
                    break Label_0030;
                }
                final long n = currentTimeMillis;
                final h h = this;
                final ib ib = h.a;
                final long n2 = de.me.death.ib.a(ib);
                final long n3 = n - n2;
                final long n4 = 60000L;
                final long n5 = lcmp(n3, n4);
                if (n5 > 0) {
                    break Label_0030;
                }
                return;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final long n = currentTimeMillis;
                final h h = this;
                final ib ib = h.a;
                final long n2 = de.me.death.ib.a(ib);
                final long n3 = n - n2;
                final long n4 = 60000L;
                final long n5 = lcmp(n3, n4);
                if (n5 <= 0) {
                    return;
                }
                de.me.death.ib.b(this.a);
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        ib.a(this.a, currentTimeMillis);
    }
}
