package threads;

import threads.bookticket.cancelticket;
/**
 * @author Lakshman
 *
 */

class bookticket extends Thread 
{
	Object train,comp;
	bookticket(Object train,Object comp)

	{
		this.train=train;
		this.comp=comp;
	}
	public void run()
	{
		synchronized(train)
		{
			System.out.println("bookticket locked on train");
			try
			{
				Thread.sleep(150);
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println("bookticket now waiting to lock on compartment..");
			
	   }
		synchronized(comp)
		{
			System.out.println("bookticket locked on compartment");
		}
		
	}
	public static class cancelticket extends Thread
	{
		Object train,comp;
	cancelticket(Object train,Object comp)
		{
			this.train=train;
			this.comp=comp;
		}
		public void run()
		{
			synchronized(comp)
			{
				System.out.println("cancelticket locked on compartment");
				try
				{
					Thread.sleep(200);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println("cancelticket now waiting to lock on compartment..");
				synchronized(train)
				{
					System.out.println("cancelticket locked on train");
				}

			}

		}
	}}
class deadlock
	{
		public static void main(String[] args) throws Exception
		{
			Object train=new Object();
			Object compartment=new Object();
			
			bookticket obj1=new bookticket(train,compartment);
			cancelticket obj2=new cancelticket(train,compartment);
			
			Thread t1=new Thread(obj1);
			Thread t2=new Thread(obj2);
			
			t1.start();
			t2.start();
			
		}
	
	
	}


