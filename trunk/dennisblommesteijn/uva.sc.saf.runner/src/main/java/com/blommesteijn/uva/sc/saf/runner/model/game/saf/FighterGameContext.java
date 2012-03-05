/**
 * 
 */
package com.blommesteijn.uva.sc.saf.runner.model.game.saf;

import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.Behaviour;
import com.blommesteijn.uva.sc.saf.ast.types.Fighter;
import com.blommesteijn.uva.sc.saf.ast.types.Condition;
import com.blommesteijn.uva.sc.saf.ast.types.values.EAttack;
import com.blommesteijn.uva.sc.saf.ast.types.values.ECondition;
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
	private IGame _game = null;
	private Fighter _fighter = null;
	private ActiveFighter _activeFighter = null;
	private Arena _arena = null;
	private Behaviour _behaviour = null;
	

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
	}
	
	
	

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#load()
	 */
	public void load()
	{
		//initiate new fighter as an active fighter
		_activeFighter = new ActiveFighter(_fighter);
		List<Behaviour> behaviours = _fighter.getBehaviour();
		for(Behaviour behaviour : behaviours)
		{
			Task task = new Task(behaviour);
			_activeFighter.add(task);
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
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#update()
	 */
	public void update() throws GameException
	{
		
		//try all active tasks
		while(_activeFighter.hasNext())
		{
			//get task
			Task task = _activeFighter.next();
			
			//collect arena properties
			List<Condition> currentState = new LinkedList<Condition>();
			if(_arena.isFar(_fighter))
				currentState.add(new Condition(0, ECondition.FAR.getIdent()));
			else if(_arena.isNear(_fighter))
				currentState.add(new Condition(0, ECondition.NEAR.getIdent()));
			
			if(_arena.isStronger(_fighter))
				currentState.add(new Condition(0, ECondition.STRONGER.getIdent()));
			else if(_arena.isWeaker(_fighter))
				currentState.add(new Condition(0, ECondition.WEAKER.getIdent()));
			else if(_arena.areEven())
				currentState.add(new Condition(0, ECondition.EVEN.getIdent()));
			
			if(_arena.isMuchStronger(_fighter))
				currentState.add(new Condition(0, ECondition.MUCH_STRONGER.getIdent()));
			if(_arena.isMuchWeaker(_fighter))
				currentState.add(new Condition(0, ECondition.MUCH_WEAKER.getIdent()));
			
			
			//skip task if it cannot be performed
			_behaviour  = task.getNextBehaviour(currentState);
			if(_behaviour == null)
				continue;
			
			System.out.println(_fighter.getIdent() + _behaviour);
			
			
		}

		
	}
	
	
	
	

	/* (non-Javadoc)
	 * @see com.blommesteijn.uva.sc.saf.runner.model.game.interfaces.IGameContext#draw()
	 */
	public void draw(IDraw draw)
	{
		
		
//		String positionCache = String.valueOf(_activeFighter.getPosition());
//		
//		draw.printAll('1');
		
		String[] drawing = ActiveFighterDraw.getAttack(EAttack.KICK_HIGH, true);
//		System.out.println(drawing);
		draw.printFighter(drawing, _activeFighter.getPosition());
//		draw.printFighter(ActiveFighterDraw.getAttack(null, true), _activeFighter.getPosition());
		
		
	}

}
