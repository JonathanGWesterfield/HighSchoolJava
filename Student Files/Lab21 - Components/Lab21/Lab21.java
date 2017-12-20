package components;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Lab21 extends JFrame
{
	private JTextField text1 = new JTextField(" ",32);
	private JTextField text2 = new JTextField(" ",32);
	public static void main(String[] args) 
	{
    	Lab21 lab = new Lab21();
    	lab.setVisible(true);
		
    }
    
    public Lab21()
    {
    	setSize(400,300);
    	setTitle("Components");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	initTextFields();
    	initButton();
    	initMenu();
    	
    	pack();
    }
    
    public void initTextFields()
    {
    	JPanel center = new JPanel();
    	center.setLayout(new FlowLayout(FlowLayout.LEFT));
    	center.setBackground(Color.yellow);
    	center.setPreferredSize(new Dimension(380,110));
    	center.add(new JLabel("First Text Field"));
    	center.add(text1);
    	center.add(new JLabel("Second Text Field"));
    	center.add(text2);
    	add(center,BorderLayout.CENTER);
    }
    
    public void initButton()
    {
    	JPanel south = new JPanel();
    	south.setPreferredSize(new Dimension(400,40));
    	south.setBackground(Color.cyan);
    	
    	JButton copy = new JButton("Copy");
    	copy.setBorder(new BevelBorder(BevelBorder.RAISED));
    	copy.setPreferredSize(new Dimension(60,30));
    	copy.addActionListener
    		(
    			new ActionListener()
    			{
    				public void actionPerformed(ActionEvent e)
    				{
    					String text = text1.getText();
    					text2.setText(text);
    				}
    			}	
    		);
    	
    	south.add(copy);
    	add(south,BorderLayout.SOUTH);
    }
    
    public void initMenu()
    {
    	JMenuBar menuBar = new JMenuBar();
    	JMenu file = new JMenu("File");
    	JMenuItem exit = new JMenuItem("Exit Motherfucker");
    	exit.addActionListener
    	(
    		new ActionListener()
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				System.exit(0);
    			}
    		}		
    	);
    	
    	file.add(exit);
    	menuBar.add(file);
    	setJMenuBar(menuBar);
    }
}