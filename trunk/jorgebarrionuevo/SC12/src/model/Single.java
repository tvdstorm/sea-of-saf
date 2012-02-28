package model;

import util.*;

public class Single extends Condition {
	private static final String ALWAYS = "always";
	
	private final String name;

	public Single(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public boolean isAlways() {
		return name.equals(ALWAYS);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Single)) {
			return false;
		}
		return getName().equals(((Single)obj).getName());
	}


}

