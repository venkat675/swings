class One1{
	int i=10;
	void show(){
		System.out.println("Super class method of i "+i);
	}

}

class Two2 extends One1{
	int i=20;
	void show(){
		System.out.println("Sub class method of i "+i);

		super.show();

		System.out.println("Super "+i);

	}

}

public class SuperKWord {
	public static void main(String args[]){
		Two2 o=new Two2();
		o.show();
	}

}
