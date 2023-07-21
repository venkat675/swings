/**
 * @author Lakshman
 *
 */

interface i1
{
	public void f1();
}
interface i2 extends i1
{
	public void f2();
}
class cls1
{
	void f3()
	{
		System.out.println("f3 defined in c1");
	}
}
abstract class cls2 extends cls1 implements i2
{
	public void f1()
	{
		System.out.println("f1 defined in c2");
	}
	public void f3()
	{
		super.f3();
		System.out.println("f3 redefined in c2");
	}
}

class cls3 extends cls2
{
	public void f2()
	{
		System.out.println("f2 defined in c3");
	}
	public void f1()
	{
		super.f1();
		System.out.println("f1 defined in c3");
	}
	public void f3()
	{
		System.out.println("f3 redefined in c3");
	}
	public void f4()
	{
		System.out.println("f4 defined in c3");
	}
}
class  InterfaceDemo 
{
	public static void main(String[] args) 
	{
		cls3 o3=new cls3();
		o3.f1(); //f1 defined in c2,f1 defined in c3
		o3.f2();//f2 defined in c3
		o3.f3();//f3 redefined in c3
		o3.f4();//f4 defined in c3
	cls2 o2=new cls3();
	o2.f1();//f1 defined in c2,f1 defined in c3
	o2.f2();//f2 defined in c3
	o2.f3();//f3 redefined in c3
	cls1 o1=new cls3();
	o1.f3();//f3 redefined in c3
	i2  ioi=new cls3();
	ioi.f1();//f1 defined in c2,f1 defined in c3
	ioi.f2();//f2 defined in c3

	i1 io=new cls3();
	io.f1();//f1 defined in c2,f1 defined in c3
	}
}
