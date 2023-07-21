package j2se;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class  Add1
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		{
		int a,b,c;
		
         System.out.println("enter a value for a");
		a=Integer.parseInt(br.readLine());
		System.out.println("enter a value for b");
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.println("sum"+c);
	   }
   }
}