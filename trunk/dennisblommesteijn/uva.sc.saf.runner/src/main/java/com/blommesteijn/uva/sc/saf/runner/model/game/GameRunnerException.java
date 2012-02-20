/**
 * 
 */
package com.blommesteijn.uva.sc.saf.runner.model.game;

import com.blommesteijn.uva.sc.saf.runner.model.DefaultException;


/**
 * @author dblommesteijn
 * @since 20 Feb, 2012
 */
public class GameRunnerException extends GameException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4174840030994953614L;
	
	public GameRunnerException()
	{
		super();
	}

	public GameRunnerException(String message)
	{
		super(message);
	}
	
}
