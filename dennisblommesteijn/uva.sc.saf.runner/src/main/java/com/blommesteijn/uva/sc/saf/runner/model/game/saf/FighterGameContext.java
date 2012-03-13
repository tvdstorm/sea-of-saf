/**
 * 
 */
package com.blommesteijn.uva.sc.saf.runner.model.game.saf;

import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.Behaviour;
import com.blommesteijn.uva.sc.saf.ast.types.Fighter;
import com.blommesteijn.uva.sc.saf.ast.types.actions.Action;
import com.blommesteijn.uva.sc.saf.ast.types.actions.AttackAction;
import com.blommesteijn.uva.sc.saf.ast.types.actions.BlockAction;
import com.blommesteijn.uva.sc.saf.ast.types.actions.MoveAction;
import com.blommesteijn.uva.sc.saf.runner.model.game.GameException;
import com.blommesteijn.uva.sc.saf.runner.model.game.IDraw;
import com.blommesteijn.uva.sc.saf.runner.model.game.IGame;
import com.blommesteijn.uva.sc.saf.runner.model.game.IGameContext;
import com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions.ActiveFighterDraw;
import com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions.Arena;
import com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions.Task;
import com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions.ActiveFighter;

/**
 * Super Awesome Fighter Game Context
 * @author dblommesteijn
 * @since Feb 20, 2012
 */
public class FighterGameContext implements IGameContext
{
	private static final long UPDATE_INTERFAL = 500;
	private IGame _game = null;
	private Fighter _fighter = null;
	private ActiveFighter _activeFighter = null;
	private Arena _arena = null;
	private Behaviour _behaviour = null;
	private long _lastGameUpdate = 0L;
	

	/**
	 * Construct a Fighter context
	 * @param game 
	 * @param arena 
	 * @param fighter fighter object
	 */
	public FighterGameContext(IGame game, Arena arena, Fighter fighter)
	{
		_game = game;
		_arena = arena;
		_fighter = fighter;
		_lastGameUpdate = System.currentTimeMillis();
	}
	
	
	
	

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#load()
	 */
	public void load()
	{
		//initiate new fighter as an active fighter
		_activeFighter = new ActiveFighter(_fighter);
		
		List<Behaviour> behaviours = _fighter.getBehaviours();
		for(Behaviour behaviour : behaviours)
		{
			Task task = new Task(behaviour);
			_activeFighter.getActions().add(task);
		}
		//add fighter to the arena
		_arena.addFighter(_activeFighter);
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
	 * @see co m.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#update()
	 */
	public void update() throws GameException
	{
		if(this.mustUpdate())
		{
			//get next fighter behaviour
			_behaviour = _activeFighter.getNextBehaviour(_arena);
			
			Action move = _behaviour.getRandomAction(MoveAction.class);
			Action attack = _behaviour.getRandomAction(AttackAction.class);
			Action block = _behaviour.getRandomAction(BlockAction.class);

			_activeFighter.setMove(move);
			_activeFighter.setAttack(attack);
			_activeFighter.setBlock(block);
			
			Action lastAction = null;
			if(attack != null)
				lastAction = attack;
			if(block != null)
				lastAction = block;
			
			//perform movement
			_arena.move(_activeFighter, move);
			_arena.attack(_activeFighter, lastAction);		
		}
	}
	
	
	
	

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#draw()
	 */
	public void draw(IDraw draw)
	{
	}

	
	private boolean mustUpdate()
	{
		long currentTimeMillis = System.currentTimeMillis();
		boolean ret = (currentTimeMillis - _lastGameUpdate  > UPDATE_INTERFAL);
		if(ret)
			_lastGameUpdate = currentTimeMillis;
		return ret;
	}
}
