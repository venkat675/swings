package windowtoolkits;

import java.awt.ActiveEvent;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class frame1 extends Frame implements ActionListener 
{
	/**
	 * @author Lakshman
	 *
	 */	
	Button b1,b2;
	
	frame1()
	
	{
		setLayout(null);
		
		b1=new Button("Next");
		b2=new Button("Close");
		
		b1.setBounds(100,100,70,40);
		b2.setBounds(200,100,70,40);
		
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	
	{
		if(ae.getSource()==b1)
		
		{
			
			frame2 f2=new frame2();
			f2.setSize(400,400);
			f2.setVisible(true);
			
			
		}
		
		else
			
		{
			System.exit(0);
		}
	
	}
	
	public static void main(String[] args) 
	
	{
		frame1 f1=new frame1();
		f1.setSize(500,500);
		
		f1.setTitle(" First Frame ");
		f1.setVisible(true);
	
	}

	
}
