
//throws keyword
import java.io.*;
class Sample{
	/**
	 * @author Lakshman
	 *
	 */
	private String name;
	void accept() throws IOException// put comment to this...throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name:  ");
		name=br.readLine();

	}
	void disp(){
		System.out.println("name is:"+name);
	}
}
public class ThrowsDemo {
	public static void main(String args[])throws IOException
	// put comment to this...throws IOException
	{
		Sample s=new Sample();
		s.accept();
		s.disp();
	}


}
