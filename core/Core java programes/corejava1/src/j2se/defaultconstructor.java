package j2se;


class constructor {

	private String name;
	private int age;
	
	constructor()
	{
		name="lakshman";
		age=25;
		
	}
	
	void talk()
	{
		System.out.println("my name is:"+ name);
		System.out.println("my age is:"+ age);
		
	}
	
}
class defaultconstructor
{
	public static void main(String[] args) {
		
		constructor cont=new constructor();
		
		cont.talk();
				
	}
}
