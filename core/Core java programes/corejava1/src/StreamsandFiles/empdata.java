package StreamsandFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Date;

public class empdata implements Serializable {
	/**
	 * @author Lakshman
	 *
	 */
   
	private int id;
    private String name;
    private float sal;
    private Date doj;

   public empdata(int i,String n,float s,Date d) {
	
	   id=i;
	   name=n;
	   sal=s;
	   doj=d;

   }
   void display(){
	   System.out.println(id+"\t"+name+"\t"+sal+"\t"+doj);
	   
   }
	static empdata getData()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter emp id:");
		int id=Integer.parseInt(br.readLine());
		
		System.out.println("enter name:");
		String name=br.readLine();
		
		System.out.println("enter salary:");
		float sal=Float.parseFloat(br.readLine());

	    Date d=new Date();
	
	    empdata e=new empdata(id, name, sal, d);
	    return e;
	}
	

}
