// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;

public final class eg extends dg
{
    private static final Writer m;
    private static final jb n;
    private final List<fb> o;
    private String p;
    private fb q;
    private static final String[] z;
    
    public eg() {
        super(eg.m);
        this.o = new ArrayList<fb>();
        this.q = hb.b;
    }
    
    public fb a() {
        Label_0022: {
            try {
                final eg eg = this;
                if (rf.ab) {
                    return eg.q;
                }
                final List<fb> list = this.o;
                final boolean b = list.isEmpty();
                if (!b) {
                    break Label_0022;
                }
                break Label_0022;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final List<fb> list = this.o;
                final boolean b = list.isEmpty();
                if (!b) {
                    throw new IllegalStateException("Expected one JSON element but was " + this.o);
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        final eg eg = this;
        return eg.q;
    }
    
    private fb b() {
        return this.o.get(this.o.size() - 1);
    }
    
    private void a(final fb p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: iload_3        
        //     6: ifne            92
        //     9: getfield        uiztfzghuzt/eg.p:Ljava/lang/String;
        //    12: ifnull          87
        //    15: goto            19
        //    18: athrow         
        //    19: aload_1        
        //    20: iload_3        
        //    21: ifne            65
        //    24: goto            28
        //    27: athrow         
        //    28: invokevirtual   uiztfzghuzt/fb.d:()Z
        //    31: ifeq            57
        //    34: goto            38
        //    37: athrow         
        //    38: aload_0        
        //    39: iload_3        
        //    40: ifne            79
        //    43: goto            47
        //    46: athrow         
        //    47: invokevirtual   uiztfzghuzt/eg.b:()Z
        //    50: ifeq            78
        //    53: goto            57
        //    56: athrow         
        //    57: aload_0        
        //    58: invokespecial   uiztfzghuzt/eg.b:()Luiztfzghuzt/fb;
        //    61: goto            65
        //    64: athrow         
        //    65: checkcast       Luiztfzghuzt/ib;
        //    68: astore_2       
        //    69: aload_2        
        //    70: aload_0        
        //    71: getfield        uiztfzghuzt/eg.p:Ljava/lang/String;
        //    74: aload_1        
        //    75: invokevirtual   uiztfzghuzt/ib.a:(Ljava/lang/String;Luiztfzghuzt/fb;)V
        //    78: aload_0        
        //    79: aconst_null    
        //    80: putfield        uiztfzghuzt/eg.p:Ljava/lang/String;
        //    83: iload_3        
        //    84: ifeq            173
        //    87: aload_0        
        //    88: goto            92
        //    91: athrow         
        //    92: iload_3        
        //    93: ifne            129
        //    96: getfield        uiztfzghuzt/eg.o:Ljava/util/List;
        //    99: invokeinterface java/util/List.isEmpty:()Z
        //   104: ifeq            124
        //   107: goto            111
        //   110: athrow         
        //   111: aload_0        
        //   112: aload_1        
        //   113: putfield        uiztfzghuzt/eg.q:Luiztfzghuzt/fb;
        //   116: iload_3        
        //   117: ifeq            173
        //   120: goto            124
        //   123: athrow         
        //   124: aload_0        
        //   125: goto            129
        //   128: athrow         
        //   129: invokespecial   uiztfzghuzt/eg.b:()Luiztfzghuzt/fb;
        //   132: astore_2       
        //   133: aload_2        
        //   134: iload_3        
        //   135: ifne            153
        //   138: instanceof      Luiztfzghuzt/gb;
        //   141: ifeq            164
        //   144: goto            148
        //   147: athrow         
        //   148: aload_2        
        //   149: goto            153
        //   152: athrow         
        //   153: checkcast       Luiztfzghuzt/gb;
        //   156: aload_1        
        //   157: invokevirtual   uiztfzghuzt/gb.a:(Luiztfzghuzt/fb;)V
        //   160: iload_3        
        //   161: ifeq            173
        //   164: new             Ljava/lang/IllegalStateException;
        //   167: dup            
        //   168: invokespecial   java/lang/IllegalStateException.<init>:()V
        //   171: athrow         
        //   172: athrow         
        //   173: return         
        //    StackMapTable: 00 1E FF 00 12 00 04 07 00 02 07 00 53 00 01 00 01 07 00 2A 00 47 07 00 2A 40 07 00 53 48 07 00 2A 00 47 07 00 2A 40 07 00 02 48 07 00 2A 00 46 07 00 2A 40 07 00 53 0C 40 07 00 02 07 43 07 00 2A 40 07 00 02 51 07 00 2A 00 4B 07 00 2A 00 43 07 00 2A 40 07 00 02 FF 00 11 00 04 07 00 02 07 00 53 07 00 53 01 00 01 07 00 2A 00 43 07 00 2A 40 07 00 53 0A 47 07 00 2A FF 00 00 00 04 07 00 02 07 00 53 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  153    172    172    173    Ljava/lang/IllegalStateException;
        //  138    149    152    153    Ljava/lang/IllegalStateException;
        //  133    144    147    148    Ljava/lang/IllegalStateException;
        //  111    125    128    129    Ljava/lang/IllegalStateException;
        //  96     120    123    124    Ljava/lang/IllegalStateException;
        //  92     107    110    111    Ljava/lang/IllegalStateException;
        //  79     88     91     92     Ljava/lang/IllegalStateException;
        //  47     61     64     65     Ljava/lang/IllegalStateException;
        //  38     53     56     57     Ljava/lang/IllegalStateException;
        //  28     43     46     47     Ljava/lang/IllegalStateException;
        //  19     34     37     38     Ljava/lang/IllegalStateException;
        //  9      24     27     28     Ljava/lang/IllegalStateException;
        //  4      15     18     19     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public dg c() {
        final gb gb = new gb();
        this.a(gb);
        this.o.add(gb);
        return this;
    }
    
    @Override
    public dg d() {
        final boolean ab = rf.ab;
        eg eg = null;
        Label_0053: {
            Label_0043: {
                eg eg2 = null;
                Label_0029: {
                    Label_0024: {
                        try {
                            eg = this;
                            eg2 = this;
                            if (ab) {
                                break Label_0029;
                            }
                            final List<fb> list = this.o;
                            final boolean b = list.isEmpty();
                            if (!b) {
                                break Label_0024;
                            }
                            break Label_0043;
                        }
                        catch (IllegalStateException ex) {
                            throw ex;
                        }
                        try {
                            final List<fb> list = this.o;
                            final boolean b = list.isEmpty();
                            if (b) {
                                break Label_0043;
                            }
                            eg = this;
                            eg2 = this;
                        }
                        catch (IllegalStateException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (ab) {
                            break Label_0053;
                        }
                        final String s = eg2.p;
                        if (s != null) {
                            break Label_0043;
                        }
                        break Label_0043;
                    }
                    catch (IllegalStateException ex3) {
                        throw ex3;
                    }
                }
                try {
                    final String s = eg2.p;
                    if (s != null) {
                        throw new IllegalStateException();
                    }
                }
                catch (IllegalStateException ex4) {
                    throw ex4;
                }
            }
            eg = this;
        }
        final fb b2 = eg.b();
        Label_0072: {
            fb fb;
            try {
                fb = b2;
                if (ab) {
                    return this;
                }
                final boolean b3 = fb instanceof gb;
                if (b3) {
                    break Label_0072;
                }
                throw new IllegalStateException();
            }
            catch (IllegalStateException ex5) {
                throw ex5;
            }
            try {
                final boolean b3 = fb instanceof gb;
                if (!b3) {
                    throw new IllegalStateException();
                }
                this.o.remove(this.o.size() - 1);
            }
            catch (IllegalStateException ex6) {
                throw ex6;
            }
        }
        return this;
    }
    
    @Override
    public dg e() {
        final ib ib = new ib();
        this.a(ib);
        this.o.add(ib);
        return this;
    }
    
    @Override
    public dg f() {
        final boolean ab = rf.ab;
        eg eg = null;
        Label_0053: {
            Label_0043: {
                eg eg2 = null;
                Label_0029: {
                    Label_0024: {
                        try {
                            eg = this;
                            eg2 = this;
                            if (ab) {
                                break Label_0029;
                            }
                            final List<fb> list = this.o;
                            final boolean b = list.isEmpty();
                            if (!b) {
                                break Label_0024;
                            }
                            break Label_0043;
                        }
                        catch (IllegalStateException ex) {
                            throw ex;
                        }
                        try {
                            final List<fb> list = this.o;
                            final boolean b = list.isEmpty();
                            if (b) {
                                break Label_0043;
                            }
                            eg = this;
                            eg2 = this;
                        }
                        catch (IllegalStateException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (ab) {
                            break Label_0053;
                        }
                        final String s = eg2.p;
                        if (s != null) {
                            break Label_0043;
                        }
                        break Label_0043;
                    }
                    catch (IllegalStateException ex3) {
                        throw ex3;
                    }
                }
                try {
                    final String s = eg2.p;
                    if (s != null) {
                        throw new IllegalStateException();
                    }
                }
                catch (IllegalStateException ex4) {
                    throw ex4;
                }
            }
            eg = this;
        }
        final fb b2 = eg.b();
        Label_0072: {
            fb fb;
            try {
                fb = b2;
                if (ab) {
                    return this;
                }
                final boolean b3 = fb instanceof ib;
                if (b3) {
                    break Label_0072;
                }
                throw new IllegalStateException();
            }
            catch (IllegalStateException ex5) {
                throw ex5;
            }
            try {
                final boolean b3 = fb instanceof ib;
                if (!b3) {
                    throw new IllegalStateException();
                }
                this.o.remove(this.o.size() - 1);
            }
            catch (IllegalStateException ex6) {
                throw ex6;
            }
        }
        return this;
    }
    
    @Override
    public dg a(final String p) {
        final boolean ab = rf.ab;
        eg eg = null;
        Label_0053: {
            Label_0043: {
                eg eg2 = null;
                Label_0029: {
                    Label_0024: {
                        try {
                            eg = this;
                            eg2 = this;
                            if (ab) {
                                break Label_0029;
                            }
                            final List<fb> list = this.o;
                            final boolean b = list.isEmpty();
                            if (!b) {
                                break Label_0024;
                            }
                            break Label_0043;
                        }
                        catch (IllegalStateException ex) {
                            throw ex;
                        }
                        try {
                            final List<fb> list = this.o;
                            final boolean b = list.isEmpty();
                            if (b) {
                                break Label_0043;
                            }
                            eg = this;
                            eg2 = this;
                        }
                        catch (IllegalStateException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (ab) {
                            break Label_0053;
                        }
                        final String s = eg2.p;
                        if (s != null) {
                            break Label_0043;
                        }
                        break Label_0043;
                    }
                    catch (IllegalStateException ex3) {
                        throw ex3;
                    }
                }
                try {
                    final String s = eg2.p;
                    if (s != null) {
                        throw new IllegalStateException();
                    }
                }
                catch (IllegalStateException ex4) {
                    throw ex4;
                }
            }
            eg = this;
        }
        final fb b2 = eg.b();
        Label_0072: {
            try {
                if (ab) {
                    return this;
                }
                final fb fb = b2;
                final boolean b3 = fb instanceof ib;
                if (b3) {
                    break Label_0072;
                }
                throw new IllegalStateException();
            }
            catch (IllegalStateException ex5) {
                throw ex5;
            }
            try {
                final fb fb = b2;
                final boolean b3 = fb instanceof ib;
                if (!b3) {
                    throw new IllegalStateException();
                }
                this.p = p;
            }
            catch (IllegalStateException ex6) {
                throw ex6;
            }
        }
        return this;
    }
    
    @Override
    public dg b(final String s) {
        Label_0014: {
            try {
                if (rf.ab) {
                    return this;
                }
                final String s2 = s;
                if (s2 == null) {
                    break Label_0014;
                }
                break Label_0014;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final String s2 = s;
                if (s2 == null) {
                    return this.i();
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        this.a(new jb(s));
        return this;
    }
    
    @Override
    public dg i() {
        this.a(hb.b);
        return this;
    }
    
    @Override
    public dg b(final boolean b) {
        this.a(new jb(b));
        return this;
    }
    
    @Override
    public dg a(final Boolean b) {
        Label_0014: {
            try {
                if (rf.ab) {
                    return this;
                }
                final Boolean b2 = b;
                if (b2 == null) {
                    break Label_0014;
                }
                break Label_0014;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final Boolean b2 = b;
                if (b2 == null) {
                    return this.i();
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        this.a(new jb(b));
        return this;
    }
    
    @Override
    public dg a(final long l) {
        this.a(new jb(l));
        return this;
    }
    
    @Override
    public dg a(final Number obj) {
        final boolean ab = rf.ab;
        try {
            if (obj == null) {
                return this.i();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        Label_0091: {
            try {
                final eg eg = this;
                if (ab) {
                    return eg;
                }
                if (this.a()) {
                    break Label_0091;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
            final double doubleValue = obj.doubleValue();
            Label_0063: {
                boolean b2 = false;
                Label_0052: {
                    boolean b;
                    try {
                        b = (b2 = Double.isNaN(doubleValue));
                        if (ab) {
                            break Label_0063;
                        }
                        if (!b) {
                            break Label_0052;
                        }
                        break Label_0063;
                    }
                    catch (IllegalStateException ex3) {
                        throw ex3;
                    }
                    try {
                        if (b) {
                            break Label_0063;
                        }
                        b2 = Double.isInfinite(doubleValue);
                    }
                    catch (IllegalStateException ex4) {
                        throw ex4;
                    }
                }
                try {
                    if (b2) {
                        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + obj);
                    }
                }
                catch (IllegalStateException ex5) {
                    throw ex5;
                }
            }
        }
        this.a(new jb(obj));
        return this;
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void close() {
        Label_0022: {
            boolean empty;
            try {
                empty = this.o.isEmpty();
                if (rf.ab) {
                    return;
                }
                if (!empty) {
                    break Label_0022;
                }
                break Label_0022;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (!empty) {
                    throw new IOException("Incomplete document");
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        this.o.add(eg.n);
    }
    
    static {
        final String[] array = new String[4];
        int n5;
        int n4;
        int n3;
        int n2 = n3 = (n4 = (n5 = 0));
        String s = "\\F\u001fK m[\u000b\u000e,w[Od\u0010VpOK/|S\n@79\\\u001aZcn_\u001c\u000e";
        int n6 = -1;
        String intern = null;
    Label_0092_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0166: {
                    if (n7 > 1) {
                        break Label_0166;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = '\u0019';
                                break;
                            }
                            case 1: {
                                c2 = '>';
                                break;
                            }
                            case 2: {
                                c2 = 'o';
                                break;
                            }
                            case 3: {
                                c2 = '.';
                                break;
                            }
                            default: {
                                c2 = 'C';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n9;
                    } while (n7 == 0);
                }
                if (n7 > n9) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n6) {
                default: {
                    array[n3] = intern;
                    n2 = (n3 = (n4 = (n5 = 1)));
                    s = "PP\fA.iR\nZ&9Z\u0000M6t[\u0001Z";
                    n6 = 0;
                    continue Label_0092_Outer;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = (n3 = (n4 = (n5 = 2)));
                    s = "Sm `c\u007fQ\u001dL*}MO`\"W\u001e\u000e@'9W\u0001H*wW\u001bG&j\u0004O";
                    n6 = 1;
                    continue Label_0092_Outer;
                }
                case 1: {
                    array[n4] = intern;
                    n2 = (n3 = (n4 = (n5 = 3)));
                    s = "zR\u0000]&}";
                    n6 = 2;
                    continue Label_0092_Outer;
                }
                case 2: {
                    break Label_0092_Outer;
                }
            }
        }
        array[n5] = intern;
        z = new String[] { "Expected one JSON element but was ", "Incomplete document", "JSON forbids NaN and infinities: ", "closed" };
        m = new f();
        n = new jb("closed");
    }
}
