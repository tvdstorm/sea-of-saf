package nl.tamasja.uva.saf.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.text.DecimalFormat;

import org.antlr.gunit.JUnitCodeGen;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Attack;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Move;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Strength;
import nl.tamasja.uva.saf.fighter.actions.ActionBlockHigh;
import nl.tamasja.uva.saf.fighter.actions.ActionBlockLow;
import nl.tamasja.uva.saf.fighter.actions.ActionCrouch;
import nl.tamasja.uva.saf.fighter.actions.ActionJump;
import nl.tamasja.uva.saf.fighter.actions.ActionPunchHigh;
import nl.tamasja.uva.saf.fighter.actions.ActionPunchLow;
import nl.tamasja.uva.saf.fighter.actions.ActionStand;

public class DrawFighter implements IFighterGraphics {
	
	
	private int x;
	private int y;
	
	private int headSize = 50;
	
	private int xCenter;
	
	private int bodyHeight = 50;
	
	private int direction = 1;
	
	private Color color;
	
	private int fighterBodyHight = 50;
	private int fighterY;
	
	private boolean test = false;
	
	private int width = 55;
	Graphics g;
	
	private Move move;
	private Attack attack;
	
	private int armConnectionOffset = 7;
	
	private Color defaultColor = Color.black;
	private Color hitColor = Color.red;
	private Color drawColor;
	private boolean isHit = false;
	
	public DrawFighter(int y) {
		//this.x = x;
		this.y = y;

		//if(flipDirection) this.direction = -this.direction;
		
		this.fighterY = y;
		
		this.xCenter = (headSize/2); 

		this.drawColor = this.defaultColor;
		
	}
	
	@Override
	public void draw(Graphics g, FighterBot fighter) {
		this.g = g;
		
		g.setColor(drawColor);
		setMovementHeight(move);
		drawBody();
		
		int armReach = Math.min(fighter.getDistance(), fighter.getStat(Strength.PUNCH_REACH));
		int legReach = Math.min(fighter.getDistance(), fighter.getStat(Strength.KICK_REACH));
		
		drawArms(attack,armReach);
		drawLegs(attack,legReach);
		
		//name
		//g.drawString(fighter.getName(), x+5, y+(headSize/2));		
		
		drawStringCenter(g,fighter.getName(), x, y-20);
		
		drawStringCenter(g,"P"+fighter.getPosition(), x, fighterY+2*fighterBodyHight+headSize+10);
		
		//int maxRectWidth = 50;
		//int maxHealth = 100;
		int currentHealth = fighter.getHealth();
		//int maxHealth = 100;
		int maxRectWidth = 50;
		int rectWidth = fighter.getHealth()/2;
		
		if(currentHealth > 60) {
		g.setColor(Color.green);
		} else if(currentHealth > 30) {
			g.setColor(Color.orange);
		} else {
			g.setColor(Color.red);
		}
		
		g.fillRect(x + ((maxRectWidth - rectWidth)/2), y-17, rectWidth, 15);
		g.setColor(Color.black);
		drawStringCenter(g,fighter.getHealth()+"HP", x, y-5);
		
		DecimalFormat twoDigit = new DecimalFormat("#,##0.00");
		
		//Cooldown
		drawStringCenter(g,""+twoDigit.format(fighter.getCooldown()), x, fighterY+2*fighterBodyHight+headSize+25);
		drawStringCenter(g,""+move, x, fighterY+2*fighterBodyHight+headSize+40);
		drawStringCenter(g,""+attack, x, fighterY+2*fighterBodyHight+headSize+55);
		
		
		
	}
	
	private void drawStringCenter(Graphics g, String s,int x, int y) {
		int stringLen = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();
		int start = width/2 - stringLen/2;
		 g.drawString(s, start + x, y);
	}
	
	private void fillRectCenter(Graphics g, int x, int y, int width, int height) {
		
		//g.fillRect(x+15, y-15, maxRectWidth-30, 10);
	}
	
	
	
	protected void setMovementHeight(Move move) {
		y = fighterY;
		setJump(move == Move.JUMP);
		setCrouch(move == Move.CROUCH);
	}
	
	protected void drawArms(Attack attack, int reach) {
		if(attack != null) {
			switch(attack) {
				case PUNCH_LOW: armPunchLow(reach); break;
				case PUNCH_HIGH: armPunchHigh(reach); break;
				
				case BLOCK_LOW: armBlockLow(); break;
				case BLOCK_HIGH: armBlockHigh(); break;
				
				default: armNormal();
			}
		} else {
			armNormal();
		}
		//other arm
		g.drawLine(x+xCenter, y+headSize+armConnectionOffset, x+xCenter-10*direction, y+headSize+40);
	}
	
	protected void drawLegs(Attack attack, int reach) {
		if(attack != null) {
			switch(attack) {
				case KICK_LOW: legKickLow(reach); break;
				case KICK_HIGH: legKickHigh(reach); break;
		
				default: legNormal();
			}
		} else {
			legNormal();
		}
		//other leg
		g.drawLine(x+xCenter,y+bodyHeight+headSize,x+xCenter-(headSize/3)*direction,y+bodyHeight+40+headSize);
	}
	
	public void drawBody() {
		
		//head
		g.drawOval(x, y, headSize, headSize);
		
		//body
		g.drawLine(x+xCenter, y+headSize, x+xCenter, y+bodyHeight+headSize);

	}
	
	public void move(int movement) {
		//x = x + (movement * direction);
		x = movement;
	}
	
	public void setJump(boolean jumping) {
		if(jumping) {
			y = fighterY - fighterY/3;
		}
		
	}

	public void setCrouch(boolean crouching) {
		if(crouching) {
			bodyHeight = fighterBodyHight/2;
			y = y+fighterBodyHight/2;
		} else {
			bodyHeight = fighterBodyHight;
		}		
	}
	
	// Arm
	public void armNormal() {
		g.drawLine(x+xCenter, y+headSize+20, x+xCenter+10*direction, y+headSize+40);
	}
	
	public void armBlockHigh() {
		armBlock(g,20);
	}
	

	public void armBlockLow() {
		armBlock(g,50);
	}
	
	protected void armBlock(Graphics g,int height) {
		int offset = 15+ (direction < 0 ? 10:0);
		g.drawLine(x+xCenter, y+headSize+armConnectionOffset, x+xCenter+15*direction, y+headSize+height);
		g.setColor(Color.green);
		g.fillRect(x+xCenter+offset*direction, 5+y+headSize+height-20, 10, 30);
		g.setColor(drawColor);
		g.drawRect(x+xCenter+offset*direction, 5+y+headSize+height-20, 10, 30);
	}
	
	public void armPunchHigh(int reach) {
		armPunch(g,reach,-20);
	}
	
	public void armPunchLow(int reach) {
		armPunch(g,reach,50);
	}
	
	protected void armPunch(Graphics g, int reach, int height) {
		
		int reachLength = (reach*width)-10;
		int offset =  reachLength + (direction < 0 ? 10:0);
		
		g.drawLine(x+xCenter, y+headSize+armConnectionOffset, x+xCenter+ reachLength * direction, y+headSize+height+armConnectionOffset);
		g.drawOval(x+xCenter+ offset * direction, y+headSize+height-5+armConnectionOffset, 10, 10);
		
		g.setColor(Color.orange);
		g.fillOval(x+xCenter+ offset * direction, y+headSize+height-5+armConnectionOffset, 10, 10);
		g.setColor(drawColor);
	}
	
	// Leg
	public void legNormal() {
		g.drawLine(x+xCenter,y+bodyHeight+headSize,x+xCenter+(headSize/3)*direction,y+bodyHeight+40+headSize);
	}

	public void legKickHigh(int reach) {
		legKick(g,reach,-40);
	}
	
	public void legKickLow(int reach) {
		legKick(g,reach,0);
		
	}
	
	protected void legKick(Graphics g, int reach, int height) {
		int reachLength = reach*width;
		int offset =  reachLength + (direction < 0 ? 10:0);
		g.drawLine(x+xCenter,y+bodyHeight+headSize,x+xCenter+ (((headSize/3)+reachLength)*direction)  ,y+bodyHeight+headSize+height);
		
		g.drawOval(x+xCenter+ (((headSize/3)+offset)*direction)  ,y+bodyHeight+headSize+height-5,10,10);
		g.setColor(Color.orange);
		g.fillOval(x+xCenter+ (((headSize/3)+offset)*direction)  ,y+bodyHeight+headSize+height-5,10,10);
		
		g.setColor(drawColor);
	}

	@Override
	public void setMove(Move move) {
		this.move = move;
		
	}

	@Override
	public void setAttack(Attack attack) {
		this.attack = attack;
		
	}

	@Override
	public void setDirection(int direction) {
		this.direction = direction;
		
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	@Override
	public void isHit(boolean status) {
		this.isHit = status;
		
		drawColor = isHit ? hitColor : defaultColor;
		
	}


	

}
