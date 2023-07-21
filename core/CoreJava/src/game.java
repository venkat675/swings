import java.awt.*;
import java.awt.event.*;

class game extends Frame implements KeyListener
{
	int x,y,x1,y1,x2,y2,count;
	Label l;

	public game(String s)
	{
		super(s);
		x=20;
		y=20;
		x1=50;
		y1=50;
		x2=150;
		y2=150;
		count=0;
		addKeyListener(this);
        setLayout(null);
		l = new Label(Integer.toString(count));
		l.setBounds(200,50,100,30);
		this.add(l);
    //  repaint();
		this.setBounds(100,100,400,400);
		this.setVisible(true);

	}
	public void update(Graphics g)
	{
		super.update(g);
	  System.out.println("in update....");
	  paint(g);	
	l.setText(Integer.toString(count));		
	
	}
	public void paint(Graphics g)
	{
		  g.setColor(Color.RED);
		g.fillOval(x1,y1,10,10);
		
		g.setColor(Color.RED);
		g.fillOval(x2,y2,10,10);
		
		g.setColor(Color.GREEN);
		g.fillOval(x,y,30,30);
		
			if((x==x1) || (y==y1))
			{	
				x1=550; y1=700;
				count++;
			}	
			if((x==x2) || (y==y2))
			{	
				x2=550; y2=700;
				count++;       

			}	
	
	}
	public void keyPressed(KeyEvent e) 
    {
		System.out.println("Key Pressed"+e.getKeyCode());
		switch(e.getKeyCode())
		{
			case 37:	x--;
						break;
			case 38:	y--;
						break;
			case 39:	x++;
						break;
			case 40:	y++;
						break;
		}

		repaint();
	}
	public void keyReleased(KeyEvent e) 
	{
	}     
	public void keyTyped(KeyEvent e) 
	{
	} 
  

	public static void main(String[] args) 
	{
		game g = new game("My Game");
		
	}
}
