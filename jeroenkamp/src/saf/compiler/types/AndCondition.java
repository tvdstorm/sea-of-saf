package saf.compiler.types;



public class AndCondition extends BinCondition{
	public AndCondition(ICondition left, ICondition right){super(left,right);}
	@Override
	public String toJavaCode(){
		return "("+m_Left.toJavaCode()+"||"+m_Right.toJavaCode()+")";
	}
}