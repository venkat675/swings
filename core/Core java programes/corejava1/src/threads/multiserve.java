package threads;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class multiserve implements Runnable 
{
	static ServerSocket ss;
	static Socket s;
	public void run()
	{
		String name=Thread.currentThread().getName();
		for(;;)
		{
			try
			{
				System.out.println("thread1"+name+"  ready to accept..");
				s=ss.accept();
				//System.out.println("thread2 "+name+"  accepted connection");
				//s=ss.accept();
				PrintStream ps=new PrintStream(s.getOutputStream());
				ps.println("thread "+name+":contacted you");
				ps.close();
			}
			catch(Exception e)
			{
				
			}
		}
	}

	public static void main(String[] args) throws Exception

	{
		multiserve ms=new multiserve();
		
		ss=new ServerSocket(9994);
		
		Thread t1=new Thread(ms,":one");
		Thread t2=new Thread(ms,":two");
		
		t1.start();
		t2.start();
	
	}

}
