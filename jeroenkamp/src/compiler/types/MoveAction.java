package compiler.types;

import common.MoveType;

import compiler.SafCompiler;


public class MoveAction extends IMoveAction{
	private MoveType m_Type;
	public MoveAction(SafObject o ){
		StringValue val=(StringValue)o;
		try{
			m_Type=MoveType.valueOf(val.getValue());
		}
		catch(IllegalArgumentException iae){
			SafCompiler.error("Invalid Move keyword");
		}
	}
	public String toJavaCode(){
		return "MoveType."+m_Type.toString();
	}
}
