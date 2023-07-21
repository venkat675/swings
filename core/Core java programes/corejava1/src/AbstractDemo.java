
// understanding the abstarc classes and abstract methods
/**
 * @author Lakshman
 *
 */
abstract class c1
{
  abstract void f1();
  abstract void f2();
}//c1

abstract class c2 extends c1
{
void f1()
	{
      System.out.println("f1() method defined in class c2");
	}
}//c2


class c3 extends c2
{
void f2()
	{
      System.out.println("f2() method defined in class c3");
	}
void f1()
	{
	    super.f1();
       System.out.println("f1() method re-defined in class c3");
	}
void f3()
	{
      System.out.println("f3() method belongs to class c3");
	}
}//c3


class AbstractDemo
{
public static void main(String[] args) 
	{
System.out.println("\n with respect to class c3 object\n");
   c3 o3=new c3();
    o3.f1();
	o3.f2();
	o3.f3();

System.out.println("\n with respect to class c2 object\n");
//c2 o2=new c2(); invalid, since c2 is abstract 
    c2 o2;//reff
    o2=new c3();
    o2.f1();
	o2.f2();
//o2.f3(); invalid, since f3() does not exists in c2

System.out.println("\nwith respect to class c1 object\n");
   //c1 o1=new c1();//Invalid
    c1 o1=new c3();
    o1.f1();
	o1.f2();
//o1.f3(); invalid, since f3() does not exists in c1

	}
}