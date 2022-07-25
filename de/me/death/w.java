// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

public abstract class w extends l
{
    public static boolean n;
    private static final String[] z;
    
    public w(final String s, final ab ab, final g g) {
        super(s, ab, g);
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
        //     6: getfield        de/me/death/w.c:Lde/me/death/g;
        //     9: iload           11
        //    11: ifne            87
        //    14: invokevirtual   de/me/death/g.i:()Z
        //    17: ifeq            83
        //    20: goto            24
        //    23: athrow         
        //    24: iconst_0       
        //    25: istore_1       
        //    26: iload           11
        //    28: ifeq            63
        //    31: getstatic       uiztfzghuzt/nb.a:Z
        //    34: ifeq            46
        //    37: goto            41
        //    40: athrow         
        //    41: iconst_0       
        //    42: goto            47
        //    45: athrow         
        //    46: iconst_1       
        //    47: putstatic       uiztfzghuzt/nb.a:Z
        //    50: aload_0        
        //    51: invokevirtual   de/me/death/w.b:()V
        //    54: ldc2_w          1890
        //    57: invokestatic    java/lang/Thread.sleep:(J)V
        //    60: iinc            1, 1
        //    63: iload_1        
        //    64: aload_0        
        //    65: getfield        de/me/death/w.c:Lde/me/death/g;
        //    68: invokevirtual   de/me/death/g.a:()I
        //    71: if_icmplt       50
        //    74: iload           11
        //    76: ifne            60
        //    79: goto            83
        //    82: astore_1       
        //    83: aload_0        
        //    84: getfield        de/me/death/w.c:Lde/me/death/g;
        //    87: invokevirtual   de/me/death/g.r:()Lde/me/death/b;
        //    90: getstatic       de/me/death/b.NONE:Lde/me/death/b;
        //    93: if_acmpeq       136
        //    96: new             Luiztfzghuzt/lg;
        //    99: dup            
        //   100: aload_0        
        //   101: getfield        de/me/death/w.c:Lde/me/death/g;
        //   104: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //   107: aload_0        
        //   108: getfield        de/me/death/w.c:Lde/me/death/g;
        //   111: invokevirtual   de/me/death/g.n:()I
        //   114: invokespecial   uiztfzghuzt/lg.<init>:(Ljava/lang/String;I)V
        //   117: astore_2       
        //   118: aload_2        
        //   119: aload_0        
        //   120: getfield        de/me/death/w.l:Lde/me/death/ab;
        //   123: sipush          5000
        //   126: invokevirtual   uiztfzghuzt/lg.a:(Luiztfzghuzt/fg;I)V
        //   129: aload_2        
        //   130: astore_1       
        //   131: iload           11
        //   133: ifeq            158
        //   136: new             Ljava/net/Socket;
        //   139: dup            
        //   140: aload_0        
        //   141: getfield        de/me/death/w.c:Lde/me/death/g;
        //   144: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //   147: aload_0        
        //   148: getfield        de/me/death/w.c:Lde/me/death/g;
        //   151: invokevirtual   de/me/death/g.n:()I
        //   154: invokespecial   java/net/Socket.<init>:(Ljava/lang/String;I)V
        //   157: astore_1       
        //   158: aload_1        
        //   159: sipush          5000
        //   162: invokevirtual   java/net/Socket.setSoTimeout:(I)V
        //   165: new             Ljava/io/DataOutputStream;
        //   168: dup            
        //   169: aload_1        
        //   170: invokevirtual   java/net/Socket.getOutputStream:()Ljava/io/OutputStream;
        //   173: invokespecial   java/io/DataOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   176: astore_2       
        //   177: new             Ljava/io/DataInputStream;
        //   180: dup            
        //   181: aload_1        
        //   182: invokevirtual   java/net/Socket.getInputStream:()Ljava/io/InputStream;
        //   185: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //   188: astore_3       
        //   189: aload_0        
        //   190: aload_2        
        //   191: invokevirtual   de/me/death/w.a:(Ljava/io/DataOutputStream;)V
        //   194: aload_0        
        //   195: aload_2        
        //   196: invokevirtual   de/me/death/w.b:(Ljava/io/DataOutputStream;)V
        //   199: aload_0        
        //   200: aload_3        
        //   201: invokevirtual   de/me/death/w.b:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   204: astore          4
        //   206: aload_0        
        //   207: aload           4
        //   209: invokevirtual   de/me/death/w.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   212: astore          5
        //   214: aload           4
        //   216: getfield        de/me/death/a.a:I
        //   219: iload           11
        //   221: ifne            360
        //   224: iconst_2       
        //   225: if_icmpeq       353
        //   228: goto            232
        //   231: athrow         
        //   232: aload           4
        //   234: getfield        de/me/death/a.a:I
        //   237: iload           11
        //   239: ifne            337
        //   242: goto            246
        //   245: athrow         
        //   246: ifne            328
        //   249: goto            253
        //   252: athrow         
        //   253: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   256: aload           5
        //   258: ldc             Luiztfzghuzt/fb;.class
        //   260: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   263: checkcast       Luiztfzghuzt/fb;
        //   266: astore          7
        //   268: aload_0        
        //   269: aload           7
        //   271: invokevirtual   de/me/death/w.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //   274: astore          6
        //   276: goto            296
        //   279: astore          7
        //   281: aload           5
        //   283: iconst_1       
        //   284: aload           5
        //   286: invokevirtual   java/lang/String.length:()I
        //   289: iconst_1       
        //   290: isub           
        //   291: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   294: astore          6
        //   296: aload_0        
        //   297: new             Ljava/lang/StringBuilder;
        //   300: dup            
        //   301: ldc             "[Bot: "
        //   303: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   306: aload           6
        //   308: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   311: ldc             "]"
        //   313: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   316: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   319: iconst_1       
        //   320: invokevirtual   de/me/death/w.a:(Ljava/lang/String;Z)V
        //   323: iload           11
        //   325: ifeq            352
        //   328: aload           4
        //   330: getfield        de/me/death/a.a:I
        //   333: goto            337
        //   336: athrow         
        //   337: iconst_1       
        //   338: if_icmpne       352
        //   341: aload_0        
        //   342: ldc             "[Bot: This server is an premium server!]"
        //   344: iconst_1       
        //   345: invokevirtual   de/me/death/w.a:(Ljava/lang/String;Z)V
        //   348: goto            352
        //   351: athrow         
        //   352: return         
        //   353: aload_0        
        //   354: getfield        de/me/death/w.c:Lde/me/death/g;
        //   357: invokevirtual   de/me/death/g.j:()Z
        //   360: iload           11
        //   362: ifne            598
        //   365: ifeq            562
        //   368: goto            372
        //   371: athrow         
        //   372: aload_0        
        //   373: aload_3        
        //   374: invokevirtual   de/me/death/w.b:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   377: astore          6
        //   379: aload           6
        //   381: ifnull          372
        //   384: aload           6
        //   386: getfield        de/me/death/a.a:I
        //   389: bipush          64
        //   391: iload           11
        //   393: ifne            505
        //   396: if_icmpne       499
        //   399: goto            403
        //   402: athrow         
        //   403: aload_0        
        //   404: aload           6
        //   406: invokevirtual   de/me/death/w.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   409: astore          7
        //   411: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   414: aload           7
        //   416: ldc             Luiztfzghuzt/fb;.class
        //   418: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   421: checkcast       Luiztfzghuzt/fb;
        //   424: astore          9
        //   426: aload_0        
        //   427: aload           9
        //   429: invokevirtual   de/me/death/w.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //   432: astore          8
        //   434: goto            470
        //   437: astore          9
        //   439: aload           7
        //   441: aload           7
        //   443: ldc             "\""
        //   445: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   448: iconst_1       
        //   449: iadd           
        //   450: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   453: astore          10
        //   455: aload           10
        //   457: iconst_0       
        //   458: aload           10
        //   460: ldc             "\""
        //   462: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   465: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   468: astore          8
        //   470: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   473: new             Ljava/lang/StringBuilder;
        //   476: dup            
        //   477: ldc             "[Bot: "
        //   479: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   482: aload           8
        //   484: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   487: ldc             "]"
        //   489: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   492: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   495: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   498: return         
        //   499: aload           6
        //   501: getfield        de/me/death/a.a:I
        //   504: iconst_5       
        //   505: if_icmpne       372
        //   508: aload           6
        //   510: invokevirtual   de/me/death/a.readLong:()J
        //   513: lstore          7
        //   515: aload_0        
        //   516: lload           7
        //   518: bipush          38
        //   520: lshr           
        //   521: l2d            
        //   522: putfield        de/me/death/w.f:D
        //   525: aload_0        
        //   526: lload           7
        //   528: bipush          26
        //   530: lshl           
        //   531: bipush          52
        //   533: lshr           
        //   534: l2d            
        //   535: putfield        de/me/death/w.g:D
        //   538: aload_0        
        //   539: lload           7
        //   541: bipush          38
        //   543: lshl           
        //   544: bipush          38
        //   546: lshr           
        //   547: l2d            
        //   548: putfield        de/me/death/w.h:D
        //   551: aload_0        
        //   552: iload           11
        //   554: ifne            404
        //   557: aload_2        
        //   558: iconst_0       
        //   559: invokevirtual   de/me/death/w.b:(Ljava/io/DataOutputStream;Z)V
        //   562: aload_0        
        //   563: new             Ljava/lang/StringBuilder;
        //   566: dup            
        //   567: ldc             "[Bot: "
        //   569: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   572: aload_0        
        //   573: getfield        de/me/death/w.b:Ljava/lang/String;
        //   576: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   579: ldc             " Joined The Server!]"
        //   581: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   584: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   587: iconst_0       
        //   588: invokevirtual   de/me/death/w.a:(Ljava/lang/String;Z)V
        //   591: aload_0        
        //   592: getfield        de/me/death/w.c:Lde/me/death/g;
        //   595: invokevirtual   de/me/death/g.h:()Z
        //   598: iload           11
        //   600: ifne            627
        //   603: ifeq            620
        //   606: goto            610
        //   609: athrow         
        //   610: aload_0        
        //   611: aload_2        
        //   612: iconst_0       
        //   613: invokevirtual   de/me/death/w.a:(Ljava/io/DataOutputStream;Z)V
        //   616: goto            620
        //   619: athrow         
        //   620: aload_0        
        //   621: getfield        de/me/death/w.c:Lde/me/death/g;
        //   624: invokevirtual   de/me/death/g.g:()Z
        //   627: iload           11
        //   629: ifne            799
        //   632: ifeq            792
        //   635: goto            639
        //   638: athrow         
        //   639: aload_0        
        //   640: getfield        de/me/death/w.c:Lde/me/death/g;
        //   643: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   646: iload           11
        //   648: ifne            698
        //   651: goto            655
        //   654: athrow         
        //   655: ifnull          682
        //   658: goto            662
        //   661: athrow         
        //   662: aload_0        
        //   663: aload_0        
        //   664: getfield        de/me/death/w.c:Lde/me/death/g;
        //   667: invokevirtual   de/me/death/g.m:()Ljava/lang/String;
        //   670: aload_2        
        //   671: iconst_0       
        //   672: sipush          1000
        //   675: invokevirtual   de/me/death/w.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   678: goto            682
        //   681: athrow         
        //   682: aload_0        
        //   683: iload           11
        //   685: ifne            702
        //   688: getfield        de/me/death/w.c:Lde/me/death/g;
        //   691: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   694: goto            698
        //   697: athrow         
        //   698: ifnull          717
        //   701: aload_0        
        //   702: aload_0        
        //   703: getfield        de/me/death/w.c:Lde/me/death/g;
        //   706: invokevirtual   de/me/death/g.l:()Ljava/lang/String;
        //   709: aload_2        
        //   710: iconst_0       
        //   711: sipush          1000
        //   714: invokevirtual   de/me/death/w.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   717: iconst_0       
        //   718: istore          6
        //   720: iload           11
        //   722: ifeq            780
        //   725: aload_0        
        //   726: getfield        de/me/death/w.c:Lde/me/death/g;
        //   729: invokevirtual   de/me/death/g.k:()Ljava/lang/String;
        //   732: ldc             ";"
        //   734: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   737: dup            
        //   738: astore          10
        //   740: arraylength    
        //   741: istore          9
        //   743: iconst_0       
        //   744: istore          8
        //   746: iload           11
        //   748: ifeq            770
        //   751: aload           10
        //   753: iload           8
        //   755: aaload         
        //   756: astore          7
        //   758: aload_0        
        //   759: aload           7
        //   761: aload_2        
        //   762: iconst_0       
        //   763: iconst_0       
        //   764: invokevirtual   de/me/death/w.a:(Ljava/lang/String;Ljava/io/DataOutputStream;ZI)V
        //   767: iinc            8, 1
        //   770: iload           8
        //   772: iload           9
        //   774: if_icmplt       751
        //   777: iinc            6, 1
        //   780: iload           6
        //   782: aload_0        
        //   783: getfield        de/me/death/w.c:Lde/me/death/g;
        //   786: invokevirtual   de/me/death/g.o:()I
        //   789: if_icmplt       725
        //   792: aload_0        
        //   793: getfield        de/me/death/w.c:Lde/me/death/g;
        //   796: invokevirtual   de/me/death/g.f:()Z
        //   799: iload           11
        //   801: ifne            831
        //   804: ifeq            1042
        //   807: goto            811
        //   810: athrow         
        //   811: aload_0        
        //   812: iload           11
        //   814: ifne            878
        //   817: goto            821
        //   820: athrow         
        //   821: getfield        de/me/death/w.c:Lde/me/death/g;
        //   824: invokevirtual   de/me/death/g.p:()I
        //   827: goto            831
        //   830: athrow         
        //   831: bipush          30
        //   833: if_icmpgt       873
        //   836: aload_0        
        //   837: getfield        de/me/death/w.e:I
        //   840: iload           11
        //   842: ifne            864
        //   845: goto            849
        //   848: athrow         
        //   849: iflt            1042
        //   852: goto            856
        //   855: athrow         
        //   856: aload_0        
        //   857: getfield        de/me/death/w.e:I
        //   860: goto            864
        //   863: athrow         
        //   864: i2l            
        //   865: invokestatic    java/lang/Thread.sleep:(J)V
        //   868: iload           11
        //   870: ifeq            1042
        //   873: aload_0        
        //   874: goto            878
        //   877: athrow         
        //   878: aload_3        
        //   879: invokevirtual   de/me/death/w.b:(Ljava/io/DataInputStream;)Lde/me/death/a;
        //   882: astore          6
        //   884: aload           6
        //   886: ifnull          873
        //   889: aload           6
        //   891: getfield        de/me/death/a.a:I
        //   894: iload           11
        //   896: ifne            942
        //   899: ifne            937
        //   902: goto            906
        //   905: athrow         
        //   906: invokestatic    uiztfzghuzt/u.a:()Luiztfzghuzt/t;
        //   909: astore          7
        //   911: aload_0        
        //   912: iconst_0       
        //   913: aload           7
        //   915: invokevirtual   de/me/death/w.a:(ILjava/io/DataOutput;)V
        //   918: aload_0        
        //   919: aload_0        
        //   920: aload           6
        //   922: invokevirtual   de/me/death/w.a:(Ljava/io/InputStream;)I
        //   925: aload           7
        //   927: invokevirtual   de/me/death/w.a:(ILjava/io/DataOutput;)V
        //   930: aload_0        
        //   931: aload           7
        //   933: aload_2        
        //   934: invokevirtual   de/me/death/w.b:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //   937: aload           6
        //   939: getfield        de/me/death/a.a:I
        //   942: bipush          64
        //   944: if_icmpne       873
        //   947: aload_0        
        //   948: aload           6
        //   950: invokevirtual   de/me/death/w.c:(Ljava/io/InputStream;)Ljava/lang/String;
        //   953: astore          8
        //   955: getstatic       de/me/death/Bot.b:Luiztfzghuzt/ab;
        //   958: aload           8
        //   960: ldc             Luiztfzghuzt/fb;.class
        //   962: invokevirtual   uiztfzghuzt/ab.a:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   965: checkcast       Luiztfzghuzt/fb;
        //   968: astore          9
        //   970: aload_0        
        //   971: aload           9
        //   973: invokevirtual   de/me/death/w.a:(Luiztfzghuzt/fb;)Ljava/lang/String;
        //   976: astore          7
        //   978: iload           11
        //   980: ifne            937
        //   983: goto            1003
        //   986: astore          9
        //   988: aload           8
        //   990: iconst_1       
        //   991: aload           8
        //   993: invokevirtual   java/lang/String.length:()I
        //   996: iconst_1       
        //   997: isub           
        //   998: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1001: astore          7
        //  1003: aload_0        
        //  1004: new             Ljava/lang/StringBuilder;
        //  1007: dup            
        //  1008: ldc             "[Bot: "
        //  1010: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1013: aload_0        
        //  1014: getfield        de/me/death/w.b:Ljava/lang/String;
        //  1017: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1020: ldc             " Got Kicked!: "
        //  1022: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1025: aload           7
        //  1027: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1030: ldc             "]"
        //  1032: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1035: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1038: iconst_1       
        //  1039: invokevirtual   de/me/death/w.a:(Ljava/lang/String;Z)V
        //  1042: aload_1        
        //  1043: invokevirtual   java/net/Socket.close:()V
        //  1046: goto            1061
        //  1049: astore_2       
        //  1050: aload_0        
        //  1051: getfield        de/me/death/w.l:Lde/me/death/ab;
        //  1054: invokevirtual   de/me/death/ab.a:()V
        //  1057: aload_1        
        //  1058: invokevirtual   java/net/Socket.close:()V
        //  1061: return         
        //    StackMapTable: 00 58 FF 00 17 00 0C 07 00 02 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 10 00 FF 00 0F 00 0C 07 00 02 01 00 00 00 00 00 00 00 00 00 01 00 01 07 00 10 00 43 07 00 10 00 40 01 02 09 02 FF 00 12 00 0C 07 00 02 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 10 00 43 07 00 18 30 FF 00 15 00 0C 07 00 02 07 00 4B 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 48 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 00 00 00 00 00 01 00 01 07 00 10 00 4C 07 00 10 40 01 45 07 00 10 00 59 07 00 10 FF 00 10 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 07 00 83 07 01 07 00 00 00 01 00 00 FF 00 1F 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 00 00 00 00 00 01 00 00 47 07 00 10 40 01 4D 07 00 10 00 00 46 01 4A 07 00 10 00 FF 00 1D 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 07 00 6F 00 00 00 00 01 00 01 07 00 10 00 40 07 00 02 FF 00 20 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 07 00 6F 07 00 83 00 00 00 01 00 01 07 00 10 FF 00 20 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 07 00 6F 07 00 83 07 00 83 07 01 07 00 01 00 00 FF 00 1C 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 07 00 6F 00 00 00 00 01 00 00 FF 00 05 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 07 00 6F 00 00 00 00 01 00 02 01 01 FF 00 38 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 00 00 00 00 00 01 00 00 63 01 4A 07 00 10 00 48 07 00 10 00 46 01 4A 07 00 10 00 4E 07 00 10 40 07 00 83 45 07 00 10 00 52 07 00 10 00 4E 07 00 10 40 07 00 83 43 07 00 02 0E FF 00 07 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 01 00 00 00 00 01 00 00 FF 00 19 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 01 00 01 01 07 01 08 01 00 00 12 FF 00 09 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 01 00 00 00 00 01 00 00 FF 00 0B 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 00 00 00 00 00 01 00 00 46 01 4A 07 00 10 00 48 07 00 10 40 07 00 02 48 07 00 10 40 01 50 07 00 10 40 01 45 07 00 10 00 46 07 00 10 40 01 08 43 07 00 10 40 07 00 02 FF 00 1A 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 07 00 6F 00 00 00 00 01 00 01 07 00 10 00 1E 44 01 FF 00 2B 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 07 00 6F 00 07 00 83 00 00 01 00 01 07 00 10 FF 00 10 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 07 00 6F 07 00 83 07 00 83 07 01 07 00 01 00 00 FF 00 26 00 0C 07 00 02 07 00 4B 07 00 52 07 00 5B 07 00 6F 07 00 83 00 00 00 00 00 01 00 00 FF 00 06 00 0C 07 00 02 07 00 4B 00 00 00 00 00 00 00 00 00 01 00 01 07 00 10 FF 00 0B 00 0C 07 00 02 07 00 4B 07 01 07 00 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  31     45     45     46     Ljava/lang/Exception;
        //  26     37     40     41     Ljava/lang/Exception;
        //  5      74     82     83     Ljava/lang/Exception;
        //  232    249    252    253    Ljava/lang/Exception;
        //  224    242    245    246    Ljava/lang/Exception;
        //  214    228    231    232    Ljava/lang/Exception;
        //  5      20     23     24     Ljava/lang/Exception;
        //  253    276    279    296    Ljava/lang/Exception;
        //  337    348    351    352    Ljava/lang/Exception;
        //  296    333    336    337    Ljava/lang/Exception;
        //  411    434    437    470    Ljava/lang/Exception;
        //  955    978    986    1003   Ljava/lang/Exception;
        //  165    352    1049   1061   Ljava/lang/Exception;
        //  384    399    402    403    Ljava/lang/Exception;
        //  360    368    371    372    Ljava/lang/Exception;
        //  353    498    1049   1061   Ljava/lang/Exception;
        //  889    902    905    906    Ljava/lang/Exception;
        //  864    874    877    878    Ljava/lang/Exception;
        //  849    860    863    864    Ljava/lang/Exception;
        //  836    852    855    856    Ljava/lang/Exception;
        //  831    845    848    849    Ljava/lang/Exception;
        //  811    827    830    831    Ljava/lang/Exception;
        //  804    817    820    821    Ljava/lang/Exception;
        //  799    807    810    811    Ljava/lang/Exception;
        //  682    694    697    698    Ljava/lang/Exception;
        //  655    678    681    682    Ljava/lang/Exception;
        //  639    658    661    662    Ljava/lang/Exception;
        //  632    651    654    655    Ljava/lang/Exception;
        //  627    635    638    639    Ljava/lang/Exception;
        //  603    616    619    620    Ljava/lang/Exception;
        //  598    606    609    610    Ljava/lang/Exception;
        //  499    1046   1049   1061   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0232:
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
        final String[] array = new String[4];
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = 0));
        String s = "\u0006~\u0012l\tCP]Q\u000fC\u0014.`\u0015PQ\u000f$:";
        int n5 = -1;
        String intern = null;
    Label_0101_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n7;
            final int n6 = n7 = (length = charArray.length);
            int n8 = 0;
            while (true) {
                Label_0177: {
                    if (n6 > 1) {
                        break Label_0177;
                    }
                    length = (n7 = n8);
                    do {
                        final char c = charArray[n7];
                        char c2 = '\0';
                        switch (n8 % 5) {
                            case 0: {
                                c2 = '&';
                                break;
                            }
                            case 1: {
                                c2 = '4';
                                break;
                            }
                            case 2: {
                                c2 = '}';
                                break;
                            }
                            case 3: {
                                c2 = '\u0005';
                                break;
                            }
                            default: {
                                c2 = 'g';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n8;
                    } while (n6 == 0);
                }
                if (n6 > n8) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n5) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = 1)));
                    s = "}v\u0012q]\u0006";
                    n5 = 0;
                    continue Label_0101_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = 2)));
                    s = "\u0006s\u0012qGm]\u001en\u0002B\u0015G%";
                    n5 = 1;
                    continue Label_0101_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = 3)));
                    s = "}v\u0012q]\u0006`\u0015l\u0014\u0006G\u0018w\u0011CF]l\u0014\u0006U\u0013%\u0017TQ\u0010l\u0012K\u0014\u000e`\u0015PQ\u000f$:";
                    n5 = 2;
                    continue Label_0101_Outer;
                }
                case 2: {
                    break Label_0101_Outer;
                }
            }
        }
        array[n4] = intern;
        z = new String[] { " Joined The Server!]", "[Bot: ", " Got Kicked!: ", "[Bot: This server is an premium server!]" };
    }
}
