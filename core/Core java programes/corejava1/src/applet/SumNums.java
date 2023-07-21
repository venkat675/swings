package applet;

//SumNums.java
import java.applet.Applet;
import java.awt.*;

public class SumNums extends Applet {
	public void paint(Graphics g) {
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;

		String str = "Sum: "+String.valueOf(sum);
  		g.drawString (str,100, 125);
	}
}

