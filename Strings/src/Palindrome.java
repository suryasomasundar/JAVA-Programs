
public class Palindrome {

	private static final String STR1 = "uabbcbbau";
	private static final String STR2 = "isdovosjd";

	public static void main(String[] args) {
		System.out.println("String :"+STR1+" is a palindrome :"+Palindrome.isPalindrome2(STR1));
		System.out.println("String :"+STR2+" is a palindrome :"+Palindrome.isPalindrome2(STR2));
	}
//Using String Reverse Method and StringBuffer Class
	public static boolean isPalindrome(String str){

		String reverse = new StringBuffer(str).reverse().toString();
		
		if (reverse.equals(str))
			return true;
		
		return false;
	}
	
	//Without using the class and methods
	public static boolean isPalindrome2(String str){

		int start = 0;
		int end = str.length() - 1;
		int half = end/2;
		
		for(int i = 0; i < half; i++, start++, end-- ){
			if(str.charAt(start) != str.charAt(end))
				return false;
		}
		
		return true;
	}
}
