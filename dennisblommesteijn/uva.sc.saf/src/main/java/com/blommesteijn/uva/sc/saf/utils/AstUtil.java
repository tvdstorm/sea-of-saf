package com.blommesteijn.uva.sc.saf.utils;

import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.AstNode;

public class AstUtil
{
	/**
	 * AST nodes to string
	 * @param astNodes list of AST nodes
	 * @return string representation of AST nodes
	 */
	public static String toString(List<AstNode> astNodes)
	{
		StringBuilder sb = new StringBuilder();
		for(AstNode astNode: astNodes)
		{
			sb.append(astNode).append(StringUtil.NEW_LINE);
		}
		return sb.toString();
	}
}
