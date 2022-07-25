// 
// Decompiled by Procyon v0.5.36
// 

package de.me.death;

import java.io.Serializable;
import java.util.Iterator;
import uiztfzghuzt.kg;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class kb extends JPanel
{
    private static final long serialVersionUID = 5014410134332227236L;
    private JTextField a;
    private JSpinner b;
    private JSpinner c;
    private JComboBox<c> d;
    private JCheckBox e;
    private JLabel f;
    private JComboBox<d> g;
    private JComboBox<String> h;
    private static final String[] z;
    
    public kb() {
    Label_0510_Outer:
        while (true) {
            final boolean i = ib.i;
            this.setSize(new Dimension(266, 177));
            this.setLayout(null);
            final JLabel comp = new JLabel("Threads:");
            comp.setBounds(10, 34, 111, 20);
            this.add(comp);
            (this.b = new JSpinner()).setBounds(180, 34, 76, 20);
            this.add(this.b);
            final JLabel comp2 = new JLabel("Nicks Mode:");
            comp2.setBounds(10, 60, 111, 20);
            this.add(comp2);
            (this.d = new JComboBox<c>()).addItem(de.me.death.c.RANDOM);
            this.d.addItem(de.me.death.c.FAKENICKS);
            this.d.addItem(de.me.death.c.NICKS);
            this.d.setBounds(145, 60, 111, 20);
            this.add(this.d);
            final JLabel comp3 = new JLabel("Minecraft Mode:");
            comp3.setBounds(10, 86, 111, 20);
            this.add(comp3);
            (this.h = new JComboBox<String>()).setEnabled(false);
            this.h.addItem("Cracked");
            this.h.setBounds(145, 86, 111, 20);
            this.add(this.h);
            (this.e = new JCheckBox("Spam")).setBounds(10, 112, 97, 20);
            this.add(this.e);
            (this.c = new JSpinner()).setBounds(197, 112, 59, 20);
            this.add(this.c);
            final JLabel comp4 = new JLabel("x");
            comp4.setHorizontalAlignment(0);
            comp4.setBounds(171, 112, 23, 20);
            this.add(comp4);
            (this.a = new JTextField()).setToolTipText("Spam text");
            this.a.setBounds(10, 138, 246, 31);
            this.add(this.a);
            this.a.setColumns(10);
            (this.f = new JLabel("Version:")).setBounds(10, 8, 97, 20);
            this.add(this.f);
            this.g = new JComboBox<d>();
            final Iterator<d> iterator = de.me.death.d.getProtocols().iterator();
            while (true) {
                while (true) {
                    Label_0524: {
                        Serializable s;
                        try {
                            if (!i) {
                                break Label_0524;
                            }
                            s = iterator.next();
                        }
                        catch (kg kg) {
                            throw kg;
                        }
                        this.g.addItem((d)s);
                    }
                    if (iterator.hasNext()) {
                        continue Label_0510_Outer;
                    }
                    break;
                }
                this.g.setBounds(180, 8, 76, 20);
                Serializable s = this.add(this.g);
                if (!i) {
                    break;
                }
                continue;
            }
        }
    }
    
    public int a() {
        return (int)this.b.getValue();
    }
    
    public c b() {
        return this.d.getItemAt(this.d.getSelectedIndex());
    }
    
    public boolean c() {
        return this.e.isSelected();
    }
    
    public boolean d() {
        return this.h.getItemAt(this.h.getSelectedIndex()).equalsIgnoreCase("Premium");
    }
    
    public int e() {
        return (int)this.c.getValue();
    }
    
    public String f() {
        return this.a.getText();
    }
    
    public d g() {
        return this.g.getItemAt(this.g.getSelectedIndex());
    }
    
    public void a(final int i) {
        this.b.setValue(i);
    }
    
    @Override
    public Dimension getPreferredSize() {
        return this.getSize();
    }
    
    static {
        final String[] array = new String[8];
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 0))))));
        String s = "3\u0018)[b\u0016\u0007";
        int n9 = -1;
        String intern = null;
    Label_0156_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n11;
            final int n10 = n11 = (length = charArray.length);
            int n12 = 0;
            while (true) {
                Label_0230: {
                    if (n10 > 1) {
                        break Label_0230;
                    }
                    length = (n11 = n12);
                    do {
                        final char c = charArray[n11];
                        char c2 = '\0';
                        switch (n12 % 5) {
                            case 0: {
                                c2 = 'c';
                                break;
                            }
                            case 1: {
                                c2 = 'j';
                                break;
                            }
                            case 2: {
                                c2 = 'L';
                                break;
                            }
                            case 3: {
                                c2 = '6';
                                break;
                            }
                            default: {
                                c2 = '\u000b';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n12;
                    } while (n10 == 0);
                }
                if (n10 > n12) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n9) {
                default: {
                    array[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 1)))))));
                    s = ".\u0003\"Sh\u0011\u000b*B+.\u0005(S1";
                    n9 = 0;
                    continue Label_0156_Outer;
                }
                case 0: {
                    array[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 2)))))));
                    s = "7\u0002>Sj\u0007\u0019v";
                    n9 = 1;
                    continue Label_0156_Outer;
                }
                case 1: {
                    array[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 3)))))));
                    s = "5\u000f>Eb\f\u0004v";
                    n9 = 2;
                    continue Label_0156_Outer;
                }
                case 2: {
                    array[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 4)))))));
                    s = "0\u001a-[";
                    n9 = 3;
                    continue Label_0156_Outer;
                }
                case 3: {
                    array[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 5)))))));
                    s = "0\u001a-[+\u0017\u000f4B";
                    n9 = 4;
                    continue Label_0156_Outer;
                }
                case 4: {
                    array[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 6)))))));
                    s = "-\u0003/]xC'#RnY";
                    n9 = 5;
                    continue Label_0156_Outer;
                }
                case 5: {
                    array[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 7)))))));
                    s = " \u0018-U`\u0006\u000e";
                    n9 = 6;
                    continue Label_0156_Outer;
                }
                case 6: {
                    break Label_0156_Outer;
                }
            }
        }
        array[n8] = intern;
        z = new String[] { "Premium", "Minecraft Mode:", "Threads:", "Version:", "Spam", "Spam text", "Nicks Mode:", "Cracked" };
    }
}
