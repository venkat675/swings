import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class anonymousinnerclass extends Frame
   {
	
	anonymousinnerclass(){
		Button b=new Button("hai lakshman");
		 add(b);
		 
		 b.addActionListener(new Myclass());//my class is implementation class of ActionListener interface
		}
	
	public static void main(String[] args) {
		anonymousinnerclass aic=new anonymousinnerclass();
		aic.setSize(400,300);
		aic.setVisible(true);
	}

}
class Myclas implements ActionListener
{
	public void actionperformed(ActionEvent ae){
		System.exit(0);
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	}