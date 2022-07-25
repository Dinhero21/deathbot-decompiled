// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Map;

public final class cc<T> extends nb<T>
{
    private final ue<T> b;
    private final Map<String, lf> c;
    
    cc(final ue<T> b, final Map<String, lf> c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public T a(final bg p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_1        
        //     6: invokevirtual   uiztfzghuzt/bg.g:()Luiztfzghuzt/p;
        //     9: iload           5
        //    11: ifne            40
        //    14: getstatic       uiztfzghuzt/p.NULL:Luiztfzghuzt/p;
        //    17: if_acmpne       31
        //    20: goto            24
        //    23: athrow         
        //    24: aload_1        
        //    25: invokevirtual   uiztfzghuzt/bg.n:()V
        //    28: aconst_null    
        //    29: areturn        
        //    30: athrow         
        //    31: aload_0        
        //    32: getfield        uiztfzghuzt/cc.b:Luiztfzghuzt/ue;
        //    35: invokeinterface uiztfzghuzt/ue.a:()Ljava/lang/Object;
        //    40: astore_2       
        //    41: aload_1        
        //    42: invokevirtual   uiztfzghuzt/bg.d:()V
        //    45: aload_1        
        //    46: invokevirtual   uiztfzghuzt/bg.f:()Z
        //    49: ifeq            145
        //    52: aload_1        
        //    53: invokevirtual   uiztfzghuzt/bg.k:()Ljava/lang/String;
        //    56: astore_3       
        //    57: aload_0        
        //    58: getfield        uiztfzghuzt/cc.c:Ljava/util/Map;
        //    61: aload_3        
        //    62: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    67: checkcast       Luiztfzghuzt/lf;
        //    70: astore          4
        //    72: iload           5
        //    74: ifne            124
        //    77: aload           4
        //    79: iload           5
        //    81: ifne            173
        //    84: goto            88
        //    87: athrow         
        //    88: ifnull          116
        //    91: goto            95
        //    94: athrow         
        //    95: aload           4
        //    97: iload           5
        //    99: ifne            135
        //   102: goto            106
        //   105: athrow         
        //   106: getfield        uiztfzghuzt/lf.c:Z
        //   109: ifne            129
        //   112: goto            116
        //   115: athrow         
        //   116: aload_1        
        //   117: invokevirtual   uiztfzghuzt/bg.t:()V
        //   120: goto            124
        //   123: athrow         
        //   124: iload           5
        //   126: ifeq            140
        //   129: aload           4
        //   131: goto            135
        //   134: athrow         
        //   135: aload_1        
        //   136: aload_2        
        //   137: invokevirtual   uiztfzghuzt/lf.a:(Luiztfzghuzt/bg;Ljava/lang/Object;)V
        //   140: iload           5
        //   142: ifeq            45
        //   145: goto            168
        //   148: astore_3       
        //   149: new             Luiztfzghuzt/kg;
        //   152: dup            
        //   153: aload_3        
        //   154: invokespecial   uiztfzghuzt/kg.<init>:(Ljava/lang/Throwable;)V
        //   157: athrow         
        //   158: astore_3       
        //   159: new             Ljava/lang/AssertionError;
        //   162: dup            
        //   163: aload_3        
        //   164: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   167: athrow         
        //   168: aload_1        
        //   169: invokevirtual   uiztfzghuzt/bg.e:()V
        //   172: aload_2        
        //   173: areturn        
        //    Signature:
        //  (Luiztfzghuzt/bg;)TT;
        //    StackMapTable: 00 19 FF 00 17 00 06 07 00 02 07 00 22 00 00 00 01 00 01 07 00 18 00 45 07 00 18 00 48 07 00 5E FF 00 04 00 06 07 00 02 07 00 22 07 00 5E 00 00 01 00 00 FF 00 29 00 06 07 00 02 07 00 22 07 00 5E 07 00 60 07 00 47 01 00 01 07 00 18 40 07 00 47 45 07 00 18 00 49 07 00 18 40 07 00 47 48 07 00 18 00 46 07 00 18 00 04 44 07 00 18 40 07 00 47 04 FF 00 04 00 06 07 00 02 07 00 22 07 00 5E 00 00 01 00 00 42 07 00 18 49 07 00 1A 09 44 07 00 5E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  124    131    134    135    Ljava/lang/IllegalStateException;
        //  106    120    123    124    Ljava/lang/IllegalStateException;
        //  95     112    115    116    Ljava/lang/IllegalStateException;
        //  88     102    105    106    Ljava/lang/IllegalStateException;
        //  77     91     94     95     Ljava/lang/IllegalStateException;
        //  72     84     87     88     Ljava/lang/IllegalStateException;
        //  14     30     30     31     Ljava/lang/IllegalStateException;
        //  5      20     23     24     Ljava/lang/IllegalStateException;
        //  41     145    148    158    Ljava/lang/IllegalStateException;
        //  41     145    158    168    Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0088:
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
    public void a(final dg p0, final T p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: iload           5
        //     7: ifne            30
        //    10: aload_2        
        //    11: ifnonnull       25
        //    14: goto            18
        //    17: athrow         
        //    18: aload_1        
        //    19: invokevirtual   uiztfzghuzt/dg.i:()Luiztfzghuzt/dg;
        //    22: pop            
        //    23: return         
        //    24: athrow         
        //    25: aload_1        
        //    26: invokevirtual   uiztfzghuzt/dg.e:()Luiztfzghuzt/dg;
        //    29: pop            
        //    30: aload_0        
        //    31: getfield        uiztfzghuzt/cc.c:Ljava/util/Map;
        //    34: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    39: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    44: astore_3       
        //    45: aload_3        
        //    46: invokeinterface java/util/Iterator.hasNext:()Z
        //    51: ifeq            118
        //    54: aload_3        
        //    55: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    60: checkcast       Luiztfzghuzt/lf;
        //    63: astore          4
        //    65: iload           5
        //    67: ifne            136
        //    70: aload           4
        //    72: iload           5
        //    74: ifne            108
        //    77: goto            81
        //    80: athrow         
        //    81: aload_2        
        //    82: invokevirtual   uiztfzghuzt/lf.a:(Ljava/lang/Object;)Z
        //    85: ifeq            113
        //    88: goto            92
        //    91: athrow         
        //    92: aload_1        
        //    93: aload           4
        //    95: getfield        uiztfzghuzt/lf.a:Ljava/lang/String;
        //    98: invokevirtual   uiztfzghuzt/dg.a:(Ljava/lang/String;)Luiztfzghuzt/dg;
        //   101: pop            
        //   102: aload           4
        //   104: goto            108
        //   107: athrow         
        //   108: aload_1        
        //   109: aload_2        
        //   110: invokevirtual   uiztfzghuzt/lf.a:(Luiztfzghuzt/dg;Ljava/lang/Object;)V
        //   113: iload           5
        //   115: ifeq            45
        //   118: goto            131
        //   121: astore_3       
        //   122: new             Ljava/lang/AssertionError;
        //   125: dup            
        //   126: aload_3        
        //   127: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   130: athrow         
        //   131: aload_1        
        //   132: invokevirtual   uiztfzghuzt/dg.f:()Luiztfzghuzt/dg;
        //   135: pop            
        //   136: return         
        //    Signature:
        //  (Luiztfzghuzt/dg;TT;)V
        //    StackMapTable: 00 11 FF 00 11 00 06 07 00 02 07 00 63 07 00 5E 00 00 01 00 01 07 00 1A 00 45 07 00 1A 00 04 FF 00 0E 00 06 07 00 02 07 00 63 07 00 5E 07 00 75 00 01 00 00 FF 00 22 00 06 07 00 02 07 00 63 07 00 5E 07 00 75 07 00 47 01 00 01 07 00 1A 40 07 00 47 49 07 00 1A 00 4E 07 00 1A 40 07 00 47 04 FF 00 04 00 06 07 00 02 07 00 63 07 00 5E 07 00 75 00 01 00 00 FF 00 02 00 06 07 00 02 07 00 63 07 00 5E 00 00 01 00 01 07 00 1A FF 00 09 00 06 07 00 02 07 00 63 07 00 5E 07 00 75 00 01 00 00 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  81     104    107    108    Ljava/lang/IllegalAccessException;
        //  70     88     91     92     Ljava/lang/IllegalAccessException;
        //  65     77     80     81     Ljava/lang/IllegalAccessException;
        //  10     24     24     25     Ljava/lang/IllegalAccessException;
        //  5      14     17     18     Ljava/lang/IllegalAccessException;
        //  30     118    121    131    Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0081:
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
