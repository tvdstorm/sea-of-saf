package game.graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JPanel;

public class SAFFighterNormal extends JPanel {
	
	private int distanceHorizontal;
	private int distanceVertical;
	private String botName;
	private Graphics2D graphics;

	private final int HEIGHT = 500;
	private final int WIDTH = 250;
	
	public SAFFighterNormal(String botName, int distanceHorizontal, int distanceVertical) 
	{
		this.botName = botName;
		this.distanceHorizontal = distanceHorizontal;
		this.distanceVertical = distanceVertical;

		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
	
	public void paint(Graphics g) {
		graphics = (Graphics2D) g;
		graphics.clearRect(0,  0 , WIDTH, HEIGHT);
		
		graphics.setStroke(new BasicStroke(2.0f));
		Shape circle = new Ellipse2D.Float(100.0f + distanceHorizontal, 100.0f + distanceVertical, 100.0f, 100.0f);
		graphics.draw(circle);
		
		graphics.drawString(botName, 120 + distanceHorizontal, 150 + distanceVertical);

		graphics.drawLine(150 + distanceHorizontal,200,150 + distanceHorizontal,300); //spine

		graphics.drawLine(150 + distanceHorizontal,300,100 + distanceHorizontal,350); //left foot
		graphics.drawLine(150 + distanceHorizontal,300,200 + distanceHorizontal,350); //right foot
		graphics.drawLine(150 + distanceHorizontal,230,110 + distanceHorizontal,230); //left arm
		graphics.drawLine(150 + distanceHorizontal,230,190 + distanceHorizontal,230); //right arm
	}
}
