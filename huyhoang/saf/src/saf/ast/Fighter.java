package saf.ast;

import java.util.*;

public class Fighter {
	private List<ASTNode> definitions;
	public List<ASTNode> getDefinitions() {
		return definitions;
	}
	
	private String name;
	public String getName() {
		return this.name;
	}

	public Fighter(String name) {
		this.name = name;
		definitions = new ArrayList<ASTNode>();
	}
}