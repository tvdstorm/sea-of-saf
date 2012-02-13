package saf.fighter.fdl;


import org.antlr.runtime.tree.CommonTree;

public class InvalidAttributeMessage {
	
	CommonTree invalidAttribute;
	String note;
	
	public InvalidAttributeMessage(CommonTree invalidAttribute, String note) {
		assert invalidAttribute != null: "Specifying invalidAttribute is required!";
		
		this.invalidAttribute = invalidAttribute;
		this.note = note;
	}
	
	public String getMessage(){
		
		String noteMessage = "";
		if(note!=null && !note.equals("")){
			noteMessage = " ("+note+")";
		}
		
		return invalidAttribute.getText()+" is invalid!"+noteMessage;
	}
	
}
