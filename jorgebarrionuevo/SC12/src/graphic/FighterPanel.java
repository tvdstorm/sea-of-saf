package graphic;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FighterPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private BufferedImage image;

    public void SetImage(File file) {
       try {                
          this.image = ImageIO.read(file);
       } 
       catch (IOException exception) {
            
       }
    }

}
