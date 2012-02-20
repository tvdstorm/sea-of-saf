package com.blommesteijn.uva.sc.saf.ast.types.values;

import com.blommesteijn.uva.sc.saf.ast.types.exceptions.PropertyValueException;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

public enum EStrength
{
	//Strengths: punchReach, kickReach, kickPower, punchPower.
	PUNCH_POWER("punchPower", new double[]{ 1.0, 10.0 }),
	PUNCH_REACH("punchReach", new double[]{ 1.0, 10.0 }),
	KICK_REACH("kickReach", new double[]{ 1.0, 10.0 }),
	KICK_POWER("kickPower", new double[]{ 1.0, 10.0 });
	
	private static final int FST = 0;
	private static final int SND = 1;

	private String _ident = null;
	private double[] _range = new double[2];
	
	/**
	 * Enum constructor
	 * @param ident identity
	 * @param range min max range
	 */
	EStrength(String ident, double[] range)
	{
		_ident = ident;
		_range = range;
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
	 * Test if the value is applicable on the property
	 * @param value
	 * @throws PropertyValueException
	 */
	public void testValue(double value) throws PropertyValueException
	{
		if(value < _range[FST] || value > _range[SND])
			throw new PropertyValueException("not between "+_range[FST]+"-" +_range[SND]);
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
