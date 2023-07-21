package windowtoolkits;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class myradio extends Frame implements ItemListener {
	
     String msg="";
     CheckboxGroup cbg;
     Checkbox y,n;
    
   public myradio() {
	
	setLayout(new FlowLayout());
	
	cbg=new CheckboxGroup();
	
	y=new Checkbox("Yes",cbg,true);
	n=new Checkbox("No",cbg,true);
		
	add(y);
	add(n);
		
	y.addItemListener(this);
	n.addItemListener(this);
	
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	});
	}
     
     
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	
	public void paint(Graphics g){
		
		msg="Current Selection:";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg, 10, 100);
		}
	
	public static void main(String[] args) {
	
		myradio mr=new myradio();
		mr.setTitle("welcome to Radio Buttons");
		mr.setSize(400, 400);
		mr.setVisible(true);
	}

}
