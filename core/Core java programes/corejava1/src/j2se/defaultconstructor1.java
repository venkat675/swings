package j2se;


class constructor2 {

	
	private double num1,num2;
	
	constructor2(double x,double y)
	{
		num1=x;
		num2=y;
	}
	
	void sum()
	{
		double res=num1+num2;
		System.out.println("sum is:"+ res);
		
	}
	
}
class parameterconstructor1
{
	public static void main(String[] args) {
		
		constructor2 cont=new constructor2(10,20.5);
		
		cont.sum();
		
	}
}
