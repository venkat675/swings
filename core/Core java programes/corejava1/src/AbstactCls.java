//abstract method is a method it doesn't contain body.
//abstract class is a class which does not contain body.
/**
 * @author Lakshman
 *
 */
abstract class Myclass2{
	abstract void cal(double x);
}
class ASub1 extends Myclass2{
	void cal(double x){
		System.out.println("square of  "+(x*x));
	}
}

class ASub2 extends Myclass2{
	void cal(double x){
		System.out.println("cube of  "+(x*x*x));
	}
}

class ASub3 extends Myclass2{
	void cal(double x){
		System.out.println("square of  "+(x*x*x*x));
	}
}


public class AbstactCls {
	public static void main(String args[]){
		ASub1 a1=new ASub1();
		ASub2 a2=new ASub2();
		ASub3 a3=new ASub3();
		
		a1.cal(2);
		a2.cal(3);
		a3.cal(4);
		
	}
}
