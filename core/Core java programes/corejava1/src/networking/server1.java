package networking;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server1 {

	/**
	 * @author Lakshman
	 *
	 */	
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss=new ServerSocket(777);
		
		Socket s=ss.accept();
		System.out.println("connection established");
		
		OutputStream obj=s.getOutputStream();
		PrintStream ps=new PrintStream(obj);
		
		String str="hello client";
		
		ps.println(str);
		ps.println("byeeee");
		
		ps.close();
		ss.close();
		s.close();
	}

}
