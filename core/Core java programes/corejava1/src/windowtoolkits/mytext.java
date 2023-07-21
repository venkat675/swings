package windowtoolkits;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mytext extends Frame implements ActionListener {
	/**
	 * @author Lakshman
	 *
	 */
    TextField name,pass;
    
   public mytext() {
	
	setLayout(new FlowLayout());
	
	Label n=new Label("Name:",Label.LEFT);
	Label p=new Label("Password:",Label.LEFT);
	
	name=new TextField(20);
	pass=new TextField(20);
	
	pass.setEchoChar('*');
	
	name.setBackground(Color.yellow);
	pass.setBackground(Color.red);
	
	Font f=new Font("Arial", Font.PLAIN, 25);
	name.setFont(f);
	
	add(n);
	add(name);
	add(p);
	add(pass);
	
	
	name.addActionListener(this);
	pass.addActionListener(this);
	
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	});
	}
     
     
	public void actionPerformed(ActionEvent ae){
		Graphics g=this.getGraphics();
		g.drawString("Name:"+name.getText(), 10, 200);
		g.drawString("Password:"+pass.getText(), 10, 240);	
	
	}
	public static void main(String[] args) {
	
		mytext mt=new mytext();
		mt.setTitle("welcome to Text Fileds");
		mt.setSize(400, 400);
		mt.setVisible(true);
	}

}
