/**
 * 
 */
package saf.fighter;

import java.util.Collections;
import java.util.List;

public class Attack implements AST {
	
	private String attack;
	
	
	public Attack(String attack) {
		this.attack = attack;
	}

	public String getName() {
		return attack;
	}
	
	public List<AST> getChildren() {
		return Collections.emptyList();
	}
	
	public int getPhysicalEffect(List<Property> properties) {
		int defensiveModifier = 1;
		if(attack.startsWith(BLOCK)) {
			defensiveModifier = -1;
		}
		
		for(Property property: properties) {
			if(property.getName().startsWith(attack) && property.getName().endsWith(ASPECT_POWER)) {
				return defensiveModifier * property.getValue();
			}
		}
		return defensiveModifier * DEFAULT_PROPERTY_VALUE;
	}

	public int getRange(List<Property> properties) {
		for(Property property: properties) {
			if(property.getName().startsWith(attack) && property.getName().endsWith(ASPECT_RANGE)) {
				return property.getValue();
			}
		}
		return DEFAULT_PROPERTY_VALUE;
	}
	
}