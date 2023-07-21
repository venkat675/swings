class sum
{
	int a,b;
	void assign()
	{
		a=10;
		b=20;
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
	}
   void calc()
	{
	   int c=a+b;
	   System.out.println("value of b="+c);
   }
   void mult()
	{
	   int d=a*b;
	   System.out.println("value of d="+d);

   }
}
class ram
{
public static void main(String args[])
	{
       sum s=new sum();
	  s.assign();
	  s.calc();
	  s.mult();
	}


}
