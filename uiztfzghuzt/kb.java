// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.io.Reader;
import java.io.StringReader;

public final class kb
{
    private static final String[] z;
    
    public fb a(final String s) {
        return this.a(new StringReader(s));
    }
    
    public fb a(final Reader p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1        
        //     5: invokespecial   uiztfzghuzt/bg.<init>:(Ljava/io/Reader;)V
        //     8: astore_2       
        //     9: aload_0        
        //    10: aload_2        
        //    11: invokevirtual   uiztfzghuzt/kb.a:(Luiztfzghuzt/bg;)Luiztfzghuzt/fb;
        //    14: astore_3       
        //    15: aload_3        
        //    16: getstatic       uiztfzghuzt/fb.a:I
        //    19: ifne            58
        //    22: invokevirtual   uiztfzghuzt/fb.d:()Z
        //    25: ifne            57
        //    28: goto            32
        //    31: athrow         
        //    32: aload_2        
        //    33: invokevirtual   uiztfzghuzt/bg.g:()Luiztfzghuzt/p;
        //    36: getstatic       uiztfzghuzt/p.END_DOCUMENT:Luiztfzghuzt/p;
        //    39: if_acmpeq       57
        //    42: goto            46
        //    45: athrow         
        //    46: new             Luiztfzghuzt/kg;
        //    49: dup            
        //    50: ldc             "Did not consume the entire document."
        //    52: invokespecial   uiztfzghuzt/kg.<init>:(Ljava/lang/String;)V
        //    55: athrow         
        //    56: athrow         
        //    57: aload_3        
        //    58: areturn        
        //    59: astore_2       
        //    60: new             Luiztfzghuzt/kg;
        //    63: dup            
        //    64: aload_2        
        //    65: invokespecial   uiztfzghuzt/kg.<init>:(Ljava/lang/Throwable;)V
        //    68: athrow         
        //    69: astore_2       
        //    70: new             Luiztfzghuzt/jg;
        //    73: dup            
        //    74: aload_2        
        //    75: invokespecial   uiztfzghuzt/jg.<init>:(Ljava/lang/Throwable;)V
        //    78: athrow         
        //    79: astore_2       
        //    80: new             Luiztfzghuzt/kg;
        //    83: dup            
        //    84: aload_2        
        //    85: invokespecial   uiztfzghuzt/kg.<init>:(Ljava/lang/Throwable;)V
        //    88: athrow         
        //    StackMapTable: 00 0A FF 00 1F 00 04 07 00 02 07 00 42 07 00 1C 07 00 24 00 01 07 00 16 00 4C 07 00 16 00 49 07 00 16 00 40 07 00 24 FF 00 00 00 02 07 00 02 07 00 42 00 01 07 00 16 49 07 00 18 49 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  32     56     56     57     Luiztfzghuzt/c;
        //  22     42     45     46     Luiztfzghuzt/c;
        //  15     28     31     32     Luiztfzghuzt/c;
        //  0      58     59     69     Luiztfzghuzt/c;
        //  0      58     69     79     Ljava/io/IOException;
        //  0      58     79     89     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    public fb a(final bg bg) {
        final boolean a = bg.a();
        bg.a(true);
        try {
            return we.a(bg);
        }
        catch (StackOverflowError stackOverflowError) {
            throw new ig("Failed parsing JSON source: " + bg + " to Json", stackOverflowError);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            throw new ig("Failed parsing JSON source: " + bg + " to Json", outOfMemoryError);
        }
        finally {
            bg.a(a);
        }
    }
    
    static {
        final String[] array = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "\u0001v\u0005Q[*kA\u0012Z+l\u0014\u001cPek\t\u0014\u0015 q\u0015\u0018G ?\u0005\u001eV0r\u0004\u001fAk";
        int n4 = -1;
        String intern = null;
    Label_0077_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n6;
            final int n5 = n6 = (length = charArray.length);
            int n7 = 0;
            while (true) {
                Label_0154: {
                    if (n5 > 1) {
                        break Label_0154;
                    }
                    length = (n6 = n7);
                    do {
                        final char c = charArray[n6];
                        char c2 = '\0';
                        switch (n7 % 5) {
                            case 0: {
                                c2 = 'E';
                                break;
                            }
                            case 1: {
                                c2 = '\u001f';
                                break;
                            }
                            case 2: {
                                c2 = 'a';
                                break;
                            }
                            case 3: {
                                c2 = 'q';
                                break;
                            }
                            default: {
                                c2 = '5';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n7;
                    } while (n5 == 0);
                }
                if (n5 > n7) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n4) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = 1));
                    s = "ek\u000eQ\u007f6p\u000f";
                    n4 = 0;
                    continue Label_0077_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "\u0003~\b\u001dP!?\u0011\u0010G6v\u000f\u0016\u0015\u000fL.?\u00156p\u0014\u0003V %A";
                    n4 = 1;
                    continue Label_0077_Outer;
                }
                case 1: {
                    break Label_0077_Outer;
                }
            }
        }
        array[n3] = intern;
        z = new String[] { "Did not consume the entire document.", " to Json", "Failed parsing JSON source: " };
    }
}
