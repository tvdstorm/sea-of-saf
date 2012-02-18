package saf.ast.definition;

import saf.ast.*;

public class Action extends Procedure {
	
	private String name;
	public String getName() {
		return name;
	}
	
	private String keywordType;
	public String getKeywordType() {
		return this.keywordType;
	}
	
	public void setKeywordType(String keywordType) {
		this.keywordType = keywordType;
	}
	
	public Action(String name) {
		this.name = name;
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}
}
