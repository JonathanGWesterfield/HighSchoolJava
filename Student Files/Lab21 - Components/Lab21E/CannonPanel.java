import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.applet.AudioClip;

/*
 * CannonPanel.java
 * Created on Aug 10, 2011, 8:24:20 AM
 * @author John Spicer
 */
public class CannonPanel extends javax.swing.JPanel {

    public static final byte RIGHT = 0;
    public static final byte LEFT = 1;
    private AudioClip fire = Utility.loadAudio("fire.wav");
    private BufferedImage cannon = Utility.loadImage("cannon.png");
    private BufferedImage ball = Utility.loadImage("ball.png");
    private Point ballLoc = new Point(0, 76);
    private boolean showBall = false;
    private int cannonDir = RIGHT;
    private int ballDir = RIGHT;
    private Timer timer;
    
    /** Creates new form CannonPanel */
    public CannonPanel() {
        setBackground(Color.WHITE);
        setLayout(null);
        setPreferredSize(new Dimension(500, 250));
        timer = new Timer(30, new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               if (ballDir == RIGHT)
               {
                   ballLoc.x += 8;
                   if (ballLoc.x > getWidth())
                   {
                       showBall = false;
                       CannonPanel.this.timer.stop();
                   }
               }
               else
               {
                   ballLoc.x -= 8;
                   if (ballLoc.x < -ball.getWidth())
                   {
                       showBall = false;
                       CannonPanel.this.timer.stop();
                   }
               }
               CannonPanel.this.repaint();
           } 
        
        });
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (cannonDir == RIGHT)
            g.drawImage(cannon, 120, 60, null);
        else
        {
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(cannon, Utility.rotateImage(cannon.getWidth()), 120, 60);
        }
        if (showBall)
            g.drawImage(ball, ballLoc.x, ballLoc.y, null);
        
    }
    
    public void turnLeft() {
        cannonDir = LEFT;
        repaint();
    }
    
    public void turnRight() {
        cannonDir = RIGHT;
        repaint();
    }
    
    public void fire() {
        if (!showBall)
        {
            fire.play();
            ballDir = cannonDir;
            if (ballDir == RIGHT)
                ballLoc.x = 340;
            else
                ballLoc.x = 116;
            showBall = true;
            timer.start();
        }
    }
}