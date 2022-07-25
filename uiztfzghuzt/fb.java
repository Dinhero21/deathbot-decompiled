// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;

public abstract class fb
{
    public static int a;
    private static final String[] z;
    
    public boolean a() {
        return this instanceof gb;
    }
    
    public boolean b() {
        return this instanceof ib;
    }
    
    public boolean c() {
        return this instanceof jb;
    }
    
    public boolean d() {
        return this instanceof hb;
    }
    
    public ib e() {
        fb fb = null;
        Label_0017: {
            try {
                fb = this;
                if (uiztfzghuzt.fb.a != 0) {
                    return (ib)fb;
                }
                final boolean b = this.b();
                if (b) {
                    break Label_0017;
                }
                throw new IllegalStateException("Not a JSON Object: " + this);
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final boolean b = this.b();
                if (!b) {
                    throw new IllegalStateException("Not a JSON Object: " + this);
                }
                fb = this;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        return (ib)fb;
    }
    
    public gb f() {
        fb fb = null;
        Label_0017: {
            try {
                fb = this;
                if (uiztfzghuzt.fb.a != 0) {
                    return (gb)fb;
                }
                final boolean b = this.a();
                if (b) {
                    break Label_0017;
                }
                throw new IllegalStateException("Not a JSON Array: " + this);
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final boolean b = this.a();
                if (!b) {
                    throw new IllegalStateException("Not a JSON Array: " + this);
                }
                fb = this;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        return (gb)fb;
    }
    
    public jb g() {
        fb fb = null;
        Label_0017: {
            try {
                fb = this;
                if (uiztfzghuzt.fb.a != 0) {
                    return (jb)fb;
                }
                final boolean b = this.c();
                if (b) {
                    break Label_0017;
                }
                throw new IllegalStateException("Not a JSON Primitive: " + this);
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final boolean b = this.c();
                if (!b) {
                    throw new IllegalStateException("Not a JSON Primitive: " + this);
                }
                fb = this;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        return (jb)fb;
    }
    
    public String h() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }
    
    @Override
    public String toString() {
        try {
            final StringWriter stringWriter = new StringWriter();
            final dg dg = new dg(stringWriter);
            dg.a(true);
            we.a(this, dg);
            return stringWriter.toString();
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    static {
        final String[] array = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "w3rl\u0012\u0019\u0016U\u0003=\u0019\u0013d&\u0016Z(<l";
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
                                c2 = '9';
                                break;
                            }
                            case 1: {
                                c2 = '\\';
                                break;
                            }
                            case 2: {
                                c2 = '\u0006';
                                break;
                            }
                            case 3: {
                                c2 = 'L';
                                break;
                            }
                            default: {
                                c2 = 's';
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
                    s = "w3rl\u0012\u0019\u0016U\u0003=\u0019\u001dt>\u0012@f&";
                    n4 = 0;
                    continue Label_0077_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "w3rl\u0012\u0019\u0016U\u0003=\u0019\ft%\u001eP(o:\u0016\u0003|";
                    n4 = 1;
                    continue Label_0077_Outer;
                }
                case 1: {
                    break Label_0077_Outer;
                }
            }
        }
        array[n3] = intern;
        z = new String[] { "Not a JSON Object: ", "Not a JSON Array: ", "Not a JSON Primitive: " };
    }
}
