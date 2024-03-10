//Design an AWT program to perform various string operations like reverse string,
//string concatenation etc.

import java.awt.*;
import java.awt.event.*;

public class Prac9B extends Frame implements ActionListener {
    TextField t1, t2;
    Button b1, b2;
    Label l1, l2, l3, l4;
    String msg = "", str;

    public Prac9B() {
        l1 = new Label("Enter String1: ");
        l1.setBounds(50, 100, 100, 20);
        t1 = new TextField(20);
        t1.setBounds(200, 100, 100, 20);
        l2 = new Label("Enter String2: ");
        l2.setBounds(50, 140, 100, 20);
        t2 = new TextField(20);
        t2.setBounds(200, 140, 100, 20);
        b1 = new Button("Reverse");
        b1.setBounds(50, 200, 100, 20);
        b2 = new Button("Concatenate");
        b2.setBounds(200, 200, 100, 20);
        l3 = new Label("Result: ");
        l3.setBounds(50, 250, 100, 20);
        l4 = new Label("");
        l4.setBounds(100, 250, 250, 50);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(l3);
        add(l4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(null);
        setTitle("String Methods");
        setVisible(true);
        setSize(400, 400);
    }

    public void actionPerformed(ActionEvent ae) {
        str = t1.getText();
        if (ae.getSource().equals(b1)) {
            int i;
            int l = str.length();
            msg = ""; // Reset msg before computing reversed string
            for (i = l - 1; i >= 0; i--) {
                msg = msg + str.charAt(i);
            }
            l4.setText(msg);
        }
        if (ae.getSource().equals(b2)) {
            l4.setText("");
            String str2 = t2.getText();
            String str3 = str + " " + str2;
            l4.setText(str3);
        }
    }

    public static void main(String arg[]) {
        new Prac9B();
    }
}
