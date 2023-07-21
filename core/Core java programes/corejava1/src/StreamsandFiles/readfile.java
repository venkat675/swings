package StreamsandFiles;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class readfile {
	/**
	 * @author Lakshman
	 *
	 */
	
	public static void main(String[] args) throws IOException {
	
	FileInputStream fin=new FileInputStream("D://hai5.txt");
	
	
	System.out.println("file contents:");
	int ch;
		while((ch=fin.read())!=-1)
			System.out.print((char)ch);
		
			fin.close();
	
	}

}
