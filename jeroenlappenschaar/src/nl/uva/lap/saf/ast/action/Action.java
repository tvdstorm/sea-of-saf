package nl.uva.lap.saf.ast.action;

import java.util.List;

import nl.uva.lap.saf.ast.ASTNode;

public abstract class Action extends ASTNode
{	
	/**
	 * Check if this element contains one of the elements given  
	 * @param elements
	 * @return true if this element is in the element, false otherwise
	 */
	public abstract boolean contains(List<String> elements);
}
