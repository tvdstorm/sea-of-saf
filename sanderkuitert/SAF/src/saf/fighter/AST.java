package saf.fighter;

import java.util.List;


interface AST {

	public String getValue(); //All nodes should at least have a String representation
	public List<AST> getChildren();

//	public String describeValidValues();			//now static
//	public boolean isValidValue(String attribute);	//now static
	
}
