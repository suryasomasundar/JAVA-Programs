import java.util.HashMap;

public class DuplicatesRemove{
public static void main (String [] args)
    {
        String s = "aabbbccccddeeefffe";//sample string
        String temp2="";//string with no duplicates
        HashMap<Integer,Character> remove = new HashMap<Integer,Character>();//create a hashmap to store the char's
        char [] charArray = s.toCharArray();
        for (Character c : charArray)//for each char
        {
            if (!remove.containsValue(c))//if the char is not already in the hashmap
                {
                    temp2=temp2+c.toString();//add the char to the output string
                    remove.put(c.hashCode(),c);//and add the char to the hashmap
                }
        }

        System.out.println(temp2);//final string
    }

}

