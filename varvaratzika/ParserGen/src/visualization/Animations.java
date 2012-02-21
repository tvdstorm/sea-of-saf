package visualization;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JFrame;

import objects.AttacksNames;
import objects.Condition;
import objects.Fighter;


public class Animations extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JFrame frame = new JFrame("Saf");
	private boolean isLeft = true;

	public void Initialize() throws IOException
	{
		frame.setBackground(Color.white);
		frame.setSize(800, 600);
	    frame.setVisible(true);
	 	File leftFile=new File("./src/images/LeftFighter.gif");
	 	File rightFile=new File("./src/images/RightFighter.gif");
	 	JPanel left=createContentPane(leftFile,15,350);
	    frame.setContentPane(left);
	    JPanel right =createContentPane(rightFile,600,350);
	    frame.setContentPane(right);
	}

	
	public void refreshFrame(Fighter leftFighter,Fighter rightFighter) throws IOException 
	{
		JFrame hframe = new JFrame("Saf");
		hframe.setBackground(Color.white);
		JPanel left=createFighterFigures(leftFighter);
		JPanel right=createFighterFigures(rightFighter);
	    hframe.setContentPane(left);
	    hframe.setContentPane(right);
	    hframe.removeAll();
	}


	public JPanel createFighterFigures(Fighter f) throws IOException
	{
		JPanel fighterPanel = new JPanel();
		fighterPanel.setLayout(null);
	   	BufferedImage myPicture = ImageIO.read(
	   			updateImageFile(
	   					f.getCurrentCondition().getAttacksName()
	   			)
	   	);
		JLabel picLabel = new JLabel(new ImageIcon( myPicture ));
		picLabel.setBounds(0, 0, 161, 195);
		picLabel.setBackground(Color.cyan);
		fighterPanel.setBounds(f.getLocationX(),f.getLocationY(), 200, 200);
		fighterPanel.add( picLabel );
		fighterPanel.setOpaque(true);
		return fighterPanel;
		
	}
	
	public File updateImageFile(String attacksName)
	{
    		int i=(int) (Math.random()*6);
			if (i==0) attacksName="punch_low";
			else if (i==1) attacksName="punch_high";
			else if (i==2) attacksName="kick_low";
			else if (i==3) attacksName="kick_high";
			else if (i==4) attacksName="block_low";
			else if (i==5) attacksName="block_high";
			else attacksName="block_high";
	
		try {
			
		AttacksNames currAttack = AttacksNames.valueOf(attacksName);
		
		String p=new String();
		if(this.isLeft)
		{
			switch (currAttack)
			{	
				case punch_low:p="./src/images/LeftPunchLow.gif";
				case punch_high:p="./src/images/LeftPunchHigh.gif";
				case kick_low:p="./src/images/LeftKickLow.gif";
				case kick_high:p="./src/images/LeftKickHigh.gif";
				case block_low:p="./src/images/LeftBlockLow.gif";
				case block_high:p="./src/images/LeftBlockHigh.gif";
				default:p="./src/images/LeftFighter.gif";
			 }
		}
		else
		{
			switch (currAttack)
			{	
				case punch_low:p="./src/images/RightPunchLow.gif";
				case punch_high:p="./src/images/RightPunchHigh.gif";
				case kick_low:p="./src/images/RightKickLow.gif";
				case kick_high:p="./src/images/RightKickHigh.gif";
				case block_low:p="./src/images/RightBlockLow.gif";
				case block_high:p="./src/images/RightBlockHigh.gif";
				default:p="./src/images/RightFighter.gif";
			 }			
		}
		File path=new File(p);
		return path;
		} catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}


	public JPanel createContentPane(File imagePath,int x,int y) throws IOException
	{
		JPanel left = new JPanel();
		left.setLayout(null);
	   	BufferedImage myPicture = ImageIO.read(imagePath);
		JLabel picLabel = new JLabel(new ImageIcon( myPicture ));
		picLabel.setBounds(0, 0, 161, 195);
		picLabel.setBackground(Color.cyan);
		left.setBounds(x, y, 200, 200);
		//left.setBackground(Color.BLACK);
		left.add( picLabel );
	    left.setOpaque(true);
        return left; 
    }

}
