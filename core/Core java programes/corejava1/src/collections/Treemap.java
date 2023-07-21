package collections;

//statically add variables to "Treemap" class obj;
//This program author:lakshman date:10Nov2011

import java.util.*;
class Treemap
{
	/**
	 * @author Lakshman
	 *
	 */
public static void main (String [] args)
{
		TreeMap tm=new TreeMap ();
		
		System.out.println ("CONTENTS OF tm = "+tm);
		System.out.println ("SIZE OF tm = "+tm.size ());

		tm.put (new Integer (10), new Float(129.97f));
		tm.put (new Integer (1), new Float(143.93f));
		tm.put (new Integer (100), new Float(99.8f));

		System.out.println ("CONTENTS OF tm = "+tm);
		System.out.println ("SIZE OF tm = "+tm.size ());

		Set s=tm.entrySet ();

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