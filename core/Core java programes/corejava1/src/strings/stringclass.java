
package strings;

/**
 * @author Lakshman
 *
 */
public class stringclass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="A book on java";
		String s2=new String("i like it");
		char arr[]={'R','a','o','&','N','a','i','d','u','e','n','g','c','o','l','l','e','g','e'};
		String s3=new String(arr);
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("lenght of s1:"+s1.length());
		
		System.out.println("s1 and s2 joined: "+s1.concat(s2));
		
		System.out.println(s1 +" from " + s3);
		
		
		boolean x=s1.startsWith("A");
		if(x)
			System.out.println("s1 starts with \'A\'");
		else System.out.println("s1 doesn't starts with \'A\'");
		
		String p=s1.substring(0,7);
		
		String q=s3.substring(0,9);
		
		System.out.println(p+q);
		
		System.out.println("s1 upper case:"+s1.toUpperCase());
		System.out.println("s3 lower case:"+s3.toLowerCase());
		}

  }
