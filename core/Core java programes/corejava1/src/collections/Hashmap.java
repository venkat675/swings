package collections;

//statically add variables to "Hashmap" class obj;
//This program author:lakshman date:10Nov2011

import java.util.*;
class Hashmap
{
	/**
	 * @author Lakshman
	 *
	 */
public static void main (String [] args)
{
	HashMap hm=new HashMap ();
	
	System.out.println ("CONTENTS OF hm = "+hm);
	System.out.println ("SIZE OF hm = "+hm.size ());
	
	hm.put (new Integer (10), new Float(129.97f));
	hm.put (new Integer (1), new Float(143.93f));
	hm.put (new Integer (100), new Float(99.8f));

	System.out.println ("CONTENTS OF hm = "+hm);
	System.out.println ("SIZE OF hm = "+hm.size ());

	Set s=hm.entrySet ();

	Iterator itr=s.iterator ();
	while (itr.hasNext ())
	{
		Map.Entry me= (Map.Entry) itr.next ();

		Object kobj=me.getKey ();
		Object vobj=me.getValue ();

		System.out.println (vobj+"-->"+kobj);
		}
	}
}