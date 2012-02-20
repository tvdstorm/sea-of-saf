package com.blommesteijn.uva.sc.saf.ast.types.values;

public enum EMove
{
	//Moves: jump, crouch, stand, run towards, run away, walk towards, walk away.
	
	JUMP("jump"),
	CROUCH("crouch"),
	STAND("stand"),
	RUN_TOWARDS("run_towards"),
	RUN_AWAY("run_away"),
	WALK_TOWARDS("walk_towards"),
	WALK_AWAY("walk_away");
	

	private String _ident = null;
	
	/**
	 * Enum constructor
	 * @param ident identity
	 * @param range min max range
	 */
	EMove(String ident)
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
