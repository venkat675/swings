package j2se;

class Student
{
	String name;
	int rollno;
	Student(String x,int y)
	{
		name=x;
		rollno=y;
		System.out.println(name+" "+rollno);
	}
}
class Marks extends Student
{
	int math1,math2;
	
	Marks(String x,int y,int m1,int m2)
	{
		super(x,y);
		math1=m1;
		math2=m2;
		System.out.println(math1+" "+math2);
	}
	public int total()
	{
		return math1+math2;
	}
}
class Aggr extends Marks
{
	Aggr()
	{
		super("siri",20,20,20);
	}
	int disp()
	{
		return ((math1+math2)/2);
	}
}
class constructors1 
{
	public static void main(String args[])
	{
		Aggr ob;
		//Marks ob;
		ob=new Aggr();
		//System.out.println("Student marks"));
		System.out.println("Total marks are"+ob.total());
		System.out.println("Average marks are"+ob.disp());
	}
}
