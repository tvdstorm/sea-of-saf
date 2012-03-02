package visualization;

import game.BaseFighter;
import game.Fight;
import game.LeftFighter;
import game.RightFighter;

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
		fight=f;
		
	}

	public void Initialize() throws IOException
	{
		 StdDraw.setCanvasSize(800, 600);
         StdDraw.setXscale(0, 100);
         StdDraw.setYscale(0,100);
         StdDraw.picture(15,15,"./src/images/RightFighter.gif");
         StdDraw.picture(80,15,"./src/images/RightFighter.gif");
	}

	public void startFight() throws IOException 

	{
		Initialize();
		LeftFighter leftFighter=fight.getLeftFighter();
		RightFighter rightFighter=fight.getRightFighter();
		while(true)
		{	StdDraw.clear();
			fight.evaluateCondition();
			String left=updateImageFighter(leftFighter);
			updateLocation(leftFighter);
			System.out.println(leftFighter.getLocationX());
			System.out.println(leftFighter.getLocationY());
			StdDraw.picture(leftFighter.getLocationX(),leftFighter.getLocationY(),left);

			fight.evaluateCondition();
			String right=updateImageFighter(rightFighter);
			updateLocation(rightFighter);
			System.out.println(rightFighter.getLocationX());
			System.out.println(rightFighter.getLocationY());
			StdDraw.picture(rightFighter.getLocationX(),rightFighter.getLocationY(),right);
		}
		
	}

	public String updateImageFighter(BaseFighter f) throws IOException
	{
		Behavior b=f.chooseRandomBehavior();
		Attack a=b.getAttack();
		System.out.println();
		String p=new String();
		try {
			AttacksNames currAttack = AttacksNames.valueOf(a.getAttackName());
			if(f.isLeft())
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
			return p;
		} 
		catch(Exception e){
			e.printStackTrace();
		}
		return p;
		
	}
	public void updateLocation(BaseFighter f)
	{
		Behavior b=f.chooseRandomBehavior();
		Move m=b.getMove();
		try
		{
			MovesNames currMove=MovesNames.valueOf(m.getMoveName());
			if(f.isLeft())
			{
				switch (currMove)
				{	
					case jump:f.setLocation(f.getLocationX(),40);break;
					case crouch:f.setLocation(f.getLocationX(),15);break;
					case stand:f.setLocation(f.getLocationX(),15);break;
					case run_away:f.setLocation(15,15);break;
					case walk_towards:f.setLocation(40,15);break;
					case walk_away:f.setLocation(15,15);break;
					default:f.setLocation(15,15);break;
				 }
			}
			else
			{
				switch (currMove)
				{	
					case jump:f.setLocation(f.getLocationX(),40);break;
					case crouch:f.setLocation(f.getLocationX(),15);break;
					case stand:f.setLocation(f.getLocationX(),15);break;
					case run_away:f.setLocation(60,60);break;
					case walk_towards:f.setLocation(40,15);break;
					case walk_away:f.setLocation(60,15);break;
					default:f.setLocation(60,15);break;
				 }
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
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
