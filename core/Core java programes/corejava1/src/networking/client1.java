package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class client1 {

	/**
	 * @author Lakshman
	 *
	 */	
	public static void main(String[] args) throws UnknownHostException, IOException {
	
		Socket s=new Socket("localhost",777);
	
		InputStream obj=s.getInputStream();
	
		BufferedReader br=new BufferedReader(new InputStreamReader(obj));
	
		String str;
		while((str=br.readLine())!=null)
		
		System.out.println("from server data:"+str);
	
		br.close();
		s.close();
	
	}

}
