package j2se;

class Wa
{
	int a;
    int b;
	
	Wa()
	{
	a=2;
	b=3;
    System.out.println(a);
	System.out.println(b);
	//return a+b;
	}
	/*Wa(int x)
	{
		a=x;

		System.out.println("ADD"+(a+b));
	}*/
	Wa(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(" "+(a+b));
	}
}
class AddDemoReturn
{
	public static void main(String[] args) 
	{
		Wa ob=new Wa();
		Wa ob1=new Wa(10,2);
	}
}
