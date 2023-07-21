//overloading means WRITING TWO OR MORE METHODS IN SINGLE CLASS
class Onea{
	void calc(int x,int y){
		System.out.println("square value of "+(x*x));
		System.out.println("square value of "+(y*y));

	}
	void calc(int x,int y,int z){
		System.out.println("square value of "+(x*x));
		System.out.println("square value of "+(y*y));
		System.out.println("square value of "+(z*z));

	}
}

public class Overloading {

	public static void main(String args[]){
		Onea o1=new Onea();

		//o1.calc(1, 2);
		o1.calc(3,4,5);


	}
}




