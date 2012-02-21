package safGUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import javax.swing.*;

public class FightAreaComponent extends JComponent{
	private Image lFighterImg, rFighterImg;
	private Point leftPosition, rightPosition; 

	public FightAreaComponent(Image lImg, Point lp, Image rImg, Point rp) {
		lFighterImg = lImg;
		rFighterImg = rImg;
        leftPosition = lp;
        rightPosition = rp;
        
        Dimension dm = getSize();
        setPreferredSize(dm);
    }
    
    public void setLeftFighterImage(Image img)
    {
    	lFighterImg = img;
    }
    
    public void setRightFighterImage(Image img)
    {
    	rFighterImg = img;
    }
    
    public void setLeftFighterPosition(int x, int y)
    {
    	leftPosition.setLocation(x, y);
    }
    
    public void setRightFighterPosition(int x, int y)
    {
    	rightPosition.setLocation(x, y);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(lFighterImg, (int)leftPosition.getX(), (int)leftPosition.getY(), null);
        
        //Horizontally flip fighter image from left side to right side 
        g2d.drawImage(rFighterImg, (int)rightPosition.getX(), (int)rightPosition.getY(), (int)rightPosition.getX()+rFighterImg.getWidth(null), (int)rightPosition.getY()+rFighterImg.getHeight(null), rFighterImg.getWidth(null), 0, 0, rFighterImg.getHeight(null), null);
    }
	
}
