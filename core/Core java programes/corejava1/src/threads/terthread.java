package threads;

import java.io.IOException;

class terthread1 extends Thread {
	/**
	 * @author Lakshman
	 *
	 */

	 boolean stop=false;
	 public void run(){
		 for(int i=1;i<=100000;i++){
			 System.out.println(i);
			 if(stop)
				 return;
		 }
	 } }
	 class terthread{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	terthread1 obj=new terthread1();
	
	Thread t=new Thread(obj);
	t.start();
	System.in.read();//wait till enter key press
	obj.stop=true;
    	}

}
