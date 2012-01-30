package compiler;

abstract class SafObject{
	private int m_Line;
	private int m_Column;
	public void accept(SafVisitor visitor){
		visitor.visit(this);
	}
	
	
}


class Fighter extends SafObject{
	private StringValue m_Name;
	private Statements m_Statement;
	public Fighter(SafObject name, SafObject st){
		m_Name=(StringValue)name; 
		m_Statement=(Statements)st;
	}
	public Fighter(SafObject name){
		m_Name=(StringValue)name;
	}
}

class Statements extends SafObject{
	private Statement m_Statement;
	private Statements m_Next;
	public Statements(SafObject statement,SafObject next)
	{	
		m_Statement=(Statement)statement;
		m_Next=(Statements)next;
	}
	public Statements(SafObject statement)
	{	
		m_Statement=(Statement)statement;
		m_Next=null;
	}
}
abstract class Statement extends SafObject{}

class VariableStatement extends Statement{
	private NamesValue m_Varname;
	private IntValue m_Value;
	
	public VariableStatement(SafObject name, SafObject value){
		m_Varname=(NamesValue)name;
		m_Value=(IntValue)value;
	}
	public IntValue getValue(){
		return m_Value;
	}
	public NamesValue getVarName(){
		return m_Varname;
	}
}
class ActionStatement extends Statement{
	private ICondition m_Cond;
	private IAction m_Action1;
	private IAction m_Action2;
	public ActionStatement(SafObject cond, SafObject action1, SafObject action2){
		m_Cond=(ICondition) cond;
		m_Action1=(IAction) action1;
		m_Action2=(IAction)action2;
	}
	public IAction getFirstAction(){
		return m_Action1;
	}
	public IAction getSecondAction(){
		return m_Action2;
	}
	public ICondition getCondition(){
		return m_Cond;
	}
}
abstract class IAction extends SafObject{
	
}
class ChooseAction extends IAction{
	IAction m_Action1;
	IAction m_Action2;
	public ChooseAction(SafObject action1, SafObject action2){
		m_Action1=(IAction)action1;
		m_Action2=(IAction)action2;
	}
}
class Action extends IAction{
	private ActionType m_Type;
	public Action(SafObject o ){
		StringValue val=(StringValue)o;
		try{
			m_Type=ActionType.valueOf(val.getValue());
		}
		catch(IllegalArgumentException iae){
			SafCompiler.error("Invalid Action keyword");
		}
	}
}
abstract class ICondition extends SafObject{
}
abstract class BinCondition extends ICondition{
	ICondition m_Left;
	ICondition m_Right;
	public BinCondition(SafObject left,SafObject right){
		m_Left=(ICondition) left;
		m_Right=(ICondition) right;
	}
}
class OrCondition extends BinCondition{
	public OrCondition(SafObject left, SafObject right){super(left,right);}
}
class AndCondition extends BinCondition{
	public AndCondition(SafObject left, SafObject right){super(left,right);}
}
class Condition extends ICondition{
	private ConditionType m_Type;
	public Condition(SafObject o ){
		StringValue val=(StringValue)o;
		try{
			m_Type=ConditionType.valueOf(val.getValue());
		}
		catch(IllegalArgumentException iae){
			SafCompiler.error("Invalid Condition keyword");
		}
	}
}

abstract class Value extends SafObject{
	
}
class IntValue extends Value{
	private int m_Value;
	public IntValue(int var){
		m_Value=var;
	}
	public int getValue(){
		return m_Value;
	}
}
class NamesValue extends Value{
	private Names m_Name;
	public NamesValue(StringValue val ){
		try{
			m_Name=Names.valueOf(val.getValue());
		}
		catch(IllegalArgumentException iae){
			SafCompiler.error("Invalid Names keyword");
		}
	}
}


class StringValue extends Value{
	private String m_Value;
	public StringValue(String var){
		m_Value=var;
	}
	public String getValue(){
		return m_Value;
	}
}
enum ConditionType{
	far,
	near,
	weaker,
	stronger,
	much_weaker,
	much_stronger,
	always
}
enum ActionType{
	kick_low,
	kick_high,
	punch_low,
	punch_high,
	block_high,
	block_low,
	stand,
	run_towards,
	run_away,
	jump,
	crouch,
	walk_towards,
	walk_away,
}

enum Names{
	punchreach,
	punchstrength,
	kickreach,
	kickstrength,
}