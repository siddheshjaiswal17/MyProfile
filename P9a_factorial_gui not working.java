//Design an AWT program to print the factorial for an input value

import java.awt.*;
import java.awt.event.*;

public class P9a_factorial_gui extends Frame implements ActionListener {
    TextField t1;
    Button b1;
    Label l1, l2, l3;
    long num, fact;
    String msg, s1;

    public P9a_factorial_gui() {
        l1 = new Label("Enter a number:");
        t1 = new TextField(4);
        b1 = new Button("Calculate");
        l2 = new Label("\nResult:");
        l3 = new Label();
        add(l1);
        add(t1);
        add(b1);
        add(l2);
        add(l3);
        b1.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300, 300);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        msg = t1.getText();
        if (!msg.equals("")) {
            try {
                num = Long.parseLong(msg);
                if (num < 0) {
                    l3.setText("Please enter a non-negative number.");
                } else {
                    fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }
                    s1 = String.valueOf(fact);
                    l3.setText(s1);
                }
            } catch (NumberFormatException e) {
                l3.setText("Invalid input!");
            }
        }
    }

    public static void main(String arg[]) {
        new P9a_factorial_gui();
    }
}
