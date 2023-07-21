

package strings;

/**
 * @author Lakshman
 *
 */
public class stringsplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hai, this is lakshman iam java trainer";
		
		String s[];
		
		s=str.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}
	}

}
