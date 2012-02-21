package messages;

public class Message {
	
	private String type;
	private String botName;
	private int line;
	private int column;
	private String message;
	
	public Message(String type,String botName, int line, int column){
		this.type = type;
		this.botName = botName;
		this.line = line;
		this.column = column;
	}
	public Message(String botName){
	}
	
	public Message(String botName,String attribute, int value){
		
	}
	
	public Message(int line, int column){
		
	}
	
	public Message(String nextIdentifier,int line, int column){
		
	}
	
	public Message(String botName,String type){
		
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
