package LeetCode;

public class GenerateWellOrderedPassword {

	public static void printWellOrdered(int number, int x, int k) {

		if (k == 0) {
			System.out.println(number);
			return;
		}

		for (int i = (x + 1); i < 10; i++) {
			printWellOrdered(number * 10 + i, i, k - 1);
		}

	}

	public static void main(String[] args) {
		printWellOrdered(0, 0, 1);

	}

}