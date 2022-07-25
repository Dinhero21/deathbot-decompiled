// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class tf implements md
{
    @Override
    public <T> nb<T> a(final ab p0, final ag<T> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_2        
        //     6: invokevirtual   uiztfzghuzt/ag.a:()Ljava/lang/Class;
        //     9: astore_3       
        //    10: ldc             Ljava/lang/Enum;.class
        //    12: aload_3        
        //    13: iload           4
        //    15: ifne            44
        //    18: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    21: ifeq            47
        //    24: goto            28
        //    27: athrow         
        //    28: aload_3        
        //    29: iload           4
        //    31: ifne            51
        //    34: goto            38
        //    37: athrow         
        //    38: ldc             Ljava/lang/Enum;.class
        //    40: goto            44
        //    43: athrow         
        //    44: if_acmpne       50
        //    47: aconst_null    
        //    48: areturn        
        //    49: athrow         
        //    50: aload_3        
        //    51: iload           4
        //    53: ifne            74
        //    56: invokevirtual   java/lang/Class.isEnum:()Z
        //    59: ifne            75
        //    62: goto            66
        //    65: athrow         
        //    66: aload_3        
        //    67: invokevirtual   java/lang/Class.getSuperclass:()Ljava/lang/Class;
        //    70: goto            74
        //    73: athrow         
        //    74: astore_3       
        //    75: new             Luiztfzghuzt/ld;
        //    78: dup            
        //    79: aload_3        
        //    80: invokespecial   uiztfzghuzt/ld.<init>:(Ljava/lang/Class;)V
        //    83: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Luiztfzghuzt/ab;Luiztfzghuzt/ag<TT;>;)Luiztfzghuzt/nb<TT;>;
        //    StackMapTable: 00 0F FF 00 1B 00 05 07 00 02 07 00 2F 07 00 16 07 00 1D 01 00 01 07 00 0E 00 48 07 00 0E 40 07 00 1D 44 07 00 0E FF 00 00 00 05 07 00 02 07 00 2F 07 00 16 07 00 1D 01 00 02 07 00 1D 07 00 1D 02 41 07 00 0E 00 40 07 00 1D 4D 07 00 0E 00 46 07 00 0E 40 07 00 1D 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  56     70     73     74     Luiztfzghuzt/kg;
        //  51     62     65     66     Luiztfzghuzt/kg;
        //  44     49     49     50     Luiztfzghuzt/kg;
        //  28     40     43     44     Luiztfzghuzt/kg;
        //  18     34     37     38     Luiztfzghuzt/kg;
        //  10     24     27     28     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
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
