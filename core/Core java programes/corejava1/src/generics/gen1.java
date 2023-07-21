package generics;
/**
 * @author Lakshman
 *
 */

class gen<T> {

	T obj;
	gen(T obj){
		this.obj=obj;
	}
	
	T getobj(){
		return obj;
	}
}
class gen1{
	public static void main(String[] args) {
		
		
     Integer i=12; //same as Integer i=new Integer(12);
     gen<Integer> obj=new gen<Integer>(i);
     System.out.println("u stored :"+obj.getobj());
    
     Float f=12.123f; //same as Float i=new Float(12.123f);
     gen<Float> obj1=new gen<Float>(f);
     System.out.println("u stored :"+obj1.getobj());
    
     gen<String> obj2=new gen<String>("Hai My Dear MCA Rocks");
     System.out.println("u stored :"+obj2.getobj());
	}

}
