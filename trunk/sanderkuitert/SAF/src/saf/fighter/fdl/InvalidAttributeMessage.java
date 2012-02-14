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
		
		String alternativesMessage = "";
		if(possibleAttributes!=null && !possibleAttributes.equals("")){
			alternativesMessage = "\n"+possibleAttributes;
		}
		
		return invalidAttribute.getText()+" is invalid!"+alternativesMessage;
	}
	
}
