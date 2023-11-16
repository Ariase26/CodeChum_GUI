package SimpleCalculator;

import LeapYearChecker.LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton computeResultButton;
    private JPanel jpanel;
    private JTextField textField1;

    public SimpleCalculator() {
        SimpleCalculator calc = this;
        computeResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(tfNumber1.getText());
                    int number2 = Integer.parseInt(tfNumber2.getText());
                    String operation = (String) cbOperations.getSelectedItem();
                    int result = 0;

                    switch (operation) {
                        case "+":
                            result = number1 + number2;
                            break;
                        case "-":
                            result = number1 - number2;
                            break;
                        case "*":
                            result = number1 * number2;
                            break;
                        case "/":
                            if (number2 != 0) {
                                result = number1 / number2;
                            } else {
                                JOptionPane.showMessageDialog(null, "Cannot divide by zero!");
                            }
                            break;
                    }
                    textField1.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setContentPane(calculator.jpanel);
        calculator.setTitle("Simple Calculator");
        calculator.setSize(600, 200);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calculator.setVisible(true);
    }
}
