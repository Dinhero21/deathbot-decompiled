// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

public final class ff implements md
{
    private final xd a;
    private static final String[] z;
    
    public ff(final xd a) {
        this.a = a;
    }
    
    @Override
    public <T> nb<T> a(final ab ab, final ag<T> ag) {
        final od od = ag.a().getAnnotation(od.class);
        try {
            if (od == null) {
                return null;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return (nb<T>)this.a(this.a, ab, ag, od);
    }
    
    nb<?> a(final xd p0, final ab p1, final ag<?> p2, final od p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: aload_1        
        //     6: aload           4
        //     8: invokeinterface uiztfzghuzt/od.a:()Ljava/lang/Class;
        //    13: invokestatic    uiztfzghuzt/ag.b:(Ljava/lang/Class;)Luiztfzghuzt/ag;
        //    16: invokevirtual   uiztfzghuzt/xd.a:(Luiztfzghuzt/ag;)Luiztfzghuzt/ue;
        //    19: invokeinterface uiztfzghuzt/ue.a:()Ljava/lang/Object;
        //    24: astore          5
        //    26: aload           5
        //    28: instanceof      Luiztfzghuzt/nb;
        //    31: iload           9
        //    33: ifne            64
        //    36: ifeq            55
        //    39: goto            43
        //    42: athrow         
        //    43: aload           5
        //    45: checkcast       Luiztfzghuzt/nb;
        //    48: astore          6
        //    50: iload           9
        //    52: ifeq            279
        //    55: aload           5
        //    57: instanceof      Luiztfzghuzt/md;
        //    60: goto            64
        //    63: athrow         
        //    64: iload           9
        //    66: ifne            104
        //    69: ifeq            95
        //    72: goto            76
        //    75: athrow         
        //    76: aload           5
        //    78: checkcast       Luiztfzghuzt/md;
        //    81: aload_2        
        //    82: aload_3        
        //    83: invokeinterface uiztfzghuzt/md.a:(Luiztfzghuzt/ab;Luiztfzghuzt/ag;)Luiztfzghuzt/nb;
        //    88: astore          6
        //    90: iload           9
        //    92: ifeq            279
        //    95: aload           5
        //    97: instanceof      Luiztfzghuzt/mb;
        //   100: goto            104
        //   103: athrow         
        //   104: iload           9
        //   106: ifne            155
        //   109: ifne            137
        //   112: goto            116
        //   115: athrow         
        //   116: aload           5
        //   118: instanceof      Luiztfzghuzt/eb;
        //   121: iload           9
        //   123: ifne            155
        //   126: goto            130
        //   129: athrow         
        //   130: ifeq            222
        //   133: goto            137
        //   136: athrow         
        //   137: aload           5
        //   139: iload           9
        //   141: ifne            160
        //   144: goto            148
        //   147: athrow         
        //   148: instanceof      Luiztfzghuzt/mb;
        //   151: goto            155
        //   154: athrow         
        //   155: ifeq            166
        //   158: aload           5
        //   160: checkcast       Luiztfzghuzt/mb;
        //   163: goto            167
        //   166: aconst_null    
        //   167: astore          7
        //   169: aload           5
        //   171: iload           9
        //   173: ifne            192
        //   176: instanceof      Luiztfzghuzt/eb;
        //   179: ifeq            198
        //   182: goto            186
        //   185: athrow         
        //   186: aload           5
        //   188: goto            192
        //   191: athrow         
        //   192: checkcast       Luiztfzghuzt/eb;
        //   195: goto            199
        //   198: aconst_null    
        //   199: astore          8
        //   201: new             Luiztfzghuzt/fc;
        //   204: dup            
        //   205: aload           7
        //   207: aload           8
        //   209: aload_2        
        //   210: aload_3        
        //   211: aconst_null    
        //   212: invokespecial   uiztfzghuzt/fc.<init>:(Luiztfzghuzt/mb;Luiztfzghuzt/eb;Luiztfzghuzt/ab;Luiztfzghuzt/ag;Luiztfzghuzt/md;)V
        //   215: astore          6
        //   217: iload           9
        //   219: ifeq            279
        //   222: new             Ljava/lang/IllegalArgumentException;
        //   225: dup            
        //   226: new             Ljava/lang/StringBuilder;
        //   229: dup            
        //   230: invokespecial   java/lang/StringBuilder.<init>:()V
        //   233: ldc             "Invalid attempt to bind an instance of "
        //   235: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   238: aload           5
        //   240: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   243: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   246: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   249: ldc             " as a @JsonAdapter for "
        //   251: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   254: aload_3        
        //   255: invokevirtual   uiztfzghuzt/ag.toString:()Ljava/lang/String;
        //   258: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   261: ldc             ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory,"
        //   263: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   266: ldc             " JsonSerializer or JsonDeserializer."
        //   268: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   271: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   274: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   277: athrow         
        //   278: athrow         
        //   279: aload           6
        //   281: iload           9
        //   283: ifne            316
        //   286: ifnull          314
        //   289: goto            293
        //   292: athrow         
        //   293: aload           4
        //   295: invokeinterface uiztfzghuzt/od.b:()Z
        //   300: ifeq            314
        //   303: goto            307
        //   306: athrow         
        //   307: aload           6
        //   309: invokevirtual   uiztfzghuzt/nb.a:()Luiztfzghuzt/nb;
        //   312: astore          6
        //   314: aload           6
        //   316: areturn        
        //    Signature:
        //  (Luiztfzghuzt/xd;Luiztfzghuzt/ab;Luiztfzghuzt/ag<*>;Luiztfzghuzt/od;)Luiztfzghuzt/nb<*>;
        //    StackMapTable: 00 26 FF 00 2A 00 0A 07 00 02 07 00 33 07 00 26 07 00 16 07 00 1B 07 00 04 00 00 00 01 00 01 07 00 14 00 0B 47 07 00 14 40 01 4A 07 00 14 00 12 47 07 00 14 40 01 4A 07 00 14 00 4C 07 00 14 40 01 45 07 00 14 00 49 07 00 14 40 07 00 04 45 07 00 14 40 01 44 07 00 04 05 40 07 00 41 FF 00 11 00 0A 07 00 02 07 00 33 07 00 26 07 00 16 07 00 1B 07 00 04 00 07 00 41 00 01 00 01 07 00 14 00 44 07 00 14 40 07 00 04 05 40 07 00 43 FF 00 16 00 0A 07 00 02 07 00 33 07 00 26 07 00 16 07 00 1B 07 00 04 00 00 00 01 00 00 77 07 00 14 FF 00 00 00 0A 07 00 02 07 00 33 07 00 26 07 00 16 07 00 1B 07 00 04 07 00 3D 00 00 01 00 00 4C 07 00 14 00 4C 07 00 14 00 06 41 07 00 3D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  286    303    306    307    Ljava/lang/IllegalArgumentException;
        //  279    289    292    293    Ljava/lang/IllegalArgumentException;
        //  217    278    278    279    Ljava/lang/IllegalArgumentException;
        //  176    188    191    192    Ljava/lang/IllegalArgumentException;
        //  169    182    185    186    Ljava/lang/IllegalArgumentException;
        //  137    151    154    155    Ljava/lang/IllegalArgumentException;
        //  130    144    147    148    Ljava/lang/IllegalArgumentException;
        //  116    133    136    137    Ljava/lang/IllegalArgumentException;
        //  109    126    129    130    Ljava/lang/IllegalArgumentException;
        //  104    112    115    116    Ljava/lang/IllegalArgumentException;
        //  90     100    103    104    Ljava/lang/IllegalArgumentException;
        //  64     72     75     76     Ljava/lang/IllegalArgumentException;
        //  50     60     63     64     Ljava/lang/IllegalArgumentException;
        //  26     39     42     43     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0116:
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
        final String[] array = new String[4];
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = 0));
        String s = "vs\u0000\u0018KVyV\u0018SKx\u001b\tS\u001fi\u0019YEVs\u0012YFQ=\u001f\u0017TK|\u0018\u001aB\u001fr\u0010Y";
        int n5 = -1;
        String intern = null;
    Label_0092_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n7;
            final int n6 = n7 = (length = charArray.length);
            int n8 = 0;
            while (true) {
                Label_0166: {
                    if (n6 > 1) {
                        break Label_0166;
                    }
                    length = (n7 = n8);
                    do {
                        final char c = charArray[n7];
                        char c2 = '\0';
                        switch (n8 % 5) {
                            case 0: {
                                c2 = '?';
                                break;
                            }
                            case 1: {
                                c2 = '\u001d';
                                break;
                            }
                            case 2: {
                                c2 = 'v';
                                break;
                            }
                            case 3: {
                                c2 = 'y';
                                break;
                            }
                            default: {
                                c2 = '\'';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n8;
                    } while (n6 == 0);
                }
                if (n6 > n8) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n5) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = 1)));
                    s = "\u0011=63TPs7\u001dFOi\u0013\u000b\u0007I|\u001a\fB\u001fp\u0003\nS\u001f\u007f\u0013YF\u001fI\u000f\tB~y\u0017\tSZoZYsFm\u00138C^m\u0002\u001cUy|\u0015\rHMdZ";
                    n5 = 0;
                    continue Label_0092_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = 2)));
                    s = "\u001f|\u0005YF\u001f]<\nHQ\\\u0012\u0018WKx\u0004YAPoV";
                    n5 = 1;
                    continue Label_0092_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = 3)));
                    s = "\u001fW\u0005\u0016Ilx\u0004\u0010FSt\f\u001cU\u001fr\u0004YmLr\u0018=BLx\u0004\u0010FSt\f\u001cU\u0011";
                    n5 = 2;
                    continue Label_0092_Outer;
                }
                case 2: {
                    break Label_0092_Outer;
                }
            }
        }
        array[n4] = intern;
        z = new String[] { "Invalid attempt to bind an instance of ", ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory,", " as a @JsonAdapter for ", " JsonSerializer or JsonDeserializer." };
    }
}
