package StreamsandFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class storeobj {
	/**
	 * @author Lakshman
	 *
	 */
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		FileOutputStream fos=new FileOutputStream("D://hai5.txt");
		//FileOutputStream fos=new FileOutputStream("0bjfile");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
	
	
		System.out.println("how many objects?:");
		int n=Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
		
			empdata e1=empdata.getData();
			oos.writeObject(e1);
			}
		oos.close();
		}

 }
