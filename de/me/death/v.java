// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.kg;
import java.net.Socket;
import java.util.Random;
import uiztfzghuzt.t;
import java.io.DataOutput;
import uiztfzghuzt.u;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class v extends l
{
    private static int n;
    private static final String[] z;
    
    static {
        final String[] array = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "\u0005\u0014\u0014n\u0004~";
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
                                c2 = '^';
                                break;
                            }
                            case 1: {
                                c2 = 'V';
                                break;
                            }
                            case 2: {
                                c2 = '{';
                                break;
                            }
                            case 3: {
                                c2 = '\u001a';
                                break;
                            }
                            default: {
                                c2 = '>';
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
                    s = "~\u001c\u0014sP;2[NV;v(\u007fL(3\t;c";
                    n4 = 0;
                    continue Label_0077_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "oxN4\f";
                    n4 = 1;
                    continue Label_0077_Outer;
                }
                case 1: {
                    break Label_0077_Outer;
                }
            }
        }
        array[n3] = intern;
        z = new String[] { "[Bot: ", " Joined The Server!]", "1.5.2" };
        v.n = 61;
    }
    
    public v(final String s, final ab ab, final g g) {
        super(s, ab, g);
    }
    
    @Override
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: aload_0        
        //     6: getfield        de/me/death/v.c:Lde/me/death/g;
        //     9: iload           10
        //    11: ifne            36
        //    14: invokevirtual   de/me/death/g.i:()Z
        //    17: ifeq            32
        //    20: goto            24
        //    23: athrow         
        //    24: aload_0        
        //    25: invokevirtual   de/me/death/v.b:()V
        //    28: goto            32
        //    31: astore_1       
        //    32: aload_0        
        //    33: getfield        de/me/death/v.c:Lde/me/death/g;
        //    36: invokevirtual   de/me/death/g.r:()Lde/me/death/b;
        //    39: getstatic       de/me/death/b.NONE:Lde/me/death/b;
        //    42: if_acmpeq       79
        //    45: new             Lde/me/death/hb;
        //    48: dup            
        //    49: aload_0        
        //    50: getfield        de/me/death/v.c:Lde/me/death/g;
        //    53: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //    56: aload_0        
        //    57: getfield        de/me/death/v.c:Lde/me/death/g;
        //    60: invokevirtual   de/me/death/g.n:()I
        //    63: aload_0        
        //    64: getfield        de/me/death/v.l:Lde/me/death/ab;
        //    67: sipush          5000
        //    70: invokespecial   de/me/death/hb.<init>:(Ljava/lang/String;ILde/me/death/ab;I)V
        //    73: astore_1       
        //    74: iload           10
        //    76: ifeq            101
        //    79: new             Ljava/net/Socket;
        //    82: dup            
        //    83: aload_0        
        //    84: getfield        de/me/death/v.c:Lde/me/death/g;
        //    87: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //    90: aload_0        
        //    91: getfield        de/me/death/v.c:Lde/me/death/g;
        //    94: invokevirtual   de/me/death/g.n:()I
        //    97: invokespecial   java/net/Socket.<init>:(Ljava/lang/String;I)V
        //   100: astore_1       
        //   101: new             Ljava/io/DataOutputStream;
        //   104: dup            
        //   105: aload_1        
        //   106: invokevirtual   java/net/Socket.getOutputStream:()Ljava/io/OutputStream;
        //   109: invokespecial   java/io/DataOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   112: astore_2       
        //   113: new             Ljava/io/DataInputStream;
        //   116: dup            
        //   117: aload_1        
        //   118: invokevirtual   java/net/Socket.getInputStream:()Ljava/io/InputStream;
        //   121: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //   124: astore_3       
        //   125: aload_0        
        //   126: aload_2        
        //   127: invokevirtual   de/me/death/v.a:(Ljava/io/DataOutputStream;)V
        //   130: iconst_0       
        //   131: istore          4
        //   133: iload           10
        //   135: ifeq            376
        //   138: iinc            4, 1
        //   141: aload_3        
        //   142: invokevirtual   java/io/DataInputStream.readUnsignedByte:()I
        //   145: goto            149
        //   148: athrow         
        //   149: istore          5
        //   151: iload           5
        //   153: sipush          253
        //   156: iload           10
        //   158: ifne            269
        //   161: if_icmpne       251
        //   164: aload_0        
        //   165: aload_3        
        //   166: invokevirtual   de/me/death/v.b:(Ljava/io/DataInputStream;)Ljava/lang/String;
        //   169: pop            
        //   170: aload_3        
        //   171: invokevirtual   java/io/DataInputStream.readUnsignedShort:()I
        //   174: istore          6
        //   176: iconst_0       
        //   177: istore          7
        //   179: iload           10
        //   181: ifeq            196
        //   184: aload_3        
        //   185: invokevirtual   java/io/DataInputStream.readByte:()B
        //   188: pop            
        //   189: goto            193
        //   192: athrow         
        //   193: iinc            7, 1
        //   196: iload           7
        //   198: iload           6
        //   200: if_icmplt       184
        //   203: aload_3        
        //   204: invokevirtual   java/io/DataInputStream.readUnsignedShort:()I
        //   207: istore          6
        //   209: iconst_0       
        //   210: istore          7
        //   212: iload           10
        //   214: ifne            193
        //   217: iload           10
        //   219: ifeq            234
        //   222: aload_3        
        //   223: invokevirtual   java/io/DataInputStream.readByte:()B
        //   226: pop            
        //   227: goto            231
        //   230: athrow         
        //   231: iinc            7, 1
        //   234: iload           7
        //   236: iload           6
        //   238: if_icmplt       222
        //   241: iload           10
        //   243: ifne            231
        //   246: iload           10
        //   248: ifeq            376
        //   251: iload           5
        //   253: iload           10
        //   255: ifne            309
        //   258: goto            262
        //   261: athrow         
        //   262: sipush          255
        //   265: goto            269
        //   268: athrow         
        //   269: if_icmpne       307
        //   272: aload_0        
        //   273: aload_3        
        //   274: invokevirtual   de/me/death/v.b:(Ljava/io/DataInputStream;)Ljava/lang/String;
        //   277: astore          6
        //   279: aload_0        
        //   280: new             Ljava/lang/StringBuilder;
        //   283: dup            
        //   284: ldc             "[Bot: "
        //   286: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   289: aload           6
        //   291: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   294: ldc             "]"
        //   296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   299: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   302: iconst_1       
        //   303: invokevirtual   de/me/death/v.a:(Ljava/lang/String;Z)V
        //   306: return         
        //   307: iload           5
        //   309: iload           10
        //   311: ifne            349
        //   314: ifne            343
        //   317: goto            321
        //   320: athrow         
        //   321: aload_3        
        //   322: invokevirtual   java/io/DataInputStream.readUnsignedByte:()I
        //   325: istore          6
        //   327: aload_2        
        //   328: iconst_0       
        //   329: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //   332: aload_2        
        //   333: iload           6
        //   335: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //   338: iload           10
        //   340: ifeq            376
        //   343: iload           5
        //   345: goto            349
        //   348: athrow         
        //   349: iconst_1       
        //   350: iload           10
        //   352: ifne            383
        //   355: if_icmpne       376
        //   358: goto            362
        //   361: athrow         
        //   362: aload_0        
        //   363: aload_3        
        //   364: invokespecial   de/me/death/v.a:(Ljava/io/DataInputStream;)V
        //   367: iload           10
        //   369: ifeq            386
        //   372: goto            376
        //   375: athrow         
        //   376: iload           4
        //   378: iconst_3       
        //   379: goto            383
        //   382: athrow         
        //   383: if_icmplt       138
        //   386: aload_0        
        //   387: new             Ljava/lang/StringBuilder;
        //   390: dup            
        //   391: ldc             "[Bot: "
        //   393: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   396: aload_0        
        //   397: getfield        de/me/death/v.b:Ljava/lang/String;
        //   400: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   403: ldc             " Joined The Server!]"
        //   405: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   408: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   411: iconst_0       
        //   412: invokevirtual   de/me/death/v.a:(Ljava/lang/String;Z)V
        //   415: aload_0        
        //   416: getfield        de/me/death/v.c:Lde/me/death/g;
        //   419: invokevirtual   de/me/death/g.g:()Z
        //   422: iload           10
        //   424: ifne            149
        //   427: iload           10
        //   429: ifne            598
        //   432: ifeq            591
        //   435: goto            439
        //   438: athrow         
        //   439: aload_0        
        //   440: getfield        de/me/death/v.c:Lde/me/death/g;
        //   443: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   446: iload           10
        //   448: ifne            495
        //   451: goto            455
        //   454: athrow         
        //   455: ifnull          479
        //   458: goto            462
        //   461: athrow         
        //   462: aload_0        
        //   463: aload_0        
        //   464: getfield        de/me/death/v.c:Lde/me/death/g;
        //   467: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   470: aload_2        
        //   471: iconst_0       
        //   472: invokevirtual   de/me/death/v.a:(Ljava/lang/String;Ljava/io/DataOutputStream;Z)V
        //   475: goto            479
        //   478: athrow         
        //   479: aload_0        
        //   480: iload           10
        //   482: ifne            499
        //   485: getfield        de/me/death/v.c:Lde/me/death/g;
        //   488: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   491: goto            495
        //   494: athrow         
        //   495: ifnull          511
        //   498: aload_0        
        //   499: aload_0        
        //   500: getfield        de/me/death/v.c:Lde/me/death/g;
        //   503: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   506: aload_2        
        //   507: iconst_0       
        //   508: invokevirtual   de/me/death/v.a:(Ljava/lang/String;Ljava/io/DataOutputStream;Z)V
        //   511: iconst_0       
        //   512: istore          5
        //   514: iload           10
        //   516: ifeq            579
        //   519: aload_0        
        //   520: getfield        de/me/death/v.c:Lde/me/death/g;
        //   523: invokevirtual   de/me/death/g.k:()Ljava/lang/String;
        //   526: ldc             ";"
        //   528: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   531: dup            
        //   532: astore          9
        //   534: arraylength    
        //   535: istore          8
        //   537: iconst_0       
        //   538: istore          7
        //   540: iload           10
        //   542: ifeq            569
        //   545: aload           9
        //   547: iload           7
        //   549: aaload         
        //   550: astore          6
        //   552: new             Lde/me/death/fb;
        //   555: dup            
        //   556: aload_0        
        //   557: aload           6
        //   559: aload_2        
        //   560: invokespecial   de/me/death/fb.<init>:(Lde/me/death/v;Ljava/lang/String;Ljava/io/DataOutputStream;)V
        //   563: invokevirtual   de/me/death/fb.start:()V
        //   566: iinc            7, 1
        //   569: iload           7
        //   571: iload           8
        //   573: if_icmplt       545
        //   576: iinc            5, 1
        //   579: iload           5
        //   581: aload_0        
        //   582: getfield        de/me/death/v.c:Lde/me/death/g;
        //   585: invokevirtual   de/me/death/g.o:()I
        //   588: if_icmplt       519
        //   591: aload_0        
        //   592: getfield        de/me/death/v.c:Lde/me/death/g;
        //   595: invokevirtual   de/me/death/g.f:()Z
        //   598: iload           10
        //   600: ifne            618
        //   603: ifeq            642
        //   606: goto            610
        //   609: athrow         
        //   610: aload_0        
        //   611: getfield        de/me/death/v.e:I
        //   614: goto            618
        //   617: athrow         
        //   618: iload           10
        //   620: ifne            638
        //   623: iflt            642
        //   626: goto            630
        //   629: athrow         
        //   630: aload_0        
        //   631: getfield        de/me/death/v.e:I
        //   634: goto            638
        //   637: athrow         
        //   638: i2l            
        //   639: invokestatic    java/lang/Thread.sleep:(J)V
        //   642: aload_1        
        //   643: invokevirtual   java/net/Socket.close:()V
        //   646: goto            654
        //   649: astore_2       
        //   650: aload_1        
        //   651: invokevirtual   java/net/Socket.close:()V
        //   654: return         
        //    StackMapTable: 00 42 FF 00 17 00 0B 07 00 02 00 00 00 00 00 00 00 00 00 01 00 01 07 00 35 00 46 07 00 35 00 43 07 00 3E 2A FF 00 15 00 0B 07 00 02 07 00 5F 00 00 00 00 00 00 00 00 01 00 00 FF 00 24 00 0B 07 00 02 07 00 5F 07 00 64 07 00 6D 01 00 00 00 00 00 01 00 00 49 07 00 35 40 01 FF 00 22 00 0B 07 00 02 07 00 5F 07 00 64 07 00 6D 01 01 01 01 00 00 01 00 00 47 07 00 35 00 02 19 47 07 00 35 00 02 FF 00 10 00 0B 07 00 02 07 00 5F 07 00 64 07 00 6D 01 01 00 00 00 00 01 00 00 49 07 00 35 40 01 45 07 00 35 FF 00 00 00 0B 07 00 02 07 00 5F 07 00 64 07 00 6D 01 01 00 00 00 00 01 00 02 01 01 25 41 01 4A 07 00 35 00 15 44 07 00 35 40 01 4B 07 00 35 00 4C 07 00 35 FF 00 00 00 0B 07 00 02 07 00 5F 07 00 64 07 00 6D 01 00 00 00 00 00 01 00 00 45 07 00 35 FF 00 00 00 0B 07 00 02 07 00 5F 07 00 64 07 00 6D 01 00 00 00 00 00 01 00 02 01 01 02 73 07 00 35 00 4E 07 00 35 40 07 00 0C 45 07 00 35 00 4F 07 00 35 00 4E 07 00 35 40 07 00 0C 43 07 00 02 0B FF 00 07 00 0B 07 00 02 07 00 5F 07 00 64 07 00 6D 01 01 00 00 00 00 01 00 00 FF 00 19 00 0B 07 00 02 07 00 5F 07 00 64 07 00 6D 01 01 00 01 01 07 00 2D 01 00 00 17 FF 00 09 00 0B 07 00 02 07 00 5F 07 00 64 07 00 6D 01 01 00 00 00 00 01 00 00 FF 00 0B 00 0B 07 00 02 07 00 5F 07 00 64 07 00 6D 01 00 00 00 00 00 01 00 00 46 01 4A 07 00 35 00 46 07 00 35 40 01 4A 07 00 35 00 46 07 00 35 40 01 03 FF 00 06 00 0B 07 00 02 07 00 5F 00 00 00 00 00 00 00 00 01 00 01 07 00 35 FF 00 04 00 0B 07 00 02 07 00 5F 07 00 CE 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      28     31     32     Ljava/lang/Exception;
        //  251    265    268    269    Ljava/lang/Exception;
        //  246    258    261    262    Ljava/lang/Exception;
        //  217    227    230    231    Ljava/lang/Exception;
        //  179    189    192    193    Ljava/lang/Exception;
        //  133    145    148    149    Ljava/lang/Exception;
        //  5      20     23     24     Ljava/lang/Exception;
        //  101    306    649    654    Ljava/lang/Exception;
        //  623    634    637    638    Ljava/lang/Exception;
        //  618    626    629    630    Ljava/lang/Exception;
        //  603    614    617    618    Ljava/lang/Exception;
        //  598    606    609    610    Ljava/lang/Exception;
        //  479    491    494    495    Ljava/lang/Exception;
        //  455    475    478    479    Ljava/lang/Exception;
        //  439    458    461    462    Ljava/lang/Exception;
        //  432    451    454    455    Ljava/lang/Exception;
        //  427    435    438    439    Ljava/lang/Exception;
        //  362    379    382    383    Ljava/lang/Exception;
        //  355    372    375    376    Ljava/lang/Exception;
        //  349    358    361    362    Ljava/lang/Exception;
        //  327    345    348    349    Ljava/lang/Exception;
        //  309    317    320    321    Ljava/lang/Exception;
        //  307    646    649    654    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0251:
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
    
    private void a(final DataInputStream dataInputStream) {
        final int m = de.me.death.l.m;
        try {
        Label_0030_Outer:
            while (true) {
                dataInputStream.readInt();
                this.b(dataInputStream);
                int n = 0;
                while (true) {
                    while (true) {
                        Label_0033: {
                            try {
                                if (m == 0) {
                                    break Label_0033;
                                }
                                dataInputStream.readByte();
                            }
                            catch (Exception ex) {
                                throw ex;
                            }
                            ++n;
                        }
                        if (n < 5) {
                            continue Label_0030_Outer;
                        }
                        break;
                    }
                    if (m == 0) {
                        break;
                    }
                    continue;
                }
            }
        }
        catch (Exception ex2) {}
    }
    
    @Override
    public void a(final DataOutputStream dataOutputStream) {
        try {
            final t a = u.a();
            a.writeByte(2);
            a.writeByte(v.n);
            this.a(this.b, a);
            this.a(this.c.b(), a);
            a.writeInt(this.c.n());
            this.b(a, dataOutputStream);
            final t a2 = u.a();
            a2.writeByte(205);
            a2.writeByte(0);
            this.b(a2, dataOutputStream);
        }
        catch (Exception ex) {}
    }
    
    @Override
    public void b(final t t, final DataOutputStream dataOutputStream) {
        dataOutputStream.write(t.a());
        dataOutputStream.flush();
    }
    
    @Override
    public String toString() {
        return "1.5.2";
    }
    
    @Override
    public void a(final String s, final DataOutput dataOutput) {
        dataOutput.writeShort(s.length());
        dataOutput.writeChars(s);
    }
    
    public void a(final String s, final DataOutputStream dataOutputStream, final boolean b) {
        final int m = de.me.death.l.m;
        try {
            String replaceFirst = s;
            while (true) {
                Label_0046: {
                    if (m == 0) {
                        break Label_0046;
                    }
                    replaceFirst = replaceFirst.replaceFirst("#", String.valueOf(new Random().nextInt(45)));
                }
                if (replaceFirst.contains("#")) {
                    continue;
                }
                break;
            }
            final t a = u.a();
            a.writeByte(3);
            this.a(replaceFirst, a);
            this.b(a, dataOutputStream);
        }
        catch (Exception ex) {}
    }
    
    @Override
    public void b() {
        try {
            Socket socket = null;
            Label_0067: {
                if (this.c.r() != de.me.death.b.NONE) {
                    socket = new hb(this.c.b(), this.c.n(), this.l);
                    if (de.me.death.l.m == 0) {
                        break Label_0067;
                    }
                }
                socket = new Socket(this.c.b(), this.c.n());
            }
            final DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            final DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream.writeByte(254);
            dataOutputStream.writeByte(1);
            dataOutputStream.flush();
            dataInputStream.read(new byte[dataInputStream.readUnsignedShort()]);
            socket.close();
        }
        catch (Exception ex) {}
    }
    
    public String b(final DataInputStream dataInputStream) {
        String s = null;
    Label_0047_Outer:
        while (true) {
            final int m = de.me.death.l.m;
            final short short1 = dataInputStream.readShort();
            String obj = "";
            short n = 0;
            while (true) {
                while (true) {
                    Label_0051: {
                        try {
                            if (m == 0) {
                                break Label_0051;
                            }
                            new StringBuilder(String.valueOf(obj)).append(dataInputStream.readChar()).toString();
                        }
                        catch (kg kg) {
                            throw kg;
                        }
                        obj = s;
                        ++n;
                    }
                    if (n < short1) {
                        continue Label_0047_Outer;
                    }
                    break;
                }
                s = obj;
                if (m == 0) {
                    break;
                }
                continue;
            }
        }
        return s;
    }
}
