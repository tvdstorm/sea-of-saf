/**
 * 
 */
package com.blommesteijn.uva.sc.saf.runner.model.game.saf;

import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.blommesteijn.uva.sc.saf.ast.types.Action;
import com.blommesteijn.uva.sc.saf.ast.types.Behaviour;
import com.blommesteijn.uva.sc.saf.ast.types.values.EAttack;
import com.blommesteijn.uva.sc.saf.runner.model.game.GameException;
import com.blommesteijn.uva.sc.saf.runner.model.game.IDraw;
import com.blommesteijn.uva.sc.saf.runner.model.game.IGame;
import com.blommesteijn.uva.sc.saf.runner.model.game.IGameContext;
import com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions.ActiveFighter;
import com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions.ActiveFighterDraw;
import com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions.Arena;
import com.blommesteijn.uva.sc.saf.runner.model.utils.Common;

/**
 * Super Awesome Fighter Game Context
 * @author dblommesteijn
 * @since Feb 20, 2012
 */
public class ArenaGameContext implements IGameContext
{
	private static final long UPDATE_INTERFAL = 500;
	
	
	private IGame _game = null;
	private List<ActiveFighter> _activeFighters = null;
	
	private Arena _arena = null;
	
	private long _lastGameUpdate = 0L;

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
		
		_lastGameUpdate  = System.currentTimeMillis();
	}
	
	private boolean mustUpdate()
	{
		long currentTimeMillis = System.currentTimeMillis();
		boolean ret = (currentTimeMillis - _lastGameUpdate > UPDATE_INTERFAL);
		if(ret)
			_lastGameUpdate = currentTimeMillis;
		return ret;
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
					+ " fighters only: " + _activeFighters.size());
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
		//skip some cycles
		if(!this.mustUpdate())
			return;
		
		String score = "";
		String action = "";
		String output = "";
		
		for(ActiveFighter af : _activeFighters)
		{
			//check for dead fighter
			if(af.getHealth() < 0)
			{
				String fighterName = _arena.getOtherFighter(af).getFighter().getIdent();
				draw.printScore(fighterName + " has won!");
				_game.end();
			}
			
			//add last behaviour
			Behaviour lastBehaviour = af.getLastBehaviour();
			if(lastBehaviour != null)
			{
				Action attack = lastBehaviour.getAttack();
				Action move = lastBehaviour.getMove();
			
				action += af.getFighter().getIdent() + ": " + move.getIdent() + " " + attack.getIdent();
				action += Common.TAB;
			}
			
			//add fighter health
			score += af.getFighter().getIdent() + ": " + af.getHealth();
			score += Common.TAB + Common.TAB + Common.TAB;
			
			//add fighter
			boolean inverted = false;
			ActiveFighter other = _arena.getOtherFighter(af);
			if(other.getPosition() < af.getPosition())
				inverted = true;
			//get ascii art
			EAttack attack = af.getAttack();
			String[] fighter = ActiveFighterDraw.getAttack(attack, inverted);
			draw.printOutputPane(fighter, af.getPosition(), other.getPosition());			
		}
		draw.printScore(score);
		draw.printAction(action);
	}

}
