package ball;

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;

public class Sprite{
	public static final byte UP = 0;
	public static final byte RIGHT = 1;
	public static final byte DOWN = 2;
	public static final byte LEFT = 3;
	
	private BufferedImage image;
	private Rectangle bounds;
	private int direction;
	
	public Sprite(BufferedImage img, int x, int y, int dir)
	{
		image = img;
		bounds = new Rectangle(x, y, image.getWidth(), image.getHeight());
		direction = dir;
	}
	
	public int getX(){
		return bounds.x;
	}
	
	public int getY(){
		return bounds.y;
	}
	
	public int getWidth(){
		return bounds.width;
	}
	
	public int getHeight(){
		return bounds.height;
	}
	
	public void setX(int x){
		bounds.x = x;
	}
	
	public void setY(int y){
		bounds.y = y;
	}
	
	public int getDirection(){
		return direction;
	}
	
	public void setDirection(int dir){
		direction = dir;
	}
	
	public void drawSprite(Graphics g){
		g.drawImage(image, bounds.x, bounds.y, null);
	}
	
	public void act(JPanel panel){}
	
	
}