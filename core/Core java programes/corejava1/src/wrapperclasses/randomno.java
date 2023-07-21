package wrapperclasses;

public class randomno {

	/**
	 * @author Lakshman
	 *
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("random no's b/w 0 to 10");
		while(true){
			double d=10*Math.random();
			int i=(int)d;
			System.out.println(i);
			
			Thread.sleep(2000);
			if(i==0)System.exit(0);
		}
	}

}
