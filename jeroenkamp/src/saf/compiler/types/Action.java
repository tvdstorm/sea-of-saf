package saf.compiler.types;

import saf.common.ActionType;
import saf.compiler.common.ErrorModule;
import saf.compiler.common.ErrorType;


public class Action extends IFightAction{
	private ActionType m_Type;
	public Action(StringValue o ){
		StringValue val=o;
		try{
			m_Type=ActionType.valueOf(val.getValue());
		}
		catch(IllegalArgumentException iae){
			ErrorModule.addError(ErrorType.Error,"Invalid Action keyword");
		}
	}
	@Override
	public String toJavaCode(){
		return "ActionType."+m_Type.toString();
	}
}
