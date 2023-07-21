package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class buttondemo1 extends JFrame implements ActionListener 
{
	/**
	 * @author Lakshman
	 *
	 */	
	JButton b;
	JLabel lbl;

	buttondemo1()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
	
		ImageIcon ii=new ImageIcon();
		b=new JButton("Click me",ii);
		
		b.setBackground(Color.yellow);
		b.setForeground(Color.red);
		
		b.setFont(new Font("Arial",Font.BOLD,30));
		Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED);
		
		b.setBorder(bd);
		b.setToolTipText("This is a button");
		
		b.setMnemonic('c');
		c.add(b);
		
		b.addActionListener(this);
		lbl = new JLabel();
		
		c.add(lbl);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	
	}
	
	public void actionPerformed(ActionEvent ae)
	
	{
		ImageIcon ii=new ImageIcon("D:\\p.jpg");
		lbl.setIcon(ii);
		
	}
	
	public static void main(String[] args) 
	
	{
		buttondemo1 obj=new buttondemo1();
		obj.setTitle("my button");
	
		obj.setSize(500,400);
		obj.setVisible(true);	
	}

}
