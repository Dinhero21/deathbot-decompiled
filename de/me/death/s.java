// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.t;
import uiztfzghuzt.nb;
import uiztfzghuzt.kg;
import java.io.DataOutput;
import uiztfzghuzt.u;
import java.io.DataOutputStream;

public class s extends l
{
    private static final String[] z;
    
    public s(final String s, final ab ab, final g g) {
        super(s, ab, g);
        this.i = new int[] { 0, 1, 2, 3, 27, 46, 33, 70 };
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
        //     6: getfield        de/me/death/s.c:Lde/me/death/g;
        //     9: iload           10
        //    11: ifne            36
        //    14: invokevirtual   de/me/death/g.i:()Z
        //    17: ifeq            32
        //    20: goto            24
        //    23: athrow         
        //    24: aload_0        
        //    25: invokevirtual   de/me/death/s.b:()V
        //    28: goto            32
        //    31: athrow         
        //    32: aload_0        
        //    33: getfield        de/me/death/s.c:Lde/me/death/g;
        //    36: invokevirtual   de/me/death/g.r:()Lde/me/death/b;
        //    39: getstatic       de/me/death/b.NONE:Lde/me/death/b;
        //    42: if_acmpeq       79
        //    45: new             Lde/me/death/hb;
        //    48: dup            
        //    49: aload_0        
        //    50: getfield        de/me/death/s.c:Lde/me/death/g;
        //    53: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //    56: aload_0        
        //    57: getfield        de/me/death/s.c:Lde/me/death/g;
        //    60: invokevirtual   de/me/death/g.n:()I
        //    63: aload_0        
        //    64: getfield        de/me/death/s.l:Lde/me/death/ab;
        //    67: sipush          5000
        //    70: invokespecial   de/me/death/hb.<init>:(Ljava/lang/String;ILde/me/death/ab;I)V
        //    73: astore_1       
        //    74: iload           10
        //    76: ifeq            101
        //    79: new             Ljava/net/Socket;
        //    82: dup            
        //    83: aload_0        
        //    84: getfield        de/me/death/s.c:Lde/me/death/g;
        //    87: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //    90: aload_0        
        //    91: getfield        de/me/death/s.c:Lde/me/death/g;
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
        //   127: invokevirtual   de/me/death/s.a:(Ljava/io/DataOutputStream;)V
        //   130: aload_0        
        //   131: aload_2        
        //   132: invokevirtual   de/me/death/s.b:(Ljava/io/DataOutputStream;)V
        //   135: iconst_0       
        //   136: istore          4
        //   138: iload           10
        //   140: ifeq            330
        //   143: aload_0        
        //   144: aload_3        
        //   145: invokevirtual   de/me/death/s.a:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   148: astore          5
        //   150: aload           5
        //   152: getfield        de/me/death/a.a:I
        //   155: iload           10
        //   157: ifne            252
        //   160: ifne            247
        //   163: aload_0        
        //   164: aload           5
        //   166: invokevirtual   de/me/death/s.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   169: astore          6
        //   171: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   174: aload           6
        //   176: ldc             Luiztfzghuzt/fb;.class
        //   178: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   181: checkcast       Luiztfzghuzt/fb;
        //   184: astore          7
        //   186: aload_0        
        //   187: aload           7
        //   189: invokevirtual   de/me/death/s.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
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
        //   243: invokevirtual   de/me/death/s.a:(Ljava/lang/String;Z)V
        //   246: return         
        //   247: aload           5
        //   249: getfield        de/me/death/a.a:I
        //   252: iconst_1       
        //   253: iload           10
        //   255: ifne            279
        //   258: if_icmpne       273
        //   261: goto            265
        //   264: athrow         
        //   265: aload_0        
        //   266: ldc             "[Bot: This server is an premium server!]"
        //   268: iconst_1       
        //   269: invokevirtual   de/me/death/s.a:(Ljava/lang/String;Z)V
        //   272: return         
        //   273: aload           5
        //   275: getfield        de/me/death/a.a:I
        //   278: iconst_2       
        //   279: iload           10
        //   281: ifne            318
        //   284: if_icmpne       299
        //   287: goto            291
        //   290: athrow         
        //   291: iconst_1       
        //   292: istore          4
        //   294: iload           10
        //   296: ifeq            330
        //   299: aload           5
        //   301: getfield        de/me/death/a.a:I
        //   304: iload           10
        //   306: ifne            332
        //   309: goto            313
        //   312: athrow         
        //   313: iconst_3       
        //   314: goto            318
        //   317: athrow         
        //   318: if_icmpne       330
        //   321: aload_0        
        //   322: iconst_1       
        //   323: putfield        de/me/death/s.d:Z
        //   326: goto            330
        //   329: athrow         
        //   330: iload           4
        //   332: ifeq            143
        //   335: aload_0        
        //   336: getfield        de/me/death/s.d:Z
        //   339: iload           10
        //   341: ifne            332
        //   344: iload           10
        //   346: ifne            363
        //   349: ifeq            143
        //   352: goto            356
        //   355: athrow         
        //   356: aload_0        
        //   357: getfield        de/me/death/s.c:Lde/me/death/g;
        //   360: invokevirtual   de/me/death/g.j:()Z
        //   363: iload           10
        //   365: ifne            603
        //   368: ifeq            567
        //   371: goto            375
        //   374: athrow         
        //   375: aload_0        
        //   376: aload_3        
        //   377: invokevirtual   de/me/death/s.a:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   380: astore          5
        //   382: aload           5
        //   384: ifnull          375
        //   387: aload           5
        //   389: getfield        de/me/death/a.a:I
        //   392: bipush          27
        //   394: iload           10
        //   396: ifne            508
        //   399: if_icmpne       501
        //   402: goto            406
        //   405: athrow         
        //   406: aload_0        
        //   407: aload           5
        //   409: invokevirtual   de/me/death/s.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   412: astore          6
        //   414: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   417: aload           6
        //   419: ldc             Luiztfzghuzt/fb;.class
        //   421: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   424: checkcast       Luiztfzghuzt/fb;
        //   427: astore          8
        //   429: aload_0        
        //   430: aload           8
        //   432: invokevirtual   de/me/death/s.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //   435: astore          7
        //   437: goto            473
        //   440: astore          8
        //   442: aload           6
        //   444: aload           6
        //   446: ldc             "\""
        //   448: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   451: iconst_1       
        //   452: iadd           
        //   453: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   456: astore          9
        //   458: aload           9
        //   460: iconst_0       
        //   461: aload           9
        //   463: ldc             "\""
        //   465: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   468: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   471: astore          7
        //   473: aload_0        
        //   474: new             Ljava/lang/StringBuilder;
        //   477: dup            
        //   478: ldc             "[Bot: "
        //   480: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   483: aload           7
        //   485: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   488: ldc             "]"
        //   490: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   493: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   496: iconst_1       
        //   497: invokevirtual   de/me/death/s.a:(Ljava/lang/String;Z)V
        //   500: return         
        //   501: aload           5
        //   503: getfield        de/me/death/a.a:I
        //   506: bipush          70
        //   508: if_icmpne       375
        //   511: aload_0        
        //   512: aload           5
        //   514: invokevirtual   de/me/death/a.readDouble:()D
        //   517: putfield        de/me/death/s.f:D
        //   520: aload_0        
        //   521: aload           5
        //   523: invokevirtual   de/me/death/a.readDouble:()D
        //   526: putfield        de/me/death/s.g:D
        //   529: aload_0        
        //   530: aload           5
        //   532: invokevirtual   de/me/death/a.readDouble:()D
        //   535: putfield        de/me/death/s.h:D
        //   538: aload_0        
        //   539: aload           5
        //   541: invokevirtual   de/me/death/a.readFloat:()F
        //   544: putfield        de/me/death/s.j:F
        //   547: aload_0        
        //   548: aload           5
        //   550: invokevirtual   de/me/death/a.readFloat:()F
        //   553: putfield        de/me/death/s.k:F
        //   556: aload_0        
        //   557: iload           10
        //   559: ifne            407
        //   562: aload_2        
        //   563: iconst_1       
        //   564: invokevirtual   de/me/death/s.b:(Ljava/io/DataOutputStream;Z)V
        //   567: aload_0        
        //   568: new             Ljava/lang/StringBuilder;
        //   571: dup            
        //   572: ldc             "[Bot: "
        //   574: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   577: aload_0        
        //   578: getfield        de/me/death/s.b:Ljava/lang/String;
        //   581: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   584: ldc             " Joined The Server!]"
        //   586: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   589: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   592: iconst_0       
        //   593: invokevirtual   de/me/death/s.a:(Ljava/lang/String;Z)V
        //   596: aload_0        
        //   597: getfield        de/me/death/s.c:Lde/me/death/g;
        //   600: invokevirtual   de/me/death/g.h:()Z
        //   603: iload           10
        //   605: ifne            632
        //   608: ifeq            625
        //   611: goto            615
        //   614: athrow         
        //   615: aload_0        
        //   616: aload_2        
        //   617: iconst_1       
        //   618: invokevirtual   de/me/death/s.a:(Ljava/io/DataOutputStream;Z)V
        //   621: goto            625
        //   624: athrow         
        //   625: aload_0        
        //   626: getfield        de/me/death/s.c:Lde/me/death/g;
        //   629: invokevirtual   de/me/death/g.g:()Z
        //   632: iload           10
        //   634: ifne            806
        //   637: ifeq            799
        //   640: goto            644
        //   643: athrow         
        //   644: aload_0        
        //   645: getfield        de/me/death/s.c:Lde/me/death/g;
        //   648: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   651: iload           10
        //   653: ifne            703
        //   656: goto            660
        //   659: athrow         
        //   660: ifnull          687
        //   663: goto            667
        //   666: athrow         
        //   667: aload_0        
        //   668: aload_0        
        //   669: getfield        de/me/death/s.c:Lde/me/death/g;
        //   672: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   675: aload_2        
        //   676: iconst_1       
        //   677: sipush          1000
        //   680: invokevirtual   de/me/death/s.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   683: goto            687
        //   686: athrow         
        //   687: aload_0        
        //   688: iload           10
        //   690: ifne            707
        //   693: getfield        de/me/death/s.c:Lde/me/death/g;
        //   696: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   699: goto            703
        //   702: athrow         
        //   703: ifnull          722
        //   706: aload_0        
        //   707: aload_0        
        //   708: getfield        de/me/death/s.c:Lde/me/death/g;
        //   711: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   714: aload_2        
        //   715: iconst_1       
        //   716: sipush          1000
        //   719: invokevirtual   de/me/death/s.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   722: iconst_0       
        //   723: istore          5
        //   725: iload           10
        //   727: ifeq            787
        //   730: aload_0        
        //   731: getfield        de/me/death/s.c:Lde/me/death/g;
        //   734: invokevirtual   de/me/death/g.k:()Ljava/lang/String;
        //   737: ldc             ";"
        //   739: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   742: dup            
        //   743: astore          9
        //   745: arraylength    
        //   746: istore          8
        //   748: iconst_0       
        //   749: istore          7
        //   751: iload           10
        //   753: ifeq            777
        //   756: aload           9
        //   758: iload           7
        //   760: aaload         
        //   761: astore          6
        //   763: aload_0        
        //   764: aload           6
        //   766: aload_2        
        //   767: iconst_1       
        //   768: sipush          200
        //   771: invokevirtual   de/me/death/s.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   774: iinc            7, 1
        //   777: iload           7
        //   779: iload           8
        //   781: if_icmplt       756
        //   784: iinc            5, 1
        //   787: iload           5
        //   789: aload_0        
        //   790: getfield        de/me/death/s.c:Lde/me/death/g;
        //   793: invokevirtual   de/me/death/g.o:()I
        //   796: if_icmplt       730
        //   799: aload_0        
        //   800: getfield        de/me/death/s.c:Lde/me/death/g;
        //   803: invokevirtual   de/me/death/g.f:()Z
        //   806: iload           10
        //   808: ifne            838
        //   811: ifeq            1052
        //   814: goto            818
        //   817: athrow         
        //   818: aload_0        
        //   819: iload           10
        //   821: ifne            885
        //   824: goto            828
        //   827: athrow         
        //   828: getfield        de/me/death/s.c:Lde/me/death/g;
        //   831: invokevirtual   de/me/death/g.p:()I
        //   834: goto            838
        //   837: athrow         
        //   838: bipush          30
        //   840: if_icmpgt       880
        //   843: aload_0        
        //   844: getfield        de/me/death/s.e:I
        //   847: iload           10
        //   849: ifne            871
        //   852: goto            856
        //   855: athrow         
        //   856: iflt            1052
        //   859: goto            863
        //   862: athrow         
        //   863: aload_0        
        //   864: getfield        de/me/death/s.e:I
        //   867: goto            871
        //   870: athrow         
        //   871: i2l            
        //   872: invokestatic    java/lang/Thread.sleep:(J)V
        //   875: iload           10
        //   877: ifeq            1052
        //   880: aload_0        
        //   881: goto            885
        //   884: athrow         
        //   885: aload_3        
        //   886: invokevirtual   de/me/death/s.a:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   889: astore          5
        //   891: aload           5
        //   893: ifnull          880
        //   896: aload           5
        //   898: getfield        de/me/death/a.a:I
        //   901: bipush          33
        //   903: iload           10
        //   905: ifne            954
        //   908: if_icmpne       947
        //   911: goto            915
        //   914: athrow         
        //   915: invokestatic    uiztfzghuzt/u.a:()Luiztfzghuzt/t;
        //   918: astore          6
        //   920: aload_0        
        //   921: bipush          11
        //   923: aload           6
        //   925: invokevirtual   de/me/death/s.a:(ILjava/io/DataOutput;)V
        //   928: aload_0        
        //   929: aload_0        
        //   930: aload           5
        //   932: invokevirtual   de/me/death/s.a:(Ljava/io/InputStream;)I
        //   935: aload           6
        //   937: invokevirtual   de/me/death/s.a:(ILjava/io/DataOutput;)V
        //   940: aload_0        
        //   941: aload           6
        //   943: aload_2        
        //   944: invokevirtual   de/me/death/s.a:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //   947: aload           5
        //   949: getfield        de/me/death/a.a:I
        //   952: bipush          27
        //   954: if_icmpne       880
        //   957: aload_0        
        //   958: aload           5
        //   960: invokevirtual   de/me/death/s.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   963: astore          7
        //   965: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   968: aload           7
        //   970: ldc             Luiztfzghuzt/fb;.class
        //   972: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   975: checkcast       Luiztfzghuzt/fb;
        //   978: astore          8
        //   980: aload_0        
        //   981: aload           8
        //   983: invokevirtual   de/me/death/s.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //   986: astore          6
        //   988: iload           10
        //   990: ifne            947
        //   993: goto            1013
        //   996: astore          8
        //   998: aload           7
        //  1000: iconst_1       
        //  1001: aload           7
        //  1003: invokevirtual   java/lang/String.length:()I
        //  1006: iconst_1       
        //  1007: isub           
        //  1008: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1011: astore          6
        //  1013: aload_0        
        //  1014: new             Ljava/lang/StringBuilder;
        //  1017: dup            
        //  1018: ldc             "[Bot: "
        //  1020: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1023: aload_0        
        //  1024: getfield        de/me/death/s.b:Ljava/lang/String;
        //  1027: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1030: ldc             " Got Kicked!: "
        //  1032: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1035: aload           6
        //  1037: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1040: ldc             "]"
        //  1042: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1045: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1048: iconst_1       
        //  1049: invokevirtual   de/me/death/s.a:(Ljava/lang/String;Z)V
        //  1052: aload_1        
        //  1053: invokevirtual   java/net/Socket.close:()V
        //  1056: goto            1071
        //  1059: astore_2       
        //  1060: aload_0        
        //  1061: getfield        de/me/death/s.l:Lde/me/death/ab;
        //  1064: invokevirtual   de/me/death/ab.a:()V
        //  1067: aload_1        
        //  1068: invokevirtual   java/net/Socket.close:()V
        //  1071: return         
        //    StackMapTable: 00 57 FF 00 17 00 0B 07 00 02 00 00 00 00 00 00 00 00 00 01 00 01 07 00 12 00 46 07 00 12 00 43 07 00 1C 2A FF 00 15 00 0B 07 00 02 07 00 3E 00 00 00 00 00 00 00 00 01 00 00 FF 00 29 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 01 00 00 FF 00 35 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 07 00 76 00 00 00 01 00 01 07 00 12 FF 00 15 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 07 00 76 07 01 01 00 00 01 00 00 FF 00 1B 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 01 00 00 44 01 4B 07 00 12 00 07 FF 00 05 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 01 00 02 01 01 4A 07 00 12 00 07 4C 07 00 12 40 01 43 07 00 12 FF 00 00 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 01 00 02 01 01 4A 07 00 12 FF 00 00 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 01 00 00 41 01 56 07 00 12 00 46 01 4A 07 00 12 00 FF 00 1D 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 01 00 01 07 00 12 00 40 07 00 02 FF 00 20 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 07 00 76 00 00 00 01 00 01 07 00 12 FF 00 20 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 07 00 76 07 00 76 07 01 01 00 01 00 00 FF 00 1B 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 01 00 00 FF 00 06 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 01 00 02 01 01 FF 00 3A 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 01 00 00 63 01 4A 07 00 12 00 48 07 00 12 00 46 01 4A 07 00 12 00 4E 07 00 12 40 07 00 76 45 07 00 12 00 52 07 00 12 00 4E 07 00 12 40 07 00 76 43 07 00 02 0E FF 00 07 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 00 00 00 00 01 00 00 FF 00 19 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 00 01 01 07 01 02 01 00 00 14 FF 00 09 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 00 00 00 00 01 00 00 FF 00 0B 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 01 00 00 46 01 4A 07 00 12 00 48 07 00 12 40 07 00 02 48 07 00 12 40 01 50 07 00 12 40 01 45 07 00 12 00 46 07 00 12 40 01 08 43 07 00 12 40 07 00 02 FF 00 1C 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 01 00 01 07 00 12 00 1F FF 00 06 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 01 00 02 01 01 FF 00 29 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 07 00 76 00 00 01 00 01 07 00 12 FF 00 10 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 07 00 76 07 00 76 07 01 01 00 01 00 00 FF 00 26 00 0B 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 01 00 00 FF 00 06 00 0B 07 00 02 07 00 3E 00 00 00 00 00 00 00 00 01 00 01 07 00 12 FF 00 0B 00 0B 07 00 02 07 00 3E 07 01 01 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  14     28     31     32     Ljava/lang/Exception;
        //  5      20     23     24     Ljava/lang/Exception;
        //  171    194    197    219    Ljava/lang/Exception;
        //  414    437    440    473    Ljava/lang/Exception;
        //  965    988    996    1013   Ljava/lang/Exception;
        //  101    246    1059   1071   Ljava/lang/Exception;
        //  252    261    264    265    Ljava/lang/Exception;
        //  247    272    1059   1071   Ljava/lang/Exception;
        //  387    402    405    406    Ljava/lang/Exception;
        //  363    371    374    375    Ljava/lang/Exception;
        //  344    352    355    356    Ljava/lang/Exception;
        //  318    326    329    330    Ljava/lang/Exception;
        //  299    314    317    318    Ljava/lang/Exception;
        //  294    309    312    313    Ljava/lang/Exception;
        //  279    287    290    291    Ljava/lang/Exception;
        //  273    500    1059   1071   Ljava/lang/Exception;
        //  896    911    914    915    Ljava/lang/Exception;
        //  871    881    884    885    Ljava/lang/Exception;
        //  856    867    870    871    Ljava/lang/Exception;
        //  843    859    862    863    Ljava/lang/Exception;
        //  838    852    855    856    Ljava/lang/Exception;
        //  818    834    837    838    Ljava/lang/Exception;
        //  811    824    827    828    Ljava/lang/Exception;
        //  806    814    817    818    Ljava/lang/Exception;
        //  687    699    702    703    Ljava/lang/Exception;
        //  660    683    686    687    Ljava/lang/Exception;
        //  644    663    666    667    Ljava/lang/Exception;
        //  637    656    659    660    Ljava/lang/Exception;
        //  632    640    643    644    Ljava/lang/Exception;
        //  608    621    624    625    Ljava/lang/Exception;
        //  603    611    614    615    Ljava/lang/Exception;
        //  501    1056   1059   1071   Ljava/lang/Exception;
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
    
    @Override
    protected void b(final DataOutputStream dataOutputStream, final boolean b) {
        final int m = de.me.death.l.m;
        final t a = u.a();
        boolean a2 = false;
        Label_0129: {
            Label_0123: {
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
                        if (m == 0) {
                            return;
                        }
                        final boolean b3 = nb.a;
                        if (b3) {
                            break Label_0123;
                        }
                        break Label_0123;
                    }
                    catch (kg kg3) {
                        throw kg3;
                    }
                }
                try {
                    final boolean b3 = nb.a;
                    if (b3) {
                        a2 = false;
                        break Label_0129;
                    }
                }
                catch (kg kg4) {
                    throw kg4;
                }
            }
            a2 = true;
        }
        nb.a = a2;
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
        //    12: invokevirtual   de/me/death/s.a:(ILjava/io/DataOutput;)V
        //    15: aload_0        
        //    16: iconst_2       
        //    17: aload_3        
        //    18: invokevirtual   de/me/death/s.a:(ILjava/io/DataOutput;)V
        //    21: iload           4
        //    23: ifne            59
        //    26: iload_2        
        //    27: ifeq            49
        //    30: goto            34
        //    33: athrow         
        //    34: aload_0        
        //    35: aload_3        
        //    36: aload_1        
        //    37: invokevirtual   de/me/death/s.a:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //    40: iload           4
        //    42: ifeq            63
        //    45: goto            49
        //    48: athrow         
        //    49: aload_0        
        //    50: aload_3        
        //    51: aload_1        
        //    52: invokevirtual   de/me/death/s.b:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //    55: goto            59
        //    58: athrow         
        //    59: goto            63
        //    62: astore_3       
        //    63: return         
        //    StackMapTable: 00 08 FF 00 21 00 05 07 00 02 07 00 43 01 07 01 08 01 00 01 07 01 1C 00 4D 07 01 1C 00 48 07 01 1C 00 FF 00 02 00 05 07 00 02 07 00 43 01 00 01 00 01 07 01 1C FF 00 00 00 05 07 00 02 07 00 43 01 07 01 01 01 00 00
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
        //    66: invokevirtual   de/me/death/s.a:(ILjava/io/DataOutput;)V
        //    69: aload_0        
        //    70: aload           5
        //    72: aload           6
        //    74: invokevirtual   de/me/death/s.a:(Ljava/lang/String;Ljava/io/DataOutput;)V
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
        //    96: invokevirtual   de/me/death/s.a:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;I)V
        //    99: iload           8
        //   101: ifeq            126
        //   104: goto            108
        //   107: athrow         
        //   108: aload_0        
        //   109: aload           6
        //   111: aload_2        
        //   112: iload           4
        //   114: invokevirtual   de/me/death/s.b:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;I)V
        //   117: goto            121
        //   120: athrow         
        //   121: goto            126
        //   124: astore          5
        //   126: return         
        //    StackMapTable: 00 0A FF 00 0D 00 09 07 00 02 07 00 76 07 00 43 01 01 07 00 76 00 00 01 00 00 20 FF 00 2A 00 09 07 00 02 07 00 76 07 00 43 01 01 07 00 76 07 01 08 00 01 00 01 07 00 12 00 50 07 00 12 00 4B 07 00 12 00 FF 00 02 00 09 07 00 02 07 00 76 07 00 43 01 01 00 00 00 01 00 01 07 00 12 FF 00 01 00 09 07 00 02 07 00 76 07 00 43 01 01 07 01 01 00 00 01 00 00
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
        String s = "\u0010X\u000ea\u001b\fG\u0018w\u0005\u0018";
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
                                c2 = '!';
                                break;
                            }
                            case 1: {
                                c2 = 'v';
                                break;
                            }
                            case 2: {
                                c2 = '6';
                                break;
                            }
                            case 3: {
                                c2 = 'O';
                                break;
                            }
                            default: {
                                c2 = '+';
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
                    s = "z4Y;\u0011\u0001";
                    n6 = 0;
                    continue Label_0119_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "\u00011Y;\u000bj\u001fU$NEW\fo";
                    n6 = 1;
                    continue Label_0119_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "z4Y;\u0011\u0001\"^&X\u0001\u0005S=]D\u0004\u0016&X\u0001\u0017Xo[S\u0013[&^LVE*YW\u0013Dnv";
                    n6 = 2;
                    continue Label_0119_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "\u0001<Y&ED\u0012\u0016\u001bCDVe*YW\u0013Dnv";
                    n6 = 3;
                    continue Label_0119_Outer;
                }
                case 3: {
                    break Label_0119_Outer;
                }
            }
        }
        array[n5] = intern;
        z = new String[] { "1.8.0-1.8.9", "[Bot: ", " Got Kicked!: ", "[Bot: This server is an premium server!]", " Joined The Server!]" };
    }
}
