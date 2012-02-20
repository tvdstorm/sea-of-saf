package compiler.types;



public abstract class BinCondition extends ICondition{
	ICondition m_Left;
	ICondition m_Right;
	public BinCondition(SafObject left,SafObject right){
		m_Left=(ICondition) left;
		m_Right=(ICondition) right;
	}
}