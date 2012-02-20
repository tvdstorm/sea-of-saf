package saf.ast.definition;

import java.util.ArrayList;
import java.util.List;
import saf.ast.ASTNode;

public abstract class Procedure implements ASTNode {
	private List<Procedure> procedures;
	
	public List<Procedure> getProcedures() {
		if (this.procedures == null)
			this.procedures = new ArrayList<Procedure>();
		
		return this.procedures;
	}
}
