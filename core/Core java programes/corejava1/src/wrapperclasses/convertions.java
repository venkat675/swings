package wrapperclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class convertions {

	/**
	 * @author Lakshman
	 *
	 */
	public static void main(String[] args) throws IOException {

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter a integer");
		String str=br.readLine();
		
		int i=Integer.parseInt(str);
		System.out.println("in decimal:"+i);
		
		str=Integer.toBinaryString(i);
		System.out.println("in binary:"+str);
		
		str=Integer.toHexString(i);
		System.out.println("in hexdecimal:"+str);
		
		str=Integer.toOctalString(i);
		System.out.println("in octal:"+str);

	}

}
