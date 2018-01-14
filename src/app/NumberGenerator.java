package app;

import java.util.Random;

public class NumberGenerator {

	public int[] generateNumbers() {

		int[] tab = new int[20];
		Random generator = new Random();

		for (int i = 0; i < 20; i++) {
			tab[i] = generator.nextInt(100);
			System.out.println("Liczba:" + tab[i]);
		}
		return tab;
	}
}
