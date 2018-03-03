/*Objec­tive: 
 * Given an array of inte­gers, find out the first repeated ele­ment. 
 * First repeated ele­ment means the ele­ment occurs at least twice and has small­est index.
 * */

package Arrays;

import java.util.HashSet;

public class FirstRepeatedElement_ByIndex {
	public int findelement(int[] A) {
		int index = -1;
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = A.length - 1; i >= 0; i--) {
			if (hs.contains(A[i])) {
				index = i;
			} else {
				hs.add(A[i]);
			}
		}
		return A[index];
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 5, 7, 5, 3, 10, 2 };
		int [] B = {7,2,2,3,7};
		FirstRepeatedElement_ByIndex obj = new FirstRepeatedElement_ByIndex();
		System.out.println(obj.findelement(A));
		System.out.println(obj.findelement(B));
	}

}
