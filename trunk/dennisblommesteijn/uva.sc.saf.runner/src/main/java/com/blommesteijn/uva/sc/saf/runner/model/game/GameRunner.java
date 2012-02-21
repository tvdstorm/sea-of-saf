package com.blommesteijn.uva.sc.saf.runner.model.game;

import java.util.List;

import com.blommesteijn.uva.sc.saf.runner.model.Model;
import com.blommesteijn.uva.sc.saf.runner.model.utils.Options;

/**
 * 
 * @author dblommesteijn
 * @since Feb 20, 2012
 */
public class GameRunner implements IGameRunner
{
	private static final int CHECK_PER_CYCLES = 2;
	private static final int TARGET_CYCLES = 60 / CHECK_PER_CYCLES;
	private static final int MILLISEC_IN_SEC = 1000 / CHECK_PER_CYCLES;
	
	private Thread _thread = null;
	private List<IGameContext> _gameContexts = null;
	private IDraw _draw = null;
	
	private int _suspendTarget = 0;
	private int _suspendGap = 0;
	private long _loopStart = 0L;
	private boolean _skipDraw = false;
	
	
	/**
	 * 
	 * @param draw
	 */
	public GameRunner(IDraw draw)
	{
		_draw = draw;
		_thread = new Thread(this);
		List<String> appName = Model.getInstance().getOption().getOption(Options.APP_NAME);
		if(appName.size() == 1)
			_thread.setName(appName.get(0) + "-gameRunner");
	}
	
	public void setContext(List<IGameContext> gameContexts)
	{
		_gameContexts = gameContexts;
	}
	
	public void start()
	{
		_thread.start();
	}
	
	public void stop()
	{
		//TODO: needs some work!
	}
	
	public void join() throws InterruptedException
	{
		_thread.join();
	}
	
	public void run()
	{
		_suspendTarget = MILLISEC_IN_SEC / TARGET_CYCLES;
		_suspendGap = 0;
		
		//initiate game context
		for(IGameContext gameContext : _gameContexts)
		{
			try
			{
				gameContext.load();
			}
			catch (GameException e)
			{
				e.printStackTrace();
			}
		}
		for(IGameContext gameContext : _gameContexts)
		{
			gameContext.loadContext();
		}
		
		_loopStart = System.currentTimeMillis();		

		//run game
		while(true)
		{
			for(IGameContext gameContext : _gameContexts)
			{
				try
				{
					gameContext.update();
				}
				catch (GameException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(!_skipDraw)
			{
				for(IGameContext gameContext : _gameContexts)
				{
					gameContext.draw(_draw);
				}
			}
			//suspend game thread (and calculate delay)
			this.suspend();
		}
	}

	private void suspend()
	{	
		//re-calc activity per timespan
		long end = System.currentTimeMillis() - _loopStart;
		if(end >= MILLISEC_IN_SEC)
		{
			//TODO: calculate offset not just ++/-- (add feedback system)
			if(_suspendGap < TARGET_CYCLES && _suspendTarget > 0)
				_suspendTarget--;
			if(_suspendGap > TARGET_CYCLES)
				_suspendTarget++;
			
			_loopStart = System.currentTimeMillis();
			_suspendGap = 0;
			
			//TODO: improve skip effect (it's not reactive)
			if(_suspendTarget < 1)
				_skipDraw  = true;
			else
				_skipDraw = false;
		}
		
		//suspend game thread
		try
		{
			Thread.sleep(_suspendTarget);
		}
		catch (InterruptedException e)
		{
		}
		_suspendGap++;
	}


	public boolean isSkippingDraw()
	{
		return _skipDraw;
	}
	
}
