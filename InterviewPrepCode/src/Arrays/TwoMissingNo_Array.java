package Arrays;

public class TwoMissingNo_Array {
	public int[] findtwo(int[] A, int range) {
		int sum = 0;
		int sum_of_N = 0;
		int a;
		int b;
		int product = 1;
		int product_of_N = 1;

		sum_of_N = (range * (range + 1)) / 2;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		int S = sum_of_N - sum; // a+b

		for (int i = 1; i <= range; i++) {
			product_of_N *= i;
		}

		for (int i = 0; i < A.length; i++) {
			product *= A[i];
		}
		int P = product_of_N / product; // ab

		int diffsqrt = (int) Math.sqrt(S * S - 4 * P); // (a-b)^2 = (a+b)^2-4ab
		a = (diffsqrt + S) / 2;
		b = S - a;
		int[] result = { a, b };
		return result;
	}

	public static void main(String[] args) {
		int[] array = { 10, 2, 3, 5, 7, 8, 9, 1 };
		TwoMissingNo_Array obj = new TwoMissingNo_Array();
		int[] results = obj.findtwo(array, 10);
		System.out.println("Missing Numbers are: " + results[0] + " and " + results[1]);
	}
}
