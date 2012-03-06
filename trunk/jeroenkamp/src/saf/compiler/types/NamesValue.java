package saf.compiler.types;

import saf.compiler.common.ErrorModule;
import saf.compiler.common.ErrorType;

public class NamesValue extends Value{
	private Names m_Name;
	public NamesValue(StringValue val ){
		try{
			m_Name=Names.valueOf(val.getValue());
		}
		catch(IllegalArgumentException iae){
			ErrorModule.addError(ErrorType.Error, "Invalid Names keyword");
		}
	}
	@Override
	public String toJavaCode(){
		switch(m_Name){
		case kickreach: return "m_KickReach";
		case kickstrength: return "m_KickPower";
		case punchreach: return "m_PunchReach";
		case punchstrength: return "m_PunchPower";
		}
		return "";
		
	}
	
}