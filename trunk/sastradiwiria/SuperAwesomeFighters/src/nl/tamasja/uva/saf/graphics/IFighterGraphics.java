package nl.tamasja.uva.saf.graphics;

import java.awt.Graphics;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Attack;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Move;

public interface IFighterGraphics {
	
	
	public void draw(Graphics g,FighterBot fighter);
	
	public void setMove(Move move);
	public void setAttack(Attack attack);
	
	public void drawBody();
	
	public void setJump(boolean jumping);
	public void setCrouch(boolean crouching);
	
	public void armNormal();
	public void armBlockHigh();
	public void armBlockLow();
	
	public void armPunchHigh(int range);
	public void armPunchLow(int range);
	
	public void legNormal();
	
	public void legKickHigh(int range);
	public void legKickLow(int range);

	public void move(int move);
	
	public void setDirection(int direction);
	
	public int getWidth();
	
	public void isHit(boolean status);

}
