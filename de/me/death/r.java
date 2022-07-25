// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.nb;
import uiztfzghuzt.kg;
import uiztfzghuzt.t;
import java.io.DataOutput;
import uiztfzghuzt.u;
import java.io.DataOutputStream;

public class r extends l
{
    private static final String[] z;
    
    public r(final String s, final ab ab, final g g) {
        super(s, ab, g);
        this.i = new int[] { 0, 1, 2, 3, 26, 46, 31 };
    }
    
    @Override
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          11
        //     5: aload_0        
        //     6: getfield        de/me/death/r.c:Lde/me/death/g;
        //     9: iload           11
        //    11: ifne            36
        //    14: invokevirtual   de/me/death/g.i:()Z
        //    17: ifeq            32
        //    20: goto            24
        //    23: athrow         
        //    24: aload_0        
        //    25: invokevirtual   de/me/death/r.b:()V
        //    28: goto            32
        //    31: athrow         
        //    32: aload_0        
        //    33: getfield        de/me/death/r.c:Lde/me/death/g;
        //    36: invokevirtual   de/me/death/g.r:()Lde/me/death/b;
        //    39: getstatic       de/me/death/b.NONE:Lde/me/death/b;
        //    42: if_acmpeq       79
        //    45: new             Lde/me/death/hb;
        //    48: dup            
        //    49: aload_0        
        //    50: getfield        de/me/death/r.c:Lde/me/death/g;
        //    53: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //    56: aload_0        
        //    57: getfield        de/me/death/r.c:Lde/me/death/g;
        //    60: invokevirtual   de/me/death/g.n:()I
        //    63: aload_0        
        //    64: getfield        de/me/death/r.l:Lde/me/death/ab;
        //    67: sipush          5000
        //    70: invokespecial   de/me/death/hb.<init>:(Ljava/lang/String;ILde/me/death/ab;I)V
        //    73: astore_1       
        //    74: iload           11
        //    76: ifeq            101
        //    79: new             Ljava/net/Socket;
        //    82: dup            
        //    83: aload_0        
        //    84: getfield        de/me/death/r.c:Lde/me/death/g;
        //    87: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //    90: aload_0        
        //    91: getfield        de/me/death/r.c:Lde/me/death/g;
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
        //   127: invokevirtual   de/me/death/r.a:(Ljava/io/DataOutputStream;)V
        //   130: aload_0        
        //   131: aload_2        
        //   132: invokevirtual   de/me/death/r.b:(Ljava/io/DataOutputStream;)V
        //   135: iconst_0       
        //   136: istore          4
        //   138: iload           11
        //   140: ifeq            330
        //   143: aload_0        
        //   144: aload_3        
        //   145: invokevirtual   de/me/death/r.a:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   148: astore          5
        //   150: aload           5
        //   152: getfield        de/me/death/a.a:I
        //   155: iload           11
        //   157: ifne            252
        //   160: ifne            247
        //   163: aload_0        
        //   164: aload           5
        //   166: invokevirtual   de/me/death/r.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   169: astore          6
        //   171: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   174: aload           6
        //   176: ldc             Luiztfzghuzt/fb;.class
        //   178: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   181: checkcast       Luiztfzghuzt/fb;
        //   184: astore          7
        //   186: aload_0        
        //   187: aload           7
        //   189: invokevirtual   de/me/death/r.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //   192: astore          6
        //   194: goto            219
        //   197: astore          7
        //   199: aload           7
        //   201: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   204: aload           6
        //   206: iconst_1       
        //   207: aload           6
        //   209: invokevirtual   java/lang/String.length:()I
        //   212: iconst_1       
        //   213: isub           
        //   214: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   217: astore          6
        //   219: aload_0        
        //   220: new             Ljava/lang/StringBuilder;
        //   223: dup            
        //   224: ldc             "[Bot: "
        //   226: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   229: aload           6
        //   231: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   234: ldc             "]"
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   242: iconst_1       
        //   243: invokevirtual   de/me/death/r.a:(Ljava/lang/String;Z)V
        //   246: return         
        //   247: aload           5
        //   249: getfield        de/me/death/a.a:I
        //   252: iconst_1       
        //   253: iload           11
        //   255: ifne            279
        //   258: if_icmpne       273
        //   261: goto            265
        //   264: athrow         
        //   265: aload_0        
        //   266: ldc             "[Bot: This server is an premium server!]"
        //   268: iconst_1       
        //   269: invokevirtual   de/me/death/r.a:(Ljava/lang/String;Z)V
        //   272: return         
        //   273: aload           5
        //   275: getfield        de/me/death/a.a:I
        //   278: iconst_2       
        //   279: iload           11
        //   281: ifne            318
        //   284: if_icmpne       299
        //   287: goto            291
        //   290: athrow         
        //   291: iconst_1       
        //   292: istore          4
        //   294: iload           11
        //   296: ifeq            330
        //   299: aload           5
        //   301: getfield        de/me/death/a.a:I
        //   304: iload           11
        //   306: ifne            332
        //   309: goto            313
        //   312: athrow         
        //   313: iconst_3       
        //   314: goto            318
        //   317: athrow         
        //   318: if_icmpne       330
        //   321: aload_0        
        //   322: iconst_1       
        //   323: putfield        de/me/death/r.d:Z
        //   326: goto            330
        //   329: athrow         
        //   330: iload           4
        //   332: ifeq            143
        //   335: aload_0        
        //   336: getfield        de/me/death/r.d:Z
        //   339: iload           11
        //   341: ifne            332
        //   344: iload           11
        //   346: ifne            363
        //   349: ifeq            143
        //   352: goto            356
        //   355: athrow         
        //   356: aload_0        
        //   357: getfield        de/me/death/r.c:Lde/me/death/g;
        //   360: invokevirtual   de/me/death/g.j:()Z
        //   363: iload           11
        //   365: ifne            624
        //   368: ifeq            588
        //   371: goto            375
        //   374: athrow         
        //   375: aload_0        
        //   376: aload_3        
        //   377: invokevirtual   de/me/death/r.a:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   380: astore          6
        //   382: aload           6
        //   384: ifnull          375
        //   387: aload           6
        //   389: getfield        de/me/death/a.a:I
        //   392: bipush          26
        //   394: iload           11
        //   396: ifne            508
        //   399: if_icmpne       501
        //   402: goto            406
        //   405: athrow         
        //   406: aload_0        
        //   407: aload           6
        //   409: invokevirtual   de/me/death/r.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   412: astore          7
        //   414: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   417: aload           7
        //   419: ldc             Luiztfzghuzt/fb;.class
        //   421: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   424: checkcast       Luiztfzghuzt/fb;
        //   427: astore          9
        //   429: aload_0        
        //   430: aload           9
        //   432: invokevirtual   de/me/death/r.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //   435: astore          8
        //   437: goto            473
        //   440: astore          9
        //   442: aload           7
        //   444: aload           7
        //   446: ldc             "\""
        //   448: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   451: iconst_1       
        //   452: iadd           
        //   453: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   456: astore          10
        //   458: aload           10
        //   460: iconst_0       
        //   461: aload           10
        //   463: ldc             "\""
        //   465: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   468: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   471: astore          8
        //   473: aload_0        
        //   474: new             Ljava/lang/StringBuilder;
        //   477: dup            
        //   478: ldc             "[Bot: "
        //   480: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   483: aload           8
        //   485: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   488: ldc             "]"
        //   490: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   493: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   496: iconst_1       
        //   497: invokevirtual   de/me/death/r.a:(Ljava/lang/String;Z)V
        //   500: return         
        //   501: aload           6
        //   503: getfield        de/me/death/a.a:I
        //   506: bipush          46
        //   508: if_icmpne       375
        //   511: aload_0        
        //   512: aload           6
        //   514: invokevirtual   de/me/death/a.readDouble:()D
        //   517: putfield        de/me/death/r.f:D
        //   520: aload_0        
        //   521: aload           6
        //   523: invokevirtual   de/me/death/a.readDouble:()D
        //   526: putfield        de/me/death/r.g:D
        //   529: aload_0        
        //   530: aload           6
        //   532: invokevirtual   de/me/death/a.readDouble:()D
        //   535: putfield        de/me/death/r.h:D
        //   538: aload_0        
        //   539: aload           6
        //   541: invokevirtual   de/me/death/a.readFloat:()F
        //   544: putfield        de/me/death/r.j:F
        //   547: aload_0        
        //   548: aload           6
        //   550: invokevirtual   de/me/death/a.readFloat:()F
        //   553: putfield        de/me/death/r.k:F
        //   556: aload           6
        //   558: invokevirtual   de/me/death/a.readByte:()B
        //   561: pop            
        //   562: aload_0        
        //   563: aload           6
        //   565: invokevirtual   de/me/death/r.a:(Ljava/io/InputStream;)I
        //   568: istore          5
        //   570: aload_0        
        //   571: iload           5
        //   573: aload_2        
        //   574: invokespecial   de/me/death/r.a:(ILjava/io/DataOutputStream;)V
        //   577: aload_0        
        //   578: iload           11
        //   580: ifne            407
        //   583: aload_2        
        //   584: iconst_1       
        //   585: invokevirtual   de/me/death/r.b:(Ljava/io/DataOutputStream;Z)V
        //   588: aload_0        
        //   589: new             Ljava/lang/StringBuilder;
        //   592: dup            
        //   593: ldc             "[Bot: "
        //   595: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   598: aload_0        
        //   599: getfield        de/me/death/r.b:Ljava/lang/String;
        //   602: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   605: ldc             " Joined The Server!]"
        //   607: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   610: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   613: iconst_0       
        //   614: invokevirtual   de/me/death/r.a:(Ljava/lang/String;Z)V
        //   617: aload_0        
        //   618: getfield        de/me/death/r.c:Lde/me/death/g;
        //   621: invokevirtual   de/me/death/g.h:()Z
        //   624: iload           11
        //   626: ifne            653
        //   629: ifeq            646
        //   632: goto            636
        //   635: athrow         
        //   636: aload_0        
        //   637: aload_2        
        //   638: iconst_1       
        //   639: invokevirtual   de/me/death/r.a:(Ljava/io/DataOutputStream;Z)V
        //   642: goto            646
        //   645: athrow         
        //   646: aload_0        
        //   647: getfield        de/me/death/r.c:Lde/me/death/g;
        //   650: invokevirtual   de/me/death/g.g:()Z
        //   653: iload           11
        //   655: ifne            827
        //   658: ifeq            820
        //   661: goto            665
        //   664: athrow         
        //   665: aload_0        
        //   666: getfield        de/me/death/r.c:Lde/me/death/g;
        //   669: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   672: iload           11
        //   674: ifne            724
        //   677: goto            681
        //   680: athrow         
        //   681: ifnull          708
        //   684: goto            688
        //   687: athrow         
        //   688: aload_0        
        //   689: aload_0        
        //   690: getfield        de/me/death/r.c:Lde/me/death/g;
        //   693: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   696: aload_2        
        //   697: iconst_1       
        //   698: sipush          1000
        //   701: invokevirtual   de/me/death/r.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   704: goto            708
        //   707: athrow         
        //   708: aload_0        
        //   709: iload           11
        //   711: ifne            728
        //   714: getfield        de/me/death/r.c:Lde/me/death/g;
        //   717: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   720: goto            724
        //   723: athrow         
        //   724: ifnull          743
        //   727: aload_0        
        //   728: aload_0        
        //   729: getfield        de/me/death/r.c:Lde/me/death/g;
        //   732: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   735: aload_2        
        //   736: iconst_1       
        //   737: sipush          1000
        //   740: invokevirtual   de/me/death/r.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   743: iconst_0       
        //   744: istore          5
        //   746: iload           11
        //   748: ifeq            808
        //   751: aload_0        
        //   752: getfield        de/me/death/r.c:Lde/me/death/g;
        //   755: invokevirtual   de/me/death/g.k:()Ljava/lang/String;
        //   758: ldc             ";"
        //   760: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   763: dup            
        //   764: astore          9
        //   766: arraylength    
        //   767: istore          8
        //   769: iconst_0       
        //   770: istore          7
        //   772: iload           11
        //   774: ifeq            798
        //   777: aload           9
        //   779: iload           7
        //   781: aaload         
        //   782: astore          6
        //   784: aload_0        
        //   785: aload           6
        //   787: aload_2        
        //   788: iconst_1       
        //   789: sipush          200
        //   792: invokevirtual   de/me/death/r.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   795: iinc            7, 1
        //   798: iload           7
        //   800: iload           8
        //   802: if_icmplt       777
        //   805: iinc            5, 1
        //   808: iload           5
        //   810: aload_0        
        //   811: getfield        de/me/death/r.c:Lde/me/death/g;
        //   814: invokevirtual   de/me/death/g.o:()I
        //   817: if_icmplt       751
        //   820: aload_0        
        //   821: getfield        de/me/death/r.c:Lde/me/death/g;
        //   824: invokevirtual   de/me/death/g.f:()Z
        //   827: iload           11
        //   829: ifne            859
        //   832: ifeq            1073
        //   835: goto            839
        //   838: athrow         
        //   839: aload_0        
        //   840: iload           11
        //   842: ifne            906
        //   845: goto            849
        //   848: athrow         
        //   849: getfield        de/me/death/r.c:Lde/me/death/g;
        //   852: invokevirtual   de/me/death/g.p:()I
        //   855: goto            859
        //   858: athrow         
        //   859: bipush          30
        //   861: if_icmpgt       901
        //   864: aload_0        
        //   865: getfield        de/me/death/r.e:I
        //   868: iload           11
        //   870: ifne            892
        //   873: goto            877
        //   876: athrow         
        //   877: iflt            1073
        //   880: goto            884
        //   883: athrow         
        //   884: aload_0        
        //   885: getfield        de/me/death/r.e:I
        //   888: goto            892
        //   891: athrow         
        //   892: i2l            
        //   893: invokestatic    java/lang/Thread.sleep:(J)V
        //   896: iload           11
        //   898: ifeq            1073
        //   901: aload_0        
        //   902: goto            906
        //   905: athrow         
        //   906: aload_3        
        //   907: invokevirtual   de/me/death/r.a:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   910: astore          5
        //   912: aload           5
        //   914: ifnull          901
        //   917: aload           5
        //   919: getfield        de/me/death/a.a:I
        //   922: bipush          31
        //   924: iload           11
        //   926: ifne            975
        //   929: if_icmpne       968
        //   932: goto            936
        //   935: athrow         
        //   936: invokestatic    uiztfzghuzt/u.a:()Luiztfzghuzt/t;
        //   939: astore          6
        //   941: aload_0        
        //   942: bipush          11
        //   944: aload           6
        //   946: invokevirtual   de/me/death/r.a:(ILjava/io/DataOutput;)V
        //   949: aload_0        
        //   950: aload_0        
        //   951: aload           5
        //   953: invokevirtual   de/me/death/r.a:(Ljava/io/InputStream;)I
        //   956: aload           6
        //   958: invokevirtual   de/me/death/r.a:(ILjava/io/DataOutput;)V
        //   961: aload_0        
        //   962: aload           6
        //   964: aload_2        
        //   965: invokevirtual   de/me/death/r.a:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //   968: aload           5
        //   970: getfield        de/me/death/a.a:I
        //   973: bipush          26
        //   975: if_icmpne       901
        //   978: aload_0        
        //   979: aload           5
        //   981: invokevirtual   de/me/death/r.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   984: astore          7
        //   986: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   989: aload           7
        //   991: ldc             Luiztfzghuzt/fb;.class
        //   993: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   996: checkcast       Luiztfzghuzt/fb;
        //   999: astore          8
        //  1001: aload_0        
        //  1002: aload           8
        //  1004: invokevirtual   de/me/death/r.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //  1007: astore          6
        //  1009: iload           11
        //  1011: ifne            968
        //  1014: goto            1034
        //  1017: astore          8
        //  1019: aload           7
        //  1021: iconst_1       
        //  1022: aload           7
        //  1024: invokevirtual   java/lang/String.length:()I
        //  1027: iconst_1       
        //  1028: isub           
        //  1029: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1032: astore          6
        //  1034: aload_0        
        //  1035: new             Ljava/lang/StringBuilder;
        //  1038: dup            
        //  1039: ldc             "[Bot: "
        //  1041: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1044: aload_0        
        //  1045: getfield        de/me/death/r.b:Ljava/lang/String;
        //  1048: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1051: ldc             " Got Kicked!: "
        //  1053: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1056: aload           6
        //  1058: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1061: ldc             "]"
        //  1063: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1066: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1069: iconst_1       
        //  1070: invokevirtual   de/me/death/r.a:(Ljava/lang/String;Z)V
        //  1073: aload_1        
        //  1074: invokevirtual   java/net/Socket.close:()V
        //  1077: goto            1092
        //  1080: astore_2       
        //  1081: aload_0        
        //  1082: getfield        de/me/death/r.l:Lde/me/death/ab;
        //  1085: invokevirtual   de/me/death/ab.a:()V
        //  1088: aload_1        
        //  1089: invokevirtual   java/net/Socket.close:()V
        //  1092: return         
        //    StackMapTable: 00 57 FF 00 17 00 0C 07 00 02 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 12 00 46 07 00 12 00 43 07 00 1C 2A FF 00 15 00 0C 07 00 02 07 00 3E 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 29 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 00 01 00 00 FF 00 35 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 07 00 76 00 00 00 00 01 00 01 07 00 12 FF 00 15 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 07 00 76 07 01 08 00 00 00 01 00 00 FF 00 1B 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 00 01 00 00 44 01 4B 07 00 12 00 07 FF 00 05 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 00 01 00 02 01 01 4A 07 00 12 00 07 4C 07 00 12 40 01 43 07 00 12 FF 00 00 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 00 01 00 02 01 01 4A 07 00 12 FF 00 00 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 00 01 00 00 41 01 56 07 00 12 00 46 01 4A 07 00 12 00 FF 00 1D 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 07 00 5D 00 00 00 00 01 00 01 07 00 12 00 40 07 00 02 FF 00 20 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 07 00 5D 07 00 76 00 00 00 01 00 01 07 00 12 FF 00 20 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 07 00 5D 07 00 76 07 00 76 07 01 08 00 01 00 00 FF 00 1B 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 07 00 5D 00 00 00 00 01 00 00 FF 00 06 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 07 00 5D 00 00 00 00 01 00 02 01 01 FF 00 4F 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 00 01 00 00 63 01 4A 07 00 12 00 48 07 00 12 00 46 01 4A 07 00 12 00 4E 07 00 12 40 07 00 76 45 07 00 12 00 52 07 00 12 00 4E 07 00 12 40 07 00 76 43 07 00 02 0E FF 00 07 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 00 00 00 00 00 01 00 00 FF 00 19 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 00 01 01 07 01 09 00 01 00 00 14 FF 00 09 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 00 00 00 00 00 01 00 00 FF 00 0B 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 00 01 00 00 46 01 4A 07 00 12 00 48 07 00 12 40 07 00 02 48 07 00 12 40 01 50 07 00 12 40 01 45 07 00 12 00 46 07 00 12 40 01 08 43 07 00 12 40 07 00 02 FF 00 1C 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 00 01 00 01 07 00 12 00 1F FF 00 06 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 00 01 00 02 01 01 FF 00 29 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 07 00 76 00 00 00 01 00 01 07 00 12 FF 00 10 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 07 00 76 07 00 76 07 01 08 00 00 01 00 00 FF 00 26 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 00 01 00 00 FF 00 06 00 0C 07 00 02 07 00 3E 00 00 00 00 00 00 00 00 00 01 00 01 07 00 12 FF 00 0B 00 0C 07 00 02 07 00 3E 07 01 08 00 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  14     28     31     32     Ljava/lang/Exception;
        //  5      20     23     24     Ljava/lang/Exception;
        //  171    194    197    219    Ljava/lang/Exception;
        //  414    437    440    473    Ljava/lang/Exception;
        //  986    1009   1017   1034   Ljava/lang/Exception;
        //  101    246    1080   1092   Ljava/lang/Exception;
        //  252    261    264    265    Ljava/lang/Exception;
        //  247    272    1080   1092   Ljava/lang/Exception;
        //  387    402    405    406    Ljava/lang/Exception;
        //  363    371    374    375    Ljava/lang/Exception;
        //  344    352    355    356    Ljava/lang/Exception;
        //  318    326    329    330    Ljava/lang/Exception;
        //  299    314    317    318    Ljava/lang/Exception;
        //  294    309    312    313    Ljava/lang/Exception;
        //  279    287    290    291    Ljava/lang/Exception;
        //  273    500    1080   1092   Ljava/lang/Exception;
        //  917    932    935    936    Ljava/lang/Exception;
        //  892    902    905    906    Ljava/lang/Exception;
        //  877    888    891    892    Ljava/lang/Exception;
        //  864    880    883    884    Ljava/lang/Exception;
        //  859    873    876    877    Ljava/lang/Exception;
        //  839    855    858    859    Ljava/lang/Exception;
        //  832    845    848    849    Ljava/lang/Exception;
        //  827    835    838    839    Ljava/lang/Exception;
        //  708    720    723    724    Ljava/lang/Exception;
        //  681    704    707    708    Ljava/lang/Exception;
        //  665    684    687    688    Ljava/lang/Exception;
        //  658    677    680    681    Ljava/lang/Exception;
        //  653    661    664    665    Ljava/lang/Exception;
        //  629    642    645    646    Ljava/lang/Exception;
        //  624    632    635    636    Ljava/lang/Exception;
        //  501    1077   1080   1092   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0299:
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
    
    private void a(final int n, final DataOutputStream dataOutputStream) {
        final t a = u.a();
        this.a(0, a);
        this.a(n, a);
        this.a(a, dataOutputStream);
    }
    
    @Override
    protected void b(final DataOutputStream dataOutputStream, final boolean b) {
        int m = de.me.death.l.m;
        final t a = u.a();
        Label_0108: {
            Label_0094: {
                try {
                    this.a(13, a);
                    a.writeDouble(this.f - 0.15);
                    a.writeDouble(this.g);
                    a.writeDouble(this.h + 0.15);
                    a.writeFloat(this.j);
                    a.writeFloat(this.k);
                    a.writeBoolean(false);
                    if (m != 0) {
                        break Label_0108;
                    }
                    final boolean b2 = b;
                    if (b2) {
                        break Label_0094;
                    }
                    break Label_0094;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    final boolean b2 = b;
                    if (b2) {
                        this.a(a, dataOutputStream);
                        return;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            this.b(a, dataOutputStream);
            try {
                if (nb.a) {
                    de.me.death.l.m = ++m;
                }
            }
            catch (kg kg3) {
                throw kg3;
            }
        }
    }
    
    @Override
    public void a(final DataOutputStream p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: invokestatic    uiztfzghuzt/u.a:()Luiztfzghuzt/t;
        //     8: astore_3       
        //     9: aload_0        
        //    10: iconst_3       
        //    11: aload_3        
        //    12: invokevirtual   de/me/death/r.a:(ILjava/io/DataOutput;)V
        //    15: aload_0        
        //    16: iconst_2       
        //    17: aload_3        
        //    18: invokevirtual   de/me/death/r.a:(ILjava/io/DataOutput;)V
        //    21: iload           4
        //    23: ifne            59
        //    26: iload_2        
        //    27: ifeq            49
        //    30: goto            34
        //    33: athrow         
        //    34: aload_0        
        //    35: aload_3        
        //    36: aload_1        
        //    37: invokevirtual   de/me/death/r.a:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //    40: iload           4
        //    42: ifeq            63
        //    45: goto            49
        //    48: athrow         
        //    49: aload_0        
        //    50: aload_3        
        //    51: aload_1        
        //    52: invokevirtual   de/me/death/r.b:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //    55: goto            59
        //    58: athrow         
        //    59: goto            63
        //    62: astore_3       
        //    63: return         
        //    StackMapTable: 00 08 FF 00 21 00 05 07 00 02 07 00 43 01 07 01 0F 01 00 01 07 01 23 00 4D 07 01 23 00 48 07 01 23 00 FF 00 02 00 05 07 00 02 07 00 43 01 00 01 00 01 07 01 23 FF 00 00 00 05 07 00 02 07 00 43 01 07 01 08 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  34     55     58     59     Ljava/io/IOException;
        //  26     45     48     49     Ljava/io/IOException;
        //  9      30     33     34     Ljava/io/IOException;
        //  5      59     62     63     Ljava/io/IOException;
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
    
    @Override
    public void a(final String p0, final DataOutputStream p1, final boolean p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          8
        //     5: aload_1        
        //     6: astore          5
        //     8: iload           8
        //    10: ifeq            46
        //    13: new             Ljava/util/Random;
        //    16: dup            
        //    17: invokespecial   java/util/Random.<init>:()V
        //    20: astore          6
        //    22: aload           6
        //    24: bipush          45
        //    26: invokevirtual   java/util/Random.nextInt:(I)I
        //    29: istore          7
        //    31: aload           5
        //    33: ldc_w           "#"
        //    36: iload           7
        //    38: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    41: invokevirtual   java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    44: astore          5
        //    46: aload           5
        //    48: ldc_w           "#"
        //    51: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    54: ifne            13
        //    57: invokestatic    uiztfzghuzt/u.a:()Luiztfzghuzt/t;
        //    60: astore          6
        //    62: aload_0        
        //    63: iconst_2       
        //    64: aload           6
        //    66: invokevirtual   de/me/death/r.a:(ILjava/io/DataOutput;)V
        //    69: aload_0        
        //    70: aload           5
        //    72: aload           6
        //    74: invokevirtual   de/me/death/r.a:(Ljava/lang/String;Ljava/io/DataOutput;)V
        //    77: iload           8
        //    79: ifne            121
        //    82: iload_3        
        //    83: ifeq            108
        //    86: goto            90
        //    89: athrow         
        //    90: aload_0        
        //    91: aload           6
        //    93: aload_2        
        //    94: iload           4
        //    96: invokevirtual   de/me/death/r.a:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;I)V
        //    99: iload           8
        //   101: ifeq            126
        //   104: goto            108
        //   107: athrow         
        //   108: aload_0        
        //   109: aload           6
        //   111: aload_2        
        //   112: iload           4
        //   114: invokevirtual   de/me/death/r.b:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;I)V
        //   117: goto            121
        //   120: athrow         
        //   121: goto            126
        //   124: astore          5
        //   126: return         
        //    StackMapTable: 00 0A FF 00 0D 00 09 07 00 02 07 00 76 07 00 43 01 01 07 00 76 00 00 01 00 00 20 FF 00 2A 00 09 07 00 02 07 00 76 07 00 43 01 01 07 00 76 07 01 0F 00 01 00 01 07 00 12 00 50 07 00 12 00 4B 07 00 12 00 FF 00 02 00 09 07 00 02 07 00 76 07 00 43 01 01 00 00 00 01 00 01 07 00 12 FF 00 01 00 09 07 00 02 07 00 76 07 00 43 01 01 07 01 08 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  90     117    120    121    Ljava/lang/Exception;
        //  82     104    107    108    Ljava/lang/Exception;
        //  62     86     89     90     Ljava/lang/Exception;
        //  5      121    124    126    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0090:
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
    public String toString() {
        return "1.8.0-1.8.9";
    }
    
    static {
        final String[] array = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "\u0016X\r\u0011\u0015\nG\u001b\u0007\u000b\u001e";
        int n6 = -1;
        String intern = null;
    Label_0119_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0194: {
                    if (n7 > 1) {
                        break Label_0194;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = '\'';
                                break;
                            }
                            case 1: {
                                c2 = 'v';
                                break;
                            }
                            case 2: {
                                c2 = '5';
                                break;
                            }
                            case 3: {
                                c2 = '?';
                                break;
                            }
                            default: {
                                c2 = '%';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n9;
                    } while (n7 == 0);
                }
                if (n7 > n9) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n6) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 1))));
                    s = "\u0007<ZVKB\u0012\u0015kMBVfZWQ\u0013G\u001ex";
                    n6 = 0;
                    continue Label_0119_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "|4ZK\u001f\u0007";
                    n6 = 1;
                    continue Label_0119_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "|4ZK\u001f\u0007\"]VV\u0007\u0005PMSB\u0004\u0015VV\u0007\u0017[\u001fUU\u0013XVPJVFZWQ\u0013G\u001ex";
                    n6 = 2;
                    continue Label_0119_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "\u00071ZK\u0005l\u001fVT@CW\u000f\u001f";
                    n6 = 3;
                    continue Label_0119_Outer;
                }
                case 3: {
                    break Label_0119_Outer;
                }
            }
        }
        array[n5] = intern;
        z = new String[] { "1.8.0-1.8.9", " Joined The Server!]", "[Bot: ", "[Bot: This server is an premium server!]", " Got Kicked!: " };
    }
}
