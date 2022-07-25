// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

class vb extends nb<Object>
{
    final nb b;
    
    vb(final nb b) {
        this.b = b;
    }
    
    @Override
    public void a(final dg dg, final Object o) {
        final int a = fb.a;
        Label_0029: {
            Label_0016: {
                try {
                    if (a != 0) {
                        break Label_0029;
                    }
                    final Object o2 = o;
                    if (o2 == null) {
                        break Label_0016;
                    }
                    break Label_0029;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    final Object o2 = o;
                    if (o2 != null) {
                        break Label_0029;
                    }
                    dg.i();
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            try {
                if (a != 0) {
                    this.b.a(dg, o);
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
        }
    }
    
    @Override
    public Object a(final bg bg) {
        Label_0020: {
            p p;
            try {
                final Object o;
                p = (p)(o = bg.g());
                if (fb.a != 0) {
                    return o;
                }
                final p p2 = uiztfzghuzt.p.NULL;
                if (p == p2) {
                    break Label_0020;
                }
                return this.b.a(bg);
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final p p2 = uiztfzghuzt.p.NULL;
                if (p == p2) {
                    bg.n();
                    return null;
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        return this.b.a(bg);
    }
}
