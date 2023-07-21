package collections;

//statically add variables to "hashtable" class obj;
//This program author:lakshman date:10Nov2011

import java.util.*;

class hashtable
 {
	/**
	 * @author Lakshman
	 *
	 */
	public static void main (String [] args)
	{

		Hashtable ht=new Hashtable ();

		ht.put ("AP","Hyd");
		ht.put ("Orissa","Bhuvaneshwar");
		ht.put ("Karnatake","Bng");
		ht.put ("TN","Chennai");
		ht.put ("Bihar","Patna");

		System.out.println (ht);

		Enumeration en=ht.keys ();
		while (en.hasMoreElements ())
		{

			Object k=en.nextElement ();
			Object v=ht.get (k);

			System.out.println (k+" "+v);
		}

		if (args.length==0)
		{

			System.out.println ("PASS THE STATE");
		}
		else
		{

			String st=args [0];

			Object cap=ht.get (st);
			if (cap==null)
			{

		System.out.println (cap+" IS THE CAPITAL OF "+st);
		}
	 }
   }
}