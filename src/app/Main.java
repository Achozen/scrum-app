package app;
import javax.swing.*;

public class Main {
	private static JFrame frame;

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
		JComboBox<Integer> myNumbers = new JComboBox<>();

		myNumbers.setBounds(50, 100, 90, 20);

		for(int i = 1; i<=20; i++) {
			myNumbers.addItem(i);
		}
		frame.add(myNumbers);
	}

	private static void createSecondList(JFrame frame) {
		JComboBox<Integer> myNumbers = new JComboBox<>();

		myNumbers.setBounds(50, 200, 90, 20);

		int[] numbers = new NumberGenerator().generateNumbers();
		for(int number: numbers){
			myNumbers.addItem(number);

		}
		frame.add(myNumbers);
	}

	private static void addOkButton(JFrame frame) {
		JButton myNumbers = new JButton();
		myNumbers.setText("OK");
		myNumbers.setBounds(200, 200, 90, 20);

		frame.add(myNumbers);
	}

	private static void createTextBox(JFrame frame) {
		JTextField t1;
		t1 = new JTextField("Wynik");
		t1.setBounds(200, 100, 150, 30);
		frame.add(t1);
	}
}