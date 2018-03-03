package Arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestElement_Array {

	public static int UsingPQ(int[] A, int K) {
		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
		for (int i = 0; i < A.length; i++) {
			PQ.offer(A[i]);
		}
		int n = -1;
		while (K > 0) {
			n = PQ.poll();
			K--;
		}
		return n;
	}
//Time Complexity O(nLogn)
	public static int UsingIteration(int[] A, int K) {
		Arrays.sort(A);
		return A[K-1];
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
		int K = 4;
		System.out.println("The 5th Smallest Element " + UsingPQ(A, K));
		System.out.println("The 5th Smallest Element " + UsingIteration(A, K));
	}
}
