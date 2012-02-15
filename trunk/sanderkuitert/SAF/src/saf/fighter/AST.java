package saf.fighter;


interface AST {
	
	public String validPropertyValues();
	public boolean isValid(String attribute); //TODO don't limit arguments?
	
}
