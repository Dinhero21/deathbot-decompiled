// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Locale;

final class bd extends nb<Locale>
{
    @Override
    public Locale a(final bg p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_1        
        //     6: iload           7
        //     8: ifne            32
        //    11: invokevirtual   uiztfzghuzt/bg.g:()Luiztfzghuzt/p;
        //    14: getstatic       uiztfzghuzt/p.NULL:Luiztfzghuzt/p;
        //    17: if_acmpne       31
        //    20: goto            24
        //    23: athrow         
        //    24: aload_1        
        //    25: invokevirtual   uiztfzghuzt/bg.n:()V
        //    28: aconst_null    
        //    29: areturn        
        //    30: athrow         
        //    31: aload_1        
        //    32: invokevirtual   uiztfzghuzt/bg.l:()Ljava/lang/String;
        //    35: astore_2       
        //    36: new             Ljava/util/StringTokenizer;
        //    39: dup            
        //    40: aload_2        
        //    41: ldc             "_"
        //    43: invokespecial   java/util/StringTokenizer.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    46: astore_3       
        //    47: aconst_null    
        //    48: astore          4
        //    50: aconst_null    
        //    51: astore          5
        //    53: aconst_null    
        //    54: astore          6
        //    56: aload_3        
        //    57: iload           7
        //    59: ifne            77
        //    62: invokevirtual   java/util/StringTokenizer.hasMoreElements:()Z
        //    65: ifeq            82
        //    68: goto            72
        //    71: athrow         
        //    72: aload_3        
        //    73: goto            77
        //    76: athrow         
        //    77: invokevirtual   java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        //    80: astore          4
        //    82: aload_3        
        //    83: iload           7
        //    85: ifne            103
        //    88: invokevirtual   java/util/StringTokenizer.hasMoreElements:()Z
        //    91: ifeq            108
        //    94: goto            98
        //    97: athrow         
        //    98: aload_3        
        //    99: goto            103
        //   102: athrow         
        //   103: invokevirtual   java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        //   106: astore          5
        //   108: aload_3        
        //   109: iload           7
        //   111: ifne            129
        //   114: invokevirtual   java/util/StringTokenizer.hasMoreElements:()Z
        //   117: ifeq            134
        //   120: goto            124
        //   123: athrow         
        //   124: aload_3        
        //   125: goto            129
        //   128: athrow         
        //   129: invokevirtual   java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        //   132: astore          6
        //   134: aload           5
        //   136: iload           7
        //   138: ifne            179
        //   141: ifnonnull       177
        //   144: goto            148
        //   147: athrow         
        //   148: aload           6
        //   150: iload           7
        //   152: ifne            179
        //   155: goto            159
        //   158: athrow         
        //   159: ifnonnull       177
        //   162: goto            166
        //   165: athrow         
        //   166: new             Ljava/util/Locale;
        //   169: dup            
        //   170: aload           4
        //   172: invokespecial   java/util/Locale.<init>:(Ljava/lang/String;)V
        //   175: areturn        
        //   176: athrow         
        //   177: aload           6
        //   179: ifnonnull       195
        //   182: new             Ljava/util/Locale;
        //   185: dup            
        //   186: aload           4
        //   188: aload           5
        //   190: invokespecial   java/util/Locale.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   193: areturn        
        //   194: athrow         
        //   195: new             Ljava/util/Locale;
        //   198: dup            
        //   199: aload           4
        //   201: aload           5
        //   203: aload           6
        //   205: invokespecial   java/util/Locale.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   208: areturn        
        //    StackMapTable: 00 1F FF 00 17 00 08 07 00 02 07 00 15 00 00 00 00 00 01 00 01 07 00 0D 00 45 07 00 0D 00 40 07 00 15 FF 00 26 00 08 07 00 02 07 00 15 07 00 3F 07 00 28 05 05 05 01 00 01 07 00 0D 00 43 07 00 0D 40 07 00 28 FF 00 04 00 08 07 00 02 07 00 15 07 00 3F 07 00 28 07 00 3F 05 05 01 00 00 4E 07 00 0D 00 43 07 00 0D 40 07 00 28 FF 00 04 00 08 07 00 02 07 00 15 07 00 3F 07 00 28 07 00 3F 07 00 3F 05 01 00 00 4E 07 00 0D 00 43 07 00 0D 40 07 00 28 FF 00 04 00 08 07 00 02 07 00 15 07 00 3F 07 00 28 07 00 3F 07 00 3F 07 00 3F 01 00 00 4C 07 00 0D 00 49 07 00 0D 40 07 00 3F 45 07 00 0D 00 49 07 00 0D 00 41 07 00 3F 4E 07 00 0D 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  179    194    194    195    Luiztfzghuzt/kg;
        //  159    176    176    177    Luiztfzghuzt/kg;
        //  148    162    165    166    Luiztfzghuzt/kg;
        //  141    155    158    159    Luiztfzghuzt/kg;
        //  134    144    147    148    Luiztfzghuzt/kg;
        //  114    125    128    129    Luiztfzghuzt/kg;
        //  108    120    123    124    Luiztfzghuzt/kg;
        //  88     99     102    103    Luiztfzghuzt/kg;
        //  82     94     97     98     Luiztfzghuzt/kg;
        //  62     73     76     77     Luiztfzghuzt/kg;
        //  56     68     71     72     Luiztfzghuzt/kg;
        //  11     30     30     31     Luiztfzghuzt/kg;
        //  5      20     23     24     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0148:
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
    public void a(final dg dg, final Locale locale) {
        String string = null;
        Label_0024: {
            Locale locale2 = null;
            Label_0021: {
                Label_0015: {
                    try {
                        locale2 = locale;
                        if (rf.ab) {
                            break Label_0021;
                        }
                        if (locale == null) {
                            break Label_0015;
                        }
                        break Label_0015;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        if (locale == null) {
                            string = null;
                            break Label_0024;
                        }
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                locale2 = locale;
            }
            string = locale2.toString();
        }
        dg.b(string);
    }
}
