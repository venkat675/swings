package windowtoolkits;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class myframe2 extends Frame {

	/**
	 * @author Lakshman
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myframe2 f=new myframe2();
		f.setTitle("my awt frame closing");
		f.setSize(300, 250);
		f.setVisible(true);
		f.addWindowListener(new myclass1());

	}

}
class myclass1 extends WindowAdapter
{

public void windowClosing(WindowEvent e) {
	System.exit(0);
	
 }
}