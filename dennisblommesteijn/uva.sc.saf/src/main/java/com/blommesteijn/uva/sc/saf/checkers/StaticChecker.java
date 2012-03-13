package com.blommesteijn.uva.sc.saf.checkers;

import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.AstNode;
import com.blommesteijn.uva.sc.saf.ast.types.IAstNode;


public class StaticChecker extends Checker
{
	private List<IAstNode> _astNodes = null;

	public StaticChecker(List<IAstNode> astNodes)
	{
		super();	
		_result = new StaticCheckerResult();
		_astNodes = astNodes;
		this.init();
	}
	
	public StaticChecker(IAstNode astNode)
	{
		super();
		_result = new StaticCheckerResult();
		_astNodes = new LinkedList<IAstNode>();
		_astNodes.add(astNode);
		this.init();
	}
	
	private void init()
	{
		for(IAstNode astNode : _astNodes)
			astNode.staticCheck((StaticCheckerResult)_result);
	}

}
