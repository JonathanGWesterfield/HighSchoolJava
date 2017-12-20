//Jonathan Westerfield

package transparency;
import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class Lab20D extends JFrame
{
	private MyPanel drawingArea = new MyPanel();
	
	private class MyPanel extends JPanel
	{
		public MyPanel()
		{
			setPreferredSize(new Dimension(400,300));
			setBackground(Color.WHITE);
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(new Color(randomColor(),randomColor(),randomColor(),128));
			g.fillOval(100,100,200,200);
			g.setColor(new Color(randomColor(),randomColor(),randomColor(),128));
			g.fillRect(10,10,200,200);
			g.setColor(new Color(randomColor(),randomColor(),randomColor(),128));
			int[]x = {30,30,275};
			int[]y = {30,275,275};
			g.fillPolygon(x,y,3);
			
		}
		
	}
	
	public int randomColor()
	{
		for(int i = 0;i<3;i++)
		{
			int x = (int)(Math.random()*258);
			return x;
		}
		return 0;
		
	}
	public static void main(String[] args) 
	{
    	Lab20D lab = new Lab20D();
    	lab.setVisible(true);
    }
    
    
    Lab20D()
    {
    	setTitle("Tansparent Colors");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setContentPane(drawingArea);
    	setIconImage(Utility.loadImage("transparent.gif"));
    	pack(); 
    }
}