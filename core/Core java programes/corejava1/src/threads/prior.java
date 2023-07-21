package threads;

class myclass extends Thread {
	/**
	 * @author Lakshman
	 *
	 */
	int count=0;
	public void run()
	{
		
		for(int i=0;i<=100;i++)
		count++;
		
		System.out.println("completd thread:"+Thread.currentThread().getName());
		System.out.println("its priority:"+Thread.currentThread().getPriority());			
		
	}
	
}
class prior
{
	public static void main(String[] args) 
	{
		myclass obj=new myclass();
		
		Thread t1=new Thread(obj,"one");
		Thread t2=new Thread(obj,"two");
		
		t1.setPriority(2);
		t2.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
	}
}


