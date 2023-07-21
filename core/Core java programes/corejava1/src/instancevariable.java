
class instance1 {

	String name;
	int age;
	
	
	void talk()
	{
		System.out.println("my name is:"+ name);
		System.out.println("my age is:"+ age);
		
	}
	
}
class instancevariable
{
	public static void main(String[] args) {
		
		instance ist=new instance();
		
		ist.name="lakshman";
		ist.age=25;
		
		ist.talk();
				
	}

}
