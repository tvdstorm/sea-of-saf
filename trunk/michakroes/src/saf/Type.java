package saf;

import java.util.List;
import java.util.Random;
//import java.util.Iterator;

import test.SafInterface;
import test.SafVisitor;

public abstract class Type implements SafInterface {
	private String type;
	private List<String> types;
	private Random randomGenerator;

	public Type(String t) {
		this.type = t;
	}
	
	public Type(List<String> t) {
		this.types = t;
		randomGenerator = new Random();
	}
	
	public String getType() {
		if (this.type != null)
			return this.type;
		else {
			return types.get(randomGenerator.nextInt(this.types.size()));   
			
			/*String types = "( ";
			Iterator<String> i = this.types.iterator();
			while (i.hasNext()) {
				types += i.next().toString() + " ";
			}
			return types + ")";   
			*/
		}
	}
	
	public String getRandomType() {
		return types.get(randomGenerator.nextInt(this.types.size()));   
	}
	
	@Override
	public void accept(SafVisitor visitor) {
		//this.condition.accept(visitor);
		visitor.visit(this);
	}
}