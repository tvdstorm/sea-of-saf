package messages;


public class ValueMessage extends Message {

	public ValueMessage(String botName, String attribute, int value) {
		super(botName, attribute, value);
		setMessage("Invalid value "+Integer.toString(value)+" for attribute: "+attribute+" in Bot "+botName);
		// TODO Auto-generated constructor stub
	}

}
