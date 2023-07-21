package collections;

import java.util.*;
public class linkedlist1 {
	/**
	 * @author Lakshman
	 *
	 */

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList ();
		System.out.println ("CONTENTS OF l1 = "+ll);
        System.out.println("SIZE = "+ll.size ());
        ll.add(new Integer(10));
        ll.add (new Integer (20));
        ll.add (new Integer (30));
        ll.add (new Integer (40));
        
        System.out.println ("CONTENTS OF ll = "+ll);
        System.out.println ("SIZE = "+ll.size ());
        // retrieving data of ll using toArray ()
        Object obj []=ll.toArray ();
        int s=0;
        for (int i=0; i<obj.length; i++)
        {
        Integer io= (Integer) obj [i];
        int x=io.intValue ();
        s=s+x;
        }
        
        System.out.println ("SUM USING toArray () = "+s);
        ll.addFirst (new Integer (5));
        ll.addFirst (new Integer (6));
        System.out.println ("CONTENTS OF ll = "+ll);
        System.out.println ("SIZE = "+ll.size ());
        // retrieving data of ll using iterator ()
        Iterator itr=ll.iterator ();
        int s1=0;
        while (itr.hasNext ())
        {
        Object obj1=itr.next ();
        Integer io1= (Integer) obj1;
        int x1=io1.intValue ();
        s1=s1+x1;
        }
        System.out.println ("SUM USING iterator () = "+s1);
        
        }        
    }


