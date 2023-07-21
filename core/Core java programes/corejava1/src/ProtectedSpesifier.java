class Access{
	//private int b=22;
	protected int b=33;

}
class Sub1 extends Access{
	public void get(){
		//System.out.println(a);//error bcz a is private variable
		System.out.println(b);
	}

} 
public class ProtectedSpesifier {
	public static void main(String args[]){
		Sub1 s=new Sub1();
		s.get();

	}

}
