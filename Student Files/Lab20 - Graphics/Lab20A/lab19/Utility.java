
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import java.applet.Applet;
import java.applet.AudioClip;

class Utility
{
	private Utility() {}

    public static BufferedImage loadImage(String imageName)
    {
        try
        {
      		return ImageIO.read(Utility.class.getResource("resources/" + imageName));
		}
	    catch(Exception ioexception) {
	    	JOptionPane.showMessageDialog(null, "Error reading " + imageName + "!", "Utility", JOptionPane.ERROR_MESSAGE);
	    	return null;
	    }
    }

    public static AudioClip loadAudio(String clipName)
    {
    	AudioClip clip = Applet.newAudioClip(Utility.class.getResource("resources/" + clipName));
    	if (clip == null)
    		JOptionPane.showMessageDialog(null, "Error reading " + clipName + "!", "Utility", JOptionPane.ERROR_MESSAGE);
        return clip;
    }
}