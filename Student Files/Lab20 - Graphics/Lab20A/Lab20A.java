//Jonathan Westerfield

import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class Lab20A extends JFrame
{   
  private MyPanel drawingArea = new MyPanel();
  private Image icon = Utility.loadImage("flag.gif");
  private AudioClip music = Utility.loadAudio("la_marseillaise.wav");

  
  private class MyPanel extends JPanel
  {
    public MyPanel()
    {
      setPreferredSize(new Dimension(500,350));
      setBackground(Color.WHITE);
    }

      public void paintComponent(Graphics g)
      {
        int width = getWidth()/3;
        int height = getHeight();
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(0,0,width,height);
        g.setColor(Color.RED);
        g.fillRect(width*2, 0, width, height);
        
      }
  }
  public static void main(String[] args) 
    {
      Lab20A lab = new Lab20A();
      lab.setVisible(true);
    }
    Lab20A()
    {
      setTitle("Cowardly French Flag");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(drawingArea);
      setIconImage(Utility.loadImage("flag.gif"));
      music.loop();
      pack();
      
    }
}