package app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static JFrame frame;
    private static JComboBox<String> stateList = new JComboBox<>();
    private static JComboBox<String> productCategoryList = new JComboBox<>();

    public static void main(String[] args) {
        System.out.println("Hello world");
        createWindow();
    }

    private static void createWindow() {
        frame = new JFrame("Main Window");

        setupWindow(frame);
        createStateList(frame);
        setupOnStateChange();
        createProductList(frame);
        addOkButton(frame);
        createResultTextBox(frame);
        createInitialAmountTextBox(frame);

        frame.setVisible(true);
    }

    private static void setupWindow(JFrame frame) {
        int width = 500;
        int height = 500;
        frame.setSize(width, height);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void createStateList(JFrame frame) {

        stateList.setBounds(50, 100, 90, 20);

        for (int i = 1; i <= 20; i++) {
            stateList.addItem("State " + i);
        }
        frame.add(stateList);
    }

    private static void setupOnStateChange() {
        stateList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                productCategoryList.removeAllItems();
                for (int i = 1; i <= 6; i++) {
                    productCategoryList.addItem("Product " + i + " Vat " + new NumberGenerator().generateTaxExample() + "%");
                }
            }
        });
    }

    private static void createProductList(JFrame frame) {
        productCategoryList.setBounds(200, 100, 150, 30);

        for (int i = 1; i <= 6; i++) {
            productCategoryList.addItem("Product " + i + " Vat " + new NumberGenerator().generateTaxExample() + "%");
        }
        frame.add(productCategoryList);
    }

    private static void addOkButton(JFrame frame) {
        JButton okButton = new JButton();
        okButton.setText("Licz netto !");
        okButton.setBounds(50, 150, 90, 20);

        frame.add(okButton);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("okButton clicked");
            }
        });
    }

    private static void createResultTextBox(JFrame frame) {
        JTextField t1;
        t1 = new JTextField("Result");
        t1.setBounds(50, 200, 120, 20);
        frame.add(t1);
    }

    private static void createInitialAmountTextBox(JFrame frame) {
        JTextField t1;
        t1 = new JTextField("Brutto");
        t1.setBounds(50, 50, 150, 30);
        frame.add(t1);
    }
}