/**
 * @author Lakshman
 *
 */
abstract class Operation
{
abstract void sum();
}
class isum extends Operation
{
	int a,b,c;
	void sum()
	{
		a=1;
		b=2;
		c=a+b;
		System.out.println(c);
       }
   }
   class fsum extends Operation
   {
	   float f1,f2,f3;
	   void sum()
	   {
		   f1=1.1f;
		   f2=2.2f;
		   f3=f1+f2;
		   System.out.println(f3);
	   }
   }
   class AbstrDemo
   {
	   public static void main(String args[])
	   {
		   Operation op;
		   op=new isum();
		   op.sum();
		   Operation op1;
		   op1=new  fsum();
		   op1.sum();
   }
   }