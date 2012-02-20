package compiler.types;

public class ChooseMoveAction extends IMoveAction{
	IMoveAction m_Action1;
	IMoveAction m_Action2;
	public ChooseMoveAction(SafObject action1, SafObject action2){
		m_Action1=(IMoveAction)action1;
		m_Action2=(IMoveAction)action2;
	}
	public String toJavaCode(){
		return "choose("+m_Action1.toJavaCode()+","+m_Action2.toJavaCode()+")";
	}
}

