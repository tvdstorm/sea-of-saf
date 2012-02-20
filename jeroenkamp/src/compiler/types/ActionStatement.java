package compiler.types;


public class ActionStatement extends Statement{
	private ICondition m_Cond;
	private IMoveAction m_Action1;
	private IFightAction m_Action2;
	public ActionStatement(SafObject cond, SafObject action1, SafObject action2){
		m_Cond=(ICondition) cond;
		m_Action1=(IMoveAction) action1;
		m_Action2=(IFightAction)action2;
	}
	public IMoveAction getFirstAction(){
		return m_Action1;
	}
	public IFightAction getSecondAction(){
		return m_Action2;
	}
	public ICondition getCondition(){
		return m_Cond;
	}
	public String toJavaCode(){
		return "if("+m_Cond.toJavaCode()+"){list.add(new ActionPair("+m_Action1.toJavaCode()+","+m_Action2.toJavaCode()+"));\r\n";
	}
}