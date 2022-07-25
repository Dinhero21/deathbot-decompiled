// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.net.SocketException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.io.IOException;
import java.net.Socket;

public class lg extends Socket
{
    private String a;
    private fg b;
    private int c;
    private static int[] d;
    private static final String[] z;
    
    public lg(final String a, final int c, final fg b) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.a(30000);
    }
    
    public lg(final String a, final int c, final fg b, final int n) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.a(n);
    }
    
    public lg(final String a, final int c) {
        this.a = a;
        this.c = c;
    }
    
    public void a(final fg p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        uiztfzghuzt/lg.b:Luiztfzghuzt/fg;
        //     9: aload_0        
        //    10: new             Ljava/net/InetSocketAddress;
        //    13: dup            
        //    14: aload_1        
        //    15: invokevirtual   uiztfzghuzt/fg.e:()Ljava/lang/String;
        //    18: aload_1        
        //    19: invokevirtual   uiztfzghuzt/fg.f:()I
        //    22: invokespecial   java/net/InetSocketAddress.<init>:(Ljava/lang/String;I)V
        //    25: iload_2        
        //    26: invokevirtual   uiztfzghuzt/lg.connect:(Ljava/net/SocketAddress;I)V
        //    29: aload_0        
        //    30: iload_2        
        //    31: invokevirtual   uiztfzghuzt/lg.setSoTimeout:(I)V
        //    34: iload_3        
        //    35: ifne            85
        //    38: invokestatic    uiztfzghuzt/lg.d:()[I
        //    41: aload_1        
        //    42: invokevirtual   uiztfzghuzt/fg.d:()Luiztfzghuzt/q;
        //    45: invokevirtual   uiztfzghuzt/q.ordinal:()I
        //    48: iaload         
        //    49: tableswitch {
        //                2: 89
        //                3: 101
        //                4: 77
        //          default: 109
        //        }
        //    76: athrow         
        //    77: aload_0        
        //    78: invokespecial   uiztfzghuzt/lg.a:()V
        //    81: goto            85
        //    84: athrow         
        //    85: iload_3        
        //    86: ifeq            109
        //    89: aload_0        
        //    90: invokespecial   uiztfzghuzt/lg.b:()V
        //    93: iload_3        
        //    94: ifeq            109
        //    97: goto            101
        //   100: athrow         
        //   101: aload_0        
        //   102: invokespecial   uiztfzghuzt/lg.c:()V
        //   105: goto            109
        //   108: athrow         
        //   109: return         
        //    StackMapTable: 00 09 FF 00 4C 00 04 07 00 02 07 00 23 01 01 00 01 07 00 21 00 46 07 00 21 00 03 4A 07 00 21 00 46 07 00 21 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  89     105    108    109    Luiztfzghuzt/kg;
        //  85     97     100    101    Luiztfzghuzt/kg;
        //  38     81     84     85     Luiztfzghuzt/kg;
        //  4      76     76     77     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0089:
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
    
    public void a(final int n) {
        final boolean g = fg.g;
        Label_0144: {
            boolean a = false;
            Label_0133: {
                Label_0127: {
                    Label_0113: {
                        Label_0105: {
                            Label_0057: {
                                Label_0019: {
                                    try {
                                        final lg lg = this;
                                        if (g) {
                                            break Label_0057;
                                        }
                                        final fg fg = this.b;
                                        if (fg == null) {
                                            break Label_0019;
                                        }
                                        break Label_0019;
                                    }
                                    catch (kg kg) {
                                        throw kg;
                                    }
                                    try {
                                        final fg fg = this.b;
                                        if (fg == null) {
                                            throw new IOException("Proxy is null");
                                        }
                                    }
                                    catch (kg kg2) {
                                        throw kg2;
                                    }
                                }
                                this.connect(new InetSocketAddress(this.b.e(), this.b.f()), n);
                                final lg lg = this;
                                try {
                                    lg.setSoTimeout(n);
                                    if (g) {
                                        break Label_0113;
                                    }
                                    final int[] array = d();
                                    final lg lg2 = this;
                                    final fg fg2 = lg2.b;
                                    final q q = fg2.d();
                                    final int n2 = q.ordinal();
                                    final int n3 = array[n2];
                                    switch (n3) {
                                        case 3: {
                                            break Label_0105;
                                            break Label_0105;
                                        }
                                        case 1: {
                                            break Label_0144;
                                        }
                                        case 2: {
                                            break Label_0144;
                                            break Label_0144;
                                        }
                                        default: {
                                            return;
                                        }
                                    }
                                }
                                catch (kg kg3) {
                                    throw kg3;
                                }
                            }
                            try {
                                final int[] array = d();
                                final lg lg2 = this;
                                final fg fg2 = lg2.b;
                                final q q = fg2.d();
                                final int n2 = q.ordinal();
                                final int n3 = array[n2];
                                switch (n3) {
                                    case 3: {
                                        this.a();
                                        break;
                                    }
                                    case 1: {
                                        break Label_0144;
                                    }
                                    case 2: {
                                        break Label_0144;
                                        break Label_0144;
                                    }
                                    default: {
                                        return;
                                    }
                                }
                            }
                            catch (kg kg4) {
                                throw kg4;
                            }
                        }
                        try {
                            if (!g) {
                                return;
                            }
                            final boolean b = nb.a;
                            if (b) {
                                break Label_0127;
                            }
                            break Label_0127;
                        }
                        catch (kg kg5) {
                            throw kg5;
                        }
                    }
                    try {
                        final boolean b = nb.a;
                        if (b) {
                            a = false;
                            break Label_0133;
                        }
                    }
                    catch (kg kg6) {
                        throw kg6;
                    }
                }
                a = true;
            }
            nb.a = a;
            try {
                this.b();
                if (g) {
                    this.c();
                }
            }
            catch (kg kg7) {
                throw kg7;
            }
        }
    }
    
    private void a() {
        final boolean g = fg.g;
        final PrintStream printStream = new PrintStream(this.getOutputStream());
        printStream.println("CONNECT " + this.a + ":" + this.c + " HTTP/1.1");
        printStream.println("HOST: " + this.a + ":" + this.c);
        printStream.println();
        printStream.flush();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getInputStream()));
        final StringBuffer sb = new StringBuffer();
        String[] split = null;
        int int1 = 0;
        String message = null;
        int n = 0;
    Label_0147_Outer:
        while (true) {
            while (true) {
                Label_0163: {
                    final String line;
                    if ((line = bufferedReader.readLine()) == null) {
                        break Label_0163;
                    }
                    try {
                        if (line.length() == 0) {
                            if (!g) {
                                break Label_0163;
                            }
                        }
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    sb.append(line);
                    continue Label_0147_Outer;
                }
                split = sb.toString().split("\n")[0].trim().split(" ");
                final String s = split[0];
                int1 = Integer.parseInt(split[1]);
                message = "";
                n = 2;
                if (!g) {
                    break;
                }
                continue;
            }
        }
        int n3 = 0;
        int n4 = 0;
    Label_0258_Outer:
        while (true) {
            while (true) {
                while (true) {
                    Label_0286: {
                        Label_0283: {
                            String string = null;
                            Label_0281: {
                                try {
                                    if (!g) {
                                        break Label_0286;
                                    }
                                    string = String.valueOf(message) + split[n];
                                    if (g) {
                                        break Label_0281;
                                    }
                                }
                                catch (kg kg2) {
                                    throw kg2;
                                }
                                message = string;
                                final int n2 = split.length - 1;
                                if (n3 == n4) {
                                    break Label_0283;
                                }
                                new StringBuilder(String.valueOf(message)).append(" ").toString();
                            }
                            message = string;
                        }
                        ++n;
                    }
                    if (n < split.length) {
                        continue Label_0258_Outer;
                    }
                    break;
                }
                n3 = int1;
                n4 = 200;
                if (!g) {
                    break;
                }
                continue;
            }
        }
        try {
            if (n3 != n4) {
                throw new IOException(message);
            }
        }
        catch (kg kg3) {
            throw kg3;
        }
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: new             Ljava/io/DataOutputStream;
        //     8: dup            
        //     9: aload_0        
        //    10: invokevirtual   uiztfzghuzt/lg.getOutputStream:()Ljava/io/OutputStream;
        //    13: invokespecial   java/io/DataOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    16: astore_1       
        //    17: new             Ljava/io/DataInputStream;
        //    20: dup            
        //    21: aload_0        
        //    22: invokevirtual   uiztfzghuzt/lg.getInputStream:()Ljava/io/InputStream;
        //    25: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    28: astore_2       
        //    29: aload_1        
        //    30: iconst_4       
        //    31: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //    34: aload_1        
        //    35: iconst_1       
        //    36: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //    39: aload_1        
        //    40: aload_0        
        //    41: getfield        uiztfzghuzt/lg.c:I
        //    44: invokevirtual   java/io/DataOutputStream.writeShort:(I)V
        //    47: aload_1        
        //    48: iload           6
        //    50: ifne            108
        //    53: aload_0        
        //    54: getfield        uiztfzghuzt/lg.a:Ljava/lang/String;
        //    57: invokestatic    java/net/InetAddress.getByName:(Ljava/lang/String;)Ljava/net/InetAddress;
        //    60: invokevirtual   java/net/InetAddress.getAddress:()[B
        //    63: invokevirtual   java/io/DataOutputStream.write:([B)V
        //    66: aload_0        
        //    67: getfield        uiztfzghuzt/lg.b:Luiztfzghuzt/fg;
        //    70: invokevirtual   uiztfzghuzt/fg.c:()Z
        //    73: ifeq            103
        //    76: goto            80
        //    79: athrow         
        //    80: aload_1        
        //    81: aload_0        
        //    82: getfield        uiztfzghuzt/lg.b:Luiztfzghuzt/fg;
        //    85: invokevirtual   uiztfzghuzt/fg.a:()Ljava/lang/String;
        //    88: invokevirtual   java/lang/String.getBytes:()[B
        //    91: invokevirtual   java/io/DataOutputStream.write:([B)V
        //    94: iload           6
        //    96: ifeq            112
        //    99: goto            103
        //   102: athrow         
        //   103: aload_1        
        //   104: goto            108
        //   107: athrow         
        //   108: iconst_0       
        //   109: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //   112: aload_1        
        //   113: invokevirtual   java/io/DataOutputStream.flush:()V
        //   116: aload_2        
        //   117: invokevirtual   java/io/DataInputStream.readByte:()B
        //   120: istore_3       
        //   121: aload_2        
        //   122: invokevirtual   java/io/DataInputStream.readByte:()B
        //   125: istore          4
        //   127: iload_3        
        //   128: iload           6
        //   130: ifne            142
        //   133: ifne            156
        //   136: goto            140
        //   139: athrow         
        //   140: iload           4
        //   142: iload           6
        //   144: ifne            176
        //   147: bipush          90
        //   149: if_icmpeq       165
        //   152: goto            156
        //   155: athrow         
        //   156: new             Ljava/net/SocketException;
        //   159: dup            
        //   160: invokespecial   java/net/SocketException.<init>:()V
        //   163: athrow         
        //   164: athrow         
        //   165: aload_2        
        //   166: invokevirtual   java/io/DataInputStream.read:()I
        //   169: pop            
        //   170: aload_2        
        //   171: invokevirtual   java/io/DataInputStream.read:()I
        //   174: pop            
        //   175: iconst_4       
        //   176: newarray        B
        //   178: astore          5
        //   180: aload_2        
        //   181: aload           5
        //   183: invokevirtual   java/io/DataInputStream.read:([B)I
        //   186: pop            
        //   187: return         
        //    StackMapTable: 00 0F FF 00 4F 00 07 07 00 02 07 00 B3 07 00 B6 00 00 00 01 00 01 07 00 21 00 55 07 00 21 00 43 07 00 21 40 07 00 B3 03 FF 00 1A 00 07 07 00 02 07 00 B3 07 00 B6 01 01 00 01 00 01 07 00 21 00 41 01 4C 07 00 21 00 47 07 00 21 00 4A 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  147    164    164    165    Luiztfzghuzt/kg;
        //  142    152    155    156    Luiztfzghuzt/kg;
        //  127    136    139    140    Luiztfzghuzt/kg;
        //  80     104    107    108    Luiztfzghuzt/kg;
        //  53     99     102    103    Luiztfzghuzt/kg;
        //  29     76     79     80     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0080:
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
    
    private void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: new             Ljava/io/DataOutputStream;
        //     8: dup            
        //     9: aload_0        
        //    10: invokevirtual   uiztfzghuzt/lg.getOutputStream:()Ljava/io/OutputStream;
        //    13: invokespecial   java/io/DataOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    16: astore_1       
        //    17: new             Ljava/io/DataInputStream;
        //    20: dup            
        //    21: aload_0        
        //    22: invokevirtual   uiztfzghuzt/lg.getInputStream:()Ljava/io/InputStream;
        //    25: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    28: astore_2       
        //    29: aload_1        
        //    30: iconst_5       
        //    31: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //    34: iload           5
        //    36: ifne            86
        //    39: aload_0        
        //    40: getfield        uiztfzghuzt/lg.b:Luiztfzghuzt/fg;
        //    43: invokevirtual   uiztfzghuzt/fg.c:()Z
        //    46: ifeq            77
        //    49: goto            53
        //    52: athrow         
        //    53: aload_1        
        //    54: iconst_2       
        //    55: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //    58: aload_1        
        //    59: iconst_0       
        //    60: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //    63: aload_1        
        //    64: iconst_2       
        //    65: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //    68: iload           5
        //    70: ifeq            91
        //    73: goto            77
        //    76: athrow         
        //    77: aload_1        
        //    78: iconst_1       
        //    79: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //    82: goto            86
        //    85: athrow         
        //    86: aload_1        
        //    87: iconst_0       
        //    88: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //    91: aload_1        
        //    92: invokevirtual   java/io/DataOutputStream.flush:()V
        //    95: aload_2        
        //    96: invokevirtual   java/io/DataInputStream.readByte:()B
        //    99: pop            
        //   100: aload_2        
        //   101: invokevirtual   java/io/DataInputStream.readByte:()B
        //   104: istore_3       
        //   105: iload_3        
        //   106: iload           5
        //   108: ifne            199
        //   111: iconst_2       
        //   112: if_icmpne       129
        //   115: goto            119
        //   118: athrow         
        //   119: aload_0        
        //   120: aload_1        
        //   121: aload_2        
        //   122: invokespecial   uiztfzghuzt/lg.a:(Ljava/io/DataOutputStream;Ljava/io/DataInputStream;)V
        //   125: goto            129
        //   128: athrow         
        //   129: aload_1        
        //   130: iconst_5       
        //   131: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //   134: aload_1        
        //   135: iconst_1       
        //   136: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //   139: aload_1        
        //   140: iconst_0       
        //   141: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //   144: aload_1        
        //   145: iconst_3       
        //   146: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //   149: aload_1        
        //   150: aload_0        
        //   151: getfield        uiztfzghuzt/lg.a:Ljava/lang/String;
        //   154: invokevirtual   java/lang/String.length:()I
        //   157: invokevirtual   java/io/DataOutputStream.writeByte:(I)V
        //   160: aload_1        
        //   161: aload_0        
        //   162: getfield        uiztfzghuzt/lg.a:Ljava/lang/String;
        //   165: invokevirtual   java/io/DataOutputStream.writeBytes:(Ljava/lang/String;)V
        //   168: aload_1        
        //   169: aload_0        
        //   170: getfield        uiztfzghuzt/lg.c:I
        //   173: invokevirtual   java/io/DataOutputStream.writeShort:(I)V
        //   176: aload_1        
        //   177: invokevirtual   java/io/DataOutputStream.flush:()V
        //   180: aload_2        
        //   181: invokevirtual   java/io/DataInputStream.readByte:()B
        //   184: pop            
        //   185: aload_2        
        //   186: invokevirtual   java/io/DataInputStream.readByte:()B
        //   189: pop            
        //   190: aload_2        
        //   191: invokevirtual   java/io/DataInputStream.readByte:()B
        //   194: pop            
        //   195: aload_2        
        //   196: invokevirtual   java/io/DataInputStream.readByte:()B
        //   199: istore          4
        //   201: aload_0        
        //   202: iload           4
        //   204: aload_2        
        //   205: invokespecial   uiztfzghuzt/lg.a:(ILjava/io/DataInputStream;)V
        //   208: aload_2        
        //   209: invokevirtual   java/io/DataInputStream.readUnsignedShort:()I
        //   212: pop            
        //   213: return         
        //    StackMapTable: 00 0C FF 00 34 00 06 07 00 02 07 00 B3 07 00 B6 00 00 01 00 01 07 00 21 00 56 07 00 21 00 47 07 00 21 00 04 FF 00 1A 00 06 07 00 02 07 00 B3 07 00 B6 01 00 01 00 01 07 00 21 00 48 07 00 21 00 F7 00 45 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  111    125    128    129    Luiztfzghuzt/kg;
        //  105    115    118    119    Luiztfzghuzt/kg;
        //  53     82     85     86     Luiztfzghuzt/kg;
        //  39     73     76     77     Luiztfzghuzt/kg;
        //  29     49     52     53     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    
    private void a(final int p0, final DataInputStream p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: iload_1        
        //     6: iconst_1       
        //     7: iload           4
        //     9: ifne            48
        //    12: if_icmpne       33
        //    15: goto            19
        //    18: athrow         
        //    19: iconst_4       
        //    20: newarray        B
        //    22: astore_3       
        //    23: aload_2        
        //    24: aload_3        
        //    25: invokevirtual   java/io/DataInputStream.readFully:([B)V
        //    28: iload           4
        //    30: ifeq            82
        //    33: iload_1        
        //    34: iload           4
        //    36: ifne            74
        //    39: goto            43
        //    42: athrow         
        //    43: iconst_3       
        //    44: goto            48
        //    47: athrow         
        //    48: if_icmpne       68
        //    51: aload_2        
        //    52: invokevirtual   java/io/DataInputStream.readByte:()B
        //    55: newarray        B
        //    57: astore_3       
        //    58: aload_2        
        //    59: aload_3        
        //    60: invokevirtual   java/io/DataInputStream.readFully:([B)V
        //    63: iload           4
        //    65: ifeq            82
        //    68: bipush          16
        //    70: goto            74
        //    73: athrow         
        //    74: newarray        B
        //    76: astore_3       
        //    77: aload_2        
        //    78: aload_3        
        //    79: invokevirtual   java/io/DataInputStream.readFully:([B)V
        //    82: return         
        //    StackMapTable: 00 0B FF 00 12 00 05 07 00 02 01 07 00 B6 00 01 00 01 07 00 21 00 0D 48 07 00 21 40 01 43 07 00 21 FF 00 00 00 05 07 00 02 01 07 00 B6 00 01 00 02 01 01 13 44 07 00 21 40 01 FF 00 07 00 05 07 00 02 01 07 00 B6 07 00 F2 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  58     70     73     74     Luiztfzghuzt/kg;
        //  33     44     47     48     Luiztfzghuzt/kg;
        //  23     39     42     43     Luiztfzghuzt/kg;
        //  5      15     18     19     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
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
    
    private void a(final DataOutputStream dataOutputStream, final DataInputStream dataInputStream) {
        boolean g = false;
        int byte1 = 0;
    Label_0050_Outer:
        while (true) {
            g = fg.g;
            dataOutputStream.writeByte(1);
            dataOutputStream.writeByte(this.b.a().length());
            byte1 = 0;
            while (true) {
                while (true) {
                    Label_0053: {
                        try {
                            if (!g) {
                                break Label_0053;
                            }
                            dataOutputStream.writeByte(this.b.a().charAt(byte1));
                        }
                        catch (kg kg) {
                            throw kg;
                        }
                        ++byte1;
                    }
                    if (byte1 < this.b.a().length()) {
                        continue Label_0050_Outer;
                    }
                    break;
                }
                dataOutputStream.writeByte(this.b.b().length());
                byte1 = 0;
                if (!g) {
                    break;
                }
                continue;
            }
        }
    Label_0112_Outer:
        while (true) {
            while (true) {
                while (true) {
                    Label_0115: {
                        try {
                            if (!g) {
                                break Label_0115;
                            }
                            dataOutputStream.writeByte(this.b.b().charAt(byte1));
                        }
                        catch (kg kg2) {
                            throw kg2;
                        }
                        ++byte1;
                    }
                    if (byte1 < this.b.b().length()) {
                        continue Label_0112_Outer;
                    }
                    break;
                }
                dataOutputStream.flush();
                dataInputStream.readByte();
                byte1 = dataInputStream.readByte();
                if (!g) {
                    break;
                }
                continue;
            }
        }
        try {
            if (byte1 != 0) {
                throw new SocketException("Couldn't login: " + byte1);
            }
        }
        catch (kg kg3) {
            throw kg3;
        }
    }
    
    static int[] d() {
        int[] d = null;
        Label_0026: {
            Label_0019: {
                int[] array;
                try {
                    array = (d = lg.d);
                    if (fg.g) {
                        break Label_0026;
                    }
                    if (array != null) {
                        return array;
                    }
                    break Label_0019;
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    throw noSuchFieldError;
                }
                try {
                    if (array != null) {
                        return array;
                    }
                }
                catch (NoSuchFieldError noSuchFieldError2) {
                    throw noSuchFieldError2;
                }
            }
            d = new int[q.values().length];
        }
        final int[] d2 = d;
        try {
            d2[q.HTTPS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            d2[q.SOCKS4.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            d2[q.SOCKS5.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        return lg.d = d2;
    }
    
    static {
        final String[] array = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "\u00114?\u001aO\u0011/Q";
        int n6 = -1;
        String intern = null;
    Label_0118_Outer:
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
                                c2 = 'R';
                                break;
                            }
                            case 1: {
                                c2 = '{';
                                break;
                            }
                            case 2: {
                                c2 = 'q';
                                break;
                            }
                            case 3: {
                                c2 = 'T';
                                break;
                            }
                            default: {
                                c2 = '\n';
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
                    s = "r3%\u0000Z}J_e";
                    n6 = 0;
                    continue Label_0118_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "\u001a4\"\u00000r";
                    n6 = 1;
                    continue Label_0118_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "\u0002\t\u001e,sr\u0012\u0002td'\u0017\u001d";
                    n6 = 2;
                    continue Label_0118_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "\u0011\u0014\u00048n<\\\u0005tf=\u001c\u0018:0r";
                    n6 = 3;
                    continue Label_0118_Outer;
                }
                case 3: {
                    break Label_0118_Outer;
                }
            }
        }
        array[n5] = intern;
        z = new String[] { "CONNECT ", " HTTP/1.1", "HOST: ", "Proxy is null", "Couldn't login: " };
    }
}
