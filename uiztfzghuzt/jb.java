// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

public final class jb extends fb
{
    private static final Class<?>[] b;
    private Object c;
    
    public jb(final Boolean b) {
        this.a(b);
    }
    
    public jb(final Number n) {
        this.a(n);
    }
    
    public jb(final String s) {
        this.a(s);
    }
    
    jb(final Object o) {
        this.a(o);
    }
    
    void a(final Object c) {
        if (c instanceof Character) {
            this.c = String.valueOf((char)c);
        }
        else {
            boolean b2 = false;
            Label_0050: {
                Label_0044: {
                    try {
                        if (c instanceof Number) {
                            break Label_0044;
                        }
                        final Object o = c;
                        final boolean b = b(o);
                        if (b) {
                            break Label_0044;
                        }
                        break Label_0044;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        final Object o = c;
                        final boolean b = b(o);
                        if (b) {
                            b2 = true;
                            break Label_0050;
                        }
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                b2 = false;
            }
            sd.a(b2);
            this.c = c;
        }
    }
    
    public boolean e() {
        return this.c instanceof Boolean;
    }
    
    Boolean f() {
        return (Boolean)this.c;
    }
    
    public boolean g() {
        Label_0017: {
            boolean b;
            try {
                final boolean b2;
                b = (b2 = this.e());
                if (fb.a != 0) {
                    return b2;
                }
                if (b) {
                    break Label_0017;
                }
                return Boolean.parseBoolean(this.h());
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                if (b) {
                    return this.f();
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        return Boolean.parseBoolean(this.h());
    }
    
    public boolean h() {
        return this.c instanceof Number;
    }
    
    public Number i() {
        Label_0020: {
            Object o;
            try {
                final Object o2;
                o = (o2 = this.c);
                if (fb.a != 0) {
                    return (Number)o2;
                }
                final boolean b = o instanceof String;
                if (b) {
                    break Label_0020;
                }
                break Label_0020;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final boolean b = o instanceof String;
                if (b) {
                    return new r((String)this.c);
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        Object o2 = this.c;
        return (Number)o2;
    }
    
    public boolean j() {
        return this.c instanceof String;
    }
    
    @Override
    public String h() {
        final int a = fb.a;
        Label_0040: {
            boolean b2 = false;
            Label_0028: {
                Label_0019: {
                    boolean b;
                    try {
                        b = (b2 = this.h());
                        if (a != 0) {
                            break Label_0040;
                        }
                        if (b) {
                            break Label_0019;
                        }
                        break Label_0028;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        if (b) {
                            return this.i().toString();
                        }
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                try {
                    final Object c = this;
                    if (a != 0) {
                        return (String)c;
                    }
                    b2 = this.e();
                }
                catch (kg kg3) {
                    throw kg3;
                }
            }
            try {
                if (b2) {
                    return this.f().toString();
                }
            }
            catch (kg kg4) {
                throw kg4;
            }
        }
        final Object c = this.c;
        return (String)c;
    }
    
    public double k() {
        Label_0017: {
            try {
                final jb jb = this;
                if (fb.a != 0) {
                    return Double.parseDouble(jb.h());
                }
                final boolean b = this.h();
                if (b) {
                    break Label_0017;
                }
                break Label_0017;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final boolean b = this.h();
                if (b) {
                    return this.i().doubleValue();
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        final jb jb = this;
        return Double.parseDouble(jb.h());
    }
    
    public long l() {
        Label_0017: {
            try {
                final jb jb = this;
                if (fb.a != 0) {
                    return Long.parseLong(jb.h());
                }
                final boolean b = this.h();
                if (b) {
                    break Label_0017;
                }
                break Label_0017;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final boolean b = this.h();
                if (b) {
                    return this.i().longValue();
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        final jb jb = this;
        return Long.parseLong(jb.h());
    }
    
    public int m() {
        Label_0017: {
            try {
                final jb jb = this;
                if (fb.a != 0) {
                    return Integer.parseInt(jb.h());
                }
                final boolean b = this.h();
                if (b) {
                    break Label_0017;
                }
                break Label_0017;
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                final boolean b = this.h();
                if (b) {
                    return this.i().intValue();
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        final jb jb = this;
        return Integer.parseInt(jb.h());
    }
    
    private static boolean b(final Object o) {
        try {
            if (o instanceof String) {
                return true;
            }
        }
        catch (kg kg) {
            throw kg;
        }
        final Class<?> class1 = o.getClass();
        for (final Class<?> clazz : jb.b) {
            try {
                if (clazz.isAssignableFrom(class1)) {
                    return true;
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int a = fb.a;
        Label_0061: {
            Label_0054: {
                Label_0024: {
                    Label_0023: {
                        try {
                            final jb jb = this;
                            if (a != 0) {
                                break Label_0024;
                            }
                            final Object o = this.c;
                            if (o == null) {
                                return 31;
                            }
                            break Label_0023;
                        }
                        catch (kg kg) {
                            throw kg;
                        }
                        try {
                            final Object o = this.c;
                            if (o == null) {
                                return 31;
                            }
                        }
                        catch (kg kg2) {
                            throw kg2;
                        }
                    }
                    final jb jb = this;
                    try {
                        final int n;
                        final boolean b2;
                        final boolean b = b2 = ((n = (a(jb) ? 1 : 0)) != 0);
                        if (a != 0) {
                            break Label_0061;
                        }
                        if (!b) {
                            break Label_0054;
                        }
                    }
                    catch (kg kg3) {
                        throw kg3;
                    }
                }
                final long longValue = this.i().longValue();
                return (int)(longValue ^ longValue >>> 32);
            }
            boolean b2;
            int n = (b2 = (this.c instanceof Number)) ? 1 : 0;
            try {
                if (a != 0) {
                    return n;
                }
                if (!b2) {
                    return this.c.hashCode();
                }
            }
            catch (kg kg4) {
                throw kg4;
            }
        }
        final long doubleToLongBits = Double.doubleToLongBits(this.i().doubleValue());
        return (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        return this.c.hashCode();
    }
    
    @Override
    public boolean equals(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_0        
        //     6: iload           7
        //     8: ifne            23
        //    11: aload_1        
        //    12: if_acmpne       22
        //    15: goto            19
        //    18: athrow         
        //    19: iconst_1       
        //    20: ireturn        
        //    21: athrow         
        //    22: aload_1        
        //    23: ifnull          50
        //    26: aload_0        
        //    27: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    30: iload           7
        //    32: ifne            54
        //    35: goto            39
        //    38: athrow         
        //    39: aload_1        
        //    40: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    43: if_acmpeq       53
        //    46: goto            50
        //    49: athrow         
        //    50: iconst_0       
        //    51: ireturn        
        //    52: athrow         
        //    53: aload_1        
        //    54: checkcast       Luiztfzghuzt/jb;
        //    57: astore_2       
        //    58: aload_0        
        //    59: iload           7
        //    61: ifne            93
        //    64: getfield        uiztfzghuzt/jb.c:Ljava/lang/Object;
        //    67: ifnonnull       92
        //    70: goto            74
        //    73: athrow         
        //    74: aload_2        
        //    75: getfield        uiztfzghuzt/jb.c:Ljava/lang/Object;
        //    78: ifnonnull       90
        //    81: goto            85
        //    84: athrow         
        //    85: iconst_1       
        //    86: goto            91
        //    89: athrow         
        //    90: iconst_0       
        //    91: ireturn        
        //    92: aload_0        
        //    93: invokestatic    uiztfzghuzt/jb.a:(Luiztfzghuzt/jb;)Z
        //    96: iload           7
        //    98: ifne            172
        //   101: ifeq            165
        //   104: goto            108
        //   107: athrow         
        //   108: aload_2        
        //   109: invokestatic    uiztfzghuzt/jb.a:(Luiztfzghuzt/jb;)Z
        //   112: iload           7
        //   114: ifne            172
        //   117: goto            121
        //   120: athrow         
        //   121: ifeq            165
        //   124: goto            128
        //   127: athrow         
        //   128: aload_0        
        //   129: invokevirtual   uiztfzghuzt/jb.i:()Ljava/lang/Number;
        //   132: invokevirtual   java/lang/Number.longValue:()J
        //   135: aload_2        
        //   136: invokevirtual   uiztfzghuzt/jb.i:()Ljava/lang/Number;
        //   139: invokevirtual   java/lang/Number.longValue:()J
        //   142: lcmp           
        //   143: iload           7
        //   145: ifne            160
        //   148: goto            152
        //   151: athrow         
        //   152: ifne            163
        //   155: goto            159
        //   158: athrow         
        //   159: iconst_1       
        //   160: goto            164
        //   163: iconst_0       
        //   164: ireturn        
        //   165: aload_0        
        //   166: getfield        uiztfzghuzt/jb.c:Ljava/lang/Object;
        //   169: instanceof      Ljava/lang/Number;
        //   172: iload           7
        //   174: ifne            298
        //   177: ifeq            287
        //   180: goto            184
        //   183: athrow         
        //   184: aload_2        
        //   185: getfield        uiztfzghuzt/jb.c:Ljava/lang/Object;
        //   188: instanceof      Ljava/lang/Number;
        //   191: iload           7
        //   193: ifne            298
        //   196: goto            200
        //   199: athrow         
        //   200: ifeq            287
        //   203: goto            207
        //   206: athrow         
        //   207: aload_0        
        //   208: invokevirtual   uiztfzghuzt/jb.i:()Ljava/lang/Number;
        //   211: invokevirtual   java/lang/Number.doubleValue:()D
        //   214: dstore_3       
        //   215: aload_2        
        //   216: invokevirtual   uiztfzghuzt/jb.i:()Ljava/lang/Number;
        //   219: invokevirtual   java/lang/Number.doubleValue:()D
        //   222: dstore          5
        //   224: dload_3        
        //   225: dload           5
        //   227: dcmpl          
        //   228: iload           7
        //   230: ifne            282
        //   233: ifeq            281
        //   236: goto            240
        //   239: athrow         
        //   240: dload_3        
        //   241: invokestatic    java/lang/Double.isNaN:(D)Z
        //   244: iload           7
        //   246: ifne            269
        //   249: goto            253
        //   252: athrow         
        //   253: ifeq            285
        //   256: goto            260
        //   259: athrow         
        //   260: dload           5
        //   262: invokestatic    java/lang/Double.isNaN:(D)Z
        //   265: goto            269
        //   268: athrow         
        //   269: iload           7
        //   271: ifne            282
        //   274: ifeq            285
        //   277: goto            281
        //   280: athrow         
        //   281: iconst_1       
        //   282: goto            286
        //   285: iconst_0       
        //   286: ireturn        
        //   287: aload_0        
        //   288: getfield        uiztfzghuzt/jb.c:Ljava/lang/Object;
        //   291: aload_2        
        //   292: getfield        uiztfzghuzt/jb.c:Ljava/lang/Object;
        //   295: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   298: ireturn        
        //    StackMapTable: 00 39 FF 00 12 00 08 07 00 02 07 00 4F 00 00 00 00 00 01 00 01 07 00 16 00 41 07 00 16 00 40 07 00 4F 4E 07 00 16 40 07 00 81 49 07 00 16 00 41 07 00 16 00 40 07 00 4F FF 00 12 00 08 07 00 02 07 00 4F 07 00 02 00 00 00 00 01 00 01 07 00 16 00 49 07 00 16 00 43 07 00 16 00 40 01 00 40 07 00 02 4D 07 00 16 00 4B 07 00 16 40 01 45 07 00 16 00 56 07 00 16 40 01 45 07 00 16 00 40 01 02 40 01 00 46 01 4A 07 00 16 00 4E 07 00 16 40 01 45 07 00 16 00 FF 00 1F 00 06 07 00 02 07 00 4F 07 00 02 03 03 01 00 01 07 00 16 00 4B 07 00 16 40 01 45 07 00 16 00 47 07 00 16 40 01 4A 07 00 16 00 40 01 02 40 01 FF 00 00 00 08 07 00 02 07 00 4F 07 00 02 00 00 00 00 01 00 00 4A 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  269    277    280    281    Luiztfzghuzt/kg;
        //  253    265    268    269    Luiztfzghuzt/kg;
        //  240    256    259    260    Luiztfzghuzt/kg;
        //  233    249    252    253    Luiztfzghuzt/kg;
        //  224    236    239    240    Luiztfzghuzt/kg;
        //  184    203    206    207    Luiztfzghuzt/kg;
        //  177    196    199    200    Luiztfzghuzt/kg;
        //  172    180    183    184    Luiztfzghuzt/kg;
        //  128    155    158    159    Luiztfzghuzt/kg;
        //  121    148    151    152    Luiztfzghuzt/kg;
        //  108    124    127    128    Luiztfzghuzt/kg;
        //  101    117    120    121    Luiztfzghuzt/kg;
        //  93     104    107    108    Luiztfzghuzt/kg;
        //  74     89     89     90     Luiztfzghuzt/kg;
        //  64     81     84     85     Luiztfzghuzt/kg;
        //  58     70     73     74     Luiztfzghuzt/kg;
        //  39     52     52     53     Luiztfzghuzt/kg;
        //  26     46     49     50     Luiztfzghuzt/kg;
        //  23     35     38     39     Luiztfzghuzt/kg;
        //  11     21     21     22     Luiztfzghuzt/kg;
        //  5      15     18     19     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
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
    
    private static boolean a(final jb p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        uiztfzghuzt/jb.c:Ljava/lang/Object;
        //     8: instanceof      Ljava/lang/Number;
        //    11: iload_2        
        //    12: ifne            128
        //    15: ifeq            127
        //    18: goto            22
        //    21: athrow         
        //    22: aload_0        
        //    23: getfield        uiztfzghuzt/jb.c:Ljava/lang/Object;
        //    26: checkcast       Ljava/lang/Number;
        //    29: astore_1       
        //    30: aload_1        
        //    31: instanceof      Ljava/math/BigInteger;
        //    34: iload_2        
        //    35: ifne            122
        //    38: ifne            121
        //    41: goto            45
        //    44: athrow         
        //    45: aload_1        
        //    46: instanceof      Ljava/lang/Long;
        //    49: iload_2        
        //    50: ifne            122
        //    53: goto            57
        //    56: athrow         
        //    57: ifne            121
        //    60: goto            64
        //    63: athrow         
        //    64: aload_1        
        //    65: instanceof      Ljava/lang/Integer;
        //    68: iload_2        
        //    69: ifne            122
        //    72: goto            76
        //    75: athrow         
        //    76: ifne            121
        //    79: goto            83
        //    82: athrow         
        //    83: aload_1        
        //    84: instanceof      Ljava/lang/Short;
        //    87: iload_2        
        //    88: ifne            122
        //    91: goto            95
        //    94: athrow         
        //    95: ifne            121
        //    98: goto            102
        //   101: athrow         
        //   102: aload_1        
        //   103: instanceof      Ljava/lang/Byte;
        //   106: iload_2        
        //   107: ifne            122
        //   110: goto            114
        //   113: athrow         
        //   114: ifeq            125
        //   117: goto            121
        //   120: athrow         
        //   121: iconst_1       
        //   122: goto            126
        //   125: iconst_0       
        //   126: ireturn        
        //   127: iconst_0       
        //   128: ireturn        
        //    StackMapTable: 00 19 FF 00 15 00 03 07 00 02 00 01 00 01 07 00 16 00 FF 00 15 00 03 07 00 02 07 00 26 01 00 01 07 00 16 00 4A 07 00 16 40 01 45 07 00 16 00 4A 07 00 16 40 01 45 07 00 16 00 4A 07 00 16 40 01 45 07 00 16 00 4A 07 00 16 40 01 45 07 00 16 00 40 01 02 40 01 FF 00 00 00 03 07 00 02 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  102    117    120    121    Luiztfzghuzt/kg;
        //  95     110    113    114    Luiztfzghuzt/kg;
        //  83     98     101    102    Luiztfzghuzt/kg;
        //  76     91     94     95     Luiztfzghuzt/kg;
        //  64     79     82     83     Luiztfzghuzt/kg;
        //  57     72     75     76     Luiztfzghuzt/kg;
        //  45     60     63     64     Luiztfzghuzt/kg;
        //  38     53     56     57     Luiztfzghuzt/kg;
        //  30     41     44     45     Luiztfzghuzt/kg;
        //  4      18     21     22     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
        b = new Class[] { Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class };
    }
}
