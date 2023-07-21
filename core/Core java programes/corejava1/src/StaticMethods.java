//static methods are not act upon the instance variable of a class.
//this methods called by CLASS NAME
//static variables are stored in method area
class Test{
	//instance variable
	static int x=9;
	//static variables accessed by static methods only
	/*Test(int x){
		this.x=x;	
		}*/
	static void access(){
		System.out.println("x="+x);

	}

}
public class StaticMethods {
	public static void main(String args[]) {
		//Test 0=new Test();
		Test.access();
	}
}
