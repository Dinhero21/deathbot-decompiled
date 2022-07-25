// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.net.InetAddress;

final class wc extends nb<InetAddress>
{
    @Override
    public InetAddress a(final bg bg) {
        Label_0020: {
            try {
                final bg bg2 = bg;
                if (rf.ab) {
                    return InetAddress.getByName(bg2.l());
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
        return InetAddress.getByName(bg2.l());
    }
    
    @Override
    public void a(final dg dg, final InetAddress inetAddress) {
        String hostAddress = null;
        Label_0024: {
            InetAddress inetAddress2 = null;
            Label_0021: {
                Label_0015: {
                    try {
                        inetAddress2 = inetAddress;
                        if (rf.ab) {
                            break Label_0021;
                        }
                        if (inetAddress == null) {
                            break Label_0015;
                        }
                        break Label_0015;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        if (inetAddress == null) {
                            hostAddress = null;
                            break Label_0024;
                        }
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                inetAddress2 = inetAddress;
            }
            hostAddress = inetAddress2.getHostAddress();
        }
        dg.b(hostAddress);
    }
}
