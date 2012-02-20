package visualization;

import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.swing.JFrame;


public class Animations extends JFrame 
{
	public void Initialize()
	{
		 JFrame frame = new JFrame("Saf");
		 frame.setSize(1000, 600);
	     frame.setVisible(true);
	     Animations demo = new Animations();
	     frame.setContentPane(demo.createContentPane());
	}
	
	public JPanel createContentPane()
	{
		JPanel background = new JPanel();
		//background.setLayout(null);
	    File path1  = new File(".\\src\\images\\LeftFighter.gif");
	    background.add(drawFile(path1,100,10));
	    //File path2  = new File(".\\src\\images\\RightFighter.gif");
	    //background.add(drawFile(path2,200,10));
	    background.setOpaque(true);
        return background; 
    }

	public Component drawFile(File imageFile, int locX, int locY) 
	{
		try
		{
			BufferedImage img = ImageIO.read(imageFile);
			this.setContentPane(new ImagePanel(img,locX,locY));
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return rootPane;
	}
	
}
