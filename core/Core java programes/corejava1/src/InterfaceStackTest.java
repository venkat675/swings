/**
 * @author Lakshman
 *
 */
interface IntStack
{
	void push(int item);
	int pop();
}
class FixedStack implements IntStack
{
	private int stck[];
	private int tos;
	FixedStack(int size)
	{
		stck=new int[size];
		tos=-1;
	}
	public void push(int item)
	{
		if(tos==stck.length-1)
			System.out.println("Stack is full");
		else
			stck[++tos]=item;
	}
	public int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
			return stck[tos--];
	}
}
class InterfaceStackTest
{
	public static void main(String[] args)
	{
		IntStack ob;
		FixedStack mystck1=new FixedStack(8);
		FixedStack mystck2=new FixedStack(8);
		ob=mystck1;
		for(int i=0;i<8;i++)
			mystck1.push(i);
		ob=mystck2;
		for(int i=0;i<8;i++)
			mystck2.push(i);
		ob=mystck1;
		System.out.println("Stack in mystack1:");
		for(int i=0;i<8;i++)
			System.out.println(mystck1.pop());
		ob=mystck2;
		System.out.println("Stack in mystack2:");
		for(int i=0;i<8;i++)
			System.out.println(mystck2.pop());
	}
}


		
