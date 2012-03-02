package visualization;

import game.Fight;
import game.LeftFighter;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JFrame;

import objects.*;



public class Animations extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private Fight fight;
	private boolean isLeft;
	
	public Animations(Fight f)
	{
		frame = new JFrame("Saf");
		fight=new Fight();
		isLeft=false;
		fight=f;
	}

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

	
/*	public void refreshFrame(Fighter leftFighter,Fighter rightFighter) throws IOException 
	{
		JFrame hframe = new JFrame("Saf");
		hframe.setBackground(Color.white);
		JPanel left=createFighterFigures(leftFighter);
		JPanel right=createFighterFigures(rightFighter);
	    hframe.setContentPane(left);
	    hframe.setContentPane(right);
	    hframe.removeAll();
	}
*/

	public JPanel createFighterFigures(LeftFighter f) throws IOException
	{
		JPanel fighterPanel = new JPanel();
		fighterPanel.setLayout(null);
		Behavior b=f.chooseRandomBehavior();
		Move m=b.getMove();
		Attack a=b.getAttack();
		System.out.println();
		System.out.println(updateImageFile(m.getMoveName()));
	   	BufferedImage myPicture = ImageIO.read(
	   			updateImageFile(a.getAttackName())
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
		assert attacksName != "" : "stringIsEmpty";
		String p=new String();

		try {
			AttacksNames currAttack = AttacksNames.valueOf(attacksName);
			if(this.isLeft)
			{
				System.out.println(currAttack);
				switch (currAttack)
				{	
					case punch_low:p="./src/images/LeftPunchLow.gif";break;
					case punch_high:p="./src/images/LeftPunchHigh.gif";break;
					case kick_low:p="./src/images/LeftKickLow.gif";break;
					case kick_high:p="./src/images/LeftKickHigh.gif";break;
					case block_low:p="./src/images/LeftBlockLow.gif";break;
					case block_high:p="./src/images/LeftBlockHigh.gif";break;
					default:p="./src/images/LeftFighter.gif";break;
				}
			}
			else
			{
				System.out.println(currAttack);
				switch (currAttack)
				{	
					case punch_low:p="./src/images/RightPunchLow.gif";break;
					case punch_high:p="./src/images/RightPunchHigh.gif";break;
					case kick_low:p="./src/images/RightKickLow.gif";break;
					case kick_high:p="./src/images/RightKickHigh.gif";break;
					case block_low:p="./src/images/RightBlockLow.gif";break;
					case block_high:p="./src/images/RightBlockHigh.gif";break;
					default:p="./src/images/RightFighter.gif";break;
				 }			
			}
			File path=new File(p);
			return path;
		} 
		catch(Exception e){
			e.printStackTrace();
		}
		return new File(p="./src/images/LeftFighter.gif");
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
