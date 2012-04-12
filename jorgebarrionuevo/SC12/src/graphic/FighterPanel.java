package graphic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class FighterPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	int x, y;
	String direction;

	public FighterPanel(String dir) {

		y=200;
		this.setBackground(Color.WHITE);
		if (dir.equals("LEFT")){
			this.x=200;
			this.direction = "LEFT";
			setImage(ArenaConfiguration.relaxedL);
		}
		if (dir.equals("RIGHT")){
			this.x=400;
			this.direction = "RIGHT";
			setImage(ArenaConfiguration.relaxedR);
		}
	}


	public void setImage(File file){
		try {
			this.image = ImageIO.read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(this.image, x, y, this);
	}

	public void updateXPosition(int x){
		if (this.direction.equals("LEFT")){
			this.x = x-22;
		}
		if (this.direction.equals("RIGHT")){
			this.x = x+22;
		}
		this.repaint();
	}

	public BufferedImage getImage() { 
		return this.image;
	}

}

