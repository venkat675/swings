package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class borderdemo extends JFrame 
{
	/**
	 * @author Lakshman
	 *
	 */
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	
	borderdemo()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		b1=new JButton("raised bevel border");
		b2=new JButton("lowered bevel border");
		b3=new JButton("raised etched border");
		b4=new JButton("lowered etched border");
		b5=new JButton("line border");
		b6=new JButton("matte border");
		b7=new JButton("compound border");
		b8=new JButton("empty border");
		Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.red,Color.green);
		b1.setBorder(bd);
		bd=BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		b2.setBorder(bd);
		bd=BorderFactory.createEtchedBorder(EtchedBorder.RAISED,Color.red,Color.green);
		b3.setBorder(bd);
		bd=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED,Color.red,Color.green);
		b4.setBorder(bd);
		bd=BorderFactory.createLineBorder(Color.red,5);
		b5.setBorder(bd);
		bd=BorderFactory.createMatteBorder(5,10,15,20,Color.red);
		b6.setBorder(bd);
		//bd=BorderFactory.createCompoundBorder();
		//b7.setBorder(bd);
		bd=BorderFactory.createEmptyBorder();
		b8.setBorder(bd);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(b7);
		c.add(b8);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		borderdemo obj=new borderdemo();
		obj.setTitle("borders");
		obj.setSize(500,400);
		obj.setVisible(true);	
	
	}

}
