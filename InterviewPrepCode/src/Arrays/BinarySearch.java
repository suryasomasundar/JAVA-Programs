package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssuryanarayanan on 01/05/17.
 */
public class BinarySearch {
	private int[] arrA;

	public BinarySearch(int[] arrA) {
		this.arrA = arrA;
	}

	public Boolean search(int low, int high, int number) {
		if (low > high) {
			return false;
		}
		int mid = low + (high - low) / 2;
		if (arrA[mid] == number)
			return true;
		else if (arrA[mid] > number)
			return search(low, mid - 1, number);
		else
			return search(mid + 1, high, number);

	}

	public static void main(String args[]) {
//		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		int number = 9;
//		BinarySearch obj = new BinarySearch(array);
//		System.out.println(obj.search(0, array.length - 1, number));
		
		String expectedString;
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("PA - IS - New Proposal - HouseHold Profile - Edit Personalization page screen-Inactive Personalization Checkbox-Click");
		
		System.out.println(list1.contains("PA - IS - New Proposal - HouseHold Profile - Edit Personalization page screen-Inactive Personalization Checkbox-Click"));
		
	//	System.out.println("PA - IS - New Proposal - HouseHold Profile - Edit Personalization page screen-Inactive Personalization Checkbox-Click".contains(expectedString));
		
		expectedString = "PA - IS - New Proposal";
		
		for(int i=0;i<2;i++)
		{
			
			System.out.println("PA - IS - New Proposal - HouseHold Profile - Edit Personalization page screen-Inactive Personalization Checkbox-Click".contains(expectedString));
			if("PA - IS - New Proposal - HouseHold Profile - Edit Personalization page screen-Inactive Personalization Checkbox-Click".contains(expectedString))
			{
				System.out.println(expectedString);
				System.out.println("KK");
				//expectedString ="vishnu";
				break;
			}
				
			System.out.println("LL");
		}
		
		
		
		
		
		
		
		
		
	}
}