package applet;

//MyApplet.java: draws rectangle with yellow color fill
import java.applet.*;
import java.awt.*;
public class MyApplet1 extends Applet
{
   public synchronized void paint(Graphics g)
   {
      int x,y,width,height;
      Dimension dm = size();
      x = dm.width/4;
      y = dm.height / 4;
      width = dm.width / 2;
      height = dm.height / 2;
      // Draw the rectangle in the center with colors!
      g.setColor(Color.blue);
      g.drawRect(x,y,width,height);
      g.setColor(Color.yellow);
      g.fillRect(x + 1,y + 1,width - 2,height - 2);
   }
}


