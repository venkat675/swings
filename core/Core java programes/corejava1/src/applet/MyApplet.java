package applet;

import java.applet.*; // for Applet class
import java.awt.*;      // for Graphics class
public class MyApplet extends Applet {
        public void paint( Graphics g ) {
                g.drawString("Hi there", 40, 40);
                g.drawOval(40, 60, 45, 45);
                g.drawRect(100, 60, 50, 50);
                g.drawLine(170, 60, 250, 170);
        } // end paint()
        public void init() {
                setBackground(Color.yellow);
        }
} // end class MyApplet

