package generics;
/**
 * @author Lakshman
 *
 */

import java.util.Hashtable;

public class Ht1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable ht=new Hashtable();// here not taken generic type
		
		ht.put("laxman", new Integer(40)); //auto boxing is not done here
		ht.put("sachin", new Integer(50));
		ht.put("dhoni", new Integer(60));

		String s="sachin";
     Integer score=(Integer)ht.get(s);//here type casing is done 
	System.out.println("score="+score);
	}

}
