// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class oe extends ne
{
    private static final String z = "Expected a name but was ";
    
    @Override
    public void a(final bg p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_1        
        //     5: instanceof      Luiztfzghuzt/cg;
        //     8: iload_3        
        //     9: ifne            32
        //    12: ifeq            28
        //    15: goto            19
        //    18: athrow         
        //    19: aload_1        
        //    20: checkcast       Luiztfzghuzt/cg;
        //    23: invokevirtual   uiztfzghuzt/cg.f:()V
        //    26: return         
        //    27: athrow         
        //    28: aload_1        
        //    29: getfield        uiztfzghuzt/bg.i:I
        //    32: istore_2       
        //    33: iload_2        
        //    34: iload_3        
        //    35: ifne            51
        //    38: ifne            50
        //    41: goto            45
        //    44: athrow         
        //    45: aload_1        
        //    46: invokevirtual   uiztfzghuzt/bg.h:()I
        //    49: istore_2       
        //    50: iload_2        
        //    51: bipush          13
        //    53: iload_3        
        //    54: ifne            85
        //    57: if_icmpne       78
        //    60: goto            64
        //    63: athrow         
        //    64: aload_1        
        //    65: bipush          9
        //    67: putfield        uiztfzghuzt/bg.i:I
        //    70: iload_3        
        //    71: ifeq            172
        //    74: goto            78
        //    77: athrow         
        //    78: iload_2        
        //    79: bipush          12
        //    81: goto            85
        //    84: athrow         
        //    85: iload_3        
        //    86: ifne            117
        //    89: if_icmpne       110
        //    92: goto            96
        //    95: athrow         
        //    96: aload_1        
        //    97: bipush          8
        //    99: putfield        uiztfzghuzt/bg.i:I
        //   102: iload_3        
        //   103: ifeq            172
        //   106: goto            110
        //   109: athrow         
        //   110: iload_2        
        //   111: bipush          14
        //   113: goto            117
        //   116: athrow         
        //   117: if_icmpne       134
        //   120: aload_1        
        //   121: bipush          10
        //   123: putfield        uiztfzghuzt/bg.i:I
        //   126: iload_3        
        //   127: ifeq            172
        //   130: goto            134
        //   133: athrow         
        //   134: new             Ljava/lang/IllegalStateException;
        //   137: dup            
        //   138: new             Ljava/lang/StringBuilder;
        //   141: dup            
        //   142: invokespecial   java/lang/StringBuilder.<init>:()V
        //   145: ldc             "Expected a name but was "
        //   147: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   150: aload_1        
        //   151: invokevirtual   uiztfzghuzt/bg.g:()Luiztfzghuzt/p;
        //   154: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   157: aload_1        
        //   158: invokevirtual   uiztfzghuzt/bg.w:()Ljava/lang/String;
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   167: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   170: athrow         
        //   171: athrow         
        //   172: return         
        //    StackMapTable: 00 19 FF 00 12 00 04 07 00 02 07 00 1D 00 01 00 01 07 00 10 00 47 07 00 10 00 43 01 FF 00 0B 00 04 07 00 02 07 00 1D 01 01 00 01 07 00 10 00 04 40 01 4B 07 00 10 00 4C 07 00 10 00 45 07 00 10 FF 00 00 00 04 07 00 02 07 00 1D 01 01 00 02 01 01 49 07 00 10 00 4C 07 00 10 00 45 07 00 10 FF 00 00 00 04 07 00 02 07 00 1D 01 01 00 02 01 01 4F 07 00 10 00 64 07 00 10 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  120    171    171    172    Ljava/lang/IllegalStateException;
        //  117    130    133    134    Ljava/lang/IllegalStateException;
        //  96     113    116    117    Ljava/lang/IllegalStateException;
        //  89     106    109    110    Ljava/lang/IllegalStateException;
        //  85     92     95     96     Ljava/lang/IllegalStateException;
        //  64     81     84     85     Ljava/lang/IllegalStateException;
        //  57     74     77     78     Ljava/lang/IllegalStateException;
        //  51     60     63     64     Ljava/lang/IllegalStateException;
        //  33     41     44     45     Ljava/lang/IllegalStateException;
        //  12     27     27     28     Ljava/lang/IllegalStateException;
        //  4      15     18     19     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0064:
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
        final char[] charArray = "%cIPS\u0014~]\u0015Q@uXXU@yLA\u0010\u0017zJ\u0015".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0106: {
                if (n > 1) {
                    break Label_0106;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '`';
                            break;
                        }
                        case 1: {
                            c2 = '\u001b';
                            break;
                        }
                        case 2: {
                            c2 = '9';
                            break;
                        }
                        case 3: {
                            c2 = '5';
                            break;
                        }
                        default: {
                            c2 = '0';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
