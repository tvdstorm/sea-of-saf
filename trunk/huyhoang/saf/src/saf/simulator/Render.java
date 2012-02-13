package saf.simulator;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import javax.imageio.ImageIO;

import saf.interpreter.Arena;
import saf.interpreter.Bot;

public class Render extends Canvas implements Observer {
	private static AffineTransform transform;

	private BufferedImage loadImage(String filename) {
		File file = new File(filename);
		BufferedImage img;
		try {
			img = ImageIO.read(file);
			return img;
		}
		catch (IOException exception) {
			return null;
		}
	}
	
	private BufferedImage getFlippedImage(BufferedImage myImage) {
	    Graphics gb = myImage.getGraphics();
	    gb.drawImage(myImage, 0, 0, null);
	    gb.dispose();

	    AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
	    tx.translate(-myImage.getWidth(null), 0);
	    AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
	    myImage = op.filter(myImage, null);
	    return myImage;
	}

	private void paintBot2(Bot bot, String action) {
		try {
			BufferedImage image = loadImage("/Users/huyhoang/Downloads/SF2HD/Ryu/" + action + ".png");
			Graphics2D g2d = (Graphics2D) this.getGraphics();
			
			if (!bot.isStandingLeft())
				image = getFlippedImage(image);
			
		    g2d.drawImage(image, null, bot.getPosition() * 75, 300 - image.getHeight());
		}
		catch (Exception ex) {
			System.out.println("action:" + action);
		}
	}	
	
	@Override
	public void update(Observable arg0, Object arg1) {
		this.getGraphics().fillRect(0, 0, 1024, 768);
		
		for (Bot bot : ((Arena)arg0).getBots()) {
			paintBot2(bot, bot.getLastAction());
		}
	}
}
