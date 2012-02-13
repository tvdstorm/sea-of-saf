package saf.ast;

import java.util.*;

public class Fighter {
	private List<ASTNode> statements;
	public List<ASTNode> getStatements() {
		return statements;
	}
	
	private String name;
	public String getName() {
		return this.name;
	}

	public Fighter(String name) {
		this.name = name;
		statements = new ArrayList<ASTNode>();
	}
}