abstract class Shape1
{
protected final static double pi=22.0/7.0;
protected double length;
public abstract double area();
}
class Square extends Shape1
{
	Square(double side)
	{
		length=side;
	}
	public double area()
	{
		return length*length;
	}
}
class Circle extends Shape1
{
	Circle(double radius)
	{
		length=radius;
	}
	public double area()
	{
		return pi*length*length;
	}
}
public class area
{
	public static void main(String args[])
	{
		Shape1 sh;
		Square sq=new Square(10);
		Circle cir=new Circle(10);
		sh=sq;
		System.out.println("Area of Square="+sh.area());
		sh=cir;
		System.out.println("Area of Circle="+sh.area());

	}
}