import java.util.HashMap;
import java.util.Set;
import java.util.Map;


public class DuplicateCharactersandcount {

	public static void duplicatecharcter(String Inputstring){
		HashMap<Character, Integer> charcountmap = new HashMap <Character ,Integer>();
		char[] strArray = Inputstring.toCharArray();
		for(char C: strArray){
			if(charcountmap.containsKey(C)){
				charcountmap.put(C, charcountmap.get(C)+1);{
					}
			}
				else{
					charcountmap.put(C, 1);
				}
		}
		
		Set<Character> keys = charcountmap.keySet();
		for(Character ch: keys){
			if(charcountmap.get(ch)>1){
				System.out.println(ch + ";" +charcountmap.get(ch));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		duplicatecharcter("JAVA2INVOICE");
	}

}
