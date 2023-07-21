package windowtoolkits;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.tools.Tool;

class image extends Frame {
	/**
	 * @author Lakshman
	 *
	 */	
		static Image img;
		image()
		{
			img=Toolkit.getDefaultToolkit().getImage("D:\\k.jpg");
			MediaTracker track=new MediaTracker(this);
			
			track.addImage(img,0);
			try
			{
				track.waitForID(0);
			}
			catch(InterruptedException ie){
			}
				addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
				
			});
			
			
		}
		public void paint(Graphics g)
		{
			g.drawImage(img,100,50,null);
		}
	public static void main(String[] args) 
	{
		image i=new image();
		i.setSize(200,200);
		i.setTitle("my images");
		i.setIconImage(img);
		i.setVisible(true);
	}

}
