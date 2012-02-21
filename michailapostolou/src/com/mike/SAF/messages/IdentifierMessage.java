package messages;


public class IdentifierMessage extends Message {
	public IdentifierMessage(String nextToken,int line,int column) {
		super(nextToken,line,column);
		setMessage("Invalid Identifier before token "+nextToken+" in line: "+line+" , column: "+column);
	}
}
