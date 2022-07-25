// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

class ed extends nb<Object>
{
    final Class b;
    final xf c;
    private static final String[] z;
    
    ed(final xf c, final Class b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void a(final dg dg, final Object o) {
        this.c.b.a(dg, o);
    }
    
    @Override
    public Object a(final bg p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        uiztfzghuzt/ed.c:Luiztfzghuzt/xf;
        //     8: getfield        uiztfzghuzt/xf.b:Luiztfzghuzt/nb;
        //    11: aload_1        
        //    12: invokevirtual   uiztfzghuzt/nb.a:(Luiztfzghuzt/bg;)Ljava/lang/Object;
        //    15: astore_2       
        //    16: aload_2        
        //    17: iload_3        
        //    18: ifne            101
        //    21: ifnull          100
        //    24: goto            28
        //    27: athrow         
        //    28: aload_0        
        //    29: getfield        uiztfzghuzt/ed.b:Ljava/lang/Class;
        //    32: iload_3        
        //    33: ifne            101
        //    36: goto            40
        //    39: athrow         
        //    40: aload_2        
        //    41: invokevirtual   java/lang/Class.isInstance:(Ljava/lang/Object;)Z
        //    44: ifne            100
        //    47: goto            51
        //    50: athrow         
        //    51: new             Luiztfzghuzt/kg;
        //    54: dup            
        //    55: new             Ljava/lang/StringBuilder;
        //    58: dup            
        //    59: invokespecial   java/lang/StringBuilder.<init>:()V
        //    62: ldc             "Expected a "
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: aload_0        
        //    68: getfield        uiztfzghuzt/ed.b:Ljava/lang/Class;
        //    71: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: ldc             " but was "
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: aload_2        
        //    83: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    86: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    92: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    95: invokespecial   uiztfzghuzt/kg.<init>:(Ljava/lang/String;)V
        //    98: athrow         
        //    99: athrow         
        //   100: aload_2        
        //   101: areturn        
        //    Signature:
        //  (Luiztfzghuzt/bg;)Ljava/lang/Object; [from metadata: (Luiztfzghuzt/bg;)TT1;]
        //  
        //    StackMapTable: 00 09 FF 00 1B 00 04 07 00 02 07 00 4B 07 00 3F 01 00 01 07 00 20 00 4A 07 00 20 40 07 00 2A 49 07 00 20 00 6F 07 00 20 00 40 07 00 3F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  40     99     99     100    Luiztfzghuzt/kg;
        //  28     47     50     51     Luiztfzghuzt/kg;
        //  21     36     39     40     Luiztfzghuzt/kg;
        //  16     24     27     28     Luiztfzghuzt/kg;
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
    
    static {
        final String[] array = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "\u0004*\b\u001b8S)\u000eO";
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
                                c2 = '$';
                                break;
                            }
                            case 1: {
                                c2 = 'H';
                                break;
                            }
                            case 2: {
                                c2 = '}';
                                break;
                            }
                            case 3: {
                                c2 = 'o';
                                break;
                            }
                            default: {
                                c2 = '\u0018';
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
                    s = "a0\r\n{P-\u0019Oy\u0004";
                    n3 = 0;
                    continue Label_0062_Outer;
                }
                case 0: {
                    break Label_0062_Outer;
                }
            }
        }
        array[n] = intern;
        z = new String[] { " but was ", "Expected a " };
    }
}
