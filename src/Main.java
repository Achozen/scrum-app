import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		createWindow();

	}

	private static void createWindow() {
		JFrame frame = new JFrame("Main Window");
		int width = 500;
		int height = 500;
		frame.setSize(width, height);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createList(frame);
		
		
		frame.setVisible(true);
	}

	private static void createList(JFrame frame) {
		int numbers[] = { 1, 2, 3, 4, 5};
		JComboBox<Integer> myNumbers = new JComboBox<Integer>();
		myNumbers.setBounds(50, 100, 90, 20);
		frame.add(myNumbers);
	}
	
}