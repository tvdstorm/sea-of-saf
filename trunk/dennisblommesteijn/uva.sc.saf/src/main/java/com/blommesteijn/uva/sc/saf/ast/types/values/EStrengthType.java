package com.blommesteijn.uva.sc.saf.ast.types.values;


public enum EStrengthType
{
	//Strengths: punchReach, kickReach, kickPower, punchPower.
	REACH("reach"),
	POWER("power");
	
	private String _ident = null;
	
	/**
	 * Enum constructor
	 * @param ident identity
	 * @param range min max range
	 */
	EStrengthType(String ident)
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
