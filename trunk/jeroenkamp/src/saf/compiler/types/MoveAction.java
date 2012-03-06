package saf.compiler.types;

import saf.common.MoveType;
import saf.compiler.common.ErrorModule;
import saf.compiler.common.ErrorType;

public class MoveAction extends IMoveAction{
	private MoveType m_Type;
	public MoveAction(StringValue val ){
		try{
			m_Type=MoveType.valueOf(val.getValue());
		}
		catch(IllegalArgumentException iae){
			ErrorModule.addError(ErrorType.Error,"Invalid Move keyword");
		}
	}
	@Override
	public String toJavaCode(){
		return "MoveType."+m_Type.toString();
	}
}
