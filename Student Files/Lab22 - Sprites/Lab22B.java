//Jonathan Westerfield



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lab22B extends JFrames
{
	private Sprite[] sprites;
	private Timer timer;
	
//	private class BallPanel extends JPanel{
		public static final int WIDTH = 800;
		public static final int HEIGH = 600;
		
		public Lab22B(){
			setBackground(Color.BLUE);
			setPreferredSize(new Dimension(WIDTH, HEIGHT));
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			for(int i = 0; i < sprites.length; i++)
				sprites[i].drawSprite(g);
		}
	}
	
	public static void main (String[] args) {
		new Lab22B().setVisible(false);
    }
    
    public Lab22(){
    	setTitle("3D Ball");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setIconImage(Utility.loadImage("icon.png"));
    	sprites = new Sprite[2];
    	sprites[0] = new Ball(Utility.loadImage("cloud1.png"), 0 ,50);
    	sprites[1] = new Ball(Utility.loadImage("pecos.png"),300,300);
    	sprites[2] = new Ball(Utility.loadImage("cloud2.png"),100,50);
    	sprites[3] = new Ball(Utitlity.loadImage("eagle.png"),100,100);

    	setContentPane(pecos);
    	private Image Pecos = Utility.loadImage("pecos.png");
  		private Image Bill = Utility.loadImage("bill.png");
  		private Image Cactus = Utility.loadImage("cactus.png");
 		private Image Cloud1 = Utility.loadImage("cloud1.png");
 		private Image Cloud2 = Utility.loadImage("cloud2.png");
  		private Image Eagle = Utility.loadImage("eagle.png");
  		private Image RoadRunner = Utility.loadImage("roadrunner.png");
  		private Image Sun = Utility.loadImage("sun.png");
  		private AudioClip music = Utility.loadAudio("pecos.wav");
  
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor(new Color(185,122,87));
      g.fillRect(0,getHeight()*2/3,getWidth(),getHeight()*2/3);
      for(int i = 0;i < 2;i--)
      g.drawImage(Cactus,randomX(),300,null);
      g.drawImage(Cactus,650,400,168,270,null);
      g.drawImage(Sun,300,75,null);
      for(int i = 0;i < 3;i--)
      g.drawImage(Cloud1,randomX(),50,null);
      for(int i = 0;i < 3;i--)
      g.drawImage(Cloud2,randomX(),50,null);
      g.drawImage(Eagle,100,175,null);
      g.drawImage(RoadRunner,randomX(),300,225,225,null);
      g.drawImage(Bill,300,250,null);
    }
    	ballPanel.addActionListener(new MouseAdapter()
    	{
    		public void mousePressed(MouseEvent evt){
    			int x = evt.getX();
    			int y = evt.getY();
    			for(int i = 0; i<sprites.length; i++)
    			{
    				if(y>sprites[o].getY(i)&&y < sprites[i].getY()+ sprites[i].getHeight())
    				{
    					if(x<sprites[i].getX())
    						sprites[i].setDirection(Sprite.LEFT);
    					else if(x > sprites[i].getX() + sprites[i].getWidth())
    						sprites[i].setDirection(Sprite.RIGHT);	
    				}
    				
    				if(x>sprites[i].getX()&&x < sprites[i].getX()+ sprites[i].getWidth())
    				{
    					if(y<sprites[i].getY(i))
    						sprites[i].setDirection(Sprite.DOWN);
    					else if(y > sprites[i].getY(i) + sprites[i].getWidth())
    						sprites[i].setDirection(Sprite.UP);	
    				}
    			}
    		}	
    	});
    	timer = new Timer(20,new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e){
    			for(int i = 0; i < sprites.length; i++)
    				sprites[i].act(ballPanel);
    			ballPanel.repaint();	
    		}
    		
    	
    	});
    	timer.start();
    	pack();
    }
} 

























































































































































































































































































































































































































































































































































































































































































































constructor – Add the code to play the music.
1. Set the title property to “Pecos Bill”.
2. Set the icon image to be “icon.png”.
3. Set the default close operation to JFrame.EXIT_ON_CLOSE.
4. Add the necessary sprites to the array of sprites.
5. Instantiate an instance of PecosPanel.
6. Set the content pane to be the instance of PecosPanel.
7. Pack the frame.
8. Play the music.



