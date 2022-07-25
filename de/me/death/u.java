// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

public class u extends l
{
    private static final String[] z;
    
    public u(final String s, final ab ab, final g g) {
        super(s, ab, g);
        this.i = new int[] { 2, 8, 64, 0, 40, 1, 3 };
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
        //     6: iconst_0       
        //     7: putfield        de/me/death/u.d:Z
        //    10: aload_0        
        //    11: getfield        de/me/death/u.c:Lde/me/death/g;
        //    14: iload           10
        //    16: ifne            37
        //    19: invokevirtual   de/me/death/g.i:()Z
        //    22: ifeq            33
        //    25: aload_0        
        //    26: invokevirtual   de/me/death/u.b:()V
        //    29: goto            33
        //    32: astore_1       
        //    33: aload_0        
        //    34: getfield        de/me/death/u.c:Lde/me/death/g;
        //    37: invokevirtual   de/me/death/g.r:()Lde/me/death/b;
        //    40: getstatic       de/me/death/b.NONE:Lde/me/death/b;
        //    43: if_acmpeq       80
        //    46: new             Lde/me/death/hb;
        //    49: dup            
        //    50: aload_0        
        //    51: getfield        de/me/death/u.c:Lde/me/death/g;
        //    54: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //    57: aload_0        
        //    58: getfield        de/me/death/u.c:Lde/me/death/g;
        //    61: invokevirtual   de/me/death/g.n:()I
        //    64: aload_0        
        //    65: getfield        de/me/death/u.l:Lde/me/death/ab;
        //    68: sipush          5000
        //    71: invokespecial   de/me/death/hb.<init>:(Ljava/lang/String;ILde/me/death/ab;I)V
        //    74: astore_1       
        //    75: iload           10
        //    77: ifeq            102
        //    80: new             Ljava/net/Socket;
        //    83: dup            
        //    84: aload_0        
        //    85: getfield        de/me/death/u.c:Lde/me/death/g;
        //    88: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //    91: aload_0        
        //    92: getfield        de/me/death/u.c:Lde/me/death/g;
        //    95: invokevirtual   de/me/death/g.n:()I
        //    98: invokespecial   java/net/Socket.<init>:(Ljava/lang/String;I)V
        //   101: astore_1       
        //   102: new             Ljava/io/DataOutputStream;
        //   105: dup            
        //   106: aload_1        
        //   107: invokevirtual   java/net/Socket.getOutputStream:()Ljava/io/OutputStream;
        //   110: invokespecial   java/io/DataOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   113: astore_2       
        //   114: new             Ljava/io/DataInputStream;
        //   117: dup            
        //   118: aload_1        
        //   119: invokevirtual   java/net/Socket.getInputStream:()Ljava/io/InputStream;
        //   122: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //   125: astore_3       
        //   126: aload_0        
        //   127: aload_2        
        //   128: invokevirtual   de/me/death/u.a:(Ljava/io/DataOutputStream;)V
        //   131: aload_0        
        //   132: aload_2        
        //   133: invokevirtual   de/me/death/u.b:(Ljava/io/DataOutputStream;)V
        //   136: iconst_0       
        //   137: istore          4
        //   139: iload           10
        //   141: ifeq            326
        //   144: aload_0        
        //   145: aload_3        
        //   146: invokevirtual   de/me/death/u.a:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   149: astore          5
        //   151: aload           5
        //   153: getfield        de/me/death/a.a:I
        //   156: iload           10
        //   158: ifne            248
        //   161: ifne            243
        //   164: aload_0        
        //   165: aload           5
        //   167: invokevirtual   de/me/death/u.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   170: astore          6
        //   172: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   175: aload           6
        //   177: ldc             Luiztfzghuzt/fb;.class
        //   179: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   182: checkcast       Luiztfzghuzt/fb;
        //   185: astore          7
        //   187: aload_0        
        //   188: aload           7
        //   190: invokevirtual   de/me/death/u.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //   193: astore          6
        //   195: goto            215
        //   198: astore          7
        //   200: aload           6
        //   202: iconst_1       
        //   203: aload           6
        //   205: invokevirtual   java/lang/String.length:()I
        //   208: iconst_1       
        //   209: isub           
        //   210: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   213: astore          6
        //   215: aload_0        
        //   216: new             Ljava/lang/StringBuilder;
        //   219: dup            
        //   220: ldc             "[Bot: "
        //   222: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   225: aload           6
        //   227: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   230: ldc             "]"
        //   232: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   235: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   238: iconst_1       
        //   239: invokevirtual   de/me/death/u.a:(Ljava/lang/String;Z)V
        //   242: return         
        //   243: aload           5
        //   245: getfield        de/me/death/a.a:I
        //   248: iconst_1       
        //   249: iload           10
        //   251: ifne            275
        //   254: if_icmpne       269
        //   257: goto            261
        //   260: athrow         
        //   261: aload_0        
        //   262: ldc             "[Bot: This server is an premium server!]"
        //   264: iconst_1       
        //   265: invokevirtual   de/me/death/u.a:(Ljava/lang/String;Z)V
        //   268: return         
        //   269: aload           5
        //   271: getfield        de/me/death/a.a:I
        //   274: iconst_2       
        //   275: iload           10
        //   277: ifne            314
        //   280: if_icmpne       295
        //   283: goto            287
        //   286: athrow         
        //   287: iconst_1       
        //   288: istore          4
        //   290: iload           10
        //   292: ifeq            326
        //   295: aload           5
        //   297: getfield        de/me/death/a.a:I
        //   300: iload           10
        //   302: ifne            328
        //   305: goto            309
        //   308: athrow         
        //   309: iconst_3       
        //   310: goto            314
        //   313: athrow         
        //   314: if_icmpne       326
        //   317: aload_0        
        //   318: iconst_1       
        //   319: putfield        de/me/death/u.d:Z
        //   322: goto            326
        //   325: athrow         
        //   326: iload           4
        //   328: ifeq            144
        //   331: aload_0        
        //   332: getfield        de/me/death/u.d:Z
        //   335: iload           10
        //   337: ifne            328
        //   340: iload           10
        //   342: ifne            359
        //   345: ifeq            144
        //   348: goto            352
        //   351: athrow         
        //   352: aload_0        
        //   353: getfield        de/me/death/u.c:Lde/me/death/g;
        //   356: invokevirtual   de/me/death/g.j:()Z
        //   359: iload           10
        //   361: ifne            637
        //   364: ifeq            601
        //   367: goto            371
        //   370: athrow         
        //   371: aload_0        
        //   372: aload_3        
        //   373: invokevirtual   de/me/death/u.a:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   376: astore          5
        //   378: aload           5
        //   380: ifnull          371
        //   383: aload           5
        //   385: iload           10
        //   387: ifne            380
        //   390: getfield        de/me/death/a.a:I
        //   393: bipush          64
        //   395: iload           10
        //   397: ifne            509
        //   400: if_icmpne       502
        //   403: goto            407
        //   406: athrow         
        //   407: aload_0        
        //   408: aload           5
        //   410: invokevirtual   de/me/death/u.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   413: astore          6
        //   415: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   418: aload           6
        //   420: ldc             Luiztfzghuzt/fb;.class
        //   422: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   425: checkcast       Luiztfzghuzt/fb;
        //   428: astore          8
        //   430: aload_0        
        //   431: aload           8
        //   433: invokevirtual   de/me/death/u.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //   436: astore          7
        //   438: goto            474
        //   441: astore          8
        //   443: aload           6
        //   445: aload           6
        //   447: ldc             "\""
        //   449: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   452: iconst_1       
        //   453: iadd           
        //   454: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   457: astore          9
        //   459: aload           9
        //   461: iconst_0       
        //   462: aload           9
        //   464: ldc             "\""
        //   466: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   469: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   472: astore          7
        //   474: aload_0        
        //   475: new             Ljava/lang/StringBuilder;
        //   478: dup            
        //   479: ldc             "[Bot: "
        //   481: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   484: aload           7
        //   486: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   489: ldc             "]"
        //   491: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   494: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   497: iconst_1       
        //   498: invokevirtual   de/me/death/u.a:(Ljava/lang/String;Z)V
        //   501: return         
        //   502: aload           5
        //   504: getfield        de/me/death/a.a:I
        //   507: bipush          70
        //   509: iload           10
        //   511: ifne            547
        //   514: if_icmpne       535
        //   517: goto            521
        //   520: athrow         
        //   521: aload_0        
        //   522: iconst_1       
        //   523: putfield        de/me/death/u.d:Z
        //   526: iload           10
        //   528: ifeq            371
        //   531: goto            535
        //   534: athrow         
        //   535: aload           5
        //   537: iload           10
        //   539: ifne            380
        //   542: getfield        de/me/death/a.a:I
        //   545: bipush          8
        //   547: if_icmpne       371
        //   550: aload_0        
        //   551: aload           5
        //   553: invokevirtual   de/me/death/a.readDouble:()D
        //   556: putfield        de/me/death/u.f:D
        //   559: aload_0        
        //   560: aload           5
        //   562: invokevirtual   de/me/death/a.readDouble:()D
        //   565: putfield        de/me/death/u.g:D
        //   568: aload_0        
        //   569: aload           5
        //   571: invokevirtual   de/me/death/a.readDouble:()D
        //   574: putfield        de/me/death/u.h:D
        //   577: aload_0        
        //   578: aload           5
        //   580: invokevirtual   de/me/death/a.readFloat:()F
        //   583: putfield        de/me/death/u.j:F
        //   586: aload_0        
        //   587: aload           5
        //   589: invokevirtual   de/me/death/a.readFloat:()F
        //   592: putfield        de/me/death/u.k:F
        //   595: aload_0        
        //   596: aload_2        
        //   597: iconst_1       
        //   598: invokevirtual   de/me/death/u.b:(Ljava/io/DataOutputStream;Z)V
        //   601: aload_0        
        //   602: new             Ljava/lang/StringBuilder;
        //   605: dup            
        //   606: ldc             "[Bot: "
        //   608: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   611: aload_0        
        //   612: getfield        de/me/death/u.b:Ljava/lang/String;
        //   615: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   618: ldc             " Joined The Server!]"
        //   620: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   623: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   626: iconst_0       
        //   627: invokevirtual   de/me/death/u.a:(Ljava/lang/String;Z)V
        //   630: aload_0        
        //   631: getfield        de/me/death/u.c:Lde/me/death/g;
        //   634: invokevirtual   de/me/death/g.h:()Z
        //   637: iload           10
        //   639: ifne            666
        //   642: ifeq            659
        //   645: goto            649
        //   648: athrow         
        //   649: aload_0        
        //   650: aload_2        
        //   651: iconst_1       
        //   652: invokevirtual   de/me/death/u.a:(Ljava/io/DataOutputStream;Z)V
        //   655: goto            659
        //   658: athrow         
        //   659: aload_0        
        //   660: getfield        de/me/death/u.c:Lde/me/death/g;
        //   663: invokevirtual   de/me/death/g.g:()Z
        //   666: iload           10
        //   668: ifne            904
        //   671: ifeq            897
        //   674: goto            678
        //   677: athrow         
        //   678: aload_0        
        //   679: getfield        de/me/death/u.c:Lde/me/death/g;
        //   682: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   685: iload           10
        //   687: ifne            754
        //   690: goto            694
        //   693: athrow         
        //   694: ifnull          747
        //   697: goto            701
        //   700: athrow         
        //   701: aload_0        
        //   702: getfield        de/me/death/u.c:Lde/me/death/g;
        //   705: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   708: iload           10
        //   710: ifne            754
        //   713: goto            717
        //   716: athrow         
        //   717: invokevirtual   java/lang/String.isEmpty:()Z
        //   720: ifne            747
        //   723: goto            727
        //   726: athrow         
        //   727: aload_0        
        //   728: aload_0        
        //   729: getfield        de/me/death/u.c:Lde/me/death/g;
        //   732: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   735: aload_2        
        //   736: iconst_1       
        //   737: sipush          1000
        //   740: invokevirtual   de/me/death/u.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   743: goto            747
        //   746: athrow         
        //   747: aload_0        
        //   748: getfield        de/me/death/u.c:Lde/me/death/g;
        //   751: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   754: iload           10
        //   756: ifne            777
        //   759: ifnull          812
        //   762: goto            766
        //   765: athrow         
        //   766: aload_0        
        //   767: getfield        de/me/death/u.c:Lde/me/death/g;
        //   770: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   773: goto            777
        //   776: athrow         
        //   777: invokevirtual   java/lang/String.isEmpty:()Z
        //   780: iload           10
        //   782: ifne            813
        //   785: ifne            812
        //   788: goto            792
        //   791: athrow         
        //   792: aload_0        
        //   793: aload_0        
        //   794: getfield        de/me/death/u.c:Lde/me/death/g;
        //   797: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   800: aload_2        
        //   801: iconst_1       
        //   802: sipush          1000
        //   805: invokevirtual   de/me/death/u.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   808: goto            812
        //   811: athrow         
        //   812: iconst_0       
        //   813: istore          5
        //   815: iload           10
        //   817: ifeq            885
        //   820: aload_0        
        //   821: getfield        de/me/death/u.c:Lde/me/death/g;
        //   824: invokevirtual   de/me/death/g.k:()Ljava/lang/String;
        //   827: ldc             ";"
        //   829: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   832: dup            
        //   833: astore          9
        //   835: arraylength    
        //   836: istore          8
        //   838: iconst_0       
        //   839: istore          7
        //   841: iload           10
        //   843: ifeq            875
        //   846: aload           9
        //   848: iload           7
        //   850: aaload         
        //   851: astore          6
        //   853: aload           6
        //   855: invokevirtual   java/lang/String.isEmpty:()Z
        //   858: ifne            872
        //   861: aload_0        
        //   862: aload           6
        //   864: aload_2        
        //   865: iconst_1       
        //   866: sipush          200
        //   869: invokevirtual   de/me/death/u.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   872: iinc            7, 1
        //   875: iload           7
        //   877: iload           8
        //   879: if_icmplt       846
        //   882: iinc            5, 1
        //   885: iload           5
        //   887: aload_0        
        //   888: getfield        de/me/death/u.c:Lde/me/death/g;
        //   891: invokevirtual   de/me/death/g.o:()I
        //   894: if_icmplt       820
        //   897: aload_0        
        //   898: getfield        de/me/death/u.c:Lde/me/death/g;
        //   901: invokevirtual   de/me/death/g.f:()Z
        //   904: iload           10
        //   906: ifne            936
        //   909: ifeq            1147
        //   912: goto            916
        //   915: athrow         
        //   916: aload_0        
        //   917: iload           10
        //   919: ifne            983
        //   922: goto            926
        //   925: athrow         
        //   926: getfield        de/me/death/u.c:Lde/me/death/g;
        //   929: invokevirtual   de/me/death/g.p:()I
        //   932: goto            936
        //   935: athrow         
        //   936: bipush          30
        //   938: if_icmpgt       978
        //   941: aload_0        
        //   942: getfield        de/me/death/u.e:I
        //   945: iload           10
        //   947: ifne            969
        //   950: goto            954
        //   953: athrow         
        //   954: iflt            1147
        //   957: goto            961
        //   960: athrow         
        //   961: aload_0        
        //   962: getfield        de/me/death/u.e:I
        //   965: goto            969
        //   968: athrow         
        //   969: i2l            
        //   970: invokestatic    java/lang/Thread.sleep:(J)V
        //   973: iload           10
        //   975: ifeq            1147
        //   978: aload_0        
        //   979: goto            983
        //   982: athrow         
        //   983: aload_3        
        //   984: invokevirtual   de/me/death/u.a:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   987: astore          5
        //   989: aload           5
        //   991: ifnull          978
        //   994: aload           5
        //   996: getfield        de/me/death/a.a:I
        //   999: iload           10
        //  1001: ifne            1047
        //  1004: ifne            1042
        //  1007: goto            1011
        //  1010: athrow         
        //  1011: invokestatic    uiztfzghuzt/u.a:()Luiztfzghuzt/t;
        //  1014: astore          6
        //  1016: aload_0        
        //  1017: iconst_0       
        //  1018: aload           6
        //  1020: invokevirtual   de/me/death/u.a:(ILjava/io/DataOutput;)V
        //  1023: aload_0        
        //  1024: aload_0        
        //  1025: aload           5
        //  1027: invokevirtual   de/me/death/u.a:(Ljava/io/InputStream;)I
        //  1030: aload           6
        //  1032: invokevirtual   de/me/death/u.a:(ILjava/io/DataOutput;)V
        //  1035: aload_0        
        //  1036: aload           6
        //  1038: aload_2        
        //  1039: invokevirtual   de/me/death/u.a:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //  1042: aload           5
        //  1044: getfield        de/me/death/a.a:I
        //  1047: bipush          64
        //  1049: if_icmpne       978
        //  1052: aload_0        
        //  1053: aload           5
        //  1055: invokevirtual   de/me/death/u.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //  1058: astore          7
        //  1060: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //  1063: aload           7
        //  1065: ldc             Luiztfzghuzt/fb;.class
        //  1067: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //  1070: checkcast       Luiztfzghuzt/fb;
        //  1073: astore          8
        //  1075: aload_0        
        //  1076: aload           8
        //  1078: invokevirtual   de/me/death/u.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //  1081: astore          6
        //  1083: iload           10
        //  1085: ifne            1042
        //  1088: goto            1108
        //  1091: astore          8
        //  1093: aload           7
        //  1095: iconst_1       
        //  1096: aload           7
        //  1098: invokevirtual   java/lang/String.length:()I
        //  1101: iconst_1       
        //  1102: isub           
        //  1103: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1106: astore          6
        //  1108: aload_0        
        //  1109: new             Ljava/lang/StringBuilder;
        //  1112: dup            
        //  1113: ldc             "[Bot: "
        //  1115: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1118: aload_0        
        //  1119: getfield        de/me/death/u.b:Ljava/lang/String;
        //  1122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1125: ldc             " Got Kicked!: "
        //  1127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1130: aload           6
        //  1132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1135: ldc             "]"
        //  1137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1140: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1143: iconst_1       
        //  1144: invokevirtual   de/me/death/u.a:(Ljava/lang/String;Z)V
        //  1147: aload_1        
        //  1148: invokevirtual   java/net/Socket.close:()V
        //  1151: goto            1166
        //  1154: astore_2       
        //  1155: aload_0        
        //  1156: getfield        de/me/death/u.l:Lde/me/death/ab;
        //  1159: invokevirtual   de/me/death/ab.a:()V
        //  1162: aload_1        
        //  1163: invokevirtual   java/net/Socket.close:()V
        //  1166: return         
        //    StackMapTable: 00 65 FF 00 20 00 0B 07 00 02 00 00 00 00 00 00 00 00 00 01 00 01 07 00 12 00 43 07 00 20 2A FF 00 15 00 0B 07 00 02 07 00 42 00 00 00 00 00 00 00 00 01 00 00 FF 00 29 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 00 00 00 00 00 01 00 00 FF 00 35 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 07 00 77 00 00 00 01 00 01 07 00 12 FF 00 10 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 07 00 77 07 01 01 00 00 01 00 00 FF 00 1B 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 00 00 00 00 01 00 00 44 01 4B 07 00 12 00 07 FF 00 05 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 00 00 00 00 01 00 02 01 01 4A 07 00 12 00 07 4C 07 00 12 40 01 43 07 00 12 FF 00 00 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 00 00 00 00 01 00 02 01 01 4A 07 00 12 FF 00 00 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 00 00 00 00 00 01 00 00 41 01 56 07 00 12 00 46 01 4A 07 00 12 00 FF 00 08 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 00 00 00 00 01 00 01 07 00 61 59 07 00 12 00 FF 00 21 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 07 00 77 00 00 00 01 00 01 07 00 12 FF 00 20 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 07 00 77 07 00 77 07 01 01 00 01 00 00 FF 00 1B 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 00 00 00 00 01 00 00 FF 00 06 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 00 00 00 00 01 00 02 01 01 4A 07 00 12 00 4C 07 00 12 00 FF 00 0B 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 00 00 00 00 01 00 02 01 01 FF 00 35 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 00 00 00 00 00 01 00 00 63 01 4A 07 00 12 00 48 07 00 12 00 46 01 4A 07 00 12 00 4E 07 00 12 40 07 00 77 45 07 00 12 00 4E 07 00 12 40 07 00 77 48 07 00 12 00 52 07 00 12 00 46 07 00 77 4A 07 00 12 00 49 07 00 12 40 07 00 77 4D 07 00 12 00 52 07 00 12 00 40 01 FF 00 06 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 01 00 00 00 00 01 00 00 FF 00 19 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 01 00 01 01 07 01 02 01 00 00 FF 00 19 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 01 07 00 77 01 01 07 01 02 01 00 00 FF 00 02 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 01 00 01 01 07 01 02 01 00 00 FF 00 09 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 01 00 00 00 00 01 00 00 FF 00 0B 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 00 00 00 00 00 01 00 00 46 01 4A 07 00 12 00 48 07 00 12 40 07 00 02 48 07 00 12 40 01 50 07 00 12 40 01 45 07 00 12 00 46 07 00 12 40 01 08 43 07 00 12 40 07 00 02 FF 00 1A 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 00 00 00 00 01 00 01 07 00 12 00 1E 44 01 FF 00 2B 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 00 07 00 77 00 00 01 00 01 07 00 12 FF 00 10 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 07 00 61 07 00 77 07 00 77 07 01 01 00 01 00 00 FF 00 26 00 0B 07 00 02 07 00 42 07 00 47 07 00 50 01 00 00 00 00 00 01 00 00 FF 00 06 00 0B 07 00 02 07 00 42 00 00 00 00 00 00 00 00 01 00 01 07 00 12 FF 00 0B 00 0B 07 00 02 07 00 42 07 01 01 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     29     32     33     Ljava/lang/Exception;
        //  172    195    198    215    Ljava/lang/Exception;
        //  415    438    441    474    Ljava/lang/Exception;
        //  1060   1083   1091   1108   Ljava/lang/Exception;
        //  102    242    1154   1166   Ljava/lang/Exception;
        //  248    257    260    261    Ljava/lang/Exception;
        //  243    268    1154   1166   Ljava/lang/Exception;
        //  390    403    406    407    Ljava/lang/Exception;
        //  359    367    370    371    Ljava/lang/Exception;
        //  340    348    351    352    Ljava/lang/Exception;
        //  314    322    325    326    Ljava/lang/Exception;
        //  295    310    313    314    Ljava/lang/Exception;
        //  290    305    308    309    Ljava/lang/Exception;
        //  275    283    286    287    Ljava/lang/Exception;
        //  269    501    1154   1166   Ljava/lang/Exception;
        //  994    1007   1010   1011   Ljava/lang/Exception;
        //  969    979    982    983    Ljava/lang/Exception;
        //  954    965    968    969    Ljava/lang/Exception;
        //  941    957    960    961    Ljava/lang/Exception;
        //  936    950    953    954    Ljava/lang/Exception;
        //  916    932    935    936    Ljava/lang/Exception;
        //  909    922    925    926    Ljava/lang/Exception;
        //  904    912    915    916    Ljava/lang/Exception;
        //  785    808    811    812    Ljava/lang/Exception;
        //  777    788    791    792    Ljava/lang/Exception;
        //  759    773    776    777    Ljava/lang/Exception;
        //  754    762    765    766    Ljava/lang/Exception;
        //  717    743    746    747    Ljava/lang/Exception;
        //  701    723    726    727    Ljava/lang/Exception;
        //  694    713    716    717    Ljava/lang/Exception;
        //  678    697    700    701    Ljava/lang/Exception;
        //  671    690    693    694    Ljava/lang/Exception;
        //  666    674    677    678    Ljava/lang/Exception;
        //  642    655    658    659    Ljava/lang/Exception;
        //  637    645    648    649    Ljava/lang/Exception;
        //  514    531    534    535    Ljava/lang/Exception;
        //  509    517    520    521    Ljava/lang/Exception;
        //  502    1151   1154   1166   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0295:
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
        String s = "6)-piM?*m M\u0018'v%\b\u0019bm M\n,$#\u001f\u000e/m&\u0000K1a!\u001b\u000e0%\u000e";
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
                Label_0193: {
                    if (n7 > 1) {
                        break Label_0193;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = 'm';
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
                                c2 = '\u0004';
                                break;
                            }
                            default: {
                                c2 = 'S';
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
                    s = "6)-piM";
                    n6 = 0;
                    continue Label_0119_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "M,-ps&\u0002!o6\tJx$";
                    n6 = 1;
                    continue Label_0119_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "M!-m=\b\u000fbP;\bK\u0011a!\u001b\u000e0%\u000e";
                    n6 = 2;
                    continue Label_0119_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "\\Ez*c@Zl<}T";
                    n6 = 3;
                    continue Label_0119_Outer;
                }
                case 3: {
                    break Label_0119_Outer;
                }
            }
        }
        array[n5] = intern;
        z = new String[] { "[Bot: This server is an premium server!]", "[Bot: ", " Got Kicked!: ", " Joined The Server!]", "1.8.0-1.8.9" };
    }
}
