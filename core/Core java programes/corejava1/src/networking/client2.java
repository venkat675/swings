package networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class client2 {
	/**
	 * @author Lakshman
	 *
	 */	
	
	public static void main(String[] args) throws UnknownHostException, IOException {
	
		Socket s=new Socket("localhost",889);
	
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	
		String str,str1;
		while(!(str=br1.readLine()).equals("exit"))
		{
		
			dos.writeBytes(str+"\n");
		
			str1=br1.readLine();
			System.out.println(str1);
		
		
		}
		dos.close();
		br.close();
		br1.close();
		s.close();
	 }

 }
