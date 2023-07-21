package applet;

//HelloApplet.java: for processing applet methods
import java.awt.*;
import java.applet.*;
public class HelloApplet extends Applet
{
   public void init()   {	   
      setBackground(Color.yellow);
      System.out.println("init() method invoked");
   }
   public void start()
   {
      System.out.println("start() method invoked");                
   }
   public void paint( Graphics g )
   {
      System.out.println("paint() method invoked");                
      g.drawString( "Hi Welcome to Applet", 24, 25 );
   }
   public void stop()
   {
      System.out.println("stop() method invoked");                
   }
}
