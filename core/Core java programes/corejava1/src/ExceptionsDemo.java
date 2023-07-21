//Exception:1) checked Exception(syntact) (or) compile time Exception
//2) Unchecked Exceptions (logical) (or) run time Exception.

/*Ex:checked Exception
public class ExceptionsDemo {
	public static void main(String args[]){
		System.out.println("JAVA")
	}
}
*/
/**
 * @author Lakshman
 *
 */

public class ExceptionsDemo {
	public static void main(String args[]){

	try{
		System.out.println("open file");
		int b[]={10,20,30};
		b[2]=100; //change index no of b[]
		int n= args.length;
		System.out.println("n="+n);
		int a=40/5;  //change  a=40/n;
		System.out.println("a="+a);
	
		
	}
	catch(ArithmeticException ae){
		System.out.println(ae);
	}
	catch(ArrayIndexOutOfBoundsException aoe){
		System.out.println(aoe);
	}
	finally
	{
		System.out.println("close file");
	}
	}
}
