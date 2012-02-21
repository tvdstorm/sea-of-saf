package messages;


public class ConditionMessage extends Message {

	public ConditionMessage(int line,int column) {
		super(line,column);
		setMessage("You have inserted wrong condition rule in line: "+line+" ,column : "+column);
	}

}
