// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.io.OutputStream;
import java.io.DataOutputStream;

public class b extends DataOutputStream
{
    private gg a;
    private static final String z = "Crypto is null!";
    
    public b(final OutputStream out, final gg a) {
        super(out);
        this.a = a;
    }
    
    public void a(final hg hg) {
        this.a(hg, true);
    }
    
    public void a(final hg p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: invokestatic    uiztfzghuzt/u.a:()Luiztfzghuzt/t;
        //     8: astore_3       
        //     9: aload_3        
        //    10: aload_1        
        //    11: invokevirtual   uiztfzghuzt/hg.a:()I
        //    14: invokeinterface uiztfzghuzt/t.writeInt:(I)V
        //    19: aload_1        
        //    20: aload_3        
        //    21: invokevirtual   uiztfzghuzt/hg.a:(Luiztfzghuzt/t;)V
        //    24: invokestatic    uiztfzghuzt/u.a:()Luiztfzghuzt/t;
        //    27: astore          4
        //    29: aload_3        
        //    30: invokeinterface uiztfzghuzt/t.a:()[B
        //    35: astore          5
        //    37: aload_0        
        //    38: aload           5
        //    40: invokevirtual   uiztfzghuzt/b.a:([B)[B
        //    43: astore          5
        //    45: iload           6
        //    47: ifne            148
        //    50: iload_2        
        //    51: ifeq            108
        //    54: goto            58
        //    57: athrow         
        //    58: aload_0        
        //    59: getfield        uiztfzghuzt/b.a:Luiztfzghuzt/gg;
        //    62: iload           6
        //    64: ifne            93
        //    67: goto            71
        //    70: athrow         
        //    71: ifnonnull       89
        //    74: goto            78
        //    77: athrow         
        //    78: new             Ljava/lang/Exception;
        //    81: dup            
        //    82: ldc             "Crypto is null!"
        //    84: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //    87: athrow         
        //    88: athrow         
        //    89: aload_0        
        //    90: getfield        uiztfzghuzt/b.a:Luiztfzghuzt/gg;
        //    93: aload           5
        //    95: invokevirtual   uiztfzghuzt/gg.a:([B)[B
        //    98: astore          5
        //   100: aload_0        
        //   101: aload           5
        //   103: invokevirtual   uiztfzghuzt/b.a:([B)[B
        //   106: astore          5
        //   108: aload           4
        //   110: aload           5
        //   112: arraylength    
        //   113: iconst_1       
        //   114: iadd           
        //   115: invokeinterface uiztfzghuzt/t.writeInt:(I)V
        //   120: aload           4
        //   122: iload_2        
        //   123: invokeinterface uiztfzghuzt/t.writeBoolean:(Z)V
        //   128: aload           4
        //   130: aload           5
        //   132: invokeinterface uiztfzghuzt/t.write:([B)V
        //   137: aload_0        
        //   138: aload           4
        //   140: invokeinterface uiztfzghuzt/t.a:()[B
        //   145: invokevirtual   uiztfzghuzt/b.write:([B)V
        //   148: getstatic       uiztfzghuzt/nb.a:Z
        //   151: ifeq            166
        //   154: iinc            6, 1
        //   157: iload           6
        //   159: putstatic       uiztfzghuzt/hg.a:I
        //   162: goto            166
        //   165: athrow         
        //   166: return         
        //    StackMapTable: 00 0D FF 00 39 00 07 07 00 02 07 00 19 01 07 00 26 07 00 26 07 00 4B 01 00 01 07 00 17 00 4B 07 00 17 40 07 00 3A 45 07 00 17 00 49 07 00 17 00 43 07 00 3A 0E 27 50 07 00 17 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  148    162    165    166    Luiztfzghuzt/kg;
        //  71     88     88     89     Luiztfzghuzt/kg;
        //  58     74     77     78     Luiztfzghuzt/kg;
        //  50     67     70     71     Luiztfzghuzt/kg;
        //  45     54     57     58     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0058:
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
    
    public byte[] a(final byte[] input) {
        final int a = hg.a;
        final Deflater deflater = new Deflater();
        deflater.setInput(input);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(input.length);
        deflater.finish();
        final byte[] array = new byte[1024];
        while (true) {
            Label_0061: {
                if (a == 0) {
                    break Label_0061;
                }
                byteArrayOutputStream.write(array, 0, deflater.deflate(array));
            }
            if (deflater.finished()) {
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            continue;
        }
    }
    
    static {
        final char[] charArray = "lK\u0014;/@\u0019\u00048{AL\u0001'z".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0106: {
                if (n > 1) {
                    break Label_0106;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '/';
                            break;
                        }
                        case 1: {
                            c2 = '9';
                            break;
                        }
                        case 2: {
                            c2 = 'm';
                            break;
                        }
                        case 3: {
                            c2 = 'K';
                            break;
                        }
                        default: {
                            c2 = '[';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
