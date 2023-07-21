
class hash {

	String name;
	int age;
	void talk()
	{
		System.out.println("hello iam"+ name);
		System.out.println("my age is"+ age);
		
	}
}
public class hashcode
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hash h=new hash();
		
		System.out.println(" h obj hashcode is:"+ h.hashCode());
		
	}

}
