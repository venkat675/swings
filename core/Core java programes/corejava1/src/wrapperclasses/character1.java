package wrapperclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class character1 {

	/**
	 * @author Lakshman
	 *
	 */
	public static void main(String[] args) throws IOException {
		
		 char ch;
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 while(true){
			 System.out.println("enter a char:");
			 ch=(char)br.read();
			 
			 System.out.println("u enetered:");
			 if (Character.isDigit(ch)) 
				 System.out.println("a digit");
				 else if(Character.isUpperCase(ch))
					 System.out.println("an uppercase letter");
				 else if(Character.isLowerCase(ch))
					 System.out.println("an lowercase letter");
				 else if(Character.isSpaceChar(ch))
					 System.out.println("an spacebar char");
				 else if(Character.isWhitespace(ch)){
					 System.out.println("an whitespace char");				
			return;
			 }
			 else
				 System.out.println("sorry, i dn't know that enter key");
			 br.skip(2);
		 }

	}
}


