package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server2 {
	/**
	 * @author Lakshman
	 *
	 */	
	
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(889);
		Socket s=ss.accept();
		System.out.println("connetion established");
		PrintStream ps=new PrintStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str,str1;
			while((str=br1.readLine())!=null)
			{
				System.out.println(str);
				str1=br1.readLine();
				ps.println(str1);
				
			}
			ps.close();
			br.close();
			br1.close();
			ss.close();
			s.close();
			
		}
		
		
	}

}
