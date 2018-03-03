package Arrays;

public class MissingDuplicate_Array {
	
	public int missduplicate(int[] A){
		int x = A[0];
		for(int i=1 ; i<A.length;i++){
			x = x^ A[i];
		}
		return x;
	}
	
public static void main(String [] args){
	int [] A = { 2,1,3,5,5,3,2,1,6,7,7,8,8};
	MissingDuplicate_Array obj = new MissingDuplicate_Array();
	System.out.println("The Missing Duplicate is  "+ obj.missduplicate(A));
}
}
