
package strings;

/**
 * @author Lakshman
 *
 */
public class copystringtoarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello, this is a book on java";
		char arr[]=new char[14];
		
		str.getChars(7, 21, arr, 0);
		System.out.println(arr);

	}

}
