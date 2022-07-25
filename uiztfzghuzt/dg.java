// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.io.Writer;
import java.io.Flushable;
import java.io.Closeable;

public class dg implements Closeable, Flushable
{
    private static final String[] a;
    private static final String[] b;
    private final Writer c;
    private int[] d;
    private int e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private boolean k;
    public static int l;
    private static final String[] z;
    
    public dg(final Writer c) {
        this.d = new int[32];
        this.e = 0;
        this.a(6);
        this.g = ":";
        this.k = true;
        if (dg.l == 0) {
            try {
                if (c == null) {
                    throw new NullPointerException("out == null");
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            this.c = c;
        }
    }
    
    public final void a(final boolean h) {
        this.h = h;
    }
    
    public boolean a() {
        return this.h;
    }
    
    public final boolean b() {
        return this.k;
    }
    
    public dg c() {
        this.h();
        return this.a(1, "[");
    }
    
    public dg d() {
        return this.a(1, 2, "]");
    }
    
    public dg e() {
        this.h();
        return this.a(3, "{");
    }
    
    public dg f() {
        return this.a(3, 5, "}");
    }
    
    private dg a(final int n, final String str) {
        this.l();
        this.a(n);
        this.c.write(str);
        return this;
    }
    
    private dg a(final int n, final int n2, final String str) {
        final int l = dg.l;
        final int g = this.g();
        Label_0119: {
            Label_0095: {
                Label_0063: {
                    Label_0047: {
                        Label_0033: {
                            int n4 = 0;
                            int n5 = 0;
                            Label_0026: {
                                int n3;
                                try {
                                    n3 = (n4 = g);
                                    n5 = n2;
                                    if (l != 0) {
                                        break Label_0033;
                                    }
                                    if (n3 != n2) {
                                        break Label_0026;
                                    }
                                    break Label_0047;
                                }
                                catch (NullPointerException ex) {
                                    throw ex;
                                }
                                try {
                                    if (n3 == n2) {
                                        break Label_0047;
                                    }
                                    n4 = g;
                                    n5 = n;
                                }
                                catch (NullPointerException ex2) {
                                    throw ex2;
                                }
                            }
                            try {
                                if (n4 != n5) {
                                    throw new IllegalStateException("Nesting problem.");
                                }
                            }
                            catch (NullPointerException ex3) {
                                throw ex3;
                            }
                        }
                        try {
                            final dg dg = this;
                            final dg dg2 = this;
                            if (l != 0) {
                                break Label_0095;
                            }
                            final String s = this.j;
                            if (s != null) {
                                break Label_0063;
                            }
                            break Label_0063;
                        }
                        catch (NullPointerException ex4) {
                            throw ex4;
                        }
                    }
                    try {
                        final String s = this.j;
                        if (s != null) {
                            throw new IllegalStateException("Dangling name: " + this.j);
                        }
                    }
                    catch (NullPointerException ex5) {
                        throw ex5;
                    }
                }
                final dg dg = this;
                final dg dg2 = this;
                try {
                    dg.e = dg2.e - 1;
                    if (l != 0) {
                        return this;
                    }
                    final int n6 = g;
                    final int n7 = n2;
                    if (n6 == n7) {
                        break Label_0119;
                    }
                    break Label_0119;
                }
                catch (NullPointerException ex6) {
                    throw ex6;
                }
            }
            try {
                final int n6 = g;
                final int n7 = n2;
                if (n6 == n7) {
                    this.j();
                }
            }
            catch (NullPointerException ex7) {
                throw ex7;
            }
        }
        this.c.write(str);
        return this;
    }
    
    private void a(final int n) {
        dg dg = null;
        Label_0051: {
            Label_0050: {
                try {
                    dg = this;
                    if (uiztfzghuzt.dg.l != 0) {
                        break Label_0051;
                    }
                    if (this.e != this.d.length) {
                        break Label_0050;
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                final int[] d = new int[this.e * 2];
                System.arraycopy(this.d, 0, d, 0, this.e);
                this.d = d;
            }
            dg = this;
        }
        dg.d[this.e++] = n;
    }
    
    private int g() {
        Label_0017: {
            int n;
            try {
                final int e;
                n = (e = this.e);
                if (dg.l != 0) {
                    return e;
                }
                if (n == 0) {
                    break Label_0017;
                }
                return this.d[this.e - 1];
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                if (n == 0) {
                    throw new IllegalStateException("JsonWriter is closed.");
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        return this.d[this.e - 1];
    }
    
    private void b(final int n) {
        this.d[this.e - 1] = n;
    }
    
    public dg a(final String j) {
        final int l = dg.l;
        Label_0066: {
            dg dg2 = null;
            Label_0052: {
                Label_0039: {
                    String i = null;
                    Label_0027: {
                        Label_0016: {
                            try {
                                i = j;
                                if (l != 0) {
                                    break Label_0039;
                                }
                                if (j == null) {
                                    break Label_0016;
                                }
                                break Label_0027;
                            }
                            catch (NullPointerException ex) {
                                throw ex;
                            }
                            try {
                                if (j == null) {
                                    throw new NullPointerException("name == null");
                                }
                            }
                            catch (NullPointerException ex2) {
                                throw ex2;
                            }
                        }
                        try {
                            final dg dg = this;
                            dg2 = this;
                            if (l != 0) {
                                break Label_0052;
                            }
                            i = this.j;
                        }
                        catch (NullPointerException ex3) {
                            throw ex3;
                        }
                    }
                    try {
                        if (i != null) {
                            throw new IllegalStateException();
                        }
                    }
                    catch (NullPointerException ex4) {
                        throw ex4;
                    }
                }
                final dg dg = this;
                dg2 = this;
                try {
                    if (l != 0) {
                        return dg;
                    }
                    final int n = dg2.e;
                    if (n == 0) {
                        break Label_0066;
                    }
                    break Label_0066;
                }
                catch (NullPointerException ex5) {
                    throw ex5;
                }
            }
            try {
                final int n = dg2.e;
                if (n == 0) {
                    throw new IllegalStateException("JsonWriter is closed.");
                }
            }
            catch (NullPointerException ex6) {
                throw ex6;
            }
        }
        this.j = j;
        return this;
    }
    
    private void h() {
        dg dg = null;
        Label_0017: {
            try {
                dg = this;
                if (uiztfzghuzt.dg.l != 0) {
                    break Label_0017;
                }
                final String s = this.j;
                if (s != null) {
                    break Label_0017;
                }
                return;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                final String s = this.j;
                if (s == null) {
                    return;
                }
                this.k();
                this.c(this.j);
                dg = this;
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        dg.j = null;
    }
    
    public dg b(final String s) {
        Label_0014: {
            try {
                if (dg.l != 0) {
                    return this;
                }
                final String s2 = s;
                if (s2 == null) {
                    break Label_0014;
                }
                break Label_0014;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                final String s2 = s;
                if (s2 == null) {
                    return this.i();
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        this.h();
        this.l();
        this.c(s);
        return this;
    }
    
    public dg i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: iload_1        
        //     6: ifne            75
        //     9: getfield        uiztfzghuzt/dg.j:Ljava/lang/String;
        //    12: ifnull          61
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0        
        //    20: iload_1        
        //    21: ifne            60
        //    24: goto            28
        //    27: athrow         
        //    28: getfield        uiztfzghuzt/dg.k:Z
        //    31: ifeq            50
        //    34: goto            38
        //    37: athrow         
        //    38: aload_0        
        //    39: invokespecial   uiztfzghuzt/dg.h:()V
        //    42: iload_1        
        //    43: ifeq            61
        //    46: goto            50
        //    49: athrow         
        //    50: aload_0        
        //    51: aconst_null    
        //    52: putfield        uiztfzghuzt/dg.j:Ljava/lang/String;
        //    55: aload_0        
        //    56: goto            60
        //    59: athrow         
        //    60: areturn        
        //    61: aload_0        
        //    62: invokespecial   uiztfzghuzt/dg.l:()V
        //    65: aload_0        
        //    66: getfield        uiztfzghuzt/dg.c:Ljava/io/Writer;
        //    69: ldc             "null"
        //    71: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //    74: aload_0        
        //    75: areturn        
        //    StackMapTable: 00 0C FF 00 12 00 02 07 00 02 01 00 01 07 00 1F 00 47 07 00 1F 40 07 00 02 48 07 00 1F 00 4A 07 00 1F 00 48 07 00 1F 40 07 00 02 00 4D 07 00 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  38     56     59     60     Ljava/lang/NullPointerException;
        //  28     46     49     50     Ljava/lang/NullPointerException;
        //  19     34     37     38     Ljava/lang/NullPointerException;
        //  9      24     27     28     Ljava/lang/NullPointerException;
        //  4      15     18     19     Ljava/lang/NullPointerException;
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
    
    public dg b(final boolean b) {
        Writer c = null;
        String str = null;
        Label_0024: {
            try {
                this.h();
                this.l();
                c = this.c;
                if (b) {
                    str = "true";
                    break Label_0024;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            str = "false";
        }
        c.write(str);
        return this;
    }
    
    public dg a(final Boolean b) {
        Writer c = null;
        String str = null;
        Label_0047: {
            Label_0028: {
                Label_0014: {
                    try {
                        if (dg.l != 0) {
                            break Label_0028;
                        }
                        final Boolean b2 = b;
                        if (b2 == null) {
                            break Label_0014;
                        }
                        break Label_0014;
                    }
                    catch (NullPointerException ex) {
                        throw ex;
                    }
                    try {
                        final Boolean b2 = b;
                        if (b2 == null) {
                            return this.i();
                        }
                    }
                    catch (NullPointerException ex2) {
                        throw ex2;
                    }
                }
                this.h();
                this.l();
                try {
                    c = this.c;
                    if (b) {
                        str = "true";
                        break Label_0047;
                    }
                }
                catch (NullPointerException ex3) {
                    throw ex3;
                }
            }
            str = "false";
        }
        c.write(str);
        return this;
    }
    
    public dg a(final long i) {
        this.h();
        this.l();
        this.c.write(Long.toString(i));
        return this;
    }
    
    public dg a(final Number p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_1        
        //     5: iload_3        
        //     6: ifne            27
        //     9: ifnonnull       22
        //    12: goto            16
        //    15: athrow         
        //    16: aload_0        
        //    17: invokevirtual   uiztfzghuzt/dg.i:()Luiztfzghuzt/dg;
        //    20: areturn        
        //    21: athrow         
        //    22: aload_0        
        //    23: invokespecial   uiztfzghuzt/dg.h:()V
        //    26: aload_1        
        //    27: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    30: astore_2       
        //    31: aload_0        
        //    32: iload_3        
        //    33: ifne            143
        //    36: getfield        uiztfzghuzt/dg.h:Z
        //    39: ifne            129
        //    42: goto            46
        //    45: athrow         
        //    46: aload_2        
        //    47: ldc             "-Infinity"
        //    49: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    52: iload_3        
        //    53: ifne            77
        //    56: goto            60
        //    59: athrow         
        //    60: ifne            101
        //    63: goto            67
        //    66: athrow         
        //    67: aload_2        
        //    68: ldc             "Infinity"
        //    70: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    73: goto            77
        //    76: athrow         
        //    77: iload_3        
        //    78: ifne            98
        //    81: ifne            101
        //    84: goto            88
        //    87: athrow         
        //    88: aload_2        
        //    89: ldc             "NaN"
        //    91: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    94: goto            98
        //    97: athrow         
        //    98: ifeq            129
        //   101: new             Ljava/lang/IllegalArgumentException;
        //   104: dup            
        //   105: new             Ljava/lang/StringBuilder;
        //   108: dup            
        //   109: invokespecial   java/lang/StringBuilder.<init>:()V
        //   112: ldc             "Numeric values must be finite, but was "
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: aload_1        
        //   118: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   121: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   124: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   127: athrow         
        //   128: athrow         
        //   129: aload_0        
        //   130: invokespecial   uiztfzghuzt/dg.l:()V
        //   133: aload_0        
        //   134: getfield        uiztfzghuzt/dg.c:Ljava/io/Writer;
        //   137: aload_2        
        //   138: invokevirtual   java/io/Writer.append:(Ljava/lang/CharSequence;)Ljava/io/Writer;
        //   141: pop            
        //   142: aload_0        
        //   143: areturn        
        //    StackMapTable: 00 15 FF 00 0F 00 04 07 00 02 07 00 AD 00 01 00 01 07 00 1F 00 44 07 00 1F 00 44 07 00 AD FF 00 11 00 04 07 00 02 07 00 AD 07 00 6F 01 00 01 07 00 1F 00 4C 07 00 1F 40 01 45 07 00 1F 00 48 07 00 1F 40 01 49 07 00 1F 00 48 07 00 1F 40 01 02 5A 07 00 1F 00 4D 07 00 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  98     128    128    129    Ljava/lang/NullPointerException;
        //  81     94     97     98     Ljava/lang/NullPointerException;
        //  77     84     87     88     Ljava/lang/NullPointerException;
        //  60     73     76     77     Ljava/lang/NullPointerException;
        //  46     63     66     67     Ljava/lang/NullPointerException;
        //  36     56     59     60     Ljava/lang/NullPointerException;
        //  31     42     45     46     Ljava/lang/NullPointerException;
        //  9      21     21     22     Ljava/lang/NullPointerException;
        //  4      12     15     16     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    public void flush() {
        dg dg = null;
        Label_0029: {
            Label_0017: {
                try {
                    dg = this;
                    if (uiztfzghuzt.dg.l != 0) {
                        break Label_0029;
                    }
                    final int n = this.e;
                    if (n == 0) {
                        break Label_0017;
                    }
                    break Label_0017;
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                try {
                    final int n = this.e;
                    if (n == 0) {
                        throw new IllegalStateException("JsonWriter is closed.");
                    }
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
            }
            dg = this;
        }
        dg.c.flush();
    }
    
    @Override
    public void close() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        uiztfzghuzt/dg.c:Ljava/io/Writer;
        //     8: invokevirtual   java/io/Writer.close:()V
        //    11: aload_0        
        //    12: getfield        uiztfzghuzt/dg.e:I
        //    15: istore_1       
        //    16: iload_1        
        //    17: iconst_1       
        //    18: iload_2        
        //    19: ifne            35
        //    22: if_icmpgt       71
        //    25: goto            29
        //    28: athrow         
        //    29: iload_1        
        //    30: iconst_1       
        //    31: goto            35
        //    34: athrow         
        //    35: iload_2        
        //    36: ifne            68
        //    39: if_icmpne       82
        //    42: goto            46
        //    45: athrow         
        //    46: aload_0        
        //    47: iload_2        
        //    48: ifne            83
        //    51: goto            55
        //    54: athrow         
        //    55: getfield        uiztfzghuzt/dg.d:[I
        //    58: iload_1        
        //    59: iconst_1       
        //    60: isub           
        //    61: iaload         
        //    62: bipush          7
        //    64: goto            68
        //    67: athrow         
        //    68: if_icmpeq       82
        //    71: new             Ljava/io/IOException;
        //    74: dup            
        //    75: ldc             "Incomplete document"
        //    77: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    80: athrow         
        //    81: athrow         
        //    82: aload_0        
        //    83: iconst_0       
        //    84: putfield        uiztfzghuzt/dg.e:I
        //    87: return         
        //    StackMapTable: 00 0E FF 00 1C 00 03 07 00 02 01 01 00 01 07 00 1F 00 44 07 00 1F FF 00 00 00 03 07 00 02 01 01 00 02 01 01 49 07 00 1F 00 47 07 00 1F 40 07 00 02 4B 07 00 1F FF 00 00 00 03 07 00 02 01 01 00 02 01 01 02 49 07 00 1F 00 40 07 00 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  68     81     81     82     Ljava/lang/NullPointerException;
        //  46     64     67     68     Ljava/lang/NullPointerException;
        //  39     51     54     55     Ljava/lang/NullPointerException;
        //  35     42     45     46     Ljava/lang/NullPointerException;
        //  22     31     34     35     Ljava/lang/NullPointerException;
        //  16     25     28     29     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    private void c(final String s) {
        final int l = dg.l;
        String[] array = null;
        Label_0022: {
            try {
                if (this.i) {
                    array = dg.b;
                    break Label_0022;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            array = dg.a;
        }
        final String[] array2 = array;
        this.c.write("\"");
        int n = 0;
        final int length = s.length();
        int i = 0;
        while (true) {
            while (i < length) {
                final char char1 = s.charAt(i);
                Label_0207: {
                    Label_0196: {
                        int n12 = 0;
                        int n14 = 0;
                        Label_0194: {
                            String str = null;
                            Label_0165: {
                                int n11 = 0;
                                int n13 = 0;
                                Label_0150: {
                                    char c = '\0';
                                    int n10 = 0;
                                    Label_0134: {
                                        Label_0113: {
                                            int n2 = 0;
                                            int n5 = 0;
                                            Label_0104: {
                                                Label_0077: {
                                                    try {
                                                        final int n4;
                                                        final int n3;
                                                        n2 = (n3 = (n4 = char1));
                                                        final int n7;
                                                        final int n6;
                                                        n5 = (n6 = (n7 = 128));
                                                        if (l != 0) {
                                                            break Label_0207;
                                                        }
                                                        final int n8 = l;
                                                        if (n8 == 0) {
                                                            break Label_0077;
                                                        }
                                                        break Label_0113;
                                                    }
                                                    catch (NullPointerException ex2) {
                                                        throw ex2;
                                                    }
                                                    try {
                                                        final int n8 = l;
                                                        if (n8 != 0) {
                                                            break Label_0113;
                                                        }
                                                        if (n2 >= n5) {
                                                            break Label_0104;
                                                        }
                                                    }
                                                    catch (NullPointerException ex3) {
                                                        throw ex3;
                                                    }
                                                }
                                                str = array2[char1];
                                                try {
                                                    if (str != null) {
                                                        break Label_0150;
                                                    }
                                                    final int n9 = l;
                                                    if (n9 != 0) {
                                                        break Label_0104;
                                                    }
                                                    break Label_0196;
                                                }
                                                catch (NullPointerException ex4) {
                                                    throw ex4;
                                                }
                                                try {
                                                    final int n9 = l;
                                                    if (n9 == 0) {
                                                        break Label_0196;
                                                    }
                                                    c = char1;
                                                    n10 = '\u2028';
                                                }
                                                catch (NullPointerException ex5) {
                                                    throw ex5;
                                                }
                                            }
                                            try {
                                                if (l != 0) {
                                                    break Label_0134;
                                                }
                                                if (n2 != n5) {
                                                    break Label_0134;
                                                }
                                            }
                                            catch (NullPointerException ex6) {
                                                throw ex6;
                                            }
                                        }
                                        str = "\\u2028";
                                        try {
                                            if (l == 0) {
                                                break Label_0150;
                                            }
                                        }
                                        catch (NullPointerException ex7) {
                                            throw ex7;
                                        }
                                    }
                                    if (c != n10) {
                                        break Label_0196;
                                    }
                                    str = "\\u2029";
                                    try {
                                        n11 = (n12 = n);
                                        n13 = (n14 = i);
                                        if (l != 0) {
                                            break Label_0194;
                                        }
                                        if (n11 < n13) {
                                            break Label_0165;
                                        }
                                        break Label_0165;
                                    }
                                    catch (NullPointerException ex8) {
                                        throw ex8;
                                    }
                                }
                                try {
                                    if (n11 < n13) {
                                        this.c.write(s, n, i - n);
                                    }
                                }
                                catch (NullPointerException ex9) {
                                    throw ex9;
                                }
                            }
                            this.c.write(str);
                            n12 = i;
                            n14 = 1;
                        }
                        n = n12 + n14;
                    }
                    ++i;
                    if (l != 0) {
                        break;
                    }
                    continue;
                    try {
                        final int n4;
                        final int n7;
                        if (n4 < n7) {
                            this.c.write(s, n, length - n);
                        }
                    }
                    catch (NullPointerException ex10) {
                        throw ex10;
                    }
                }
                this.c.write("\"");
                return;
            }
            int n4 = n;
            int n7 = length;
            continue;
        }
    }
    
    private void j() {
        final int l = dg.l;
        dg dg = null;
        Label_0022: {
            Label_0021: {
                try {
                    dg = this;
                    if (l != 0) {
                        break Label_0022;
                    }
                    final String s = this.f;
                    if (s == null) {
                        return;
                    }
                    break Label_0021;
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                try {
                    final String s = this.f;
                    if (s == null) {
                        return;
                    }
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
            }
            dg = this;
        }
        dg.c.write("\n");
        int i = 1;
        while (i < this.e) {
            this.c.write(this.f);
            ++i;
            if (l != 0) {
                break;
            }
        }
    }
    
    private void k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   uiztfzghuzt/dg.g:()I
        //     8: istore_1       
        //     9: iload_1        
        //    10: iconst_5       
        //    11: iload_2        
        //    12: ifne            45
        //    15: if_icmpne       39
        //    18: goto            22
        //    21: athrow         
        //    22: aload_0        
        //    23: getfield        uiztfzghuzt/dg.c:Ljava/io/Writer;
        //    26: bipush          44
        //    28: invokevirtual   java/io/Writer.write:(I)V
        //    31: iload_2        
        //    32: ifeq            59
        //    35: goto            39
        //    38: athrow         
        //    39: iload_1        
        //    40: iconst_3       
        //    41: goto            45
        //    44: athrow         
        //    45: if_icmpeq       59
        //    48: new             Ljava/lang/IllegalStateException;
        //    51: dup            
        //    52: ldc             "Nesting problem."
        //    54: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    57: athrow         
        //    58: athrow         
        //    59: aload_0        
        //    60: invokespecial   uiztfzghuzt/dg.j:()V
        //    63: aload_0        
        //    64: iconst_4       
        //    65: invokespecial   uiztfzghuzt/dg.b:(I)V
        //    68: return         
        //    StackMapTable: 00 08 FF 00 15 00 03 07 00 02 01 01 00 01 07 00 1F 00 4F 07 00 1F 00 44 07 00 1F FF 00 00 00 03 07 00 02 01 01 00 02 01 01 4C 07 00 1F 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  45     58     58     59     Ljava/lang/NullPointerException;
        //  22     41     44     45     Ljava/lang/NullPointerException;
        //  15     35     38     39     Ljava/lang/NullPointerException;
        //  9      18     21     22     Ljava/lang/NullPointerException;
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
    
    private void l() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokespecial   uiztfzghuzt/dg.g:()I
        //     8: iload_1        
        //     9: ifne            73
        //    12: tableswitch {
        //                2: 97
        //                3: 114
        //                4: 161
        //                5: 136
        //                6: 161
        //                7: 87
        //                8: 57
        //          default: 161
        //        }
        //    56: athrow         
        //    57: aload_0        
        //    58: iload_1        
        //    59: ifne            88
        //    62: goto            66
        //    65: athrow         
        //    66: getfield        uiztfzghuzt/dg.h:Z
        //    69: goto            73
        //    72: athrow         
        //    73: ifne            87
        //    76: new             Ljava/lang/IllegalStateException;
        //    79: dup            
        //    80: ldc             "JSON must have only one top-level value."
        //    82: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    85: athrow         
        //    86: athrow         
        //    87: aload_0        
        //    88: bipush          7
        //    90: invokespecial   uiztfzghuzt/dg.b:(I)V
        //    93: iload_1        
        //    94: ifeq            172
        //    97: aload_0        
        //    98: iconst_2       
        //    99: invokespecial   uiztfzghuzt/dg.b:(I)V
        //   102: aload_0        
        //   103: invokespecial   uiztfzghuzt/dg.j:()V
        //   106: iload_1        
        //   107: ifeq            172
        //   110: goto            114
        //   113: athrow         
        //   114: aload_0        
        //   115: getfield        uiztfzghuzt/dg.c:Ljava/io/Writer;
        //   118: bipush          44
        //   120: invokevirtual   java/io/Writer.append:(C)Ljava/io/Writer;
        //   123: pop            
        //   124: aload_0        
        //   125: invokespecial   uiztfzghuzt/dg.j:()V
        //   128: iload_1        
        //   129: ifeq            172
        //   132: goto            136
        //   135: athrow         
        //   136: aload_0        
        //   137: getfield        uiztfzghuzt/dg.c:Ljava/io/Writer;
        //   140: aload_0        
        //   141: getfield        uiztfzghuzt/dg.g:Ljava/lang/String;
        //   144: invokevirtual   java/io/Writer.append:(Ljava/lang/CharSequence;)Ljava/io/Writer;
        //   147: pop            
        //   148: aload_0        
        //   149: iconst_5       
        //   150: invokespecial   uiztfzghuzt/dg.b:(I)V
        //   153: iload_1        
        //   154: ifeq            172
        //   157: goto            161
        //   160: athrow         
        //   161: new             Ljava/lang/IllegalStateException;
        //   164: dup            
        //   165: ldc             "Nesting problem."
        //   167: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   170: athrow         
        //   171: athrow         
        //   172: return         
        //    StackMapTable: 00 12 FF 00 38 00 02 07 00 02 01 00 01 07 00 1F 00 47 07 00 1F 40 07 00 02 45 07 00 1F 40 01 4C 07 00 1F 00 40 07 00 02 08 4F 07 00 1F 00 54 07 00 1F 00 57 07 00 1F 00 49 07 00 1F 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  136    171    171    172    Ljava/lang/NullPointerException;
        //  114    157    160    161    Ljava/lang/NullPointerException;
        //  97     132    135    136    Ljava/lang/NullPointerException;
        //  88     110    113    114    Ljava/lang/NullPointerException;
        //  73     86     86     87     Ljava/lang/NullPointerException;
        //  57     69     72     73     Ljava/lang/NullPointerException;
        //  12     62     65     66     Ljava/lang/NullPointerException;
        //  4      56     56     57     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
    
    static {
        final String[] array = new String[16];
        int n16;
        int n15;
        int n14;
        int n13;
        int n12;
        int n11;
        int n10;
        int n9;
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 0))))))))))))));
        String s = "\u007fS\b!!_Q[%:^T\u00170%\u001f";
        int n17 = -1;
        String intern = null;
    Label_0307_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n19;
            final int n18 = n19 = (length = charArray.length);
            int n20 = 0;
            while (true) {
                Label_0382: {
                    if (n18 > 1) {
                        break Label_0382;
                    }
                    length = (n19 = n20);
                    do {
                        final char c = charArray[n19];
                        char c2 = '\0';
                        switch (n20 % 5) {
                            case 0: {
                                c2 = '1';
                                break;
                            }
                            case 1: {
                                c2 = '6';
                                break;
                            }
                            case 2: {
                                c2 = '{';
                                break;
                            }
                            case 3: {
                                c2 = 'U';
                                break;
                            }
                            default: {
                                c2 = 'H';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n20;
                    } while (n18 == 0);
                }
                if (n18 > n20) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n17) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 1)))))))))))))));
                    s = "_W\u00160h\f\u000b[;=]Z";
                    n17 = 0;
                    continue Label_0307_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 2)))))))))))))));
                    s = "{E\u0014;\u001fC_\u000f0:\u0011_\bu+]Y\b0,\u001f";
                    n17 = 1;
                    continue Label_0307_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 3)))))))))))))));
                    s = "^C\u000fuu\f\u0016\u0015 $]";
                    n17 = 2;
                    continue Label_0307_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 4)))))))))))))));
                    s = "WW\u0017&-";
                    n17 = 3;
                    continue Label_0307_Outer;
                }
                case 3: {
                    array[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 5)))))))))))))));
                    s = "ED\u000e0";
                    n17 = 4;
                    continue Label_0307_Outer;
                }
                case 4: {
                    array[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 6)))))))))))))));
                    s = "xX\u0018:%AZ\u001e!-\u0011R\u00146=\\S\u0015!";
                    n17 = 5;
                    continue Label_0307_Outer;
                }
                case 5: {
                    array[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 7)))))))))))))));
                    s = "uW\u00152$XX\u001cu&P[\u001eoh";
                    n17 = 6;
                    continue Label_0307_Outer;
                }
                case 6: {
                    array[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 8)))))))))))))));
                    s = "{e4\u001bh\\C\b!hYW\r0h^X\u0017,h^X\u001eu<^FV9-GS\u0017u>PZ\u000e0f";
                    n17 = 7;
                    continue Label_0307_Outer;
                }
                case 7: {
                    array[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 9)))))))))))))));
                    s = "_C\u00179";
                    n17 = 8;
                    continue Label_0307_Outer;
                }
                case 8: {
                    array[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 10)))))))))))))));
                    s = "mCIez\b";
                    n17 = 9;
                    continue Label_0307_Outer;
                }
                case 9: {
                    array[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 11)))))))))))))));
                    s = "mCIez\t";
                    n17 = 10;
                    continue Label_0307_Outer;
                }
                case 10: {
                    array[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 12)))))))))))))));
                    s = "\u007fC\u00160:XU[#)]C\u001e&h\\C\b!hSS[3!__\u000f0d\u0011T\u000e!hFW\bu";
                    n17 = 11;
                    continue Label_0307_Outer;
                }
                case 11: {
                    array[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 13)))))))))))))));
                    s = "\u001c\u007f\u00153!__\u000f,";
                    n17 = 12;
                    continue Label_0307_Outer;
                }
                case 12: {
                    array[n14] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 14)))))))))))))));
                    s = "\u007fW5";
                    n17 = 13;
                    continue Label_0307_Outer;
                }
                case 13: {
                    array[n15] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = 15)))))))))))))));
                    s = "xX\u001d<&XB\u0002";
                    n17 = 14;
                    continue Label_0307_Outer;
                }
                case 14: {
                    break Label_0307_Outer;
                }
            }
        }
        array[n16] = intern;
        z = new String[] { "Nesting problem.", "name == null", "JsonWriter is closed.", "out == null", "false", "true", "Incomplete document", "Dangling name: ", "JSON must have only one top-level value.", "null", "\\u2029", "\\u2028", "Numeric values must be finite, but was ", "-Infinity", "NaN", "Infinity" };
        a = new String[128];
        int i = 0;
        String[] array14 = null;
        int n33 = 0;
        String intern2 = null;
    Label_0479_Outer:
        while (true) {
            while (true) {
            Label_0681:
                while (true) {
                    try {
                        if (i <= 31) {
                            final String[] array13;
                            final String[] array12;
                            final String[] array11;
                            final String[] array10;
                            final String[] array9;
                            final String[] array8;
                            final String[] array7;
                            final String[] array6;
                            final String[] array5;
                            final String[] array4;
                            final String[] array3;
                            final String[] array2 = array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.a)))))))))));
                            final int n32;
                            final int n31;
                            final int n30;
                            final int n29;
                            final int n28;
                            final int n27;
                            final int n26;
                            final int n25;
                            final int n24;
                            final int n23;
                            final int n22;
                            final int n21 = n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = i)))))))))));
                            final String s2 = "mC^e|I";
                            final int n34 = -1;
                            break Label_0479;
                        }
                        break Label_0681;
                        String[] array3 = null;
                        int n22 = 0;
                        array3[n22] = String.format(intern2, i);
                        ++i;
                        continue Label_0479_Outer;
                    }
                    catch (NullPointerException ex) {
                        throw ex;
                    }
                    break Label_0681;
                    while (true) {
                        String s2 = null;
                        final char[] charArray2 = s2.toCharArray();
                        int length2;
                        int n36;
                        final int n35 = n36 = (length2 = charArray2.length);
                        int n37 = 0;
                        while (true) {
                            Label_0570: {
                                if (n35 > 1) {
                                    break Label_0570;
                                }
                                length2 = (n36 = n37);
                                do {
                                    final char c3 = charArray2[n36];
                                    char c4 = '\0';
                                    switch (n37 % 5) {
                                        case 0: {
                                            c4 = '1';
                                            break;
                                        }
                                        case 1: {
                                            c4 = '6';
                                            break;
                                        }
                                        case 2: {
                                            c4 = '{';
                                            break;
                                        }
                                        case 3: {
                                            c4 = 'U';
                                            break;
                                        }
                                        default: {
                                            c4 = 'H';
                                            break;
                                        }
                                    }
                                    charArray2[length2] = (char)(c3 ^ c4);
                                    ++n37;
                                } while (n35 == 0);
                            }
                            if (n35 > n37) {
                                continue;
                            }
                            break;
                        }
                        intern2 = new String(charArray2).intern();
                        int n34 = 0;
                        switch (n34) {
                            default: {
                                continue Label_0681;
                            }
                            case 0: {
                                final String[] array2;
                                final int n21;
                                array2[n21] = intern2;
                                final String[] array13;
                                final String[] array12;
                                final String[] array11;
                                final String[] array10;
                                final String[] array9;
                                final String[] array8;
                                final String[] array7;
                                final String[] array6;
                                final String[] array5;
                                final String[] array4;
                                final String[] array3;
                                array2 = (array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.a))))))))))));
                                final int n32;
                                final int n31;
                                final int n30;
                                final int n29;
                                final int n28;
                                final int n27;
                                final int n26;
                                final int n25;
                                final int n24;
                                final int n23;
                                final int n22;
                                n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 92))))))))))));
                                s2 = "mj";
                                n34 = 1;
                                continue Label_0479_Outer;
                            }
                            case 1: {
                                final String[] array4;
                                final int n23;
                                array4[n23] = intern2;
                                final String[] array13;
                                final String[] array12;
                                final String[] array11;
                                final String[] array10;
                                final String[] array9;
                                final String[] array8;
                                final String[] array7;
                                final String[] array6;
                                final String[] array5;
                                final String[] array3;
                                final String[] array2 = array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.a)))))))))));
                                final int n32;
                                final int n31;
                                final int n30;
                                final int n29;
                                final int n28;
                                final int n27;
                                final int n26;
                                final int n25;
                                final int n24;
                                final int n22;
                                final int n21 = n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 9)))))))))));
                                s2 = "mB";
                                n34 = 2;
                                continue Label_0479_Outer;
                            }
                            case 2: {
                                final String[] array5;
                                final int n24;
                                array5[n24] = intern2;
                                final String[] array13;
                                final String[] array12;
                                final String[] array11;
                                final String[] array10;
                                final String[] array9;
                                final String[] array8;
                                final String[] array7;
                                final String[] array6;
                                final String[] array4;
                                final String[] array3;
                                final String[] array2 = array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.a)))))))))));
                                final int n32;
                                final int n31;
                                final int n30;
                                final int n29;
                                final int n28;
                                final int n27;
                                final int n26;
                                final int n25;
                                final int n23;
                                final int n22;
                                final int n21 = n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 8)))))))))));
                                s2 = "mT";
                                n34 = 3;
                                continue Label_0479_Outer;
                            }
                            case 3: {
                                final String[] array6;
                                final int n25;
                                array6[n25] = intern2;
                                final String[] array13;
                                final String[] array12;
                                final String[] array11;
                                final String[] array10;
                                final String[] array9;
                                final String[] array8;
                                final String[] array7;
                                final String[] array5;
                                final String[] array4;
                                final String[] array3;
                                final String[] array2 = array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.a)))))))))));
                                final int n32;
                                final int n31;
                                final int n30;
                                final int n29;
                                final int n28;
                                final int n27;
                                final int n26;
                                final int n24;
                                final int n23;
                                final int n22;
                                final int n21 = n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 10)))))))))));
                                s2 = "mX";
                                n34 = 4;
                                continue Label_0479_Outer;
                            }
                            case 4: {
                                final String[] array7;
                                final int n26;
                                array7[n26] = intern2;
                                final String[] array13;
                                final String[] array12;
                                final String[] array11;
                                final String[] array10;
                                final String[] array9;
                                final String[] array8;
                                final String[] array6;
                                final String[] array5;
                                final String[] array4;
                                final String[] array3;
                                final String[] array2 = array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.a)))))))))));
                                final int n32;
                                final int n31;
                                final int n30;
                                final int n29;
                                final int n28;
                                final int n27;
                                final int n25;
                                final int n24;
                                final int n23;
                                final int n22;
                                final int n21 = n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 13)))))))))));
                                s2 = "mD";
                                n34 = 5;
                                continue Label_0479_Outer;
                            }
                            case 5: {
                                final String[] array8;
                                final int n27;
                                array8[n27] = intern2;
                                final String[] array13;
                                final String[] array12;
                                final String[] array11;
                                final String[] array10;
                                final String[] array9;
                                final String[] array7;
                                final String[] array6;
                                final String[] array5;
                                final String[] array4;
                                final String[] array3;
                                final String[] array2 = array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.a)))))))))));
                                final int n32;
                                final int n31;
                                final int n30;
                                final int n29;
                                final int n28;
                                final int n26;
                                final int n25;
                                final int n24;
                                final int n23;
                                final int n22;
                                final int n21 = n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 12)))))))))));
                                s2 = "mP";
                                n34 = 6;
                                continue Label_0479_Outer;
                            }
                            case 6: {
                                final String[] array9;
                                final int n28;
                                array9[n28] = intern2;
                                b = dg.a.clone();
                                final String[] array13;
                                final String[] array12;
                                final String[] array11;
                                final String[] array10;
                                final String[] array8;
                                final String[] array7;
                                final String[] array6;
                                final String[] array5;
                                final String[] array4;
                                final String[] array3;
                                final String[] array2 = array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.b)))))))))));
                                final int n32;
                                final int n31;
                                final int n30;
                                final int n29;
                                final int n27;
                                final int n26;
                                final int n25;
                                final int n24;
                                final int n23;
                                final int n22;
                                final int n21 = n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 60)))))))))));
                                s2 = "mCKe{R";
                                n34 = 7;
                                continue Label_0479_Outer;
                            }
                            case 7: {
                                final String[] array10;
                                final int n29;
                                array10[n29] = intern2;
                                final String[] array13;
                                final String[] array12;
                                final String[] array11;
                                final String[] array9;
                                final String[] array8;
                                final String[] array7;
                                final String[] array6;
                                final String[] array5;
                                final String[] array4;
                                final String[] array3;
                                final String[] array2 = array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.b)))))))))));
                                final int n32;
                                final int n31;
                                final int n30;
                                final int n28;
                                final int n27;
                                final int n26;
                                final int n25;
                                final int n24;
                                final int n23;
                                final int n22;
                                final int n21 = n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 62)))))))))));
                                s2 = "mCKe{T";
                                n34 = 8;
                                continue Label_0479_Outer;
                            }
                            case 8: {
                                final String[] array11;
                                final int n30;
                                array11[n30] = intern2;
                                final String[] array13;
                                final String[] array12;
                                final String[] array10;
                                final String[] array9;
                                final String[] array8;
                                final String[] array7;
                                final String[] array6;
                                final String[] array5;
                                final String[] array4;
                                final String[] array3;
                                final String[] array2 = array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.b)))))))))));
                                final int n32;
                                final int n31;
                                final int n29;
                                final int n28;
                                final int n27;
                                final int n26;
                                final int n25;
                                final int n24;
                                final int n23;
                                final int n22;
                                final int n21 = n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 38)))))))))));
                                s2 = "mCKez\u0007";
                                n34 = 9;
                                continue Label_0479_Outer;
                            }
                            case 9: {
                                final String[] array12;
                                final int n31;
                                array12[n31] = intern2;
                                final String[] array13;
                                final String[] array11;
                                final String[] array10;
                                final String[] array9;
                                final String[] array8;
                                final String[] array7;
                                final String[] array6;
                                final String[] array5;
                                final String[] array4;
                                final String[] array3;
                                final String[] array2 = array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.b)))))))))));
                                final int n32;
                                final int n30;
                                final int n29;
                                final int n28;
                                final int n27;
                                final int n26;
                                final int n25;
                                final int n24;
                                final int n23;
                                final int n22;
                                final int n21 = n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 61)))))))))));
                                s2 = "mCKe{U";
                                n34 = 10;
                                continue Label_0479_Outer;
                            }
                            case 10: {
                                final String[] array13;
                                final int n32;
                                array13[n32] = intern2;
                                final String[] array12;
                                final String[] array11;
                                final String[] array10;
                                final String[] array9;
                                final String[] array8;
                                final String[] array7;
                                final String[] array6;
                                final String[] array5;
                                final String[] array4;
                                final String[] array3;
                                final String[] array2 = array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.b)))))))))));
                                final int n31;
                                final int n30;
                                final int n29;
                                final int n28;
                                final int n27;
                                final int n26;
                                final int n25;
                                final int n24;
                                final int n23;
                                final int n22;
                                final int n21 = n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 39)))))))))));
                                s2 = "mCKez\u0006";
                                n34 = 11;
                                continue Label_0479_Outer;
                            }
                            case 11: {
                                break Label_0479_Outer;
                            }
                        }
                    }
                    break;
                }
                String[] array13;
                String[] array12;
                String[] array11;
                String[] array10;
                String[] array9;
                String[] array8;
                String[] array7;
                String[] array6;
                String[] array5;
                String[] array4;
                String[] array3;
                String[] array2 = array3 = (array4 = (array5 = (array6 = (array7 = (array8 = (array9 = (array10 = (array11 = (array12 = (array13 = (array14 = dg.a)))))))))));
                int n32;
                int n31;
                int n30;
                int n29;
                int n28;
                int n27;
                int n26;
                int n25;
                int n24;
                int n23;
                int n22;
                int n21 = n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 34)))))))))));
                String s2 = "m\u0014";
                int n34 = 0;
                continue;
            }
        }
        array14[n33] = intern2;
    }
}
