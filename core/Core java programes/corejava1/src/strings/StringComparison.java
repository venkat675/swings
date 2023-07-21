package strings;
/**
 * @author Lakshman
 *
 */

public class StringComparison {
	public static void main(String args[]){
		String s1="hi";
		String s2=new String("hi");
		if(s1==s2)		
			System.out.println("both are same");
		else		
			System.out.println("not same");

		if(s1.equals(s2))		
			System.out.println("both are same");
		else		
			System.out.println("not same");


	}

}
