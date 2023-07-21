package collections;

//statically add variables to "stack" class obj;
//This program author:lakshman date:10Nov2011


import java.util.*;

class stack
 {
	/**
	 * @author Lakshman
	 *
	 */
	public static void main (String [] args)
	{

		Stack st=new Stack ();

		System.out.println ("IS STACK EMPTY ? "+st.empty ());
		System.out.println (st);

		st.push (new Integer (10));
		st.push (new Integer (20));
		st.push (new Integer (30));
		st.push (new Integer (40));

		System.out.println (st);
		System.out.println ("TOP MOST ELEMENT = "+st.peek ());
		System.out.println (st);
		System.out.println ("DELETED ELEMENT = "+st.pop ());
		System.out.println ("MODIFIED STACK = "+st.peek ());
		System.out.println ("IS 10 FOUND ? "+st.search (new Integer (10)));

		Enumeration en=st.elements ();

		while (en.hasMoreElements ())
		{

			Object obj=en.nextElement ();

			System.out.println (obj);
		}
	}
}