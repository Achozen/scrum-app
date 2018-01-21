package app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static JTextField bruttoTextField;
    private static JTextField resultTextField;
    private static JFrame frame;
    private static JComboBox<String> stateList = new JComboBox<>();
    private static JComboBox<String> productCategoryList = new JComboBox<>();
    private static int[] taxAmount = new int[7];

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
                generateProducts();
            }
        });
    }

    private static void generateProducts() {
        for (int i = 0; i <= 5; i++) {
            taxAmount[i] = new NumberGenerator().generateTaxExample();
            productCategoryList.addItem("Product " + i + " Tax " + taxAmount[i] + "%");
        }
    }

    private static void createProductList(JFrame frame) {
        productCategoryList.setBounds(200, 100, 150, 30);

        generateProducts();
        frame.add(productCategoryList);
    }

    private static void addOkButton(JFrame frame) {
        JButton okButton = new JButton();
        okButton.setText("Licz netto !");
        okButton.setBounds(50, 150, 120, 20);

        frame.add(okButton);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("okButton clicked");
                double netto = 0;
                double taxPercentage = taxAmount[productCategoryList.getSelectedIndex()];
                System.out.println("tax amount selected: " + taxAmount[productCategoryList.getSelectedIndex()]);
                double brutto = Double.parseDouble(bruttoTextField.getText());
                System.out.println("Brutto " + brutto);
                double actualTax = taxPercentage / 100;
                System.out.println("actualTax " + actualTax);

                netto = brutto / (1 + actualTax);
                System.out.println("netto  " + netto);

                resultTextField.setText(String.valueOf(netto));
            }
        });
    }

    private static void createResultTextBox(JFrame frame) {

        resultTextField = new JTextField("Result");
        resultTextField.setBounds(50, 200, 120, 20);
        frame.add(resultTextField);
    }

    private static void createInitialAmountTextBox(JFrame frame) {

        bruttoTextField = new JTextField("Brutto");
        bruttoTextField.setBounds(50, 50, 150, 30);
        frame.add(bruttoTextField);
    }
}