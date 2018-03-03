package LeetCode;

import java.util.Arrays;

public class Threesum_Closest {
	
	public int threeSumClosest(int[] nums, int target) {
	    int min = Integer.MAX_VALUE;
		int result = 0;
	 
		Arrays.sort(nums);
	 
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				int diff = Math.abs(sum - target);
	 
				if(diff == 0) return sum;
	 
				if (diff < min) {
					min = diff;
					result = sum;
				}
				if (sum <= target) {
					j++;
				} else {
					k--;
				}
			}
		}
	 
		return result;
	}

	public static void main(String[] args){
		int [] a = {-1,2,1,-4};
		int target = 1;
		Threesum_Closest obj = new Threesum_Closest();
		System.out.println(obj.threeSumClosest(a, target));
	}
}
