// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

final class cd extends nb<fb>
{
    private static final String z = "Couldn't write ";
    
    @Override
    public fb a(final bg bg) {
        final boolean ab = rf.ab;
        Label_0177: {
            Label_0129: {
                Label_0121: {
                    try {
                        switch (yf.a[bg.g().ordinal()]) {
                            case 3: {
                                return new jb(bg.l());
                            }
                            case 1: {
                                break;
                            }
                            case 2: {
                                return new jb(bg.m());
                            }
                            case 4: {
                                break Label_0121;
                            }
                            case 5: {
                                break Label_0129;
                            }
                            case 6: {
                                break Label_0177;
                            }
                            default: {
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                    return new jb(new r(bg.l()));
                }
                bg.n();
                return hb.b;
            }
            final gb gb = new gb();
            bg.b();
            while (bg.f()) {
                try {
                    gb.a(this.a(bg));
                    if (ab) {
                        return gb;
                    }
                    if (!ab) {
                        continue;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                break;
            }
            bg.c();
            return gb;
        }
        final ib ib = new ib();
        bg.d();
        while (bg.f()) {
            try {
                ib.a(bg.k(), this.a(bg));
                if (ab) {
                    return ib;
                }
                if (!ab) {
                    continue;
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
            break;
        }
        bg.e();
        return ib;
    }
    
    @Override
    public void a(final dg p0, final fb p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: iload           5
        //     7: ifne            47
        //    10: aload_2        
        //    11: ifnull          38
        //    14: goto            18
        //    17: athrow         
        //    18: aload_2        
        //    19: invokevirtual   uiztfzghuzt/fb.d:()Z
        //    22: iload           5
        //    24: ifne            60
        //    27: goto            31
        //    30: athrow         
        //    31: ifeq            52
        //    34: goto            38
        //    37: athrow         
        //    38: aload_1        
        //    39: invokevirtual   uiztfzghuzt/dg.i:()Luiztfzghuzt/dg;
        //    42: pop            
        //    43: goto            47
        //    46: athrow         
        //    47: iload           5
        //    49: ifeq            389
        //    52: aload_2        
        //    53: invokevirtual   uiztfzghuzt/fb.c:()Z
        //    56: goto            60
        //    59: athrow         
        //    60: iload           5
        //    62: ifne            166
        //    65: ifeq            158
        //    68: goto            72
        //    71: athrow         
        //    72: aload_2        
        //    73: invokevirtual   uiztfzghuzt/fb.g:()Luiztfzghuzt/jb;
        //    76: astore_3       
        //    77: aload_3        
        //    78: invokevirtual   uiztfzghuzt/jb.h:()Z
        //    81: iload           5
        //    83: ifne            119
        //    86: ifeq            111
        //    89: goto            93
        //    92: athrow         
        //    93: aload_1        
        //    94: aload_3        
        //    95: invokevirtual   uiztfzghuzt/jb.i:()Ljava/lang/Number;
        //    98: invokevirtual   uiztfzghuzt/dg.a:(Ljava/lang/Number;)Luiztfzghuzt/dg;
        //   101: pop            
        //   102: iload           5
        //   104: ifeq            153
        //   107: goto            111
        //   110: athrow         
        //   111: aload_3        
        //   112: invokevirtual   uiztfzghuzt/jb.e:()Z
        //   115: goto            119
        //   118: athrow         
        //   119: ifeq            140
        //   122: aload_1        
        //   123: aload_3        
        //   124: invokevirtual   uiztfzghuzt/jb.g:()Z
        //   127: invokevirtual   uiztfzghuzt/dg.b:(Z)Luiztfzghuzt/dg;
        //   130: pop            
        //   131: iload           5
        //   133: ifeq            153
        //   136: goto            140
        //   139: athrow         
        //   140: aload_1        
        //   141: aload_3        
        //   142: invokevirtual   uiztfzghuzt/jb.h:()Ljava/lang/String;
        //   145: invokevirtual   uiztfzghuzt/dg.b:(Ljava/lang/String;)Luiztfzghuzt/dg;
        //   148: pop            
        //   149: goto            153
        //   152: athrow         
        //   153: iload           5
        //   155: ifeq            389
        //   158: aload_2        
        //   159: invokevirtual   uiztfzghuzt/fb.a:()Z
        //   162: goto            166
        //   165: athrow         
        //   166: iload           5
        //   168: ifne            259
        //   171: ifeq            242
        //   174: goto            178
        //   177: athrow         
        //   178: aload_1        
        //   179: invokevirtual   uiztfzghuzt/dg.c:()Luiztfzghuzt/dg;
        //   182: pop            
        //   183: aload_2        
        //   184: invokevirtual   uiztfzghuzt/fb.f:()Luiztfzghuzt/gb;
        //   187: invokevirtual   uiztfzghuzt/gb.iterator:()Ljava/util/Iterator;
        //   190: astore_3       
        //   191: aload_3        
        //   192: invokeinterface java/util/Iterator.hasNext:()Z
        //   197: ifeq            232
        //   200: aload_3        
        //   201: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   206: checkcast       Luiztfzghuzt/fb;
        //   209: astore          4
        //   211: aload_0        
        //   212: aload_1        
        //   213: aload           4
        //   215: invokevirtual   uiztfzghuzt/cd.a:(Luiztfzghuzt/dg;Luiztfzghuzt/fb;)V
        //   218: iload           5
        //   220: ifne            237
        //   223: iload           5
        //   225: ifeq            191
        //   228: goto            232
        //   231: athrow         
        //   232: aload_1        
        //   233: invokevirtual   uiztfzghuzt/dg.d:()Luiztfzghuzt/dg;
        //   236: pop            
        //   237: iload           5
        //   239: ifeq            389
        //   242: aload_2        
        //   243: iload           5
        //   245: ifne            272
        //   248: goto            252
        //   251: athrow         
        //   252: invokevirtual   uiztfzghuzt/fb.b:()Z
        //   255: goto            259
        //   258: athrow         
        //   259: ifeq            358
        //   262: aload_1        
        //   263: invokevirtual   uiztfzghuzt/dg.e:()Luiztfzghuzt/dg;
        //   266: pop            
        //   267: aload_2        
        //   268: goto            272
        //   271: athrow         
        //   272: invokevirtual   uiztfzghuzt/fb.e:()Luiztfzghuzt/ib;
        //   275: invokevirtual   uiztfzghuzt/ib.a:()Ljava/util/Set;
        //   278: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   283: astore_3       
        //   284: aload_3        
        //   285: invokeinterface java/util/Iterator.hasNext:()Z
        //   290: ifeq            348
        //   293: aload_3        
        //   294: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   299: checkcast       Ljava/util/Map$Entry;
        //   302: astore          4
        //   304: aload_1        
        //   305: aload           4
        //   307: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   312: checkcast       Ljava/lang/String;
        //   315: invokevirtual   uiztfzghuzt/dg.a:(Ljava/lang/String;)Luiztfzghuzt/dg;
        //   318: pop            
        //   319: aload_0        
        //   320: aload_1        
        //   321: aload           4
        //   323: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   328: checkcast       Luiztfzghuzt/fb;
        //   331: invokevirtual   uiztfzghuzt/cd.a:(Luiztfzghuzt/dg;Luiztfzghuzt/fb;)V
        //   334: iload           5
        //   336: ifne            353
        //   339: iload           5
        //   341: ifeq            284
        //   344: goto            348
        //   347: athrow         
        //   348: aload_1        
        //   349: invokevirtual   uiztfzghuzt/dg.f:()Luiztfzghuzt/dg;
        //   352: pop            
        //   353: iload           5
        //   355: ifeq            389
        //   358: new             Ljava/lang/IllegalArgumentException;
        //   361: dup            
        //   362: new             Ljava/lang/StringBuilder;
        //   365: dup            
        //   366: invokespecial   java/lang/StringBuilder.<init>:()V
        //   369: ldc             "Couldn't write "
        //   371: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   374: aload_2        
        //   375: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   378: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   381: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   384: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   387: athrow         
        //   388: athrow         
        //   389: return         
        //    StackMapTable: 00 2E FF 00 11 00 06 07 00 02 07 00 74 07 00 70 00 00 01 00 01 07 00 11 00 4B 07 00 11 40 01 45 07 00 11 00 47 07 00 11 00 04 46 07 00 11 40 01 4A 07 00 11 00 FF 00 13 00 06 07 00 02 07 00 74 07 00 70 07 00 2A 00 01 00 01 07 00 11 00 50 07 00 11 00 46 07 00 11 40 01 53 07 00 11 00 4B 07 00 11 00 FF 00 04 00 06 07 00 02 07 00 74 07 00 70 00 00 01 00 00 46 07 00 11 40 01 4A 07 00 11 00 FF 00 0C 00 06 07 00 02 07 00 74 07 00 70 07 00 9F 00 01 00 00 FF 00 27 00 06 07 00 02 07 00 74 07 00 70 07 00 9F 07 00 70 01 00 01 07 00 11 FF 00 00 00 06 07 00 02 07 00 74 07 00 70 07 00 9F 00 01 00 00 04 FF 00 04 00 06 07 00 02 07 00 74 07 00 70 00 00 01 00 00 48 07 00 11 40 07 00 70 45 07 00 11 40 01 4B 07 00 11 40 07 00 70 FF 00 0B 00 06 07 00 02 07 00 74 07 00 70 07 00 9F 00 01 00 00 FF 00 3E 00 06 07 00 02 07 00 74 07 00 70 07 00 9F 07 00 B9 01 00 01 07 00 11 FF 00 00 00 06 07 00 02 07 00 74 07 00 70 07 00 9F 00 01 00 00 04 FF 00 04 00 06 07 00 02 07 00 74 07 00 70 00 00 01 00 00 5D 07 00 11 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  353    388    388    389    Ljava/lang/IllegalArgumentException;
        //  304    344    347    348    Ljava/lang/IllegalArgumentException;
        //  259    268    271    272    Ljava/lang/IllegalArgumentException;
        //  242    255    258    259    Ljava/lang/IllegalArgumentException;
        //  237    248    251    252    Ljava/lang/IllegalArgumentException;
        //  211    228    231    232    Ljava/lang/IllegalArgumentException;
        //  166    174    177    178    Ljava/lang/IllegalArgumentException;
        //  153    162    165    166    Ljava/lang/IllegalArgumentException;
        //  122    149    152    153    Ljava/lang/IllegalArgumentException;
        //  119    136    139    140    Ljava/lang/IllegalArgumentException;
        //  93     115    118    119    Ljava/lang/IllegalArgumentException;
        //  86     107    110    111    Ljava/lang/IllegalArgumentException;
        //  77     89     92     93     Ljava/lang/IllegalArgumentException;
        //  60     68     71     72     Ljava/lang/IllegalArgumentException;
        //  47     56     59     60     Ljava/lang/IllegalArgumentException;
        //  31     43     46     47     Ljava/lang/IllegalArgumentException;
        //  18     34     37     38     Ljava/lang/IllegalArgumentException;
        //  10     27     30     31     Ljava/lang/IllegalArgumentException;
        //  5      14     17     18     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
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
        final char[] charArray = "+u`\u001a{\u0006=aVh\u001asa\u0013?".toCharArray();
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
                            c2 = 'h';
                            break;
                        }
                        case 1: {
                            c2 = '\u001a';
                            break;
                        }
                        case 2: {
                            c2 = '\u0015';
                            break;
                        }
                        case 3: {
                            c2 = 'v';
                            break;
                        }
                        default: {
                            c2 = '\u001f';
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
