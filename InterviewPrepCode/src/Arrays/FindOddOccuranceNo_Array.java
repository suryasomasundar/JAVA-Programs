/*Objec­tive: 
 * Given a array of inte­gers, in which every ele­ments occurs even num­ber of times 
 * except one num­ber which occurs add num­ber of times. 
 * Find out that number.
    A = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7 };
Element appearing add number of times: 5

Other Way if one number appears only once then we use this algorithm
*/

package Arrays;

public class FindOddOccuranceNo_Array {

	public int findoddoccur_XOR(int[] A) {
		int x = 0;
		for (int i = 0; i < A.length; i++) {
			x = x ^ A[i];
		}
		return x;
	}

	public static void main(String[] args) {
		int[] Array = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7 };
		FindOddOccuranceNo_Array obj = new FindOddOccuranceNo_Array();
		System.out.println("The number which is appearing ODD number of times = "+ obj.findoddoccur_XOR(Array));
	}
}
