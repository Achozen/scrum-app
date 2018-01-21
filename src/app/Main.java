package app;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	private static JFrame frame;
	private static JComboBox<Integer> firstList = new JComboBox<>();
	private static JComboBox<Integer> secondList = new JComboBox<>();



	public static void main(String[] args) {
		System.out.println("Hello world");
		createWindow();
	}

	private static void createWindow() {
		frame = new JFrame("Main Window");

		setupWindow(frame);
		createFirstList(frame);
		createSecondList(frame);
		addOkButton(frame);
		createTextBox(frame);

		frame.setVisible(true);
	}

	private static void setupWindow(JFrame frame) {
		int width = 500;
		int height = 500;
		frame.setSize(width, height);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static void createFirstList(JFrame frame) {

		firstList.setBounds(50, 100, 90, 20);

		for(int i = 1; i<=20; i++) {
			firstList.addItem(i);
		}
		frame.add(firstList);
	}

	private static void createSecondList(JFrame frame) {
		secondList.setBounds(50, 200, 90, 20);

		int[] numbers = new NumberGenerator().generateNumbers();
		for(int number: numbers){
			secondList.addItem(number);

		}
		frame.add(secondList);
	}

	private static void addOkButton(JFrame frame) {
		JButton okButton = new JButton();
		okButton.setText("OK");
		okButton.setBounds(200, 200, 90, 20);

		frame.add(okButton);

		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("okButton clicked");


			}
		});
	}

	private static void createTextBox(JFrame frame) {
		JTextField t1;
		t1 = new JTextField("Wynik");
		t1.setBounds(200, 100, 150, 30);
		frame.add(t1);
	}
}