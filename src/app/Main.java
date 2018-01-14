package app;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Main {
	private static JFrame frame;

	public static void main(String[] args) {
		System.out.println("Hello world");
		createWindow();
	}

	private static void createWindow() {
		frame = new JFrame("Main Window");

		setupWindow(frame);
		createList(frame);

		frame.setVisible(true);
	}

	private static void setupWindow(JFrame frame) {
		int width = 500;
		int height = 500;
		frame.setSize(width, height);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static void createList(JFrame frame) {
		JComboBox<Integer> myNumbers = new JComboBox<Integer>();

		myNumbers.setBounds(50, 100, 90, 20);

		for(int i = 1; i<=20; i++) {
			myNumbers.addItem(i);
		}
		frame.add(myNumbers);
	}
}