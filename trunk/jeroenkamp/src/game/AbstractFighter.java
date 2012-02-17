package game;

import java.util.List;

import common.*;

public abstract class AbstractFighter {
	protected int m_PunchPower=5;
	protected int m_PunchReach=5;
	protected int m_KickPower=5;
	protected int m_KickReach=5;
	
	private int m_Health;
	
	private AbstractFighter m_Opponent;
	
	
	
	public AbstractFighter(){
		
		
	}
	public void setOpponent(AbstractFighter fighter){
		m_Opponent=fighter;
	}
	public abstract List<ActionPair> doSomething();
	
	public boolean isNear(){
		return false;
	}
	public boolean isFar(){
		return false;
	}
	public boolean isWeaker(){
		return false;
	}
	public boolean isMuchWeaker(){
		return false;
	}
	public boolean isStronger(){
		return false;
	}
	public boolean isMuchStronger(){
		return false;
	}
	public ActionType choose(ActionType action1,ActionType action2){
		if(Math.random()>0.5){
			return action1;
		}
		return action2;
	}
}
