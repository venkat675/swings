//an interface is a specification of method prototype.All the methods of 
//interface are public and abstract
/**
 * @author Lakshman
 *
 */
 
public class InterfaceDemo1 implements MyInter,MyInterF{
	 public void method1(){
		System.out.println("hi this is multi-inheritance");

	}

	public void connect(){
		System.out.println("connect");
	}
	public void disconnect(){
		System.out.println("disconnect");
	}
		public static void main(String args[]){
			InterfaceDemo1 i=new InterfaceDemo1();
			i.method1();
			i.connect();
			i.disconnect();
			
			
}
}