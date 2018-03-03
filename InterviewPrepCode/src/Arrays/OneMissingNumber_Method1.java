package Arrays;

public class OneMissingNumber_Method1 {
	int sum;
	int sum_of_N;

	public int missing(int[] arrA, int size) {
		sum_of_N = size * (size + 1) / 2;
		for (int i = 0; i < arrA.length; i++) {
			sum += arrA[i];

		}
		return sum_of_N - sum;
	}

	public static void main(String args[]) {
		int[] array = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int size = 10;
		OneMissingNumber_Method1 obj = new OneMissingNumber_Method1();
		System.out.println(obj.missing(array, size));

	}
}
