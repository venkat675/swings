package j2se;


class constructor1 {

	private String name;
	private int age;
	
	constructor1()
	{
		name="lakshman";
		age=25;
		
	}
	
	constructor1(String l,int a)
	{
		name=l;
		age=a;
	}
	
	void talk()
	{
		System.out.println("my name is:"+ name);
		System.out.println("my age is:"+ age);
		
	}
	
}
class parameterconstructor
{
	public static void main(String[] args) {
		
		constructor1 cont=new constructor1();
		
		cont.talk();
		
		constructor1 cont1=new constructor1("lucky",24);
		cont1.talk();
				
	}
}
