package LeetCode;

import java.util.Arrays;

public class Twosum_SORT {
	
	public static void twosumsort(int []A , int GivenSum){
		if(A.length<2){
			return;
		}
		Arrays.sort(A);
		int left = 0;
		int right = A.length-1;
		while(left<right){
			int ActualSum = A[left] + A[right];
			if(ActualSum == GivenSum){
				System.out.printf("(%d %d) %n" , A[left] , A[right] );
				left ++;
				right --;
			}else if(ActualSum < GivenSum){
				left++;
			}else{
				right--;
			}
		}
	}

	public static void main(String args[]) {
	int [] a = {1,2,3,4,5,6};
	int n = 9;
	Twosum_SORT obj = new Twosum_SORT();
	obj.twosumsort(a, n);
}
}