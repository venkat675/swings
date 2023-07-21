package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Set;

class banner extends Frame implements Runnable 
{
	/**
	 * @author Lakshman
	 *
	 */	
    String str="Rao & Naidu college ";
    banner()

    {
    	setLayout(null);
    	setBackground(Color.cyan);
    	setForeground(Color.red);
    }
    public void paint(Graphics g)
    {
    	Font f=new Font("courier",Font.BOLD,40);
    	g.setFont(f);
    	g.drawString(str,10,100);
   
    }
    public void run()
    {
    	for(;;)
    	{
    		repaint();
    		try
    		{
    			Thread.sleep(400);
    		}
    		catch(InterruptedException ie)
    		{
    		}
    		char ch=str.charAt(0);
    		str=str.substring(1,str.length());
    		str=str+ch;
    		
    		}
    	}
	public static void main(String[] args) throws Exception 
	{
		banner b=new banner();
		b.setSize(400,400);
		b.setTitle("my college");
		b.setVisible(true);
		Thread t=new Thread(b);
		t.start();
	}

}
