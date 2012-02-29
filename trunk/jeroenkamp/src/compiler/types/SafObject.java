package compiler.types;

import compiler.SafVisitor;

public abstract class SafObject{


	
	public void accept(SafVisitor visitor){
		visitor.visit(this);
	}
	public abstract String toJavaCode();
	
	
}