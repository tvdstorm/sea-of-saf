package graphic;

import game.FighterStatus;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class FighterPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	private FighterStatus fighterStatus;

	public FighterPanel() {
		try {                
			this.image = ImageIO.read(ArenaConfiguration.relaxed);	
		} 
		catch (IOException exception) {

		}
	}

	public void SetImage(File file) {
		try {                
			this.image = ImageIO.read(file);
		} 
		catch (IOException exception) {

		}
	}

	public void SetFighterStatus(FighterStatus fighterStatus) {
		this.fighterStatus=fighterStatus; 
	}

	public FighterStatus getFighterStatus() { 
		return this.fighterStatus;
	}

	public BufferedImage getImage() { 
		return this.image;
	}

	public void updateStatus(FighterStatus fighterStatus){
		this.fighterStatus = fighterStatus;
	} 

	public FighterStatus getStatus(){
		return this.fighterStatus;
	}

}
