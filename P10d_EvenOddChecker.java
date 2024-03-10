//program for even odd number check

import java.awt.*;
import java.awt.event.*;

public class P10d_EvenOddChecker extends Frame implements ActionListener {
    TextField textField;
    Label resultLabel;

    P10d_EvenOddChecker() {
        Label numberLabel = new Label("Enter a number:");
        textField = new TextField();
        Button checkButton = new Button("Check");
        resultLabel = new Label();

        numberLabel.setBounds(50, 50, 100, 20);
        textField.setBounds(170, 50, 100, 20);
        checkButton.setBounds(100, 100, 80, 30);
        resultLabel.setBounds(100, 150, 200, 20);

        add(numberLabel);
        add(textField);
        add(checkButton);
        add(resultLabel);

        checkButton.addActionListener(this);

        setSize(300, 200);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(textField.getText());
            if (number % 2 == 0) {
                resultLabel.setText("Number is Even");
            } else {
                resultLabel.setText("Number is Odd");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input! Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        new P10d_EvenOddChecker();
    }
}
