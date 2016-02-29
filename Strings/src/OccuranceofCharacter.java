import java.util.HashMap;


public class OccuranceofCharacter {

	static void CharacterCount(String Inputstring){
		
		HashMap <Character,Integer> charcountmap = new HashMap <Character,Integer>();
		char[] strArray = Inputstring.toCharArray();
		for (char c: strArray){
			if(charcountmap.containsKey(c)){
				charcountmap.put(c, charcountmap.get(c)+1);
			}
			else{
				charcountmap.put(c, 1);
			}
			System.out.println(charcountmap);
			}
	}
		public static void main (String [] args){
			CharacterCount("ALL IS WELL");
		}

	}


