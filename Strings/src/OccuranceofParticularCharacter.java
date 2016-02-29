
public class OccuranceofParticularCharacter {

	public static void main(String[] args) {
String Input = "Today is Monday";
int charcount = 0;
for(int i =0; i<Input.length();i++ ){
	if(Input.charAt(i)=='a'){
		charcount++;
	}
}
System.out.println("Count of a is  " + charcount);
	}

}
