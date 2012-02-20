package visualization;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.swing.JFrame;

import objects.Fighter;



public class StartFight extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private Container container;
    
    public void startGame(ArrayList<Fighter> fighters)
    {
    	try
    	{
    		//FightRules rules= new FightRules(fighters);
    		//rules.fight();
    		
    		File path  = new File(".\\src\\images\\test.gif");
    		drawFile(path);
    		//BufferedImage img = ImageIO.read(path);
    		//this.setContentPane(new ImagePanel(img,10,0));
    		//this.setTitle("SAF");        
       	}
    	catch(Exception e)
    	{
    		System.err.println(e.getMessage());
    		e.printStackTrace();
    	}
              
               
       // container.add(buttonPanel, BorderLayout.SOUTH);
        setSize(1000, 600);
        setVisible(true);
        
  }
    public void drawFile(File path) 
	{
		try
		{
			BufferedImage img = ImageIO.read(path);
			this.setContentPane(new ImagePanel(img,10,0));
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
			e.printStackTrace();
		}	
	}

}



