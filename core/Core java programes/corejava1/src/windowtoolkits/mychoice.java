package windowtoolkits;

import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mychoice extends Frame implements ItemListener {
	/**
	 * @author Lakshman
	 *
	 */
   String msg;
   Choice ch;
   
   
   public mychoice() {
		
	setLayout(new FlowLayout());
	
	ch=new Choice();
	
	ch.add("english");
	ch.add("telugu");
	ch.add("hindi");
	ch.add("sanskrit");
	ch.add("french");
	
	add(ch);
	
	ch.addItemListener(this);
	
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
		
		g.drawString("Selected Languages:", 10, 100);
		msg=ch.getSelectedItem();
		g.drawString(msg, 10, 120);
		}
	
	public static void main(String[] args) {
	
		mychoice mc=new mychoice();
		mc.setTitle("welcome to choicebox");
		mc.setSize(400, 350);
		mc.setVisible(true);
	}

}
