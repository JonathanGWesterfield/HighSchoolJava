//Jonathan Westerfield

package box;
import java.awt.*;
import javax.swing.*;
import java.applet.*;


public class Lab20B extends JFrame
{
  private MyPanel drawingArea = new MyPanel();
 
  
  private class MyPanel extends JPanel
  {
    public MyPanel()
    {
      setPreferredSize(new Dimension(300,300));
      setBackground(Color.WHITE);
    }
     public void paintComponent(Graphics g)
  	{
    	super.paintComponent(g);
	    g.setColor(Color.BLACK);
    	g.drawRect(10,10, 100,100);
  	    g.setColor(Color.BLACK);
	    g.drawRect(70,70,100,100);
	    g.drawLine(10,10,70,70);
	    g.drawLine(110,10,170,70);
	    g.drawLine(10,110,70,170);
	    g.drawLine(110,110,170,170);
	    
    	
  	}
  }
 
 
  
  public static void main(String[] args)
  {
    Lab20B lab = new Lab20B();
    lab.setVisible(true);
  }
  
  
  
  Lab20B ()
  {
    setTitle("3D Box");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(drawingArea);
    setIconImage(Utility.loadImage("3dbox.gif"));
    pack();
  }
}