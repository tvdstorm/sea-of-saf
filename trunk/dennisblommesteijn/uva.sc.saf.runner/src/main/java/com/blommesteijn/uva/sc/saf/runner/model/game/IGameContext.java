package com.blommesteijn.uva.sc.saf.runner.model.game;

public interface IGameContext
{
	/**
	 * Load game assets, load (before game)
	 * HINT: use it for non-graphical stuff only
	 */
	void load();
	
	/**
	 * Unload loaded game assets, cleanup (after game)
	 */
	void unload();
	
	/**
	 * Load Context, graphical assets (before game)
	 * HINT: use it for graphical stuff only
	 */
	void loadContext();
	
	/**
	 * Unload Context, unload graphical assets (after game)
	 */
	void unloadContext();
	
	/**
	 * Update game assets
	 * HINT: runs 60 times per second
	 */
	void update();
	
	/**
	 * Update graphical assets
	 * HINT: runs 60 times per second (if too slow, draw is skipped)
	 */
	void draw(IDraw draw);
}