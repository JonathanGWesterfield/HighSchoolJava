//Jonathan Westerfield

import java.awt.*;
import javax.swing.*;
import java.applet.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Lab21A extends JFrame
{
	private JTextField length = new JTextField("",10);
	private JTextField width = new JTextField("",10);
	private JTextField area = new JTextField("", 10);
	private JTextField perimeter = new JTextField("", 10);
	
	public static void main(String[] args) 
	{
    	Lab21A lab = new Lab21A();
    	lab.setVisible(true);
    }
    
    Lab21A()
    {
    	setTitle("Tangles get Rekt");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	initTextFields();
    	initButton();
    
    	
    
   		
    	pack();
    }
 
    
    public void initTextFields()
    {
    	JPanel north = new JPanel();
    	north.setLayout(new FlowLayout(FlowLayout.LEFT));
    	north.setBackground(new Color(206,206,206));
    	north.setPreferredSize(new Dimension(380,110));
    	north.add(new JLabel("Length"));
    	north.add(length);
    	north.add(new JLabel("Width"));
    	north.add(width);
    	add(north,BorderLayout.NORTH);
    	
    	JPanel south = new JPanel();
    	south.setLayout(new FlowLayout(FlowLayout.LEFT));
    	south.setBackground(new Color(206,206,206));
    	south.setPreferredSize(new Dimension(380,110));
    	south.add(new JLabel("Area:"));
    	south.add(area);
    	south.add(new JLabel("Perimeter:"));
    	south.add(perimeter);
    	add(south,BorderLayout.SOUTH);
    }
    
	public void initButton()
 	{
 	   	JPanel center = new JPanel();
    	center.setPreferredSize(new Dimension(400,40));
   		center.setBackground(new Color(206,206,206));
    
	   	JButton calc = new JButton("CALCULATE");
    	calc.setBorder(new BevelBorder(BevelBorder.RAISED));
    	calc.setPreferredSize(new Dimension(150,30));
	   	calc.addActionListener(
    			new ActionListener()
    			{
    				public void actionPerformed(ActionEvent e)
    				{
    					String l = length.getText();
    					int iLength = Integer.parseInt(l);
    					String w = width.getText();
    					int iWidth = Integer.parseInt(w);
    					int areareal = iWidth*iLength;
    					int perimreal = (2*iWidth) + (2*iLength);
    					String sArea = Integer.toString(areareal);
    					String sPerimeter = Integer.toString(perimreal);
    					area.setText(sArea);
    					perimeter.setText(sPerimeter);
    				}
    			}	
   	 	);
   	 		
    	center.add(calc);
    	add(center,BorderLayout.CENTER);
	}

}
