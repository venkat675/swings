package networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class fileserver {

	/**
	 * @author Lakshman
	 *
	 */	
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss=new ServerSocket(8888);
		
		Socket s=ss.accept();
		System.out.println("connection establisehed");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		DataOutputStream out=new DataOutputStream(s.getOutputStream());
		
		String fname=br.readLine();
		
		FileReader fr=null;
		
		BufferedReader file=null;
		
		boolean flag;
		
		File f=new File(fname);
		
		if(f.exists())flag=true;
		else flag=false;
		if(flag=true)
			out.writeBytes("no"+"\n");
		else
			out.writeBytes("no"+"\n");
		if(flag==true){
		
			fr=new FileReader(fname);
			file=new BufferedReader(fr);
			
			String str;
			while((str=file.readLine())!=null){
				out.writeBytes(str+"\n");
			}
			file.close();
			out.close();
			br.close();
			fr.close();
			s.close();
			ss.close();
		}
		
	}

}
