package generics;
/**
 * @author Lakshman
 *
 */

class gen0 {

		
	static <T>void display(T[] arr)
		{
			for (T i : arr) 
				System.out.println(i);
				
			}
		}
public class gen2
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		Integer arr1[]={1,2,3,4,5,6};
		System.out.println("reading integer object:");
		gen0.display(arr1);
		
		Double arr2[]={1.1,2.2,3.3,4.4,5.5,6.6};
		System.out.println("reading double object:");
		gen0.display(arr2);
	
		String arr3[]={"lakshman","durga","bhavani","sailakshmi","A.V.N","hyma"};
		System.out.println("reading string object:");
		gen0.display(arr3);
	}
}
