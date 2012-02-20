package common;

public class ActionPair {
	private MoveType m_Action1;
	private ActionType m_Action2;
	public ActionPair(MoveType move, ActionType action2){
		m_Action1=move;
		m_Action2=action2;
	}
	public MoveType getAction1(){
		return m_Action1;
	}
	public ActionType getAction2(){
		return m_Action2;
	}
}
