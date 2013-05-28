package gui;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MirroredImageIcon extends ImageIcon {

	public MirroredImageIcon(Image image) {
		super(image);
	}

	@Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D)g.create();
    	g2.translate(getIconWidth(), 0);
    	g2.scale(-1, 1);
		super.paintIcon(c, g2, x, y);
	}

	
	
}
