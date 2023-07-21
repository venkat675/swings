package windowtoolkits;

import java.awt.ActiveEvent;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class frame2 extends Frame implements ActionListener
{

	/**
	 * @author Lakshman
	 *
	 */
	Button b;
	
	frame2() 
	{
	  
		setLayout(new FlowLayout());
		b=new Button("back");
		add(b);
		b.addActionListener(this);
	
	}
		public void actionPerformed(ActionEvent ae)
		
		{
		
			this.dispose();
		
		}
	
}
    
