package networking;

import java.net.MalformedURLException;
import java.net.URL;

public class myurl {

	/**
	 * @author Lakshman
	 *
	 */	
	public static void main(String[] args) throws MalformedURLException {
		
	URL obj=new URL("http://dreamtechpress.com/index.html");
	System.out.println("protocol:"+obj.getProtocol());
	System.out.println("host:"+obj.getHost());
	System.out.println("file:"+obj.getFile());
	System.out.println("port:"+obj.getPort());
	System.out.println("path:"+obj.getPath());
	System.out.println("external form:"+obj.toExternalForm());
	}

}
