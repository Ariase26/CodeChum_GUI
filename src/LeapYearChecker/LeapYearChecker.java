package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

public class LeapYearChecker extends JFrame{

    private JButton btnCheckYear;
    private JTextField tfYear;
    private JPanel jpanel;


    public LeapYearChecker() {
        LeapYearChecker leap = this;
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(tfYear.getText());;
                if ( (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0) ){
                    JOptionPane.showMessageDialog(null, "Leap Year");
                } else {
                    JOptionPane.showMessageDialog(null, "Not a Leap Year");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker yearChecker = new LeapYearChecker();
        yearChecker.setContentPane(yearChecker.jpanel);
        yearChecker.setTitle("Leap Year Checker");
        yearChecker.setSize(400, 200);
        yearChecker.setDefaultCloseOperation(EXIT_ON_CLOSE);
        yearChecker.setVisible(true);
    }
}
