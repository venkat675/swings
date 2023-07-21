/**
 * 
 */
package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Lakshman
 *
 */
public class stringbuffermethods {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the surname");
		String sur=br.readLine();
		
		System.out.println("enter the middlename");
		String mid=br.readLine();
		
		System.out.println("enter the lastname");
		String last=br.readLine();
		
		sb.append(sur);
		
		sb.append(last);
		
		System.out.println("name="+sb);
		
		 int n=sur.length();
		 
		 sb.insert(n,mid);
		 
		 System.out.println("full name="+sb);
		 
		 System.out.println("reverse is="+sb.reverse());
		 }

   }
