/**
 * 
 */
package com.blommesteijn.uva.sc.saf.runner.model.game;

import com.blommesteijn.uva.sc.saf.runner.model.DefaultException;


/**
 * @author dblommesteijn
 * @since 20 Feb, 2012
 */
public class GameException extends DefaultException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4174840030994953614L;
	
	public GameException()
	{
		super();
	}

	public GameException(String message)
	{
		super(message);
	}
	
}
