// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.NoSuchElementException;
import java.util.Map;
import java.util.Properties;
import java.util.Collection;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.Array;
import java.io.Serializable;
import java.lang.reflect.WildcardType;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class td
{
    static final Type[] a;
    private static final String[] z;
    
    public static ParameterizedType a(final Type type, final Type type2, final Type... array) {
        return new vd(type, type2, array);
    }
    
    public static GenericArrayType a(final Type type) {
        return new ud(type);
    }
    
    public static WildcardType b(final Type type) {
        final int b = xd.b;
        int n = 0;
        Label_0033: {
            try {
                n = ((type instanceof WildcardType) ? 1 : 0);
                if (b != 0) {
                    break Label_0033;
                }
                if (n == 0) {
                    break Label_0033;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            final Type[] upperBounds = ((WildcardType)type).getUpperBounds();
            try {
                if (b == 0) {
                    return new wd(upperBounds, td.a);
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        final Type[] array = new Type[n];
        array[0] = type;
        final Type[] upperBounds = array;
        return new wd(upperBounds, td.a);
    }
    
    public static WildcardType c(final Type type) {
        final int b = xd.b;
        int n = 0;
        Label_0033: {
            try {
                n = ((type instanceof WildcardType) ? 1 : 0);
                if (b != 0) {
                    break Label_0033;
                }
                if (n == 0) {
                    break Label_0033;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            final Type[] lowerBounds = ((WildcardType)type).getLowerBounds();
            try {
                if (b == 0) {
                    return new wd(new Type[] { Object.class }, lowerBounds);
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        final Type[] array = new Type[n];
        array[0] = type;
        final Type[] lowerBounds = array;
        return new wd(new Type[] { Object.class }, lowerBounds);
    }
    
    public static Type d(final Type type) {
        if (type instanceof Class) {
            final Class clazz = (Class)type;
            try {
                if (clazz.isArray()) {
                    final Serializable s = new ud(d(clazz.getComponentType()));
                    return (Type)s;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            final Serializable s = clazz;
            return (Type)s;
        }
        if (type instanceof ParameterizedType) {
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            return new vd(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new ud(((GenericArrayType)type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            final WildcardType wildcardType = (WildcardType)type;
            return new wd(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }
    
    public static Class<?> e(final Type type) {
        try {
            if (type instanceof Class) {
                return (Class<?>)type;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        if (type instanceof ParameterizedType) {
            final Type rawType = ((ParameterizedType)type).getRawType();
            sd.a(rawType instanceof Class);
            return (Class<?>)rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
        }
        try {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        try {
            if (type instanceof WildcardType) {
                return e(((WildcardType)type).getUpperBounds()[0]);
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        try {
            if (type == null) {
                final String name = "null";
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
            }
        }
        catch (IllegalArgumentException ex4) {
            throw ex4;
        }
        final String name = type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }
    
    static boolean a(final Object o, final Object obj) {
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
                            catch (IllegalArgumentException ex) {
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
                            catch (IllegalArgumentException ex2) {
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
                        catch (IllegalArgumentException ex3) {
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
                    catch (IllegalArgumentException ex4) {
                        throw ex4;
                    }
                }
                break Label_0049;
            }
            return equals;
        }
        return equals;
    }
    
    public static boolean a(final Type p0, final Type p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_0        
        //     6: iload           4
        //     8: ifne            23
        //    11: aload_1        
        //    12: if_acmpne       22
        //    15: goto            19
        //    18: athrow         
        //    19: iconst_1       
        //    20: ireturn        
        //    21: athrow         
        //    22: aload_0        
        //    23: instanceof      Ljava/lang/Class;
        //    26: iload           4
        //    28: ifne            49
        //    31: ifeq            45
        //    34: goto            38
        //    37: athrow         
        //    38: aload_0        
        //    39: aload_1        
        //    40: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    43: ireturn        
        //    44: athrow         
        //    45: aload_0        
        //    46: instanceof      Ljava/lang/reflect/ParameterizedType;
        //    49: iload           4
        //    51: ifne            193
        //    54: ifeq            189
        //    57: goto            61
        //    60: athrow         
        //    61: aload_1        
        //    62: iload           4
        //    64: ifne            85
        //    67: goto            71
        //    70: athrow         
        //    71: instanceof      Ljava/lang/reflect/ParameterizedType;
        //    74: ifne            84
        //    77: goto            81
        //    80: athrow         
        //    81: iconst_0       
        //    82: ireturn        
        //    83: athrow         
        //    84: aload_0        
        //    85: checkcast       Ljava/lang/reflect/ParameterizedType;
        //    88: astore_2       
        //    89: aload_1        
        //    90: checkcast       Ljava/lang/reflect/ParameterizedType;
        //    93: astore_3       
        //    94: aload_2        
        //    95: invokeinterface java/lang/reflect/ParameterizedType.getOwnerType:()Ljava/lang/reflect/Type;
        //   100: aload_3        
        //   101: invokeinterface java/lang/reflect/ParameterizedType.getOwnerType:()Ljava/lang/reflect/Type;
        //   106: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   109: iload           4
        //   111: ifne            140
        //   114: ifeq            187
        //   117: goto            121
        //   120: athrow         
        //   121: aload_2        
        //   122: invokeinterface java/lang/reflect/ParameterizedType.getRawType:()Ljava/lang/reflect/Type;
        //   127: aload_3        
        //   128: invokeinterface java/lang/reflect/ParameterizedType.getRawType:()Ljava/lang/reflect/Type;
        //   133: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   136: goto            140
        //   139: athrow         
        //   140: iload           4
        //   142: ifne            171
        //   145: ifeq            187
        //   148: goto            152
        //   151: athrow         
        //   152: aload_2        
        //   153: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments:()[Ljava/lang/reflect/Type;
        //   158: aload_3        
        //   159: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments:()[Ljava/lang/reflect/Type;
        //   164: invokestatic    java/util/Arrays.equals:([Ljava/lang/Object;[Ljava/lang/Object;)Z
        //   167: goto            171
        //   170: athrow         
        //   171: iload           4
        //   173: ifne            184
        //   176: ifeq            187
        //   179: goto            183
        //   182: athrow         
        //   183: iconst_1       
        //   184: goto            188
        //   187: iconst_0       
        //   188: ireturn        
        //   189: aload_0        
        //   190: instanceof      Ljava/lang/reflect/GenericArrayType;
        //   193: iload           4
        //   195: ifne            258
        //   198: ifeq            254
        //   201: goto            205
        //   204: athrow         
        //   205: aload_1        
        //   206: iload           4
        //   208: ifne            229
        //   211: goto            215
        //   214: athrow         
        //   215: instanceof      Ljava/lang/reflect/GenericArrayType;
        //   218: ifne            228
        //   221: goto            225
        //   224: athrow         
        //   225: iconst_0       
        //   226: ireturn        
        //   227: athrow         
        //   228: aload_0        
        //   229: checkcast       Ljava/lang/reflect/GenericArrayType;
        //   232: astore_2       
        //   233: aload_1        
        //   234: checkcast       Ljava/lang/reflect/GenericArrayType;
        //   237: astore_3       
        //   238: aload_2        
        //   239: invokeinterface java/lang/reflect/GenericArrayType.getGenericComponentType:()Ljava/lang/reflect/Type;
        //   244: aload_3        
        //   245: invokeinterface java/lang/reflect/GenericArrayType.getGenericComponentType:()Ljava/lang/reflect/Type;
        //   250: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
        //   253: ireturn        
        //   254: aload_0        
        //   255: instanceof      Ljava/lang/reflect/WildcardType;
        //   258: iload           4
        //   260: ifne            371
        //   263: ifeq            367
        //   266: goto            270
        //   269: athrow         
        //   270: aload_1        
        //   271: iload           4
        //   273: ifne            294
        //   276: goto            280
        //   279: athrow         
        //   280: instanceof      Ljava/lang/reflect/WildcardType;
        //   283: ifne            293
        //   286: goto            290
        //   289: athrow         
        //   290: iconst_0       
        //   291: ireturn        
        //   292: athrow         
        //   293: aload_0        
        //   294: checkcast       Ljava/lang/reflect/WildcardType;
        //   297: astore_2       
        //   298: aload_1        
        //   299: checkcast       Ljava/lang/reflect/WildcardType;
        //   302: astore_3       
        //   303: aload_2        
        //   304: invokeinterface java/lang/reflect/WildcardType.getUpperBounds:()[Ljava/lang/reflect/Type;
        //   309: aload_3        
        //   310: invokeinterface java/lang/reflect/WildcardType.getUpperBounds:()[Ljava/lang/reflect/Type;
        //   315: invokestatic    java/util/Arrays.equals:([Ljava/lang/Object;[Ljava/lang/Object;)Z
        //   318: iload           4
        //   320: ifne            349
        //   323: ifeq            365
        //   326: goto            330
        //   329: athrow         
        //   330: aload_2        
        //   331: invokeinterface java/lang/reflect/WildcardType.getLowerBounds:()[Ljava/lang/reflect/Type;
        //   336: aload_3        
        //   337: invokeinterface java/lang/reflect/WildcardType.getLowerBounds:()[Ljava/lang/reflect/Type;
        //   342: invokestatic    java/util/Arrays.equals:([Ljava/lang/Object;[Ljava/lang/Object;)Z
        //   345: goto            349
        //   348: athrow         
        //   349: iload           4
        //   351: ifne            362
        //   354: ifeq            365
        //   357: goto            361
        //   360: athrow         
        //   361: iconst_1       
        //   362: goto            366
        //   365: iconst_0       
        //   366: ireturn        
        //   367: aload_0        
        //   368: instanceof      Ljava/lang/reflect/TypeVariable;
        //   371: iload           4
        //   373: ifne            478
        //   376: ifeq            477
        //   379: goto            383
        //   382: athrow         
        //   383: aload_1        
        //   384: iload           4
        //   386: ifne            407
        //   389: goto            393
        //   392: athrow         
        //   393: instanceof      Ljava/lang/reflect/TypeVariable;
        //   396: ifne            406
        //   399: goto            403
        //   402: athrow         
        //   403: iconst_0       
        //   404: ireturn        
        //   405: athrow         
        //   406: aload_0        
        //   407: checkcast       Ljava/lang/reflect/TypeVariable;
        //   410: astore_2       
        //   411: aload_1        
        //   412: checkcast       Ljava/lang/reflect/TypeVariable;
        //   415: astore_3       
        //   416: aload_2        
        //   417: iload           4
        //   419: ifne            445
        //   422: invokeinterface java/lang/reflect/TypeVariable.getGenericDeclaration:()Ljava/lang/reflect/GenericDeclaration;
        //   427: aload_3        
        //   428: invokeinterface java/lang/reflect/TypeVariable.getGenericDeclaration:()Ljava/lang/reflect/GenericDeclaration;
        //   433: if_acmpne       475
        //   436: goto            440
        //   439: athrow         
        //   440: aload_2        
        //   441: goto            445
        //   444: athrow         
        //   445: invokeinterface java/lang/reflect/TypeVariable.getName:()Ljava/lang/String;
        //   450: aload_3        
        //   451: invokeinterface java/lang/reflect/TypeVariable.getName:()Ljava/lang/String;
        //   456: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   459: iload           4
        //   461: ifne            472
        //   464: ifeq            475
        //   467: goto            471
        //   470: athrow         
        //   471: iconst_1       
        //   472: goto            476
        //   475: iconst_0       
        //   476: ireturn        
        //   477: iconst_0       
        //   478: ireturn        
        //    StackMapTable: 00 55 FF 00 12 00 05 07 00 26 07 00 26 00 00 01 00 01 07 00 19 00 41 07 00 19 00 40 07 00 26 4D 07 00 19 00 45 07 00 19 00 43 01 4A 07 00 19 00 48 07 00 19 40 07 00 26 48 07 00 19 00 41 07 00 19 00 40 07 00 26 FF 00 22 00 05 07 00 26 07 00 26 07 00 42 07 00 42 01 00 01 07 00 19 00 51 07 00 19 40 01 4A 07 00 19 00 51 07 00 19 40 01 4A 07 00 19 00 40 01 02 40 01 FF 00 00 00 05 07 00 26 07 00 26 00 00 01 00 00 43 01 4A 07 00 19 00 48 07 00 19 40 07 00 26 48 07 00 19 00 41 07 00 19 00 40 07 00 26 18 43 01 4A 07 00 19 00 48 07 00 19 40 07 00 26 48 07 00 19 00 41 07 00 19 00 40 07 00 26 FF 00 22 00 05 07 00 26 07 00 26 07 00 20 07 00 20 01 00 01 07 00 19 00 51 07 00 19 40 01 4A 07 00 19 00 40 01 02 40 01 FF 00 00 00 05 07 00 26 07 00 26 00 00 01 00 00 43 01 4A 07 00 19 00 48 07 00 19 40 07 00 26 48 07 00 19 00 41 07 00 19 00 40 07 00 26 FF 00 1F 00 05 07 00 26 07 00 26 07 00 65 07 00 65 01 00 01 07 00 19 00 43 07 00 19 40 07 00 65 58 07 00 19 00 40 01 02 40 01 FF 00 00 00 05 07 00 26 07 00 26 00 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  445    467    470    471    Ljava/lang/IllegalArgumentException;
        //  422    441    444    445    Ljava/lang/IllegalArgumentException;
        //  416    436    439    440    Ljava/lang/IllegalArgumentException;
        //  393    405    405    406    Ljava/lang/IllegalArgumentException;
        //  383    399    402    403    Ljava/lang/IllegalArgumentException;
        //  376    389    392    393    Ljava/lang/IllegalArgumentException;
        //  371    379    382    383    Ljava/lang/IllegalArgumentException;
        //  349    357    360    361    Ljava/lang/IllegalArgumentException;
        //  323    345    348    349    Ljava/lang/IllegalArgumentException;
        //  303    326    329    330    Ljava/lang/IllegalArgumentException;
        //  280    292    292    293    Ljava/lang/IllegalArgumentException;
        //  270    286    289    290    Ljava/lang/IllegalArgumentException;
        //  263    276    279    280    Ljava/lang/IllegalArgumentException;
        //  258    266    269    270    Ljava/lang/IllegalArgumentException;
        //  215    227    227    228    Ljava/lang/IllegalArgumentException;
        //  205    221    224    225    Ljava/lang/IllegalArgumentException;
        //  198    211    214    215    Ljava/lang/IllegalArgumentException;
        //  193    201    204    205    Ljava/lang/IllegalArgumentException;
        //  171    179    182    183    Ljava/lang/IllegalArgumentException;
        //  145    167    170    171    Ljava/lang/IllegalArgumentException;
        //  140    148    151    152    Ljava/lang/IllegalArgumentException;
        //  114    136    139    140    Ljava/lang/IllegalArgumentException;
        //  94     117    120    121    Ljava/lang/IllegalArgumentException;
        //  71     83     83     84     Ljava/lang/IllegalArgumentException;
        //  61     77     80     81     Ljava/lang/IllegalArgumentException;
        //  54     67     70     71     Ljava/lang/IllegalArgumentException;
        //  49     57     60     61     Ljava/lang/IllegalArgumentException;
        //  31     44     44     45     Ljava/lang/IllegalArgumentException;
        //  23     34     37     38     Ljava/lang/IllegalArgumentException;
        //  11     21     21     22     Ljava/lang/IllegalArgumentException;
        //  5      15     18     19     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0061:
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
    
    static int a(final Object o) {
        try {
            final Object o2 = o;
            if (xd.b != 0) {
                return o2.hashCode();
            }
            if (o == null) {
                return 0;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final Object o2 = o;
        return o2.hashCode();
        hashCode = 0;
        return hashCode;
    }
    
    public static String f(final Type type) {
        Label_0017: {
            try {
                final Type type2 = type;
                if (xd.b != 0) {
                    return type2.toString();
                }
                final boolean b = type instanceof Class;
                if (b) {
                    break Label_0017;
                }
                break Label_0017;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final boolean b = type instanceof Class;
                if (b) {
                    return ((Class)type).getName();
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        final Type type2 = type;
        return type2.toString();
    }
    
    static Type a(final Type p0, final Class<?> p1, final Class<?> p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_2        
        //     6: iload           6
        //     8: ifne            23
        //    11: aload_1        
        //    12: if_acmpne       22
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0        
        //    20: areturn        
        //    21: athrow         
        //    22: aload_2        
        //    23: invokevirtual   java/lang/Class.isInterface:()Z
        //    26: iload           6
        //    28: ifne            153
        //    31: ifeq            140
        //    34: goto            38
        //    37: athrow         
        //    38: aload_1        
        //    39: invokevirtual   java/lang/Class.getInterfaces:()[Ljava/lang/Class;
        //    42: astore_3       
        //    43: iconst_0       
        //    44: istore          4
        //    46: aload_3        
        //    47: arraylength    
        //    48: istore          5
        //    50: iload           4
        //    52: iload           5
        //    54: if_icmpge       140
        //    57: aload_3        
        //    58: iload           4
        //    60: aaload         
        //    61: aload_2        
        //    62: iload           6
        //    64: ifne            163
        //    67: iload           6
        //    69: ifne            97
        //    72: goto            76
        //    75: athrow         
        //    76: if_acmpne       92
        //    79: goto            83
        //    82: athrow         
        //    83: aload_1        
        //    84: invokevirtual   java/lang/Class.getGenericInterfaces:()[Ljava/lang/reflect/Type;
        //    87: iload           4
        //    89: aaload         
        //    90: areturn        
        //    91: athrow         
        //    92: aload_2        
        //    93: aload_3        
        //    94: iload           4
        //    96: aaload         
        //    97: iload           6
        //    99: ifne            127
        //   102: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   105: ifeq            132
        //   108: goto            112
        //   111: athrow         
        //   112: aload_1        
        //   113: invokevirtual   java/lang/Class.getGenericInterfaces:()[Ljava/lang/reflect/Type;
        //   116: iload           4
        //   118: aaload         
        //   119: aload_3        
        //   120: iload           4
        //   122: aaload         
        //   123: goto            127
        //   126: athrow         
        //   127: aload_2        
        //   128: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
        //   131: areturn        
        //   132: iinc            4, 1
        //   135: iload           6
        //   137: ifeq            50
        //   140: aload_1        
        //   141: iload           6
        //   143: ifne            236
        //   146: invokevirtual   java/lang/Class.isInterface:()Z
        //   149: goto            153
        //   152: athrow         
        //   153: ifne            235
        //   156: aload_1        
        //   157: ldc             Ljava/lang/Object;.class
        //   159: goto            163
        //   162: athrow         
        //   163: if_acmpeq       235
        //   166: aload_1        
        //   167: invokevirtual   java/lang/Class.getSuperclass:()Ljava/lang/Class;
        //   170: astore_3       
        //   171: aload_3        
        //   172: iload           6
        //   174: ifne            236
        //   177: aload_2        
        //   178: iload           6
        //   180: ifne            211
        //   183: goto            187
        //   186: athrow         
        //   187: if_acmpne       200
        //   190: goto            194
        //   193: athrow         
        //   194: aload_1        
        //   195: invokevirtual   java/lang/Class.getGenericSuperclass:()Ljava/lang/reflect/Type;
        //   198: areturn        
        //   199: athrow         
        //   200: aload_2        
        //   201: iload           6
        //   203: ifne            229
        //   206: aload_3        
        //   207: goto            211
        //   210: athrow         
        //   211: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   214: ifeq            228
        //   217: aload_1        
        //   218: invokevirtual   java/lang/Class.getGenericSuperclass:()Ljava/lang/reflect/Type;
        //   221: aload_3        
        //   222: aload_2        
        //   223: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
        //   226: areturn        
        //   227: athrow         
        //   228: aload_3        
        //   229: astore_1       
        //   230: iload           6
        //   232: ifeq            156
        //   235: aload_2        
        //   236: areturn        
        //    Signature:
        //  (Ljava/lang/reflect/Type;Ljava/lang/Class<*>;Ljava/lang/Class<*>;)Ljava/lang/reflect/Type;
        //    StackMapTable: 00 27 FF 00 12 00 07 07 00 26 07 00 36 07 00 36 00 00 00 01 00 01 07 00 19 00 41 07 00 19 00 40 07 00 36 4D 07 00 19 00 FF 00 0B 00 07 07 00 26 07 00 36 07 00 36 07 00 B9 01 01 01 00 00 58 07 00 19 FF 00 00 00 07 07 00 26 07 00 36 07 00 36 07 00 B9 01 01 01 00 02 07 00 36 07 00 36 45 07 00 19 00 47 07 00 19 00 FF 00 04 00 07 07 00 26 07 00 36 07 00 36 07 00 B9 01 01 01 00 02 07 00 36 07 00 36 4D 07 00 19 00 4D 07 00 19 FF 00 00 00 07 07 00 26 07 00 36 07 00 36 07 00 B9 01 01 01 00 02 07 00 26 07 00 36 04 FF 00 07 00 07 07 00 26 07 00 36 07 00 36 00 00 00 01 00 00 4B 07 00 19 40 01 02 45 07 00 19 FF 00 00 00 07 07 00 26 07 00 36 07 00 36 00 00 00 01 00 02 07 00 36 07 00 36 FF 00 16 00 07 07 00 26 07 00 36 07 00 36 07 00 36 00 00 01 00 01 07 00 19 FF 00 00 00 07 07 00 26 07 00 36 07 00 36 07 00 36 00 00 01 00 02 07 00 36 07 00 36 45 07 00 19 00 44 07 00 19 00 49 07 00 19 FF 00 00 00 07 07 00 26 07 00 36 07 00 36 07 00 36 00 00 01 00 02 07 00 36 07 00 36 4F 07 00 19 00 40 07 00 36 FF 00 05 00 07 07 00 26 07 00 36 07 00 36 00 00 00 01 00 00 40 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  211    227    227    228    Ljava/lang/IllegalArgumentException;
        //  200    207    210    211    Ljava/lang/IllegalArgumentException;
        //  187    199    199    200    Ljava/lang/IllegalArgumentException;
        //  177    190    193    194    Ljava/lang/IllegalArgumentException;
        //  171    183    186    187    Ljava/lang/IllegalArgumentException;
        //  153    159    162    163    Ljava/lang/IllegalArgumentException;
        //  140    149    152    153    Ljava/lang/IllegalArgumentException;
        //  102    123    126    127    Ljava/lang/IllegalArgumentException;
        //  97     108    111    112    Ljava/lang/IllegalArgumentException;
        //  76     91     91     92     Ljava/lang/IllegalArgumentException;
        //  67     79     82     83     Ljava/lang/IllegalArgumentException;
        //  57     72     75     76     Ljava/lang/IllegalArgumentException;
        //  23     34     37     38     Ljava/lang/IllegalArgumentException;
        //  11     21     21     22     Ljava/lang/IllegalArgumentException;
        //  5      15     18     19     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0076:
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
    
    static Type b(final Type type, final Class<?> clazz, final Class<?> clazz2) {
        sd.a(clazz2.isAssignableFrom(clazz));
        return a(type, clazz, a(type, clazz, clazz2));
    }
    
    public static Type g(final Type type) {
        Label_0017: {
            try {
                final Type type2 = type;
                if (xd.b != 0) {
                    return ((Class)type2).getComponentType();
                }
                final boolean b = type instanceof GenericArrayType;
                if (b) {
                    break Label_0017;
                }
                break Label_0017;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final boolean b = type instanceof GenericArrayType;
                if (b) {
                    return ((GenericArrayType)type).getGenericComponentType();
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        final Type type2 = type;
        return ((Class)type2).getComponentType();
    }
    
    public static Type a(final Type type, final Class<?> clazz) {
        final int b = xd.b;
        Type b2 = b(type, clazz, Collection.class);
        Type type2 = null;
        Label_0051: {
            boolean b3 = false;
            Label_0039: {
                try {
                    b3 = (b2 instanceof WildcardType);
                    if (b != 0) {
                        break Label_0051;
                    }
                    if (!b3) {
                        break Label_0039;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                b2 = ((WildcardType)b2).getUpperBounds()[0];
                try {
                    final ParameterizedType parameterizedType = (ParameterizedType)(type2 = b2);
                    if (b != 0) {
                        return type2;
                    }
                    final boolean b4 = parameterizedType instanceof ParameterizedType;
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            try {
                if (!b3) {
                    return Object.class;
                }
                type2 = ((ParameterizedType)b2).getActualTypeArguments()[0];
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
        return type2;
    }
    
    public static Type[] b(final Type type, final Class<?> clazz) {
        final int b = xd.b;
        Type type2 = null;
        Class<?> clazz3 = null;
        Label_0038: {
            Label_0020: {
                Class<Properties> clazz2;
                try {
                    type2 = type;
                    clazz2 = (Class<Properties>)(clazz3 = Properties.class);
                    if (b != 0) {
                        break Label_0038;
                    }
                    if (type == clazz2) {
                        break Label_0020;
                    }
                    break Label_0020;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                try {
                    if (type == clazz2) {
                        return new Type[] { String.class, String.class };
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            type2 = type;
            clazz3 = clazz;
        }
        final Type b2 = b(type2, clazz3, Map.class);
        int n = 0;
        Label_0072: {
            try {
                n = ((b2 instanceof ParameterizedType) ? 1 : 0);
                if (b != 0) {
                    break Label_0072;
                }
                if (n == 0) {
                    break Label_0072;
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
            return ((ParameterizedType)b2).getActualTypeArguments();
        }
        final Type[] array = new Type[n];
        array[1] = (array[0] = Object.class);
        return array;
    }
    
    public static Type a(final Type p0, final Class<?> p1, final Type p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          11
        //     5: aload_2        
        //     6: instanceof      Ljava/lang/reflect/TypeVariable;
        //     9: ifeq            58
        //    12: aload_2        
        //    13: checkcast       Ljava/lang/reflect/TypeVariable;
        //    16: astore_3       
        //    17: aload_0        
        //    18: aload_1        
        //    19: aload_3        
        //    20: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/TypeVariable;)Ljava/lang/reflect/Type;
        //    23: astore_2       
        //    24: aload_2        
        //    25: iload           11
        //    27: ifne            59
        //    30: iload           11
        //    32: ifne            52
        //    35: goto            39
        //    38: athrow         
        //    39: aload_3        
        //    40: if_acmpne       53
        //    43: goto            47
        //    46: athrow         
        //    47: aload_2        
        //    48: goto            52
        //    51: athrow         
        //    52: areturn        
        //    53: iload           11
        //    55: ifeq            5
        //    58: aload_2        
        //    59: instanceof      Ljava/lang/Class;
        //    62: iload           11
        //    64: ifne            148
        //    67: ifeq            144
        //    70: goto            74
        //    73: athrow         
        //    74: aload_2        
        //    75: checkcast       Ljava/lang/Class;
        //    78: invokevirtual   java/lang/Class.isArray:()Z
        //    81: iload           11
        //    83: ifne            148
        //    86: goto            90
        //    89: athrow         
        //    90: ifeq            144
        //    93: goto            97
        //    96: athrow         
        //    97: aload_2        
        //    98: checkcast       Ljava/lang/Class;
        //   101: astore_3       
        //   102: aload_3        
        //   103: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //   106: astore          4
        //   108: aload_0        
        //   109: aload_1        
        //   110: aload           4
        //   112: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
        //   115: astore          5
        //   117: aload           4
        //   119: iload           11
        //   121: ifne            140
        //   124: aload           5
        //   126: if_acmpne       138
        //   129: goto            133
        //   132: athrow         
        //   133: aload_3        
        //   134: goto            143
        //   137: athrow         
        //   138: aload           5
        //   140: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;)Ljava/lang/reflect/GenericArrayType;
        //   143: areturn        
        //   144: aload_2        
        //   145: instanceof      Ljava/lang/reflect/GenericArrayType;
        //   148: iload           11
        //   150: ifne            213
        //   153: ifeq            209
        //   156: goto            160
        //   159: athrow         
        //   160: aload_2        
        //   161: checkcast       Ljava/lang/reflect/GenericArrayType;
        //   164: astore_3       
        //   165: aload_3        
        //   166: invokeinterface java/lang/reflect/GenericArrayType.getGenericComponentType:()Ljava/lang/reflect/Type;
        //   171: astore          4
        //   173: aload_0        
        //   174: aload_1        
        //   175: aload           4
        //   177: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
        //   180: astore          5
        //   182: aload           4
        //   184: iload           11
        //   186: ifne            205
        //   189: aload           5
        //   191: if_acmpne       203
        //   194: goto            198
        //   197: athrow         
        //   198: aload_3        
        //   199: goto            208
        //   202: athrow         
        //   203: aload           5
        //   205: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;)Ljava/lang/reflect/GenericArrayType;
        //   208: areturn        
        //   209: aload_2        
        //   210: instanceof      Ljava/lang/reflect/ParameterizedType;
        //   213: iload           11
        //   215: ifne            411
        //   218: ifeq            398
        //   221: goto            225
        //   224: athrow         
        //   225: aload_2        
        //   226: checkcast       Ljava/lang/reflect/ParameterizedType;
        //   229: astore_3       
        //   230: aload_3        
        //   231: invokeinterface java/lang/reflect/ParameterizedType.getOwnerType:()Ljava/lang/reflect/Type;
        //   236: astore          4
        //   238: aload_0        
        //   239: aload_1        
        //   240: aload           4
        //   242: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
        //   245: astore          5
        //   247: aload           5
        //   249: aload           4
        //   251: if_acmpeq       259
        //   254: iconst_1       
        //   255: goto            260
        //   258: athrow         
        //   259: iconst_0       
        //   260: istore          6
        //   262: aload_3        
        //   263: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments:()[Ljava/lang/reflect/Type;
        //   268: astore          7
        //   270: iconst_0       
        //   271: istore          8
        //   273: aload           7
        //   275: arraylength    
        //   276: istore          9
        //   278: iload           8
        //   280: iload           9
        //   282: if_icmpge       371
        //   285: aload_0        
        //   286: aload_1        
        //   287: aload           7
        //   289: iload           8
        //   291: aaload         
        //   292: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
        //   295: astore          10
        //   297: iload           11
        //   299: ifne            366
        //   302: aload           10
        //   304: aload           7
        //   306: iload           8
        //   308: aaload         
        //   309: iload           11
        //   311: ifne            388
        //   314: goto            318
        //   317: athrow         
        //   318: if_acmpeq       363
        //   321: goto            325
        //   324: athrow         
        //   325: iload           6
        //   327: iload           11
        //   329: ifne            354
        //   332: goto            336
        //   335: athrow         
        //   336: ifne            356
        //   339: goto            343
        //   342: athrow         
        //   343: aload           7
        //   345: invokevirtual   [java/lang/reflect/Type.clone:()Ljava/lang/Object;
        //   348: checkcast       [Ljava/lang/reflect/Type;
        //   351: astore          7
        //   353: iconst_1       
        //   354: istore          6
        //   356: aload           7
        //   358: iload           8
        //   360: aload           10
        //   362: aastore        
        //   363: iinc            8, 1
        //   366: iload           11
        //   368: ifeq            278
        //   371: iload           6
        //   373: ifeq            396
        //   376: aload           5
        //   378: aload_3        
        //   379: invokeinterface java/lang/reflect/ParameterizedType.getRawType:()Ljava/lang/reflect/Type;
        //   384: goto            388
        //   387: athrow         
        //   388: aload           7
        //   390: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;
        //   393: goto            397
        //   396: aload_3        
        //   397: areturn        
        //   398: aload_2        
        //   399: iload           11
        //   401: ifne            548
        //   404: instanceof      Ljava/lang/reflect/WildcardType;
        //   407: goto            411
        //   410: athrow         
        //   411: ifeq            547
        //   414: aload_2        
        //   415: checkcast       Ljava/lang/reflect/WildcardType;
        //   418: astore_3       
        //   419: aload_3        
        //   420: invokeinterface java/lang/reflect/WildcardType.getLowerBounds:()[Ljava/lang/reflect/Type;
        //   425: astore          4
        //   427: aload_3        
        //   428: invokeinterface java/lang/reflect/WildcardType.getUpperBounds:()[Ljava/lang/reflect/Type;
        //   433: astore          5
        //   435: aload           4
        //   437: arraylength    
        //   438: iconst_1       
        //   439: iload           11
        //   441: ifne            503
        //   444: if_icmpne       495
        //   447: goto            451
        //   450: athrow         
        //   451: aload_0        
        //   452: aload_1        
        //   453: aload           4
        //   455: iconst_0       
        //   456: aaload         
        //   457: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
        //   460: astore          6
        //   462: aload           6
        //   464: iload           11
        //   466: ifne            486
        //   469: aload           4
        //   471: iconst_0       
        //   472: aaload         
        //   473: if_acmpeq       490
        //   476: goto            480
        //   479: athrow         
        //   480: aload           6
        //   482: goto            486
        //   485: athrow         
        //   486: invokestatic    uiztfzghuzt/td.c:(Ljava/lang/reflect/Type;)Ljava/lang/reflect/WildcardType;
        //   489: areturn        
        //   490: iload           11
        //   492: ifeq            545
        //   495: aload           5
        //   497: arraylength    
        //   498: iconst_1       
        //   499: goto            503
        //   502: athrow         
        //   503: if_icmpne       545
        //   506: aload_0        
        //   507: aload_1        
        //   508: aload           5
        //   510: iconst_0       
        //   511: aaload         
        //   512: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
        //   515: astore          6
        //   517: aload           6
        //   519: iload           11
        //   521: ifne            541
        //   524: aload           5
        //   526: iconst_0       
        //   527: aaload         
        //   528: if_acmpeq       545
        //   531: goto            535
        //   534: athrow         
        //   535: aload           6
        //   537: goto            541
        //   540: athrow         
        //   541: invokestatic    uiztfzghuzt/td.b:(Ljava/lang/reflect/Type;)Ljava/lang/reflect/WildcardType;
        //   544: areturn        
        //   545: aload_3        
        //   546: areturn        
        //   547: aload_2        
        //   548: areturn        
        //    Signature:
        //  (Ljava/lang/reflect/Type;Ljava/lang/Class<*>;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
        //    StackMapTable: 00 4D FF 00 05 00 0C 07 00 26 07 00 36 07 00 26 00 00 00 00 00 00 00 00 01 00 00 FF 00 20 00 0C 07 00 26 07 00 36 07 00 26 07 00 65 00 00 00 00 00 00 00 01 00 01 07 00 19 40 07 00 26 46 07 00 19 00 43 07 00 19 40 07 00 26 00 FF 00 04 00 0C 07 00 26 07 00 36 07 00 26 00 00 00 00 00 00 00 00 01 00 00 40 07 00 26 4D 07 00 19 00 4E 07 00 19 40 01 45 07 00 19 00 FF 00 22 00 0C 07 00 26 07 00 36 07 00 26 07 00 36 07 00 36 07 00 26 00 00 00 00 00 01 00 01 07 00 19 00 43 07 00 19 00 41 07 00 26 42 07 00 04 FF 00 00 00 0C 07 00 26 07 00 36 07 00 26 00 00 00 00 00 00 00 00 01 00 00 43 01 4A 07 00 19 00 FF 00 24 00 0C 07 00 26 07 00 36 07 00 26 07 00 4E 07 00 26 07 00 26 00 00 00 00 00 01 00 01 07 00 19 00 43 07 00 19 00 41 07 00 26 42 07 00 4E FF 00 00 00 0C 07 00 26 07 00 36 07 00 26 00 00 00 00 00 00 00 00 01 00 00 43 01 4A 07 00 19 00 FF 00 20 00 0C 07 00 26 07 00 36 07 00 26 07 00 42 07 00 26 07 00 26 00 00 00 00 00 01 00 01 07 00 19 00 40 01 FF 00 11 00 0C 07 00 26 07 00 36 07 00 26 07 00 42 07 00 26 07 00 26 01 07 00 2E 01 01 00 01 00 00 FF 00 26 00 0C 07 00 26 07 00 36 07 00 26 07 00 42 07 00 26 07 00 26 01 07 00 2E 01 01 07 00 26 01 00 01 07 00 19 FF 00 00 00 0C 07 00 26 07 00 36 07 00 26 07 00 42 07 00 26 07 00 26 01 07 00 2E 01 01 07 00 26 01 00 02 07 00 26 07 00 26 45 07 00 19 00 49 07 00 19 40 01 45 07 00 19 00 4A 01 01 06 02 FF 00 04 00 0C 07 00 26 07 00 36 07 00 26 07 00 42 07 00 26 07 00 26 01 07 00 2E 01 01 00 01 00 00 4F 07 00 19 FF 00 00 00 0C 07 00 26 07 00 36 07 00 26 07 00 42 07 00 26 07 00 26 01 07 00 2E 01 01 00 01 00 02 07 00 26 07 00 26 07 40 07 00 42 FF 00 00 00 0C 07 00 26 07 00 36 07 00 26 00 00 00 00 00 00 00 00 01 00 00 4B 07 00 19 40 01 FF 00 26 00 0C 07 00 26 07 00 36 07 00 26 07 00 20 07 00 2E 07 00 2E 00 00 00 00 00 01 00 01 07 00 19 00 FF 00 1B 00 0C 07 00 26 07 00 36 07 00 26 07 00 20 07 00 2E 07 00 2E 07 00 26 00 00 00 00 01 00 01 07 00 19 00 44 07 00 19 40 07 00 26 03 FF 00 04 00 0C 07 00 26 07 00 36 07 00 26 07 00 20 07 00 2E 07 00 2E 00 00 00 00 00 01 00 00 46 07 00 19 FF 00 00 00 0C 07 00 26 07 00 36 07 00 26 07 00 20 07 00 2E 07 00 2E 00 00 00 00 00 01 00 02 01 01 FF 00 1E 00 0C 07 00 26 07 00 36 07 00 26 07 00 20 07 00 2E 07 00 2E 07 00 26 00 00 00 00 01 00 01 07 00 19 00 44 07 00 19 40 07 00 26 FF 00 03 00 0C 07 00 26 07 00 36 07 00 26 07 00 20 07 00 2E 07 00 2E 00 00 00 00 00 01 00 00 FF 00 01 00 0C 07 00 26 07 00 36 07 00 26 00 00 00 00 00 00 00 00 01 00 00 40 07 00 26
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  524    537    540    541    Ljava/lang/IllegalArgumentException;
        //  517    531    534    535    Ljava/lang/IllegalArgumentException;
        //  490    499    502    503    Ljava/lang/IllegalArgumentException;
        //  469    482    485    486    Ljava/lang/IllegalArgumentException;
        //  462    476    479    480    Ljava/lang/IllegalArgumentException;
        //  435    447    450    451    Ljava/lang/IllegalArgumentException;
        //  398    407    410    411    Ljava/lang/IllegalArgumentException;
        //  371    384    387    388    Ljava/lang/IllegalArgumentException;
        //  325    339    342    343    Ljava/lang/IllegalArgumentException;
        //  318    332    335    336    Ljava/lang/IllegalArgumentException;
        //  302    321    324    325    Ljava/lang/IllegalArgumentException;
        //  297    314    317    318    Ljava/lang/IllegalArgumentException;
        //  247    258    258    259    Ljava/lang/IllegalArgumentException;
        //  213    221    224    225    Ljava/lang/IllegalArgumentException;
        //  189    202    202    203    Ljava/lang/IllegalArgumentException;
        //  182    194    197    198    Ljava/lang/IllegalArgumentException;
        //  148    156    159    160    Ljava/lang/IllegalArgumentException;
        //  124    137    137    138    Ljava/lang/IllegalArgumentException;
        //  117    129    132    133    Ljava/lang/IllegalArgumentException;
        //  74     93     96     97     Ljava/lang/IllegalArgumentException;
        //  67     86     89     90     Ljava/lang/IllegalArgumentException;
        //  59     70     73     74     Ljava/lang/IllegalArgumentException;
        //  39     48     51     52     Ljava/lang/IllegalArgumentException;
        //  30     43     46     47     Ljava/lang/IllegalArgumentException;
        //  24     35     38     39     Ljava/lang/IllegalArgumentException;
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
    
    static Type a(final Type type, final Class<?> clazz, final TypeVariable<?> typeVariable) {
        final int b = xd.b;
        final Class<?> a = a(typeVariable);
        Type a2 = null;
        Label_0032: {
            Label_0026: {
                Class<?> clazz2;
                try {
                    clazz2 = (Class<?>)(a2 = a);
                    if (b != 0) {
                        break Label_0032;
                    }
                    if (clazz2 == null) {
                        return typeVariable;
                    }
                    break Label_0026;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                try {
                    if (clazz2 == null) {
                        return typeVariable;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            a2 = a(type, clazz, a);
        }
        final Type type2 = a2;
        int a3 = 0;
        Label_0051: {
            int n;
            try {
                n = (a3 = ((type2 instanceof ParameterizedType) ? 1 : 0));
                if (b != 0) {
                    return ((ParameterizedType)type2).getActualTypeArguments()[a3];
                }
                if (n != 0) {
                    break Label_0051;
                }
                return typeVariable;
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
            try {
                if (n == 0) {
                    return typeVariable;
                }
                a3 = a(a.getTypeParameters(), typeVariable);
            }
            catch (IllegalArgumentException ex4) {
                throw ex4;
            }
        }
        return ((ParameterizedType)type2).getActualTypeArguments()[a3];
    }
    
    private static int a(final Object[] array, final Object o) {
        final int b = xd.b;
        int i = 0;
        while (i < array.length) {
            Label_0036: {
                try {
                    final int equals;
                    final boolean b2 = (equals = (o.equals(array[i]) ? 1 : 0)) != 0;
                    if (b != 0) {
                        return equals;
                    }
                    if (!b2) {
                        break Label_0036;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                return i;
            }
            ++i;
            if (b != 0) {
                break;
            }
            continue;
            return i;
        }
        throw new NoSuchElementException();
    }
    
    private static Class<?> a(final TypeVariable<?> typeVariable) {
        final Object genericDeclaration = typeVariable.getGenericDeclaration();
        Object o2 = null;
        Label_0024: {
            Object o;
            try {
                o = (o2 = genericDeclaration);
                if (xd.b != 0) {
                    return (Class<?>)o2;
                }
                final boolean b = o instanceof Class;
                if (b) {
                    break Label_0024;
                }
                return null;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final boolean b = o instanceof Class;
                if (!b) {
                    return null;
                }
                o2 = genericDeclaration;
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return (Class<?>)o2;
        clazz = null;
        return clazz;
    }
    
    static void h(final Type type) {
        boolean b2 = false;
        Label_0027: {
            Label_0021: {
                try {
                    if (!(type instanceof Class)) {
                        break Label_0021;
                    }
                    final Type type2 = type;
                    final Class clazz = (Class)type2;
                    final boolean b = clazz.isPrimitive();
                    if (!b) {
                        break Label_0021;
                    }
                    break Label_0021;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                try {
                    final Type type2 = type;
                    final Class clazz = (Class)type2;
                    final boolean b = clazz.isPrimitive();
                    if (!b) {
                        b2 = true;
                        break Label_0027;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            b2 = false;
        }
        sd.a(b2);
    }
    
    static {
        final String[] array = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "*F/\"";
        int n4 = -1;
        String intern = null;
    Label_0077_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n6;
            final int n5 = n6 = (length = charArray.length);
            int n7 = 0;
            while (true) {
                Label_0154: {
                    if (n5 > 1) {
                        break Label_0154;
                    }
                    length = (n6 = n7);
                    do {
                        final char c = charArray[n6];
                        char c2 = '\0';
                        switch (n7 % 5) {
                            case 0: {
                                c2 = 'D';
                                break;
                            }
                            case 1: {
                                c2 = '3';
                                break;
                            }
                            case 2: {
                                c2 = 'C';
                                break;
                            }
                            case 3: {
                                c2 = 'N';
                                break;
                            }
                            default: {
                                c2 = '.';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n7;
                    } while (n5 == 0);
                }
                if (n5 > n7) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n4) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = 1));
                    s = "z\u0013*=\u000e+Uc:W4Vc";
                    n4 = 0;
                    continue Label_0077_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "\u0001K3+M0V'nOdp//]7\u001fc\u001eO6R.+Z!A*4K g:>Kh\u0013,<\u000e\u0003V-+\\-P\u0002<\\%J\u00177^!\u001fc,[0\u0013\u007f";
                    n4 = 1;
                    continue Label_0077_Outer;
                }
                case 1: {
                    break Label_0077_Outer;
                }
            }
        }
        array[n3] = intern;
        z = new String[] { "null", "> is of type ", "Expected a Class, ParameterizedType, or GenericArrayType, but <" };
        a = new Type[0];
    }
}
