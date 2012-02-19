package nl.tamasja.uva.saf.tree.ast;

import java.util.ArrayList;

import nl.tamasja.uva.saf.tree.IFighterNode;
import nl.tamasja.uva.saf.tree.IFighterVisitor;

public class Fighter implements IFighterNode {
	
	private final String name;
	private final ArrayList<Property> properties;
	
	public Fighter(String name, ArrayList<Property> properties) {
		this.name = name;
		this.properties = properties;
	}
	
	@Override
	public void accept(IFighterVisitor visitor) {
		
		for(Property p : properties ) {
			p.accept(visitor);
		}
		
		visitor.visit(this);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Property> getProperties() {
		return properties;
	}

}
