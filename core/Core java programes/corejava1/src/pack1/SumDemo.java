package pack1;
/**
 * @author Lakshman
 *
 */

// using the class that is there in mypack package
//import mypack.*;
import mypack.sum;
class SumDemo 
{
	public static void main(String[] args) 
	{
		//mypack.sum s=new mypack.sum();//F.Q.N.A
		 sum s=new sum();
		 s.assign(100,200);
		 s.add();
		 s.show();
	}//main()
}//class
