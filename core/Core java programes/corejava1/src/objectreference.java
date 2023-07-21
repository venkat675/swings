
class one {

	int x;
	two t;//class two reference variable
	
	one(two t)
	{
		this.t=t;
		x=10;
	}
	void display()
	{
		System.out.println("one's x="+x);
		
		t.display();//here call two class display()
		System.out.println("two's var="+t.y);
	  }
	}
class two
{
	int y;
	two(int y)
	{
		this.y=y;
	}
	void display()
	{
		System.out.println("two's y="+y);
	}
	}
class objectreference
{
public static void main(String[] args) {
		
two obj2=new two(22);

one obj1=new one(obj2);
obj1.display();//finally call the one's class display()
}

}
