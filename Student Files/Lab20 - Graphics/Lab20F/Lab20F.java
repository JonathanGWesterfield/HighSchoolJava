//Jonathan Westerfield

package checkerboard;
import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class Lab20F extends JFrame
{
  private MyPanel drawingArea = new MyPanel();
  
  private class MyPanel extends JPanel
  {
    public MyPanel()
    {
      setPreferredSize(new Dimension(400,400));
      setBackground(Color.BLACK);
    }
    
    public void paintComponent(Graphics g)
    {
      super.paintComponent(g);
      g.setColor(Color.RED);
      int w = getWidth()/8;
      int h = getHeight()/8;
      for(int y = 0;y < 4;y++)
      {
        for(int x = 0;x < 4;x++)
        {
          g.fillRect(x*w*2,y*h*2,w,h);
          g.fillRect(w+x*w*2,h+y*h*2,w,h);
        }
      }
    }
    
  }
  
  
  
  
  public static void main(String[] args)
  {
    Lab20F lab = new Lab20F();
    lab.setVisible(true);
  }
  
  Lab20F()
  {
    setTitle("CheckerBoard");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(drawingArea);
    setIconImage(Utility.loadImage("checkerboard.gif"));
    pack();
  }
}