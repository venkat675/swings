package StreamsandFiles;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class createfile {
	/**
	 * @author Lakshman
	 *
	 */

	
	public static void main(String[] args) throws IOException {
	
		DataInputStream dis=new DataInputStream(System.in);
	
		FileOutputStream fout=new FileOutputStream("D://hai5.txt");
	
		System.out.println("enter text(@at the end):");
		char ch;
		while((ch=(char)dis.read())!='@')
		
			fout.write(ch);
			fout.close();
	
	}

}
