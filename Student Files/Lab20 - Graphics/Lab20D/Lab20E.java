//Jonathan Westerfield

package pecos;
import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class Lab20E extends JFrame
{
	private MyPanel drawingArea = new MyPanel();
	private Image pecos = Utility.loadImage("bill.png");
  	private Image cactus = Utility.loadImage("cactus.png");
  	private Image cloud1 = Utility.loadImage("cloud1.png");
  	private Image cloud2 = Utility.loadImage("cloud2.png");
  	private Image eagle = Utility.loadImage("eagle.png");
  	private Image icon = Utility.loadImage("pecos.png");
  	private Image roadrunner = Utility.loadImage("roadrunner.png");
  	private Image sun = Utility.loadImage("sun.png");
 	private AudioClip music = Utility.loadAudio("pecos.wav");
  
	private class MyPanel extends JPanel
	{
		public MyPanel()
		{
			setPreferredSize(new Dimension(1000,700));
			setBackground(Color.WHITE);
		}	
		public void paintComponent(Graphics g)
		{
		
		}
		
	}
	
	  public static void main (String[] args) 
	  	{
    		Lab20E lab = new Lab20E();
   			lab.setVisible(true);
   	    }
    Lab20E()
    	{
    	  setTitle("Pecos BillY");
    	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  setContentPane(drawingArea);
      	  setIconImage(Utility.loadImage("pecos.jpg"));
          music.loop();
    	  pack();
      
    }
}
