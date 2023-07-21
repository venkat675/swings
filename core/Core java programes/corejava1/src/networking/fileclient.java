package networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import strings.stringbuffermethods;

public class fileclient {
	/**
	 * @author Lakshman
	 *
	 */	
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket s=new Socket("localhost",8888);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("enter file name:");

	    String fname=br.readLine();
	    DataOutputStream out=new DataOutputStream(s.getOutputStream());
	    out.writeBytes(fname+"\n");
	    BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
	
	    String str;
	    str=br1.readLine();
	
	    if(str.equals("yes")){
		while((str=br1.readLine())!=null)
			System.out.println(str);
		
		br.close();
		out.close();
		br1.close();
		s.close();
	   }
	}

}
