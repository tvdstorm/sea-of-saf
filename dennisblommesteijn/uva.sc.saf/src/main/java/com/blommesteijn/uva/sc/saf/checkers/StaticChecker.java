package com.blommesteijn.uva.sc.saf.checkers;

import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.AstNode;


public class StaticChecker extends Checker
{
	private List<AstNode> _astNodes = null;

	public StaticChecker(List<AstNode> astNodes)
	{
		super();	
		_result = new StaticCheckerResult();
		_astNodes = astNodes;
		this.init();
	}
	
	public StaticChecker(AstNode astNode)
	{
		super();
		_result = new StaticCheckerResult();
		_astNodes = new LinkedList<AstNode>();
		_astNodes.add(astNode);
		this.init();
	}
	
	private void init()
	{
		for(AstNode astNode : _astNodes)
			astNode.staticCheck((StaticCheckerResult)_result);
	}

}
