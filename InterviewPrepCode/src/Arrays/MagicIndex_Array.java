package Arrays;

import java.util.Arrays;

public class MagicIndex_Array {

	public void iterationway(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == i) {
				System.out.println("The Magic Index is : " + i + " And The Value is: " + A[i]);
			}
		}
	}

	public int Binaryway(int[] A, int Start, int End) {

		while (Start <= End) {
			int mid = (Start + End) / 2;
			if (mid == A[mid]) {
				return mid;
			} else if (mid < A[mid]) {
				return Binaryway(A, Start, mid - 1);
			} else {
				return Binaryway(A, mid + 1, End);
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		int[] Array = { -1, 0, 2 };
		MagicIndex_Array obj = new MagicIndex_Array();
		obj.iterationway(Array);
		System.out.println(obj.Binaryway(Array, 0, Array.length - 1));
	}
}
