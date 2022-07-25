// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import java.net.Socket;
import java.util.Iterator;
import uiztfzghuzt.gb;
import uiztfzghuzt.ib;
import uiztfzghuzt.fb;
import uiztfzghuzt.kg;
import java.io.DataOutput;
import uiztfzghuzt.u;
import uiztfzghuzt.t;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.Inflater;
import java.io.DataInput;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public abstract class l extends k implements Cloneable
{
    protected String b;
    protected g c;
    protected boolean d;
    protected int e;
    protected double f;
    protected double g;
    protected double h;
    protected int[] i;
    protected float j;
    protected float k;
    protected ab l;
    public static int m;
    private static final String[] z;
    
    public void a(final String b) {
        this.b = b;
    }
    
    public void a(final ab l) {
        this.l = l;
    }
    
    public l(final String b, final ab l, final g c) {
        this.b = b;
        this.c = c;
        this.e = c.p() * 1000;
        this.l = l;
    }
    
    public abstract void a();
    
    public void a(final DataOutputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: invokestatic    uiztfzghuzt/u.a:()Luiztfzghuzt/t;
        //     7: astore_2       
        //     8: aload_0        
        //     9: iconst_0       
        //    10: aload_2        
        //    11: invokevirtual   de/me/death/l.a:(ILjava/io/DataOutput;)V
        //    14: aload_0        
        //    15: aload_0        
        //    16: getfield        de/me/death/l.c:Lde/me/death/g;
        //    19: invokevirtual   de/me/death/g.q:()Lde/me/death/d;
        //    22: invokevirtual   de/me/death/d.getVersion:()I
        //    25: aload_2        
        //    26: invokevirtual   de/me/death/l.a:(ILjava/io/DataOutput;)V
        //    29: aload_0        
        //    30: iload_3        
        //    31: ifne            111
        //    34: getfield        de/me/death/l.c:Lde/me/death/g;
        //    37: invokevirtual   de/me/death/g.u:()Z
        //    40: ifeq            106
        //    43: goto            47
        //    46: athrow         
        //    47: aload_0        
        //    48: new             Ljava/lang/StringBuilder;
        //    51: dup            
        //    52: aload_0        
        //    53: getfield        de/me/death/l.c:Lde/me/death/g;
        //    56: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //    59: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    62: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    65: ldc             "\u0000"
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: aload_0        
        //    71: getfield        de/me/death/l.c:Lde/me/death/g;
        //    74: invokevirtual   de/me/death/g.v:()Ljava/lang/String;
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: ldc             "\u0000"
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: invokestatic    java/util/UUID.randomUUID:()Ljava/util/UUID;
        //    88: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    91: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    94: aload_2        
        //    95: invokevirtual   de/me/death/l.a:(Ljava/lang/String;Ljava/io/DataOutput;)V
        //    98: iload_3        
        //    99: ifeq            122
        //   102: goto            106
        //   105: athrow         
        //   106: aload_0        
        //   107: goto            111
        //   110: athrow         
        //   111: aload_0        
        //   112: getfield        de/me/death/l.c:Lde/me/death/g;
        //   115: invokevirtual   de/me/death/g.b:()Ljava/lang/String;
        //   118: aload_2        
        //   119: invokevirtual   de/me/death/l.a:(Ljava/lang/String;Ljava/io/DataOutput;)V
        //   122: aload_2        
        //   123: aload_0        
        //   124: getfield        de/me/death/l.c:Lde/me/death/g;
        //   127: invokevirtual   de/me/death/g.n:()I
        //   130: invokeinterface uiztfzghuzt/t.writeShort:(I)V
        //   135: aload_0        
        //   136: iconst_2       
        //   137: aload_2        
        //   138: invokevirtual   de/me/death/l.a:(ILjava/io/DataOutput;)V
        //   141: aload_0        
        //   142: aload_2        
        //   143: aload_1        
        //   144: invokevirtual   de/me/death/l.b:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //   147: goto            151
        //   150: astore_2       
        //   151: return         
        //    StackMapTable: 00 09 FF 00 2E 00 04 07 00 02 07 00 7F 07 00 76 01 00 01 07 00 35 00 79 07 00 35 00 43 07 00 35 40 07 00 02 0A FF 00 1B 00 04 07 00 02 07 00 7F 00 01 00 01 07 00 35 FF 00 00 00 04 07 00 02 07 00 7F 07 00 81 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  47     107    110    111    Ljava/lang/Exception;
        //  34     102    105    106    Ljava/lang/Exception;
        //  8      43     46     47     Ljava/lang/Exception;
        //  4      147    150    151    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0047:
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
    
    public a a(final DataInputStream dataInputStream) {
        final int m = de.me.death.l.m;
        Label_0206: {
            try {
                final l l = this;
                if (m != 0) {
                    return l.b(dataInputStream);
                }
                if (!this.d) {
                    break Label_0206;
                }
            }
            catch (Exception ex) {
                throw ex;
            }
            final int a = this.a(dataInputStream);
            final int[] b = this.b(dataInputStream);
            int n2 = 0;
            Label_0065: {
                Label_0048: {
                    int n;
                    try {
                        n = (n2 = b[0]);
                        if (m != 0) {
                            break Label_0065;
                        }
                        if (n == 0) {
                            break Label_0048;
                        }
                        break Label_0048;
                    }
                    catch (Exception ex2) {
                        throw ex2;
                    }
                    try {
                        if (n == 0) {
                            return this.a(a - b[1], dataInputStream);
                        }
                    }
                    catch (Exception ex3) {
                        throw ex3;
                    }
                }
                n2 = a - b[1];
            }
            final byte[] input = new byte[n2];
            dataInputStream.readFully(input);
            final Inflater inflater = new Inflater();
            inflater.setInput(input);
            byte[] output = new byte[2];
            try {
                inflater.inflate(output);
            }
            catch (Exception ex5) {
                throw new IOException("Couldn't inflate buffer");
            }
            final int a2 = this.a(new ByteArrayInputStream(output));
            Label_0178: {
                try {
                    final boolean a3 = this.a(a2);
                    if (m != 0) {
                        break Label_0178;
                    }
                    if (!a3) {
                        return null;
                    }
                }
                catch (Exception ex4) {
                    throw ex4;
                }
                inflater.reset();
                inflater.setInput(input);
                output = new byte[b[0]];
                try {
                    inflater.inflate(output);
                }
                catch (Exception ex6) {
                    throw new IOException("Couldn't inflate buffer");
                }
            }
            return new a(output);
        }
        final l l = this;
        return l.b(dataInputStream);
    }
    
    public a a(final int n, final DataInput dataInput) {
        final byte[] array = new byte[n];
        dataInput.readFully(array, 0, n);
        final a a = new a(array);
        a.a = this.a(a);
        return a;
    }
    
    public void a(final t t, final DataOutputStream dataOutputStream) {
        final t a = u.a();
        this.a(0, a);
        a.write(t.a());
        final t a2 = u.a();
        this.a(a.a().length, a2);
        a2.write(a.a());
        dataOutputStream.write(a2.a());
        dataOutputStream.flush();
    }
    
    public void b(final t t, final DataOutputStream dataOutputStream) {
        final t a = u.a();
        this.a(t.a().length, a);
        a.write(t.a());
        dataOutputStream.write(a.a());
        dataOutputStream.flush();
    }
    
    public void a(final t t, final DataOutputStream dataOutputStream, final int n) {
        final t a = u.a();
        this.a(0, a);
        a.write(t.a());
        final t a2 = u.a();
        this.a(a.a().length, a2);
        a2.write(a.a());
        dataOutputStream.write(a2.a());
        dataOutputStream.flush();
        this.e -= n;
        Thread.sleep(n);
    }
    
    public void b(final t t, final DataOutputStream dataOutputStream, final int n) {
        final t a = u.a();
        this.a(t.a().length, a);
        a.write(t.a());
        dataOutputStream.write(a.a());
        dataOutputStream.flush();
        this.e -= n;
        Thread.sleep(n);
    }
    
    public a b(final DataInputStream dataInputStream) {
        final int a = this.a(dataInputStream);
        final int[] b = this.b(dataInputStream);
        final int n = b[0];
        int a2 = 0;
        Label_0043: {
            try {
                a2 = (this.a(n) ? 1 : 0);
                if (de.me.death.l.m != 0) {
                    break Label_0043;
                }
                if (a2 == 0) {
                    return null;
                }
            }
            catch (kg kg) {
                throw kg;
            }
            final int n2 = a - b[1];
        }
        final byte[] b2 = new byte[a2];
        dataInputStream.readFully(b2);
        return new a(b2, n);
    }
    
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
        //    10: ifeq            45
        //    13: new             Ljava/util/Random;
        //    16: dup            
        //    17: invokespecial   java/util/Random.<init>:()V
        //    20: astore          6
        //    22: aload           6
        //    24: bipush          9
        //    26: invokevirtual   java/util/Random.nextInt:(I)I
        //    29: istore          7
        //    31: aload           5
        //    33: ldc             "#"
        //    35: iload           7
        //    37: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    40: invokevirtual   java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    43: astore          5
        //    45: aload           5
        //    47: ldc             "#"
        //    49: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    52: ifne            13
        //    55: invokestatic    uiztfzghuzt/u.a:()Luiztfzghuzt/t;
        //    58: astore          6
        //    60: aload_0        
        //    61: iconst_1       
        //    62: aload           6
        //    64: invokevirtual   de/me/death/l.a:(ILjava/io/DataOutput;)V
        //    67: aload_0        
        //    68: aload           5
        //    70: aload           6
        //    72: invokevirtual   de/me/death/l.a:(Ljava/lang/String;Ljava/io/DataOutput;)V
        //    75: iload           8
        //    77: ifne            119
        //    80: iload_3        
        //    81: ifeq            106
        //    84: goto            88
        //    87: athrow         
        //    88: aload_0        
        //    89: aload           6
        //    91: aload_2        
        //    92: iload           4
        //    94: invokevirtual   de/me/death/l.a:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;I)V
        //    97: iload           8
        //    99: ifeq            124
        //   102: goto            106
        //   105: athrow         
        //   106: aload_0        
        //   107: aload           6
        //   109: aload_2        
        //   110: iload           4
        //   112: invokevirtual   de/me/death/l.b:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;I)V
        //   115: goto            119
        //   118: athrow         
        //   119: goto            124
        //   122: astore          5
        //   124: return         
        //    StackMapTable: 00 0A FF 00 0D 00 09 07 00 02 07 00 53 07 00 7F 01 01 07 00 53 00 00 01 00 00 1F FF 00 29 00 09 07 00 02 07 00 53 07 00 7F 01 01 07 00 53 07 00 76 00 01 00 01 07 00 35 00 50 07 00 35 00 4B 07 00 35 00 FF 00 02 00 09 07 00 02 07 00 53 07 00 7F 01 01 00 00 00 01 00 01 07 00 35 FF 00 01 00 09 07 00 02 07 00 53 07 00 7F 01 01 07 00 81 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  88     115    118    119    Ljava/lang/Exception;
        //  80     102    105    106    Ljava/lang/Exception;
        //  60     84     87     88     Ljava/lang/Exception;
        //  5      119    122    124    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0088:
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
        //    10: bipush          22
        //    12: aload_3        
        //    13: invokevirtual   de/me/death/l.a:(ILjava/io/DataOutput;)V
        //    16: aload_0        
        //    17: iconst_2       
        //    18: aload_3        
        //    19: invokevirtual   de/me/death/l.a:(ILjava/io/DataOutput;)V
        //    22: iload           4
        //    24: ifne            60
        //    27: iload_2        
        //    28: ifeq            50
        //    31: goto            35
        //    34: athrow         
        //    35: aload_0        
        //    36: aload_3        
        //    37: aload_1        
        //    38: invokevirtual   de/me/death/l.a:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //    41: iload           4
        //    43: ifeq            64
        //    46: goto            50
        //    49: athrow         
        //    50: aload_0        
        //    51: aload_3        
        //    52: aload_1        
        //    53: invokevirtual   de/me/death/l.b:(Luiztfzghuzt/t;Ljava/io/DataOutputStream;)V
        //    56: goto            60
        //    59: athrow         
        //    60: goto            64
        //    63: astore_3       
        //    64: return         
        //    StackMapTable: 00 08 FF 00 22 00 05 07 00 02 07 00 7F 01 07 00 76 01 00 01 07 00 9F 00 4D 07 00 9F 00 48 07 00 9F 00 FF 00 02 00 05 07 00 02 07 00 7F 01 00 01 00 01 07 00 9F FF 00 00 00 05 07 00 02 07 00 7F 01 07 00 81 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     56     59     60     Ljava/io/IOException;
        //  27     46     49     50     Ljava/io/IOException;
        //  9      31     34     35     Ljava/io/IOException;
        //  5      60     63     64     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    public String a(final fb fb) {
        final int m = de.me.death.l.m;
        final StringBuffer sb = new StringBuffer();
        boolean b = false;
        Label_0370: {
            try {
                b = fb.b();
                if (m != 0) {
                    break Label_0370;
                }
                if (!b) {
                    break Label_0370;
                }
            }
            catch (kg kg) {
                throw kg;
            }
            final ib ib = (ib)fb;
            ib ib2 = null;
            String s3 = null;
            Label_0262: {
                boolean b3 = false;
                Label_0246: {
                    Label_0227: {
                        boolean a = false;
                        Label_0215: {
                            Label_0204: {
                                try {
                                    final boolean b2 = a = (b3 = ib.a("translate"));
                                    if (m != 0) {
                                        break Label_0215;
                                    }
                                    if (!b2) {
                                        break Label_0204;
                                    }
                                }
                                catch (kg kg2) {
                                    throw kg2;
                                }
                                String s = ib.b("translate").h();
                                Label_0199: {
                                    Label_0192: {
                                        try {
                                            if (m != 0) {
                                                break Label_0199;
                                            }
                                            if (!ib.a("with")) {
                                                break Label_0192;
                                            }
                                        }
                                        catch (kg kg3) {
                                            throw kg3;
                                        }
                                        final gb f = ib.b("with").f();
                                        final String[] args = new String[f.a()];
                                        int n = 0;
                                        while (true) {
                                            Label_0175: {
                                                if (m == 0) {
                                                    break Label_0175;
                                                }
                                                final fb a2;
                                                final fb fb2 = a2 = f.a(n);
                                                String s2 = null;
                                                Label_0165: {
                                                    if (m == 0) {
                                                        Label_0154: {
                                                            if (!a2.b()) {
                                                                break Label_0154;
                                                            }
                                                            s2 = this.a(fb2.e());
                                                            try {
                                                                if (m == 0) {
                                                                    break Label_0165;
                                                                }
                                                            }
                                                            catch (kg kg4) {
                                                                throw kg4;
                                                            }
                                                        }
                                                    }
                                                    s2 = a2.h();
                                                }
                                                args[n] = s2;
                                                ++n;
                                            }
                                            if (n < args.length) {
                                                continue;
                                            }
                                            break;
                                        }
                                        s = String.format(s, (Object[])args);
                                    }
                                    sb.append(s);
                                    try {
                                        if (m == 0) {
                                            break Label_0246;
                                        }
                                        b3 = (a = ib.a("text"));
                                    }
                                    catch (kg kg5) {
                                        throw kg5;
                                    }
                                }
                            }
                            try {
                                if (m != 0) {
                                    break Label_0262;
                                }
                                if (a) {
                                    break Label_0227;
                                }
                                break Label_0246;
                            }
                            catch (kg kg6) {
                                throw kg6;
                            }
                        }
                        try {
                            if (a) {
                                sb.append(ib.b("text").h());
                            }
                        }
                        catch (kg kg7) {
                            throw kg7;
                        }
                    }
                    try {
                        ib2 = ib;
                        s3 = "extra";
                        if (m != 0) {
                            break Label_0262;
                        }
                        b3 = ib2.a(s3);
                    }
                    catch (kg kg8) {
                        throw kg8;
                    }
                }
                try {
                    if (!b3) {
                        return sb.toString();
                    }
                }
                catch (kg kg9) {
                    throw kg9;
                }
            }
            final Iterator<fb> iterator = ib2.b(s3).f().iterator();
            while (true) {
                Label_0355: {
                    if (m == 0) {
                        break Label_0355;
                    }
                    final fb fb3 = iterator.next();
                    Label_0341: {
                        if (m == 0) {
                            try {
                                if (!fb3.b()) {
                                    break Label_0341;
                                }
                                sb.append(this.a(fb3.e()));
                            }
                            catch (kg kg10) {
                                throw kg10;
                            }
                        }
                        try {
                            if (m != 0) {
                                sb.append(fb3.h());
                            }
                        }
                        catch (kg kg11) {
                            throw kg11;
                        }
                    }
                }
                if (iterator.hasNext()) {
                    continue;
                }
                break;
            }
            return sb.toString();
            try {
                final fb fb4 = fb;
                if (m != 0) {
                    return fb4.h();
                }
                fb.a();
            }
            catch (kg kg12) {
                throw kg12;
            }
        }
        if (b) {
            String s4 = null;
        Label_0411_Outer:
            while (true) {
                final Iterator<fb> iterator2 = fb.f().iterator();
                while (true) {
                    while (true) {
                        Label_0425: {
                            Object o;
                            try {
                                if (m == 0) {
                                    break Label_0425;
                                }
                                o = iterator2.next();
                            }
                            catch (kg kg13) {
                                throw kg13;
                            }
                            sb.append(this.a((fb)o));
                        }
                        if (iterator2.hasNext()) {
                            continue Label_0411_Outer;
                        }
                        break;
                    }
                    Object o;
                    s4 = (String)(o = sb.toString());
                    if (m == 0) {
                        break;
                    }
                    continue;
                }
            }
            return s4;
        }
        final fb fb4 = fb;
        return fb4.h();
    }
    
    public void b(final DataOutputStream dataOutputStream) {
        final t a = u.a();
        this.a(0, a);
        this.a(this.b, a);
        this.b(a, dataOutputStream);
    }
    
    public void b() {
        final int m = de.me.death.l.m;
        int n = 0;
        while (true) {
            while (true) {
                Label_0261: {
                    if (m == 0) {
                        break Label_0261;
                    }
                    try {
                        Socket socket = null;
                        Label_0078: {
                            if (this.c.r() != de.me.death.b.NONE) {
                                socket = new hb(this.c.b(), this.c.n(), this.l);
                                if (m == 0) {
                                    break Label_0078;
                                }
                            }
                            socket = new Socket(this.c.b(), this.c.n());
                        }
                        final DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                        final DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                        final long n2 = System.nanoTime() / 1000000L;
                        final t a = u.a();
                        this.a(0, a);
                        this.a(this.c.q().getVersion(), a);
                        this.a(this.c.b(), a);
                        a.writeShort(this.c.n());
                        this.a(1, a);
                        this.b(a, dataOutputStream);
                        final t a2 = u.a();
                        this.a(0, a2);
                        this.b(a2, dataOutputStream);
                        this.b(dataInputStream);
                        final t a3 = u.a();
                        this.a(1, a3);
                        a3.writeLong(n2);
                        this.b(a3, dataOutputStream);
                        this.b(dataInputStream);
                        socket.close();
                        Thread.sleep(800L);
                    }
                    catch (Exception ex) {}
                    ++n;
                }
                if (n < this.c.a()) {
                    continue;
                }
                break;
            }
            if (m == 0) {
                return;
            }
            continue;
        }
    }
    
    protected void b(final DataOutputStream dataOutputStream, final boolean b) {
        if (this.c.j()) {
            final t a = u.a();
            l l = null;
            Label_0109: {
                Label_0100: {
                    try {
                        l = this;
                        if (de.me.death.l.m != 0) {
                            break Label_0109;
                        }
                        final int n = 6;
                        final t t = a;
                        this.a(n, t);
                        final t t2 = a;
                        final l i = this;
                        final double n2 = i.f;
                        final double n3 = 0.15;
                        final double n4 = n2 - n3;
                        t2.writeDouble(n4);
                        final t t3 = a;
                        final l j = this;
                        final double n5 = j.g;
                        t3.writeDouble(n5);
                        final t t4 = a;
                        final l k = this;
                        final double n6 = k.h;
                        final double n7 = 0.15;
                        final double n8 = n6 + n7;
                        t4.writeDouble(n8);
                        final t t5 = a;
                        final l m = this;
                        final float n9 = m.j;
                        t5.writeFloat(n9);
                        final t t6 = a;
                        final l l2 = this;
                        final float n10 = l2.k;
                        t6.writeFloat(n10);
                        final t t7 = a;
                        final boolean b2 = false;
                        t7.writeBoolean(b2);
                        final boolean b3 = b;
                        if (b3) {
                            break Label_0100;
                        }
                        break Label_0100;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        final int n = 6;
                        final t t = a;
                        this.a(n, t);
                        final t t2 = a;
                        final l i = this;
                        final double n2 = i.f;
                        final double n3 = 0.15;
                        final double n4 = n2 - n3;
                        t2.writeDouble(n4);
                        final t t3 = a;
                        final l j = this;
                        final double n5 = j.g;
                        t3.writeDouble(n5);
                        final t t4 = a;
                        final l k = this;
                        final double n6 = k.h;
                        final double n7 = 0.15;
                        final double n8 = n6 + n7;
                        t4.writeDouble(n8);
                        final t t5 = a;
                        final l m = this;
                        final float n9 = m.j;
                        t5.writeFloat(n9);
                        final t t6 = a;
                        final l l2 = this;
                        final float n10 = l2.k;
                        t6.writeFloat(n10);
                        final t t7 = a;
                        final boolean b2 = false;
                        t7.writeBoolean(b2);
                        final boolean b3 = b;
                        if (b3) {
                            this.a(a, dataOutputStream);
                            return;
                        }
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                l = this;
            }
            l.b(a, dataOutputStream);
        }
    }
    
    @Override
    public abstract String toString();
    
    public void a(final String p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: iload           6
        //     7: ifne            42
        //    10: getstatic       de/me/death/Bot.c:Z
        //    13: iload_2        
        //    14: if_icmpeq       31
        //    17: goto            21
        //    20: athrow         
        //    21: getstatic       de/me/death/Bot.c:Z
        //    24: ifeq            187
        //    27: goto            31
        //    30: athrow         
        //    31: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //    34: aload_1        
        //    35: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //    38: goto            42
        //    41: athrow         
        //    42: getstatic       de/me/death/Bot.a:Lde/me/death/Bot;
        //    45: iload           6
        //    47: ifne            77
        //    50: getfield        de/me/death/Bot.f:Ljava/io/PrintStream;
        //    53: ifnull          74
        //    56: goto            60
        //    59: athrow         
        //    60: getstatic       de/me/death/Bot.a:Lde/me/death/Bot;
        //    63: getfield        de/me/death/Bot.f:Ljava/io/PrintStream;
        //    66: aload_1        
        //    67: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //    70: goto            74
        //    73: athrow         
        //    74: getstatic       de/me/death/Bot.a:Lde/me/death/Bot;
        //    77: iload           6
        //    79: ifne            99
        //    82: invokevirtual   de/me/death/Bot.h:()Ljavax/swing/JTextArea;
        //    85: ifnull          187
        //    88: goto            92
        //    91: athrow         
        //    92: getstatic       de/me/death/Bot.a:Lde/me/death/Bot;
        //    95: goto            99
        //    98: athrow         
        //    99: invokevirtual   de/me/death/Bot.g:()Ljavax/swing/JScrollPane;
        //   102: invokevirtual   javax/swing/JScrollPane.getVerticalScrollBar:()Ljavax/swing/JScrollBar;
        //   105: astore_3       
        //   106: aload_3        
        //   107: invokevirtual   javax/swing/JScrollBar.getValue:()I
        //   110: iload           6
        //   112: ifne            131
        //   115: aload_3        
        //   116: invokevirtual   javax/swing/JScrollBar.getMaximum:()I
        //   119: if_icmpne       134
        //   122: goto            126
        //   125: athrow         
        //   126: iconst_1       
        //   127: goto            131
        //   130: athrow         
        //   131: goto            135
        //   134: iconst_0       
        //   135: istore          4
        //   137: getstatic       de/me/death/Bot.a:Lde/me/death/Bot;
        //   140: invokevirtual   de/me/death/Bot.h:()Ljavax/swing/JTextArea;
        //   143: astore          5
        //   145: aload           5
        //   147: new             Ljava/lang/StringBuilder;
        //   150: dup            
        //   151: aload_1        
        //   152: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   155: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   158: ldc_w           "\n"
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   167: invokevirtual   javax/swing/JTextArea.append:(Ljava/lang/String;)V
        //   170: iload           4
        //   172: ifeq            187
        //   175: aload_3        
        //   176: aload_3        
        //   177: invokevirtual   javax/swing/JScrollBar.getMaximum:()I
        //   180: invokevirtual   javax/swing/JScrollBar.setValue:(I)V
        //   183: goto            187
        //   186: athrow         
        //   187: return         
        //    StackMapTable: 00 17 FF 00 14 00 07 07 00 02 07 00 53 01 00 00 00 01 00 01 07 00 CE 00 48 07 00 CE 00 49 07 00 CE 00 50 07 00 CE 00 4C 07 00 CE 00 42 07 01 7E 4D 07 00 CE 00 45 07 00 CE 40 07 01 7E FF 00 19 00 07 07 00 02 07 00 53 01 07 01 9C 00 00 01 00 01 07 00 CE 00 43 07 00 CE 40 01 02 40 01 FF 00 32 00 07 07 00 02 07 00 53 01 07 01 9C 01 07 01 A6 01 00 01 07 00 CE FF 00 00 00 07 07 00 02 07 00 53 01 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  145    183    186    187    Luiztfzghuzt/kg;
        //  115    127    130    131    Luiztfzghuzt/kg;
        //  106    122    125    126    Luiztfzghuzt/kg;
        //  82     95     98     99     Luiztfzghuzt/kg;
        //  77     88     91     92     Luiztfzghuzt/kg;
        //  50     70     73     74     Luiztfzghuzt/kg;
        //  42     56     59     60     Luiztfzghuzt/kg;
        //  21     38     41     42     Luiztfzghuzt/kg;
        //  10     27     30     31     Luiztfzghuzt/kg;
        //  5      17     20     21     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0021:
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
    
    protected boolean a(final int n) {
        int n4 = 0;
    Label_0030_Outer:
        while (true) {
            final int m = de.me.death.l.m;
            final int[] i;
            final int length = (i = this.i).length;
            int n2 = 0;
            while (true) {
                while (true) {
                    Label_0050: {
                        int n3;
                        try {
                            if (m == 0) {
                                break Label_0050;
                            }
                            n3 = i[n2];
                        }
                        catch (kg kg) {
                            throw kg;
                        }
                        n4 = n3;
                        if (m != 0) {
                            break;
                        }
                        Label_0047: {
                            try {
                                if (n4 != n) {
                                    break Label_0047;
                                }
                            }
                            catch (kg kg2) {
                                throw kg2;
                            }
                            break;
                        }
                        ++n2;
                    }
                    if (n2 < length) {
                        continue Label_0030_Outer;
                    }
                    break;
                }
                int n3;
                final int n5 = n3 = 0;
                if (m == 0) {
                    return n5 != 0;
                }
                continue;
            }
        }
        return n4 != 0;
    }
    
    static {
        final String[] array = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "s\u0015\u0014(";
        int n6 = -1;
        String intern = null;
    Label_0121_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0198: {
                    if (n7 > 1) {
                        break Label_0198;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = '\u0007';
                                break;
                            }
                            case 1: {
                                c2 = 'p';
                                break;
                            }
                            case 2: {
                                c2 = 'l';
                                break;
                            }
                            case 3: {
                                c2 = '\\';
                                break;
                            }
                            default: {
                                c2 = 'U';
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
                    s = "s\u0002\r2&k\u0011\u00189";
                    n6 = 0;
                    continue Label_0121_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "b\b\u0018.4";
                    n6 = 1;
                    continue Label_0121_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "p\u0019\u00184";
                    n6 = 2;
                    continue Label_0121_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "D\u001f\u001901iW\u0018|<i\u0016\u0000=!bP\u000e)3a\u0015\u001e";
                    n6 = 3;
                    continue Label_0121_Outer;
                }
                case 3: {
                    break Label_0121_Outer;
                }
            }
        }
        array[n5] = intern;
        z = new String[] { "text", "translate", "extra", "with", "Couldn't inflate buffer" };
    }
}
