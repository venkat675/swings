package swing;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LookFeel extends JFrame implements ItemListener 

{
	/**
	 * @author Lakshman
	 *
	 */	
	JButton b;
	JCheckBox cb;
	
	JTextField t;
	JRadioButton r1,r2,r3;
	
	ButtonGroup bg;
	Container c;
	
	LookFeel()
	
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		b=new JButton("Button");
		cb=new JCheckBox("CheckBox");
		
		t=new JTextField("TextField",15);
		r1=new JRadioButton("Metal");
		
		r2=new JRadioButton("Motif");
		r3=new JRadioButton("Windows");
		
		bg=new ButtonGroup();
		bg.add(r1);
		
		bg.add(r2);
		bg.add(r3);
		
		b.setBounds(100,50,75,40);
		cb.setBounds(100,100,100,40);
		
		t.setBounds(100,150,100,40);
		r1.setBounds(50,250,100,30);
		
		r2.setBounds(150,250,100,30);
		r3.setBounds(250,250,100,30);
		
		c.add(b);
		c.add(cb);
		
		c.add(t);
		c.add(r1);
		
		c.add(r2);
		c.add(r3);
		
	}
	
	public void itemStateChanged(ItemEvent ie)
	
	{
		try
		{
			if(r1.getModel().isSelected())
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			if(r2.getModel().isSelected())
				UIManager.setLookAndFeel("javax.swing.plaf.motif.MotifLookAndFeel");
			
			if(r3.getModel().isSelected())
				UIManager.setLookAndFeel("javax.swing.plaf.windows.WindowsLookAndFeel");
		
			SwingUtilities.updateComponentTreeUI(c);
			
		}
	
		catch(Exception e)
		{
			
		}
		
	}

	public static void main(String[] args) 
	
	{
		
		LookFeel lf=new LookFeel();
		lf.setSize(400,400);
		
		lf.setTitle("Look and Feel");
		lf.setVisible(true);
	
	}

}
