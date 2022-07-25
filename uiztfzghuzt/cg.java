// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Iterator;
import java.util.Map;
import java.io.Reader;

public final class cg extends bg
{
    private static final Reader q;
    private static final Object r;
    private Object[] s;
    private int t;
    private String[] u;
    private int[] v;
    private static final String[] z;
    
    @Override
    public void b() {
        this.a(uiztfzghuzt.p.BEGIN_ARRAY);
        this.a(((gb)this.a()).iterator());
        this.v[this.t - 1] = 0;
    }
    
    @Override
    public void c() {
        cg cg = null;
        Label_0034: {
            try {
                this.a(uiztfzghuzt.p.END_ARRAY);
                this.b();
                this.b();
                cg = this;
                if (rf.ab) {
                    break Label_0034;
                }
                final int n = this.t;
                if (n > 0) {
                    break Label_0034;
                }
                return;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final int n = this.t;
                if (n <= 0) {
                    return;
                }
                cg = this;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        final int[] v = cg.v;
        final int n2 = this.t - 1;
        ++v[n2];
    }
    
    @Override
    public void d() {
        this.a(uiztfzghuzt.p.BEGIN_OBJECT);
        this.a(((ib)this.a()).a().iterator());
    }
    
    @Override
    public void e() {
        cg cg = null;
        Label_0034: {
            try {
                this.a(uiztfzghuzt.p.END_OBJECT);
                this.b();
                this.b();
                cg = this;
                if (rf.ab) {
                    break Label_0034;
                }
                final int n = this.t;
                if (n > 0) {
                    break Label_0034;
                }
                return;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final int n = this.t;
                if (n <= 0) {
                    return;
                }
                cg = this;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        final int[] v = cg.v;
        final int n2 = this.t - 1;
        ++v[n2];
    }
    
    @Override
    public boolean f() {
        final p g = this.g();
        Label_0030: {
            p p2 = null;
            p p4 = null;
            Label_0022: {
                p p;
                p p3;
                try {
                    p = (p2 = g);
                    p3 = (p4 = uiztfzghuzt.p.END_OBJECT);
                    if (rf.ab) {
                        break Label_0030;
                    }
                    if (p != p3) {
                        break Label_0022;
                    }
                    return false;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                try {
                    if (p == p3) {
                        return false;
                    }
                    p2 = g;
                    p4 = uiztfzghuzt.p.END_ARRAY;
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
            }
            try {
                if (p2 != p4) {
                    return true;
                }
            }
            catch (IllegalStateException ex3) {
                throw ex3;
            }
        }
        return false;
    }
    
    @Override
    public p g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_0        
        //     6: iload           4
        //     8: ifne            30
        //    11: getfield        uiztfzghuzt/cg.t:I
        //    14: ifne            26
        //    17: goto            21
        //    20: athrow         
        //    21: getstatic       uiztfzghuzt/p.END_DOCUMENT:Luiztfzghuzt/p;
        //    24: areturn        
        //    25: athrow         
        //    26: aload_0        
        //    27: invokespecial   uiztfzghuzt/cg.a:()Ljava/lang/Object;
        //    30: astore_1       
        //    31: aload_1        
        //    32: instanceof      Ljava/util/Iterator;
        //    35: iload           4
        //    37: ifne            132
        //    40: ifeq            128
        //    43: goto            47
        //    46: athrow         
        //    47: aload_0        
        //    48: getfield        uiztfzghuzt/cg.s:[Ljava/lang/Object;
        //    51: aload_0        
        //    52: getfield        uiztfzghuzt/cg.t:I
        //    55: iconst_2       
        //    56: isub           
        //    57: aaload         
        //    58: instanceof      Luiztfzghuzt/ib;
        //    61: istore_2       
        //    62: aload_1        
        //    63: checkcast       Ljava/util/Iterator;
        //    66: astore_3       
        //    67: aload_3        
        //    68: invokeinterface java/util/Iterator.hasNext:()Z
        //    73: iload           4
        //    75: ifne            114
        //    78: ifeq            113
        //    81: goto            85
        //    84: athrow         
        //    85: iload_2        
        //    86: ifeq            98
        //    89: goto            93
        //    92: athrow         
        //    93: getstatic       uiztfzghuzt/p.NAME:Luiztfzghuzt/p;
        //    96: areturn        
        //    97: athrow         
        //    98: aload_0        
        //    99: aload_3        
        //   100: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   105: invokespecial   uiztfzghuzt/cg.a:(Ljava/lang/Object;)V
        //   108: aload_0        
        //   109: invokevirtual   uiztfzghuzt/cg.g:()Luiztfzghuzt/p;
        //   112: areturn        
        //   113: iload_2        
        //   114: ifeq            124
        //   117: getstatic       uiztfzghuzt/p.END_OBJECT:Luiztfzghuzt/p;
        //   120: goto            127
        //   123: athrow         
        //   124: getstatic       uiztfzghuzt/p.END_ARRAY:Luiztfzghuzt/p;
        //   127: areturn        
        //   128: aload_1        
        //   129: instanceof      Luiztfzghuzt/ib;
        //   132: iload           4
        //   134: ifne            153
        //   137: ifeq            149
        //   140: goto            144
        //   143: athrow         
        //   144: getstatic       uiztfzghuzt/p.BEGIN_OBJECT:Luiztfzghuzt/p;
        //   147: areturn        
        //   148: athrow         
        //   149: aload_1        
        //   150: instanceof      Luiztfzghuzt/gb;
        //   153: iload           4
        //   155: ifne            174
        //   158: ifeq            170
        //   161: goto            165
        //   164: athrow         
        //   165: getstatic       uiztfzghuzt/p.BEGIN_ARRAY:Luiztfzghuzt/p;
        //   168: areturn        
        //   169: athrow         
        //   170: aload_1        
        //   171: instanceof      Luiztfzghuzt/jb;
        //   174: iload           4
        //   176: ifne            266
        //   179: ifeq            253
        //   182: goto            186
        //   185: athrow         
        //   186: aload_1        
        //   187: checkcast       Luiztfzghuzt/jb;
        //   190: astore_2       
        //   191: aload_2        
        //   192: invokevirtual   uiztfzghuzt/jb.j:()Z
        //   195: iload           4
        //   197: ifne            216
        //   200: ifeq            212
        //   203: goto            207
        //   206: athrow         
        //   207: getstatic       uiztfzghuzt/p.STRING:Luiztfzghuzt/p;
        //   210: areturn        
        //   211: athrow         
        //   212: aload_2        
        //   213: invokevirtual   uiztfzghuzt/jb.e:()Z
        //   216: iload           4
        //   218: ifne            237
        //   221: ifeq            233
        //   224: goto            228
        //   227: athrow         
        //   228: getstatic       uiztfzghuzt/p.BOOLEAN:Luiztfzghuzt/p;
        //   231: areturn        
        //   232: athrow         
        //   233: aload_2        
        //   234: invokevirtual   uiztfzghuzt/jb.h:()Z
        //   237: ifeq            245
        //   240: getstatic       uiztfzghuzt/p.NUMBER:Luiztfzghuzt/p;
        //   243: areturn        
        //   244: athrow         
        //   245: new             Ljava/lang/AssertionError;
        //   248: dup            
        //   249: invokespecial   java/lang/AssertionError.<init>:()V
        //   252: athrow         
        //   253: aload_1        
        //   254: iload           4
        //   256: ifne            275
        //   259: instanceof      Luiztfzghuzt/hb;
        //   262: goto            266
        //   265: athrow         
        //   266: ifeq            274
        //   269: getstatic       uiztfzghuzt/p.NULL:Luiztfzghuzt/p;
        //   272: areturn        
        //   273: athrow         
        //   274: aload_1        
        //   275: getstatic       uiztfzghuzt/cg.r:Ljava/lang/Object;
        //   278: if_acmpne       292
        //   281: new             Ljava/lang/IllegalStateException;
        //   284: dup            
        //   285: ldc             "JsonReader is closed"
        //   287: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   290: athrow         
        //   291: athrow         
        //   292: new             Ljava/lang/AssertionError;
        //   295: dup            
        //   296: invokespecial   java/lang/AssertionError.<init>:()V
        //   299: athrow         
        //    StackMapTable: 00 34 FF 00 14 00 05 07 00 02 00 00 00 01 00 01 07 00 30 00 43 07 00 30 00 43 07 00 87 FF 00 0F 00 05 07 00 02 07 00 87 00 00 01 00 01 07 00 30 00 FF 00 24 00 05 07 00 02 07 00 87 01 07 00 56 01 00 01 07 00 30 00 46 07 00 30 00 43 07 00 30 00 0E 40 01 48 07 00 30 00 42 07 00 15 FF 00 00 00 05 07 00 02 07 00 87 00 00 01 00 00 43 01 4A 07 00 30 00 43 07 00 30 00 43 01 4A 07 00 30 00 43 07 00 30 00 43 01 4A 07 00 30 00 FF 00 13 00 05 07 00 02 07 00 87 07 00 63 00 01 00 01 07 00 30 00 43 07 00 30 00 43 01 4A 07 00 30 00 43 07 00 30 00 43 01 46 07 00 30 00 FF 00 07 00 05 07 00 02 07 00 87 00 00 01 00 00 4B 07 00 30 40 01 46 07 00 30 00 40 07 00 87 4F 07 00 30 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  275    291    291    292    Ljava/lang/IllegalStateException;
        //  266    273    273    274    Ljava/lang/IllegalStateException;
        //  253    262    265    266    Ljava/lang/IllegalStateException;
        //  237    244    244    245    Ljava/lang/IllegalStateException;
        //  221    232    232    233    Ljava/lang/IllegalStateException;
        //  216    224    227    228    Ljava/lang/IllegalStateException;
        //  200    211    211    212    Ljava/lang/IllegalStateException;
        //  191    203    206    207    Ljava/lang/IllegalStateException;
        //  174    182    185    186    Ljava/lang/IllegalStateException;
        //  158    169    169    170    Ljava/lang/IllegalStateException;
        //  153    161    164    165    Ljava/lang/IllegalStateException;
        //  137    148    148    149    Ljava/lang/IllegalStateException;
        //  132    140    143    144    Ljava/lang/IllegalStateException;
        //  114    123    123    124    Ljava/lang/IllegalStateException;
        //  85     97     97     98     Ljava/lang/IllegalStateException;
        //  78     89     92     93     Ljava/lang/IllegalStateException;
        //  67     81     84     85     Ljava/lang/IllegalStateException;
        //  31     43     46     47     Ljava/lang/IllegalStateException;
        //  11     25     25     26     Ljava/lang/IllegalStateException;
        //  5      17     20     21     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0085:
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
    
    private Object a() {
        return this.s[this.t - 1];
    }
    
    private Object b() {
        final Object[] s = this.s;
        final int t = this.t - 1;
        this.t = t;
        final Object o = s[t];
        this.s[this.t] = null;
        return o;
    }
    
    private void a(final p obj) {
        try {
            if (this.g() != obj) {
                throw new IllegalStateException("Expected " + obj + " but was " + this.g() + this.g());
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public String k() {
        final boolean ab = rf.ab;
        this.a(uiztfzghuzt.p.NAME);
        final Map.Entry<String, V> entry = ((Iterator)this.a()).next();
        final String s = entry.getKey();
        String s2 = null;
        boolean a = false;
        Label_0084: {
            Label_0078: {
                try {
                    this.u[this.t - 1] = s;
                    this.a(entry.getValue());
                    s2 = s;
                    if (!ab) {
                        return s2;
                    }
                    final boolean b = nb.a;
                    if (b) {
                        break Label_0078;
                    }
                    break Label_0078;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                try {
                    final boolean b = nb.a;
                    if (b) {
                        a = false;
                        break Label_0084;
                    }
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
            }
            a = true;
        }
        nb.a = a;
        return s2;
    }
    
    @Override
    public String l() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokevirtual   uiztfzghuzt/cg.g:()Luiztfzghuzt/p;
        //     8: astore_1       
        //     9: aload_1        
        //    10: iload_3        
        //    11: ifne            93
        //    14: getstatic       uiztfzghuzt/p.STRING:Luiztfzghuzt/p;
        //    17: if_acmpeq       89
        //    20: goto            24
        //    23: athrow         
        //    24: aload_1        
        //    25: iload_3        
        //    26: ifne            93
        //    29: goto            33
        //    32: athrow         
        //    33: getstatic       uiztfzghuzt/p.NUMBER:Luiztfzghuzt/p;
        //    36: if_acmpeq       89
        //    39: goto            43
        //    42: athrow         
        //    43: new             Ljava/lang/IllegalStateException;
        //    46: dup            
        //    47: new             Ljava/lang/StringBuilder;
        //    50: dup            
        //    51: invokespecial   java/lang/StringBuilder.<init>:()V
        //    54: ldc             "Expected "
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: getstatic       uiztfzghuzt/p.STRING:Luiztfzghuzt/p;
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    65: ldc             " but was "
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: aload_1        
        //    71: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    74: aload_0        
        //    75: invokespecial   uiztfzghuzt/cg.g:()Ljava/lang/String;
        //    78: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    81: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    84: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    87: athrow         
        //    88: athrow         
        //    89: aload_0        
        //    90: invokespecial   uiztfzghuzt/cg.b:()Ljava/lang/Object;
        //    93: checkcast       Luiztfzghuzt/jb;
        //    96: invokevirtual   uiztfzghuzt/jb.h:()Ljava/lang/String;
        //    99: astore_2       
        //   100: aload_0        
        //   101: iload_3        
        //   102: ifne            120
        //   105: getfield        uiztfzghuzt/cg.t:I
        //   108: ifle            134
        //   111: goto            115
        //   114: athrow         
        //   115: aload_0        
        //   116: goto            120
        //   119: athrow         
        //   120: getfield        uiztfzghuzt/cg.v:[I
        //   123: aload_0        
        //   124: getfield        uiztfzghuzt/cg.t:I
        //   127: iconst_1       
        //   128: isub           
        //   129: dup2           
        //   130: iaload         
        //   131: iconst_1       
        //   132: iadd           
        //   133: iastore        
        //   134: aload_2        
        //   135: areturn        
        //    StackMapTable: 00 0E FF 00 17 00 04 07 00 02 07 00 15 00 01 00 01 07 00 30 00 47 07 00 30 40 07 00 15 48 07 00 30 00 6C 07 00 30 00 43 07 00 87 FF 00 14 00 04 07 00 02 07 00 15 07 00 A3 01 00 01 07 00 30 00 43 07 00 30 40 07 00 02 0D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  105    116    119    120    Ljava/lang/IllegalStateException;
        //  100    111    114    115    Ljava/lang/IllegalStateException;
        //  33     88     88     89     Ljava/lang/IllegalStateException;
        //  24     39     42     43     Ljava/lang/IllegalStateException;
        //  14     29     32     33     Ljava/lang/IllegalStateException;
        //  9      20     23     24     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    public boolean m() {
        this.a(uiztfzghuzt.p.BOOLEAN);
        final boolean g = ((jb)this.b()).g();
        Label_0035: {
            int n;
            try {
                final boolean t;
                n = ((t = (this.t != 0)) ? 1 : 0);
                if (rf.ab) {
                    return t;
                }
                if (n > 0) {
                    break Label_0035;
                }
                return g;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                if (n > 0) {
                    final int[] v = this.v;
                    final int n2 = this.t - 1;
                    ++v[n2];
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        return g;
    }
    
    @Override
    public void n() {
        cg cg = null;
        Label_0029: {
            try {
                this.a(uiztfzghuzt.p.NULL);
                this.b();
                cg = this;
                if (rf.ab) {
                    break Label_0029;
                }
                final int n = this.t;
                if (n > 0) {
                    break Label_0029;
                }
                return;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final int n = this.t;
                if (n <= 0) {
                    return;
                }
                cg = this;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        final int[] v = cg.v;
        final int n2 = this.t - 1;
        ++v[n2];
    }
    
    @Override
    public double o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_0        
        //     6: invokevirtual   uiztfzghuzt/cg.g:()Luiztfzghuzt/p;
        //     9: astore_1       
        //    10: aload_1        
        //    11: iload           4
        //    13: ifne            96
        //    16: getstatic       uiztfzghuzt/p.NUMBER:Luiztfzghuzt/p;
        //    19: if_acmpeq       92
        //    22: goto            26
        //    25: athrow         
        //    26: aload_1        
        //    27: iload           4
        //    29: ifne            96
        //    32: goto            36
        //    35: athrow         
        //    36: getstatic       uiztfzghuzt/p.STRING:Luiztfzghuzt/p;
        //    39: if_acmpeq       92
        //    42: goto            46
        //    45: athrow         
        //    46: new             Ljava/lang/IllegalStateException;
        //    49: dup            
        //    50: new             Ljava/lang/StringBuilder;
        //    53: dup            
        //    54: invokespecial   java/lang/StringBuilder.<init>:()V
        //    57: ldc             "Expected "
        //    59: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    62: getstatic       uiztfzghuzt/p.NUMBER:Luiztfzghuzt/p;
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    68: ldc             " but was "
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    73: aload_1        
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    77: aload_0        
        //    78: invokespecial   uiztfzghuzt/cg.g:()Ljava/lang/String;
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    87: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    90: athrow         
        //    91: athrow         
        //    92: aload_0        
        //    93: invokespecial   uiztfzghuzt/cg.a:()Ljava/lang/Object;
        //    96: checkcast       Luiztfzghuzt/jb;
        //    99: invokevirtual   uiztfzghuzt/jb.k:()D
        //   102: dstore_2       
        //   103: aload_0        
        //   104: invokevirtual   uiztfzghuzt/cg.a:()Z
        //   107: iload           4
        //   109: ifne            205
        //   112: ifne            187
        //   115: goto            119
        //   118: athrow         
        //   119: dload_2        
        //   120: invokestatic    java/lang/Double.isNaN:(D)Z
        //   123: iload           4
        //   125: ifne            147
        //   128: goto            132
        //   131: athrow         
        //   132: ifne            159
        //   135: goto            139
        //   138: athrow         
        //   139: dload_2        
        //   140: invokestatic    java/lang/Double.isInfinite:(D)Z
        //   143: goto            147
        //   146: athrow         
        //   147: iload           4
        //   149: ifne            205
        //   152: ifeq            187
        //   155: goto            159
        //   158: athrow         
        //   159: new             Ljava/lang/NumberFormatException;
        //   162: dup            
        //   163: new             Ljava/lang/StringBuilder;
        //   166: dup            
        //   167: invokespecial   java/lang/StringBuilder.<init>:()V
        //   170: ldc             "JSON forbids NaN and infinities: "
        //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   175: dload_2        
        //   176: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   179: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   182: invokespecial   java/lang/NumberFormatException.<init>:(Ljava/lang/String;)V
        //   185: athrow         
        //   186: athrow         
        //   187: aload_0        
        //   188: invokespecial   uiztfzghuzt/cg.b:()Ljava/lang/Object;
        //   191: pop            
        //   192: aload_0        
        //   193: iload           4
        //   195: ifne            209
        //   198: getfield        uiztfzghuzt/cg.t:I
        //   201: goto            205
        //   204: athrow         
        //   205: ifle            223
        //   208: aload_0        
        //   209: getfield        uiztfzghuzt/cg.v:[I
        //   212: aload_0        
        //   213: getfield        uiztfzghuzt/cg.t:I
        //   216: iconst_1       
        //   217: isub           
        //   218: dup2           
        //   219: iaload         
        //   220: iconst_1       
        //   221: iadd           
        //   222: iastore        
        //   223: dload_2        
        //   224: dreturn        
        //    StackMapTable: 00 19 FF 00 19 00 05 07 00 02 07 00 15 00 00 01 00 01 07 00 30 00 48 07 00 30 40 07 00 15 48 07 00 30 00 6C 07 00 30 00 43 07 00 87 FF 00 15 00 04 07 00 02 07 00 15 03 01 00 01 07 00 30 00 4B 07 00 30 40 01 45 07 00 30 00 46 07 00 30 40 01 4A 07 00 30 00 5A 07 00 30 00 50 07 00 30 40 01 43 07 00 02 0D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  187    201    204    205    Ljava/lang/IllegalStateException;
        //  152    186    186    187    Ljava/lang/IllegalStateException;
        //  147    155    158    159    Ljava/lang/IllegalStateException;
        //  132    143    146    147    Ljava/lang/IllegalStateException;
        //  119    135    138    139    Ljava/lang/IllegalStateException;
        //  112    128    131    132    Ljava/lang/IllegalStateException;
        //  103    115    118    119    Ljava/lang/IllegalStateException;
        //  36     91     91     92     Ljava/lang/IllegalStateException;
        //  26     42     45     46     Ljava/lang/IllegalStateException;
        //  16     32     35     36     Ljava/lang/IllegalStateException;
        //  10     22     25     26     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    public long p() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_0        
        //     6: invokevirtual   uiztfzghuzt/cg.g:()Luiztfzghuzt/p;
        //     9: astore_1       
        //    10: aload_1        
        //    11: iload           4
        //    13: ifne            96
        //    16: getstatic       uiztfzghuzt/p.NUMBER:Luiztfzghuzt/p;
        //    19: if_acmpeq       92
        //    22: goto            26
        //    25: athrow         
        //    26: aload_1        
        //    27: iload           4
        //    29: ifne            96
        //    32: goto            36
        //    35: athrow         
        //    36: getstatic       uiztfzghuzt/p.STRING:Luiztfzghuzt/p;
        //    39: if_acmpeq       92
        //    42: goto            46
        //    45: athrow         
        //    46: new             Ljava/lang/IllegalStateException;
        //    49: dup            
        //    50: new             Ljava/lang/StringBuilder;
        //    53: dup            
        //    54: invokespecial   java/lang/StringBuilder.<init>:()V
        //    57: ldc             "Expected "
        //    59: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    62: getstatic       uiztfzghuzt/p.NUMBER:Luiztfzghuzt/p;
        //    65: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    68: ldc             " but was "
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    73: aload_1        
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    77: aload_0        
        //    78: invokespecial   uiztfzghuzt/cg.g:()Ljava/lang/String;
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    87: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    90: athrow         
        //    91: athrow         
        //    92: aload_0        
        //    93: invokespecial   uiztfzghuzt/cg.a:()Ljava/lang/Object;
        //    96: checkcast       Luiztfzghuzt/jb;
        //    99: invokevirtual   uiztfzghuzt/jb.l:()J
        //   102: lstore_2       
        //   103: aload_0        
        //   104: invokespecial   uiztfzghuzt/cg.b:()Ljava/lang/Object;
        //   107: pop            
        //   108: aload_0        
        //   109: iload           4
        //   111: ifne            129
        //   114: getfield        uiztfzghuzt/cg.t:I
        //   117: ifle            143
        //   120: goto            124
        //   123: athrow         
        //   124: aload_0        
        //   125: goto            129
        //   128: athrow         
        //   129: getfield        uiztfzghuzt/cg.v:[I
        //   132: aload_0        
        //   133: getfield        uiztfzghuzt/cg.t:I
        //   136: iconst_1       
        //   137: isub           
        //   138: dup2           
        //   139: iaload         
        //   140: iconst_1       
        //   141: iadd           
        //   142: iastore        
        //   143: lload_2        
        //   144: lreturn        
        //    StackMapTable: 00 0E FF 00 19 00 05 07 00 02 07 00 15 00 00 01 00 01 07 00 30 00 48 07 00 30 40 07 00 15 48 07 00 30 00 6C 07 00 30 00 43 07 00 87 FF 00 1A 00 04 07 00 02 07 00 15 04 01 00 01 07 00 30 00 43 07 00 30 40 07 00 02 0D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  114    125    128    129    Ljava/lang/IllegalStateException;
        //  103    120    123    124    Ljava/lang/IllegalStateException;
        //  36     91     91     92     Ljava/lang/IllegalStateException;
        //  26     42     45     46     Ljava/lang/IllegalStateException;
        //  16     32     35     36     Ljava/lang/IllegalStateException;
        //  10     22     25     26     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    public int s() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokevirtual   uiztfzghuzt/cg.g:()Luiztfzghuzt/p;
        //     8: astore_1       
        //     9: aload_1        
        //    10: iload_3        
        //    11: ifne            93
        //    14: getstatic       uiztfzghuzt/p.NUMBER:Luiztfzghuzt/p;
        //    17: if_acmpeq       89
        //    20: goto            24
        //    23: athrow         
        //    24: aload_1        
        //    25: iload_3        
        //    26: ifne            93
        //    29: goto            33
        //    32: athrow         
        //    33: getstatic       uiztfzghuzt/p.STRING:Luiztfzghuzt/p;
        //    36: if_acmpeq       89
        //    39: goto            43
        //    42: athrow         
        //    43: new             Ljava/lang/IllegalStateException;
        //    46: dup            
        //    47: new             Ljava/lang/StringBuilder;
        //    50: dup            
        //    51: invokespecial   java/lang/StringBuilder.<init>:()V
        //    54: ldc             "Expected "
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: getstatic       uiztfzghuzt/p.NUMBER:Luiztfzghuzt/p;
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    65: ldc             " but was "
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: aload_1        
        //    71: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    74: aload_0        
        //    75: invokespecial   uiztfzghuzt/cg.g:()Ljava/lang/String;
        //    78: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    81: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    84: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    87: athrow         
        //    88: athrow         
        //    89: aload_0        
        //    90: invokespecial   uiztfzghuzt/cg.a:()Ljava/lang/Object;
        //    93: checkcast       Luiztfzghuzt/jb;
        //    96: invokevirtual   uiztfzghuzt/jb.m:()I
        //    99: istore_2       
        //   100: aload_0        
        //   101: invokespecial   uiztfzghuzt/cg.b:()Ljava/lang/Object;
        //   104: pop            
        //   105: aload_0        
        //   106: getfield        uiztfzghuzt/cg.t:I
        //   109: iload_3        
        //   110: ifne            140
        //   113: ifle            139
        //   116: goto            120
        //   119: athrow         
        //   120: aload_0        
        //   121: getfield        uiztfzghuzt/cg.v:[I
        //   124: aload_0        
        //   125: getfield        uiztfzghuzt/cg.t:I
        //   128: iconst_1       
        //   129: isub           
        //   130: dup2           
        //   131: iaload         
        //   132: iconst_1       
        //   133: iadd           
        //   134: iastore        
        //   135: goto            139
        //   138: athrow         
        //   139: iload_2        
        //   140: ireturn        
        //    StackMapTable: 00 0E FF 00 17 00 04 07 00 02 07 00 15 00 01 00 01 07 00 30 00 47 07 00 30 40 07 00 15 48 07 00 30 00 6C 07 00 30 00 43 07 00 87 FF 00 19 00 04 07 00 02 07 00 15 01 01 00 01 07 00 30 00 51 07 00 30 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  113    135    138    139    Ljava/lang/IllegalStateException;
        //  100    116    119    120    Ljava/lang/IllegalStateException;
        //  33     88     88     89     Ljava/lang/IllegalStateException;
        //  24     39     42     43     Ljava/lang/IllegalStateException;
        //  14     29     32     33     Ljava/lang/IllegalStateException;
        //  9      20     23     24     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    public void close() {
        this.s = new Object[] { cg.r };
        this.t = 1;
    }
    
    @Override
    public void t() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   uiztfzghuzt/cg.g:()Luiztfzghuzt/p;
        //     8: iload_1        
        //     9: ifne            56
        //    12: getstatic       uiztfzghuzt/p.NAME:Luiztfzghuzt/p;
        //    15: if_acmpne       48
        //    18: goto            22
        //    21: athrow         
        //    22: aload_0        
        //    23: invokevirtual   uiztfzghuzt/cg.k:()Ljava/lang/String;
        //    26: pop            
        //    27: aload_0        
        //    28: getfield        uiztfzghuzt/cg.u:[Ljava/lang/String;
        //    31: aload_0        
        //    32: getfield        uiztfzghuzt/cg.t:I
        //    35: iconst_2       
        //    36: isub           
        //    37: ldc             "null"
        //    39: aastore        
        //    40: iload_1        
        //    41: ifeq            89
        //    44: goto            48
        //    47: athrow         
        //    48: aload_0        
        //    49: invokespecial   uiztfzghuzt/cg.b:()Ljava/lang/Object;
        //    52: goto            56
        //    55: athrow         
        //    56: pop            
        //    57: aload_0        
        //    58: getfield        uiztfzghuzt/cg.t:I
        //    61: iload_1        
        //    62: ifne            101
        //    65: ifle            89
        //    68: goto            72
        //    71: athrow         
        //    72: aload_0        
        //    73: getfield        uiztfzghuzt/cg.u:[Ljava/lang/String;
        //    76: aload_0        
        //    77: getfield        uiztfzghuzt/cg.t:I
        //    80: iconst_1       
        //    81: isub           
        //    82: ldc             "null"
        //    84: aastore        
        //    85: goto            89
        //    88: athrow         
        //    89: aload_0        
        //    90: iload_1        
        //    91: ifne            105
        //    94: getfield        uiztfzghuzt/cg.t:I
        //    97: goto            101
        //   100: athrow         
        //   101: ifle            119
        //   104: aload_0        
        //   105: getfield        uiztfzghuzt/cg.v:[I
        //   108: aload_0        
        //   109: getfield        uiztfzghuzt/cg.t:I
        //   112: iconst_1       
        //   113: isub           
        //   114: dup2           
        //   115: iaload         
        //   116: iconst_1       
        //   117: iadd           
        //   118: iastore        
        //   119: return         
        //    StackMapTable: 00 0E FF 00 15 00 02 07 00 02 01 00 01 07 00 30 00 58 07 00 30 00 46 07 00 30 40 07 00 87 4E 07 00 30 00 4F 07 00 30 00 4A 07 00 30 40 01 43 07 00 02 0D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  89     97     100    101    Ljava/lang/IllegalStateException;
        //  65     85     88     89     Ljava/lang/IllegalStateException;
        //  56     68     71     72     Ljava/lang/IllegalStateException;
        //  22     52     55     56     Ljava/lang/IllegalStateException;
        //  12     44     47     48     Ljava/lang/IllegalStateException;
        //  4      18     21     22     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
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
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    public void f() {
        this.a(uiztfzghuzt.p.NAME);
        final Map.Entry<K, Object> entry = ((Iterator)this.a()).next();
        this.a(entry.getValue());
        this.a(new jb((String)entry.getKey()));
    }
    
    private void a(final Object o) {
        cg cg = null;
        Label_0112: {
            Label_0111: {
                try {
                    cg = this;
                    if (rf.ab) {
                        break Label_0112;
                    }
                    if (this.t != this.s.length) {
                        break Label_0111;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final Object[] s = new Object[this.t * 2];
                final int[] v = new int[this.t * 2];
                final String[] u = new String[this.t * 2];
                System.arraycopy(this.s, 0, s, 0, this.t);
                System.arraycopy(this.v, 0, v, 0, this.t);
                System.arraycopy(this.u, 0, u, 0, this.t);
                this.s = s;
                this.v = v;
                this.u = u;
            }
            cg = this;
        }
        cg.s[this.t++] = o;
    }
    
    @Override
    public String x() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: bipush          36
        //    13: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    16: astore_1       
        //    17: iconst_0       
        //    18: istore_2       
        //    19: iload_2        
        //    20: aload_0        
        //    21: getfield        uiztfzghuzt/cg.t:I
        //    24: if_icmpge       196
        //    27: aload_0        
        //    28: getfield        uiztfzghuzt/cg.s:[Ljava/lang/Object;
        //    31: iload_2        
        //    32: aaload         
        //    33: instanceof      Luiztfzghuzt/gb;
        //    36: iload_3        
        //    37: ifne            108
        //    40: ifeq            95
        //    43: goto            47
        //    46: athrow         
        //    47: aload_0        
        //    48: getfield        uiztfzghuzt/cg.s:[Ljava/lang/Object;
        //    51: iinc            2, 1
        //    54: iload_2        
        //    55: aaload         
        //    56: instanceof      Ljava/util/Iterator;
        //    59: ifeq            189
        //    62: goto            66
        //    65: athrow         
        //    66: aload_1        
        //    67: bipush          91
        //    69: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    72: aload_0        
        //    73: getfield        uiztfzghuzt/cg.v:[I
        //    76: iload_2        
        //    77: iaload         
        //    78: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    81: bipush          93
        //    83: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    86: pop            
        //    87: iload_3        
        //    88: ifeq            189
        //    91: goto            95
        //    94: athrow         
        //    95: aload_0        
        //    96: getfield        uiztfzghuzt/cg.s:[Ljava/lang/Object;
        //    99: iload_2        
        //   100: aaload         
        //   101: instanceof      Luiztfzghuzt/ib;
        //   104: goto            108
        //   107: athrow         
        //   108: iload_3        
        //   109: ifne            143
        //   112: ifeq            189
        //   115: goto            119
        //   118: athrow         
        //   119: aload_0        
        //   120: iload_3        
        //   121: ifne            166
        //   124: goto            128
        //   127: athrow         
        //   128: getfield        uiztfzghuzt/cg.s:[Ljava/lang/Object;
        //   131: iinc            2, 1
        //   134: iload_2        
        //   135: aaload         
        //   136: instanceof      Ljava/util/Iterator;
        //   139: goto            143
        //   142: athrow         
        //   143: ifeq            189
        //   146: aload_1        
        //   147: bipush          46
        //   149: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   152: pop            
        //   153: iload_3        
        //   154: ifne            192
        //   157: goto            161
        //   160: athrow         
        //   161: aload_0        
        //   162: goto            166
        //   165: athrow         
        //   166: getfield        uiztfzghuzt/cg.u:[Ljava/lang/String;
        //   169: iload_2        
        //   170: aaload         
        //   171: ifnull          189
        //   174: aload_1        
        //   175: aload_0        
        //   176: getfield        uiztfzghuzt/cg.u:[Ljava/lang/String;
        //   179: iload_2        
        //   180: aaload         
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: pop            
        //   185: goto            189
        //   188: athrow         
        //   189: iinc            2, 1
        //   192: iload_3        
        //   193: ifeq            19
        //   196: aload_1        
        //   197: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   200: areturn        
        //    StackMapTable: 00 17 FE 00 13 07 00 89 01 01 5A 07 00 30 00 51 07 00 30 00 5B 07 00 30 00 4B 07 00 30 40 01 49 07 00 30 00 47 07 00 30 40 07 00 02 4D 07 00 30 40 01 50 07 00 30 00 43 07 00 30 40 07 00 02 55 07 00 30 00 02 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  166    185    188    189    Ljava/lang/IllegalStateException;
        //  146    162    165    166    Ljava/lang/IllegalStateException;
        //  143    157    160    161    Ljava/lang/IllegalStateException;
        //  119    139    142    143    Ljava/lang/IllegalStateException;
        //  112    124    127    128    Ljava/lang/IllegalStateException;
        //  108    115    118    119    Ljava/lang/IllegalStateException;
        //  66     104    107    108    Ljava/lang/IllegalStateException;
        //  47     91     94     95     Ljava/lang/IllegalStateException;
        //  40     62     65     66     Ljava/lang/IllegalStateException;
        //  27     43     46     47     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0047:
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
    
    private String g() {
        return " at path " + this.x();
    }
    
    static {
        final String[] array = new String[6];
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = 0))));
        String s = "{\u0018\u0014\n\u0002:\r\b\n";
        int n7 = -1;
        String intern = null;
    Label_0129_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n9;
            final int n8 = n9 = (length = charArray.length);
            int n10 = 0;
            while (true) {
                Label_0206: {
                    if (n8 > 1) {
                        break Label_0206;
                    }
                    length = (n9 = n10);
                    do {
                        final char c = charArray[n9];
                        char c2 = '\0';
                        switch (n10 % 5) {
                            case 0: {
                                c2 = '[';
                                break;
                            }
                            case 1: {
                                c2 = 'y';
                                break;
                            }
                            case 2: {
                                c2 = '`';
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
                        ++n10;
                    } while (n8 == 0);
                }
                if (n8 > n10) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n7) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 1)))));
                    s = "\u001e\u0001\u0010O\u0011/\u001c\u0004\n";
                    n7 = 0;
                    continue Label_0129_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 2)))));
                    s = "{\u001b\u0015^R,\u0018\u0013\n";
                    n7 = 1;
                    continue Label_0129_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 3)))));
                    s = "\u0011*/dR=\u0016\u0012H\u001b?\n@d\u0013\u0015Y\u0001D\u0016{\u0010\u000eL\u001b5\u0010\u0014C\u0017(C@";
                    n7 = 2;
                    continue Label_0129_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 4)))));
                    s = "5\f\fF";
                    n7 = 3;
                    continue Label_0129_Outer;
                }
                case 3: {
                    array[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 5)))));
                    s = "\u0011\n\u000fD >\u0018\u0004O\u0000{\u0010\u0013\n\u00117\u0016\u0013O\u0016";
                    n7 = 4;
                    continue Label_0129_Outer;
                }
                case 4: {
                    break Label_0129_Outer;
                }
            }
        }
        array[n6] = intern;
        z = new String[] { " at path ", "Expected ", " but was ", "JSON forbids NaN and infinities: ", "null", "JsonReader is closed" };
        q = new e();
        r = new Object();
    }
}
