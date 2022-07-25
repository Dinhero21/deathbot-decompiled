// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.kg;
import uiztfzghuzt.t;
import java.io.DataOutput;
import uiztfzghuzt.u;
import java.io.DataOutputStream;

public class m extends l
{
    private static final String[] z;
    
    public m(final String s, final ab ab, final g g) {
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
        //     6: getfield        de/me/death/m.c:Lde/me/death/g;
        //     9: iload           11
        //    11: ifne            36
        //    14: invokevirtual   de/me/death/g.i:()Z
        //    17: ifeq            32
        //    20: goto            24
        //    23: athrow         
        //    24: aload_0        
        //    25: invokevirtual   de/me/death/m.b:()V
        //    28: goto            32
        //    31: astore_1       
        //    32: aload_0        
        //    33: getfield        de/me/death/m.c:Lde/me/death/g;
        //    36: invokevirtual   de/me/death/g.r:()Lde/me/death/b;
        //    39: getstatic       de/me/death/b.NONE:Lde/me/death/b;
        //    42: if_acmpeq       79
        //    45: new             Lde/me/death/hb;
        //    48: dup            
        //    49: aload_0        
        //    50: getfield        de/me/death/m.c:Lde/me/death/g;
        //    53: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //    56: aload_0        
        //    57: getfield        de/me/death/m.c:Lde/me/death/g;
        //    60: invokevirtual   de/me/death/g.n:()I
        //    63: aload_0        
        //    64: getfield        de/me/death/m.l:Lde/me/death/ab;
        //    67: sipush          5000
        //    70: invokespecial   de/me/death/hb.<init>:(Ljava/lang/String;ILde/me/death/ab;I)V
        //    73: astore_1       
        //    74: iload           11
        //    76: ifeq            101
        //    79: new             Ljava/net/Socket;
        //    82: dup            
        //    83: aload_0        
        //    84: getfield        de/me/death/m.c:Lde/me/death/g;
        //    87: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //    90: aload_0        
        //    91: getfield        de/me/death/m.c:Lde/me/death/g;
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
        //   127: invokevirtual   de/me/death/m.a:(Ljava/io/DataOutputStream;)V
        //   130: aload_0        
        //   131: aload_2        
        //   132: invokevirtual   de/me/death/m.b:(Ljava/io/DataOutputStream;)V
        //   135: iconst_0       
        //   136: istore          4
        //   138: iload           11
        //   140: ifeq            325
        //   143: aload_0        
        //   144: aload_3        
        //   145: invokevirtual   de/me/death/m.a:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   148: astore          5
        //   150: aload           5
        //   152: getfield        de/me/death/a.a:I
        //   155: iload           11
        //   157: ifne            247
        //   160: ifne            242
        //   163: aload_0        
        //   164: aload           5
        //   166: invokevirtual   de/me/death/m.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   169: astore          6
        //   171: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   174: aload           6
        //   176: ldc             Luiztfzghuzt/fb;.class
        //   178: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   181: checkcast       Luiztfzghuzt/fb;
        //   184: astore          7
        //   186: aload_0        
        //   187: aload           7
        //   189: invokevirtual   de/me/death/m.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //   192: astore          6
        //   194: goto            214
        //   197: astore          7
        //   199: aload           6
        //   201: iconst_1       
        //   202: aload           6
        //   204: invokevirtual   java/lang/String.length:()I
        //   207: iconst_1       
        //   208: isub           
        //   209: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   212: astore          6
        //   214: aload_0        
        //   215: new             Ljava/lang/StringBuilder;
        //   218: dup            
        //   219: ldc             "[Bot: "
        //   221: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   224: aload           6
        //   226: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   229: ldc             "]"
        //   231: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   234: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   237: iconst_1       
        //   238: invokevirtual   de/me/death/m.a:(Ljava/lang/String;Z)V
        //   241: return         
        //   242: aload           5
        //   244: getfield        de/me/death/a.a:I
        //   247: iconst_1       
        //   248: iload           11
        //   250: ifne            274
        //   253: if_icmpne       268
        //   256: goto            260
        //   259: athrow         
        //   260: aload_0        
        //   261: ldc             "[Bot: This server is an premium server!]"
        //   263: iconst_1       
        //   264: invokevirtual   de/me/death/m.a:(Ljava/lang/String;Z)V
        //   267: return         
        //   268: aload           5
        //   270: getfield        de/me/death/a.a:I
        //   273: iconst_2       
        //   274: iload           11
        //   276: ifne            313
        //   279: if_icmpne       294
        //   282: goto            286
        //   285: athrow         
        //   286: iconst_1       
        //   287: istore          4
        //   289: iload           11
        //   291: ifeq            325
        //   294: aload           5
        //   296: getfield        de/me/death/a.a:I
        //   299: iload           11
        //   301: ifne            327
        //   304: goto            308
        //   307: athrow         
        //   308: iconst_3       
        //   309: goto            313
        //   312: athrow         
        //   313: if_icmpne       325
        //   316: aload_0        
        //   317: iconst_1       
        //   318: putfield        de/me/death/m.d:Z
        //   321: goto            325
        //   324: athrow         
        //   325: iload           4
        //   327: ifeq            143
        //   330: aload_0        
        //   331: getfield        de/me/death/m.d:Z
        //   334: iload           11
        //   336: ifne            327
        //   339: iload           11
        //   341: ifne            358
        //   344: ifeq            143
        //   347: goto            351
        //   350: athrow         
        //   351: aload_0        
        //   352: getfield        de/me/death/m.c:Lde/me/death/g;
        //   355: invokevirtual   de/me/death/g.j:()Z
        //   358: iload           11
        //   360: ifne            622
        //   363: ifeq            586
        //   366: goto            370
        //   369: athrow         
        //   370: iconst_0       
        //   371: istore          5
        //   373: aload_0        
        //   374: aload_3        
        //   375: invokevirtual   de/me/death/m.a:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   378: astore          6
        //   380: aload           6
        //   382: ifnull          373
        //   385: aload           6
        //   387: getfield        de/me/death/a.a:I
        //   390: bipush          26
        //   392: iload           11
        //   394: ifne            506
        //   397: if_icmpne       499
        //   400: goto            404
        //   403: athrow         
        //   404: aload_0        
        //   405: aload           6
        //   407: invokevirtual   de/me/death/m.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   410: astore          7
        //   412: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   415: aload           7
        //   417: ldc             Luiztfzghuzt/fb;.class
        //   419: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   422: checkcast       Luiztfzghuzt/fb;
        //   425: astore          9
        //   427: aload_0        
        //   428: aload           9
        //   430: invokevirtual   de/me/death/m.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //   433: astore          8
        //   435: goto            471
        //   438: astore          9
        //   440: aload           7
        //   442: aload           7
        //   444: ldc             "\""
        //   446: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   449: iconst_1       
        //   450: iadd           
        //   451: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   454: astore          10
        //   456: aload           10
        //   458: iconst_0       
        //   459: aload           10
        //   461: ldc             "\""
        //   463: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   466: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   469: astore          8
        //   471: aload_0        
        //   472: new             Ljava/lang/StringBuilder;
        //   475: dup            
        //   476: ldc             "[Bot: "
        //   478: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   481: aload           8
        //   483: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   486: ldc             "]"
        //   488: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   491: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   494: iconst_1       
        //   495: invokevirtual   de/me/death/m.a:(Ljava/lang/String;Z)V
        //   498: return         
        //   499: aload           6
        //   501: getfield        de/me/death/a.a:I
        //   504: bipush          46
        //   506: if_icmpne       373
        //   509: aload_0        
        //   510: aload           6
        //   512: invokevirtual   de/me/death/a.readDouble:()D
        //   515: putfield        de/me/death/m.f:D
        //   518: aload_0        
        //   519: aload           6
        //   521: invokevirtual   de/me/death/a.readDouble:()D
        //   524: putfield        de/me/death/m.g:D
        //   527: aload_0        
        //   528: aload           6
        //   530: invokevirtual   de/me/death/a.readDouble:()D
        //   533: putfield        de/me/death/m.h:D
        //   536: aload_0        
        //   537: aload           6
        //   539: invokevirtual   de/me/death/a.readFloat:()F
        //   542: putfield        de/me/death/m.j:F
        //   545: aload_0        
        //   546: aload           6
        //   548: invokevirtual   de/me/death/a.readFloat:()F
        //   551: putfield        de/me/death/m.k:F
        //   554: aload           6
        //   556: invokevirtual   de/me/death/a.readByte:()B
        //   559: pop            
        //   560: aload_0        
        //   561: aload           6
        //   563: invokevirtual   de/me/death/m.a:(Ljava/io/InputStream;)I
        //   566: istore          5
        //   568: aload_0        
        //   569: iload           5
        //   571: aload_2        
        //   572: invokespecial   de/me/death/m.a:(ILjava/io/DataOutputStream;)V
        //   575: aload_0        
        //   576: iload           11
        //   578: ifne            405
        //   581: aload_2        
        //   582: iconst_1       
        //   583: invokevirtual   de/me/death/m.b:(Ljava/io/DataOutputStream;Z)V
        //   586: aload_0        
        //   587: new             Ljava/lang/StringBuilder;
        //   590: dup            
        //   591: ldc             "[Bot: "
        //   593: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   596: aload_0        
        //   597: getfield        de/me/death/m.b:Ljava/lang/String;
        //   600: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   603: ldc             " Joined The Server!]"
        //   605: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   608: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   611: iconst_0       
        //   612: invokevirtual   de/me/death/m.a:(Ljava/lang/String;Z)V
        //   615: aload_0        
        //   616: getfield        de/me/death/m.c:Lde/me/death/g;
        //   619: invokevirtual   de/me/death/g.h:()Z
        //   622: iload           11
        //   624: ifne            651
        //   627: ifeq            644
        //   630: goto            634
        //   633: athrow         
        //   634: aload_0        
        //   635: aload_2        
        //   636: iconst_1       
        //   637: invokevirtual   de/me/death/m.a:(Ljava/io/DataOutputStream;Z)V
        //   640: goto            644
        //   643: athrow         
        //   644: aload_0        
        //   645: getfield        de/me/death/m.c:Lde/me/death/g;
        //   648: invokevirtual   de/me/death/g.g:()Z
        //   651: iload           11
        //   653: ifne            825
        //   656: ifeq            818
        //   659: goto            663
        //   662: athrow         
        //   663: aload_0        
        //   664: getfield        de/me/death/m.c:Lde/me/death/g;
        //   667: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   670: iload           11
        //   672: ifne            722
        //   675: goto            679
        //   678: athrow         
        //   679: ifnull          706
        //   682: goto            686
        //   685: athrow         
        //   686: aload_0        
        //   687: aload_0        
        //   688: getfield        de/me/death/m.c:Lde/me/death/g;
        //   691: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   694: aload_2        
        //   695: iconst_1       
        //   696: sipush          1000
        //   699: invokevirtual   de/me/death/m.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   702: goto            706
        //   705: athrow         
        //   706: aload_0        
        //   707: iload           11
        //   709: ifne            726
        //   712: getfield        de/me/death/m.c:Lde/me/death/g;
        //   715: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   718: goto            722
        //   721: athrow         
        //   722: ifnull          741
        //   725: aload_0        
        //   726: aload_0        
        //   727: getfield        de/me/death/m.c:Lde/me/death/g;
        //   730: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   733: aload_2        
        //   734: iconst_1       
        //   735: sipush          1000
        //   738: invokevirtual   de/me/death/m.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   741: iconst_0       
        //   742: istore          5
        //   744: iload           11
        //   746: ifeq            806
        //   749: aload_0        
        //   750: getfield        de/me/death/m.c:Lde/me/death/g;
        //   753: invokevirtual   de/me/death/g.k:()Ljava/lang/String;
        //   756: ldc             ";"
        //   758: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   761: dup            
        //   762: astore          9
        //   764: arraylength    
        //   765: istore          8
        //   767: iconst_0       
        //   768: istore          7
        //   770: iload           11
        //   772: ifeq            796
        //   775: aload           9
        //   777: iload           7
        //   779: aaload         
        //   780: astore          6
        //   782: aload_0        
        //   783: aload           6
        //   785: aload_2        
        //   786: iconst_1       
        //   787: sipush          200
        //   790: invokevirtual   de/me/death/m.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   793: iinc            7, 1
        //   796: iload           7
        //   798: iload           8
        //   800: if_icmplt       775
        //   803: iinc            5, 1
        //   806: iload           5
        //   808: aload_0        
        //   809: getfield        de/me/death/m.c:Lde/me/death/g;
        //   812: invokevirtual   de/me/death/g.o:()I
        //   815: if_icmplt       749
        //   818: aload_0        
        //   819: getfield        de/me/death/m.c:Lde/me/death/g;
        //   822: invokevirtual   de/me/death/g.f:()Z
        //   825: iload           11
        //   827: ifne            857
        //   830: ifeq            1071
        //   833: goto            837
        //   836: athrow         
        //   837: aload_0        
        //   838: iload           11
        //   840: ifne            904
        //   843: goto            847
        //   846: athrow         
        //   847: getfield        de/me/death/m.c:Lde/me/death/g;
        //   850: invokevirtual   de/me/death/g.p:()I
        //   853: goto            857
        //   856: athrow         
        //   857: bipush          30
        //   859: if_icmpgt       899
        //   862: aload_0        
        //   863: getfield        de/me/death/m.e:I
        //   866: iload           11
        //   868: ifne            890
        //   871: goto            875
        //   874: athrow         
        //   875: iflt            1071
        //   878: goto            882
        //   881: athrow         
        //   882: aload_0        
        //   883: getfield        de/me/death/m.e:I
        //   886: goto            890
        //   889: athrow         
        //   890: i2l            
        //   891: invokestatic    java/lang/Thread.sleep:(J)V
        //   894: iload           11
        //   896: ifeq            1071
        //   899: aload_0        
        //   900: goto            904
        //   903: athrow         
        //   904: aload_3        
        //   905: invokevirtual   de/me/death/m.a:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   908: astore          5
        //   910: aload           5
        //   912: ifnull          899
        //   915: aload           5
        //   917: getfield        de/me/death/a.a:I
        //   920: bipush          31
        //   922: iload           11
        //   924: ifne            973
        //   927: if_icmpne       966
        //   930: goto            934
        //   933: athrow         
        //   934: invokestatic    uiztfzghuzt/u.a:()Luiztfzghuzt/t;
        //   937: astore          6
        //   939: aload_0        
        //   940: bipush          11
        //   942: aload           6
        //   944: invokevirtual   de/me/death/m.a:(ILjava/io/DataOutput;)V
        //   947: aload_0        
        //   948: aload_0        
        //   949: aload           5
        //   951: invokevirtual   de/me/death/m.a:(Ljava/io/InputStream;)I
        //   954: aload           6
        //   956: invokevirtual   de/me/death/m.a:(ILjava/io/DataOutput;)V
        //   959: aload_0        
        //   960: aload           6
        //   962: aload_2        
        //   963: invokevirtual   de/me/death/m.a:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //   966: aload           5
        //   968: getfield        de/me/death/a.a:I
        //   971: bipush          26
        //   973: if_icmpne       899
        //   976: aload_0        
        //   977: aload           5
        //   979: invokevirtual   de/me/death/m.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   982: astore          7
        //   984: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   987: aload           7
        //   989: ldc             Luiztfzghuzt/fb;.class
        //   991: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   994: checkcast       Luiztfzghuzt/fb;
        //   997: astore          8
        //   999: aload_0        
        //  1000: aload           8
        //  1002: invokevirtual   de/me/death/m.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //  1005: astore          6
        //  1007: iload           11
        //  1009: ifne            966
        //  1012: goto            1032
        //  1015: astore          8
        //  1017: aload           7
        //  1019: iconst_1       
        //  1020: aload           7
        //  1022: invokevirtual   java/lang/String.length:()I
        //  1025: iconst_1       
        //  1026: isub           
        //  1027: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1030: astore          6
        //  1032: aload_0        
        //  1033: new             Ljava/lang/StringBuilder;
        //  1036: dup            
        //  1037: ldc             "[Bot: "
        //  1039: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1042: aload_0        
        //  1043: getfield        de/me/death/m.b:Ljava/lang/String;
        //  1046: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1049: ldc             " Got Kicked!: "
        //  1051: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1054: aload           6
        //  1056: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1059: ldc             "]"
        //  1061: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1064: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1067: iconst_1       
        //  1068: invokevirtual   de/me/death/m.a:(Ljava/lang/String;Z)V
        //  1071: aload_1        
        //  1072: invokevirtual   java/net/Socket.close:()V
        //  1075: goto            1090
        //  1078: astore_2       
        //  1079: aload_0        
        //  1080: getfield        de/me/death/m.l:Lde/me/death/ab;
        //  1083: invokevirtual   de/me/death/ab.a:()V
        //  1086: aload_1        
        //  1087: invokevirtual   java/net/Socket.close:()V
        //  1090: return         
        //    StackMapTable: 00 58 FF 00 17 00 0C 07 00 02 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 12 00 46 07 00 12 00 43 07 00 1C 2A FF 00 15 00 0C 07 00 02 07 00 3E 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 29 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 00 01 00 00 FF 00 35 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 07 00 73 00 00 00 00 01 00 01 07 00 12 FF 00 10 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 07 00 73 07 01 05 00 00 00 01 00 00 FF 00 1B 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 00 01 00 00 44 01 4B 07 00 12 00 07 FF 00 05 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 00 01 00 02 01 01 4A 07 00 12 00 07 4C 07 00 12 40 01 43 07 00 12 FF 00 00 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 00 01 00 02 01 01 4A 07 00 12 FF 00 00 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 00 01 00 00 41 01 56 07 00 12 00 46 01 4A 07 00 12 00 FF 00 02 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 00 00 00 00 00 01 00 00 FF 00 1D 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 07 00 5D 00 00 00 00 01 00 01 07 00 12 00 40 07 00 02 FF 00 20 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 07 00 5D 07 00 73 00 00 00 01 00 01 07 00 12 FF 00 20 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 07 00 5D 07 00 73 07 00 73 07 01 05 00 01 00 00 FF 00 1B 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 07 00 5D 00 00 00 00 01 00 00 FF 00 06 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 07 00 5D 00 00 00 00 01 00 02 01 01 FF 00 4F 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 00 01 00 00 63 01 4A 07 00 12 00 48 07 00 12 00 46 01 4A 07 00 12 00 4E 07 00 12 40 07 00 73 45 07 00 12 00 52 07 00 12 00 4E 07 00 12 40 07 00 73 43 07 00 02 0E FF 00 07 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 00 00 00 00 00 01 00 00 FF 00 19 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 00 01 01 07 01 06 00 01 00 00 14 FF 00 09 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 01 00 00 00 00 00 01 00 00 FF 00 0B 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 00 01 00 00 46 01 4A 07 00 12 00 48 07 00 12 40 07 00 02 48 07 00 12 40 01 50 07 00 12 40 01 45 07 00 12 00 46 07 00 12 40 01 08 43 07 00 12 40 07 00 02 FF 00 1C 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 00 01 00 01 07 00 12 00 1F FF 00 06 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 00 00 00 00 01 00 02 01 01 FF 00 29 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 00 07 00 73 00 00 00 01 00 01 07 00 12 FF 00 10 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 07 00 5D 07 00 73 07 00 73 07 01 05 00 00 01 00 00 FF 00 26 00 0C 07 00 02 07 00 3E 07 00 43 07 00 4C 01 00 00 00 00 00 00 01 00 00 FF 00 06 00 0C 07 00 02 07 00 3E 00 00 00 00 00 00 00 00 00 01 00 01 07 00 12 FF 00 0B 00 0C 07 00 02 07 00 3E 07 01 05 00 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      28     31     32     Ljava/lang/Exception;
        //  5      20     23     24     Ljava/lang/Exception;
        //  171    194    197    214    Ljava/lang/Exception;
        //  412    435    438    471    Ljava/lang/Exception;
        //  984    1007   1015   1032   Ljava/lang/Exception;
        //  101    241    1078   1090   Ljava/lang/Exception;
        //  247    256    259    260    Ljava/lang/Exception;
        //  242    267    1078   1090   Ljava/lang/Exception;
        //  385    400    403    404    Ljava/lang/Exception;
        //  358    366    369    370    Ljava/lang/Exception;
        //  339    347    350    351    Ljava/lang/Exception;
        //  313    321    324    325    Ljava/lang/Exception;
        //  294    309    312    313    Ljava/lang/Exception;
        //  289    304    307    308    Ljava/lang/Exception;
        //  274    282    285    286    Ljava/lang/Exception;
        //  268    498    1078   1090   Ljava/lang/Exception;
        //  915    930    933    934    Ljava/lang/Exception;
        //  890    900    903    904    Ljava/lang/Exception;
        //  875    886    889    890    Ljava/lang/Exception;
        //  862    878    881    882    Ljava/lang/Exception;
        //  857    871    874    875    Ljava/lang/Exception;
        //  837    853    856    857    Ljava/lang/Exception;
        //  830    843    846    847    Ljava/lang/Exception;
        //  825    833    836    837    Ljava/lang/Exception;
        //  706    718    721    722    Ljava/lang/Exception;
        //  679    702    705    706    Ljava/lang/Exception;
        //  663    682    685    686    Ljava/lang/Exception;
        //  656    675    678    679    Ljava/lang/Exception;
        //  651    659    662    663    Ljava/lang/Exception;
        //  627    640    643    644    Ljava/lang/Exception;
        //  622    630    633    634    Ljava/lang/Exception;
        //  499    1075   1078   1090   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0294:
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
        final t a = u.a();
        Label_0090: {
            try {
                this.a(13, a);
                a.writeDouble(this.f - 0.15);
                a.writeDouble(this.g);
                a.writeDouble(this.h + 0.15);
                a.writeFloat(this.j);
                a.writeFloat(this.k);
                a.writeBoolean(false);
                if (de.me.death.l.m != 0) {
                    return;
                }
                final boolean b2 = b;
                if (b2) {
                    break Label_0090;
                }
                break Label_0090;
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
        //    12: invokevirtual   de/me/death/m.a:(ILjava/io/DataOutput;)V
        //    15: aload_0        
        //    16: iconst_2       
        //    17: aload_3        
        //    18: invokevirtual   de/me/death/m.a:(ILjava/io/DataOutput;)V
        //    21: iload           4
        //    23: ifne            59
        //    26: iload_2        
        //    27: ifeq            49
        //    30: goto            34
        //    33: athrow         
        //    34: aload_0        
        //    35: aload_3        
        //    36: aload_1        
        //    37: invokevirtual   de/me/death/m.a:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //    40: iload           4
        //    42: ifeq            67
        //    45: goto            49
        //    48: athrow         
        //    49: aload_0        
        //    50: aload_3        
        //    51: aload_1        
        //    52: invokevirtual   de/me/death/m.b:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //    55: goto            59
        //    58: athrow         
        //    59: goto            67
        //    62: astore_3       
        //    63: aload_3        
        //    64: invokevirtual   java/io/IOException.printStackTrace:()V
        //    67: return         
        //    StackMapTable: 00 08 FF 00 21 00 05 07 00 02 07 00 43 01 07 01 0C 01 00 01 07 01 1C 00 4D 07 01 1C 00 48 07 01 1C 00 FF 00 02 00 05 07 00 02 07 00 43 01 00 01 00 01 07 01 1C FF 00 04 00 05 07 00 02 07 00 43 01 07 01 05 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  34     55     58     59     Ljava/io/IOException;
        //  26     45     48     49     Ljava/io/IOException;
        //  9      30     33     34     Ljava/io/IOException;
        //  5      59     62     67     Ljava/io/IOException;
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
        //    24: bipush          9
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
        //    66: invokevirtual   de/me/death/m.a:(ILjava/io/DataOutput;)V
        //    69: aload_0        
        //    70: aload           5
        //    72: aload           6
        //    74: invokevirtual   de/me/death/m.a:(Ljava/lang/String;Ljava/io/DataOutput;)V
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
        //    96: invokevirtual   de/me/death/m.a:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;I)V
        //    99: iload           8
        //   101: ifeq            126
        //   104: goto            108
        //   107: athrow         
        //   108: aload_0        
        //   109: aload           6
        //   111: aload_2        
        //   112: iload           4
        //   114: invokevirtual   de/me/death/m.b:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;I)V
        //   117: goto            121
        //   120: athrow         
        //   121: goto            126
        //   124: astore          5
        //   126: return         
        //    StackMapTable: 00 0A FF 00 0D 00 09 07 00 02 07 00 73 07 00 43 01 01 07 00 73 00 00 01 00 00 20 FF 00 2A 00 09 07 00 02 07 00 73 07 00 43 01 01 07 00 73 07 01 0C 00 01 00 01 07 00 12 00 50 07 00 12 00 4B 07 00 12 00 FF 00 02 00 09 07 00 02 07 00 73 07 00 43 01 01 00 00 00 01 00 01 07 00 12 FF 00 01 00 09 07 00 02 07 00 73 07 00 43 01 01 07 01 05 00 00 01 00 00
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
        String s = "\u0003\n\u001d\u007f\u000ex\u001c\u001abGx;\u0017yB=:RbGx)\u001c+D*-\u001fbA5h\u0001nF.-\u0000*i";
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
                                c2 = 'X';
                                break;
                            }
                            case 1: {
                                c2 = 'H';
                                break;
                            }
                            case 2: {
                                c2 = 'r';
                                break;
                            }
                            case 3: {
                                c2 = '\u000b';
                                break;
                            }
                            default: {
                                c2 = '4';
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
                    s = "x\u000f\u001d\u007f\u0014\u0013!\u0011`Q<iH+";
                    n6 = 0;
                    continue Label_0119_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "\u0003\n\u001d\u007f\u000ex";
                    n6 = 1;
                    continue Label_0119_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "x\u0002\u001dbZ=,R_\\=h!nF.-\u0000*i";
                    n6 = 2;
                    continue Label_0119_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "ifJ%\u0004uy\\3\u001aa";
                    n6 = 3;
                    continue Label_0119_Outer;
                }
                case 3: {
                    break Label_0119_Outer;
                }
            }
        }
        array[n5] = intern;
        z = new String[] { "[Bot: This server is an premium server!]", " Got Kicked!: ", "[Bot: ", " Joined The Server!]", "1.8.0-1.8.9" };
    }
}
