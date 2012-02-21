package gui;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MenuButton extends JPanel implements MouseListener {

	private static final long serialVersionUID = 1L;
	private int buttonId;
	private BaseScreen baseScreen;
	private Font font;
	private JLabel label;
	private BufferedImage currentImage;
	private BufferedImage normalImage;
	private BufferedImage activeImage;
	private BufferedImage pressedImage;
	
	public MenuButton(String label, int buttonId, BaseScreen baseScreen) {
		super();
		font = new Font("Calibri", Font.BOLD, 20);
		this.label = new JLabel(label);
		this.label.setBorder(new EmptyBorder(5, 0, 0, 0));
		this.label.setFont(font);
		this.label.setForeground(Color.WHITE);
		this.buttonId = buttonId;
		this.baseScreen = baseScreen;
		
		try {                
			normalImage = ImageIO.read(new File("data\\textures\\interface\\buttonBig.png"));
			activeImage = ImageIO.read(new File("data\\textures\\interface\\buttonBig_active.png"));
			pressedImage = ImageIO.read(new File("data\\textures\\interface\\buttonBig_pressed.png"));
			currentImage = normalImage;
		} catch (IOException ex) {
			currentImage = null;
		}
		
		setPreferredSize(new Dimension(256, 44));
		setMaximumSize(new Dimension(256, 44));
		
		addMouseListener(this);
		setOpaque(false);
		add(this.label);
	}
	
	public void setCurrentImage(BufferedImage image) {
		currentImage = image;
		repaint();
	}
	
	public void setText(String text) {
		this.label.setText(text);
	}
	
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(currentImage, 0, 0, null);
    }

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		setCurrentImage(activeImage);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		setCurrentImage(normalImage);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		setCurrentImage(pressedImage);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		setCurrentImage(normalImage);
		baseScreen.handleButtonPress(buttonId);
	}
	
	
}
