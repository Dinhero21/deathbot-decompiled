// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
import java.util.Comparator;
import java.io.Serializable;
import java.util.AbstractMap;

public final class mg<K, V> extends AbstractMap<K, V> implements Serializable
{
    private static final Comparator<Comparable> a;
    Comparator<? super K> b;
    te<K, V> c;
    int d;
    int e;
    final te<K, V> f;
    private ng g;
    private og h;
    static final boolean i;
    private static final String[] z;
    
    public mg() {
        this((Comparator)mg.a);
    }
    
    public mg(final Comparator<? super K> comparator) {
        this.d = 0;
        this.e = 0;
        this.f = new te<K, V>();
        Object a = comparator;
        if (xd.b == 0) {
            if (comparator != null) {
                a = comparator;
            }
            else {
                a = mg.a;
            }
        }
        this.b = (Comparator<? super K>)a;
    }
    
    @Override
    public int size() {
        return this.d;
    }
    
    @Override
    public V get(final Object o) {
        final te<K, V> a = this.a(o);
        Object g = null;
        Label_0020: {
            te<K, V> te;
            try {
                te = (te<K, V>)(g = a);
                if (xd.b != 0) {
                    return (V)g;
                }
                if (te != null) {
                    break Label_0020;
                }
                return null;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                if (te == null) {
                    return null;
                }
                g = a.g;
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        return (V)g;
        g = null;
        return (V)g;
    }
    
    @Override
    public boolean containsKey(final Object o) {
        try {
            if (this.a(o) != null) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public V put(final K k, final V g) {
        try {
            if (k == null) {
                throw new NullPointerException("key == null");
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        final te<K, V> a = this.a(k, true);
        final V g2 = a.g;
        a.g = g;
        return g2;
    }
    
    @Override
    public void clear() {
        this.c = null;
        this.d = 0;
        ++this.e;
        final te<K, V> f;
        final te<K, V> te2;
        final te<K, V> te = te2 = (f = this.f);
        te.e = te2;
        f.d = te2;
    }
    
    @Override
    public V remove(final Object o) {
        final te<K, V> b = this.b(o);
        Object g = null;
        Label_0020: {
            te<K, V> te;
            try {
                te = (te<K, V>)(g = b);
                if (xd.b != 0) {
                    return (V)g;
                }
                if (te != null) {
                    break Label_0020;
                }
                return null;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                if (te == null) {
                    return null;
                }
                g = b.g;
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        return (V)g;
        g = null;
        return (V)g;
    }
    
    te<K, V> a(final K p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: aload_0        
        //     6: getfield        uiztfzghuzt/mg.b:Ljava/util/Comparator;
        //     9: astore_3       
        //    10: aload_0        
        //    11: getfield        uiztfzghuzt/mg.c:Luiztfzghuzt/te;
        //    14: astore          4
        //    16: iconst_0       
        //    17: istore          5
        //    19: aload           4
        //    21: ifnull          173
        //    24: aload_3        
        //    25: iload           8
        //    27: ifne            49
        //    30: goto            34
        //    33: athrow         
        //    34: getstatic       uiztfzghuzt/mg.a:Ljava/util/Comparator;
        //    37: if_acmpne       55
        //    40: goto            44
        //    43: athrow         
        //    44: aload_1        
        //    45: goto            49
        //    48: athrow         
        //    49: checkcast       Ljava/lang/Comparable;
        //    52: goto            56
        //    55: aconst_null    
        //    56: astore          6
        //    58: aload           6
        //    60: ifnull          84
        //    63: aload           6
        //    65: aload           4
        //    67: getfield        uiztfzghuzt/te.f:Ljava/lang/Object;
        //    70: invokeinterface java/lang/Comparable.compareTo:(Ljava/lang/Object;)I
        //    75: iload           8
        //    77: ifne            100
        //    80: goto            96
        //    83: athrow         
        //    84: aload_3        
        //    85: aload_1        
        //    86: aload           4
        //    88: getfield        uiztfzghuzt/te.f:Ljava/lang/Object;
        //    91: invokeinterface java/util/Comparator.compare:(Ljava/lang/Object;Ljava/lang/Object;)I
        //    96: istore          5
        //    98: iload           5
        //   100: iload           8
        //   102: ifne            118
        //   105: ifne            116
        //   108: goto            112
        //   111: athrow         
        //   112: aload           4
        //   114: areturn        
        //   115: athrow         
        //   116: iload           5
        //   118: ifge            130
        //   121: aload           4
        //   123: getfield        uiztfzghuzt/te.b:Luiztfzghuzt/te;
        //   126: goto            135
        //   129: athrow         
        //   130: aload           4
        //   132: getfield        uiztfzghuzt/te.c:Luiztfzghuzt/te;
        //   135: astore          7
        //   137: aload           7
        //   139: iload           8
        //   141: ifne            166
        //   144: ifnonnull       160
        //   147: goto            151
        //   150: athrow         
        //   151: iload           8
        //   153: ifeq            173
        //   156: goto            160
        //   159: athrow         
        //   160: aload           7
        //   162: goto            166
        //   165: athrow         
        //   166: astore          4
        //   168: iload           8
        //   170: ifeq            58
        //   173: iload_2        
        //   174: ifne            180
        //   177: aconst_null    
        //   178: areturn        
        //   179: athrow         
        //   180: aload_0        
        //   181: getfield        uiztfzghuzt/mg.f:Luiztfzghuzt/te;
        //   184: astore          6
        //   186: aload           4
        //   188: iload           8
        //   190: ifne            316
        //   193: ifnonnull       295
        //   196: goto            200
        //   199: athrow         
        //   200: aload_3        
        //   201: iload           8
        //   203: ifne            225
        //   206: goto            210
        //   209: athrow         
        //   210: getstatic       uiztfzghuzt/mg.a:Ljava/util/Comparator;
        //   213: if_acmpne       265
        //   216: goto            220
        //   219: athrow         
        //   220: aload_1        
        //   221: goto            225
        //   224: athrow         
        //   225: instanceof      Ljava/lang/Comparable;
        //   228: ifne            265
        //   231: new             Ljava/lang/ClassCastException;
        //   234: dup            
        //   235: new             Ljava/lang/StringBuilder;
        //   238: dup            
        //   239: invokespecial   java/lang/StringBuilder.<init>:()V
        //   242: aload_1        
        //   243: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   246: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: ldc             " is not Comparable"
        //   254: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   257: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   260: invokespecial   java/lang/ClassCastException.<init>:(Ljava/lang/String;)V
        //   263: athrow         
        //   264: athrow         
        //   265: new             Luiztfzghuzt/te;
        //   268: dup            
        //   269: aload           4
        //   271: aload_1        
        //   272: aload           6
        //   274: aload           6
        //   276: getfield        uiztfzghuzt/te.e:Luiztfzghuzt/te;
        //   279: invokespecial   uiztfzghuzt/te.<init>:(Luiztfzghuzt/te;Ljava/lang/Object;Luiztfzghuzt/te;Luiztfzghuzt/te;)V
        //   282: astore          7
        //   284: aload_0        
        //   285: aload           7
        //   287: putfield        uiztfzghuzt/mg.c:Luiztfzghuzt/te;
        //   290: iload           8
        //   292: ifeq            366
        //   295: new             Luiztfzghuzt/te;
        //   298: dup            
        //   299: aload           4
        //   301: aload_1        
        //   302: aload           6
        //   304: aload           6
        //   306: getfield        uiztfzghuzt/te.e:Luiztfzghuzt/te;
        //   309: invokespecial   uiztfzghuzt/te.<init>:(Luiztfzghuzt/te;Ljava/lang/Object;Luiztfzghuzt/te;Luiztfzghuzt/te;)V
        //   312: goto            316
        //   315: athrow         
        //   316: astore          7
        //   318: iload           8
        //   320: ifne            343
        //   323: iload           5
        //   325: ifge            348
        //   328: goto            332
        //   331: athrow         
        //   332: aload           4
        //   334: aload           7
        //   336: putfield        uiztfzghuzt/te.b:Luiztfzghuzt/te;
        //   339: goto            343
        //   342: athrow         
        //   343: iload           8
        //   345: ifeq            359
        //   348: aload           4
        //   350: aload           7
        //   352: putfield        uiztfzghuzt/te.c:Luiztfzghuzt/te;
        //   355: goto            359
        //   358: athrow         
        //   359: aload_0        
        //   360: aload           4
        //   362: iconst_1       
        //   363: invokespecial   uiztfzghuzt/mg.b:(Luiztfzghuzt/te;Z)V
        //   366: aload_0        
        //   367: dup            
        //   368: getfield        uiztfzghuzt/mg.d:I
        //   371: iconst_1       
        //   372: iadd           
        //   373: putfield        uiztfzghuzt/mg.d:I
        //   376: aload_0        
        //   377: dup            
        //   378: getfield        uiztfzghuzt/mg.e:I
        //   381: iconst_1       
        //   382: iadd           
        //   383: putfield        uiztfzghuzt/mg.e:I
        //   386: aload           7
        //   388: areturn        
        //    Signature:
        //  (TK;Z)Luiztfzghuzt/te<TK;TV;>;
        //    StackMapTable: 00 33 FF 00 21 00 09 07 00 02 07 00 43 01 07 00 35 07 00 2A 01 00 00 01 00 01 07 00 3B 40 07 00 35 48 07 00 3B 00 43 07 00 3B 40 07 00 43 05 40 07 00 5B FF 00 01 00 09 07 00 02 07 00 43 01 07 00 35 07 00 2A 01 07 00 5B 00 01 00 00 58 07 00 3B 00 4B 01 43 01 4A 07 00 3B 00 42 07 00 3B 00 41 01 4A 07 00 3B 00 44 07 00 2A FF 00 0E 00 09 07 00 02 07 00 43 01 07 00 35 07 00 2A 01 07 00 5B 07 00 2A 01 00 01 07 00 3B 00 47 07 00 3B 00 44 07 00 3B 40 07 00 2A FF 00 06 00 09 07 00 02 07 00 43 01 07 00 35 07 00 2A 01 00 00 01 00 00 45 07 00 3B 00 FF 00 12 00 09 07 00 02 07 00 43 01 07 00 35 07 00 2A 01 07 00 2A 00 01 00 01 07 00 3B 00 48 07 00 3B 40 07 00 35 48 07 00 3B 00 43 07 00 3B 40 07 00 43 66 07 00 3B 00 1D 53 07 00 3B 40 07 00 2A FF 00 0E 00 09 07 00 02 07 00 43 01 07 00 35 07 00 2A 01 07 00 2A 07 00 2A 01 00 01 07 00 3B 00 49 07 00 3B 00 04 49 07 00 3B 00 06
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  343    355    358    359    Ljava/lang/NullPointerException;
        //  323    339    342    343    Ljava/lang/NullPointerException;
        //  318    328    331    332    Ljava/lang/NullPointerException;
        //  284    312    315    316    Ljava/lang/NullPointerException;
        //  225    264    264    265    Ljava/lang/NullPointerException;
        //  210    221    224    225    Ljava/lang/NullPointerException;
        //  200    216    219    220    Ljava/lang/NullPointerException;
        //  193    206    209    210    Ljava/lang/NullPointerException;
        //  186    196    199    200    Ljava/lang/NullPointerException;
        //  173    179    179    180    Ljava/lang/NullPointerException;
        //  151    162    165    166    Ljava/lang/NullPointerException;
        //  144    156    159    160    Ljava/lang/NullPointerException;
        //  137    147    150    151    Ljava/lang/NullPointerException;
        //  118    129    129    130    Ljava/lang/NullPointerException;
        //  105    115    115    116    Ljava/lang/NullPointerException;
        //  100    108    111    112    Ljava/lang/NullPointerException;
        //  63     83     83     84     Ljava/lang/NullPointerException;
        //  34     45     48     49     Ljava/lang/NullPointerException;
        //  24     40     43     44     Ljava/lang/NullPointerException;
        //  19     30     33     34     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0034:
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
    
    te<K, V> a(final Object o) {
        try {
            try {
                if (o != null) {
                    final te<Object, V> a = this.a(o, false);
                    return (te<K, V>)a;
                }
            }
            catch (ClassCastException ex) {
                throw ex;
            }
            final te<Object, V> a = null;
            return (te<K, V>)a;
        }
        catch (ClassCastException ex2) {
            return null;
        }
    }
    
    te<K, V> a(final Entry<?, ?> entry) {
        final te<K, V> a = this.a(entry.getKey());
        boolean b = false;
        Label_0051: {
            Label_0050: {
                Label_0047: {
                    Label_0039: {
                        try {
                            if (a == null) {
                                break Label_0050;
                            }
                            final mg mg = this;
                            final te<K, V> te = a;
                            final V v = te.g;
                            final Map.Entry<?, ?> entry2 = entry;
                            final Object o = entry2.getValue();
                            final boolean b2;
                            b = (b2 = mg.a(v, o));
                            final int n = xd.b;
                            if (n == 0) {
                                break Label_0039;
                            }
                            break Label_0047;
                        }
                        catch (NullPointerException ex) {
                            throw ex;
                        }
                        try {
                            final mg mg = this;
                            final te<K, V> te = a;
                            final V v = te.g;
                            final Map.Entry<?, ?> entry2 = entry;
                            final Object o = entry2.getValue();
                            final boolean b2;
                            b = (b2 = mg.a(v, o));
                            final int n = xd.b;
                            if (n != 0) {
                                break Label_0047;
                            }
                            if (!b2) {
                                break Label_0050;
                            }
                        }
                        catch (NullPointerException ex2) {
                            throw ex2;
                        }
                    }
                    b = true;
                }
                break Label_0051;
            }
            b = false;
        }
        final boolean b3 = b;
        try {
            if (b3) {
                return a;
            }
        }
        catch (NullPointerException ex3) {
            throw ex3;
        }
        return null;
    }
    
    private boolean a(final Object o, final Object obj) {
        final int b = xd.b;
        boolean equals = false;
        Label_0049: {
            Label_0053: {
                Label_0034: {
                    Label_0022: {
                        Object o3 = null;
                        Label_0017: {
                            try {
                                final Object o2 = o;
                                o3 = o;
                                if (b != 0) {
                                    break Label_0022;
                                }
                                final Object o4 = obj;
                                if (o != o4) {
                                    break Label_0017;
                                }
                                break Label_0049;
                            }
                            catch (NullPointerException ex) {
                                throw ex;
                            }
                            try {
                                final Object o4 = obj;
                                if (o == o4) {
                                    break Label_0049;
                                }
                                final Object o2 = o;
                                o3 = o;
                            }
                            catch (NullPointerException ex2) {
                                throw ex2;
                            }
                        }
                        try {
                            if (b != 0) {
                                break Label_0034;
                            }
                            if (o3 == null) {
                                break Label_0053;
                            }
                        }
                        catch (NullPointerException ex3) {
                            throw ex3;
                        }
                    }
                    final Object o2 = o;
                    try {
                        equals = o2.equals(obj);
                        if (b != 0) {
                            return equals;
                        }
                        if (!equals) {
                            break Label_0053;
                        }
                    }
                    catch (NullPointerException ex4) {
                        throw ex4;
                    }
                }
                break Label_0049;
            }
            return equals;
        }
        return equals;
    }
    
    void a(final te<K, V> p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: iload           9
        //     7: ifne            33
        //    10: iload_2        
        //    11: ifeq            44
        //    14: goto            18
        //    17: athrow         
        //    18: aload_1        
        //    19: getfield        uiztfzghuzt/te.e:Luiztfzghuzt/te;
        //    22: aload_1        
        //    23: getfield        uiztfzghuzt/te.d:Luiztfzghuzt/te;
        //    26: putfield        uiztfzghuzt/te.d:Luiztfzghuzt/te;
        //    29: goto            33
        //    32: athrow         
        //    33: aload_1        
        //    34: getfield        uiztfzghuzt/te.d:Luiztfzghuzt/te;
        //    37: aload_1        
        //    38: getfield        uiztfzghuzt/te.e:Luiztfzghuzt/te;
        //    41: putfield        uiztfzghuzt/te.e:Luiztfzghuzt/te;
        //    44: aload_1        
        //    45: getfield        uiztfzghuzt/te.b:Luiztfzghuzt/te;
        //    48: astore_3       
        //    49: aload_1        
        //    50: getfield        uiztfzghuzt/te.c:Luiztfzghuzt/te;
        //    53: astore          4
        //    55: aload_1        
        //    56: getfield        uiztfzghuzt/te.a:Luiztfzghuzt/te;
        //    59: astore          5
        //    61: aload_3        
        //    62: iload           9
        //    64: ifne            255
        //    67: ifnull          254
        //    70: goto            74
        //    73: athrow         
        //    74: aload           4
        //    76: iload           9
        //    78: ifne            255
        //    81: goto            85
        //    84: athrow         
        //    85: ifnull          254
        //    88: goto            92
        //    91: athrow         
        //    92: aload_3        
        //    93: iload           9
        //    95: ifne            127
        //    98: goto            102
        //   101: athrow         
        //   102: getfield        uiztfzghuzt/te.h:I
        //   105: aload           4
        //   107: getfield        uiztfzghuzt/te.h:I
        //   110: if_icmple       125
        //   113: goto            117
        //   116: athrow         
        //   117: aload_3        
        //   118: invokevirtual   uiztfzghuzt/te.b:()Luiztfzghuzt/te;
        //   121: goto            130
        //   124: athrow         
        //   125: aload           4
        //   127: invokevirtual   uiztfzghuzt/te.a:()Luiztfzghuzt/te;
        //   130: astore          6
        //   132: aload_0        
        //   133: aload           6
        //   135: iconst_0       
        //   136: invokevirtual   uiztfzghuzt/mg.a:(Luiztfzghuzt/te;Z)V
        //   139: iconst_0       
        //   140: istore          7
        //   142: aload_1        
        //   143: getfield        uiztfzghuzt/te.b:Luiztfzghuzt/te;
        //   146: astore_3       
        //   147: aload_3        
        //   148: iload           9
        //   150: ifne            179
        //   153: ifnull          183
        //   156: goto            160
        //   159: athrow         
        //   160: aload_3        
        //   161: getfield        uiztfzghuzt/te.h:I
        //   164: istore          7
        //   166: aload           6
        //   168: aload_3        
        //   169: putfield        uiztfzghuzt/te.b:Luiztfzghuzt/te;
        //   172: aload_3        
        //   173: aload           6
        //   175: putfield        uiztfzghuzt/te.a:Luiztfzghuzt/te;
        //   178: aload_1        
        //   179: aconst_null    
        //   180: putfield        uiztfzghuzt/te.b:Luiztfzghuzt/te;
        //   183: iconst_0       
        //   184: istore          8
        //   186: aload_1        
        //   187: getfield        uiztfzghuzt/te.c:Luiztfzghuzt/te;
        //   190: astore          4
        //   192: aload           4
        //   194: iload           9
        //   196: ifne            234
        //   199: ifnull          232
        //   202: goto            206
        //   205: athrow         
        //   206: aload           4
        //   208: getfield        uiztfzghuzt/te.h:I
        //   211: istore          8
        //   213: aload           6
        //   215: aload           4
        //   217: putfield        uiztfzghuzt/te.c:Luiztfzghuzt/te;
        //   220: aload           4
        //   222: aload           6
        //   224: putfield        uiztfzghuzt/te.a:Luiztfzghuzt/te;
        //   227: aload_1        
        //   228: aconst_null    
        //   229: putfield        uiztfzghuzt/te.c:Luiztfzghuzt/te;
        //   232: aload           6
        //   234: iload           7
        //   236: iload           8
        //   238: invokestatic    java/lang/Math.max:(II)I
        //   241: iconst_1       
        //   242: iadd           
        //   243: putfield        uiztfzghuzt/te.h:I
        //   246: aload_0        
        //   247: aload_1        
        //   248: aload           6
        //   250: invokespecial   uiztfzghuzt/mg.a:(Luiztfzghuzt/te;Luiztfzghuzt/te;)V
        //   253: return         
        //   254: aload_3        
        //   255: iload           9
        //   257: ifne            308
        //   260: ifnull          306
        //   263: goto            267
        //   266: athrow         
        //   267: aload_0        
        //   268: aload_1        
        //   269: aload_3        
        //   270: invokespecial   uiztfzghuzt/mg.a:(Luiztfzghuzt/te;Luiztfzghuzt/te;)V
        //   273: aload_1        
        //   274: aconst_null    
        //   275: putfield        uiztfzghuzt/te.b:Luiztfzghuzt/te;
        //   278: iload           9
        //   280: ifeq            351
        //   283: goto            287
        //   286: athrow         
        //   287: getstatic       uiztfzghuzt/nb.a:Z
        //   290: ifeq            302
        //   293: goto            297
        //   296: athrow         
        //   297: iconst_0       
        //   298: goto            303
        //   301: athrow         
        //   302: iconst_1       
        //   303: putstatic       uiztfzghuzt/nb.a:Z
        //   306: aload           4
        //   308: iload           9
        //   310: ifne            332
        //   313: ifnull          341
        //   316: goto            320
        //   319: athrow         
        //   320: aload_0        
        //   321: aload_1        
        //   322: aload           4
        //   324: invokespecial   uiztfzghuzt/mg.a:(Luiztfzghuzt/te;Luiztfzghuzt/te;)V
        //   327: aload_1        
        //   328: goto            332
        //   331: athrow         
        //   332: aconst_null    
        //   333: putfield        uiztfzghuzt/te.c:Luiztfzghuzt/te;
        //   336: iload           9
        //   338: ifeq            351
        //   341: aload_0        
        //   342: aload_1        
        //   343: aconst_null    
        //   344: invokespecial   uiztfzghuzt/mg.a:(Luiztfzghuzt/te;Luiztfzghuzt/te;)V
        //   347: goto            351
        //   350: athrow         
        //   351: aload_0        
        //   352: aload           5
        //   354: iconst_0       
        //   355: invokespecial   uiztfzghuzt/mg.b:(Luiztfzghuzt/te;Z)V
        //   358: aload_0        
        //   359: dup            
        //   360: getfield        uiztfzghuzt/mg.d:I
        //   363: iconst_1       
        //   364: isub           
        //   365: putfield        uiztfzghuzt/mg.d:I
        //   368: aload_0        
        //   369: dup            
        //   370: getfield        uiztfzghuzt/mg.e:I
        //   373: iconst_1       
        //   374: iadd           
        //   375: putfield        uiztfzghuzt/mg.e:I
        //   378: return         
        //    Signature:
        //  (Luiztfzghuzt/te<TK;TV;>;Z)V
        //    StackMapTable: 00 2F FF 00 11 00 0A 07 00 02 07 00 2A 01 00 00 00 00 00 00 01 00 01 07 00 3B 00 4D 07 00 3B 00 0A FF 00 1C 00 0A 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 00 00 00 01 00 01 07 00 3B 00 49 07 00 3B 40 07 00 2A 45 07 00 3B 00 48 07 00 3B 40 07 00 2A 4D 07 00 3B 00 46 07 00 3B 00 41 07 00 2A 42 07 00 2A FF 00 1C 00 0A 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 07 00 2A 01 00 01 00 01 07 00 3B 00 52 07 00 2A 03 FF 00 15 00 0A 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 07 00 2A 01 01 01 00 01 07 00 3B 00 19 41 07 00 2A FF 00 13 00 0A 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 00 00 00 01 00 00 40 07 00 2A 4A 07 00 3B 00 52 07 00 3B 00 48 07 00 3B 00 43 07 00 3B 00 40 01 02 41 07 00 2A 4A 07 00 3B 00 4A 07 00 3B 40 07 00 2A 08 48 07 00 3B 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  332    347    350    351    Ljava/lang/NullPointerException;
        //  313    328    331    332    Ljava/lang/NullPointerException;
        //  308    316    319    320    Ljava/lang/NullPointerException;
        //  287    301    301    302    Ljava/lang/NullPointerException;
        //  267    293    296    297    Ljava/lang/NullPointerException;
        //  260    283    286    287    Ljava/lang/NullPointerException;
        //  255    263    266    267    Ljava/lang/NullPointerException;
        //  192    202    205    206    Ljava/lang/NullPointerException;
        //  147    156    159    160    Ljava/lang/NullPointerException;
        //  102    124    124    125    Ljava/lang/NullPointerException;
        //  92     113    116    117    Ljava/lang/NullPointerException;
        //  85     98     101    102    Ljava/lang/NullPointerException;
        //  74     88     91     92     Ljava/lang/NullPointerException;
        //  67     81     84     85     Ljava/lang/NullPointerException;
        //  61     70     73     74     Ljava/lang/NullPointerException;
        //  10     29     32     33     Ljava/lang/NullPointerException;
        //  5      14     17     18     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0074:
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
    
    te<K, V> b(final Object o) {
        final te<K, V> a = this.a(o);
        Label_0020: {
            te<K, V> te;
            try {
                final te<K, V> te2;
                te = (te2 = a);
                if (xd.b != 0) {
                    return te2;
                }
                if (te != null) {
                    break Label_0020;
                }
                return a;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                if (te != null) {
                    this.a(a, true);
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        return a;
    }
    
    private void a(final te<K, V> p0, final te<K, V> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_1        
        //     6: getfield        uiztfzghuzt/te.a:Luiztfzghuzt/te;
        //     9: astore_3       
        //    10: aload_1        
        //    11: aconst_null    
        //    12: putfield        uiztfzghuzt/te.a:Luiztfzghuzt/te;
        //    15: aload_2        
        //    16: iload           4
        //    18: ifne            38
        //    21: ifnull          37
        //    24: goto            28
        //    27: athrow         
        //    28: aload_2        
        //    29: aload_3        
        //    30: putfield        uiztfzghuzt/te.a:Luiztfzghuzt/te;
        //    33: goto            37
        //    36: athrow         
        //    37: aload_3        
        //    38: iload           4
        //    40: ifne            58
        //    43: ifnull          135
        //    46: goto            50
        //    49: athrow         
        //    50: aload_3        
        //    51: getfield        uiztfzghuzt/te.b:Luiztfzghuzt/te;
        //    54: goto            58
        //    57: athrow         
        //    58: aload_1        
        //    59: iload           4
        //    61: ifne            77
        //    64: if_acmpne       85
        //    67: goto            71
        //    70: athrow         
        //    71: aload_3        
        //    72: aload_2        
        //    73: goto            77
        //    76: athrow         
        //    77: putfield        uiztfzghuzt/te.b:Luiztfzghuzt/te;
        //    80: iload           4
        //    82: ifeq            144
        //    85: getstatic       uiztfzghuzt/mg.i:Z
        //    88: ifne            125
        //    91: goto            95
        //    94: athrow         
        //    95: aload_3        
        //    96: getfield        uiztfzghuzt/te.c:Luiztfzghuzt/te;
        //    99: aload_1        
        //   100: iload           4
        //   102: ifne            127
        //   105: goto            109
        //   108: athrow         
        //   109: if_acmpeq       125
        //   112: goto            116
        //   115: athrow         
        //   116: new             Ljava/lang/AssertionError;
        //   119: dup            
        //   120: invokespecial   java/lang/AssertionError.<init>:()V
        //   123: athrow         
        //   124: athrow         
        //   125: aload_3        
        //   126: aload_2        
        //   127: putfield        uiztfzghuzt/te.c:Luiztfzghuzt/te;
        //   130: iload           4
        //   132: ifeq            144
        //   135: aload_0        
        //   136: aload_2        
        //   137: putfield        uiztfzghuzt/mg.c:Luiztfzghuzt/te;
        //   140: goto            144
        //   143: athrow         
        //   144: return         
        //    Signature:
        //  (Luiztfzghuzt/te<TK;TV;>;Luiztfzghuzt/te<TK;TV;>;)V
        //    StackMapTable: 00 1A FF 00 1B 00 05 07 00 02 07 00 2A 07 00 2A 07 00 2A 01 00 01 07 00 3B 00 47 07 00 3B 00 40 07 00 2A 4A 07 00 3B 00 46 07 00 3B 40 07 00 2A 4B 07 00 3B 00 44 07 00 3B FF 00 00 00 05 07 00 02 07 00 2A 07 00 2A 07 00 2A 01 00 02 07 00 2A 07 00 2A 07 48 07 00 3B 00 4C 07 00 3B FF 00 00 00 05 07 00 02 07 00 2A 07 00 2A 07 00 2A 01 00 02 07 00 2A 07 00 2A 45 07 00 3B 00 47 07 00 3B 00 FF 00 01 00 05 07 00 02 07 00 2A 07 00 2A 07 00 2A 01 00 02 07 00 2A 07 00 2A 07 47 07 00 3B 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  127    140    143    144    Ljava/lang/NullPointerException;
        //  109    124    124    125    Ljava/lang/NullPointerException;
        //  95     112    115    116    Ljava/lang/NullPointerException;
        //  85     105    108    109    Ljava/lang/NullPointerException;
        //  77     91     94     95     Ljava/lang/NullPointerException;
        //  64     73     76     77     Ljava/lang/NullPointerException;
        //  58     67     70     71     Ljava/lang/NullPointerException;
        //  43     54     57     58     Ljava/lang/NullPointerException;
        //  38     46     49     50     Ljava/lang/NullPointerException;
        //  21     33     36     37     Ljava/lang/NullPointerException;
        //  10     24     27     28     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0085:
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
    
    private void b(final te<K, V> p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          14
        //     5: aload_1        
        //     6: astore_3       
        //     7: aload_3        
        //     8: ifnull          682
        //    11: aload_3        
        //    12: getfield        uiztfzghuzt/te.b:Luiztfzghuzt/te;
        //    15: astore          4
        //    17: aload_3        
        //    18: getfield        uiztfzghuzt/te.c:Luiztfzghuzt/te;
        //    21: astore          5
        //    23: aload           4
        //    25: iload           14
        //    27: ifne            39
        //    30: ifnull          45
        //    33: goto            37
        //    36: athrow         
        //    37: aload           4
        //    39: getfield        uiztfzghuzt/te.h:I
        //    42: goto            46
        //    45: iconst_0       
        //    46: istore          6
        //    48: aload           5
        //    50: iload           14
        //    52: ifne            64
        //    55: ifnull          70
        //    58: goto            62
        //    61: athrow         
        //    62: aload           5
        //    64: getfield        uiztfzghuzt/te.h:I
        //    67: goto            71
        //    70: iconst_0       
        //    71: istore          7
        //    73: iload           6
        //    75: iload           7
        //    77: isub           
        //    78: istore          8
        //    80: iload           8
        //    82: bipush          -2
        //    84: iload           14
        //    86: ifne            314
        //    89: if_icmpne       298
        //    92: goto            96
        //    95: athrow         
        //    96: aload           5
        //    98: getfield        uiztfzghuzt/te.b:Luiztfzghuzt/te;
        //   101: astore          9
        //   103: aload           5
        //   105: getfield        uiztfzghuzt/te.c:Luiztfzghuzt/te;
        //   108: astore          10
        //   110: aload           10
        //   112: iload           14
        //   114: ifne            126
        //   117: ifnull          132
        //   120: goto            124
        //   123: athrow         
        //   124: aload           10
        //   126: getfield        uiztfzghuzt/te.h:I
        //   129: goto            133
        //   132: iconst_0       
        //   133: istore          11
        //   135: aload           9
        //   137: iload           14
        //   139: ifne            151
        //   142: ifnull          157
        //   145: goto            149
        //   148: athrow         
        //   149: aload           9
        //   151: getfield        uiztfzghuzt/te.h:I
        //   154: goto            158
        //   157: iconst_0       
        //   158: istore          12
        //   160: iload           12
        //   162: iload           11
        //   164: isub           
        //   165: istore          13
        //   167: iload           14
        //   169: ifne            226
        //   172: iload           13
        //   174: iconst_m1      
        //   175: if_icmpeq       217
        //   178: goto            182
        //   181: athrow         
        //   182: iload           13
        //   184: iload           14
        //   186: ifne            238
        //   189: goto            193
        //   192: athrow         
        //   193: ifne            231
        //   196: goto            200
        //   199: athrow         
        //   200: iload_2        
        //   201: iload           14
        //   203: ifne            238
        //   206: goto            210
        //   209: athrow         
        //   210: ifne            231
        //   213: goto            217
        //   216: athrow         
        //   217: aload_0        
        //   218: aload_3        
        //   219: invokespecial   uiztfzghuzt/mg.a:(Luiztfzghuzt/te;)V
        //   222: goto            226
        //   225: athrow         
        //   226: iload           14
        //   228: ifeq            276
        //   231: getstatic       uiztfzghuzt/mg.i:Z
        //   234: goto            238
        //   237: athrow         
        //   238: iload           14
        //   240: ifne            252
        //   243: ifne            265
        //   246: goto            250
        //   249: athrow         
        //   250: iload           13
        //   252: iconst_1       
        //   253: if_icmpeq       265
        //   256: new             Ljava/lang/AssertionError;
        //   259: dup            
        //   260: invokespecial   java/lang/AssertionError.<init>:()V
        //   263: athrow         
        //   264: athrow         
        //   265: aload_0        
        //   266: aload           5
        //   268: invokespecial   uiztfzghuzt/mg.b:(Luiztfzghuzt/te;)V
        //   271: aload_0        
        //   272: aload_3        
        //   273: invokespecial   uiztfzghuzt/mg.a:(Luiztfzghuzt/te;)V
        //   276: iload_2        
        //   277: ifeq            289
        //   280: iload           14
        //   282: ifeq            682
        //   285: goto            289
        //   288: athrow         
        //   289: iload           14
        //   291: ifeq            672
        //   294: goto            298
        //   297: athrow         
        //   298: iload           8
        //   300: iload           14
        //   302: ifne            525
        //   305: goto            309
        //   308: athrow         
        //   309: iconst_2       
        //   310: goto            314
        //   313: athrow         
        //   314: if_icmpne       519
        //   317: aload           4
        //   319: getfield        uiztfzghuzt/te.b:Luiztfzghuzt/te;
        //   322: astore          9
        //   324: aload           4
        //   326: getfield        uiztfzghuzt/te.c:Luiztfzghuzt/te;
        //   329: astore          10
        //   331: aload           10
        //   333: iload           14
        //   335: ifne            347
        //   338: ifnull          353
        //   341: goto            345
        //   344: athrow         
        //   345: aload           10
        //   347: getfield        uiztfzghuzt/te.h:I
        //   350: goto            354
        //   353: iconst_0       
        //   354: istore          11
        //   356: aload           9
        //   358: iload           14
        //   360: ifne            372
        //   363: ifnull          378
        //   366: goto            370
        //   369: athrow         
        //   370: aload           9
        //   372: getfield        uiztfzghuzt/te.h:I
        //   375: goto            379
        //   378: iconst_0       
        //   379: istore          12
        //   381: iload           12
        //   383: iload           11
        //   385: isub           
        //   386: istore          13
        //   388: iload           14
        //   390: ifne            447
        //   393: iload           13
        //   395: iconst_1       
        //   396: if_icmpeq       438
        //   399: goto            403
        //   402: athrow         
        //   403: iload           13
        //   405: iload           14
        //   407: ifne            459
        //   410: goto            414
        //   413: athrow         
        //   414: ifne            452
        //   417: goto            421
        //   420: athrow         
        //   421: iload_2        
        //   422: iload           14
        //   424: ifne            459
        //   427: goto            431
        //   430: athrow         
        //   431: ifne            452
        //   434: goto            438
        //   437: athrow         
        //   438: aload_0        
        //   439: aload_3        
        //   440: invokespecial   uiztfzghuzt/mg.b:(Luiztfzghuzt/te;)V
        //   443: goto            447
        //   446: athrow         
        //   447: iload           14
        //   449: ifeq            497
        //   452: getstatic       uiztfzghuzt/mg.i:Z
        //   455: goto            459
        //   458: athrow         
        //   459: iload           14
        //   461: ifne            473
        //   464: ifne            486
        //   467: goto            471
        //   470: athrow         
        //   471: iload           13
        //   473: iconst_m1      
        //   474: if_icmpeq       486
        //   477: new             Ljava/lang/AssertionError;
        //   480: dup            
        //   481: invokespecial   java/lang/AssertionError.<init>:()V
        //   484: athrow         
        //   485: athrow         
        //   486: aload_0        
        //   487: aload           4
        //   489: invokespecial   uiztfzghuzt/mg.a:(Luiztfzghuzt/te;)V
        //   492: aload_0        
        //   493: aload_3        
        //   494: invokespecial   uiztfzghuzt/mg.b:(Luiztfzghuzt/te;)V
        //   497: iload_2        
        //   498: ifeq            510
        //   501: iload           14
        //   503: ifeq            682
        //   506: goto            510
        //   509: athrow         
        //   510: iload           14
        //   512: ifeq            672
        //   515: goto            519
        //   518: athrow         
        //   519: iload           8
        //   521: goto            525
        //   524: athrow         
        //   525: iload           14
        //   527: ifne            578
        //   530: ifne            571
        //   533: goto            537
        //   536: athrow         
        //   537: aload_3        
        //   538: iload           6
        //   540: iconst_1       
        //   541: iadd           
        //   542: putfield        uiztfzghuzt/te.h:I
        //   545: iload           14
        //   547: ifne            677
        //   550: goto            554
        //   553: athrow         
        //   554: iload_2        
        //   555: ifeq            672
        //   558: goto            562
        //   561: athrow         
        //   562: iload           14
        //   564: ifeq            682
        //   567: goto            571
        //   570: athrow         
        //   571: getstatic       uiztfzghuzt/mg.i:Z
        //   574: goto            578
        //   577: athrow         
        //   578: iload           14
        //   580: ifne            660
        //   583: ifne            637
        //   586: goto            590
        //   589: athrow         
        //   590: iload           8
        //   592: iload           14
        //   594: ifne            660
        //   597: goto            601
        //   600: athrow         
        //   601: iconst_m1      
        //   602: if_icmpeq       637
        //   605: goto            609
        //   608: athrow         
        //   609: iload           8
        //   611: iload           14
        //   613: ifne            660
        //   616: goto            620
        //   619: athrow         
        //   620: iconst_1       
        //   621: if_icmpeq       637
        //   624: goto            628
        //   627: athrow         
        //   628: new             Ljava/lang/AssertionError;
        //   631: dup            
        //   632: invokespecial   java/lang/AssertionError.<init>:()V
        //   635: athrow         
        //   636: athrow         
        //   637: aload_3        
        //   638: iload           6
        //   640: iload           7
        //   642: invokestatic    java/lang/Math.max:(II)I
        //   645: iconst_1       
        //   646: iadd           
        //   647: putfield        uiztfzghuzt/te.h:I
        //   650: iload           14
        //   652: ifne            677
        //   655: iload_2        
        //   656: goto            660
        //   659: athrow         
        //   660: ifne            672
        //   663: iload           14
        //   665: ifeq            682
        //   668: goto            672
        //   671: athrow         
        //   672: aload_3        
        //   673: getfield        uiztfzghuzt/te.a:Luiztfzghuzt/te;
        //   676: astore_3       
        //   677: iload           14
        //   679: ifeq            7
        //   682: return         
        //    Signature:
        //  (Luiztfzghuzt/te<TK;TV;>;Z)V
        //    StackMapTable: 00 75 FF 00 07 00 0F 07 00 02 07 00 2A 01 07 00 2A 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 1C 00 0F 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 00 00 00 00 00 00 00 00 01 00 01 07 00 3B 00 41 07 00 2A 05 40 01 FF 00 0E 00 0F 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 01 00 00 00 00 00 00 00 01 00 01 07 00 3B 00 41 07 00 2A 05 40 01 FF 00 17 00 0F 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 01 01 01 00 00 00 00 00 01 00 01 07 00 3B 00 FF 00 1A 00 0F 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 01 01 01 07 00 2A 07 00 2A 00 00 00 01 00 01 07 00 3B 00 41 07 00 2A 05 40 01 FF 00 0E 00 0F 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 01 01 01 07 00 2A 07 00 2A 01 00 00 01 00 01 07 00 3B 00 41 07 00 2A 05 40 01 FF 00 16 00 0F 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 01 01 01 07 00 2A 07 00 2A 01 01 01 01 00 01 07 00 3B 00 49 07 00 3B 40 01 45 07 00 3B 00 48 07 00 3B 40 01 45 07 00 3B 00 47 07 00 3B 00 04 45 07 00 3B 40 01 4A 07 00 3B 00 41 01 4B 07 00 3B 00 0A 4B 07 00 3B 00 47 07 00 3B FF 00 00 00 0F 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 01 01 01 00 00 00 00 00 01 00 00 49 07 00 3B 40 01 43 07 00 3B FF 00 00 00 0F 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 01 01 01 00 00 00 00 00 01 00 02 01 01 FF 00 1D 00 0F 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 01 01 01 07 00 2A 07 00 2A 00 00 00 01 00 01 07 00 3B 00 41 07 00 2A 05 40 01 FF 00 0E 00 0F 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 01 01 01 07 00 2A 07 00 2A 01 00 00 01 00 01 07 00 3B 00 41 07 00 2A 05 40 01 FF 00 16 00 0F 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 01 01 01 07 00 2A 07 00 2A 01 01 01 01 00 01 07 00 3B 00 49 07 00 3B 40 01 45 07 00 3B 00 48 07 00 3B 40 01 45 07 00 3B 00 47 07 00 3B 00 04 45 07 00 3B 40 01 4A 07 00 3B 00 41 01 4B 07 00 3B 00 0A 4B 07 00 3B 00 47 07 00 3B FF 00 00 00 0F 07 00 02 07 00 2A 01 07 00 2A 07 00 2A 07 00 2A 01 01 01 00 00 00 00 00 01 00 00 44 07 00 3B 40 01 4A 07 00 3B 00 4F 07 00 3B 00 46 07 00 3B 00 47 07 00 3B 00 45 07 00 3B 40 01 4A 07 00 3B 00 49 07 00 3B 40 01 46 07 00 3B 00 49 07 00 3B 40 01 46 07 00 3B 00 47 07 00 3B 00 55 07 00 3B 40 01 4A 07 00 3B 00 04 FF 00 04 00 0F 07 00 02 07 00 2A 01 07 00 2A 00 00 00 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  660    668    671    672    Ljava/lang/NullPointerException;
        //  637    656    659    660    Ljava/lang/NullPointerException;
        //  620    636    636    637    Ljava/lang/NullPointerException;
        //  609    624    627    628    Ljava/lang/NullPointerException;
        //  601    616    619    620    Ljava/lang/NullPointerException;
        //  590    605    608    609    Ljava/lang/NullPointerException;
        //  583    597    600    601    Ljava/lang/NullPointerException;
        //  578    586    589    590    Ljava/lang/NullPointerException;
        //  562    574    577    578    Ljava/lang/NullPointerException;
        //  554    567    570    571    Ljava/lang/NullPointerException;
        //  537    558    561    562    Ljava/lang/NullPointerException;
        //  530    550    553    554    Ljava/lang/NullPointerException;
        //  525    533    536    537    Ljava/lang/NullPointerException;
        //  510    521    524    525    Ljava/lang/NullPointerException;
        //  501    515    518    519    Ljava/lang/NullPointerException;
        //  497    506    509    510    Ljava/lang/NullPointerException;
        //  473    485    485    486    Ljava/lang/NullPointerException;
        //  459    467    470    471    Ljava/lang/NullPointerException;
        //  447    455    458    459    Ljava/lang/NullPointerException;
        //  431    443    446    447    Ljava/lang/NullPointerException;
        //  421    434    437    438    Ljava/lang/NullPointerException;
        //  414    427    430    431    Ljava/lang/NullPointerException;
        //  403    417    420    421    Ljava/lang/NullPointerException;
        //  393    410    413    414    Ljava/lang/NullPointerException;
        //  388    399    402    403    Ljava/lang/NullPointerException;
        //  356    366    369    370    Ljava/lang/NullPointerException;
        //  331    341    344    345    Ljava/lang/NullPointerException;
        //  298    310    313    314    Ljava/lang/NullPointerException;
        //  289    305    308    309    Ljava/lang/NullPointerException;
        //  280    294    297    298    Ljava/lang/NullPointerException;
        //  276    285    288    289    Ljava/lang/NullPointerException;
        //  252    264    264    265    Ljava/lang/NullPointerException;
        //  238    246    249    250    Ljava/lang/NullPointerException;
        //  226    234    237    238    Ljava/lang/NullPointerException;
        //  210    222    225    226    Ljava/lang/NullPointerException;
        //  200    213    216    217    Ljava/lang/NullPointerException;
        //  193    206    209    210    Ljava/lang/NullPointerException;
        //  182    196    199    200    Ljava/lang/NullPointerException;
        //  172    189    192    193    Ljava/lang/NullPointerException;
        //  167    178    181    182    Ljava/lang/NullPointerException;
        //  135    145    148    149    Ljava/lang/NullPointerException;
        //  110    120    123    124    Ljava/lang/NullPointerException;
        //  80     92     95     96     Ljava/lang/NullPointerException;
        //  48     58     61     62     Ljava/lang/NullPointerException;
        //  23     33     36     37     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0182:
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
    
    private void a(final te<K, V> te) {
        final int b = xd.b;
        final te<K, V> b2 = te.b;
        final te<K, V> c = te.c;
        final te<K, V> b3 = c.b;
        final te<K, V> c2 = c.c;
        te<K, V> te6 = null;
        int h3 = 0;
        int h4 = 0;
        Label_0154: {
            Label_0153: {
                te<K, V> te7 = null;
                Label_0118: {
                    te<K, V> te3 = null;
                    int h = 0;
                    Label_0117: {
                        te<K, V> te5 = null;
                        Label_0095: {
                            Label_0094: {
                                te<K, V> te4 = null;
                                Label_0074: {
                                    Label_0047: {
                                        te<K, V> te2;
                                        try {
                                            te.c = b3;
                                            te2 = (te3 = b3);
                                            if (b != 0) {
                                                break Label_0074;
                                            }
                                            if (te2 != null) {
                                                break Label_0047;
                                            }
                                            break Label_0047;
                                        }
                                        catch (NullPointerException ex) {
                                            throw ex;
                                        }
                                        try {
                                            if (te2 != null) {
                                                b3.a = te;
                                            }
                                        }
                                        catch (NullPointerException ex2) {
                                            throw ex2;
                                        }
                                    }
                                    this.a(te, c);
                                    c.b = te;
                                    te.a = c;
                                    te3 = te;
                                    try {
                                        te4 = b2;
                                        if (b != 0) {
                                            break Label_0074;
                                        }
                                        if (te4 == null) {
                                            break Label_0094;
                                        }
                                    }
                                    catch (NullPointerException ex3) {
                                        throw ex3;
                                    }
                                }
                                h = te4.h;
                                break Label_0095;
                            }
                            h = 0;
                            try {
                                te5 = b3;
                                if (b != 0) {
                                    break Label_0095;
                                }
                                if (te5 == null) {
                                    break Label_0117;
                                }
                            }
                            catch (NullPointerException ex4) {
                                throw ex4;
                            }
                        }
                        final int h2 = te5.h;
                        break Label_0118;
                    }
                    final int h2 = 0;
                    try {
                        te3.h = Math.max(h, h2) + 1;
                        te6 = c;
                        h3 = te.h;
                        te7 = c2;
                        if (b != 0) {
                            break Label_0118;
                        }
                        if (te7 == null) {
                            break Label_0153;
                        }
                    }
                    catch (NullPointerException ex5) {
                        throw ex5;
                    }
                }
                h4 = te7.h;
                break Label_0154;
            }
            h4 = 0;
        }
        te6.h = Math.max(h3, h4) + 1;
    }
    
    private void b(final te<K, V> te) {
        final int b = xd.b;
        final te<K, V> b2 = te.b;
        final te<K, V> c = te.c;
        final te<K, V> b3 = b2.b;
        final te<K, V> c2 = b2.c;
        te<K, V> te6 = null;
        int h3 = 0;
        int h4 = 0;
        Label_0154: {
            Label_0153: {
                te<K, V> te7 = null;
                Label_0118: {
                    te<K, V> te3 = null;
                    int h = 0;
                    Label_0117: {
                        te<K, V> te5 = null;
                        Label_0095: {
                            Label_0094: {
                                te<K, V> te4 = null;
                                Label_0074: {
                                    Label_0047: {
                                        te<K, V> te2;
                                        try {
                                            te.b = c2;
                                            te2 = (te3 = c2);
                                            if (b != 0) {
                                                break Label_0074;
                                            }
                                            if (te2 != null) {
                                                break Label_0047;
                                            }
                                            break Label_0047;
                                        }
                                        catch (NullPointerException ex) {
                                            throw ex;
                                        }
                                        try {
                                            if (te2 != null) {
                                                c2.a = te;
                                            }
                                        }
                                        catch (NullPointerException ex2) {
                                            throw ex2;
                                        }
                                    }
                                    this.a(te, b2);
                                    b2.c = te;
                                    te.a = b2;
                                    te3 = te;
                                    try {
                                        te4 = c;
                                        if (b != 0) {
                                            break Label_0074;
                                        }
                                        if (te4 == null) {
                                            break Label_0094;
                                        }
                                    }
                                    catch (NullPointerException ex3) {
                                        throw ex3;
                                    }
                                }
                                h = te4.h;
                                break Label_0095;
                            }
                            h = 0;
                            try {
                                te5 = c2;
                                if (b != 0) {
                                    break Label_0095;
                                }
                                if (te5 == null) {
                                    break Label_0117;
                                }
                            }
                            catch (NullPointerException ex4) {
                                throw ex4;
                            }
                        }
                        final int h2 = te5.h;
                        break Label_0118;
                    }
                    final int h2 = 0;
                    try {
                        te3.h = Math.max(h, h2) + 1;
                        te6 = b2;
                        h3 = te.h;
                        te7 = b3;
                        if (b != 0) {
                            break Label_0118;
                        }
                        if (te7 == null) {
                            break Label_0153;
                        }
                    }
                    catch (NullPointerException ex5) {
                        throw ex5;
                    }
                }
                h4 = te7.h;
                break Label_0154;
            }
            h4 = 0;
        }
        te6.h = Math.max(h3, h4) + 1;
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        final ng g = this.g;
        ng ng = null;
        Label_0023: {
            try {
                ng = g;
                if (xd.b != 0) {
                    return (Set<Entry<K, V>>)ng;
                }
                if (ng == null) {
                    break Label_0023;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            return (Set<Entry<K, V>>)ng;
        }
        this.g = new ng(this);
        return (Set<Entry<K, V>>)ng;
    }
    
    @Override
    public Set<K> keySet() {
        final og h = this.h;
        og og = null;
        Label_0023: {
            try {
                og = h;
                if (xd.b != 0) {
                    return (Set<K>)og;
                }
                if (og == null) {
                    break Label_0023;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            return (Set<K>)og;
        }
        this.h = new og(this);
        return (Set<K>)og;
    }
    
    private Object writeReplace() {
        return new LinkedHashMap(this);
    }
    
    static {
        final String[] array = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "\u000b;]\u00001D&\u000ec0F\"OR>I>K";
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
                                c2 = '+';
                                break;
                            }
                            case 1: {
                                c2 = 'R';
                                break;
                            }
                            case 2: {
                                c2 = '.';
                                break;
                            }
                            case 3: {
                                c2 = ' ';
                                break;
                            }
                            default: {
                                c2 = '_';
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
                    s = "@7W\u0000b\u0016r@U3G";
                    n3 = 0;
                    continue Label_0062_Outer;
                }
                case 0: {
                    break Label_0062_Outer;
                }
            }
        }
        array[n] = intern;
        z = new String[] { " is not Comparable", "key == null" };
        boolean j = false;
        Label_0190: {
            try {
                if (!mg.class.desiredAssertionStatus()) {
                    j = true;
                    break Label_0190;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            j = false;
        }
        i = j;
        a = new pe();
    }
}
