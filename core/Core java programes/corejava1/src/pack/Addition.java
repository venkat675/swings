//creating package pack with addition class
package pack;
/**
 * @author Lakshman
 *
 */

public class Addition {
	private double d1,d2;
	public Addition(double a,double b){
		d1=a;
		d2=b;
	}
	public void sum(){
		System.out.println("sum of  :  "+(d1+d2));
	}
}
