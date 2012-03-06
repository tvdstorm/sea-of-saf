package com.blommesteijn.uva.sc.saf.ast.types.values;


public enum EAttack
{
	//Attacks: punch low, punch high, kick low, kick high, block low, block high
	
	PUNCH_LOW("punch_low", EAttackType.ATTACK),
	PUNCH_HIGH("punch_high", EAttackType.ATTACK),
	KICK_LOW("kick_low", EAttackType.ATTACK),
	KICK_HIGH("kick_high", EAttackType.ATTACK),
	BLOCK_LOW("block_low", EAttackType.BLOCK),
	BLOCK_HIGH("block_high", EAttackType.BLOCK);

	private String _ident = null;
	private EAttackType _type = null;
	
	/**
	 * Enum constructor
	 * @param ident identity
	 * @param range min max range
	 */
	EAttack(String ident, EAttackType type)
	{
		_ident = ident;
		_type  = type;
	}
	
	/**
	 * Get identity
	 * @return identity
	 */
	public String getIdent()
	{
		return _ident;
	}
	
	public EAttackType getType()
	{
		return _type;
	}
}
