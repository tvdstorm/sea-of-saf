package saf.ast.definition;

import java.util.*;
import saf.ast.*;
import saf.checker.*;
import saf.interpreter.*;

public class Action implements ASTNode {
	List<Action> parameters;
	public List<Action> getParameters() {
		return this.parameters;
	}
	
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
		parameters = new ArrayList<Action>();
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Action)
		{
			Action function = (Action)obj;
			return this.name.equals(function.name);
		}
		else
		{
			return false;
		}
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}
}
