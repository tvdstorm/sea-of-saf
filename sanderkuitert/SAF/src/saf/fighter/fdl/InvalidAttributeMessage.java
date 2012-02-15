package saf.fighter.fdl;


import org.antlr.runtime.tree.CommonTree;

class InvalidAttributeMessage {
	
	private CommonTree invalidAttribute;
	private String possibleAttributes;

	/** @require invalidAttribute != null */
	public InvalidAttributeMessage(CommonTree invalidAttribute, String possibleAttributes) {
		assert invalidAttribute != null: "Specifying invalidAttribute is required!";
		this.invalidAttribute = invalidAttribute;
		this.possibleAttributes = possibleAttributes;
	}
	
	public String toString(){
		
		//Only include a newline when possible attributes follow
		String possibilities = "";
		if(possibleAttributes!=null && !possibleAttributes.equals("")){
			possibilities = "\n"+possibleAttributes;
		}
		
		return invalidAttribute.getText()+"(line "+invalidAttribute.getLine()+")"+
															" is invalid!"+possibilities;
	}
	
}
