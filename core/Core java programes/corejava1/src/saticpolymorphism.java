

// Programs to print various data

class ints
{
   int a=10; int b=20; int c=30;
   void display()
	{
      System.out.println("\nInteger Value of a : "+a);
	  System.out.println("Integer Value of b : "+b);
	  System.out.println("Integer Value of c : "+c);
	}
}//ints

class doubles
{
   double a=10.11; double b=20.22; double c=30.33;
   void display()
	{
      System.out.println("\n\nDouble Value of a : "+a);
	  System.out.println("Double Value of b : "+b);
	  System.out.println("Double Value of c : "+c);
	}
}//doubles

class chars
{
   char a='@'; char b='Z'; char c='*';
   void display()
	{
	   System.out.println("\n\nchar Value of a : "+a);
	  System.out.println("char Value of b : "+b);
	  System.out.println("char Value of c : "+c);
	}
	
}//chars

class  saticpolymorphism
{
	public static void main(String[] args) 
	{
		ints i=new ints();
		i.display();
		doubles d=new doubles();
		d.display();
		chars c=new chars();
		c.display();
	}
}
