import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PiePanel extends JPanel
{
	private Color myColor = Color.GRAY;
	
	public PiePanel() {
		setPreferredSize(new Dimension(400, 300));
	}
	
	public void setSliceColor(Color c) {
		myColor = c;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(myColor);
		g.fillArc(100, 50, 200, 200, 45, 90);
		g.setColor(Color.GRAY);
		g.fillArc(100, 60, 200, 200, 135, 270);
	} 
}