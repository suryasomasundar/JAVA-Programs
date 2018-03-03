package Arrays;

import java.util.Arrays;

public class ReverseArray_Inplace {
	public static void reverse(int arrA[]) {
		int Start = 0;
		int End = arrA.length - 1;
		while (Start <= End) {
			int temp = arrA[Start];
			arrA[Start] = arrA[End];
			arrA[End] = temp;

			Start++;
			End--;

		}
	}

	public static void reverserecursive(int arrA[], int Start, int End) {
		if (Start <= End) {
			int temp = arrA[Start];
			arrA[Start] = arrA[End];
			arrA[End] = temp;

			Start++;
			End--;
			reverserecursive(arrA, Start, End);
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		reverse(array);
		System.out.println(Arrays.toString(array));
		reverserecursive(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
}
