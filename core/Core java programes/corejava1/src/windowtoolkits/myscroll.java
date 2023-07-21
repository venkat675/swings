package windowtoolkits;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myscroll extends Frame implements AdjustmentListener 
{
	/**
	 * @author Lakshman
	 *
	 */
	String msg="";
	Scrollbar s1;
	
	myscroll()
	{
		setLayout(null);
		s1=new Scrollbar(Scrollbar.VERTICAL,0,30,0,400);
		s1.setBounds(250,50,30,200);
		add(s1);
		s1.addAdjustmentListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});		
	}
	
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString("scrollbar position:",20,150);
		msg+=s1.getValue();
		g.drawString(msg,20,180);
		msg="";
	}

    public static void main(String[] args)
    {
    	myscroll ms=new myscroll();
    	ms.setTitle("my scroll bar");
    	ms.setSize(400,400);
    	ms.setVisible(true);	
    }
}