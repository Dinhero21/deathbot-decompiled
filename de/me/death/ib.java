// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import java.awt.event.ActionEvent;
import java.net.InetAddress;
import uiztfzghuzt.nb;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.text.DefaultCaret;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.plaf.ColorUIResource;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class ib extends JFrame implements ActionListener
{
    private Bot a;
    private long b;
    private static final long serialVersionUID = 4637668423655999559L;
    private JTextField c;
    private JTextArea d;
    private kb e;
    private jb f;
    JButton g;
    JButton h;
    public static boolean i;
    private static final String[] z;
    
    public ib(final Bot a) {
        final boolean i = ib.i;
        this.b = 0L;
        this.setTitle("DeathBot V4.1");
        this.a = a;
        this.e = new kb();
        this.f = new jb();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (Exception ex3) {}
        UIManager.put("TextField.inactiveBackground", new ColorUIResource(Color.WHITE));
        this.setSize(292, 475);
        this.setIconImage(new ImageIcon(Bot.class.getResource("/frames/256x256.png")).getImage());
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.getContentPane().setLayout(null);
        final JLabel comp = new JLabel("Address:");
        comp.setHorizontalAlignment(0);
        comp.setFont(new Font("Arial", 0, 17));
        comp.setBounds(91, 0, 100, 33);
        this.getContentPane().add(comp);
        (this.c = new JTextField()).setBounds(10, 30, 266, 20);
        this.getContentPane().add(this.c);
        this.c.setColumns(10);
        final JLabel comp2 = new JLabel("DeathBot v4.1");
        comp2.setHorizontalAlignment(0);
        comp2.setBounds(10, 419, 266, 14);
        this.getContentPane().add(comp2);
        a.a(this.d = new JTextArea());
        this.d.setEditable(false);
        this.d.setBounds(10, 322, 266, 86);
        ((DefaultCaret)this.d.getCaret()).setUpdatePolicy(2);
        final JScrollPane comp3 = new JScrollPane(this.d, 20, 31);
        a.a(comp3);
        comp3.setBounds(10, 322, 266, 86);
        this.getContentPane().add(comp3);
        this.d.setColumns(10);
        this.d.setLineWrap(true);
        this.d.append(String.valueOf(this.a.e().a()) + "\n");
        final JLabel comp4 = new JLabel("Console output:");
        comp4.setBounds(10, 301, 266, 16);
        this.getContentPane().add(comp4);
        (this.g = new JButton("Start")).addActionListener(this);
        this.g.setBounds(10, 271, 130, 26);
        this.getContentPane().add(this.g);
        (this.h = new JButton("Stop")).addActionListener(this);
        this.h.setEnabled(false);
        this.h.setBounds(146, 271, 130, 26);
        this.getContentPane().add(this.h);
        final JTabbedPane comp5 = new JTabbedPane(1);
        comp5.setBounds(10, 62, 266, 202);
        final JScrollPane component = new JScrollPane(this.e, 22, 31);
        component.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        final JScrollPane component2 = new JScrollPane(this.f, 22, 31);
        component2.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        comp5.add(component, "Basic");
        comp5.add(component2, "Advanced");
        this.getContentPane().add(comp5);
        final JButton comp6 = new JButton("Proxy Update");
        boolean j = false;
        Label_0775: {
            Label_0769: {
                try {
                    comp6.addActionListener(new h(this));
                    comp6.setFont(new Font("Arial", 0, 8));
                    comp6.setBounds(10, 415, 89, 23);
                    this.getContentPane().add(comp6);
                    if (!nb.a) {
                        return;
                    }
                    final boolean b = i;
                    if (b) {
                        break Label_0769;
                    }
                    break Label_0769;
                }
                catch (Exception ex) {
                    throw ex;
                }
                try {
                    final boolean b = i;
                    if (b) {
                        j = false;
                        break Label_0775;
                    }
                }
                catch (Exception ex2) {
                    throw ex2;
                }
            }
            j = true;
        }
        ib.i = j;
    }
    
    private void a() {
        this.a.d().i();
    }
    
    public void b() {
        final boolean i = ib.i;
        final String text = this.c.getText();
        int int1 = 25565;
        String str = text;
        String s = null;
        Label_0102: {
            boolean b = false;
            Label_0052: {
                Label_0038: {
                    int n;
                    try {
                        n = ((b = (this.e.a() != 0)) ? 1 : 0);
                        if (i) {
                            break Label_0052;
                        }
                        if (n == 0) {
                            break Label_0038;
                        }
                        break Label_0052;
                    }
                    catch (Exception ex) {
                        throw ex;
                    }
                    try {
                        if (n == 0) {
                            this.e.a(1000);
                        }
                    }
                    catch (Exception ex2) {
                        throw ex2;
                    }
                }
                try {
                    s = text;
                    if (i) {
                        break Label_0102;
                    }
                    b = s.contains(":");
                }
                catch (Exception ex3) {
                    throw ex3;
                }
            }
            if (b) {
                str = text.split(":")[0];
                int1 = Integer.parseInt(text.split(":")[1]);
            }
            this.a.b(str);
        }
        final String s2 = s;
        Label_0188: {
            int n3 = 0;
            Label_0148: {
                try {
                    final int n2 = n3 = (s2.equalsIgnoreCase("") ? 1 : 0);
                    if (i) {
                        break Label_0148;
                    }
                    if (n2 != 0) {
                        break Label_0188;
                    }
                }
                catch (Exception ex4) {
                    throw ex4;
                }
                str = s2.split(":")[0];
                n3 = Integer.parseInt(s2.split(":")[1]);
            }
            int1 = n3;
            this.d.append("Found SRV domain, real address is " + str + ":" + int1 + "\n");
        }
        final g g = new g(this.e.a(), this.f.e(), this.f.b(), this.e.c(), this.f.d(), false, this.f.g(), str, this.e.f(), this.f.l(), this.f.k(), int1, this.e.e(), this.f.c(), this.e.g(), this.f.j(), this.e.b(), this.e.d(), this.f.a(), this.f.i(), this.f.f(), this.f.h(), null);
        InetAddress byName;
        try {
            byName = InetAddress.getByName(Bot.c(str));
        }
        catch (Exception ex5) {
            ex5.printStackTrace();
            this.d.append(String.valueOf(text) + " is not a valid address\n");
            this.g.setEnabled(true);
            return;
        }
        try {
            this.a.e().a(g, -1L);
        }
        catch (Exception ex7) {}
        Bot a = null;
        Label_0472: {
            Label_0458: {
                try {
                    try {
                        a = this.a;
                        if (i) {
                            break Label_0472;
                        }
                        if (!a.e().a(byName, int1)) {
                            break Label_0458;
                        }
                    }
                    catch (Exception ex6) {
                        throw ex6;
                    }
                    this.d.append("This server is blocked!\n");
                    this.g.setEnabled(true);
                    return;
                }
                catch (Exception ex8) {}
            }
            this.d.append("Attack started!\n");
            final Bot a2 = this.a;
        }
        a.f().a(g);
        this.h.setEnabled(true);
    }
    
    @Override
    public void actionPerformed(final ActionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokevirtual   java/awt/event/ActionEvent.getSource:()Ljava/lang/Object;
        //     8: aload_0        
        //     9: getfield        de/me/death/ib.g:Ljavax/swing/JButton;
        //    12: iload_2        
        //    13: ifne            55
        //    16: if_acmpne       43
        //    19: goto            23
        //    22: athrow         
        //    23: aload_0        
        //    24: getfield        de/me/death/ib.g:Ljavax/swing/JButton;
        //    27: iconst_0       
        //    28: invokevirtual   javax/swing/JButton.setEnabled:(Z)V
        //    31: aload_0        
        //    32: invokevirtual   de/me/death/ib.b:()V
        //    35: iload_2        
        //    36: ifeq            88
        //    39: goto            43
        //    42: athrow         
        //    43: aload_1        
        //    44: invokevirtual   java/awt/event/ActionEvent.getSource:()Ljava/lang/Object;
        //    47: aload_0        
        //    48: getfield        de/me/death/ib.h:Ljavax/swing/JButton;
        //    51: goto            55
        //    54: athrow         
        //    55: if_acmpne       88
        //    58: aload_0        
        //    59: getfield        de/me/death/ib.a:Lde/me/death/Bot;
        //    62: invokevirtual   de/me/death/Bot.f:()Lde/me/death/i;
        //    65: invokevirtual   de/me/death/i.a:()V
        //    68: aload_0        
        //    69: getfield        de/me/death/ib.g:Ljavax/swing/JButton;
        //    72: iconst_1       
        //    73: invokevirtual   javax/swing/JButton.setEnabled:(Z)V
        //    76: aload_0        
        //    77: getfield        de/me/death/ib.h:Ljavax/swing/JButton;
        //    80: iconst_0       
        //    81: invokevirtual   javax/swing/JButton.setEnabled:(Z)V
        //    84: goto            88
        //    87: athrow         
        //    88: return         
        //    StackMapTable: 00 08 FF 00 16 00 03 07 00 02 07 01 A0 01 00 01 07 01 9E 00 52 07 01 9E 00 4A 07 01 9E FF 00 00 00 03 07 00 02 07 01 A0 01 00 02 07 01 AA 07 00 E7 5F 07 01 9E 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type            
        //  -----  -----  -----  -----  ----------------
        //  55     84     87     88     Luiztfzghuzt/kg;
        //  23     51     54     55     Luiztfzghuzt/kg;
        //  16     39     42     43     Luiztfzghuzt/kg;
        //  4      19     22     23     Luiztfzghuzt/kg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
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
    
    static long a(final ib ib) {
        return ib.b;
    }
    
    static void b(final ib ib) {
        ib.a();
    }
    
    static void a(final ib ib, final long b) {
        ib.b = b;
    }
    
    static {
        final String[] array = new String[17];
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
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 0)))))))))))))));
        String s = "7<4:h\u00101/?-\u0011t4:h\u000182*#\u00060|C";
        int n18 = -1;
        String intern = null;
    Label_0351_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n20;
            final int n19 = n20 = (length = charArray.length);
            int n21 = 0;
            while (true) {
                Label_0426: {
                    if (n19 > 1) {
                        break Label_0426;
                    }
                    length = (n20 = n21);
                    do {
                        final char c = charArray[n20];
                        char c2 = '\0';
                        switch (n21 % 5) {
                            case 0: {
                                c2 = 'c';
                                break;
                            }
                            case 1: {
                                c2 = 'T';
                                break;
                            }
                            case 2: {
                                c2 = ']';
                                break;
                            }
                            case 3: {
                                c2 = 'I';
                                break;
                            }
                            default: {
                                c2 = 'H';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n21;
                    } while (n19 == 0);
                }
                if (n19 > n21) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n18) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 1))))))))))))))));
                    s = "C=.i&\f }(h\u001551 ,C59-:\u0006'.C";
                    n18 = 0;
                    continue Label_0351_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 2))))))))))))))));
                    s = "\" )(+\bt.=)\u0011 8-ii";
                    n18 = 1;
                    continue Label_0351_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 3))))))))))))))));
                    s = "%;(',C\u0007\u000f\u001fh\u0007;0(!\rx};-\u00028}(,\u0007&8:;C=.i";
                    n18 = 2;
                    continue Label_0351_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 4))))))))))))))));
                    s = "'1<= !;)i>Wzl";
                    n18 = 3;
                    continue Label_0351_Outer;
                }
                case 3: {
                    array[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 5))))))))))))))));
                    s = "0 29";
                    n18 = 4;
                    continue Label_0351_Outer;
                }
                case 4: {
                    array[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 6))))))))))))))));
                    s = "0 <;<";
                    n18 = 5;
                    continue Label_0351_Outer;
                }
                case 5: {
                    array[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 7))))))))))))))));
                    s = "L2/(%\u0006'r{}U,o|~M$3.";
                    n18 = 6;
                    continue Label_0351_Outer;
                }
                case 6: {
                    array[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 8))))))))))))))));
                    s = "71%=\u000e\n11-f\n:<*<\n\"8\u000b)\u0000?:;'\u0016:9";
                    n18 = 7;
                    continue Label_0351_Outer;
                }
                case 7: {
                    array[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 9))))))))))))))));
                    s = "'1<= !;)i\u001eWzl";
                    n18 = 8;
                    continue Label_0351_Outer;
                }
                case 8: {
                    array[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 10))))))))))))))));
                    s = "3&211C\u0001--)\u00171";
                    n18 = 9;
                    continue Label_0351_Outer;
                }
                case 9: {
                    array[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 11))))))))))))))));
                    s = "\"09;-\u0010'g";
                    n18 = 10;
                    continue Label_0351_Outer;
                }
                case 10: {
                    array[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 12))))))))))))))));
                    s = " ;3:'\u000f1}&=\u0017$(=r";
                    n18 = 11;
                    continue Label_0351_Outer;
                }
                case 11: {
                    array[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 13))))))))))))))));
                    s = "\"0+(&\u000019";
                    n18 = 12;
                    continue Label_0351_Outer;
                }
                case 12: {
                    array[n14] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 14))))))))))))))));
                    s = "!5. +";
                    n18 = 13;
                    continue Label_0351_Outer;
                }
                case 13: {
                    array[n15] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 15))))))))))))))));
                    s = "\"&4($";
                    n18 = 14;
                    continue Label_0351_Outer;
                }
                case 14: {
                    array[n16] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 16))))))))))))))));
                    s = "\u0000;0g;\u0016:s#)\u00155s:?\n::g8\u000f5;g?\n:9&?\u0010z\n &\u0007;*:\u0004\f;6\b&\u0007\u00128,$";
                    n18 = 15;
                    continue Label_0351_Outer;
                }
                case 15: {
                    break Label_0351_Outer;
                }
            }
        }
        array[n17] = intern;
        z = new String[] { "This server is blocked!\n", " is not a valid address\n", "Attack started!\n", "Found SRV domain, real address is ", "DeathBot v4.1", "Stop", "Start", "/frames/256x256.png", "TextField.inactiveBackground", "DeathBot V4.1", "Proxy Update", "Address:", "Console output:", "Advanced", "Basic", "Arial", "com.sun.java.swing.plaf.windows.WindowsLookAndFeel" };
    }
}
