//Jonathan Westerfield

package pyramid;
import java.io.*;
import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class Lab20C extends JFrame
{
	
	private MyPanel drawingArea = new MyPanel();
	
	private class MyPanel extends JPanel
	{
		public MyPanel()
		{
			setPreferredSize(new Dimension(600,500));
      		setBackground(Color.BLACK);
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(new Color(255,234,179,255));
			g.fillRect(0,340,600,500);
			int[] x = {150,190,220};
			int[] y = {370,310,375};
			g.setColor(new Color(253,192,112,255));
			g.fillPolygon(x,y, 3);
			int[]x1 = {190,220,235};
			int[] y1 = {310,375,350};
			g.setColor(new Color(254,201,77,255));
			g.fillPolygon(x1,y1,3);
			g.setColor(Color.WHITE);
			g.fillRect(10,100,3,3);
			g.fillRect(30,50,3,3);
			g.fillRect(80,60,3,3);
			g.fillRect(250,180,3,3);
			g.fillRect(300,170,3,3);
			g.fillRect(368,200,3,3);
			g.fillRect(261,210,3,3);
			g.fillRect(159,350,3,3);
			g.fillRect(333,365,3,3);
			
		}
	}
	
	public static void main(String[] args)
	{
    	Lab20C lab = new Lab20C();
   		lab.setVisible(true);
    }
    
    Lab20C()
    {
    	setTitle("Pyramid Nights Yuuuuh");
   		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setContentPane(drawingArea);
    	setIconImage(Utility.loadImage("pyramid.gif"));
    	pack();
    }
}