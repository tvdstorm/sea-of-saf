package saf.simulator;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.imageio.ImageIO;
import saf.interpreter.Game;
import saf.interpreter.Bot;

public class Render extends Canvas implements Observer {
	/**
	 * 
	 */
	private static AffineTransform transform;
	private List<Bot> botsToDraw = new ArrayList<Bot>();

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
	
	public void paint(Graphics g) {
	    int width = getWidth();
	    int height = getHeight();
	    g.setColor(Color.black);
	    g.fillRect(0, 0, width, height);

	    for (Bot bot: this.botsToDraw) {
			paintBot2(bot, bot.getLastState());
			paintHitpointBars(bot);
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
	
	private void paintHitpointBars(Bot bot) {
		Graphics2D g2d = (Graphics2D) this.getGraphics();
		
		int x = (bot.isStandingLeft() ? 10 : this.getWidth() - 110);
		
		g2d.setColor(Color.green);
		g2d.setStroke(new BasicStroke(3));
		g2d.drawRect(x, 10, 100, 20);
		
		g2d.setColor(new Color(0, 200, 0));
		g2d.fillRect(x + 2, 12, bot.getHitpoints() - 3, 17);
		
		g2d.drawString(bot.getFighter().getName(), x, 50);
	}
	
	private void paintBot2(Bot bot, String action) {
		try {
			BufferedImage image = loadImage("/Users/huyhoang/Downloads/SF2HD/Ryu/" + action + ".png");
			Graphics2D g2d = (Graphics2D) this.getGraphics();
			
			if (!bot.isStandingLeft())
				image = getFlippedImage(image);
			
		    g2d.drawImage(image, null, bot.getPosition() * 60, this.getHeight() - image.getHeight());
		}
		catch (Exception ex) {
		}
	}	
	
	@Override
	public void update(Observable arg0, Object arg1) {
		for (Bot bot : ((Game)arg0).getBots()) {
			if (!this.botsToDraw.contains(bot)) {
				this.botsToDraw.add(bot);
			}
		}
		this.repaint();
	}
}
