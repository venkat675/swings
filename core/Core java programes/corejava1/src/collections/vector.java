package collections;

//statically add variables to "vector" class obj;
//This program author:lakshman date:10Nov2011

import java.util.*;
class vector
 {
	/**
	 * @author Lakshman
	 *
	 */
	public static void main (String [] args)
	{

		Vector v=new Vector ();
		
		v.addElement (new Integer (10));
		v.addElement (new Float (100.37f));
		v.addElement (new Boolean (true));
		v.addElement ("Lakshman");

		System.out.println ("SIZE = "+v.size ());
		System.out.println ("CONTENTS = "+v);

		Enumeration en=v.elements();

		while (en.hasMoreElements ())
		{

			Object val=en.nextElement ();

			System.out.println (val);
		}
	}
}