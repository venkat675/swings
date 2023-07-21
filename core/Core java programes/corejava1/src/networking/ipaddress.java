package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ipaddress {
	/**
	 * @author Lakshman
	 *
	 */	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter any website name:");
		String site=br.readLine();
		
		try{
			InetAddress ip=InetAddress.getByName(site);
			System.out.println("the ip address is:"+ip);
		}
		catch(UnknownHostException ue){
			System.out.println("this website is not found");
		}
		
	}

}
