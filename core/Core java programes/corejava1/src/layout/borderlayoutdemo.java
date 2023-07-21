package layout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class borderlayoutdemo extends JFrame

{
	/**
	 * @author Lakshman
	 *
	 */		
	borderlayoutdemo()
	
	{
	
		Container c=getContentPane();
		
		BorderLayout obj=new BorderLayout();
		
		c.setLayout(obj);
		JButton b1,b2,b3,b4;
		
		b1=new JButton("Button1");
		b2=new JButton("Button2");
		b3=new JButton("Button3");
		b4=new JButton("Button4");
	
	c.add("North",b1);
	c.add("North",b2);
	c.add("North",b3);
	c.add("North",b4);
	
	c.add(b1, BorderLayout.NORTH);
	c.add(b2, BorderLayout.EAST);
	c.add(b3, BorderLayout.SOUTH);
	c.add(b4, BorderLayout.CENTER);
	
	
	}

	public static void main(String[] args) 
	{
	borderlayoutdemo demo=new borderlayoutdemo();
	
	demo.setSize(400,400);
	demo.setVisible(true);
	demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
