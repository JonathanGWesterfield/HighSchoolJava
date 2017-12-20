//Jonathan Westerfield

import java.awt.*;
import javax.swing.*;
import java.applet.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Lab21C extends JFrame
{
	private MyPanel drawingPanel = new MyPanel();
	
 	private class MyPanel extends JPanel
 	{
   		public MyPanel()
   		{
     		setPreferredSize(new Dimension(500,500));
     		setBackground(Color.BLACK);
   		}
    }
	
	public static void main(String[] args) 
	{
    	Lab21C lab = new Lab21C();
    	lab.setVisible(true);
    }
    
    Lab21C()
    {
    	setTitle("SHAPES YUH");
   	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 	initButton();
    	pack();
    }
    
    public void initButton()
    {
    	
    	JPanel north = new JPanel();
    	north.setLayout(new FlowLayout(FlowLayout.CENTER));
    	north.setPreferredSize(new Dimension(500,40));
    	north.setBackground(new Color(220,220,220));
    	add(north,BorderLayout.NORTH);
    	
    	//circle
    	JButton circle = new JButton("Circle");
    	circle.setPreferredSize(new Dimension(80,33));
    	circle.setBorder(new BevelBorder(BevelBorder.RAISED));
    	circle.addActionListener
    		(
    			new ActionListener()
    			{
    				public void actionPerformed(ActionEvent e)
    				{
    					Graphics g = drawingPanel.getGraphics();
    					g.setColor(new Color(randomColor(),randomColor(),randomColor()));
    					int random = (int)((Math.random()*100));
    					g.fillOval(randomPosition(),randomPosition(),random, random);
    					
    				}
    			}
    		);
    	north.add(circle);
    	
    	//square
    	JButton square = new JButton("Square");
    	square.setPreferredSize(new Dimension(80,33));
    	square.setBorder(new BevelBorder(BevelBorder.RAISED));
    	square.addActionListener
    		(
    			new ActionListener()
    			{
    				public void actionPerformed(ActionEvent e)
    				{
    					Graphics g = drawingPanel.getGraphics();
    					g.setColor(new Color(randomColor(),randomColor(),randomColor()));
    					int random = (int)(Math.random()*100);
    					g.fillRect(randomPosition(),randomPosition(),random, random);
    					
    				}
    			}
    		);
    	north.add(square);
    	
    	JPanel south = new JPanel();
    	
    	add(drawingPanel);
    	add(south,BorderLayout.SOUTH);
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

	
	public int randomPosition()
	{
		int x = (int)(Math.random()*drawingPanel.getWidth()+10);
		return x;
	}
	
}