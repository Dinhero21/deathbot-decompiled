// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Type;
import java.util.Map;

final class ac<K, V> extends nb<Map<K, V>>
{
    private final nb<K> b;
    private final nb<V> c;
    private final ue<? extends Map<K, V>> d;
    final gf e;
    private static final String[] z;
    
    public ac(final gf e, final ab ab, final Type type, final nb<K> nb, final Type type2, final nb<V> nb2, final ue<? extends Map<K, V>> d) {
        this.e = e;
        this.b = new gc<K>(ab, nb, type);
        this.c = new gc<V>(ab, nb2, type2);
        this.d = d;
    }
    
    @Override
    public Map<K, V> a(final bg p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_1        
        //     6: invokevirtual   uiztfzghuzt/bg.g:()Luiztfzghuzt/p;
        //     9: astore_2       
        //    10: aload_2        
        //    11: iload           7
        //    13: ifne            42
        //    16: getstatic       uiztfzghuzt/p.NULL:Luiztfzghuzt/p;
        //    19: if_acmpne       33
        //    22: goto            26
        //    25: athrow         
        //    26: aload_1        
        //    27: invokevirtual   uiztfzghuzt/bg.n:()V
        //    30: aconst_null    
        //    31: areturn        
        //    32: athrow         
        //    33: aload_0        
        //    34: getfield        uiztfzghuzt/ac.d:Luiztfzghuzt/ue;
        //    37: invokeinterface uiztfzghuzt/ue.a:()Ljava/lang/Object;
        //    42: checkcast       Ljava/util/Map;
        //    45: astore_3       
        //    46: aload_2        
        //    47: getstatic       uiztfzghuzt/p.BEGIN_ARRAY:Luiztfzghuzt/p;
        //    50: if_acmpne       174
        //    53: aload_1        
        //    54: invokevirtual   uiztfzghuzt/bg.b:()V
        //    57: goto            61
        //    60: athrow         
        //    61: aload_1        
        //    62: invokevirtual   uiztfzghuzt/bg.f:()Z
        //    65: ifeq            165
        //    68: aload_1        
        //    69: invokevirtual   uiztfzghuzt/bg.b:()V
        //    72: aload_0        
        //    73: getfield        uiztfzghuzt/ac.b:Luiztfzghuzt/nb;
        //    76: aload_1        
        //    77: invokevirtual   uiztfzghuzt/nb.a:(Luiztfzghuzt/bg;)Ljava/lang/Object;
        //    80: astore          4
        //    82: aload_0        
        //    83: getfield        uiztfzghuzt/ac.c:Luiztfzghuzt/nb;
        //    86: aload_1        
        //    87: invokevirtual   uiztfzghuzt/nb.a:(Luiztfzghuzt/bg;)Ljava/lang/Object;
        //    90: astore          5
        //    92: aload_3        
        //    93: aload           4
        //    95: aload           5
        //    97: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   102: astore          6
        //   104: iload           7
        //   106: ifne            169
        //   109: iload           7
        //   111: ifne            160
        //   114: goto            118
        //   117: athrow         
        //   118: aload           6
        //   120: ifnull          156
        //   123: goto            127
        //   126: athrow         
        //   127: new             Luiztfzghuzt/kg;
        //   130: dup            
        //   131: new             Ljava/lang/StringBuilder;
        //   134: dup            
        //   135: invokespecial   java/lang/StringBuilder.<init>:()V
        //   138: ldc             "duplicate key: "
        //   140: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   143: aload           4
        //   145: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   148: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   151: invokespecial   uiztfzghuzt/kg.<init>:(Ljava/lang/String;)V
        //   154: athrow         
        //   155: athrow         
        //   156: aload_1        
        //   157: invokevirtual   uiztfzghuzt/bg.c:()V
        //   160: iload           7
        //   162: ifeq            61
        //   165: aload_1        
        //   166: invokevirtual   uiztfzghuzt/bg.c:()V
        //   169: iload           7
        //   171: ifeq            280
        //   174: aload_1        
        //   175: invokevirtual   uiztfzghuzt/bg.d:()V
        //   178: goto            182
        //   181: athrow         
        //   182: aload_1        
        //   183: invokevirtual   uiztfzghuzt/bg.f:()Z
        //   186: ifeq            276
        //   189: getstatic       uiztfzghuzt/ne.a:Luiztfzghuzt/ne;
        //   192: aload_1        
        //   193: invokevirtual   uiztfzghuzt/ne.a:(Luiztfzghuzt/bg;)V
        //   196: aload_0        
        //   197: getfield        uiztfzghuzt/ac.b:Luiztfzghuzt/nb;
        //   200: aload_1        
        //   201: invokevirtual   uiztfzghuzt/nb.a:(Luiztfzghuzt/bg;)Ljava/lang/Object;
        //   204: astore          4
        //   206: aload_0        
        //   207: getfield        uiztfzghuzt/ac.c:Luiztfzghuzt/nb;
        //   210: aload_1        
        //   211: invokevirtual   uiztfzghuzt/nb.a:(Luiztfzghuzt/bg;)Ljava/lang/Object;
        //   214: astore          5
        //   216: aload_3        
        //   217: aload           4
        //   219: aload           5
        //   221: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   226: astore          6
        //   228: iload           7
        //   230: ifne            280
        //   233: aload           6
        //   235: ifnull          271
        //   238: goto            242
        //   241: athrow         
        //   242: new             Luiztfzghuzt/kg;
        //   245: dup            
        //   246: new             Ljava/lang/StringBuilder;
        //   249: dup            
        //   250: invokespecial   java/lang/StringBuilder.<init>:()V
        //   253: ldc             "duplicate key: "
        //   255: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   258: aload           4
        //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   263: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   266: invokespecial   uiztfzghuzt/kg.<init>:(Ljava/lang/String;)V
        //   269: athrow         
        //   270: athrow         
        //   271: iload           7
        //   273: ifeq            182
        //   276: aload_1        
        //   277: invokevirtual   uiztfzghuzt/bg.e:()V
        //   280: aload_3        
        //   281: areturn        
        //    Signature:
        //  (Luiztfzghuzt/bg;)Ljava/util/Map<TK;TV;>;
        //    StackMapTable: 00 19 FF 00 19 00 08 07 00 02 07 00 2F 07 00 35 00 00 00 00 01 00 01 07 00 27 00 45 07 00 27 00 48 07 00 76 FF 00 11 00 08 07 00 02 07 00 2F 07 00 35 07 00 43 00 00 00 01 00 01 07 00 27 00 FF 00 37 00 08 07 00 02 07 00 2F 07 00 35 07 00 43 07 00 76 07 00 76 07 00 76 01 00 01 07 00 27 00 47 07 00 27 00 5B 07 00 27 00 03 FF 00 04 00 08 07 00 02 07 00 2F 07 00 35 07 00 43 00 00 00 01 00 00 03 04 46 07 00 27 00 FF 00 3A 00 08 07 00 02 07 00 2F 07 00 35 07 00 43 07 00 76 07 00 76 07 00 76 01 00 01 07 00 27 00 5B 07 00 27 00 FF 00 04 00 08 07 00 02 07 00 2F 07 00 35 07 00 43 00 00 00 01 00 00 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  233    270    270    271    Luiztfzghuzt/kg;
        //  228    238    241    242    Luiztfzghuzt/kg;
        //  169    178    181    182    Luiztfzghuzt/kg;
        //  118    155    155    156    Luiztfzghuzt/kg;
        //  109    123    126    127    Luiztfzghuzt/kg;
        //  104    114    117    118    Luiztfzghuzt/kg;
        //  46     57     60     61     Luiztfzghuzt/kg;
        //  16     32     32     33     Luiztfzghuzt/kg;
        //  10     22     25     26     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0118:
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
    public void a(final dg p0, final Map<K, V> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: iload           9
        //     7: ifne            27
        //    10: aload_2        
        //    11: ifnonnull       28
        //    14: goto            18
        //    17: athrow         
        //    18: aload_1        
        //    19: invokevirtual   uiztfzghuzt/dg.i:()Luiztfzghuzt/dg;
        //    22: pop            
        //    23: goto            27
        //    26: athrow         
        //    27: return         
        //    28: aload_0        
        //    29: getfield        uiztfzghuzt/ac.e:Luiztfzghuzt/gf;
        //    32: getfield        uiztfzghuzt/gf.b:Z
        //    35: iload           9
        //    37: ifne            135
        //    40: ifne            134
        //    43: goto            47
        //    46: athrow         
        //    47: aload_1        
        //    48: invokevirtual   uiztfzghuzt/dg.e:()Luiztfzghuzt/dg;
        //    51: pop            
        //    52: aload_2        
        //    53: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    58: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    63: astore_3       
        //    64: aload_3        
        //    65: invokeinterface java/util/Iterator.hasNext:()Z
        //    70: ifeq            128
        //    73: aload_3        
        //    74: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    79: checkcast       Ljava/util/Map$Entry;
        //    82: astore          4
        //    84: aload_1        
        //    85: aload           4
        //    87: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    92: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    95: invokevirtual   uiztfzghuzt/dg.a:(Ljava/lang/String;)Luiztfzghuzt/dg;
        //    98: pop            
        //    99: aload_0        
        //   100: getfield        uiztfzghuzt/ac.c:Luiztfzghuzt/nb;
        //   103: aload_1        
        //   104: aload           4
        //   106: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   111: invokevirtual   uiztfzghuzt/nb.a:(Luiztfzghuzt/dg;Ljava/lang/Object;)V
        //   114: iload           9
        //   116: ifne            133
        //   119: iload           9
        //   121: ifeq            64
        //   124: goto            128
        //   127: athrow         
        //   128: aload_1        
        //   129: invokevirtual   uiztfzghuzt/dg.f:()Luiztfzghuzt/dg;
        //   132: pop            
        //   133: return         
        //   134: iconst_0       
        //   135: istore_3       
        //   136: new             Ljava/util/ArrayList;
        //   139: dup            
        //   140: aload_2        
        //   141: invokeinterface java/util/Map.size:()I
        //   146: invokespecial   java/util/ArrayList.<init>:(I)V
        //   149: astore          4
        //   151: new             Ljava/util/ArrayList;
        //   154: dup            
        //   155: aload_2        
        //   156: invokeinterface java/util/Map.size:()I
        //   161: invokespecial   java/util/ArrayList.<init>:(I)V
        //   164: astore          5
        //   166: aload_2        
        //   167: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   172: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   177: astore          6
        //   179: aload           6
        //   181: invokeinterface java/util/Iterator.hasNext:()Z
        //   186: ifeq            302
        //   189: aload           6
        //   191: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   196: checkcast       Ljava/util/Map$Entry;
        //   199: astore          7
        //   201: aload_0        
        //   202: getfield        uiztfzghuzt/ac.b:Luiztfzghuzt/nb;
        //   205: aload           7
        //   207: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   212: invokevirtual   uiztfzghuzt/nb.a:(Ljava/lang/Object;)Luiztfzghuzt/fb;
        //   215: astore          8
        //   217: aload           4
        //   219: aload           8
        //   221: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   226: pop            
        //   227: aload           5
        //   229: aload           7
        //   231: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   236: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   241: pop            
        //   242: iload_3        
        //   243: iload           9
        //   245: ifne            303
        //   248: aload           8
        //   250: invokevirtual   uiztfzghuzt/fb.a:()Z
        //   253: iload           9
        //   255: ifne            291
        //   258: goto            262
        //   261: athrow         
        //   262: ifne            290
        //   265: goto            269
        //   268: athrow         
        //   269: aload           8
        //   271: invokevirtual   uiztfzghuzt/fb.b:()Z
        //   274: iload           9
        //   276: ifne            291
        //   279: goto            283
        //   282: athrow         
        //   283: ifeq            294
        //   286: goto            290
        //   289: athrow         
        //   290: iconst_1       
        //   291: goto            295
        //   294: iconst_0       
        //   295: ior            
        //   296: istore_3       
        //   297: iload           9
        //   299: ifeq            179
        //   302: iload_3        
        //   303: iload           9
        //   305: ifne            413
        //   308: ifeq            407
        //   311: goto            315
        //   314: athrow         
        //   315: aload_1        
        //   316: invokevirtual   uiztfzghuzt/dg.c:()Luiztfzghuzt/dg;
        //   319: pop            
        //   320: iconst_0       
        //   321: istore          6
        //   323: aload           4
        //   325: invokeinterface java/util/List.size:()I
        //   330: istore          7
        //   332: iload           6
        //   334: iload           7
        //   336: if_icmpge       399
        //   339: aload_1        
        //   340: invokevirtual   uiztfzghuzt/dg.c:()Luiztfzghuzt/dg;
        //   343: pop            
        //   344: aload           4
        //   346: iload           6
        //   348: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   353: checkcast       Luiztfzghuzt/fb;
        //   356: aload_1        
        //   357: invokestatic    uiztfzghuzt/we.a:(Luiztfzghuzt/fb;Luiztfzghuzt/dg;)V
        //   360: aload_0        
        //   361: getfield        uiztfzghuzt/ac.c:Luiztfzghuzt/nb;
        //   364: aload_1        
        //   365: aload           5
        //   367: iload           6
        //   369: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   374: invokevirtual   uiztfzghuzt/nb.a:(Luiztfzghuzt/dg;Ljava/lang/Object;)V
        //   377: aload_1        
        //   378: invokevirtual   uiztfzghuzt/dg.d:()Luiztfzghuzt/dg;
        //   381: pop            
        //   382: iinc            6, 1
        //   385: iload           9
        //   387: ifne            404
        //   390: iload           9
        //   392: ifeq            332
        //   395: goto            399
        //   398: athrow         
        //   399: aload_1        
        //   400: invokevirtual   uiztfzghuzt/dg.d:()Luiztfzghuzt/dg;
        //   403: pop            
        //   404: goto            495
        //   407: aload_1        
        //   408: invokevirtual   uiztfzghuzt/dg.e:()Luiztfzghuzt/dg;
        //   411: pop            
        //   412: iconst_0       
        //   413: istore          6
        //   415: aload           4
        //   417: invokeinterface java/util/List.size:()I
        //   422: istore          7
        //   424: iload           6
        //   426: iload           7
        //   428: if_icmpge       490
        //   431: aload           4
        //   433: iload           6
        //   435: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   440: checkcast       Luiztfzghuzt/fb;
        //   443: astore          8
        //   445: aload_1        
        //   446: aload_0        
        //   447: aload           8
        //   449: invokespecial   uiztfzghuzt/ac.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //   452: invokevirtual   uiztfzghuzt/dg.a:(Ljava/lang/String;)Luiztfzghuzt/dg;
        //   455: pop            
        //   456: aload_0        
        //   457: getfield        uiztfzghuzt/ac.c:Luiztfzghuzt/nb;
        //   460: aload_1        
        //   461: aload           5
        //   463: iload           6
        //   465: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   470: invokevirtual   uiztfzghuzt/nb.a:(Luiztfzghuzt/dg;Ljava/lang/Object;)V
        //   473: iinc            6, 1
        //   476: iload           9
        //   478: ifne            495
        //   481: iload           9
        //   483: ifeq            424
        //   486: goto            490
        //   489: athrow         
        //   490: aload_1        
        //   491: invokevirtual   uiztfzghuzt/dg.f:()Luiztfzghuzt/dg;
        //   494: pop            
        //   495: return         
        //    Signature:
        //  (Luiztfzghuzt/dg;Ljava/util/Map<TK;TV;>;)V
        //    StackMapTable: 00 27 FF 00 11 00 0A 07 00 02 07 00 79 07 00 43 00 00 00 00 00 00 01 00 01 07 00 27 00 47 07 00 27 00 00 51 07 00 27 00 FF 00 10 00 0A 07 00 02 07 00 79 07 00 43 07 00 8F 00 00 00 00 00 01 00 00 FF 00 3E 00 0A 07 00 02 07 00 79 07 00 43 07 00 8F 07 00 97 00 00 00 00 01 00 01 07 00 27 FF 00 00 00 0A 07 00 02 07 00 79 07 00 43 07 00 8F 00 00 00 00 00 01 00 00 04 FF 00 00 00 0A 07 00 02 07 00 79 07 00 43 00 00 00 00 00 00 01 00 00 40 01 FF 00 2B 00 0A 07 00 02 07 00 79 07 00 43 01 07 00 AD 07 00 AD 07 00 8F 00 00 01 00 00 FF 00 51 00 0A 07 00 02 07 00 79 07 00 43 01 07 00 AD 07 00 AD 07 00 8F 07 00 97 07 00 BF 01 00 01 07 00 27 FF 00 00 00 0A 07 00 02 07 00 79 07 00 43 01 07 00 AD 07 00 AD 07 00 8F 07 00 97 07 00 BF 01 00 02 01 01 45 07 00 27 40 01 4C 07 00 27 FF 00 00 00 0A 07 00 02 07 00 79 07 00 43 01 07 00 AD 07 00 AD 07 00 8F 07 00 97 07 00 BF 01 00 02 01 01 45 07 00 27 40 01 FF 00 00 00 0A 07 00 02 07 00 79 07 00 43 01 07 00 AD 07 00 AD 07 00 8F 07 00 97 07 00 BF 01 00 02 01 01 42 01 FF 00 00 00 0A 07 00 02 07 00 79 07 00 43 01 07 00 AD 07 00 AD 07 00 8F 07 00 97 07 00 BF 01 00 02 01 01 FF 00 06 00 0A 07 00 02 07 00 79 07 00 43 01 07 00 AD 07 00 AD 07 00 8F 00 00 01 00 00 40 01 4A 07 00 27 00 FF 00 10 00 0A 07 00 02 07 00 79 07 00 43 01 07 00 AD 07 00 AD 01 01 00 01 00 00 F7 00 41 07 00 27 00 04 FF 00 02 00 0A 07 00 02 07 00 79 07 00 43 01 07 00 AD 07 00 AD 07 00 8F 00 00 01 00 00 45 01 FF 00 0A 00 0A 07 00 02 07 00 79 07 00 43 01 07 00 AD 07 00 AD 01 01 00 01 00 00 FF 00 40 00 0A 07 00 02 07 00 79 07 00 43 01 07 00 AD 07 00 AD 01 01 07 00 BF 01 00 01 07 00 27 FF 00 00 00 0A 07 00 02 07 00 79 07 00 43 01 07 00 AD 07 00 AD 01 01 00 01 00 00 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  445    486    489    490    Luiztfzghuzt/kg;
        //  339    395    398    399    Luiztfzghuzt/kg;
        //  303    311    314    315    Luiztfzghuzt/kg;
        //  269    286    289    290    Luiztfzghuzt/kg;
        //  262    279    282    283    Luiztfzghuzt/kg;
        //  248    265    268    269    Luiztfzghuzt/kg;
        //  217    258    261    262    Luiztfzghuzt/kg;
        //  84     124    127    128    Luiztfzghuzt/kg;
        //  28     43     46     47     Luiztfzghuzt/kg;
        //  10     23     26     27     Luiztfzghuzt/kg;
        //  5      14     17     18     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0262:
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
    
    private String a(final fb fb) {
        final boolean ab = rf.ab;
        Label_0104: {
            boolean c = false;
            Label_0100: {
                try {
                    c = fb.c();
                    if (ab) {
                        break Label_0104;
                    }
                    if (!c) {
                        break Label_0100;
                    }
                }
                catch (kg kg) {
                    throw kg;
                }
                final jb g = fb.g();
                boolean b2 = false;
                jb jb = null;
                Label_0072: {
                    Label_0063: {
                        boolean e = false;
                        Label_0052: {
                            Label_0039: {
                                boolean b;
                                try {
                                    b = (e = (b2 = g.h()));
                                    if (ab) {
                                        break Label_0052;
                                    }
                                    if (b) {
                                        break Label_0039;
                                    }
                                    break Label_0039;
                                }
                                catch (kg kg2) {
                                    throw kg2;
                                }
                                try {
                                    if (b) {
                                        return String.valueOf(g.i());
                                    }
                                }
                                catch (kg kg3) {
                                    throw kg3;
                                }
                            }
                            b2 = (e = g.e());
                            try {
                                if (ab) {
                                    break Label_0072;
                                }
                                if (e) {
                                    break Label_0063;
                                }
                                break Label_0072;
                            }
                            catch (kg kg4) {
                                throw kg4;
                            }
                        }
                        try {
                            if (e) {
                                return Boolean.toString(g.g());
                            }
                        }
                        catch (kg kg5) {
                            throw kg5;
                        }
                    }
                    try {
                        jb = g;
                        if (ab) {
                            return jb.h();
                        }
                        b2 = jb.j();
                    }
                    catch (kg kg6) {
                        throw kg6;
                    }
                }
                if (!b2) {
                    throw new AssertionError();
                }
                return jb.h();
            }
            fb.d();
            try {
                if (c) {
                    return "null";
                }
            }
            catch (kg kg7) {
                throw kg7;
            }
        }
        throw new AssertionError();
    }
    
    static {
        final String[] array = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "\u0013tv\u0001";
        int n3 = -1;
        String intern = null;
    Label_0065_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n5;
            final int n4 = n5 = (length = charArray.length);
            int n6 = 0;
            while (true) {
                Label_0141: {
                    if (n4 > 1) {
                        break Label_0141;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = '}';
                                break;
                            }
                            case 1: {
                                c2 = '\u0001';
                                break;
                            }
                            case 2: {
                                c2 = '\u001a';
                                break;
                            }
                            case 3: {
                                c2 = 'm';
                                break;
                            }
                            default: {
                                c2 = '+';
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
                    s = "\u0019tj\u0001B\u001e`n\b\u000b\u0016dcW\u000b";
                    n3 = 0;
                    continue Label_0065_Outer;
                }
                case 0: {
                    break Label_0065_Outer;
                }
            }
        }
        array[n] = intern;
        z = new String[] { "null", "duplicate key: " };
    }
}
