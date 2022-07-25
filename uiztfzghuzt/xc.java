// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.UUID;

final class xc extends nb<UUID>
{
    @Override
    public UUID a(final bg bg) {
        Label_0020: {
            try {
                final bg bg2 = bg;
                if (rf.ab) {
                    return UUID.fromString(bg2.l());
                }
                final p p = bg.g();
                final p p2 = uiztfzghuzt.p.NULL;
                if (p == p2) {
                    break Label_0020;
                }
                break Label_0020;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final p p = bg.g();
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
        final bg bg2 = bg;
        return UUID.fromString(bg2.l());
    }
    
    @Override
    public void a(final dg dg, final UUID uuid) {
        String string = null;
        Label_0024: {
            UUID uuid2 = null;
            Label_0021: {
                Label_0015: {
                    try {
                        uuid2 = uuid;
                        if (rf.ab) {
                            break Label_0021;
                        }
                        if (uuid == null) {
                            break Label_0015;
                        }
                        break Label_0015;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        if (uuid == null) {
                            string = null;
                            break Label_0024;
                        }
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                uuid2 = uuid;
            }
            string = uuid2.toString();
        }
        dg.b(string);
    }
}
