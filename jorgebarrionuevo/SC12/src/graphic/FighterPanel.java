package graphic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class FighterPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private BufferedImage image;

	public FighterPanel() {
		try {                
			this.image = ImageIO.read(ArenaConfiguration.relaxed);	
		} 
		catch (IOException exception) {

		}
	}

	public void SetImage(File file) {
		System.out.println("SetImage()!!!!!!!!!!!!!!!!!!!!!!!!!!");
		try {
			System.out.println("image is " + file.getAbsolutePath() + file.getName());
			this.image = ImageIO.read(file);
			
		} 
		catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
	}

	public BufferedImage getImage() { 
		return this.image;
	}

}
