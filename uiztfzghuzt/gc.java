// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Type;

final class gc<T> extends nb<T>
{
    private final ab b;
    private final nb<T> c;
    private final Type d;
    
    gc(final ab b, final nb<T> c, final Type d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public T a(final bg bg) {
        return this.c.a(bg);
    }
    
    @Override
    public void a(final dg p0, final T p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_0        
        //     6: getfield        uiztfzghuzt/gc.c:Luiztfzghuzt/nb;
        //     9: astore_3       
        //    10: aload_0        
        //    11: aload_0        
        //    12: getfield        uiztfzghuzt/gc.d:Ljava/lang/reflect/Type;
        //    15: aload_2        
        //    16: invokespecial   uiztfzghuzt/gc.a:(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;
        //    19: astore          4
        //    21: iload           6
        //    23: ifne            124
        //    26: aload           4
        //    28: aload_0        
        //    29: getfield        uiztfzghuzt/gc.d:Ljava/lang/reflect/Type;
        //    32: if_acmpeq       118
        //    35: goto            39
        //    38: athrow         
        //    39: aload_0        
        //    40: getfield        uiztfzghuzt/gc.b:Luiztfzghuzt/ab;
        //    43: aload           4
        //    45: invokestatic    uiztfzghuzt/ag.a:(Ljava/lang/reflect/Type;)Luiztfzghuzt/ag;
        //    48: invokevirtual   uiztfzghuzt/ab.a:(Luiztfzghuzt/ag;)Luiztfzghuzt/nb;
        //    51: astore          5
        //    53: aload           5
        //    55: instanceof      Luiztfzghuzt/cc;
        //    58: iload           6
        //    60: ifne            98
        //    63: ifne            78
        //    66: goto            70
        //    69: athrow         
        //    70: aload           5
        //    72: astore_3       
        //    73: iload           6
        //    75: ifeq            118
        //    78: aload_0        
        //    79: getfield        uiztfzghuzt/gc.c:Luiztfzghuzt/nb;
        //    82: iload           6
        //    84: ifne            117
        //    87: goto            91
        //    90: athrow         
        //    91: instanceof      Luiztfzghuzt/cc;
        //    94: goto            98
        //    97: athrow         
        //    98: ifne            111
        //   101: aload_0        
        //   102: getfield        uiztfzghuzt/gc.c:Luiztfzghuzt/nb;
        //   105: astore_3       
        //   106: iload           6
        //   108: ifeq            118
        //   111: aload           5
        //   113: goto            117
        //   116: athrow         
        //   117: astore_3       
        //   118: aload_3        
        //   119: aload_1        
        //   120: aload_2        
        //   121: invokevirtual   uiztfzghuzt/nb.a:(Luiztfzghuzt/dg;Ljava/lang/Object;)V
        //   124: return         
        //    Signature:
        //  (Luiztfzghuzt/dg;TT;)V
        //    StackMapTable: 00 0E FF 00 26 00 07 07 00 02 07 00 37 07 00 39 07 00 05 07 00 3B 00 01 00 01 07 00 1E 00 FF 00 1D 00 07 07 00 02 07 00 37 07 00 39 07 00 05 07 00 3B 07 00 05 01 00 01 07 00 1E 00 07 4B 07 00 1E 40 07 00 05 45 07 00 1E 40 01 0C 44 07 00 1E 40 07 00 05 FF 00 00 00 07 07 00 02 07 00 37 07 00 39 07 00 05 07 00 3B 00 01 00 00 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  106    113    116    117    Luiztfzghuzt/kg;
        //  78     94     97     98     Luiztfzghuzt/kg;
        //  73     87     90     91     Luiztfzghuzt/kg;
        //  53     66     69     70     Luiztfzghuzt/kg;
        //  21     35     38     39     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0078:
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
    
    private Type a(final Type p0, final Object p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_2        
        //     5: ifnull          73
        //     8: aload_1        
        //     9: iload_3        
        //    10: ifne            69
        //    13: goto            17
        //    16: athrow         
        //    17: ldc             Ljava/lang/Object;.class
        //    19: if_acmpeq       64
        //    22: goto            26
        //    25: athrow         
        //    26: aload_1        
        //    27: iload_3        
        //    28: ifne            69
        //    31: goto            35
        //    34: athrow         
        //    35: instanceof      Ljava/lang/reflect/TypeVariable;
        //    38: ifne            64
        //    41: goto            45
        //    44: athrow         
        //    45: aload_1        
        //    46: iload_3        
        //    47: ifne            74
        //    50: goto            54
        //    53: athrow         
        //    54: instanceof      Ljava/lang/Class;
        //    57: ifeq            73
        //    60: goto            64
        //    63: athrow         
        //    64: aload_2        
        //    65: goto            69
        //    68: athrow         
        //    69: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    72: astore_1       
        //    73: aload_1        
        //    74: areturn        
        //    StackMapTable: 00 10 FF 00 10 00 04 07 00 02 07 00 3B 07 00 39 01 00 01 07 00 1E 40 07 00 3B 47 07 00 1E 00 47 07 00 1E 40 07 00 3B 48 07 00 1E 00 47 07 00 1E 40 07 00 3B 48 07 00 1E 00 43 07 00 1E 40 07 00 39 03 40 07 00 3B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  54     65     68     69     Luiztfzghuzt/kg;
        //  45     60     63     64     Luiztfzghuzt/kg;
        //  35     50     53     54     Luiztfzghuzt/kg;
        //  26     41     44     45     Luiztfzghuzt/kg;
        //  17     31     34     35     Luiztfzghuzt/kg;
        //  8      22     25     26     Luiztfzghuzt/kg;
        //  4      13     16     17     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0017:
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
}
