

import java.util.Hashtable;
import java.util.LinkedList;

/*Output  is
 original List [4,2,2,9,9,7,7]
 After Removing Duplicates [4,2,9,7] */


//Using Hash Table
public class RemoveDuplicatesUnsortList{
	void delete_duplicated(LinkedList list){
		Hashtable<Integer,Boolean> table = new Hashtable<Integer,Boolean>();
		for(int i=0 ;i<list.size();i++){
			if(table.contains(list.get(i))){
				list.remove(i);
				i--;
			}
			else{
				table.put( (Integer)list.get(i), true);
			}
		}
	}


// Using Two Pointers

void delete_duplicated1(LinkedList list){
	for (int i =0;i<list.size();i++){
		for(int j=i+1; j<list.size();j++){
			if(list.get(i).equals(list.get(j))){
				list.remove(j);
				j--;
			}
		}
	}
  }
}


