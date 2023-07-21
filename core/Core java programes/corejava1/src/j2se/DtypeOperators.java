package j2se;

//Default values of datatypes
//byte 0,short 0,int 0,long 0,float 0.0, double 0.0,char aspas,
//String null,any class type null,boolean false
public class DtypeOperators {
	public static void main(String args[]){
		int i=30,j=20;
		String s="Mantra";
		double d=123.5;
		float f=1223.5f;
		char ch='l';
		System.out.println("s:"+s);
		System.out.println("d:"+d);
		System.out.println("f:"+f);
		System.out.println("ch:"+ch);
		System.out.println("s:"+s+"d:"+d+"f:"+f+"ch:"+ch);
		System.out.println("i+j="+(i+j));
		System.out.println("i-j="+(i-j));
		System.out.println("i*j="+(i*j));
		System.out.println("i/j="+(i/j));
		System.out.println("i%j="+(i%j));
		i=i+20;
		//i +=20;

		//unary operator
		System.out.println(-i);//(-)nagate a given value
		//post increment
		System.out.println("post increment");
		System.out.println("value of i is: "+i);
		System.out.println("value of i++ is: "+(i++));
		System.out.println("value of i is: "+i);
		//pre increment
		System.out.println("pre increment");
		System.out.println("value of i is: "+i);
		System.out.println("value of i++ is: "+(++i));
		System.out.println("value of i is: "+i);


	}

}
