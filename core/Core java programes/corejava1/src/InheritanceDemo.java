class Sup{
	String name="pavan";
	int id=1;
	void get(){
		System.out.println("super class "+name);
		System.out.println("super class "+id);

	}

}

class Sub extends Sup{
	String addr="hyd";
	void get(){

		Sup s=new Sup();
		s.get();
		System.out.println("sub class "+addr);
	}
}
public class InheritanceDemo {
	public static void main(String args[]){
		Sub s2=new Sub();
		s2.get();
	}

}
