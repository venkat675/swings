package windowtoolkits;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class draw2 extends Frame{
	/**
	 * @author Lakshman
	 *
	 */
	public draw2() {
		// TODO Auto-generated constructor stub
	this.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	 });
	}
	public void paint(Graphics g1){
		
		g1.setColor(Color.CYAN);
		g1.drawRect(40, 40, 200, 200);
		g1.setColor(Color.BLUE);
		g1.drawOval(90, 70, 80, 80);
		g1.setColor(Color.DARK_GRAY);
		g1.drawOval(110, 95, 5, 5);
		g1.drawOval(145,95 ,5,5);
		g1.drawLine(130, 95, 130,115);
		g1.setColor(Color.green);
		g1.drawArc(113, 115, 35, 20, 0, -180);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   draw2 d=new draw2();
   
   d.setSize(400,400);
   d.setTitle("my drawing new");
   d.setVisible(true);
	}

}
