package threads;

class single implements Runnable{
	/**
	 * @author Lakshman
	 *
	 */


	public void run(){
		task1();
		task2();
		task3();
	}
	void task1(){
		System.out.println("this is task1");
	}
	
	void task2(){
		System.out.println("this is task2");
	}
	void task3(){
		System.out.println("this is task3");
	}}
	class singlethread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	single obj=new single();
	Thread t1=new Thread(obj);
	t1.start();
	   
	}
	
}
