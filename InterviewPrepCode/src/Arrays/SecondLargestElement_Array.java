package Arrays;

public class SecondLargestElement_Array {

	public int secondlargest(int[] A) {
		int first = A[0];
		int second = -1;
		for (int i = 1; i < A.length; i++) {
			if (first < A[i]) {
				second = first;
				first = A[i];
			} else if (second < A[i]) {
				second = A[i];

			}
		}
		return second;
	}

	public static void main(String[] args) {
		int[] array = { 1, 7, 8, 5, 6, 7, 4 };
		SecondLargestElement_Array obj = new SecondLargestElement_Array();
		System.out.println(obj.secondlargest(array));
	}
}
