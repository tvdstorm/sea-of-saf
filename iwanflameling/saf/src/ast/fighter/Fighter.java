/**
 * 
 */
package ast.fighter;

import java.util.List;

import ast.ASTNode;
import ast.Visitor;

/**
 * Describes a Fighter in the SAF game.
 * @author Iwan Flameling
 */
public class Fighter extends ASTNode {
	/**
	 * The name of this {@link Fighter}.
	 */
	private String name;
	
	/**
	 * A {@link List} of {@link FighterProp}s to describe the properties of this {@link Fighter}. 
	 */
	private List<FighterProp> fighterProps;
	
	
	/**
	 * no-arg constructor, because I don't know yet the mandatory
	 * information for a {@link Fighter}.
	 */
	public Fighter(String name, List<FighterProp> properties){
		this.name = name;
		this.fighterProps = properties;
	}
	
	/**
	 * @return The name of the {@link Fighter}.
	 */
	public String getName(){
		return this.name;
	}
	
	
	/**
	 * @return The {@link FighterProp}s applicable to this {@link Fighter}.
	 */
	public List<FighterProp> getFighterProps() {
		return fighterProps;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

	/**
	 * @return A {@link String} representation of the {@link Fighter}.
	 */
	public String toString(){
		String className = this.getClass().getSimpleName();
		StringBuilder sb = new StringBuilder("<" + className + "| ");
		sb.append("name: " + getName() + ", ");
		sb.append("|>");
		return sb.toString();
	}
}
