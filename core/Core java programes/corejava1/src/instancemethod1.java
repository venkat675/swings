import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class instances {

	private String name;
	private int age;
	
	
public void accept()throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("enter name:");
	name=br.readLine();
	
	System.out.println("enter age:");
	age=Integer.parseInt(br.readLine());		
	}
public void check()throws IOException
{
if(age<=30)
	System.out.println(name + ":is young");
else if(age<=50)
	System.out.println(name +":is middle aged");
else System.out.println(name +":is old");
  }
}

class instancemethod1
{
	public static void main(String[] args)throws IOException {
		
		instances inst=new instances();
		
		inst.accept();
		inst.check();
	}

}
