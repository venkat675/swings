package j2se;

//initialized the instance variables
//constructor & class name must be equal
//constructor is called at the time of creating object.
//constructor is called only once for an object
//constructor executed automatically

class Person1 {
	//instance variables are initialized
	private String name;
	private int age;
//	constructor
	Person1(){
		name="Ramu";
		age=22;
	}
//	parameterized constructor
	Person1(String s,int n){
		name=s;
		age=n;
	}
//	method

	void method(){
		System.out.println("Hello I am "+name);
		System.out.println("my age is  "+age);

	}
}
public class ConstructorDemo {
	public static void main(String args[]){

		Person1 p=new Person1();
		p.method();
		Person1 p2=new Person1("sita",20);
		p2.method();

	}
}