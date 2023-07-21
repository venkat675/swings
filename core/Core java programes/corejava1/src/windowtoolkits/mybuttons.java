package windowtoolkits;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mybuttons extends Frame implements ActionListener{
	/**
	 * @author Lakshman
	 *
	 */

	Button b1,b2,b3;
	public mybuttons() {
		// TODO Auto-generated constructor stub
	this.setLayout(null);
	
	b1=new Button("yellow");
	b2=new Button("blue");
	b3=new Button("pink");
	
	b1.setBounds(100, 100, 70, 40);
	b2.setBounds(100, 160, 70, 40);
	b3.setBounds(100, 220, 70, 40);
	
	this.add(b1);
	this.add(b2);
	this.add(b3);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	});
	}

	public void actionPerformed(ActionEvent ae){
		String str=ae.getActionCommand();
		
		if (str.equals("yellow")) this.setBackground(Color.yellow);
		if (str.equals("blue")) this.setBackground(Color.blue);
		if (str.equals("pink")) this.setBackground(Color.pink);
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      mybuttons mb=new mybuttons();
      mb.setSize(400, 400);
      mb.setTitle("welcome to buttons");
      mb.setVisible(true);
	}

}
