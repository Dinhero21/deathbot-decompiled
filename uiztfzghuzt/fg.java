// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

public class fg
{
    protected q a;
    protected String b;
    protected String c;
    protected String d;
    protected int e;
    private boolean f;
    public static boolean g;
    
    public fg(final q a, final String b, final int e, final String c, final String d) {
        final boolean g = fg.g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = true;
        if (nb.a) {
            boolean g2 = false;
            Label_0058: {
                try {
                    if (g) {
                        g2 = false;
                        break Label_0058;
                    }
                }
                catch (kg kg) {
                    throw kg;
                }
                g2 = true;
            }
            fg.g = g2;
        }
    }
    
    public String a() {
        return this.c;
    }
    
    public String b() {
        return this.d;
    }
    
    public boolean c() {
        return this.f;
    }
    
    public q d() {
        return this.a;
    }
    
    public String e() {
        return this.b;
    }
    
    public int f() {
        return this.e;
    }
    
    public fg(final q a, final String b, final int e) {
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.b) + ":" + this.e;
    }
    
    @Override
    public boolean equals(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_1        
        //     5: iload_3        
        //     6: ifne            20
        //     9: ifnonnull       19
        //    12: goto            16
        //    15: athrow         
        //    16: iconst_0       
        //    17: ireturn        
        //    18: athrow         
        //    19: aload_1        
        //    20: iload_3        
        //    21: ifne            38
        //    24: instanceof      Luiztfzghuzt/fg;
        //    27: ifne            37
        //    30: goto            34
        //    33: athrow         
        //    34: iconst_0       
        //    35: ireturn        
        //    36: athrow         
        //    37: aload_1        
        //    38: checkcast       Luiztfzghuzt/fg;
        //    41: astore_2       
        //    42: aload_0        
        //    43: aload_0        
        //    44: invokevirtual   uiztfzghuzt/fg.e:()Ljava/lang/String;
        //    47: aload_2        
        //    48: invokevirtual   uiztfzghuzt/fg.e:()Ljava/lang/String;
        //    51: invokespecial   uiztfzghuzt/fg.a:(Ljava/lang/String;Ljava/lang/String;)Z
        //    54: iload_3        
        //    55: ifne            173
        //    58: ifeq            172
        //    61: goto            65
        //    64: athrow         
        //    65: aload_0        
        //    66: aload_0        
        //    67: invokevirtual   uiztfzghuzt/fg.b:()Ljava/lang/String;
        //    70: aload_2        
        //    71: invokevirtual   uiztfzghuzt/fg.b:()Ljava/lang/String;
        //    74: invokespecial   uiztfzghuzt/fg.a:(Ljava/lang/String;Ljava/lang/String;)Z
        //    77: iload_3        
        //    78: ifne            173
        //    81: goto            85
        //    84: athrow         
        //    85: ifeq            172
        //    88: goto            92
        //    91: athrow         
        //    92: aload_0        
        //    93: aload_0        
        //    94: invokevirtual   uiztfzghuzt/fg.a:()Ljava/lang/String;
        //    97: aload_2        
        //    98: invokevirtual   uiztfzghuzt/fg.a:()Ljava/lang/String;
        //   101: invokespecial   uiztfzghuzt/fg.a:(Ljava/lang/String;Ljava/lang/String;)Z
        //   104: iload_3        
        //   105: ifne            173
        //   108: goto            112
        //   111: athrow         
        //   112: ifeq            172
        //   115: goto            119
        //   118: athrow         
        //   119: aload_0        
        //   120: invokevirtual   uiztfzghuzt/fg.f:()I
        //   123: iload_3        
        //   124: ifne            173
        //   127: goto            131
        //   130: athrow         
        //   131: aload_2        
        //   132: invokevirtual   uiztfzghuzt/fg.f:()I
        //   135: if_icmpne       172
        //   138: goto            142
        //   141: athrow         
        //   142: aload_0        
        //   143: aload_0        
        //   144: invokevirtual   uiztfzghuzt/fg.d:()Luiztfzghuzt/q;
        //   147: aload_2        
        //   148: invokevirtual   uiztfzghuzt/fg.d:()Luiztfzghuzt/q;
        //   151: invokespecial   uiztfzghuzt/fg.a:(Luiztfzghuzt/q;Luiztfzghuzt/q;)Z
        //   154: iload_3        
        //   155: ifne            173
        //   158: goto            162
        //   161: athrow         
        //   162: ifeq            172
        //   165: goto            169
        //   168: athrow         
        //   169: iconst_1       
        //   170: ireturn        
        //   171: athrow         
        //   172: iconst_0       
        //   173: ireturn        
        //    StackMapTable: 00 1F FF 00 0F 00 04 07 00 02 07 00 04 00 01 00 01 07 00 13 00 41 07 00 13 00 40 07 00 04 4C 07 00 13 00 41 07 00 13 00 40 07 00 04 FF 00 19 00 04 07 00 02 07 00 04 07 00 02 01 00 01 07 00 13 00 52 07 00 13 40 01 45 07 00 13 00 52 07 00 13 40 01 45 07 00 13 00 4A 07 00 13 40 01 49 07 00 13 00 52 07 00 13 40 01 45 07 00 13 00 41 07 00 13 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  162    171    171    172    Luiztfzghuzt/kg;
        //  142    165    168    169    Luiztfzghuzt/kg;
        //  131    158    161    162    Luiztfzghuzt/kg;
        //  119    138    141    142    Luiztfzghuzt/kg;
        //  112    127    130    131    Luiztfzghuzt/kg;
        //  92     115    118    119    Luiztfzghuzt/kg;
        //  85     108    111    112    Luiztfzghuzt/kg;
        //  65     88     91     92     Luiztfzghuzt/kg;
        //  58     81     84     85     Luiztfzghuzt/kg;
        //  42     61     64     65     Luiztfzghuzt/kg;
        //  24     36     36     37     Luiztfzghuzt/kg;
        //  20     30     33     34     Luiztfzghuzt/kg;
        //  9      18     18     19     Luiztfzghuzt/kg;
        //  4      12     15     16     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    private boolean a(final q p0, final q p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_1        
        //     5: iload_3        
        //     6: ifne            36
        //     9: ifnonnull       35
        //    12: goto            16
        //    15: athrow         
        //    16: aload_2        
        //    17: iload_3        
        //    18: ifne            36
        //    21: goto            25
        //    24: athrow         
        //    25: ifnonnull       35
        //    28: goto            32
        //    31: athrow         
        //    32: iconst_1       
        //    33: ireturn        
        //    34: athrow         
        //    35: aload_1        
        //    36: iload_3        
        //    37: ifne            67
        //    40: ifnonnull       66
        //    43: goto            47
        //    46: athrow         
        //    47: aload_2        
        //    48: iload_3        
        //    49: ifne            67
        //    52: goto            56
        //    55: athrow         
        //    56: ifnull          66
        //    59: goto            63
        //    62: athrow         
        //    63: iconst_0       
        //    64: ireturn        
        //    65: athrow         
        //    66: aload_1        
        //    67: iload_3        
        //    68: ifne            98
        //    71: ifnull          97
        //    74: goto            78
        //    77: athrow         
        //    78: aload_2        
        //    79: iload_3        
        //    80: ifne            98
        //    83: goto            87
        //    86: athrow         
        //    87: ifnonnull       97
        //    90: goto            94
        //    93: athrow         
        //    94: iconst_0       
        //    95: ireturn        
        //    96: athrow         
        //    97: aload_1        
        //    98: aload_2        
        //    99: invokevirtual   uiztfzghuzt/q.equals:(Ljava/lang/Object;)Z
        //   102: iload_3        
        //   103: ifne            117
        //   106: ifeq            116
        //   109: goto            113
        //   112: athrow         
        //   113: iconst_1       
        //   114: ireturn        
        //   115: athrow         
        //   116: iconst_0       
        //   117: ireturn        
        //    StackMapTable: 00 20 FF 00 0F 00 04 07 00 02 07 00 2A 07 00 2A 01 00 01 07 00 13 00 47 07 00 13 40 07 00 2A 45 07 00 13 00 41 07 00 13 00 40 07 00 2A 49 07 00 13 00 47 07 00 13 40 07 00 2A 45 07 00 13 00 41 07 00 13 00 40 07 00 2A 49 07 00 13 00 47 07 00 13 40 07 00 2A 45 07 00 13 00 41 07 00 13 00 40 07 00 2A 4D 07 00 13 00 41 07 00 13 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  106    115    115    116    Luiztfzghuzt/kg;
        //  98     109    112    113    Luiztfzghuzt/kg;
        //  87     96     96     97     Luiztfzghuzt/kg;
        //  78     90     93     94     Luiztfzghuzt/kg;
        //  71     83     86     87     Luiztfzghuzt/kg;
        //  67     74     77     78     Luiztfzghuzt/kg;
        //  56     65     65     66     Luiztfzghuzt/kg;
        //  47     59     62     63     Luiztfzghuzt/kg;
        //  40     52     55     56     Luiztfzghuzt/kg;
        //  36     43     46     47     Luiztfzghuzt/kg;
        //  25     34     34     35     Luiztfzghuzt/kg;
        //  16     28     31     32     Luiztfzghuzt/kg;
        //  9      21     24     25     Luiztfzghuzt/kg;
        //  4      12     15     16     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0016:
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
    
    private boolean a(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_1        
        //     5: iload_3        
        //     6: ifne            36
        //     9: ifnonnull       35
        //    12: goto            16
        //    15: athrow         
        //    16: aload_2        
        //    17: iload_3        
        //    18: ifne            36
        //    21: goto            25
        //    24: athrow         
        //    25: ifnonnull       35
        //    28: goto            32
        //    31: athrow         
        //    32: iconst_1       
        //    33: ireturn        
        //    34: athrow         
        //    35: aload_1        
        //    36: iload_3        
        //    37: ifne            67
        //    40: ifnonnull       66
        //    43: goto            47
        //    46: athrow         
        //    47: aload_2        
        //    48: iload_3        
        //    49: ifne            67
        //    52: goto            56
        //    55: athrow         
        //    56: ifnull          66
        //    59: goto            63
        //    62: athrow         
        //    63: iconst_0       
        //    64: ireturn        
        //    65: athrow         
        //    66: aload_1        
        //    67: iload_3        
        //    68: ifne            98
        //    71: ifnull          97
        //    74: goto            78
        //    77: athrow         
        //    78: aload_2        
        //    79: iload_3        
        //    80: ifne            98
        //    83: goto            87
        //    86: athrow         
        //    87: ifnonnull       97
        //    90: goto            94
        //    93: athrow         
        //    94: iconst_0       
        //    95: ireturn        
        //    96: athrow         
        //    97: aload_1        
        //    98: aload_2        
        //    99: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   102: iload_3        
        //   103: ifne            117
        //   106: ifeq            116
        //   109: goto            113
        //   112: athrow         
        //   113: iconst_1       
        //   114: ireturn        
        //   115: athrow         
        //   116: iconst_0       
        //   117: ireturn        
        //    StackMapTable: 00 20 FF 00 0F 00 04 07 00 02 07 00 2C 07 00 2C 01 00 01 07 00 13 00 47 07 00 13 40 07 00 2C 45 07 00 13 00 41 07 00 13 00 40 07 00 2C 49 07 00 13 00 47 07 00 13 40 07 00 2C 45 07 00 13 00 41 07 00 13 00 40 07 00 2C 49 07 00 13 00 47 07 00 13 40 07 00 2C 45 07 00 13 00 41 07 00 13 00 40 07 00 2C 4D 07 00 13 00 41 07 00 13 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  106    115    115    116    Luiztfzghuzt/kg;
        //  98     109    112    113    Luiztfzghuzt/kg;
        //  87     96     96     97     Luiztfzghuzt/kg;
        //  78     90     93     94     Luiztfzghuzt/kg;
        //  71     83     86     87     Luiztfzghuzt/kg;
        //  67     74     77     78     Luiztfzghuzt/kg;
        //  56     65     65     66     Luiztfzghuzt/kg;
        //  47     59     62     63     Luiztfzghuzt/kg;
        //  40     52     55     56     Luiztfzghuzt/kg;
        //  36     43     46     47     Luiztfzghuzt/kg;
        //  25     34     34     35     Luiztfzghuzt/kg;
        //  16     28     31     32     Luiztfzghuzt/kg;
        //  9      21     24     25     Luiztfzghuzt/kg;
        //  4      12     15     16     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0016:
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
