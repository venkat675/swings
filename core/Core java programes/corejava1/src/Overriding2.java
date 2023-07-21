
class One0{
	void calc(int x){
		System.out.println("square value of "+(x*x));
	}
}

class Two0 extends One0{
	void calc(int x){
		System.out.println("square value of "+(x*x*x));
	}
}

public class Overriding2 {
	
	


	public static void main(String args[]){
		One0 o1=new One0();
		Two0 o2=new Two0();
		One0 ref;
		//ref=o1;
		//ref.calc(2);
		o1.calc(50);
		ref=o2;
		ref.calc(2);

}
}

