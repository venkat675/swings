
class instance {

	String name="lakshman";
	int age=25;
	
	
	void talk()
	{
		System.out.println("my name is:"+ name);
		System.out.println("my age is:"+ age);
		
	}
	
}
class instancemethod
{
	public static void main(String[] args) {
		
		instance ist=new instance();
		ist.talk();
				
	}

}
