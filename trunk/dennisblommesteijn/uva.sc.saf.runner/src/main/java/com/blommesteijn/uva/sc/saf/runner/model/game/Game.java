package com.blommesteijn.uva.sc.saf.runner.model.game;

import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions.ActiveFighter;


public class Game implements IGame
{
	private List<IGameContext> _gameContexts = null;
	private IGameRunner _gameRunner = null;
	
	public Game(IDraw draw)
	{
		_gameContexts = new LinkedList<IGameContext>();
		_gameRunner = new GameRunner(draw);
	}
	
	public void addContext(IGameContext gameContext)
	{
		_gameContexts.add(gameContext);
	}
	
	public void addAllContexts(List<IGameContext> gameContexts)
	{
		_gameContexts.addAll(gameContexts);
	}
	
	public List<IGameContext> getContexts()
	{
		return _gameContexts;
	}
	
	public IGameRunner getGameRunner()
	{
		return _gameRunner;
	}

	/**
	 * Run game (start game thread)
	 */
	public void start()
	{
		_gameRunner.setContext(_gameContexts);
		_gameRunner.start();
		try
		{
			_gameRunner.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public void end() 
	{
		_gameRunner.stop();		
	}


}
