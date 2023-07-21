/**
 * @author Lakshman
 *
 */
public class userdefinedexception extends Exception{

	//store a/c info
	private static int acno[]={101,102,103,104,105};
	private static String name[]={"lakshman","lakshmi harika","Saraswathi","swathi","sailu"};
	private static double bal[]={10000,20000,30000,9999,10000}; //change 4th value as abow 10000...
	//default constructor
	userdefinedexception()
	{}
	userdefinedexception(String str)
	{
	super(str);	
	}
	
	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
try{
	System.out.println("acno"+"\t"+"customer"+"\t"+"balance");
	
	for (int i = 0; i < 5; i++) {
		System.out.println(acno[i]+"\t"+name[i]+"\t"+bal[i]);
		
		if(bal[i]<10000){
			 userdefinedexception ude=new userdefinedexception("bal amount is lesss");
			 throw ude;
			}
		 }
	}
catch (userdefinedexception ude) {
	
    ude.printStackTrace();	

     }
   }
}