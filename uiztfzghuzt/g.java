// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Locale;
import java.lang.reflect.Field;

public enum g implements z
{
    IDENTITY("IDENTITY", 0) {
        h(final String s, final int n) {
        }
        
        @Override
        public String translateName(final Field field) {
            return field.getName();
        }
    }, 
    UPPER_CAMEL_CASE("UPPER_CAMEL_CASE", 1) {
        i(final String s, final int n) {
        }
        
        @Override
        public String translateName(final Field field) {
            return g.a(field.getName());
        }
    }, 
    UPPER_CAMEL_CASE_WITH_SPACES("UPPER_CAMEL_CASE_WITH_SPACES", 2) {
        j(final String s, final int n) {
        }
        
        @Override
        public String translateName(final Field field) {
            return g.a(g.a(field.getName(), " "));
        }
    }, 
    LOWER_CASE_WITH_UNDERSCORES("LOWER_CASE_WITH_UNDERSCORES", 3) {
        k(final String s, final int n) {
        }
        
        @Override
        public String translateName(final Field field) {
            return g.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    }, 
    LOWER_CASE_WITH_DASHES("LOWER_CASE_WITH_DASHES", 4) {
        l(final String s, final int n) {
        }
        
        @Override
        public String translateName(final Field field) {
            return g.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };
    
    private static final g[] a;
    private static final String[] z;
    
    static String a(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: astore_2       
        //    13: iconst_0       
        //    14: istore_3       
        //    15: aload_0        
        //    16: invokevirtual   java/lang/String.length:()I
        //    19: istore          4
        //    21: iload_3        
        //    22: iload           4
        //    24: if_icmpge       101
        //    27: aload_0        
        //    28: iload           6
        //    30: ifne            105
        //    33: iload_3        
        //    34: invokevirtual   java/lang/String.charAt:(I)C
        //    37: istore          5
        //    39: iload           6
        //    41: ifne            96
        //    44: iload           5
        //    46: invokestatic    java/lang/Character.isUpperCase:(C)Z
        //    49: ifeq            86
        //    52: goto            56
        //    55: athrow         
        //    56: aload_2        
        //    57: iload           6
        //    59: ifne            92
        //    62: goto            66
        //    65: athrow         
        //    66: invokevirtual   java/lang/StringBuilder.length:()I
        //    69: ifeq            86
        //    72: goto            76
        //    75: athrow         
        //    76: aload_2        
        //    77: aload_1        
        //    78: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    81: pop            
        //    82: goto            86
        //    85: athrow         
        //    86: aload_2        
        //    87: iload           5
        //    89: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    92: pop            
        //    93: iinc            3, 1
        //    96: iload           6
        //    98: ifeq            21
        //   101: aload_2        
        //   102: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   105: areturn        
        //    StackMapTable: 00 0D FF 00 15 00 07 07 00 32 07 00 32 07 00 2D 01 01 00 01 00 00 FF 00 21 00 07 07 00 32 07 00 32 07 00 2D 01 01 01 01 00 01 07 00 26 00 48 07 00 26 40 07 00 2D 48 07 00 26 00 48 07 00 26 00 45 07 00 2D 03 FF 00 04 00 07 07 00 32 07 00 32 07 00 2D 01 01 00 01 00 00 43 07 00 32
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  66     82     85     86     Luiztfzghuzt/kg;
        //  56     72     75     76     Luiztfzghuzt/kg;
        //  44     62     65     66     Luiztfzghuzt/kg;
        //  39     52     55     56     Luiztfzghuzt/kg;
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
    
    static String a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: astore_1       
        //    13: iconst_0       
        //    14: istore_2       
        //    15: aload_0        
        //    16: iload_2        
        //    17: invokevirtual   java/lang/String.charAt:(I)C
        //    20: istore_3       
        //    21: aload_0        
        //    22: invokevirtual   java/lang/String.length:()I
        //    25: istore          4
        //    27: iload_2        
        //    28: iload           4
        //    30: iconst_1       
        //    31: isub           
        //    32: if_icmpge       93
        //    35: iload_3        
        //    36: invokestatic    java/lang/Character.isLetter:(C)Z
        //    39: iload           6
        //    41: ifne            97
        //    44: iload           6
        //    46: ifne            87
        //    49: goto            53
        //    52: athrow         
        //    53: ifeq            69
        //    56: goto            60
        //    59: athrow         
        //    60: iload           6
        //    62: ifeq            93
        //    65: goto            69
        //    68: athrow         
        //    69: aload_1        
        //    70: iload_3        
        //    71: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    74: pop            
        //    75: aload_0        
        //    76: iinc            2, 1
        //    79: iload_2        
        //    80: invokevirtual   java/lang/String.charAt:(I)C
        //    83: goto            87
        //    86: athrow         
        //    87: istore_3       
        //    88: iload           6
        //    90: ifeq            27
        //    93: iload_3        
        //    94: invokestatic    java/lang/Character.isUpperCase:(C)Z
        //    97: iload           6
        //    99: ifne            117
        //   102: ifne            137
        //   105: goto            109
        //   108: athrow         
        //   109: iload_3        
        //   110: invokestatic    java/lang/Character.toUpperCase:(C)C
        //   113: goto            117
        //   116: athrow         
        //   117: aload_0        
        //   118: iinc            2, 1
        //   121: iload_2        
        //   122: invokestatic    uiztfzghuzt/g.a:(CLjava/lang/String;I)Ljava/lang/String;
        //   125: astore          5
        //   127: aload_1        
        //   128: aload           5
        //   130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   133: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   136: areturn        
        //   137: aload_0        
        //   138: areturn        
        //    StackMapTable: 00 10 FF 00 1B 00 07 07 00 32 07 00 2D 01 01 01 00 01 00 00 58 07 00 26 40 01 45 07 00 26 00 47 07 00 26 00 50 07 00 26 40 01 05 43 01 4A 07 00 26 00 46 07 00 26 40 01 13
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  102    113    116    117    Luiztfzghuzt/kg;
        //  97     105    108    109    Luiztfzghuzt/kg;
        //  60     83     86     87     Luiztfzghuzt/kg;
        //  53     65     68     69     Luiztfzghuzt/kg;
        //  44     56     59     60     Luiztfzghuzt/kg;
        //  35     49     52     53     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    
    private static String a(final char c, final String s, final int beginIndex) {
        Label_0018: {
            try {
                final char c2 = (char)beginIndex;
                if (fb.a != 0) {
                    return String.valueOf(c2);
                }
                final String s2 = s;
                final int n = s2.length();
                if (beginIndex < n) {
                    break Label_0018;
                }
                break Label_0018;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final String s2 = s;
                final int n = s2.length();
                if (beginIndex < n) {
                    return c + s.substring(beginIndex);
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        final char c2 = c;
        return String.valueOf(c2);
    }
    
    g(final String s, final int n, final h g) {
        this();
    }
    
    static {
        final String[] array = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "ao\u0010*Ck|\u0001\"Tx`\u0003.Bq`\u0017&E|`\u0013?Pwz\u0013";
        int n6 = -1;
        String intern = null;
    Label_0107_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0182: {
                    if (n7 > 1) {
                        break Label_0182;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = '4';
                                break;
                            }
                            case 1: {
                                c2 = '?';
                                break;
                            }
                            case 2: {
                                c2 = '@';
                                break;
                            }
                            case 3: {
                                c2 = 'o';
                                break;
                            }
                            default: {
                                c2 = '\u0011';
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
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 1))));
                    s = "xp\u0017*Ck|\u0001<Tkh\t;Ykj\u000e+Tfl\u0003 Cql";
                    n6 = 0;
                    continue Label_0107_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "xp\u0017*Ck|\u0001<Tkh\t;Yk{\u0001<Yql";
                    n6 = 1;
                    continue Label_0107_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "ao\u0010*Ck|\u0001\"Tx`\u0003.Bq";
                    n6 = 2;
                    continue Label_0107_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "}{\u0005!E}k\u0019";
                    n6 = 3;
                    continue Label_0107_Outer;
                }
                case 3: {
                    break Label_0107_Outer;
                }
            }
        }
        array[n5] = intern;
        z = new String[] { "UPPER_CAMEL_CASE_WITH_SPACES", "LOWER_CASE_WITH_UNDERSCORES", "LOWER_CASE_WITH_DASHES", "UPPER_CAMEL_CASE", "IDENTITY" };
        a = new g[] { g.IDENTITY, g.UPPER_CAMEL_CASE, g.UPPER_CAMEL_CASE_WITH_SPACES, g.LOWER_CASE_WITH_UNDERSCORES, g.LOWER_CASE_WITH_DASHES };
    }
}
