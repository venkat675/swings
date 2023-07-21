package StreamsandFiles;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class getobj {

	/**
	 * @author Lakshman
	 *
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		FileInputStream fis=new FileInputStream("D://hai5.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		try{
			empdata e;
			while((e=(empdata)ois.readObject())!=null){
				e.display();
			}
		}catch(EOFException ee){
			System.out.println("end of file reached");
		}
		finally{
			ois.close();
		}
	
		
	}

}
