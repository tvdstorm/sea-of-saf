package messages;


public class AlwaysMessage extends Message {

	public AlwaysMessage(String botName) {
		super(botName);
		setMessage("Bot named "+botName+" has no always condition");
	}
}
