package compiler.types;


public class OrCondition extends BinCondition{
	public OrCondition(SafObject left, SafObject right){super(left,right);}
	public String toJavaCode(){
		return "("+m_Left.toJavaCode()+"||"+m_Right.toJavaCode()+")";
	}
}