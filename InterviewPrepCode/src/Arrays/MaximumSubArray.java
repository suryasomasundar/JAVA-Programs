/*Objec­tive:  
 * The max­i­mum sub­ar­ray prob­lem is the task of find­ing the con­tigu­ous 
 * sub­ar­ray within a one-dimensional array of num­bers 
 * which has the largest sum.
 * Example:
 A = {−2, 1, −3, 4, −1, 2, 1, −5, 4};
Output: contiguous sub array with the largest sum is 4, −1, 2, 1, with sum 6.
 */


// Also Called Kadane's Algorithm
package Arrays;

public class MaximumSubArray {
	public int subOnlyPositive(int[] A) {
		int max_so_far = 0;
		int max_end_here = 0;
		for (int i = 0; i < A.length; i++) {
			max_end_here += A[i];
			if (max_end_here < 0) {
				max_end_here = 0;
			}
			if (max_so_far < max_end_here) {
				max_so_far = max_end_here;
			}
		}
		return max_so_far;
	}

	public int subwithNegative(int[] A) {

		int max_so_far = A[0];
		int max_end_here = A[0];
		for (int i = 1; i < A.length; i++) {
			max_end_here = Math.max(A[i], max_end_here + A[i]);
			max_so_far = Math.max(max_so_far, max_end_here);
		}
		return max_so_far;
	}

	public static void main(String args[]) {
		int arrA1[] = { 1, 2, -3, -4, 2, 7, -2, 3 };
		MaximumSubArray obj = new MaximumSubArray();
		System.out.println("Maximum SubArray is " + obj.subOnlyPositive(arrA1));
		int arrA2[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Maximum SubArray is " + obj.subOnlyPositive(arrA2));
		int arrB[] = { -2, -3, -4, -2, -7, -2, -3, -11 };
		System.out.println("Maximum SubArray is " + obj.subwithNegative(arrB));

	}
}
