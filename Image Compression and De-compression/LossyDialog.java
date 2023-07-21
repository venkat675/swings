import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Utils.FileChooser;
import Viewer.OpenImage;
import Algorithms.Convert.*;

public class LossyDialog extends JPanel implements ActionListener{

	private JTabbedPane srcTabPane, trgTabPane, srcTab, trgTab;
	private JToolBar toolBar;
	private JPanel picPane, status, jpSource, jpJPG, jpGIF, jpPNG, jpTIF, jpBMP, jpPNM, jpRAW;
	private JTextField jlSrcFn, jlTrgFn, ratio, version;
	private JButton[] buttons;
	private long sizeSrc=0, sizeTrg=0; 
	String SrcFileName="", TrgFileName="";

	public Insets getInsets(){
		return new Insets(5,5,3,3);
	}
	
	public LossyDialog(){

	try{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	}catch(Exception e){}
		
    	setLayout(new BorderLayout());
	this.add(lossyToolBar(), BorderLayout.PAGE_START);
		
	status = new JPanel(new FlowLayout(FlowLayout.CENTER,1,1));
	jlSrcFn = new JTextField("Source: ", 20);	
	jlSrcFn.setBackground(Color.lightGray);
	jlSrcFn.setEditable(false);
	ratio = new JTextField(" CoDec Ratio", 8);	
	ratio.setBackground(Color.lightGray);
	ratio.setEditable(false);
	version = new JTextField("  Ver 1.1", 5);	
	version.setBackground(Color.lightGray);
	version.setEditable(false);
	jlTrgFn = new JTextField("Target: ", 20);	
	jlTrgFn.setBackground(Color.lightGray);
	jlTrgFn.setEditable(false);
		
	status.add(jlSrcFn);
	status.add(ratio);
	status.add(version);
	status.add(jlTrgFn);

	picPane = new JPanel();
	picPane.setLayout(new FlowLayout());	
	srcTabPane = SourceType();
	picPane.add(srcTabPane);
	trgTabPane = TargetType();
	picPane.add(trgTabPane);
		
	this.add(picPane, BorderLayout.CENTER);
	this.add(status, BorderLayout.PAGE_END);
  }
	
	protected JTabbedPane SourceType(){

	    	srcTab = new JTabbedPane(SwingConstants.TOP);
		srcTab.setPreferredSize(new Dimension(250, 310));
		jpSource = new JPanel();
	    	srcTab.addTab("Source", null, jpSource, "This is source image");
		return (srcTab);
  	}

	protected JTabbedPane TargetType(){

	    	trgTab = new JTabbedPane(SwingConstants.TOP);
		trgTab.setPreferredSize(new Dimension(330, 310));

		jpJPG = new JPanel();
		jpGIF = new JPanel();
		jpPNG = new JPanel();
		jpTIF = new JPanel();
		jpPNM = new JPanel();
		jpBMP = new JPanel();
		jpRAW = new JPanel();
	
	    	trgTab.addTab("JPG", null, jpJPG, "This is JPG/JPEG image");
	    	trgTab.addTab("GIF", null, jpGIF, "This is GIF image");
	    	trgTab.addTab("PNG", null, jpPNG, "This is PNG image");
	    	trgTab.addTab("TIF", null, jpTIF, "This is TIF/TIFF image");
	    	trgTab.addTab("PNM", null, jpPNM, "This is PNM image");
	    	trgTab.addTab("BMP", null, jpBMP, "This is BMP image");
	    	trgTab.addTab("RAW", null, jpRAW, "This is RAW image");
	 	 
		return (trgTab);

	}

     protected JToolBar lossyToolBar(){
     	toolBar = new JToolBar();
		toolBar.setFloatable(false);
		JLabel lb = new JLabel("Progress Monitor Bar");
		String[] iconFiles = {"icons\\Open2.gif","icons\\Savejpg.gif","icons\\Savegif.gif",
		                      "icons\\Savepng.gif","icons\\Savetif.gif","icons\\Savepnm.gif","icons\\Savebmp.gif", "icons\\Saveraw.gif"};
		String[] buttonLabels = {"Open Source Image","Save JPG image","Save GIF image",
		                         "Save PNG image","Save TIF image","Save PNM image","Save BMP image", "Save RAW image"};
			
		ImageIcon[] icons = new ImageIcon[iconFiles.length];
		buttons = new JButton[buttonLabels.length];
			
		for(int i=0;i<buttonLabels.length;++i) {
			icons[i] = new ImageIcon(iconFiles[i]);
			buttons[i] = new JButton(icons[i]);
			buttons[i].setToolTipText(buttonLabels[i]);
			buttons[i].setEnabled(false);
			if(i==1) toolBar.addSeparator();
			buttons[i].addActionListener(this);
			toolBar.add(buttons[i]);
		}
		
		buttons[0].setEnabled(true);
		toolBar.add(lb);	 
    		return toolBar;
     }

   	public  void actionPerformed(ActionEvent e){
		
		if (e.getSource()==(Object)buttons[0]){
			
			jpSource.removeAll();
			FileChooser fc = new FileChooser("image", "Open");
			SrcFileName = fc.getFileName();

			OpenImage oi = new OpenImage(SrcFileName);
			oi.setPreferredSize(new Dimension(200, 270));
			sizeSrc = oi.getImageSize();
			//SrcFileName = oi.getImageName();
			jlSrcFn.setText(SrcFileName);
			jpSource.add(oi);
			
			for(int i=1; i<7; i++){
				buttons[i].setEnabled(true);
			}

		}
		else if (e.getSource()==(Object)buttons[1]){
			
			jpJPG.removeAll();
			JPEGEncoder je = new JPEGEncoder(SrcFileName);
			TrgFileName = je.getOutFileName();
			OpenImage oi = new OpenImage(TrgFileName);
			oi.setPreferredSize(new Dimension(280, 270));//330 310
			sizeTrg = oi.getImageSize();
			if (sizeTrg!=0 && sizeSrc!=0){
				int n = (int)(sizeSrc*100/sizeTrg);
				ratio.setText("Ratio "+(float)(n/100)+":1");
			}
			jlTrgFn.setText(TrgFileName);
			jpJPG.add(oi);
			trgTab.setEnabledAt(0, true);

		}
			
		else if (e.getSource()==(Object)buttons[2]){
			
			jpGIF.removeAll();
			GIFEncoder ge = new GIFEncoder(SrcFileName);
			TrgFileName = ge.getOutFileName();
			OpenImage oi = new OpenImage(TrgFileName);
			oi.setPreferredSize(new Dimension(280, 270));//330 310
			sizeTrg = oi.getImageSize();
			if (sizeTrg!=0 && sizeSrc!=0){
				int n = (int)(sizeSrc*100/sizeTrg);
				ratio.setText("Ratio "+(float)(n/100)+":1");
			}
			jlTrgFn.setText(TrgFileName);
			jpGIF.add(oi);
			trgTab.setEnabledAt(1, true);
		}	
			
		else if (e.getSource()==(Object)buttons[3]){
			jpPNG.removeAll();
			PNGEncoder pe = new PNGEncoder(SrcFileName);
			TrgFileName = pe.getOutFileName();
			OpenImage oi = new OpenImage(TrgFileName);
			oi.setPreferredSize(new Dimension(280, 270));//330 310
			sizeTrg = oi.getImageSize();
			if (sizeTrg!=0 && sizeSrc!=0){
				int n = (int)(sizeSrc*100/sizeTrg);
				ratio.setText("Ratio "+(float)(n/100)+":1");
			}
			jlTrgFn.setText(TrgFileName);
			jpPNG.add(oi);
			trgTab.setEnabledAt(2, true);
		}	
			
		else if (e.getSource()==(Object)buttons[4]){
			
			jpTIF.removeAll();
			TIFEncoder te = new TIFEncoder(SrcFileName);
			TrgFileName = te.getOutFileName();
			OpenImage oi = new OpenImage(TrgFileName);
			oi.setPreferredSize(new Dimension(280, 270));//330 310
			sizeTrg = oi.getImageSize();
			if (sizeTrg!=0 && sizeSrc!=0){
				int n = (int)(sizeSrc*100/sizeTrg);
				ratio.setText("Ratio "+(float)(n/100)+":1");
			}
			jlTrgFn.setText(TrgFileName);
			jpTIF.add(oi);
			trgTab.setEnabledAt(3, true);
		}	
			
			else if (e.getSource()==(Object)buttons[5]){
			
			jpPNM.removeAll();
			PNMEncoder pe = new PNMEncoder(SrcFileName);
			TrgFileName = pe.getOutFileName();
			OpenImage oi = new OpenImage(TrgFileName);
			oi.setPreferredSize(new Dimension(280, 270));//330 310
			sizeTrg = oi.getImageSize();
			if (sizeTrg!=0 && sizeSrc!=0){
				int n = (int)(sizeSrc*100/sizeTrg);
				ratio.setText("Ratio "+(float)(n/100)+":1");
			}
			jlTrgFn.setText(TrgFileName);
			jpPNM.add(oi);
			trgTab.setEnabledAt(4, true);
		}	
			
			else if (e.getSource()==(Object)buttons[6]){
			
			jpBMP.removeAll();
			BMPEncoder be = new BMPEncoder(SrcFileName);
			TrgFileName = be.getOutFileName();
			OpenImage oi = new OpenImage(TrgFileName);
			oi.setPreferredSize(new Dimension(280, 270));//330 310
			sizeTrg = oi.getImageSize();
			if (sizeTrg!=0 && sizeSrc!=0){
				int n = (int)(sizeSrc*100/sizeTrg);
				ratio.setText("Ratio "+(float)(n/100)+":1");
			}
			jlTrgFn.setText(TrgFileName);
			jpBMP.add(oi);
			trgTab.setEnabledAt(5, true);
		}	
			
		else if (e.getSource()==(Object)buttons[7]){
			jpRAW.setPreferredSize(new Dimension(280, 270));//330 310
			ImageIcon icon1 = new ImageIcon("\\Icons\\book.gif");
		     JLabel jlIcon = new JLabel(icon1);
			jpRAW.add(jlIcon);
		}	
	}

	public static void main(String args[]){
	
	    JFrame myFrame = new JFrame("Lossy Algorithms");
	    LossyDialog ld = new LossyDialog();
	
	    myFrame.getContentPane().add(ld);
	    myFrame.addWindowListener(new WindowAdapter(){
	      public void windowClosing(WindowEvent e) {
	                System.exit(0);
	      }
	     });
	
	    myFrame.setSize(new Dimension(610,420));
	    myFrame.setVisible(true);
	  }
}


