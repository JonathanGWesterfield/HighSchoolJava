//Jonathan Westerfield

import java.awt.*;
import javax.swing.*;
import java.applet.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Lab21B extends JFrame
{
		private JTextField fullName = new JTextField("",16);
		private JTextField firstname = new JTextField("",16);
		private JTextField lastname = new JTextField("", 16);
		
		public static void main(String[] args) 
		{
   	 		Lab21B lab = new Lab21B();
   	 		lab.setVisible(true);
   		}
   	 
   	 Lab21B()
   	 {
   	 	setTitle("Name Parser");
   	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 	initTextFields();
    	pack();
   	 }
   	 
   	 public void initTextFields()
   	 {
   	 	JPanel north = new JPanel();
   	 	north.setLayout(new FlowLayout(FlowLayout.CENTER));
    	north.setBackground(new Color(210,210,210));
    	north.setPreferredSize(new Dimension(650,25));
		north.add(new JLabel("Full Name: "));
		north.add(fullName);	
    	add(north, BorderLayout.NORTH);
    	
    	
    	//south
    	JPanel south = new JPanel();
    	south.setLayout(new FlowLayout (FlowLayout.CENTER));
    	south.setBackground(new Color(210,210,210));
    	south.setPreferredSize(new Dimension(650,25));
    	south.add(new JLabel("First Name: "));
    	south.add(firstname);
    	south.add(new JLabel("Last Name: "));
    	south.add(lastname);
    	add(south, BorderLayout.SOUTH);
    	
    	//Action listener
    	fullName.addActionListener(
    			   
    			new ActionListener()
    			{
    				public void actionPerformed(ActionEvent e)
    				{
    					String full = fullName.getText();
    					int index = full.indexOf(" ");
    					String first = full.substring(0,index);
    					String last = full.substring(index+1);
    					firstname.setText(first);
    					lastname.setText(last);
    					
    				}
    			}	
   	 	);
    	
   	 }
   	 

}