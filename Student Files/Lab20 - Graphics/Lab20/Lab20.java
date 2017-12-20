//Jonathan Westerfield

import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class Lab20 extends JFrame
{
  private MyPanel drawingArea = new MyPanel();
  private Image monsters = Utility.loadImage("MonstersInc.jpg");
  private Image betty = Utility.loadImage("betty.jpg");
  private Image tangled = Utility.loadImage("Tangledfaceswap.jpg");
  private AudioClip music = Utility.loadAudio("evenbettermusic.wav");

  
  
  private class MyPanel extends JPanel{
    public MyPanel(){
      setPreferredSize(new Dimension(1000,1000));
      setBackground(Color.RED);
    }
    
    public void paintComponent(Graphics g)
    {
      super.paintComponent(g);
      g.setColor(Color.BLUE);
      g.fillRect(10,10,100,100);
      g.setColor(Color.YELLOW);
      g.fillOval(120,60,150,150);
      int[] x={30,70,50,90};
      int[] y={30,30,90,90};
      g.fillPolygon(x,y,4);
      g.setColor(new Color(201,80,80,210));
      g.fillRect(50,50,120,120);
      g.drawImage(monsters,100,500,null);
      g.drawImage(tangled,400,100,null);
      g.setFont(new Font("Monospace",Font.BOLD,36));
      g.drawString("I'M TRIPPIN BALLS!",200,50);
      
      
    }
  }
  public static void main (String[] args) {
    Lab20 lab = new Lab20();
    lab.setVisible(true);
    }
    Lab20(){
      setTitle("Boop boop A Doop!");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(drawingArea);
      setIconImage(Utility.loadImage("MonstersInc.jpg"));
      music.loop();
      pack();
      
    }

}