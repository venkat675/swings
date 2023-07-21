package generics;
/**
 * @author Lakshman
 *
 */

import java.util.Hashtable;

public class Ht2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();// here taken generic type
		
		ht.put("lakshman", 40); //auto boxing is done here
		ht.put("sachin", 50);
		ht.put("dhoni", 60);

		String s="sachin";
     Integer score=ht.get(s); //no type casing here
	System.out.println("score="+score);
	}

}
