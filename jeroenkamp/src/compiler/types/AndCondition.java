package compiler.types;



public class AndCondition extends BinCondition{
	public AndCondition(SafObject left, SafObject right){super(left,right);}
	public String toJavaCode(){
		return "("+m_Left.toJavaCode()+"||"+m_Right.toJavaCode()+")";
	}
}