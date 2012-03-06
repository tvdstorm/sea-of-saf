package saf.compiler.types;

import saf.compiler.common.ErrorModule;
import saf.compiler.common.ErrorType;



public class Condition extends ICondition{
	private ConditionType m_Type;
	public Condition(SafObject o ){
		StringValue val=(StringValue)o;
		try{
			m_Type=ConditionType.valueOf(val.getValue());
		}
		catch(IllegalArgumentException iae){
			ErrorModule.addError(ErrorType.Error,"Invalid Condition keyword");
		}
	}
	@Override
	public String toJavaCode(){
		return toFunction(m_Type);
	}
	private String toFunction(ConditionType type){
		switch(type){
		case always: return "list.isEmpty()";
		case near:return "isNear()";
		case far:return "isFar()";
		case much_stronger:return "isMuchStronger()";
		case much_weaker:return "isMuchWeaker()";
		case stronger:return "isStronger()";
		case weaker: return "isWeaker()";
		}
		return "false";
	}
}
