package gui;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageLoaderTest {
	
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		Image image = ImageLoader.getInstance().getImage("run_away", "kick_high");
		ImageIcon icon = new ImageIcon(image);
		label.setIcon(icon);
		frame.setLayout(new FlowLayout());
		frame.add(label);
		frame.setVisible(true);
	}

}
