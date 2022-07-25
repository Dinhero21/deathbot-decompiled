// 
// Decompiled by Procyon v0.5.36
// 

package uiztfzghuzt;

import java.lang.reflect.Field;

class mf extends lf
{
    final Field d;
    final boolean e;
    final nb f;
    final ab g;
    final ag h;
    final boolean i;
    final kf j;
    
    mf(final kf j, final String s, final boolean b, final boolean b2, final Field d, final boolean e, final nb f, final ab g, final ag h, final boolean i) {
        this.j = j;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        super(s, b, b2);
    }
    
    @Override
    void a(final dg dg, final Object obj) {
        final Object value = this.d.get(obj);
        nb<Object> f = null;
        Label_0059: {
            Label_0037: {
                mf mf = null;
                Label_0026: {
                    try {
                        mf = this;
                        if (rf.ab) {
                            break Label_0026;
                        }
                        final boolean b = this.e;
                        if (b) {
                            break Label_0026;
                        }
                        break Label_0037;
                    }
                    catch (kg kg) {
                        throw kg;
                    }
                    try {
                        final boolean b = this.e;
                        if (!b) {
                            break Label_0037;
                        }
                        mf = this;
                    }
                    catch (kg kg2) {
                        throw kg2;
                    }
                }
                f = (nb<Object>)mf.f;
                break Label_0059;
            }
            f = new gc<Object>(this.g, this.f, this.h.b());
        }
        f.a(dg, value);
    }
    
    @Override
    void a(final bg p0, final Object p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     4: aload_1        
        //     5: invokevirtual   uiztfzghuzt/nb.a:(Luiztfzghuzt/bg;)Ljava/lang/Object;
        //     8: astore_3       
        //     9: aload_3        
        //    10: ifnonnull       34
        //    13: aload_0        
        //    14: getstatic       uiztfzghuzt/rf.ab:Z
        //    17: ifne            39
        //    20: goto            24
        //    23: athrow         
        //    24: getfield        uiztfzghuzt/mf.i:Z
        //    27: ifne            47
        //    30: goto            34
        //    33: athrow         
        //    34: aload_0        
        //    35: goto            39
        //    38: athrow         
        //    39: getfield        uiztfzghuzt/mf.d:Ljava/lang/reflect/Field;
        //    42: aload_2        
        //    43: aload_3        
        //    44: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    47: return         
        //    StackMapTable: 00 07 FF 00 17 00 04 07 00 02 07 00 50 07 00 46 07 00 46 00 01 07 00 28 40 07 00 02 48 07 00 28 00 43 07 00 28 40 07 00 02 07
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  24     35     38     39     Luiztfzghuzt/kg;
        //  13     30     33     34     Luiztfzghuzt/kg;
        //  9      20     23     24     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    
    public boolean a(final Object obj) {
        Object value = null;
        Label_0028: {
            Label_0020: {
                try {
                    value = this;
                    if (rf.ab) {
                        break Label_0028;
                    }
                    final boolean b = this.b;
                    if (!b) {
                        return false;
                    }
                    break Label_0020;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    final boolean b = this.b;
                    if (!b) {
                        return false;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            value = this.d.get(obj);
        }
        final Object o = value;
        try {
            if (o != obj) {
                return true;
            }
        }
        catch (kg kg3) {
            throw kg3;
        }
        return false;
    }
}
