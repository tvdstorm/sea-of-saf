/**
 * 
 */
package com.blommesteijn.uva.sc.saf.runner.model.game.saf;

import java.util.List;

import com.blommesteijn.uva.sc.saf.runner.model.game.GameException;
import com.blommesteijn.uva.sc.saf.runner.model.game.IDraw;
import com.blommesteijn.uva.sc.saf.runner.model.game.IGame;
import com.blommesteijn.uva.sc.saf.runner.model.game.IGameContext;
import com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions.ActiveFighter;
import com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions.Arena;

/**
 * Super Awesome Fighter Game Context
 * @author dblommesteijn
 * @since Feb 20, 2012
 */
public class ArenaGameContext implements IGameContext
{
	private IGame _game = null;
//	private List<Fighter> _fighters = null;
	private List<ActiveFighter> _activeFighters = null;
	
	private Arena _arena = null;

	/**
	 * Construct a Fighter context
	 * @param game 
	 * @param arena 
	 * @param fighters 
	 * @param fighter fighter object
	 * @throws GameException 
	 */
	public ArenaGameContext(IGame game, Arena arena) throws GameException
	{
		_game = game;
		_arena = arena;
		_activeFighters = _arena.getActiveFighters();
		_arena.setSize(100);
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext
	 * #load()
	 */
	public void load() throws GameException
	{
		if (_activeFighters.size() != Arena.FIGHTERS_IN_ARENA_MAX)
			throw new GameException("arena is for " + Arena.FIGHTERS_IN_ARENA_MAX
					+ " fighters only");

	}

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#unload()
	 */
	public void unload()
	{
	}

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#loadContext()
	 */
	public void loadContext()
	{
		
	}

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#unloadContext()
	 */
	public void unloadContext()
	{
	}

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#update()
	 */
	public void update()
	{
		
	}

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#draw()
	 */
	public void draw(IDraw draw)
	{
//		draw.print(_arena.toString());
	}

}
