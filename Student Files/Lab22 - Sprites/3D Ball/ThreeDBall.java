package ball;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ThreeDBall extends JFrame
{
	private Sprite[] sprites;
	private Timer timer;
	private BallPanel ballPanel;
	
	private class BallPanel extends JPanel{
		public static final int WIDTH = 800;
		public static final int HEIGHT = 600;
		
		public BallPanel(){
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
		new ThreeDBall().setVisible(true);
    }
    
    public ThreeDBall(){
    	setTitle("3D Ball");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setIconImage(Utility.loadImage("icon.png"));
    	sprites = new Sprite[2];
    	sprites[0] = new Ball(Utility.loadImage("ball.png"), 0 ,50);
    	sprites[1] = new Ball(Utility.loadImage("ball.png"),300,300);
    	ballPanel = new BallPanel();
    	setContentPane(ballPanel);
    	ballPanel.addMouseListener(new MouseAdapter()
    	{
    		public void mousePressed(MouseEvent evt){
    			int x = evt.getX();
    			int y = evt.getY();
    			for(int i = 0; i<sprites.length; i++)
    			{
    				if(y>sprites[i].getY()&&y < sprites[i].getY()+ sprites[i].getHeight())
    				{
    					if(x<sprites[i].getX())
    						sprites[i].setDirection(Sprite.LEFT);
    					else if(x > sprites[i].getX() + sprites[i].getWidth())
    						sprites[i].setDirection(Sprite.RIGHT);	
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