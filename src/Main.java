import java.awt.Frame;

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
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}