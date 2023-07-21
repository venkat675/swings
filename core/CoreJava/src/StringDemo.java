class StringDemo 
{
	public static void main(String[] args) 
	{

		  String s="SEED";
          String s1= new String("seedinfo");
		  System.out.println("String is "+s.length());
		  System.out.println("String is "+s1.length());
		System.out.println("String is "+s.hashCode() );
  		System.out.println("String is "+s1.hashCode() );
  		System.out.println("String is "+s1.charAt(2));
System.out.println("String is "+s1.concat(" infotech"));
s1=s1.concat(" infotech");
System.out.println("String is "+s1);
//System.out.println("String is "+s);
  /*  if (s.equals(s1))
    {
       System.out.println("Strings are equal");
    }
	else
	   System.out.println("Strings are not equal");*/
     
         System.out.println("String is "+ s.replace('e','i'));
  /*char ch[]=s.toCharArray();

    for (int i=0;i<ch.length ;i++ )
    {
 System.out.print(""+ch[i]);
    }*/
System.out.println("String is "+s1.toUpperCase());
System.out.println("String is "+s.toLowerCase());


	}
}
