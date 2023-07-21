class Bc 
{
	Bc()
	{
		System.out.println("Bc-Dc");
	}
	Bc(int x)
	{
		this();
		System.out.println("Bc-Pc");
	}
}
class Ibc extends Bc
{
	Ibc()
	{
		super(1000);
		System.out.println("Ibc-Dc");
	}
	Ibc(int x)
	{
		this();
		System.out.println("Ibc-Pc");
	}
}
class Dc extends Ibc
{
	Dc()
	{
		super(100);
		System.out.println("Dc-Dc");
	}
	Dc(int x)
	{
		this();
		System.out.println("Dc-Pc");
	}
}
class SuperThisDemo
{
	public static void main(String args[])

	{
		Dc ob=new Dc(1);
	}
}

