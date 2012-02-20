package com.blommesteijn.uva.sc.saf.ast.types.values;


public enum EAttack
{
	//Attacks: punch low, punch high, kick low, kick high, block low, block high
	
	PUNCH_LOW("punch_low"),
	PUNCH_HIGH("punch_high"),
	KICK_LOW("kick_low"),
	KICK_HIGH("kick_high"),
	BLOCK_LOW("block_low"),
	BLOCK_HIGH("block_high");

	private String _ident = null;
	
	/**
	 * Enum constructor
	 * @param ident identity
	 * @param range min max range
	 */
	EAttack(String ident)
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
