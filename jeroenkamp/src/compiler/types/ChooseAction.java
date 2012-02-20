package compiler.types;

public class ChooseAction extends IFightAction{
	IFightAction m_Action1;
	IFightAction m_Action2;
	public ChooseAction(SafObject action1, SafObject action2){
		m_Action1=(IFightAction)action1;
		m_Action2=(IFightAction)action2;
	}
	public String toJavaCode(){
		return "choose("+m_Action1.toJavaCode()+","+m_Action2.toJavaCode()+")";
	}
}
