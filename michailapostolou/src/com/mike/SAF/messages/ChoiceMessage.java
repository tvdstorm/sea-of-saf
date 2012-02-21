package messages;


public class ChoiceMessage extends Message {
	
	public ChoiceMessage(int line,int column) {
		super(line,column);
		setMessage("Choice actions are incompatible, look at line: "+line+" , column: "+column);
	}
}
