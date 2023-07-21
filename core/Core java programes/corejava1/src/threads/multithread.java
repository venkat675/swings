package threads;

class multithread1 implements Runnable {
	/**
	 * @author Lakshman
	 *
	 */

	String str;
	public  multithread1(String str) {
		// TODO Auto-generated constructor stub
	this.str=str;
	}
	
	public void run(){
		
		for(int i=1;i<=10;i++){
			System.out.println(str+ " : " +i);
		
			try{
				Thread.sleep(2000);
			
			}
			catch (InterruptedException ie) {
				ie.printStackTrace();
				// TODO: handle exception
			}
		 }
	   }
	}
class  multithread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	multithread1 obj1=new multithread1("cut the ticket");
	multithread1 obj2=new multithread1("show the seat");
	
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	
	t1.start();
	t2.start();
	  }
}


