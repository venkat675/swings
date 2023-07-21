package windowtoolkits;
import java.awt.*;
import java.awt.event.*;
public class keys extends Frame implements KeyListener 
{
	/**
	 * @author Lakshman
	 *
	 */
	TextArea ta;
	String msg="";
	
	keys()
	{
		setLayout(new FlowLayout());
		ta=new TextArea(5,25);
		
		Font f=new Font("SansSerif",Font.BOLD,25);
		ta.setFont(f);
		ta.setForeground(Color.blue);
		
		add(ta);
		
		ta.addKeyListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	
	public void keyPressed(KeyEvent ke)
	{
		int keycode=ke.getKeyCode();
		msg+="\nkey Code: "+ keycode;
		
		String keyname=ke.getKeyText(keycode);
		msg+="\nkey pressed: "+keyname;
		
		ta.setText(msg);
		msg="";
	}
	
	public void keyTyped(KeyEvent ke)
	{
		
	}
	
	public void KeyReleased(KeyEvent ke){
		
		int keycode=ke.getKeyCode();
		msg+="\nkey code: "+ keycode;
		
		String keyname=ke.getKeyText(keycode);
		msg+="\n key released: "+ keyname;
		
		ta.setText(msg);
		msg="";
		
	}

	public static void main(String[] args)
	{
		keys ks=new keys();
		
		ks.setTitle(" catch the key ");
		ks.setSize(400,400);
		ks.setVisible(true);	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
