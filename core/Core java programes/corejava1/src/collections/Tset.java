package collections;

//statically add variables to "Hashset" class obj;
//This program author:lakshman date:10Nov2011
import java.util.Iterator;
import java.util.TreeSet;
public class Tset {

	/**
	 * @author Lakshman
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet ts=new TreeSet ();
		
		System.out.println ("CONTENTS OF ts = "+ts);
		System.out.println ("SIZE OF ts = "+ts.size ());
		
		ts.add (new Integer (17));
		ts.add (new Integer (188));
		ts.add (new Integer (-17));
		ts.add (new Integer (20));
		ts.add (new Integer (200));
		ts.add (new Integer (177));
		
		System.out.println ("CONTENTS OF ts = "+ts);
		System.out.println ("SIZE OF ts = "+ts.size ());
		
		Iterator itr=ts.iterator ();
		
		while (itr.hasNext ())
		{
		Object obj=itr.next ();
		System.out.println (obj);
		}

	}

}
