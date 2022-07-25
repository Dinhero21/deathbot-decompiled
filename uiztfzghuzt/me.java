// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public final class me implements md, Cloneable
{
    public static final me a;
    private double b;
    private int c;
    private boolean d;
    private boolean e;
    private List<x> f;
    private List<x> g;
    
    public me() {
        this.b = -1.0;
        this.c = 136;
        this.d = true;
        this.f = Collections.emptyList();
        this.g = Collections.emptyList();
    }
    
    protected me a() {
        try {
            return (me)super.clone();
        }
        catch (CloneNotSupportedException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public <T> nb<T> a(final ab ab, final ag<T> ag) {
        final Class<? super T> a = ag.a();
        final boolean a2 = this.a(a, true);
        final boolean a3 = this.a(a, false);
        Label_0038: {
            boolean b;
            try {
                b = a2;
                if (xd.b != 0) {
                    break Label_0038;
                }
                if (b) {
                    return (nb<T>)new wb(this, a3, a2, ab, ag);
                }
            }
            catch (kg kg) {
                throw kg;
            }
            try {
                if (!b) {
                    return null;
                }
            }
            catch (kg kg2) {
                throw kg2;
            }
        }
        return (nb<T>)new wb(this, a3, a2, ab, ag);
    }
    
    public boolean a(final Field p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_0        
        //     6: getfield        uiztfzghuzt/me.c:I
        //     9: aload_1        
        //    10: invokevirtual   java/lang/reflect/Field.getModifiers:()I
        //    13: iand           
        //    14: iload           7
        //    16: ifne            37
        //    19: ifeq            29
        //    22: goto            26
        //    25: athrow         
        //    26: iconst_1       
        //    27: ireturn        
        //    28: athrow         
        //    29: aload_0        
        //    30: getfield        uiztfzghuzt/me.b:D
        //    33: ldc2_w          -1.0
        //    36: dcmpl          
        //    37: iload           7
        //    39: ifne            94
        //    42: ifeq            90
        //    45: goto            49
        //    48: athrow         
        //    49: aload_0        
        //    50: aload_1        
        //    51: ldc             Luiztfzghuzt/qd;.class
        //    53: invokevirtual   java/lang/reflect/Field.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //    56: checkcast       Luiztfzghuzt/qd;
        //    59: aload_1        
        //    60: ldc             Luiztfzghuzt/rd;.class
        //    62: invokevirtual   java/lang/reflect/Field.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //    65: checkcast       Luiztfzghuzt/rd;
        //    68: invokespecial   uiztfzghuzt/me.a:(Luiztfzghuzt/qd;Luiztfzghuzt/rd;)Z
        //    71: iload           7
        //    73: ifne            94
        //    76: goto            80
        //    79: athrow         
        //    80: ifne            90
        //    83: goto            87
        //    86: athrow         
        //    87: iconst_1       
        //    88: ireturn        
        //    89: athrow         
        //    90: aload_1        
        //    91: invokevirtual   java/lang/reflect/Field.isSynthetic:()Z
        //    94: iload           7
        //    96: ifne            113
        //    99: ifeq            109
        //   102: goto            106
        //   105: athrow         
        //   106: iconst_1       
        //   107: ireturn        
        //   108: athrow         
        //   109: aload_0        
        //   110: getfield        uiztfzghuzt/me.e:Z
        //   113: iload           7
        //   115: ifne            206
        //   118: ifeq            202
        //   121: goto            125
        //   124: athrow         
        //   125: aload_1        
        //   126: ldc             Luiztfzghuzt/nd;.class
        //   128: invokevirtual   java/lang/reflect/Field.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //   131: checkcast       Luiztfzghuzt/nd;
        //   134: astore_3       
        //   135: aload_3        
        //   136: ifnull          199
        //   139: iload_2        
        //   140: iload           7
        //   142: ifne            187
        //   145: goto            149
        //   148: athrow         
        //   149: ifeq            181
        //   152: goto            156
        //   155: athrow         
        //   156: aload_3        
        //   157: invokeinterface uiztfzghuzt/nd.a:()Z
        //   162: iload           7
        //   164: ifne            206
        //   167: goto            171
        //   170: athrow         
        //   171: ifne            202
        //   174: goto            178
        //   177: athrow         
        //   178: goto            199
        //   181: aload_3        
        //   182: invokeinterface uiztfzghuzt/nd.b:()Z
        //   187: iload           7
        //   189: ifne            206
        //   192: ifne            202
        //   195: goto            199
        //   198: athrow         
        //   199: iconst_1       
        //   200: ireturn        
        //   201: athrow         
        //   202: aload_0        
        //   203: getfield        uiztfzghuzt/me.d:Z
        //   206: iload           7
        //   208: ifne            253
        //   211: ifne            245
        //   214: goto            218
        //   217: athrow         
        //   218: aload_0        
        //   219: aload_1        
        //   220: invokevirtual   java/lang/reflect/Field.getType:()Ljava/lang/Class;
        //   223: invokespecial   uiztfzghuzt/me.b:(Ljava/lang/Class;)Z
        //   226: iload           7
        //   228: ifne            253
        //   231: goto            235
        //   234: athrow         
        //   235: ifeq            245
        //   238: goto            242
        //   241: athrow         
        //   242: iconst_1       
        //   243: ireturn        
        //   244: athrow         
        //   245: aload_0        
        //   246: aload_1        
        //   247: invokevirtual   java/lang/reflect/Field.getType:()Ljava/lang/Class;
        //   250: invokespecial   uiztfzghuzt/me.a:(Ljava/lang/Class;)Z
        //   253: iload           7
        //   255: ifne            269
        //   258: ifeq            268
        //   261: goto            265
        //   264: athrow         
        //   265: iconst_1       
        //   266: ireturn        
        //   267: athrow         
        //   268: iload_2        
        //   269: ifeq            280
        //   272: aload_0        
        //   273: getfield        uiztfzghuzt/me.f:Ljava/util/List;
        //   276: goto            284
        //   279: athrow         
        //   280: aload_0        
        //   281: getfield        uiztfzghuzt/me.g:Ljava/util/List;
        //   284: astore_3       
        //   285: aload_3        
        //   286: invokeinterface java/util/List.isEmpty:()Z
        //   291: iload           7
        //   293: ifne            381
        //   296: ifne            380
        //   299: goto            303
        //   302: athrow         
        //   303: new             Luiztfzghuzt/y;
        //   306: dup            
        //   307: aload_1        
        //   308: invokespecial   uiztfzghuzt/y.<init>:(Ljava/lang/reflect/Field;)V
        //   311: astore          4
        //   313: aload_3        
        //   314: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   319: astore          5
        //   321: aload           5
        //   323: invokeinterface java/util/Iterator.hasNext:()Z
        //   328: ifeq            380
        //   331: aload           5
        //   333: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   338: checkcast       Luiztfzghuzt/x;
        //   341: astore          6
        //   343: aload           6
        //   345: aload           4
        //   347: invokeinterface uiztfzghuzt/x.a:(Luiztfzghuzt/y;)Z
        //   352: iload           7
        //   354: ifne            381
        //   357: iload           7
        //   359: ifne            374
        //   362: goto            366
        //   365: athrow         
        //   366: ifeq            375
        //   369: goto            373
        //   372: athrow         
        //   373: iconst_1       
        //   374: ireturn        
        //   375: iload           7
        //   377: ifeq            321
        //   380: iconst_0       
        //   381: ireturn        
        //    StackMapTable: 00 40 FF 00 19 00 08 07 00 02 07 00 52 01 00 00 00 00 01 00 01 07 00 3A 00 41 07 00 3A 00 47 01 4A 07 00 3A 00 5D 07 00 3A 40 01 45 07 00 3A 00 41 07 00 3A 00 43 01 4A 07 00 3A 00 41 07 00 3A 00 43 01 4A 07 00 3A 00 FF 00 16 00 08 07 00 02 07 00 52 01 07 00 69 00 00 00 01 00 01 07 00 3A 40 01 45 07 00 3A 00 4D 07 00 3A 40 01 45 07 00 3A 00 02 45 01 4A 07 00 3A 00 41 07 00 3A FF 00 00 00 08 07 00 02 07 00 52 01 00 00 00 00 01 00 00 43 01 4A 07 00 3A 00 4F 07 00 3A 40 01 45 07 00 3A 00 41 07 00 3A 00 47 01 4A 07 00 3A 00 41 07 00 3A 00 40 01 49 07 00 3A 00 43 07 00 77 FF 00 11 00 08 07 00 02 07 00 52 01 07 00 77 00 00 00 01 00 01 07 00 3A 00 FF 00 11 00 08 07 00 02 07 00 52 01 07 00 77 07 00 7C 07 00 85 00 01 00 00 FF 00 2B 00 08 07 00 02 07 00 52 01 07 00 77 07 00 7C 07 00 85 07 00 8D 01 00 01 07 00 3A 40 01 45 07 00 3A 00 40 01 00 FF 00 04 00 08 07 00 02 07 00 52 01 07 00 77 00 00 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  357    369    372    373    Luiztfzghuzt/kg;
        //  343    362    365    366    Luiztfzghuzt/kg;
        //  285    299    302    303    Luiztfzghuzt/kg;
        //  269    279    279    280    Luiztfzghuzt/kg;
        //  258    267    267    268    Luiztfzghuzt/kg;
        //  253    261    264    265    Luiztfzghuzt/kg;
        //  235    244    244    245    Luiztfzghuzt/kg;
        //  218    238    241    242    Luiztfzghuzt/kg;
        //  211    231    234    235    Luiztfzghuzt/kg;
        //  206    214    217    218    Luiztfzghuzt/kg;
        //  192    201    201    202    Luiztfzghuzt/kg;
        //  187    195    198    199    Luiztfzghuzt/kg;
        //  156    174    177    178    Luiztfzghuzt/kg;
        //  149    167    170    171    Luiztfzghuzt/kg;
        //  139    152    155    156    Luiztfzghuzt/kg;
        //  135    145    148    149    Luiztfzghuzt/kg;
        //  113    121    124    125    Luiztfzghuzt/kg;
        //  99     108    108    109    Luiztfzghuzt/kg;
        //  94     102    105    106    Luiztfzghuzt/kg;
        //  80     89     89     90     Luiztfzghuzt/kg;
        //  49     83     86     87     Luiztfzghuzt/kg;
        //  42     76     79     80     Luiztfzghuzt/kg;
        //  37     45     48     49     Luiztfzghuzt/kg;
        //  19     28     28     29     Luiztfzghuzt/kg;
        //  5      22     25     26     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
    
    public boolean a(final Class<?> p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_0        
        //     6: getfield        uiztfzghuzt/me.b:D
        //     9: ldc2_w          -1.0
        //    12: dcmpl          
        //    13: iload           6
        //    15: ifne            70
        //    18: ifeq            66
        //    21: goto            25
        //    24: athrow         
        //    25: aload_0        
        //    26: aload_1        
        //    27: ldc             Luiztfzghuzt/qd;.class
        //    29: invokevirtual   java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //    32: checkcast       Luiztfzghuzt/qd;
        //    35: aload_1        
        //    36: ldc             Luiztfzghuzt/rd;.class
        //    38: invokevirtual   java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //    41: checkcast       Luiztfzghuzt/rd;
        //    44: invokespecial   uiztfzghuzt/me.a:(Luiztfzghuzt/qd;Luiztfzghuzt/rd;)Z
        //    47: iload           6
        //    49: ifne            70
        //    52: goto            56
        //    55: athrow         
        //    56: ifne            66
        //    59: goto            63
        //    62: athrow         
        //    63: iconst_1       
        //    64: ireturn        
        //    65: athrow         
        //    66: aload_0        
        //    67: getfield        uiztfzghuzt/me.d:Z
        //    70: iload           6
        //    72: ifne            111
        //    75: ifne            106
        //    78: goto            82
        //    81: athrow         
        //    82: aload_0        
        //    83: aload_1        
        //    84: invokespecial   uiztfzghuzt/me.b:(Ljava/lang/Class;)Z
        //    87: iload           6
        //    89: ifne            111
        //    92: goto            96
        //    95: athrow         
        //    96: ifeq            106
        //    99: goto            103
        //   102: athrow         
        //   103: iconst_1       
        //   104: ireturn        
        //   105: athrow         
        //   106: aload_0        
        //   107: aload_1        
        //   108: invokespecial   uiztfzghuzt/me.a:(Ljava/lang/Class;)Z
        //   111: iload           6
        //   113: ifne            127
        //   116: ifeq            126
        //   119: goto            123
        //   122: athrow         
        //   123: iconst_1       
        //   124: ireturn        
        //   125: athrow         
        //   126: iload_2        
        //   127: ifeq            138
        //   130: aload_0        
        //   131: getfield        uiztfzghuzt/me.f:Ljava/util/List;
        //   134: goto            142
        //   137: athrow         
        //   138: aload_0        
        //   139: getfield        uiztfzghuzt/me.g:Ljava/util/List;
        //   142: astore_3       
        //   143: aload_3        
        //   144: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   149: astore          4
        //   151: aload           4
        //   153: invokeinterface java/util/Iterator.hasNext:()Z
        //   158: ifeq            209
        //   161: aload           4
        //   163: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   168: checkcast       Luiztfzghuzt/x;
        //   171: astore          5
        //   173: aload           5
        //   175: aload_1        
        //   176: invokeinterface uiztfzghuzt/x.a:(Ljava/lang/Class;)Z
        //   181: iload           6
        //   183: ifne            210
        //   186: iload           6
        //   188: ifne            203
        //   191: goto            195
        //   194: athrow         
        //   195: ifeq            204
        //   198: goto            202
        //   201: athrow         
        //   202: iconst_1       
        //   203: ireturn        
        //   204: iload           6
        //   206: ifeq            151
        //   209: iconst_0       
        //   210: ireturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;Z)Z
        //    StackMapTable: 00 23 FF 00 18 00 07 07 00 02 07 00 4F 01 00 00 00 01 00 01 07 00 3A 00 5D 07 00 3A 40 01 45 07 00 3A 00 41 07 00 3A 00 43 01 4A 07 00 3A 00 4C 07 00 3A 40 01 45 07 00 3A 00 41 07 00 3A 00 44 01 4A 07 00 3A 00 41 07 00 3A 00 40 01 49 07 00 3A 00 43 07 00 77 FF 00 08 00 07 07 00 02 07 00 4F 01 07 00 77 07 00 85 00 01 00 00 FF 00 2A 00 07 07 00 02 07 00 4F 01 07 00 77 07 00 85 07 00 8D 01 00 01 07 00 3A 40 01 45 07 00 3A 00 40 01 00 FF 00 04 00 07 07 00 02 07 00 4F 01 07 00 77 07 00 85 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  186    198    201    202    Luiztfzghuzt/kg;
        //  173    191    194    195    Luiztfzghuzt/kg;
        //  127    137    137    138    Luiztfzghuzt/kg;
        //  116    125    125    126    Luiztfzghuzt/kg;
        //  111    119    122    123    Luiztfzghuzt/kg;
        //  96     105    105    106    Luiztfzghuzt/kg;
        //  82     99     102    103    Luiztfzghuzt/kg;
        //  75     92     95     96     Luiztfzghuzt/kg;
        //  70     78     81     82     Luiztfzghuzt/kg;
        //  56     65     65     66     Luiztfzghuzt/kg;
        //  25     59     62     63     Luiztfzghuzt/kg;
        //  18     52     55     56     Luiztfzghuzt/kg;
        //  5      21     24     25     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    
    private boolean a(final Class<?> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: ldc             Ljava/lang/Enum;.class
        //     6: aload_1        
        //     7: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    10: iload_2        
        //    11: ifne            29
        //    14: ifne            63
        //    17: goto            21
        //    20: athrow         
        //    21: aload_1        
        //    22: invokevirtual   java/lang/Class.isAnonymousClass:()Z
        //    25: goto            29
        //    28: athrow         
        //    29: iload_2        
        //    30: ifne            60
        //    33: ifne            59
        //    36: goto            40
        //    39: athrow         
        //    40: aload_1        
        //    41: invokevirtual   java/lang/Class.isLocalClass:()Z
        //    44: iload_2        
        //    45: ifne            60
        //    48: goto            52
        //    51: athrow         
        //    52: ifeq            63
        //    55: goto            59
        //    58: athrow         
        //    59: iconst_1       
        //    60: goto            64
        //    63: iconst_0       
        //    64: ireturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;)Z
        //    StackMapTable: 00 0D FF 00 14 00 03 07 00 02 07 00 4F 01 00 01 07 00 3A 00 46 07 00 3A 40 01 49 07 00 3A 00 4A 07 00 3A 40 01 45 07 00 3A 00 40 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  40     55     58     59     Luiztfzghuzt/kg;
        //  33     48     51     52     Luiztfzghuzt/kg;
        //  29     36     39     40     Luiztfzghuzt/kg;
        //  14     25     28     29     Luiztfzghuzt/kg;
        //  4      17     20     21     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    
    private boolean b(final Class<?> clazz) {
        final int b = xd.b;
        Label_0028: {
            boolean memberClass = false;
            boolean c = false;
            Label_0019: {
                boolean b2;
                try {
                    b2 = (c = (memberClass = clazz.isMemberClass()));
                    if (b != 0) {
                        break Label_0028;
                    }
                    if (b2) {
                        break Label_0019;
                    }
                    return false;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (!b2) {
                        return false;
                    }
                    memberClass = (c = this.c(clazz));
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            try {
                if (b != 0) {
                    return memberClass;
                }
                if (c) {
                    return false;
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
        }
        return true;
        memberClass = false;
        return memberClass;
    }
    
    private boolean c(final Class<?> clazz) {
        int n = 0;
        Label_0024: {
            try {
                n = (clazz.getModifiers() & 0x8);
                if (xd.b != 0) {
                    return n != 0;
                }
                if (n == 0) {
                    break Label_0024;
                }
            }
            catch (kg kg) {
                throw kg;
            }
            return n != 0;
        }
        return n != 0;
    }
    
    private boolean a(final qd qd, final rd rd) {
        final int b = xd.b;
        Label_0029: {
            boolean a2 = false;
            boolean a = false;
            Label_0020: {
                boolean b2;
                try {
                    b2 = (a = (a2 = this.a(qd)));
                    if (b != 0) {
                        break Label_0029;
                    }
                    if (b2) {
                        break Label_0020;
                    }
                    return false;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (!b2) {
                        return false;
                    }
                    a2 = (a = this.a(rd));
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            try {
                if (b != 0) {
                    return a2;
                }
                if (!a) {
                    return false;
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
        }
        return true;
        a2 = false;
        return a2;
    }
    
    private boolean a(final qd qd) {
        final int b = xd.b;
        qd qd2 = null;
        Label_0019: {
            try {
                qd2 = qd;
                if (b != 0) {
                    break Label_0019;
                }
                if (qd == null) {
                    return true;
                }
            }
            catch (kg kg) {
                throw kg;
            }
            qd2 = qd;
        }
        final double a = qd2.a();
        double n;
        try {
            final double n2;
            n = (n2 = dcmpl(a, this.b));
            if (b != 0) {
                return n2 != 0.0;
            }
            if (n > 0) {
                return false;
            }
            return true;
        }
        catch (kg kg2) {
            throw kg2;
        }
        try {
            if (n > 0) {
                return false;
            }
        }
        catch (kg kg3) {
            throw kg3;
        }
        double n2 = true ? 1 : 0;
        return n2 != 0.0;
    }
    
    private boolean a(final rd rd) {
        final int b = xd.b;
        rd rd2 = null;
        Label_0019: {
            try {
                rd2 = rd;
                if (b != 0) {
                    break Label_0019;
                }
                if (rd == null) {
                    return true;
                }
            }
            catch (kg kg) {
                throw kg;
            }
            rd2 = rd;
        }
        final double a = rd2.a();
        double n;
        try {
            final double n2;
            n = (n2 = dcmpg(a, this.b));
            if (b != 0) {
                return n2 != 0.0;
            }
            if (n <= 0) {
                return false;
            }
            return true;
        }
        catch (kg kg2) {
            throw kg2;
        }
        try {
            if (n <= 0) {
                return false;
            }
        }
        catch (kg kg3) {
            throw kg3;
        }
        double n2 = true ? 1 : 0;
        return n2 != 0.0;
    }
    
    static {
        a = new me();
    }
}
