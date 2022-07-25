// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class cf implements md
{
    @Override
    public <T> nb<T> a(final ab p0, final ag<T> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_2        
        //     6: invokevirtual   uiztfzghuzt/ag.b:()Ljava/lang/reflect/Type;
        //     9: astore_3       
        //    10: aload_3        
        //    11: iload           6
        //    13: ifne            76
        //    16: instanceof      Ljava/lang/reflect/GenericArrayType;
        //    19: ifne            72
        //    22: goto            26
        //    25: athrow         
        //    26: aload_3        
        //    27: instanceof      Ljava/lang/Class;
        //    30: iload           6
        //    32: ifne            66
        //    35: goto            39
        //    38: athrow         
        //    39: ifeq            69
        //    42: goto            46
        //    45: athrow         
        //    46: aload_3        
        //    47: checkcast       Ljava/lang/Class;
        //    50: iload           6
        //    52: ifne            76
        //    55: goto            59
        //    58: athrow         
        //    59: invokevirtual   java/lang/Class.isArray:()Z
        //    62: goto            66
        //    65: athrow         
        //    66: ifne            72
        //    69: aconst_null    
        //    70: areturn        
        //    71: athrow         
        //    72: aload_3        
        //    73: invokestatic    uiztfzghuzt/td.g:(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
        //    76: astore          4
        //    78: aload_1        
        //    79: aload           4
        //    81: invokestatic    uiztfzghuzt/ag.a:(Ljava/lang/reflect/Type;)Luiztfzghuzt/ag;
        //    84: invokevirtual   uiztfzghuzt/ab.a:(Luiztfzghuzt/ag;)Luiztfzghuzt/nb;
        //    87: astore          5
        //    89: new             Luiztfzghuzt/xb;
        //    92: dup            
        //    93: aload_1        
        //    94: aload           5
        //    96: aload           4
        //    98: invokestatic    uiztfzghuzt/td.e:(Ljava/lang/reflect/Type;)Ljava/lang/Class;
        //   101: invokespecial   uiztfzghuzt/xb.<init>:(Luiztfzghuzt/ab;Luiztfzghuzt/nb;Ljava/lang/Class;)V
        //   104: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Luiztfzghuzt/ab;Luiztfzghuzt/ag<TT;>;)Luiztfzghuzt/nb<TT;>;
        //    StackMapTable: 00 0E FF 00 19 00 07 07 00 02 07 00 2D 07 00 16 07 00 3B 00 00 01 00 01 07 00 0E 00 4B 07 00 0E 40 01 45 07 00 0E 00 4B 07 00 0E 40 07 00 1E 45 07 00 0E 40 01 02 41 07 00 0E 00 43 07 00 3B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  66     71     71     72     Luiztfzghuzt/kg;
        //  46     62     65     66     Luiztfzghuzt/kg;
        //  39     55     58     59     Luiztfzghuzt/kg;
        //  26     42     45     46     Luiztfzghuzt/kg;
        //  16     35     38     39     Luiztfzghuzt/kg;
        //  10     22     25     26     Luiztfzghuzt/kg;
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
}
