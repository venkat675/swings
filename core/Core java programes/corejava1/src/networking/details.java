package networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;

public class details {
	/**
	 * @author Lakshman
	 *
	 */	
	
	public static void main(String[] args) throws IOException {
	
		URL obj=new URL("http://www.yahoo.com/index.html");
	    URLConnection conn=obj.openConnection();
	
	    System.out.println("date:" + new Date(conn.getDate()));
	    System.out.println("content-type:" + conn.getContentType());
	    System.out.println("expiry:" + conn.getExpiration());
	    System.out.println("last modified:" + conn.getLastModified());
	
	
	    int l=conn.getContentLength();
	    System.out.println("lenth of content" + l);
	    
	    if(l==0){
		
	    	System.out.println("content is not available");
		
	    	return;
	   }
	  else{
		
		  int ch;
		InputStream in=conn.getInputStream();
		
		 while((ch=in.read())!=-1)
	  System.out.print((char)ch);
	      }
	  }

 }
