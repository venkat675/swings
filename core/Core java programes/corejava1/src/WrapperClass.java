
//WrapperClass : convert primitive data type into object
public class WrapperClass {
	void  stringwrap(){
		String s="12.466";
		System.out.println("String s value: "+s);
		Double d=new Double(s);
		System.out.println("double d value: "+d);

	}
	public static void main(String args[]){

		WrapperClass w=new WrapperClass();
		w.stringwrap();
}
}