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
	private long endTime;
		
	public Animations(Fight f)
	{
		frame = new JFrame("Saf");
		fight=new Fight();
		fight=f;
		this.endTime = (System.currentTimeMillis() / 1000) + 10;
		
	}

	public void Initialize() throws IOException
	{
		 StdDraw.setCanvasSize(800, 600);
         StdDraw.setXscale(0, 100);
         StdDraw.setYscale(0,100);
         StdDraw.picture(15,15,"./src/images/RightFighter.gif");
         StdDraw.picture(80,15,"./src/images/RightFighter.gif");
	}

	public void startFight() throws IOException, InterruptedException 

	{
		Initialize();
		LeftFighter leftFighter=fight.getLeftFighter();
		RightFighter rightFighter=fight.getRightFighter();
		
		while((leftFighter.getLife()>0) && (rightFighter.getLife()>0) && (countDown()>0))
		{	
			System.out.println(countDown());
			Thread.sleep(100);
			StdDraw.clear();
			fight.evaluateCondition();
			String left=updateImageFighter(leftFighter);
			leftFighter.updateLocation(leftFighter);
			leftFighter.updateLife(rightFighter);
			StdDraw.picture(leftFighter.getLocationX(),leftFighter.getLocationY(),left);

			fight.evaluateCondition();
			String right=updateImageFighter(rightFighter);
			rightFighter.updateLocation(rightFighter);
			rightFighter.updateLife(leftFighter);
			StdDraw.picture(rightFighter.getLocationX(),rightFighter.getLocationY(),right);
		}
		StdDraw.clear();
		if(countDown() <= 0)
		{
			StdDraw.picture(60,50,"./src/images/timeOver.gif");
		}
		else
		{
			if(leftFighter.getLife()>0)
			{
				StdDraw.picture(35,15,"./src/images/leftDied.gif");
				StdDraw.picture(60,15,"./src/images/rightWinner.gif");
			}
			else
			{
				StdDraw.picture(60,15,"./src/images/rightDied.gif");
				StdDraw.picture(35,15,"./src/images/leftWinner.gif");
			}
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
	public long countDown(){return endTime -(System.currentTimeMillis() / 1000); }
}
