package threads;

class reserve implements Runnable {
	/**
	 * @author Lakshman
	 *
	 */


	int available=1;
	int wanted;
	reserve(int i){
		wanted=i;
	}
	public void run(){
		synchronized(this){
		System.out.println("available berths=" + available);
		if(available>=wanted){
			String name=Thread.currentThread().getName();
			System.out.println(wanted+":berth reserved for " + name);
			try{
				Thread.sleep(1500);
				available=available-wanted;
			}catch (InterruptedException ie) {
				// TODO: handle exception
			 }
			}
		else System.out.println("sorry no berths");
		}
	  } 
	}
class synchron{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	reserve obj=new reserve(1);
	
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);
	
	t1.setName("first person");
	t2.setName("second person");
	
	t1.start();
	t2.start();
	  }
}


