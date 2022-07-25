// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.BitSet;

final class sc extends nb<BitSet>
{
    private static final String[] z;
    
    @Override
    public BitSet a(final bg p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          8
        //     5: new             Ljava/util/BitSet;
        //     8: dup            
        //     9: invokespecial   java/util/BitSet.<init>:()V
        //    12: astore_2       
        //    13: aload_1        
        //    14: invokevirtual   uiztfzghuzt/bg.b:()V
        //    17: iconst_0       
        //    18: istore_3       
        //    19: aload_1        
        //    20: invokevirtual   uiztfzghuzt/bg.g:()Luiztfzghuzt/p;
        //    23: astore          4
        //    25: aload           4
        //    27: getstatic       uiztfzghuzt/p.END_ARRAY:Luiztfzghuzt/p;
        //    30: if_acmpeq       247
        //    33: iload           8
        //    35: ifne            251
        //    38: getstatic       uiztfzghuzt/yf.a:[I
        //    41: aload           4
        //    43: invokevirtual   uiztfzghuzt/p.ordinal:()I
        //    46: iaload         
        //    47: iload           8
        //    49: ifne            93
        //    52: goto            56
        //    55: athrow         
        //    56: tableswitch {
        //                2: 85
        //                3: 117
        //                4: 128
        //          default: 191
        //        }
        //    84: athrow         
        //    85: aload_1        
        //    86: invokevirtual   uiztfzghuzt/bg.s:()I
        //    89: goto            93
        //    92: athrow         
        //    93: iload           8
        //    95: ifne            106
        //    98: ifeq            109
        //   101: goto            105
        //   104: athrow         
        //   105: iconst_1       
        //   106: goto            110
        //   109: iconst_0       
        //   110: istore          5
        //   112: iload           8
        //   114: ifeq            219
        //   117: aload_1        
        //   118: invokevirtual   uiztfzghuzt/bg.m:()Z
        //   121: istore          5
        //   123: iload           8
        //   125: ifeq            219
        //   128: aload_1        
        //   129: invokevirtual   uiztfzghuzt/bg.l:()Ljava/lang/String;
        //   132: astore          6
        //   134: aload           6
        //   136: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   139: iload           8
        //   141: ifne            152
        //   144: ifeq            155
        //   147: goto            151
        //   150: athrow         
        //   151: iconst_1       
        //   152: goto            156
        //   155: iconst_0       
        //   156: istore          5
        //   158: goto            219
        //   161: astore          7
        //   163: new             Luiztfzghuzt/kg;
        //   166: dup            
        //   167: new             Ljava/lang/StringBuilder;
        //   170: dup            
        //   171: invokespecial   java/lang/StringBuilder.<init>:()V
        //   174: ldc             "Error: Expecting: bitset number value (1, 0), Found: "
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: aload           6
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   187: invokespecial   uiztfzghuzt/kg.<init>:(Ljava/lang/String;)V
        //   190: athrow         
        //   191: new             Luiztfzghuzt/kg;
        //   194: dup            
        //   195: new             Ljava/lang/StringBuilder;
        //   198: dup            
        //   199: invokespecial   java/lang/StringBuilder.<init>:()V
        //   202: ldc             "Invalid bitset value type: "
        //   204: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   207: aload           4
        //   209: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   212: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   215: invokespecial   uiztfzghuzt/kg.<init>:(Ljava/lang/String;)V
        //   218: athrow         
        //   219: iload           5
        //   221: ifeq            233
        //   224: aload_2        
        //   225: iload_3        
        //   226: invokevirtual   java/util/BitSet.set:(I)V
        //   229: goto            233
        //   232: athrow         
        //   233: iinc            3, 1
        //   236: aload_1        
        //   237: invokevirtual   uiztfzghuzt/bg.g:()Luiztfzghuzt/p;
        //   240: astore          4
        //   242: iload           8
        //   244: ifeq            25
        //   247: aload_1        
        //   248: invokevirtual   uiztfzghuzt/bg.c:()V
        //   251: aload_2        
        //   252: areturn        
        //    StackMapTable: 00 1A FF 00 19 00 09 07 00 02 07 00 1A 07 00 17 01 07 00 23 00 00 00 01 00 00 5D 07 00 0F 40 01 5B 07 00 0F 00 46 07 00 0F 40 01 4A 07 00 0F 00 40 01 02 40 01 06 0A FF 00 15 00 09 07 00 02 07 00 1A 07 00 17 01 07 00 23 00 07 00 60 00 01 00 01 07 00 0F 00 40 01 02 40 01 44 07 00 0F FF 00 1D 00 09 07 00 02 07 00 1A 07 00 17 01 07 00 23 00 00 00 01 00 00 FF 00 1B 00 09 07 00 02 07 00 1A 07 00 17 01 07 00 23 01 00 00 01 00 00 4C 07 00 0F 00 FF 00 0D 00 09 07 00 02 07 00 1A 07 00 17 01 07 00 23 00 00 00 01 00 00 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  93     101    104    105    Ljava/lang/NumberFormatException;
        //  56     89     92     93     Ljava/lang/NumberFormatException;
        //  38     84     84     85     Ljava/lang/NumberFormatException;
        //  33     52     55     56     Ljava/lang/NumberFormatException;
        //  134    158    161    191    Ljava/lang/NumberFormatException;
        //  219    229    232    233    Ljava/lang/NumberFormatException;
        //  134    147    150    151    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0056:
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
    public void a(final dg dg, final BitSet set) {
        final boolean ab = rf.ab;
        dg.c();
        int i = 0;
        while (i < set.length()) {
            int n2 = 0;
            Label_0055: {
                Label_0054: {
                    Label_0051: {
                        Label_0043: {
                            try {
                                if (ab) {
                                    return;
                                }
                                final BitSet set2 = set;
                                final int n = i;
                                final boolean b;
                                n2 = ((b = set2.get(n)) ? 1 : 0);
                                final boolean b2 = ab;
                                if (!b2) {
                                    break Label_0043;
                                }
                                break Label_0051;
                            }
                            catch (NumberFormatException ex) {
                                throw ex;
                            }
                            try {
                                final BitSet set2 = set;
                                final int n = i;
                                final boolean b;
                                n2 = ((b = set2.get(n)) ? 1 : 0);
                                final boolean b2 = ab;
                                if (b2) {
                                    break Label_0051;
                                }
                                if (!b) {
                                    break Label_0054;
                                }
                            }
                            catch (NumberFormatException ex2) {
                                throw ex2;
                            }
                        }
                        n2 = 1;
                    }
                    break Label_0055;
                }
                n2 = 0;
            }
            dg.a((long)n2);
            ++i;
            if (ab) {
                break;
            }
        }
        dg.d();
    }
    
    static {
        final String[] array = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "e\u0005iZxE\u000f?Y}X\u0018zO4Z\nsNq\f\u001ffKq\u0016K";
        int n3 = -1;
        String intern = null;
    Label_0062_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n5;
            final int n4 = n5 = (length = charArray.length);
            int n6 = 0;
            while (true) {
                Label_0138: {
                    if (n4 > 1) {
                        break Label_0138;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = ',';
                                break;
                            }
                            case 1: {
                                c2 = 'k';
                                break;
                            }
                            case 2: {
                                c2 = '\u001f';
                                break;
                            }
                            case 3: {
                                c2 = ';';
                                break;
                            }
                            default: {
                                c2 = '\u0014';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n6;
                    } while (n4 == 0);
                }
                if (n4 > n6) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    array[n2] = intern;
                    n = (n2 = 1);
                    s = "i\u0019mTf\u0016KZCdI\bkRzKQ?Y}X\u0018zO4B\u001erYq^KiZxY\u000e?\u0013%\u0000K/\u00128\f-pNzHQ?";
                    n3 = 0;
                    continue Label_0062_Outer;
                }
                case 0: {
                    break Label_0062_Outer;
                }
            }
        }
        array[n] = intern;
        z = new String[] { "Invalid bitset value type: ", "Error: Expecting: bitset number value (1, 0), Found: " };
    }
}
