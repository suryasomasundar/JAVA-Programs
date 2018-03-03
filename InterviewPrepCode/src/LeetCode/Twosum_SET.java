package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Twosum_SET {
	public static void main(String args[]) {
	int [] a = {1,2,3,4};
	int n = 7;
	Twosum_SET obj = new Twosum_SET();
	obj.printPairsUsingSet(a, n);
	}

	/**
	 * * Given an array of integers finds two elements in the array whose sum is
	 * equal to n. * @param numbers * @param n
	 */
	public static void printPairsUsingSet(int[] numbers, int n) {
		if (numbers.length < 2) {
			return;
		}
		Set set = new HashSet(numbers.length);
		for (int value : numbers) {
			int target = n - value;
			// if target number is not in set then add
			if(!set.contains(target))
			{ 
				set.add(value); 
			}else {
			 System.out.printf("(%d, %d) %n", value, target); 
			 } 
			} 
		}
}


