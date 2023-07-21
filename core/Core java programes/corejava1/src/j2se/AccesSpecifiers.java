package j2se;

//private:not accessible for outside classes
//public:any where
//protected:acces with in the direct0ry
//default:without any accespecifier declaration
class Person {
	//instace variables are initialized
	protected String name="lakshman";
	private int age=12;
            int authercardno=12345;//here taken defalut AccesSpecifier 
//	method
	public void method(){
		System.out.println("Hello I am "+name);
		System.out.println("my age is  "+age);
		System.out.println("my authercardno is  "+authercardno);
	}
}
public class AccesSpecifiers {
	public static void main(String args[]){

		Person p=new Person();//object creation
		p.method();//call the method

	}

}