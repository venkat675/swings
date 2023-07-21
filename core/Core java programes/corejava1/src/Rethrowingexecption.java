/**
 * @author Lakshman
 *
 */
public class Rethrowingexecption {

	/**
	 * @param args
	 */
	void method1(){
		try{
			String str="hello";
			char ch=str.charAt(5); //change index no's
			System.out.println(ch);
			}
		catch(StringIndexOutOfBoundsException sie){
			System.out.println("plz see the index is wiyhin the range");
			throw sie;
		}
	}
	public static class Rethrowingexecption1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rethrowingexecption e2=new Rethrowingexecption();
		try{
			e2.method1();
		}
	catch (StringIndexOutOfBoundsException sie) {
		System.out.println("i caught rethrown exception");
		// TODO: handle exception
	}
	}

}
}