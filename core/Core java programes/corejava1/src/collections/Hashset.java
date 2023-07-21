package collections;

//statically add variables to "Hashset" class obj;
//This program author:lakshman date:10Nov2011
import java.util.*;
class Hashset
{
	/**
	 * @author Lakshman
	 *
	 */
public static void main (String [] args)
{
    HashSet hs=new HashSet ();
   
   System.out.println ("CONTENTS OF hs = "+hs);
   System.out.println ("SIZE OF hs = "+hs.size ());
   
   hs.add (new Integer (17));
   hs.add (new Integer (188));
   hs.add (new Integer (-17));
   hs.add (new Integer (20));
   hs.add (new Integer (200));
   hs.add (new Integer (177));
   
   System.out.println ("CONTENTS OF hs = "+hs);
   System.out.println ("SIZE OF hs = "+hs.size ());

   Iterator itr=hs.iterator ();
   while (itr.hasNext ())
   {

	   Object obj=itr.next ();
     System.out.println (obj);
      }
   }
}