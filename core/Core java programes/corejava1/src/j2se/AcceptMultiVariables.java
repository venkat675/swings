package j2se;

//accept continous variables from the keyboard using "BufferedReader" class ;
//This program author:lakshman date:10Nov2011

import java.io.*;
class Employee
{
	int id;
	String name;
	Employee(int i,String n)
	{
		id=i;
		name=n;
	}
	void displaydata()
	{
		System.out.println(id+"\t"+name);
	  }
	}
public class AcceptMultiVariables {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Employee arr[]=new Employee[5];
		
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("enter id:");
			int id=Integer.parseInt(br.readLine());
			
			System.out.println("enter name:");
			String name=br.readLine();
			
			
			arr[i]=new Employee(id,name);
		}

		System.out.println("\n the employee data is:");
		for (int i = 0; i < arr.length; i++) {
			arr[i].displaydata();
		}
	}

}
