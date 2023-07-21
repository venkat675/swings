package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenu1 extends JFrame implements ActionListener 

{
	/**
	 * @author Lakshman
	 *
	 */	
	JMenuBar mb;
	JMenu file ,edit,font;
	
	JMenuItem op,sa,cl,cp,pt,f1,f2;
	JCheckBoxMenuItem pr;
	
	MyMenu1()

	{
		
	Container c=getContentPane();
	c.setLayout(new BorderLayout());
	
	mb=new JMenuBar();
	c.add("North",mb);
	
	file=new JMenu("File");
	edit=new JMenu("Edit");
	
	mb.add(file);
	mb.add(edit);
	
	op=new JMenuItem("Open");
	sa=new JMenuItem("Save");
	
	cl=new JMenuItem("Close");
	cp=new JMenuItem("Copy");
	
	pt=new JMenuItem("Paste");
	file.add(op);
	
	file.add(sa);
	file.add(cl);
	
	edit.add(cp);
	edit.add(pt);
	
	cl.setEnabled(false);
	pr=new JCheckBoxMenuItem("Print");
	
	file.add(pr);
	file.addSeparator();
	
	font=new JMenu("Font");
	file.add(font);
	
	f1=new JMenuItem("Arial");
	f2=new JMenuItem("Times New Roman");
	
	font.add(f1);
	font.add(f2);
	
	op.addActionListener(this);
	sa.addActionListener(this);
	
	cl.addActionListener(this);
	cp.addActionListener(this);
	
	pt.addActionListener(this);
	pr.addActionListener(this);
	
	f1.addActionListener(this);
	f2.addActionListener(this);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public void actionPerformed(ActionEvent ae)
	
	{
		if(op.isArmed()) this.openFile();
		if(sa.isArmed()) //this.saveFile();
		
		if(cl.isArmed()) System.out.println("Close is selected");
		if(cp.isArmed()) System.out.println("Copy is selected");
		
		if(pt.isArmed()) System.out.println("Paste is selected");
		if(pr.getModel().isSelected()) System.out.println("Printing on...");
		
		else System.out.println("Printing off...");
		if(f1.isArmed()) System.out.println("Arial Font is selected");
		
		if(f2.isArmed()) System.out.println("Times New is selected");
		
	}
	
	void openFile()
	{
		JFileChooser fc=new JFileChooser();
		int i=fc.showOpenDialog(this);
		
		if(i==JFileChooser.APPROVE_OPTION)
		
		{
			File f=fc.getSelectedFile();
			String fname=f.getPath();
			
			OpenFrame of=new OpenFrame(fname);
			
			of.setSize(500,400);
			of.setVisible(true);
			
		}
	}

	public static void main(String[] args) 
	
	{
		MyMenu1 mm1=new MyMenu1();
		mm1.setTitle("JMeno demo");
		
		mm1.setSize(500,400);
		mm1.setVisible(true);	
		
	}
}

	
	class OpenFrame extends JFrame
	
	{
	
		OpenFrame(String fname)
		
		{
			Container c=getContentPane();
			c.setLayout(new FlowLayout());
		
			TextArea ta=new TextArea();
			c.add(ta);
			
			String str="";
			String str1="";
			
			try
			
			{
				
				BufferedReader br=new BufferedReader(new FileReader(fname));
				while((str=br.readLine())!=null)
				
				str1+=str+"\n";
				ta.setText(str1);
				br.close();
				
			}
			
			catch(Exception e)
			{
				
			}
			
			
		}
	}
