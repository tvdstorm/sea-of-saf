package saf.compiler.types;

public class ChooseAction extends IFightAction{
	private IFightAction m_Action1;
	private IFightAction m_Action2;
	public ChooseAction(IFightAction action1,IFightAction action2){
		m_Action1=action1;
		m_Action2=action2;
	}
	@Override
	public String toJavaCode(){
		return "choose("+m_Action1.toJavaCode()+","+m_Action2.toJavaCode()+")";
	}
}
