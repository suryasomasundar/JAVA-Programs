package Arrays;

public class OneMissingNumber_Method2 {

	public static int missing(int[] arrA, int size) {
		int A = 0;
		int B = 0;
		for (int i = 1; i <= size; i++) {
			A = A ^ i;
		}
		for (int i = 0; i < arrA.length; i++) {
			B = B ^ arrA[i];
		}
		return A ^ B;
	}

	public static void main(String args[]) {
		int[] array = { 0, 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		System.out.println(OneMissingNumber_Method2.missing(array, 10));
	}
}