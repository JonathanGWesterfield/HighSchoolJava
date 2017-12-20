
package Lab21d;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab21d extends JFrame
{
	private PiePanel pie=new PiePanel();
	public static void main (String[] args) 
	{
		new Lab21d().setVisible(true);
	}
	
	public Lab21d()
	{
		components();
	}
	private void components()
	{
		setContentPane(pie);
		JMenuItem item1=new JMenuItem("Red");
		JMenuItem item2=new JMenuItem("Green");
		JMenuItem item3=new JMenuItem("Blue");
		JMenuItem item4=new JMenuItem("Yellow");
		JMenuBar menuBar= new JMenuBar();
		JMenu menu=new JMenu("Colors");
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.add(item4);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	pie.setSliceColor(Color.RED);
            }
		});
		item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	pie.setSliceColor( Color.GREEN);
            }
		});
		item3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	pie.setSliceColor(Color.BLUE);
            }
		});
		item4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	pie.setSliceColor(Color.YELLOW);
            }
		});				
		JPanel top = new JPanel();
		setPreferredSize(new Dimension(400,400));
		add(top,BorderLayout.NORTH);
		pack();
		
	}
}
		
			
	