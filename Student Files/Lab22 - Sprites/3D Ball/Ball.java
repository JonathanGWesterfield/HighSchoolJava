package ball;

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;

public class Ball extends Sprite
{
	public Ball(BufferedImage image, int x, int y)
	{
		super(image,x,y,Sprite.RIGHT);
	
	}
	@Override
	public void act(JPanel panel)
	{
		int x = getX();
		int y = getY();
		switch(getDirection())
		{
			case RIGHT:
				x = x+4;
				if(x > panel.getWidth())
					x = -getWidth();
				break;
			
			case LEFT:
				x = x - 4;
				if( x < -getWidth())
					x = panel.getWidth();
				break;	
			case UP:
				y = y +4;
				if(y > panel.getWidth())
					y= -getWidth();
				break;
			
			case DOWN:
				y = y - 4;
				if( y < -getWidth())
					y = panel.getWidth();
				break;
					
		}
		setX(x);
		setY(y);
	}
}