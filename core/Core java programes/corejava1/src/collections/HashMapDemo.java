package collections;


//map collection contain un-order way 
//the pair contains key and value
//we can access required element using map
import java.util.*;
public class HashMapDemo {
	/**
	 * @author Lakshman
	 *
	 */
public static void main(String args[]){

	HashMap<String, Integer> h1=new HashMap<String, Integer>();
	h1.put("aaa", 101);
	h1.put("bbb", 102);
	h1.put("ccc", 103);
	h1.put("ddd", 104);
	int i=h1.get("ccc");
	System.out.println(i);
	Set s1=h1.keySet();
	Iterator<String> i1=s1.iterator();
	while(i1.hasNext()){
		String key=i1.next();
		System.out.println(key);
		
	}
  }
}
