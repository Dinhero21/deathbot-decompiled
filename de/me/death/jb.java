// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import uiztfzghuzt.kg;
import uiztfzghuzt.nb;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class jb extends JPanel
{
    private static final long serialVersionUID = -1377892103175965874L;
    private JTextField a;
    private JTextField b;
    private JSpinner c;
    private JCheckBox d;
    private JCheckBox e;
    private JCheckBox f;
    private JSpinner g;
    private JSpinner h;
    private JCheckBox i;
    private JCheckBox j;
    private JComboBox<b> k;
    private JSpinner l;
    private static final String[] z;
    
    public jb() {
        final boolean i = ib.i;
        this.setLayout(null);
        this.setSize(new Dimension(262, 214));
        final JLabel comp = new JLabel("Nicksize:");
        comp.setBounds(10, 6, 83, 23);
        this.add(comp);
        (this.c = new JSpinner(new SpinnerNumberModel(16, 6, 16, 1))).setBounds(201, 6, 55, 23);
        this.add(this.c);
        (this.d = new JCheckBox("Stay")).setBounds(10, 32, 97, 23);
        this.add(this.d);
        (this.e = new JCheckBox("Achievement Spam")).setBounds(10, 58, 136, 23);
        this.add(this.e);
        (this.f = new JCheckBox("Multijoin")).setBounds(10, 162, 97, 23);
        this.add(this.f);
        final JLabel comp2 = new JLabel("ProxyMode:");
        comp2.setBounds(10, 88, 83, 23);
        this.add(comp2);
        final JLabel comp3 = new JLabel("Register CMD:");
        comp3.setBounds(10, 109, 83, 23);
        this.add(comp3);
        final JLabel comp4 = new JLabel("Login CMD:");
        boolean a = false;
        Label_0764: {
            Label_0758: {
                try {
                    comp4.setBounds(10, 132, 83, 23);
                    this.add(comp4);
                    (this.g = new JSpinner(new SpinnerNumberModel(0, 0, 31, 1))).setBounds(191, 32, 65, 20);
                    this.add(this.g);
                    (this.i = new JCheckBox("Ping")).setBounds(10, 188, 97, 23);
                    this.add(this.i);
                    (this.j = new JCheckBox("Bot Movement")).setToolTipText("This will slow the bot way down!");
                    this.j.setBounds(148, 58, 108, 23);
                    this.add(this.j);
                    (this.k = new JComboBox<b>()).addItem(de.me.death.b.SOCKS);
                    this.k.addItem(de.me.death.b.HTTP);
                    this.k.addItem(de.me.death.b.BOTH);
                    this.k.addItem(de.me.death.b.NONE);
                    this.k.setBounds(159, 88, 97, 20);
                    this.k.setSelectedItem(de.me.death.b.BOTH);
                    this.add(this.k);
                    (this.a = new JTextField()).setToolTipText("/login 123456789");
                    this.a.setText("/register 123456789 123456789");
                    this.a.setBounds(116, 110, 140, 20);
                    this.add(this.a);
                    this.a.setColumns(10);
                    (this.b = new JTextField()).setText("/login 123456789");
                    this.b.setBounds(116, 133, 140, 20);
                    this.add(this.b);
                    this.b.setColumns(10);
                    (this.h = new JSpinner()).setValue(2);
                    this.h.setBounds(201, 163, 55, 20);
                    this.add(this.h);
                    (this.l = new JSpinner()).setValue(1);
                    this.l.setBounds(201, 189, 55, 20);
                    this.add(this.l);
                    if (!i) {
                        return;
                    }
                    final boolean b = nb.a;
                    if (b) {
                        break Label_0758;
                    }
                    break Label_0758;
                }
                catch (kg kg) {
                    throw kg;
                }
                try {
                    final boolean b = nb.a;
                    if (b) {
                        a = false;
                        break Label_0764;
                    }
                }
                catch (kg kg2) {
                    throw kg2;
                }
            }
            a = true;
        }
        nb.a = a;
    }
    
    public int a() {
        return (int)this.c.getValue();
    }
    
    public boolean b() {
        return this.d.isSelected();
    }
    
    public int c() {
        return (int)this.g.getValue();
    }
    
    public boolean d() {
        return this.e.isSelected();
    }
    
    public boolean e() {
        return this.f.isSelected();
    }
    
    public int f() {
        return (int)this.h.getValue();
    }
    
    public boolean g() {
        return this.i.isSelected();
    }
    
    public int h() {
        return (int)this.l.getValue();
    }
    
    public boolean i() {
        return this.j.isSelected();
    }
    
    public b j() {
        return this.k.getItemAt(this.k.getSelectedIndex());
    }
    
    public String k() {
        return this.a.getText();
    }
    
    public String l() {
        return this.b.getText();
    }
    
    @Override
    public Dimension getPreferredSize() {
        return this.getSize();
    }
    
    static {
        final String[] array = new String[12];
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
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 0))))))))));
        String s = "\u001b\u00157KEG\u00137^\f\u0005Ua\u0018\u0019\u0002Pj\u0015\f\u0005Ua\u0018\u0019\u0002Pj\u0015";
        int n13 = -1;
        String intern = null;
    Label_0224_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n15;
            final int n14 = n15 = (length = charArray.length);
            int n16 = 0;
            while (true) {
                Label_0298: {
                    if (n14 > 1) {
                        break Label_0298;
                    }
                    length = (n15 = n16);
                    do {
                        final char c = charArray[n15];
                        char c2 = '\0';
                        switch (n16 % 5) {
                            case 0: {
                                c2 = '4';
                                break;
                            }
                            case 1: {
                                c2 = 'g';
                                break;
                            }
                            case 2: {
                                c2 = 'R';
                                break;
                            }
                            case 3: {
                                c2 = ',';
                                break;
                            }
                            default: {
                                c2 = ',';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n16;
                    } while (n14 == 0);
                }
                if (n14 > n16) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n13) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 1)))))))))));
                    s = "d\u000e<K";
                    n13 = 0;
                    continue Label_0224_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 2)))))))))));
                    s = "y\u0012>XE^\b;B";
                    n13 = 1;
                    continue Label_0224_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 3)))))))))));
                    s = "v\b&\fa[\u00117AIZ\u0013";
                    n13 = 2;
                    continue Label_0224_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 4)))))))))));
                    s = "f\u00025E_@\u0002 \foy#h";
                    n13 = 3;
                    continue Label_0224_Outer;
                }
                case 3: {
                    array[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 5)))))))))));
                    s = "z\u000e1G_]\u001d7\u0016";
                    n13 = 4;
                    continue Label_0224_Outer;
                }
                case 4: {
                    array[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 6)))))))))));
                    s = "`\u000f;_\fC\u000e>@\fG\u000b=[\f@\u000f7\fN[\u0013r[MMG6C[ZF";
                    n13 = 5;
                    continue Label_0224_Outer;
                }
                case 5: {
                    array[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 7)))))))))));
                    s = "x\b5EB\u0014$\u001fh\u0016";
                    n13 = 6;
                    continue Label_0224_Outer;
                }
                case 6: {
                    array[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 8)))))))))));
                    s = "g\u00133U";
                    n13 = 7;
                    continue Label_0224_Outer;
                }
                case 7: {
                    array[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 9)))))))))));
                    s = "u\u0004:EIB\u0002?IB@G\u0001\\MY";
                    n13 = 8;
                    continue Label_0224_Outer;
                }
                case 8: {
                    array[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 10)))))))))));
                    s = "d\u0015=TUy\b6I\u0016";
                    n13 = 9;
                    continue Label_0224_Outer;
                }
                case 9: {
                    array[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 11)))))))))));
                    s = "\u001b\u000b=KEZGc\u001e\u001f\u0000Rd\u001b\u0014\r";
                    n13 = 10;
                    continue Label_0224_Outer;
                }
                case 10: {
                    break Label_0224_Outer;
                }
            }
        }
        array[n12] = intern;
        z = new String[] { "/register 123456789 123456789", "Ping", "Multijoin", "Bot Movement", "Register CMD:", "Nicksize:", "This will slow the bot way down!", "Login CMD:", "Stay", "Achievement Spam", "ProxyMode:", "/login 123456789" };
    }
}
