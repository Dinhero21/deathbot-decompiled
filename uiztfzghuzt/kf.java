// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.util.Map;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.reflect.Field;

public final class kf implements md
{
    private final xd a;
    private final z b;
    private final me c;
    private final ff d;
    private static final String z = " declares multiple JSON fields named ";
    
    public kf(final xd a, final z b, final me c, final ff d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public boolean a(final Field field, final boolean b) {
        return a(field, b, this.c);
    }
    
    static boolean a(final Field field, final boolean b, final me me) {
        final boolean ab = rf.ab;
        Label_0034: {
            boolean a2 = false;
            boolean a = false;
            Label_0024: {
                boolean b2;
                try {
                    b2 = (a = (a2 = me.a(field.getType(), b)));
                    if (ab) {
                        break Label_0034;
                    }
                    if (!b2) {
                        break Label_0024;
                    }
                    return false;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                try {
                    if (b2) {
                        return false;
                    }
                    a2 = (a = me.a(field, b));
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            try {
                if (ab) {
                    return a2;
                }
                if (a) {
                    return false;
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
        return true;
        a2 = false;
        return a2;
    }
    
    private List<String> a(final Field field) {
        final boolean ab = rf.ab;
        final pd pd = field.getAnnotation(pd.class);
        pd pd2 = null;
        Label_0044: {
            try {
                pd2 = pd;
                if (ab) {
                    break Label_0044;
                }
                if (pd2 != null) {
                    break Label_0044;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            return Collections.singletonList(this.b.translateName(field));
        }
        final String a = pd2.a();
        final String[] b = pd.b();
        try {
            if (b.length == 0) {
                return Collections.singletonList(a);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        final ArrayList list = new ArrayList<String>(b.length + 1);
        list.add(a);
        final String[] array = b;
        final int length = array.length;
        int i = 0;
        ArrayList<String> list2 = null;
        while (i < length) {
            final String s = array[i];
            try {
                list2 = (ArrayList<String>)list;
                if (ab) {
                    return list2;
                }
                list2.add(s);
                ++i;
                if (!ab) {
                    continue;
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
            break;
        }
        return list2;
    }
    
    @Override
    public <T> nb<T> a(final ab ab, final ag<T> ag) {
        final Class<? super T> a = ag.a();
        try {
            if (!Object.class.isAssignableFrom(a)) {
                return null;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return new cc<T>((ue<Object>)this.a.a(ag), this.a(ab, ag, a));
    }
    
    private lf a(final ab ab, final Field field, final String s, final ag<?> ag, final boolean b, final boolean b2) {
        final boolean a = ve.a((Type)ag.a());
        final od od = field.getAnnotation(od.class);
        nb<?> nb = null;
        if (od != null) {
            nb = this.d.a(this.a, ab, ag, od);
        }
        boolean b3 = false;
        Label_0058: {
            try {
                if (nb != null) {
                    b3 = true;
                    break Label_0058;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            b3 = false;
        }
        final boolean b4 = b3;
        nb<?> nb2 = null;
        Label_0083: {
            try {
                nb2 = nb;
                if (rf.ab) {
                    return new mf(this, s, b, b2, field, b4, nb2, ab, ag, a);
                }
                if (nb2 != null) {
                    break Label_0083;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
            nb = ab.a(ag);
        }
        return new mf(this, s, b, b2, field, b4, nb2, ab, ag, a);
    }
    
    private Map<String, lf> a(final ab p0, final ag<?> p1, final Class<?> p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          21
        //     5: new             Ljava/util/LinkedHashMap;
        //     8: dup            
        //     9: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    12: astore          4
        //    14: aload_3        
        //    15: iload           21
        //    17: ifne            38
        //    20: invokevirtual   java/lang/Class.isInterface:()Z
        //    23: ifeq            34
        //    26: goto            30
        //    29: athrow         
        //    30: aload           4
        //    32: areturn        
        //    33: athrow         
        //    34: aload_2        
        //    35: invokevirtual   uiztfzghuzt/ag.b:()Ljava/lang/reflect/Type;
        //    38: astore          5
        //    40: aload_3        
        //    41: ldc             Ljava/lang/Object;.class
        //    43: if_acmpeq       362
        //    46: aload_3        
        //    47: invokevirtual   java/lang/Class.getDeclaredFields:()[Ljava/lang/reflect/Field;
        //    50: astore          6
        //    52: aload           6
        //    54: astore          7
        //    56: aload           7
        //    58: arraylength    
        //    59: istore          8
        //    61: iconst_0       
        //    62: istore          9
        //    64: iload           9
        //    66: iload           8
        //    68: if_icmpge       336
        //    71: aload           7
        //    73: iload           9
        //    75: aaload         
        //    76: astore          10
        //    78: aload_0        
        //    79: aload           10
        //    81: iconst_1       
        //    82: invokevirtual   uiztfzghuzt/kf.a:(Ljava/lang/reflect/Field;Z)Z
        //    85: istore          11
        //    87: aload_0        
        //    88: aload           10
        //    90: iconst_0       
        //    91: invokevirtual   uiztfzghuzt/kf.a:(Ljava/lang/reflect/Field;Z)Z
        //    94: istore          12
        //    96: iload           21
        //    98: ifne            143
        //   101: iload           11
        //   103: iload           21
        //   105: ifne            62
        //   108: goto            112
        //   111: athrow         
        //   112: ifne            133
        //   115: iload           12
        //   117: ifne            133
        //   120: goto            124
        //   123: athrow         
        //   124: iload           21
        //   126: ifeq            328
        //   129: goto            133
        //   132: athrow         
        //   133: aload           10
        //   135: iconst_1       
        //   136: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   139: goto            143
        //   142: athrow         
        //   143: aload_2        
        //   144: invokevirtual   uiztfzghuzt/ag.b:()Ljava/lang/reflect/Type;
        //   147: aload_3        
        //   148: aload           10
        //   150: invokevirtual   java/lang/reflect/Field.getGenericType:()Ljava/lang/reflect/Type;
        //   153: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
        //   156: astore          13
        //   158: aload_0        
        //   159: aload           10
        //   161: invokespecial   uiztfzghuzt/kf.a:(Ljava/lang/reflect/Field;)Ljava/util/List;
        //   164: astore          14
        //   166: aconst_null    
        //   167: astore          15
        //   169: iconst_0       
        //   170: istore          16
        //   172: aload           14
        //   174: invokeinterface java/util/List.size:()I
        //   179: istore          17
        //   181: iload           16
        //   183: iload           17
        //   185: if_icmpge       286
        //   188: aload           14
        //   190: iload           16
        //   192: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   197: checkcast       Ljava/lang/String;
        //   200: astore          18
        //   202: iload           16
        //   204: iload           21
        //   206: ifne            66
        //   209: iload           21
        //   211: ifne            222
        //   214: ifeq            224
        //   217: goto            221
        //   220: athrow         
        //   221: iconst_0       
        //   222: istore          11
        //   224: aload_0        
        //   225: aload_1        
        //   226: aload           10
        //   228: aload           18
        //   230: aload           13
        //   232: invokestatic    uiztfzghuzt/ag.a:(Ljava/lang/reflect/Type;)Luiztfzghuzt/ag;
        //   235: iload           11
        //   237: iload           12
        //   239: invokespecial   uiztfzghuzt/kf.a:(Luiztfzghuzt/ab;Ljava/lang/reflect/Field;Ljava/lang/String;Luiztfzghuzt/ag;ZZ)Luiztfzghuzt/lf;
        //   242: astore          19
        //   244: aload           4
        //   246: aload           18
        //   248: aload           19
        //   250: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   255: checkcast       Luiztfzghuzt/lf;
        //   258: astore          20
        //   260: iload           21
        //   262: ifne            281
        //   265: aload           15
        //   267: ifnonnull       278
        //   270: goto            274
        //   273: athrow         
        //   274: aload           20
        //   276: astore          15
        //   278: iinc            16, 1
        //   281: iload           21
        //   283: ifeq            181
        //   286: aload           15
        //   288: ifnull          328
        //   291: new             Ljava/lang/IllegalArgumentException;
        //   294: dup            
        //   295: new             Ljava/lang/StringBuilder;
        //   298: dup            
        //   299: invokespecial   java/lang/StringBuilder.<init>:()V
        //   302: aload           5
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   307: ldc             " declares multiple JSON fields named "
        //   309: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   312: aload           15
        //   314: getfield        uiztfzghuzt/lf.a:Ljava/lang/String;
        //   317: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   320: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   323: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   326: athrow         
        //   327: athrow         
        //   328: iinc            9, 1
        //   331: iload           21
        //   333: ifeq            64
        //   336: aload_2        
        //   337: invokevirtual   uiztfzghuzt/ag.b:()Ljava/lang/reflect/Type;
        //   340: aload_3        
        //   341: aload_3        
        //   342: invokevirtual   java/lang/Class.getGenericSuperclass:()Ljava/lang/reflect/Type;
        //   345: invokestatic    uiztfzghuzt/td.a:(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
        //   348: invokestatic    uiztfzghuzt/ag.a:(Ljava/lang/reflect/Type;)Luiztfzghuzt/ag;
        //   351: astore_2       
        //   352: aload_2        
        //   353: invokevirtual   uiztfzghuzt/ag.a:()Ljava/lang/Class;
        //   356: astore_3       
        //   357: iload           21
        //   359: ifeq            40
        //   362: aload           4
        //   364: areturn        
        //    Signature:
        //  (Luiztfzghuzt/ab;Luiztfzghuzt/ag<*>;Ljava/lang/Class<*>;)Ljava/util/Map<Ljava/lang/String;Luiztfzghuzt/lf;>;
        //    StackMapTable: 00 1F FF 00 1D 00 16 07 00 02 07 00 7A 07 00 63 07 00 67 07 00 93 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 25 00 42 07 00 25 00 43 07 00 DA FF 00 01 00 16 07 00 02 07 00 7A 07 00 63 07 00 67 07 00 93 07 00 DA 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 15 00 16 07 00 02 07 00 7A 07 00 63 07 00 67 07 00 93 07 00 DA 07 00 DC 07 00 DC 01 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 01 FF 00 01 00 16 07 00 02 07 00 7A 07 00 63 07 00 67 07 00 93 07 00 DA 07 00 DC 07 00 DC 01 01 00 00 00 00 00 00 00 00 00 00 00 01 00 00 41 01 FF 00 2C 00 16 07 00 02 07 00 7A 07 00 63 07 00 67 07 00 93 07 00 DA 07 00 DC 07 00 DC 01 01 07 00 2D 01 01 00 00 00 00 00 00 00 00 01 00 01 07 00 25 40 01 4A 07 00 25 00 47 07 00 25 00 48 07 00 25 00 FF 00 25 00 16 07 00 02 07 00 7A 07 00 63 07 00 67 07 00 93 07 00 DA 07 00 DC 07 00 DC 01 01 07 00 2D 01 01 07 00 DA 07 00 58 07 00 C3 01 01 00 00 00 01 00 00 FF 00 26 00 16 07 00 02 07 00 7A 07 00 63 07 00 67 07 00 93 07 00 DA 07 00 DC 07 00 DC 01 01 07 00 2D 01 01 07 00 DA 07 00 58 07 00 C3 01 01 07 00 5E 00 00 01 00 01 07 00 25 00 40 01 01 FF 00 30 00 16 07 00 02 07 00 7A 07 00 63 07 00 67 07 00 93 07 00 DA 07 00 DC 07 00 DC 01 01 07 00 2D 01 01 07 00 DA 07 00 58 07 00 C3 01 01 07 00 5E 07 00 C3 07 00 C3 01 00 01 07 00 25 00 03 02 FF 00 04 00 16 07 00 02 07 00 7A 07 00 63 07 00 67 07 00 93 07 00 DA 07 00 DC 07 00 DC 01 01 07 00 2D 01 01 07 00 DA 07 00 58 07 00 C3 01 01 00 00 00 01 00 00 68 07 00 25 FF 00 00 00 16 07 00 02 07 00 7A 07 00 63 07 00 67 07 00 93 07 00 DA 07 00 DC 07 00 DC 01 01 07 00 2D 01 01 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 16 07 00 02 07 00 7A 07 00 63 07 00 67 07 00 93 07 00 DA 07 00 DC 07 00 DC 01 01 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 19 00 16 07 00 02 07 00 7A 07 00 63 07 00 67 07 00 93 07 00 DA 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  286    327    327    328    Ljava/lang/IllegalArgumentException;
        //  260    270    273    274    Ljava/lang/IllegalArgumentException;
        //  209    217    220    221    Ljava/lang/IllegalArgumentException;
        //  124    139    142    143    Ljava/lang/IllegalArgumentException;
        //  115    129    132    133    Ljava/lang/IllegalArgumentException;
        //  112    120    123    124    Ljava/lang/IllegalArgumentException;
        //  96     108    111    112    Ljava/lang/IllegalArgumentException;
        //  20     33     33     34     Ljava/lang/IllegalArgumentException;
        //  14     26     29     30     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
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
        final char[] charArray = ">\u000f'=?\u007f\u0019'-ss\u001e.*:n\u0007'~\u0019M$\f~5w\u000e.: >\u0005#36zK".toCharArray();
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
                            c2 = '\u001e';
                            break;
                        }
                        case 1: {
                            c2 = 'k';
                            break;
                        }
                        case 2: {
                            c2 = 'B';
                            break;
                        }
                        case 3: {
                            c2 = '^';
                            break;
                        }
                        default: {
                            c2 = 'S';
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
