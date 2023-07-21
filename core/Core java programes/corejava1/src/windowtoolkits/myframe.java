package windowtoolkits;
import java.awt.*;
/**
 * @author Lakshman
 *
 */
public class myframe extends Frame{

	/**
	 * @param args
	 */
	
	myframe(String str){
		super(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myframe f=new myframe("Welcome to AWT Frames");
		
		f.setSize(300,250);
		f.setVisible(true);
	}

}
