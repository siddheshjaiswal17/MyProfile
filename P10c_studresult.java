//Design an AWT application to generate a result mark sheet.

import java.awt.*;
import java.awt.event.*;

public class P10c_studresult implements ActionListener {
    Frame f = new Frame();
    Label l1 = new Label("Roll Number:", Label.CENTER);
    Label l2 = new Label("Student Name:", Label.CENTER);
    Label l3 = new Label("JAVA", Label.CENTER);
    Label l4 = new Label("ES", Label.CENTER);
    Label l5 = new Label("SE", Label.CENTER);
    Label l6 = new Label("COST", Label.CENTER);
    Label l7 = new Label("CG", Label.CENTER);
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField();
    TextField t5 = new TextField();
    TextField t6 = new TextField();
    TextField t7 = new TextField();
    Button b1 = new Button("Result");
    Button b2 = new Button("Clear");
    Label l8 = new Label("Total", Label.CENTER);
    Label l9 = new Label("Percentage", Label.CENTER);
    TextField t8 = new TextField();
    TextField t9 = new TextField();

    P10c_studresult() {
        f.setLayout(new GridLayout(12, 3, 20, 25));
        t8.setEditable(false);
        t9.setEditable(false);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
        f.add(t5);
        f.add(l6);
        f.add(t6);
        f.add(l7);
        f.add(t7);
        f.add(b1);
        f.add(b2);
        f.add(l8);
        f.add(t8);
        f.add(l9);
        f.add(t9);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.setVisible(true);
        f.setSize(300, 600);
        f.setTitle("Student's Result");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        f.setBackground(Color.LIGHT_GRAY);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int n1 = Integer.parseInt(t3.getText());
            int n2 = Integer.parseInt(t4.getText());
            int n3 = Integer.parseInt(t5.getText());
            int n4 = Integer.parseInt(t6.getText());
            int n5 = Integer.parseInt(t7.getText());
            int total = n1 + n2 + n3 + n4 + n5;
            double percentage = total / 5.0;
            t8.setText(String.valueOf(total));
            t9.setText(String.valueOf(percentage));
        }
        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
        }
    }

    public static void main(String arg[]) {
        new P10c_studresult();
    }
}
