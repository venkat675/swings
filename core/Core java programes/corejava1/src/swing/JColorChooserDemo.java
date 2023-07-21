package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class JColorChooserDemo extends JFrame implements ActionListener

{
	/**
	 * @author Lakshman
	 *
	 */	
	JButton b;
	Container c;
	
	JColorChooserDemo()

	{
		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		b=new JButton("Select a Color");
		c.add(b);
		
		b.addActionListener(this);
			
	}
	
	
	public void actionPerformed(ActionEvent ae)
	
	{
		
		Color selectedcolor=null;
		Color color=JColorChooser.showDialog(this,"Select a color",selectedcolor);
		
		if(color!=null)
		
		{
		
			selectedcolor=color;
		
		}
		
		c.setBackground(color);
		
	}

	public static void main(String[] args) 
	
	{
		
		JColorChooserDemo demo=new JColorChooserDemo();
		demo.setSize(400,400);
		
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}

}
