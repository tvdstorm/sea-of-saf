package saf.compiler.types;


public class OrCondition extends BinCondition{
	public OrCondition(ICondition left, ICondition right){super(left,right);}
	@Override
	public String toJavaCode(){
		return "("+m_Left.toJavaCode()+"||"+m_Right.toJavaCode()+")";
	}
}