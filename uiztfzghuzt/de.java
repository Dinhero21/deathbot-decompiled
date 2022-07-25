// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Type;

class de implements ue<Object>
{
    private final xe a;
    final Class b;
    final Type c;
    final xd d;
    private static final String[] z;
    
    de(final xd d, final Class b, final Type c) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = xe.a();
    }
    
    @Override
    public Object a() {
        try {
            return this.a.a((Class<Object>)this.b);
        }
        catch (Exception cause) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + this.c + ". " + "Register an InstanceCreator with Gson for this type may fix this problem.", cause);
        }
    }
    
    static {
        final String[] array = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "\u0006\u0002";
        int n4 = -1;
        String intern = null;
    Label_0077_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n6;
            final int n5 = n6 = (length = charArray.length);
            int n7 = 0;
            while (true) {
                Label_0154: {
                    if (n5 > 1) {
                        break Label_0154;
                    }
                    length = (n6 = n7);
                    do {
                        final char c = charArray[n6];
                        char c2 = '\0';
                        switch (n7 % 5) {
                            case 0: {
                                c2 = '(';
                                break;
                            }
                            case 1: {
                                c2 = '\"';
                                break;
                            }
                            case 2: {
                                c2 = 'b';
                                break;
                            }
                            case 3: {
                                c2 = '*';
                                break;
                            }
                            default: {
                                c2 = 'r';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n7;
                    } while (n5 == 0);
                }
                if (n5 > n7) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n4) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = 1));
                    s = "zG\u0005C\u0001\\G\u0010\n\u0013F\u0002+D\u0001\\C\fI\u0017kP\u0007K\u0006GPB]\u001b\\JBm\u0001GLBL\u001dZ\u0002\u0016B\u001b[\u0002\u0016S\u0002M\u0002\u000fK\u000b\bD\u000bRR\\J\u000bYRXP\rH\u001eMOL";
                    n4 = 0;
                    continue Label_0077_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "}L\u0003H\u001eM\u0002\u0016ERAL\u0014E\u0019M\u0002\fE_IP\u0005YRKM\fY\u0006ZW\u0001^\u001dZ\u0002\u0004E\u0000\b";
                    n4 = 1;
                    continue Label_0077_Outer;
                }
                case 1: {
                    break Label_0077_Outer;
                }
            }
        }
        array[n3] = intern;
        z = new String[] { ". ", "Register an InstanceCreator with Gson for this type may fix this problem.", "Unable to invoke no-args constructor for " };
    }
}
