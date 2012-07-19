package graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class FighterPanel extends JLayeredPane {
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	int x, y;
	private String direction;
	private JLabel fighterNameLabel; 
	private String fighterName;
	private JPanel nameLabel;
	private JProgressBar statusBar;
	
	public FighterPanel(String dir, String fighterName) {
		statusBar = new JProgressBar();
		nameLabel = new JPanel();
		fighterNameLabel = new JLabel();
		y=200;
		fighterNameLabel.setText(fighterName);
		statusBar.add(fighterNameLabel, BorderLayout.NORTH);
		statusBar.setValue(0);
		statusBar.setStringPainted(true);
		statusBar.setBackground(Color.RED);
		statusBar.setForeground(Color.GREEN);
		statusBar.setOrientation(JProgressBar.VERTICAL);
		statusBar.setString(fighterName);
		statusBar.setStringPainted(false);
		nameLabel.add(fighterNameLabel);
		nameLabel.setOpaque(false);
		add(statusBar,1);
		add(nameLabel,2);
		if (dir.equals("LEFT")){
			setAlignmentX(LEFT_ALIGNMENT);
			x=600;
			direction = "LEFT";
			statusBar.setBounds(200, 0, 20, 100);
			nameLabel.setBounds(this.x, this.y, 70, 200);		
			setImage(ArenaConfiguration.relaxedL);
		}
		if (dir.equals("RIGHT")){
			setAlignmentX(RIGHT_ALIGNMENT);
			x=660;
			direction = "RIGHT";
			statusBar.setBounds(1000, 0, 20, 100);
			nameLabel.setBounds(this.x, this.y, 120, 200);
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
			this.x = x-31;
			nameLabel.setLocation(x-28,170 );
		}
		if (this.direction.equals("RIGHT")){
			this.x = x+31;
			nameLabel.setLocation(x+28,170 );
		}
		nameLabel.repaint();	
		this.repaint();
	}
	public BufferedImage getImage() { 
		return this.image;
	}
	public String getFighterName() {
		return fighterName;
	}
	public void setFighterName(String fighterName) {
		this.fighterName = fighterName;
	}
	public void updateBar(double energyValue){
		this.statusBar.setValue((int) energyValue);
	}
}