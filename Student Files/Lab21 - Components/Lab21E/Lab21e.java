
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab21e extends JFrame
{
	
		JButton a=new JButton();
		JButton b=new JButton();
		JButton c=new JButton();
	public CannonPanel cannon=new CannonPanel();
	public static void main (String[] args) {
	new Lab21e().setVisible(true);
	}
	public Lab21e()
	{
		lala();
	}
	private void lala()
	{
		add(cannon, BorderLayout.CENTER);
		a.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        	cannon.turnLeft();
        }
		});
		b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        	cannon.turnRight();
        }
		});
		c.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        	cannon.fire();
        }
		});
		JToolBar bar=new JToolBar();
		JPanel top=new JPanel();
		a.setIcon(new ImageIcon(Utility.loadImage("left.png")));
		b.setIcon(new ImageIcon(Utility.loadImage("right.png")));
		c.setIcon(new ImageIcon(Utility.loadImage("fire.png")));
		bar.add(a);
		bar.add(b);
		bar.add(c);
		add(bar, BorderLayout.NORTH);
		setSize(500,500);
	
		
	}
}