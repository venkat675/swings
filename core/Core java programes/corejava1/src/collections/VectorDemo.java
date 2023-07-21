package collections;

import java.util.*;
public class VectorDemo {
	/**
	 * @author Lakshman
	 *
	 */
	public static void main(String args[]) {
		Vector<String> v1=new Vector<String>();
		v1.add("raju");
		v1.add("ravi");
		v1.add("sita");
		v1.add("geetha");
		System.out.println("size  is  :"+v1.size());
		
	/*for(int i=0;i<v1.size();i++){
		//System.out.println("vector values are   :"+v1);
		String s=v1.elementAt(i);
		}*/
		//enhanced for loop
		for(String s:v1){
			System.out.println(s);
		}
	}
}
