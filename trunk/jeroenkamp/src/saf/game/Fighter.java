package saf.game;

import java.util.*;

import saf.common.ActionPair;
import saf.common.ActionType;
import saf.common.MoveType;
import saf.ui.IFighter;


public abstract class Fighter implements IFighter {
	private int m_Position;
	private int m_Health;
	private int m_Speed;
	private int m_MaxHealth;
	
	private Fighter m_Opponent;
	
	private MoveType m_MoveState;
	private ActionType m_ActionType;
	
	protected int m_PunchPower=5;
	protected int m_PunchReach=5;
	protected int m_KickPower=5;
	protected int m_KickReach=5;
	protected String m_Name="Unknown";
	
	private final int FACTOR=2;
	
	public Fighter(){
	}
	public void init(int position,Fighter opponent){
		//the predefined formula dosen't make sense
		m_Speed=(int)Math.abs(0.5*((m_PunchPower+m_KickPower)-(m_PunchReach+m_KickReach)));
		m_MaxHealth=100;
		m_Health=m_MaxHealth;
		m_Position=position;
		m_Opponent=opponent;
		m_MoveState=MoveType.stand;
		m_ActionType=ActionType.block_high;
	}
	
	public abstract List<ActionPair> doSomething();
	public int getPosition(){
		return m_Position;
	}
	public int getHealth(){
		return m_Health;
	}
	public int getSpeed(){
		return m_Speed;
	}
	public void setHealth(int health){
		m_Health=health;
	}
	public int getMaxHealth(){
		return m_MaxHealth;
	}
	public MoveType getMoveState(){
		return m_MoveState;
	}
	public void setMoveState(MoveType state){
		m_MoveState=state;
	}
	public ActionType getActionState(){
		return m_ActionType;
	}
	public void setActionState(ActionType state){
		m_ActionType=state;
	}
	public void act(){
		List<ActionPair> actions=doSomething();
		int choice=(int) (Math.random()*actions.size());
		ActionPair move=actions.get(choice);
		Move.doAction(this, move, m_Opponent);
	}
	public void setPosition(int newPos){
		m_Position= newPos;
	}
	public boolean isNear(){
		int res =Math.abs(getPosition()-m_Opponent.getPosition());
		if(res<m_PunchReach || res<m_KickReach){
			return true;
		}
		return false;
	}
	public boolean isFar(Fighter f,Fighter opponent){
		int res =Math.abs(getPosition()-m_Opponent.getPosition());
		if(res>m_PunchReach || res>m_KickReach){
			return true;
		}
		return false;
	}
	public boolean isWeaker(){
		return m_Health<m_Opponent.getHealth();
	}
	public boolean isMuchWeaker(){
		return m_Health*FACTOR<m_Opponent.getHealth();
	}
	public boolean isStronger(){
		return m_Health>m_Opponent.getHealth();
	}
	public boolean isMuchStronger(){
		return m_Health>m_Opponent.getHealth()*FACTOR;
	}
	public <T> T choose(T action1,T action2){
		if(Math.random()>0.5){
			return action1;
		}
		return action2;
	}
	public int getPunchPower(){
		return m_PunchPower;
	}
	public int getKickPower(){
		return m_KickPower;
	}
	public int getPunchReach(){
		return m_PunchReach;
	}
	public int getKickReach(){
		return m_KickReach;
	}
	public String getName(){
		return m_Name;
	}
}
