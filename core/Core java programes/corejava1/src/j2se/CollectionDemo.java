package j2se;

//collection: it will store different objects into single object
import java.io.*;
class Emp1{
	int id;
	String name;
	public Emp1(int i,String n) {
		id=i;
		name=n;
	
		
	}
	void disp(){
		System.out.println("id : "+id);
		System.out.println("name : "+name);
	}
}
public class CollectionDemo {
	public static void main(String args[]) throws IOException{
		
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		Emp1 arr[]=new Emp1[6];
		for(int i=0;i<5;i++){
			System.out.println("enter emplyee id  ");
			int id=Integer.parseInt(b.readLine());
			
			System.out.println("enter emplyee name ");
			String name=b.readLine();
			arr[i]=new Emp1(id,name);//loop calling no'of times
		}
		
		System.out.println(" emplyee data ");
		for(int i=0;i<5;i++){
			arr[i].disp();

		}
		
		
	/*	Emp1 e1=new Emp1(1,"raju");
		e1.disp();
		Emp1 e2=new Emp1(1,"raju");
		e2.disp();*/
}
}