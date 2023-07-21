
// PACKAGE APPLICATION
/**
 * @author Lakshman
 *
 */
package mypack; // Must be first executable statement
public class sum
{
	int a,b,c;
	public void assign(int x,int y)
	{
		a=x;
		b=y;
	}
	public void add() // public is mandatory
	{
		c=a+b;
	}
	public void show() // public is mandatory
	{
		System.out.println("The value of a : "+a);
		System.out.println("The value of b : "+b);
		System.out.println("The sum is : "+c);
	}
	public sum()
	{
		System.out.println("\nZero argument constructor of sum class");
	}
}//class

