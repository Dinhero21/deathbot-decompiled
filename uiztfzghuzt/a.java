// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.io.ByteArrayOutputStream;
import java.util.zip.Inflater;
import java.io.InputStream;
import java.io.DataInputStream;

public class a extends DataInputStream
{
    private gg a;
    private static final String[] z;
    
    public a(final InputStream in, final gg a) {
        super(in);
        this.a = a;
    }
    
    public <P extends hg> P a(final Class<P> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: aload_0        
        //     6: invokevirtual   uiztfzghuzt/a.readInt:()I
        //     9: istore_2       
        //    10: iload_2        
        //    11: iload           9
        //    13: ifne            73
        //    16: ldc             25000000
        //    18: if_icmple       72
        //    21: goto            25
        //    24: athrow         
        //    25: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //    28: new             Ljava/lang/StringBuilder;
        //    31: dup            
        //    32: ldc             "Versuch: "
        //    34: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    37: iload_2        
        //    38: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    41: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    44: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //    47: new             Ljava/io/IOException;
        //    50: dup            
        //    51: new             Ljava/lang/StringBuilder;
        //    54: dup            
        //    55: ldc             "Packet too long: "
        //    57: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    60: iload_2        
        //    61: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    64: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    67: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    70: athrow         
        //    71: athrow         
        //    72: iload_2        
        //    73: newarray        B
        //    75: astore_3       
        //    76: aload_0        
        //    77: aload_3        
        //    78: invokevirtual   uiztfzghuzt/a.readFully:([B)V
        //    81: new             Ljava/io/DataInputStream;
        //    84: dup            
        //    85: new             Ljava/io/ByteArrayInputStream;
        //    88: dup            
        //    89: aload_3        
        //    90: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //    93: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    96: astore          4
        //    98: aload           4
        //   100: invokevirtual   java/io/DataInputStream.readBoolean:()Z
        //   103: istore          5
        //   105: iload_2        
        //   106: iconst_1       
        //   107: isub           
        //   108: newarray        B
        //   110: astore          6
        //   112: aload           4
        //   114: aload           6
        //   116: invokevirtual   java/io/DataInputStream.readFully:([B)V
        //   119: aload_0        
        //   120: aload           6
        //   122: invokespecial   uiztfzghuzt/a.a:([B)[B
        //   125: astore          6
        //   127: iload           5
        //   129: iload           9
        //   131: ifne            229
        //   134: ifeq            206
        //   137: goto            141
        //   140: athrow         
        //   141: aload_0        
        //   142: getfield        uiztfzghuzt/a.a:Luiztfzghuzt/gg;
        //   145: iload           9
        //   147: ifne            176
        //   150: goto            154
        //   153: athrow         
        //   154: ifnonnull       172
        //   157: goto            161
        //   160: athrow         
        //   161: new             Ljava/io/IOException;
        //   164: dup            
        //   165: ldc             "This packet is encrypted"
        //   167: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   170: athrow         
        //   171: athrow         
        //   172: aload_0        
        //   173: getfield        uiztfzghuzt/a.a:Luiztfzghuzt/gg;
        //   176: aload           6
        //   178: invokevirtual   uiztfzghuzt/gg.b:([B)[B
        //   181: astore          6
        //   183: goto            198
        //   186: astore          7
        //   188: new             Ljava/io/IOException;
        //   191: dup            
        //   192: ldc             "Wrong password"
        //   194: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   197: athrow         
        //   198: aload_0        
        //   199: aload           6
        //   201: invokespecial   uiztfzghuzt/a.a:([B)[B
        //   204: astore          6
        //   206: new             Ljava/io/DataInputStream;
        //   209: dup            
        //   210: new             Ljava/io/ByteArrayInputStream;
        //   213: dup            
        //   214: aload           6
        //   216: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //   219: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //   222: astore          4
        //   224: aload           4
        //   226: invokevirtual   java/io/DataInputStream.readInt:()I
        //   229: pop            
        //   230: aload_1        
        //   231: iconst_0       
        //   232: anewarray       Ljava/lang/Class;
        //   235: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   238: astore          7
        //   240: aload           7
        //   242: iconst_1       
        //   243: invokevirtual   java/lang/reflect/Constructor.setAccessible:(Z)V
        //   246: aload           7
        //   248: iconst_0       
        //   249: anewarray       Ljava/lang/Object;
        //   252: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   255: checkcast       Luiztfzghuzt/hg;
        //   258: astore          8
        //   260: aload           8
        //   262: aload           4
        //   264: invokevirtual   uiztfzghuzt/hg.a:(Ljava/io/DataInputStream;)V
        //   267: aload           8
        //   269: iload           9
        //   271: ifeq            293
        //   274: getstatic       uiztfzghuzt/nb.a:Z
        //   277: ifeq            289
        //   280: goto            284
        //   283: athrow         
        //   284: iconst_0       
        //   285: goto            290
        //   288: athrow         
        //   289: iconst_1       
        //   290: putstatic       uiztfzghuzt/nb.a:Z
        //   293: areturn        
        //    Signature:
        //  <P:Luiztfzghuzt/hg;>(Ljava/lang/Class<TP;>;)TP;
        //    StackMapTable: 00 18 FF 00 18 00 0A 07 00 02 07 00 57 01 00 00 00 00 00 00 01 00 01 07 00 12 00 6D 07 00 12 00 40 01 FF 00 42 00 0A 07 00 02 07 00 57 01 07 00 71 07 00 04 01 07 00 71 00 00 01 00 01 07 00 12 00 4B 07 00 12 40 07 00 4F 45 07 00 12 00 49 07 00 12 00 43 07 00 4F 49 07 00 12 0B 07 56 01 FF 00 35 00 0A 07 00 02 07 00 57 01 07 00 71 07 00 04 01 07 00 71 07 00 5D 07 00 14 01 00 01 07 00 12 40 07 00 14 43 07 00 12 40 07 00 14 FF 00 00 00 0A 07 00 02 07 00 57 01 07 00 71 07 00 04 01 07 00 71 07 00 5D 07 00 14 01 00 02 07 00 14 01 42 07 00 14
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  154    171    171    172    Ljava/lang/Exception;
        //  141    157    160    161    Ljava/lang/Exception;
        //  134    150    153    154    Ljava/lang/Exception;
        //  127    137    140    141    Ljava/lang/Exception;
        //  16     71     71     72     Ljava/lang/Exception;
        //  10     21     24     25     Ljava/lang/Exception;
        //  172    183    186    198    Ljava/lang/Exception;
        //  274    288    288    289    Ljava/lang/Exception;
        //  260    280    283    284    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0141:
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
    
    private byte[] a(final byte[] input) {
        final int a = hg.a;
        final Inflater inflater = new Inflater();
        inflater.setInput(input);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(input.length);
        final byte[] array = new byte[1024];
        while (true) {
            Label_0057: {
                if (a == 0) {
                    break Label_0057;
                }
                byteArrayOutputStream.write(array, 0, inflater.inflate(array));
            }
            if (inflater.finished()) {
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            continue;
        }
    }
    
    static {
        final String[] array = new String[4];
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = 0));
        String s = "}qpuUH|8&";
        int n5 = -1;
        String intern = null;
    Label_0092_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n7;
            final int n6 = n7 = (length = charArray.length);
            int n8 = 0;
            while (true) {
                Label_0165: {
                    if (n6 > 1) {
                        break Label_0165;
                    }
                    length = (n7 = n8);
                    do {
                        final char c = charArray[n7];
                        char c2 = '\0';
                        switch (n8 % 5) {
                            case 0: {
                                c2 = '+';
                                break;
                            }
                            case 1: {
                                c2 = '\u0014';
                                break;
                            }
                            case 2: {
                                c2 = '\u0002';
                                break;
                            }
                            case 3: {
                                c2 = '\u0006';
                                break;
                            }
                            default: {
                                c2 = ' ';
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
                    s = "{uamE_4viO\u000bxmhG\u00114";
                    n5 = 0;
                    continue Label_0092_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = 2)));
                    s = "|fmhG\u000bdcuS\\{pb";
                    n5 = 1;
                    continue Label_0092_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = 3)));
                    s = "\u007f|ku\u0000[uamE_4ku\u0000NzatY[`gb";
                    n5 = 2;
                    continue Label_0092_Outer;
                }
                case 2: {
                    break Label_0092_Outer;
                }
            }
        }
        array[n4] = intern;
        z = new String[] { "Versuch: ", "Packet too long: ", "Wrong password", "This packet is encrypted" };
    }
}
