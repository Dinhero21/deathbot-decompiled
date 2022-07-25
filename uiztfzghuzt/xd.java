// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Map;

public final class xd
{
    private final Map<Type, cb<?>> a;
    public static int b;
    
    public xd(final Map<Type, cb<?>> a) {
        this.a = a;
    }
    
    public <T> ue<T> a(final ag<T> ag) {
        final int b = xd.b;
        final Type b2 = ag.b();
        final Class<? super T> a = ag.a();
        final cb<?> cb = this.a.get(b2);
        cb<?> cb3 = null;
        Label_0070: {
            Label_0044: {
                cb<?> cb2;
                try {
                    cb2 = (cb3 = cb);
                    if (b != 0) {
                        break Label_0070;
                    }
                    if (cb2 != null) {
                        break Label_0044;
                    }
                    break Label_0044;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    if (cb2 != null) {
                        return (ue<T>)new yd(this, cb, b2);
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            cb3 = this.a.get(a);
        }
        final cb<?> cb4 = cb3;
        try {
            if (cb4 != null) {
                return (ue<T>)new ee(this, cb4, b2);
            }
        }
        catch (kg kg3) {
            throw kg3;
        }
        final ue<Object> a2 = this.a((Class<? super Object>)a);
        ue<Object> a3 = null;
        Label_0121: {
            Label_0115: {
                ue<Object> ue;
                try {
                    ue = (a3 = a2);
                    if (b != 0) {
                        break Label_0121;
                    }
                    if (ue != null) {
                        return (ue<T>)a2;
                    }
                    break Label_0115;
                }
                catch (kg kg4) {
                    throw kg4;
                }
                try {
                    if (ue != null) {
                        return (ue<T>)a2;
                    }
                }
                catch (kg kg5) {
                    throw kg5;
                }
            }
            a3 = this.a(b2, (Class<? super Object>)a);
        }
        final ue<Object> ue2 = a3;
        ue<Object> ue3;
        try {
            final ue<Object> b3;
            ue3 = (b3 = ue2);
            if (b != 0) {
                return (ue<T>)b3;
            }
            if (ue3 != null) {
                return (ue<T>)ue2;
            }
            return (ue<T>)this.b(b2, (Class<? super Object>)a);
        }
        catch (kg kg6) {
            throw kg6;
        }
        try {
            if (ue3 != null) {
                return (ue<T>)ue2;
            }
        }
        catch (kg kg7) {
            throw kg7;
        }
        ue<Object> b3 = this.b(b2, (Class<? super Object>)a);
        return (ue<T>)b3;
    }
    
    private <T> ue<T> a(final Class<? super T> clazz) {
        try {
            final Constructor<? super T> declaredConstructor = clazz.getDeclaredConstructor((Class<?>[])new Class[0]);
            Constructor<? super T> constructor2 = null;
            Label_0026: {
                Constructor<? super T> constructor;
                try {
                    constructor = (constructor2 = declaredConstructor);
                    if (xd.b != 0) {
                        break Label_0026;
                    }
                    final boolean b = constructor.isAccessible();
                    if (!b) {
                        break Label_0026;
                    }
                    return (ue<T>)new fe(this, declaredConstructor);
                }
                catch (NoSuchMethodException ex) {
                    throw ex;
                }
                try {
                    final boolean b = constructor.isAccessible();
                    if (b) {
                        return (ue<T>)new fe(this, declaredConstructor);
                    }
                    constructor2 = declaredConstructor;
                }
                catch (NoSuchMethodException ex2) {
                    throw ex2;
                }
            }
            constructor2.setAccessible(true);
            return (ue<T>)new fe(this, declaredConstructor);
        }
        catch (NoSuchMethodException ex3) {
            return null;
        }
    }
    
    private <T> ue<T> a(final Type p0, final Class<? super T> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: ldc             Ljava/util/Collection;.class
        //     6: aload_2        
        //     7: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    10: iload_3        
        //    11: ifne            141
        //    14: ifeq            135
        //    17: goto            21
        //    20: athrow         
        //    21: ldc             Ljava/util/SortedSet;.class
        //    23: aload_2        
        //    24: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    27: iload_3        
        //    28: ifne            58
        //    31: goto            35
        //    34: athrow         
        //    35: ifeq            52
        //    38: goto            42
        //    41: athrow         
        //    42: new             Luiztfzghuzt/ge;
        //    45: dup            
        //    46: aload_0        
        //    47: invokespecial   uiztfzghuzt/ge.<init>:(Luiztfzghuzt/xd;)V
        //    50: areturn        
        //    51: athrow         
        //    52: ldc             Ljava/util/EnumSet;.class
        //    54: aload_2        
        //    55: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    58: iload_3        
        //    59: ifne            86
        //    62: ifeq            80
        //    65: goto            69
        //    68: athrow         
        //    69: new             Luiztfzghuzt/he;
        //    72: dup            
        //    73: aload_0        
        //    74: aload_1        
        //    75: invokespecial   uiztfzghuzt/he.<init>:(Luiztfzghuzt/xd;Ljava/lang/reflect/Type;)V
        //    78: areturn        
        //    79: athrow         
        //    80: ldc             Ljava/util/Set;.class
        //    82: aload_2        
        //    83: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    86: iload_3        
        //    87: ifne            113
        //    90: ifeq            107
        //    93: goto            97
        //    96: athrow         
        //    97: new             Luiztfzghuzt/ie;
        //   100: dup            
        //   101: aload_0        
        //   102: invokespecial   uiztfzghuzt/ie.<init>:(Luiztfzghuzt/xd;)V
        //   105: areturn        
        //   106: athrow         
        //   107: ldc             Ljava/util/Queue;.class
        //   109: aload_2        
        //   110: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   113: ifeq            126
        //   116: new             Luiztfzghuzt/je;
        //   119: dup            
        //   120: aload_0        
        //   121: invokespecial   uiztfzghuzt/je.<init>:(Luiztfzghuzt/xd;)V
        //   124: areturn        
        //   125: athrow         
        //   126: new             Luiztfzghuzt/ke;
        //   129: dup            
        //   130: aload_0        
        //   131: invokespecial   uiztfzghuzt/ke.<init>:(Luiztfzghuzt/xd;)V
        //   134: areturn        
        //   135: ldc             Ljava/util/Map;.class
        //   137: aload_2        
        //   138: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   141: iload_3        
        //   142: ifne            162
        //   145: ifeq            300
        //   148: goto            152
        //   151: athrow         
        //   152: ldc             Ljava/util/concurrent/ConcurrentNavigableMap;.class
        //   154: aload_2        
        //   155: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   158: goto            162
        //   161: athrow         
        //   162: iload_3        
        //   163: ifne            189
        //   166: ifeq            183
        //   169: goto            173
        //   172: athrow         
        //   173: new             Luiztfzghuzt/le;
        //   176: dup            
        //   177: aload_0        
        //   178: invokespecial   uiztfzghuzt/le.<init>:(Luiztfzghuzt/xd;)V
        //   181: areturn        
        //   182: athrow         
        //   183: ldc             Ljava/util/concurrent/ConcurrentMap;.class
        //   185: aload_2        
        //   186: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   189: iload_3        
        //   190: ifne            216
        //   193: ifeq            210
        //   196: goto            200
        //   199: athrow         
        //   200: new             Luiztfzghuzt/zd;
        //   203: dup            
        //   204: aload_0        
        //   205: invokespecial   uiztfzghuzt/zd.<init>:(Luiztfzghuzt/xd;)V
        //   208: areturn        
        //   209: athrow         
        //   210: ldc             Ljava/util/SortedMap;.class
        //   212: aload_2        
        //   213: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   216: iload_3        
        //   217: ifne            241
        //   220: ifeq            237
        //   223: goto            227
        //   226: athrow         
        //   227: new             Luiztfzghuzt/ae;
        //   230: dup            
        //   231: aload_0        
        //   232: invokespecial   uiztfzghuzt/ae.<init>:(Luiztfzghuzt/xd;)V
        //   235: areturn        
        //   236: athrow         
        //   237: aload_1        
        //   238: instanceof      Ljava/lang/reflect/ParameterizedType;
        //   241: iload_3        
        //   242: ifne            278
        //   245: ifeq            291
        //   248: goto            252
        //   251: athrow         
        //   252: ldc             Ljava/lang/String;.class
        //   254: aload_1        
        //   255: checkcast       Ljava/lang/reflect/ParameterizedType;
        //   258: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments:()[Ljava/lang/reflect/Type;
        //   263: iconst_0       
        //   264: aaload         
        //   265: invokestatic    uiztfzghuzt/ag.a:(Ljava/lang/reflect/Type;)Luiztfzghuzt/ag;
        //   268: invokevirtual   uiztfzghuzt/ag.a:()Ljava/lang/Class;
        //   271: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   274: goto            278
        //   277: athrow         
        //   278: ifne            291
        //   281: new             Luiztfzghuzt/be;
        //   284: dup            
        //   285: aload_0        
        //   286: invokespecial   uiztfzghuzt/be.<init>:(Luiztfzghuzt/xd;)V
        //   289: areturn        
        //   290: athrow         
        //   291: new             Luiztfzghuzt/ce;
        //   294: dup            
        //   295: aload_0        
        //   296: invokespecial   uiztfzghuzt/ce.<init>:(Luiztfzghuzt/xd;)V
        //   299: areturn        
        //   300: aconst_null    
        //   301: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/lang/reflect/Type;Ljava/lang/Class<-TT;>;)Luiztfzghuzt/ue<TT;>;
        //    StackMapTable: 00 31 FF 00 14 00 04 07 00 02 07 00 37 07 00 39 01 00 01 07 00 13 00 4C 07 00 13 40 01 45 07 00 13 00 48 07 00 13 00 45 01 49 07 00 13 00 49 07 00 13 00 45 01 49 07 00 13 00 48 07 00 13 00 45 01 4B 07 00 13 00 08 45 01 49 07 00 13 00 48 07 00 13 40 01 49 07 00 13 00 48 07 00 13 00 45 01 49 07 00 13 00 48 07 00 13 00 45 01 49 07 00 13 00 48 07 00 13 00 43 01 49 07 00 13 00 58 07 00 13 40 01 4B 07 00 13 00 08
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  278    290    290    291    Luiztfzghuzt/kg;
        //  245    274    277    278    Luiztfzghuzt/kg;
        //  241    248    251    252    Luiztfzghuzt/kg;
        //  220    236    236    237    Luiztfzghuzt/kg;
        //  216    223    226    227    Luiztfzghuzt/kg;
        //  193    209    209    210    Luiztfzghuzt/kg;
        //  189    196    199    200    Luiztfzghuzt/kg;
        //  166    182    182    183    Luiztfzghuzt/kg;
        //  162    169    172    173    Luiztfzghuzt/kg;
        //  145    158    161    162    Luiztfzghuzt/kg;
        //  141    148    151    152    Luiztfzghuzt/kg;
        //  113    125    125    126    Luiztfzghuzt/kg;
        //  90     106    106    107    Luiztfzghuzt/kg;
        //  86     93     96     97     Luiztfzghuzt/kg;
        //  62     79     79     80     Luiztfzghuzt/kg;
        //  58     65     68     69     Luiztfzghuzt/kg;
        //  35     51     51     52     Luiztfzghuzt/kg;
        //  21     38     41     42     Luiztfzghuzt/kg;
        //  14     31     34     35     Luiztfzghuzt/kg;
        //  4      17     20     21     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0021:
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
    
    private <T> ue<T> b(final Type type, final Class<? super T> clazz) {
        return (ue<T>)new de(this, clazz, type);
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
}
