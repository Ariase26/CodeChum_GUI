package FoodOrderingSystem;

import SimpleCalculator.SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JPanel jpanel;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JButton btnOrder;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    public FoodOrderingSystem() {
        FoodOrderingSystem system = this;
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0;

                // Prices of food items
                double pizzaPrice = 100;
                double burgerPrice = 80;
                double friesPrice = 65;
                double softDrinksPrice = 55;
                double teaPrice = 50;
                double sundaePrice = 40;

                // Compute total price based on selected items
                if (cPizza.isSelected()) total += pizzaPrice;
                if (cBurger.isSelected()) total += burgerPrice;
                if (cFries.isSelected()) total += friesPrice;
                if (cSoftDrinks.isSelected()) total += softDrinksPrice;
                if (cTea.isSelected()) total += teaPrice;
                if (cSundae.isSelected()) total += sundaePrice;

                // Applying discount based on selected radio button
                if (rb5.isSelected()) {
                    total *= 0.95; // 5% discount
                } else if (rb10.isSelected()) {
                    total *= 0.90; // 10% discount
                } else if (rb15.isSelected()) {
                    total *= 0.85; // 15% discount
                }

                // Display the total price in an option pane
                JOptionPane.showMessageDialog(null, String.format("The total price is Php %.2f", total));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem foodSystem = new FoodOrderingSystem();
        foodSystem.setContentPane(foodSystem.jpanel);
        foodSystem.setTitle("Food Ordering System");
        foodSystem.setSize(350, 400);
        foodSystem.setDefaultCloseOperation(EXIT_ON_CLOSE);
        foodSystem.setVisible(true);
    }
}
