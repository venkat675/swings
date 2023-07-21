package threads;

class tgroups 
{
	/**
	 * @author Lakshman
	 *
	 */
	public static void main(String[] args) throws Exception
	{

		reservation res=new reservation();
		cancellation can=new cancellation();
		
		ThreadGroup tg=new ThreadGroup("first group");
		Thread t1=new Thread(tg,res,"first thread");
		Thread t2=new Thread(tg,res,"second thread");
		
		ThreadGroup tg1=new ThreadGroup("second group");
		Thread t3=new Thread(tg1,can,"third thread");
		Thread t4=new Thread(tg1,can,"four thread");
		
		System.out.println("parent of t1="+tg1.getParent());
		tg1.setMaxPriority(7);
		
		System.out.println("thread group of t1="+t1.getThreadGroup());
		System.out.println("thread group of t3="+t3.getThreadGroup());

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("no of threads active in tg="+tg.activeCount());
		
	}
}
class reservation extends Thread
{
	public void run()
	{
		System.out.println("i am reservation thread");
	}
}

class cancellation extends Thread
{
	public void run()
	{
		System.out.println("i am cancellation thread");
	}
}