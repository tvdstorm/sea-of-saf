package com.blommesteijn.uva.sc.saf.ast.types.values;


public enum EAttackType
{
	//Strengths: punchReach, kickReach, kickPower, punchPower.
	BLOCK("block"),
	ATTACK("attack");
	
	private String _ident = null;
	
	/**
	 * Enum constructor
	 * @param ident identity
	 * @param range min max range
	 */
	EAttackType(String ident)
	{
		_ident = ident;
	}
	
	/**
	 * Identity equality
	 * @param ident value to compare
	 * @return result of comparison 
	 */
	public boolean equals(String ident)
	{
		return _ident.equals(ident);
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
