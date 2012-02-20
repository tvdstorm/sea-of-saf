package com.blommesteijn.uva.sc.saf.ast.types;

import java.io.Serializable;
import java.util.List;

import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

public interface IAstNode extends Serializable
{
	void setIdent(String ident);
	String getIdent();
	
	void setLine(int line);
	int getLine();
	
	void append(AstNode astNode);
	void append(List<AstNode> astNode);
	List<AstNode> getNodes();
	
	String toString();
	String toString(String indent);
	
	void staticCheck(StaticCheckerResult checker);
	void register(AstNode astNode);
	
	
}
