package threads;

class runthread extends Thread {
	/**
	 * @author Lakshman
	 *
	 */


	public void run(){
	for(int i=1;i<=20;i++){
		System.out.println(i);
	  }
	}		
public static class runthread1{
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		runthread obj=new runthread();
		
		Thread t=new Thread(obj);
		t.start();
		

	 }

   }
}
