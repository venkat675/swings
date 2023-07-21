
class constructor2 {

	static double sum(double num1,double num2)
	{
	double res=num1+num2;
	return res;
	}
	
 }
class staticmethod
{
	public static void main(String[] args) {
		
		constructor2 cont=new constructor2();
		
	double d=constructor2.sum(10,20.25);
		System.out.println("sum is=" +d);
	}
}
