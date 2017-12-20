import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class LayoutManagers extends JFrame
{
	

    public static void main(String[] args) {
    	new LayoutManagers().setVisible(true);
    }
    
    public LayoutManagers() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Layout Examples");
       
        JPanel north = new JPanel();
        north.setBackground(Color.BLUE);
        north.setPreferredSize(new Dimension(400,200));
        add(north, BorderLayout.NORTH);
        
        JPanel west = new JPanel();
        west.setBackground(Color.GREEN);
        west.setPreferredSize(new Dimension(200,50));
        add(west, BorderLayout.WEST);
        
        JPanel east = new JPanel();
        east.setBackground(Color.RED);
        east.setPreferredSize(new Dimension(200,50));
        add(east, BorderLayout.EAST);
        
        JPanel center = new JPanel(new GridLayout(3,4));
        center.setBackground(Color.YELLOW);
        center.setPreferredSize(new Dimension(600,50));
        add(center, BorderLayout.CENTER);
        
        JPanel south = new JPanel();
        south.setBackground(Color.CYAN);
        south.setPreferredSize(new Dimension(400,200));
        add(south, BorderLayout.SOUTH);
        
        for(int i=0; i<9 ;i++)
        {
 	       JButton button = new JButton("CLICK HERE FOR ASS");
    	    button.setPreferredSize(new Dimension(90,30));
        	button.setBorder(new BevelBorder(BevelBorder.RAISED));
        	center.add(button);
    	    //add(button, BorderLayout.CENTER);
        }
        
            
        pack();
    }
}