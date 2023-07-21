class Recursion
    {
	static long factorial(int num)
       
        {
		long result;
		if(num==1) return 1;
		result=factorial(num-1)*num;
		return result;

	}
    
    }
 public class Factorial 
    {
	public static void main(String args[])
              {
		System.out.println("factorial of 3 is  "+Recursion.factorial(3));
	      }
   
    }
