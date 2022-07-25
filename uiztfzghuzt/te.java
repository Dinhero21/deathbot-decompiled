// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Map;

final class te<K, V> implements Entry<K, V>
{
    te<K, V> a;
    te<K, V> b;
    te<K, V> c;
    te<K, V> d;
    te<K, V> e;
    final K f;
    V g;
    int h;
    
    te() {
        this.f = null;
        this.e = this;
        this.d = this;
    }
    
    te(final te<K, V> a, final K f, final te<K, V> d, final te<K, V> e) {
        int b = xd.b;
        this.a = a;
        this.f = f;
        this.h = 1;
        this.d = d;
        this.e = e;
        e.d = this;
        d.e = this;
        if (nb.a) {
            xd.b = ++b;
        }
    }
    
    @Override
    public K getKey() {
        return this.f;
    }
    
    @Override
    public V getValue() {
        return this.g;
    }
    
    @Override
    public V setValue(final V g) {
        final V g2 = this.g;
        this.g = g;
        return g2;
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
        //     5: instanceof      Ljava/util/Map$Entry;
        //     8: iload_3        
        //     9: ifne            147
        //    12: ifeq            146
        //    15: goto            19
        //    18: athrow         
        //    19: aload_1        
        //    20: checkcast       Ljava/util/Map$Entry;
        //    23: astore_2       
        //    24: aload_0        
        //    25: getfield        uiztfzghuzt/te.f:Ljava/lang/Object;
        //    28: iload_3        
        //    29: ifne            60
        //    32: ifnonnull       56
        //    35: goto            39
        //    38: athrow         
        //    39: aload_2        
        //    40: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    45: ifnonnull       144
        //    48: goto            52
        //    51: athrow         
        //    52: goto            80
        //    55: athrow         
        //    56: aload_0        
        //    57: getfield        uiztfzghuzt/te.f:Ljava/lang/Object;
        //    60: iload_3        
        //    61: ifne            88
        //    64: aload_2        
        //    65: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    70: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    73: ifeq            144
        //    76: goto            80
        //    79: athrow         
        //    80: aload_0        
        //    81: getfield        uiztfzghuzt/te.g:Ljava/lang/Object;
        //    84: goto            88
        //    87: athrow         
        //    88: iload_3        
        //    89: ifne            120
        //    92: ifnonnull       116
        //    95: goto            99
        //    98: athrow         
        //    99: aload_2        
        //   100: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   105: ifnonnull       144
        //   108: goto            112
        //   111: athrow         
        //   112: goto            140
        //   115: athrow         
        //   116: aload_0        
        //   117: getfield        uiztfzghuzt/te.g:Ljava/lang/Object;
        //   120: aload_2        
        //   121: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   126: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   129: iload_3        
        //   130: ifne            141
        //   133: ifeq            144
        //   136: goto            140
        //   139: athrow         
        //   140: iconst_1       
        //   141: goto            145
        //   144: iconst_0       
        //   145: ireturn        
        //   146: iconst_0       
        //   147: ireturn        
        //    StackMapTable: 00 1B FF 00 12 00 04 07 00 02 07 00 05 00 01 00 01 07 00 38 00 FF 00 12 00 04 07 00 02 07 00 05 07 00 07 01 00 01 07 00 38 00 4B 07 00 38 00 42 07 00 38 00 43 07 00 05 52 07 00 38 00 46 07 00 38 40 07 00 05 49 07 00 38 00 4B 07 00 38 00 42 07 00 38 00 43 07 00 05 52 07 00 38 00 40 01 02 40 01 FF 00 00 00 04 07 00 02 07 00 05 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  120    136    139    140    Luiztfzghuzt/kg;
        //  99     115    115    116    Luiztfzghuzt/kg;
        //  92     108    111    112    Luiztfzghuzt/kg;
        //  88     95     98     99     Luiztfzghuzt/kg;
        //  64     84     87     88     Luiztfzghuzt/kg;
        //  60     76     79     80     Luiztfzghuzt/kg;
        //  39     55     55     56     Luiztfzghuzt/kg;
        //  32     48     51     52     Luiztfzghuzt/kg;
        //  24     35     38     39     Luiztfzghuzt/kg;
        //  4      15     18     19     Luiztfzghuzt/kg;
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
    
    @Override
    public int hashCode() {
        final int b = xd.b;
        int hashCode = 0;
        V v2 = null;
        Label_0055: {
            Label_0046: {
                V v = null;
                Label_0031: {
                    K i = null;
                    Label_0028: {
                        Label_0019: {
                            K k;
                            try {
                                k = (i = this.f);
                                if (b != 0) {
                                    break Label_0028;
                                }
                                if (k == null) {
                                    break Label_0019;
                                }
                                break Label_0019;
                            }
                            catch (kg kg) {
                                throw kg;
                            }
                            try {
                                if (k == null) {
                                    hashCode = 0;
                                    break Label_0031;
                                }
                            }
                            catch (kg kg2) {
                                throw kg2;
                            }
                        }
                        i = this.f;
                    }
                    hashCode = i.hashCode();
                    try {
                        v = (v2 = this.g);
                        if (b != 0) {
                            break Label_0055;
                        }
                        if (v == null) {
                            break Label_0046;
                        }
                        break Label_0046;
                    }
                    catch (kg kg3) {
                        throw kg3;
                    }
                }
                try {
                    if (v == null) {
                        final int hashCode2 = 0;
                        return hashCode ^ hashCode2;
                    }
                }
                catch (kg kg4) {
                    throw kg4;
                }
            }
            v2 = this.g;
        }
        final int hashCode2 = v2.hashCode();
        return hashCode ^ hashCode2;
    }
    
    @Override
    public String toString() {
        return this.f + "=" + this.g;
    }
    
    public te<K, V> a() {
        final int b = xd.b;
        te te = this;
        te<K, V> b2 = te.b;
        te<K, V> b3 = null;
        while (b2 != null) {
            te = b2;
            b3 = te.b;
            if (b != 0) {
                return b3;
            }
            b2 = b3;
            if (b != 0) {
                break;
            }
        }
        return b3;
    }
    
    public te<K, V> b() {
        final int b = xd.b;
        te te = this;
        te<K, V> c = te.c;
        te<K, V> c2 = null;
        while (c != null) {
            te = c;
            c2 = te.c;
            if (b != 0) {
                return c2;
            }
            c = c2;
            if (b != 0) {
                break;
            }
        }
        return c2;
    }
}
