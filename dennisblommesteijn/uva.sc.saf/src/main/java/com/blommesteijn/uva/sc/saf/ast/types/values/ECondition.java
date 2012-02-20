package com.blommesteijn.uva.sc.saf.ast.types.values;

public enum ECondition
{
	//Conditions: stronger, weaker, much stronger, much weaker, even, near, far, always.
	STRONGER("stronger"),
	WEAKER("weaker"),
	MUCH_STRONGER("much_stronger"),
	MUCH_WEAKER("much_weaker"),
	EVEN("even"),
	NEAR("near"),
	FAR("far"),
	ALWAYS("always");
	

	private String _ident = null;
	
	/**
	 * Enum constructor
	 * @param ident identity
	 * @param range min max range
	 */
	ECondition(String ident)
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
