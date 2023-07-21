//throw :To throw an Exception Explicity and catch it. 
class Sample1{
	/**
	 * @author Lakshman
	 *
	 */
static void demo(){
	try{
		System.out.println("inside demo():  ");
		throw new NullPointerException("Exception data ");
	}
	catch (NullPointerException ne) {
		// TODO: handle exception
		System.out.println(ne);
	}
}
}
public class Throw_Demo {
 public static void main(String[] args)throws Exception
    {
	 
		Sample1.demo();
	}

}
