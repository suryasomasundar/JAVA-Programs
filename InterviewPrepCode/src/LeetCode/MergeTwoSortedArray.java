package LeetCode;

public class MergeTwoSortedArray {

	    public void merge(int A[], int m, int B[], int n) {
	 
	        while(m > 0 && n > 0){
	            if(A[m-1] > B[n-1]){
	                A[m+n-1] = A[m-1];
	                m--;
	            }else{
	                A[m+n-1] = B[n-1];
	                n--;
	            }
	        }
	 
	        while(n > 0){
	            A[m+n-1] = B[n-1];
	            n--;
	        }
	    }
	
	public static void main(String[] args){
		int[] A = new int[8];
		A[0] =1;
		A[1] = 3;
		A[2] = 5;
		int[] B = new int[6];
		B[0] =2;
		B[1] = 4;
		B[2] = 6;
		MergeTwoSortedArray obj = new MergeTwoSortedArray();
		obj.merge(A, A.length, B, B.length);
		for(int i =0;i<A.length;i++){
			System.out.println(A[i]);
		}
	}

}
