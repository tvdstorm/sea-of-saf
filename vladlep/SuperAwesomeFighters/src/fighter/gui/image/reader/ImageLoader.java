package fighter.gui.image.reader;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import fighter.gui.MessageReporter;
import fighter.messages.Error;

public class ImageLoader {

	private final static String PATH_PICS = "./pics/";
	private final static String EXTENSION = ".png";

	public static BufferedImage loadImage(String imageName) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(PATH_PICS + imageName + EXTENSION));
		} catch (Exception e) {
			MessageReporter.reportMessages(new Error(imageName + EXTENSION
					+ ";  " + e.toString()));
			System.exit(-1);
		}
		return img;
	}
}
