package saf.compiler.types;

public class ChooseMoveAction extends IMoveAction{
	private IMoveAction m_Action1;
	private IMoveAction m_Action2;
	public ChooseMoveAction(IMoveAction action1, IMoveAction action2){
		m_Action1=action1;
		m_Action2=action2;
	}
	@Override
	public String toJavaCode(){
		return "choose("+m_Action1.toJavaCode()+","+m_Action2.toJavaCode()+")";
	}
}

