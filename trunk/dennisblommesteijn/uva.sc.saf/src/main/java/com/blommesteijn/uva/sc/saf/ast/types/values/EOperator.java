package com.blommesteijn.uva.sc.saf.ast.types.values;

public enum EOperator
{
	AND("and"),
	OR("or");

	private String _ident = null;
	
	/**
	 * Enum constructor
	 * @param ident identity
	 * @param range min max range
	 */
	EOperator(String ident)
	{
		_ident = ident;
	}
	
	/**
	 * Get identity
	 * @return identity
	 */
	public String getIdent()
	{
		return _ident;
	}
}
