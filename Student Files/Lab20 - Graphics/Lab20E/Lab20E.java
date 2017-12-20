//Jonathan Westerfield

package pecos;

import java.awt.*;
import javax.swing.*;
import java.applet.AudioClip;

public class Lab20E extends JFrame
{
  private MyPanel drawingArea = new MyPanel();
  
  private Image Pecos = Utility.loadImage("pecos.png");
  private Image Bill = Utility.loadImage("bill.png");
  private Image Cactus = Utility.loadImage("cactus.png");
  private Image Cloud1 = Utility.loadImage("cloud1.png");
  private Image Cloud2 = Utility.loadImage("cloud2.png");
  private Image Eagle = Utility.loadImage("eagle.png");
  private Image RoadRunner = Utility.loadImage("roadrunner.png");
  private Image Sun = Utility.loadImage("sun.png");
  private AudioClip music = Utility.loadAudio("pecos.wav");
  
  private class MyPanel extends JPanel
  {
    public MyPanel(){
      setPreferredSize(new Dimension(900,700));
      setBackground(new Color(191,240,239));
    }
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor(new Color(185,122,87));
      g.fillRect(0,getHeight()*2/3,getWidth(),getHeight()*2/3);
      for(int i = 0;i < 2;i++)
      g.drawImage(Cactus,randomX(),300,null);
      g.drawImage(Cactus,650,400,168,270,null);
      g.drawImage(Sun,300,75,null);
      for(int i = 0;i < 3;i++)
      g.drawImage(Cloud1,randomX(),50,null);
      for(int i = 0;i < 3;i++)
      g.drawImage(Cloud2,randomX(),50,null);
      g.drawImage(Eagle,100,175,null);
      g.drawImage(RoadRunner,randomX(),300,225,225,null);
      g.drawImage(Bill,300,250,null);
    }
    public int randomX(){
      for(int i = 0;i < 2;i++)
      {
        int x = (int)(Math.random()*(getWidth()));
        return x;
      }
      return 0;
    }
  }
  public static void main (String[] args) {
    Lab20E lab = new Lab20E();
    lab.setVisible(true);
  }
  Lab20E(){
    setTitle("Pecos BillY Willy");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(drawingArea);
    setIconImage(Utility.loadImage("pecos.png"));
    music.loop();
    pack();
  }
}