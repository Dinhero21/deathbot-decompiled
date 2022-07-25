// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import javax.swing.JTextArea;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.IOException;
import uiztfzghuzt.w;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.FileReader;
import uiztfzghuzt.q;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.net.URL;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import uiztfzghuzt.nb;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;

public class j
{
    private ArrayList<ab> a;
    private int b;
    private ArrayList<ab> c;
    private ArrayList<ab> d;
    private ArrayList<String> e;
    private AtomicInteger f;
    private AtomicInteger g;
    private File h;
    private File i;
    private File j;
    private static int[] k;
    public static boolean l;
    private static final String[] z;
    
    public j() {
        final boolean l = de.me.death.j.l;
        this.f = new AtomicInteger(0);
        this.g = new AtomicInteger(0);
        this.d();
        this.c();
        this.b = 9999;
        if (nb.a) {
            boolean i = false;
            Label_0063: {
                try {
                    if (l) {
                        i = false;
                        break Label_0063;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                i = true;
            }
            de.me.death.j.l = i;
        }
    }
    
    public synchronized ab a() {
        ab o;
        try {
            o = this.a.get(this.g.getAndIncrement());
        }
        catch (IndexOutOfBoundsException ex3) {
            try {
                this.g.set(0);
                o = this.a.get(this.g.getAndIncrement());
            }
            catch (IndexOutOfBoundsException ex4) {
                throw new RuntimeException("No proxies are loaded!");
            }
        }
        Label_0083: {
            ab ab;
            try {
                final ab ab2;
                ab = (ab2 = o);
                if (de.me.death.j.l) {
                    return ab2;
                }
                final j j = this;
                final int n = j.b;
                final boolean b = ab.b(n);
                if (b) {
                    break Label_0083;
                }
                return o;
            }
            catch (IndexOutOfBoundsException ex) {
                throw ex;
            }
            try {
                final j j = this;
                final int n = j.b;
                final boolean b = ab.b(n);
                if (b) {
                    this.a.remove(o);
                    return this.a();
                }
            }
            catch (IndexOutOfBoundsException ex2) {
                throw ex2;
            }
        }
        return o;
    }
    
    public synchronized String b() {
        String s;
        try {
            s = this.e.get(this.f.getAndIncrement());
        }
        catch (IndexOutOfBoundsException ex) {
            try {
                this.f.set(0);
                s = this.e.get(this.f.getAndIncrement());
            }
            catch (IndexOutOfBoundsException ex2) {
                throw new RuntimeException("No nicks are loaded!");
            }
        }
        return s;
    }
    
    private void c() {
        final boolean l = de.me.death.j.l;
        this.e = new ArrayList<String>();
        final File file = new File("Nicks.txt");
        Label_0166: {
            Label_0087: {
                try {
                    final boolean exists = file.exists();
                    if (l) {
                        break Label_0087;
                    }
                    if (!exists) {
                        break Label_0087;
                    }
                }
                catch (Exception ex) {
                    throw ex;
                }
                try {
                    this.e.addAll(this.a(file));
                    break Label_0166;
                }
                catch (Exception obj) {
                    obj.printStackTrace();
                    System.err.println("Couldn't load nicks list: " + obj);
                    if (!l) {
                        break Label_0166;
                    }
                }
                try {
                    this.e.addAll(this.f());
                }
                catch (Exception ex2) {
                    System.err.println("Couldn't download nicks list: " + ex2.getLocalizedMessage());
                }
            }
            try {
                this.b(file, this.e);
            }
            catch (Exception ex3) {
                System.err.println("Couldn't save nicks list: " + ex3.getLocalizedMessage());
            }
        }
        Collections.shuffle(this.e);
    }
    
    private void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: new             Ljava/util/ArrayList;
        //     8: dup            
        //     9: invokespecial   java/util/ArrayList.<init>:()V
        //    12: putfield        de/me/death/j.a:Ljava/util/ArrayList;
        //    15: aload_0        
        //    16: new             Ljava/util/ArrayList;
        //    19: dup            
        //    20: invokespecial   java/util/ArrayList.<init>:()V
        //    23: putfield        de/me/death/j.c:Ljava/util/ArrayList;
        //    26: aload_0        
        //    27: new             Ljava/util/ArrayList;
        //    30: dup            
        //    31: invokespecial   java/util/ArrayList.<init>:()V
        //    34: putfield        de/me/death/j.d:Ljava/util/ArrayList;
        //    37: new             Ljava/util/ArrayList;
        //    40: dup            
        //    41: invokespecial   java/util/ArrayList.<init>:()V
        //    44: astore_1       
        //    45: aload_0        
        //    46: new             Ljava/io/File;
        //    49: dup            
        //    50: ldc             "SSLProxies.txt"
        //    52: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    55: putfield        de/me/death/j.h:Ljava/io/File;
        //    58: aload_0        
        //    59: new             Ljava/io/File;
        //    62: dup            
        //    63: ldc             "S4Proxies.txt"
        //    65: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    68: putfield        de/me/death/j.i:Ljava/io/File;
        //    71: aload_0        
        //    72: new             Ljava/io/File;
        //    75: dup            
        //    76: ldc             "S5Proxies.txt"
        //    78: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    81: putfield        de/me/death/j.j:Ljava/io/File;
        //    84: aload_0        
        //    85: getfield        de/me/death/j.h:Ljava/io/File;
        //    88: invokevirtual   java/io/File.exists:()Z
        //    91: iload_3        
        //    92: ifne            166
        //    95: ifeq            155
        //    98: goto            102
        //   101: athrow         
        //   102: aload_0        
        //   103: getfield        de/me/death/j.c:Ljava/util/ArrayList;
        //   106: aload_0        
        //   107: aload_0        
        //   108: getfield        de/me/death/j.h:Ljava/io/File;
        //   111: getstatic       uiztfzghuzt/q.HTTPS:Luiztfzghuzt/q;
        //   114: invokespecial   de/me/death/j.a:(Ljava/io/File;Luiztfzghuzt/q;)Ljava/util/ArrayList;
        //   117: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   120: pop            
        //   121: goto            237
        //   124: athrow         
        //   125: astore_2       
        //   126: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   129: new             Ljava/lang/StringBuilder;
        //   132: dup            
        //   133: ldc             "Couldn't load ssl list: "
        //   135: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   138: aload_2        
        //   139: invokevirtual   java/io/IOException.getLocalizedMessage:()Ljava/lang/String;
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   148: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   151: iload_3        
        //   152: ifeq            237
        //   155: aload_0        
        //   156: getfield        de/me/death/j.c:Ljava/util/ArrayList;
        //   159: aload_0        
        //   160: invokespecial   de/me/death/j.e:()Ljava/util/ArrayList;
        //   163: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   166: pop            
        //   167: goto            196
        //   170: astore_2       
        //   171: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   174: new             Ljava/lang/StringBuilder;
        //   177: dup            
        //   178: ldc             "Couldn't download ssl list: "
        //   180: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   183: aload_2        
        //   184: invokevirtual   java/io/IOException.getLocalizedMessage:()Ljava/lang/String;
        //   187: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   190: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   193: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   196: aload_0        
        //   197: aload_0        
        //   198: getfield        de/me/death/j.h:Ljava/io/File;
        //   201: aload_0        
        //   202: getfield        de/me/death/j.c:Ljava/util/ArrayList;
        //   205: invokespecial   de/me/death/j.a:(Ljava/io/File;Ljava/util/ArrayList;)V
        //   208: goto            237
        //   211: astore_2       
        //   212: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   215: new             Ljava/lang/StringBuilder;
        //   218: dup            
        //   219: ldc             "Couldn't save ssl list: "
        //   221: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   224: aload_2        
        //   225: invokevirtual   java/io/IOException.getLocalizedMessage:()Ljava/lang/String;
        //   228: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   231: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   234: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   237: aload_0        
        //   238: getfield        de/me/death/j.i:Ljava/io/File;
        //   241: invokevirtual   java/io/File.exists:()Z
        //   244: iload_3        
        //   245: ifne            325
        //   248: ifeq            308
        //   251: goto            255
        //   254: athrow         
        //   255: aload_0        
        //   256: getfield        de/me/death/j.d:Ljava/util/ArrayList;
        //   259: aload_0        
        //   260: aload_0        
        //   261: getfield        de/me/death/j.i:Ljava/io/File;
        //   264: getstatic       uiztfzghuzt/q.SOCKS4:Luiztfzghuzt/q;
        //   267: invokespecial   de/me/death/j.a:(Ljava/io/File;Luiztfzghuzt/q;)Ljava/util/ArrayList;
        //   270: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   273: pop            
        //   274: goto            397
        //   277: athrow         
        //   278: astore_2       
        //   279: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   282: new             Ljava/lang/StringBuilder;
        //   285: dup            
        //   286: ldc             "Couldn't load socks4 list: "
        //   288: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   291: aload_2        
        //   292: invokevirtual   java/io/IOException.getLocalizedMessage:()Ljava/lang/String;
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   301: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   304: iload_3        
        //   305: ifeq            397
        //   308: aload_1        
        //   309: aload_0        
        //   310: invokespecial   de/me/death/j.g:()Ljava/util/ArrayList;
        //   313: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   316: pop            
        //   317: aload_0        
        //   318: getfield        de/me/death/j.d:Ljava/util/ArrayList;
        //   321: aload_1        
        //   322: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   325: pop            
        //   326: goto            355
        //   329: astore_2       
        //   330: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   333: new             Ljava/lang/StringBuilder;
        //   336: dup            
        //   337: ldc             "Couldn't download socks4 list: "
        //   339: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   342: aload_2        
        //   343: invokevirtual   java/io/IOException.getLocalizedMessage:()Ljava/lang/String;
        //   346: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   349: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   352: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   355: aload_0        
        //   356: aload_0        
        //   357: getfield        de/me/death/j.i:Ljava/io/File;
        //   360: aload_1        
        //   361: invokespecial   de/me/death/j.a:(Ljava/io/File;Ljava/util/ArrayList;)V
        //   364: aload_1        
        //   365: invokevirtual   java/util/ArrayList.clear:()V
        //   368: goto            397
        //   371: astore_2       
        //   372: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   375: new             Ljava/lang/StringBuilder;
        //   378: dup            
        //   379: ldc             "Couldn't save socks4 list: "
        //   381: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   384: aload_2        
        //   385: invokevirtual   java/io/IOException.getLocalizedMessage:()Ljava/lang/String;
        //   388: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   391: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   394: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   397: aload_0        
        //   398: getfield        de/me/death/j.j:Ljava/io/File;
        //   401: invokevirtual   java/io/File.exists:()Z
        //   404: iload_3        
        //   405: ifne            485
        //   408: ifeq            468
        //   411: goto            415
        //   414: athrow         
        //   415: aload_0        
        //   416: getfield        de/me/death/j.d:Ljava/util/ArrayList;
        //   419: aload_0        
        //   420: aload_0        
        //   421: getfield        de/me/death/j.j:Ljava/io/File;
        //   424: getstatic       uiztfzghuzt/q.SOCKS5:Luiztfzghuzt/q;
        //   427: invokespecial   de/me/death/j.a:(Ljava/io/File;Luiztfzghuzt/q;)Ljava/util/ArrayList;
        //   430: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   433: pop            
        //   434: goto            555
        //   437: athrow         
        //   438: astore_2       
        //   439: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   442: new             Ljava/lang/StringBuilder;
        //   445: dup            
        //   446: ldc             "Couldn't load socks5 list: "
        //   448: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   451: aload_2        
        //   452: invokevirtual   java/io/IOException.getLocalizedMessage:()Ljava/lang/String;
        //   455: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   458: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   461: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   464: iload_3        
        //   465: ifeq            555
        //   468: aload_1        
        //   469: aload_0        
        //   470: invokespecial   de/me/death/j.h:()Ljava/util/ArrayList;
        //   473: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   476: pop            
        //   477: aload_0        
        //   478: getfield        de/me/death/j.d:Ljava/util/ArrayList;
        //   481: aload_1        
        //   482: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   485: pop            
        //   486: goto            515
        //   489: astore_2       
        //   490: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   493: new             Ljava/lang/StringBuilder;
        //   496: dup            
        //   497: ldc             "Couldn't download socks5 list: "
        //   499: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   502: aload_2        
        //   503: invokevirtual   java/io/IOException.getLocalizedMessage:()Ljava/lang/String;
        //   506: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   509: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   512: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   515: aload_0        
        //   516: aload_0        
        //   517: getfield        de/me/death/j.j:Ljava/io/File;
        //   520: aload_1        
        //   521: invokespecial   de/me/death/j.a:(Ljava/io/File;Ljava/util/ArrayList;)V
        //   524: aconst_null    
        //   525: astore_1       
        //   526: goto            555
        //   529: astore_2       
        //   530: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   533: new             Ljava/lang/StringBuilder;
        //   536: dup            
        //   537: ldc             "Couldn't save socks5 list: "
        //   539: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   542: aload_2        
        //   543: invokevirtual   java/io/IOException.getLocalizedMessage:()Ljava/lang/String;
        //   546: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   549: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   552: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   555: return         
        //    StackMapTable: 00 1E FF 00 65 00 04 07 00 02 07 00 40 00 01 00 01 07 00 A3 00 55 07 00 1E 40 07 00 A3 1D 4A 01 43 07 00 A3 19 4E 07 00 A3 19 50 07 00 A3 00 55 07 00 1E 40 07 00 A3 1D 50 01 43 07 00 A3 19 4F 07 00 A3 19 50 07 00 A3 00 55 07 00 1E 40 07 00 A3 1D 50 01 43 07 00 A3 19 4D 07 00 A3 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  45     98     101    102    Ljava/io/IOException;
        //  102    121    125    155    Ljava/io/IOException;
        //  95     124    124    125    Ljava/lang/RuntimeException;
        //  155    167    170    196    Ljava/io/IOException;
        //  196    208    211    237    Ljava/io/IOException;
        //  237    251    254    255    Ljava/io/IOException;
        //  255    274    278    308    Ljava/io/IOException;
        //  248    277    277    278    Ljava/lang/RuntimeException;
        //  308    326    329    355    Ljava/io/IOException;
        //  355    368    371    397    Ljava/io/IOException;
        //  397    411    414    415    Ljava/io/IOException;
        //  415    434    438    468    Ljava/io/IOException;
        //  408    437    437    438    Ljava/lang/RuntimeException;
        //  468    486    489    515    Ljava/io/IOException;
        //  515    526    529    555    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0102:
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
    
    private ArrayList<ab> e() {
        final boolean l = de.me.death.j.l;
        final ArrayList<ab> list = new ArrayList<ab>();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("http://pcdomain.tk/DeathBot/files/SSLProxies.txt").openStream(), Charset.forName("UTF-8")));
        while (true) {
            final String line;
            final String s = line = bufferedReader.readLine();
            Label_0150: {
                try {
                    if (s != null) {
                        break Label_0150;
                    }
                    bufferedReader.close();
                    if (l) {
                        break Label_0150;
                    }
                }
                catch (Exception ex) {
                    throw ex;
                }
                break;
                try {
                    String s2 = null;
                    String s3 = null;
                    Label_0155: {
                        try {
                            s2 = line;
                            s3 = "@";
                            if (l) {
                                break Label_0155;
                            }
                            if (!s2.contains(s3)) {
                                break Label_0150;
                            }
                        }
                        catch (Exception ex2) {
                            throw ex2;
                        }
                        list.add(new ab(q.HTTPS, line.split("@")[0].split(":")[0], Integer.parseInt(line.split("@")[0].split(":")[1]), line.split("@")[1], ""));
                        if (!l) {
                            continue;
                        }
                    }
                    list.add(new ab(q.HTTPS, s2.split(s3)[0], Integer.parseInt(line.split(":")[1])));
                }
                catch (Exception ex3) {}
            }
        }
        return list;
    }
    
    private ArrayList<ab> a(final File file, final q q) {
        final boolean l = de.me.death.j.l;
        final ArrayList<ab> list = new ArrayList<ab>();
        final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (true) {
            final String line;
            final String s = line = bufferedReader.readLine();
            Label_0154: {
                try {
                    if (s != null) {
                        break Label_0154;
                    }
                    bufferedReader.close();
                    if (l) {
                        break Label_0154;
                    }
                }
                catch (Exception ex) {
                    throw ex;
                }
                break;
                try {
                    ab e = null;
                    Label_0195: {
                        String s2 = null;
                        String s3 = null;
                        Label_0159: {
                            try {
                                s2 = line;
                                s3 = "@";
                                if (l) {
                                    break Label_0159;
                                }
                                if (!s2.contains(s3)) {
                                    break Label_0154;
                                }
                            }
                            catch (Exception ex2) {
                                throw ex2;
                            }
                            e = new ab(q, line.split("@")[0].split(":")[0], Integer.parseInt(line.split("@")[0].split(":")[1]), line.split("@")[1].split(":")[0], line.split("@")[1].split(":")[1]);
                            if (!l) {
                                break Label_0195;
                            }
                        }
                        e = new ab(q, s2.split(s3)[0], Integer.parseInt(line.split(":")[1]));
                    }
                    list.add(e);
                }
                catch (Exception ex3) {}
            }
        }
        return list;
    }
    
    private ArrayList<String> a(final File file) {
        final boolean l = de.me.death.j.l;
        final ArrayList<String> list = new ArrayList<String>();
        final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<String> list2;
        while (true) {
            final String line = bufferedReader.readLine();
            Label_0033: {
                try {
                    if (line != null) {
                        break Label_0033;
                    }
                    bufferedReader.close();
                    final ArrayList<String> list3;
                    list2 = (list3 = list);
                    if (l) {
                        break Label_0033;
                    }
                }
                catch (Exception ex) {
                    throw ex;
                }
                break;
                try {
                    final ArrayList<String> list3 = list;
                    list3.add(line);
                }
                catch (Exception ex2) {}
            }
        }
        return list2;
    }
    
    private void a(final File file, final ArrayList<ab> list) {
        final boolean l = de.me.death.j.l;
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(file);
        }
        catch (Exception ex2) {
            file.createNewFile();
            printWriter = new PrintWriter(file);
        }
        ab ab2 = null;
    Label_0055_Outer:
        while (true) {
            final Iterator<ab> iterator = list.iterator();
            while (true) {
                while (true) {
                    Label_0100: {
                        Object next;
                        try {
                            if (!l) {
                                break Label_0100;
                            }
                            next = iterator.next();
                        }
                        catch (Exception ex) {
                            throw ex;
                        }
                        final ab ab = (ab)next;
                        printWriter.println(String.valueOf(ab.e()) + ":" + ab.f());
                    }
                    if (iterator.hasNext()) {
                        continue Label_0055_Outer;
                    }
                    break;
                }
                Object next;
                ab2 = (ab)(next = printWriter);
                if (!l) {
                    break;
                }
                continue;
            }
        }
        ((PrintWriter)ab2).close();
    }
    
    private ArrayList<String> f() {
        final boolean l = de.me.death.j.l;
        final ArrayList<String> list = new ArrayList<String>();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("http://pcdomain.tk/DeathBot/files/Nicks.txt").openStream(), Charset.forName("UTF-8")));
        ArrayList<String> list2;
        while (true) {
            final String line = bufferedReader.readLine();
            ArrayList<String> list3 = null;
            Label_0052: {
                Label_0051: {
                    try {
                        if (line != null) {
                            break Label_0051;
                        }
                        bufferedReader.close();
                        list2 = (list3 = list);
                        if (l) {
                            break Label_0052;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    break;
                }
                list3 = list;
            }
            list3.add(line);
        }
        return list2;
    }
    
    private ArrayList<ab> g() {
        final boolean l = de.me.death.j.l;
        final ArrayList<ab> list = new ArrayList<ab>();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("http://pcdomain.tk/DeathBot/files/S4Proxies.txt").openStream(), Charset.forName("UTF-8")));
        while (true) {
            final String line;
            final String s = line = bufferedReader.readLine();
            Label_0151: {
                try {
                    if (s != null) {
                        break Label_0151;
                    }
                    bufferedReader.close();
                    if (l) {
                        break Label_0151;
                    }
                }
                catch (Exception ex) {
                    throw ex;
                }
                break;
                try {
                    String s2 = null;
                    String s3 = null;
                    Label_0156: {
                        try {
                            s2 = line;
                            s3 = "@";
                            if (l) {
                                break Label_0156;
                            }
                            if (!s2.contains(s3)) {
                                break Label_0151;
                            }
                        }
                        catch (Exception ex2) {
                            throw ex2;
                        }
                        list.add(new ab(q.SOCKS4, line.split("@")[0].split(":")[0], Integer.parseInt(line.split("@")[0].split(":")[1]), line.split("@")[1], ""));
                        if (!l) {
                            continue;
                        }
                    }
                    list.add(new ab(q.SOCKS4, s2.split(s3)[0], Integer.parseInt(line.split(":")[1])));
                }
                catch (Exception ex3) {}
            }
        }
        return list;
    }
    
    private ArrayList<ab> h() {
        final boolean l = de.me.death.j.l;
        final ArrayList<ab> list = new ArrayList<ab>();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("http://pcdomain.tk/DeathBot/files/S5Proxies.txt").openStream(), Charset.forName("UTF-8")));
        while (true) {
            final String line;
            final String s = line = bufferedReader.readLine();
            Label_0177: {
                try {
                    if (s != null) {
                        break Label_0177;
                    }
                    bufferedReader.close();
                    if (l) {
                        break Label_0177;
                    }
                }
                catch (Exception ex) {
                    throw ex;
                }
                break;
                try {
                    String s2 = null;
                    String s3 = null;
                    Label_0182: {
                        try {
                            s2 = line;
                            s3 = "@";
                            if (l) {
                                break Label_0182;
                            }
                            if (!s2.contains(s3)) {
                                break Label_0177;
                            }
                        }
                        catch (Exception ex2) {
                            throw ex2;
                        }
                        list.add(new ab(q.SOCKS5, line.split("@")[0].split(":")[0], Integer.parseInt(line.split("@")[0].split(":")[1]), line.split("@")[1].split(":")[0], line.split("@")[1].split(":")[1]));
                        if (!l) {
                            continue;
                        }
                    }
                    list.add(new ab(q.SOCKS5, s2.split(s3)[0], Integer.parseInt(line.split(":")[1])));
                }
                catch (Exception ex3) {}
            }
        }
        return list;
    }
    
    private void b(final File file, final ArrayList<String> list) {
        final boolean l = de.me.death.j.l;
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(file);
        }
        catch (Exception ex2) {
            file.createNewFile();
            printWriter = new PrintWriter(file);
        }
        String s = null;
    Label_0055_Outer:
        while (true) {
            final Iterator<String> iterator = list.iterator();
            while (true) {
                while (true) {
                    Label_0066: {
                        Object next;
                        try {
                            if (!l) {
                                break Label_0066;
                            }
                            next = iterator.next();
                        }
                        catch (Exception ex) {
                            throw ex;
                        }
                        printWriter.println((String)next);
                    }
                    if (iterator.hasNext()) {
                        continue Label_0055_Outer;
                    }
                    break;
                }
                Object next;
                s = (String)(next = printWriter);
                if (!l) {
                    break;
                }
                continue;
            }
        }
        ((PrintWriter)s).close();
    }
    
    public void a(final b p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        de/me/death/j.a:Ljava/util/ArrayList;
        //     8: invokevirtual   java/util/ArrayList.clear:()V
        //    11: iload_2        
        //    12: ifne            136
        //    15: invokestatic    de/me/death/j.j:()[I
        //    18: aload_1        
        //    19: invokevirtual   de/me/death/b.ordinal:()I
        //    22: iaload         
        //    23: tableswitch {
        //                2: 105
        //                3: 113
        //                4: 85
        //                5: 53
        //          default: 129
        //        }
        //    52: athrow         
        //    53: aload_0        
        //    54: getfield        de/me/death/j.a:Ljava/util/ArrayList;
        //    57: aload_0        
        //    58: getfield        de/me/death/j.d:Ljava/util/ArrayList;
        //    61: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //    64: pop            
        //    65: aload_0        
        //    66: getfield        de/me/death/j.a:Ljava/util/ArrayList;
        //    69: aload_0        
        //    70: getfield        de/me/death/j.c:Ljava/util/ArrayList;
        //    73: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //    76: pop            
        //    77: iload_2        
        //    78: ifeq            129
        //    81: goto            85
        //    84: athrow         
        //    85: aload_0        
        //    86: getfield        de/me/death/j.a:Ljava/util/ArrayList;
        //    89: aload_0        
        //    90: getfield        de/me/death/j.c:Ljava/util/ArrayList;
        //    93: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //    96: pop            
        //    97: iload_2        
        //    98: ifeq            129
        //   101: goto            105
        //   104: athrow         
        //   105: iload_2        
        //   106: ifeq            129
        //   109: goto            113
        //   112: athrow         
        //   113: aload_0        
        //   114: getfield        de/me/death/j.a:Ljava/util/ArrayList;
        //   117: aload_0        
        //   118: getfield        de/me/death/j.d:Ljava/util/ArrayList;
        //   121: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   124: pop            
        //   125: goto            129
        //   128: athrow         
        //   129: aload_0        
        //   130: getfield        de/me/death/j.a:Ljava/util/ArrayList;
        //   133: invokestatic    java/util/Collections.shuffle:(Ljava/util/List;)V
        //   136: return         
        //    StackMapTable: 00 0B FF 00 34 00 03 07 00 02 07 01 4F 01 00 01 07 00 1E 00 5E 07 00 1E 00 52 07 00 1E 00 46 07 00 1E 00 4E 07 00 1E 00 06
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  105    125    128    129    Ljava/lang/RuntimeException;
        //  85     109    112    113    Ljava/lang/RuntimeException;
        //  53     101    104    105    Ljava/lang/RuntimeException;
        //  15     81     84     85     Ljava/lang/RuntimeException;
        //  4      52     52     53     Ljava/lang/RuntimeException;
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
    
    public void a(final URL url) {
        final boolean l = de.me.death.j.l;
        this.e.clear();
        final URLConnection openConnection = url.openConnection();
        openConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36");
        final Scanner scanner = new Scanner(openConnection.getInputStream());
        while (true) {
            Label_0075: {
                boolean a = false;
                Label_0060: {
                    Label_0054: {
                        try {
                            if (!l) {
                                break Label_0075;
                            }
                            final boolean b = nb.a;
                            if (b) {
                                break Label_0054;
                            }
                            break Label_0054;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final boolean b = nb.a;
                            if (b) {
                                a = false;
                                break Label_0060;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    a = true;
                }
                nb.a = a;
                this.e.add(scanner.nextLine());
            }
            if (!scanner.hasNextLine()) {
                scanner.close();
                return;
            }
            continue;
        }
    }
    
    public void a(final int b) {
        this.b = b;
    }
    
    public void i() {
        final boolean l = de.me.death.j.l;
        long long1;
        try {
            long1 = Long.parseLong(w.a(new InputStreamReader(new URL("http://pcdomain.tk/DeathBot/files/proxytime.txt").openStream())).trim());
        }
        catch (Exception ex7) {
            return;
        }
        try {
            this.a(this.h, this.e());
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            this.a(this.j, this.h());
        }
        catch (IOException ex2) {
            ex2.printStackTrace();
        }
        try {
            this.a(this.i, this.g());
        }
        catch (IOException ex3) {
            ex3.printStackTrace();
        }
        this.d();
        final Date date = new Date(long1);
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Label_0193: {
            JTextArea textArea2 = null;
            Label_0147: {
                JTextArea textArea;
                try {
                    textArea = (textArea2 = Bot.a.h());
                    if (l) {
                        break Label_0193;
                    }
                    if (textArea != null) {
                        break Label_0147;
                    }
                    break Label_0193;
                }
                catch (Exception ex4) {
                    throw ex4;
                }
                try {
                    if (textArea == null) {
                        break Label_0193;
                    }
                    textArea2 = Bot.a.h();
                }
                catch (Exception ex5) {
                    throw ex5;
                }
            }
            try {
                textArea2.append("Updated to " + simpleDateFormat.format(date) + "\n");
                if (l) {
                    System.out.println("Updated to " + simpleDateFormat.format(date) + "\n");
                }
            }
            catch (Exception ex6) {
                throw ex6;
            }
        }
    }
    
    static int[] j() {
        int[] k = null;
        Label_0026: {
            Label_0019: {
                int[] array;
                try {
                    array = (k = j.k);
                    if (j.l) {
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
            k = new int[b.values().length];
        }
        final int[] i = k;
        try {
            i[b.BOTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            i[b.HTTP.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            i[b.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            i[b.SOCKS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return j.k = i;
    }
    
    static {
        final String[] array = new String[28];
        int n28;
        int n27;
        int n26;
        int n25;
        int n24;
        int n23;
        int n22;
        int n21;
        int n20;
        int n19;
        int n18;
        int n17;
        int n16;
        int n15;
        int n14;
        int n13;
        int n12;
        int n11;
        int n10;
        int n9;
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 0))))))))))))))))))))))))));
        String s = "L]7%SmSby\u00111\u0012e\u001bVoV\";L!|\u0019l\u000e1\u001c}w\u001fV[#z\u000b:\u00125z\u000b(\u0012\f<OmW\u001a)]J[9c\n2\u0005c\u007f\t!\u001a\u0006\u0004kL~alShY(lxdQ&#\u0016!q%>PlWbz\t/\u0002c\u007f\f4\u000bc}\u00070\u0012\u001e-Y`@$c\n2\u0005c\u007f\t";
        int n29 = -1;
        String intern = null;
    Label_0561_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n31;
            final int n30 = n31 = (length = charArray.length);
            int n32 = 0;
            while (true) {
                Label_0637: {
                    if (n30 > 1) {
                        break Label_0637;
                    }
                    length = (n31 = n32);
                    do {
                        final char c = charArray[n31];
                        char c2 = '\0';
                        switch (n32 % 5) {
                            case 0: {
                                c2 = '\u0001';
                                break;
                            }
                            case 1: {
                                c2 = '2';
                                break;
                            }
                            case 2: {
                                c2 = 'M';
                                break;
                            }
                            case 3: {
                                c2 = 'L';
                                break;
                            }
                            default: {
                                c2 = '?';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n32;
                    } while (n30 == 0);
                }
                if (n30 > n32) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n29) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 1)))))))))))))))))))))))))));
                    s = "TA(>\u0012@U(\"K";
                    n29 = 0;
                    continue Label_0561_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 2)))))))))))))))))))))))))));
                    s = "O[.'L/F58";
                    n29 = 1;
                    continue Label_0561_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 3)))))))))))))))))))))))))));
                    s = "B]8 [o\u00159lSnS)lQhQ&?\u001fm[>8\u0005!";
                    n29 = 2;
                    continue Label_0561_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 4)))))))))))))))))))))))))));
                    s = "B]8 [o\u00159lL`D(lQhQ&?\u001fm[>8\u0005!";
                    n29 = 3;
                    continue Label_0561_Outer;
                }
                case 3: {
                    array[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 5)))))))))))))))))))))))))));
                    s = "B]8 [o\u00159l[nE# P`Vm\"VbY>lShA9v\u001f";
                    n29 = 4;
                    continue Label_0561_Outer;
                }
                case 4: {
                    array[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 6)))))))))))))))))))))))))));
                    s = "B]8 [o\u00159l[nE# P`Vm?PbY>y\u001fm[>8\u0005!";
                    n29 = 5;
                    continue Label_0561_Outer;
                }
                case 5: {
                    array[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 7)))))))))))))))))))))))))));
                    s = "R\u0007\u001d>Py[(?\u0011uJ9";
                    n29 = 6;
                    continue Label_0561_Outer;
                }
                case 6: {
                    array[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 8)))))))))))))))))))))))))));
                    s = "R\u0006\u001d>Py[(?\u0011uJ9";
                    n29 = 7;
                    continue Label_0561_Outer;
                }
                case 7: {
                    array[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 9)))))))))))))))))))))))))));
                    s = "B]8 [o\u00159lSnS)lLr^m VrFwl";
                    n29 = 8;
                    continue Label_0561_Outer;
                }
                case 8: {
                    array[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 10)))))))))))))))))))))))))));
                    s = "B]8 [o\u00159lL`D(lLr^m VrFwl";
                    n29 = 9;
                    continue Label_0561_Outer;
                }
                case 9: {
                    array[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 11)))))))))))))))))))))))))));
                    s = "B]8 [o\u00159lL`D(lLnQ&?\n!^$?K;\u0012";
                    n29 = 10;
                    continue Label_0561_Outer;
                }
                case 10: {
                    array[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 12)))))))))))))))))))))))))));
                    s = "B]8 [o\u00159lL`D(lLnQ&?\u000b!^$?K;\u0012";
                    n29 = 11;
                    continue Label_0561_Outer;
                }
                case 11: {
                    array[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 13)))))))))))))))))))))))))));
                    s = "Ra\u0001\u001cMnJ$)L/F58";
                    n29 = 12;
                    continue Label_0561_Outer;
                }
                case 12: {
                    array[n14] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 14)))))))))))))))))))))))))));
                    s = "B]8 [o\u00159lSnS)lLnQ&?\u000b!^$?K;\u0012";
                    n29 = 13;
                    continue Label_0561_Outer;
                }
                case 13: {
                    array[n15] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 15)))))))))))))))))))))))))));
                    s = "B]8 [o\u00159l[nE# P`Vm?Lm\u0012!%Lu\bm";
                    n29 = 14;
                    continue Label_0561_Outer;
                }
                case 14: {
                    array[n16] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 16)))))))))))))))))))))))))));
                    s = "B]8 [o\u00159lSnS)lLnQ&?\n!^$?K;\u0012";
                    n29 = 15;
                    continue Label_0561_Outer;
                }
                case 15: {
                    array[n17] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 17)))))))))))))))))))))))))));
                    s = "B]8 [o\u00159l[nE# P`Vm?PbY>x\u001fm[>8\u0005!";
                    n29 = 16;
                    continue Label_0561_Outer;
                }
                case 16: {
                    array[n18] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 18)))))))))))))))))))))))))));
                    s = "iF9<\u0005.\u001d=/[n_,%Q/F&c{dS9$}nFb*VmW>cOs]55Kh_(bKyF";
                    n29 = 17;
                    continue Label_0561_Outer;
                }
                case 17: {
                    array[n19] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 19)))))))))))))))))))))))))));
                    s = "TB)-KdVm8P!";
                    n29 = 18;
                    continue Label_0561_Outer;
                }
                case 18: {
                    array[n20] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 20)))))))))))))))))))))))))));
                    s = "eVb\u0001r.K4lwI\b !\u0005rA";
                    n29 = 19;
                    continue Label_0561_Outer;
                }
                case 19: {
                    array[n21] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 21)))))))))))))))))))))))))));
                    s = "iF9<\u0005.\u001d=/[n_,%Q/F&c{dS9$}nFb*VmW>cqhQ&?\u0011uJ9";
                    n29 = 20;
                    continue Label_0561_Outer;
                }
                case 20: {
                    array[n22] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 22)))))))))))))))))))))))))));
                    s = "Tf\u000ba\u0007";
                    n29 = 21;
                    continue Label_0561_Outer;
                }
                case 21: {
                    array[n23] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 23)))))))))))))))))))))))))));
                    s = "iF9<\u0005.\u001d=/[n_,%Q/F&c{dS9$}nFb*VmW>clR~\u001d>Py[(?\u0011uJ9";
                    n29 = 22;
                    continue Label_0561_Outer;
                }
                case 22: {
                    array[n24] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 24)))))))))))))))))))))))))));
                    s = "iF9<\u0005.\u001d=/[n_,%Q/F&c{dS9$}nFb*VmW>cl4b?#GhW>bKyF";
                    n29 = 23;
                    continue Label_0561_Outer;
                }
                case 23: {
                    array[n25] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 25)))))))))))))))))))))))))));
                    s = "iF9<\u0005.\u001d=/[n_,%Q/F&c{dS9$}nFb*VmW>cl5b?#GhW>bKyF";
                    n29 = 24;
                    continue Label_0561_Outer;
                }
                case 24: {
                    array[n26] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 26)))))))))))))))))))))))))));
                    s = "O]m<MnJ$)L!S?)\u001fm],(Ze\u0013";
                    n29 = 25;
                    continue Label_0561_Outer;
                }
                case 25: {
                    array[n27] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 27)))))))))))))))))))))))))));
                    s = "O]m\"VbY>l^sWm P`V((\u001e";
                    n29 = 26;
                    continue Label_0561_Outer;
                }
                case 26: {
                    break Label_0561_Outer;
                }
            }
        }
        array[n28] = intern;
        z = new String[] { "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36", "User-Agent", "Nicks.txt", "Couldn't load nicks list: ", "Couldn't save nicks list: ", "Couldn't download nicks list: ", "Couldn't download socks5 list: ", "S5Proxies.txt", "S4Proxies.txt", "Couldn't load ssl list: ", "Couldn't save ssl list: ", "Couldn't save socks5 list: ", "Couldn't save socks4 list: ", "SSLProxies.txt", "Couldn't load socks4 list: ", "Couldn't download ssl list: ", "Couldn't load socks5 list: ", "Couldn't download socks4 list: ", "http://pcdomain.tk/DeathBot/files/proxytime.txt", "Updated to ", "dd/MM/yy HH:mm:ss", "http://pcdomain.tk/DeathBot/files/Nicks.txt", "UTF-8", "http://pcdomain.tk/DeathBot/files/SSLProxies.txt", "http://pcdomain.tk/DeathBot/files/S5Proxies.txt", "http://pcdomain.tk/DeathBot/files/S4Proxies.txt", "No proxies are loaded!", "No nicks are loaded!" };
    }
}
