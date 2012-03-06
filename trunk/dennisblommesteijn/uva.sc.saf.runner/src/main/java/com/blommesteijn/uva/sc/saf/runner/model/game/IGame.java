package com.blommesteijn.uva.sc.saf.runner.model.game;

import java.util.List;

public interface IGame
{
	void addContext(IGameContext gameContext);
	void addAllContexts(List<IGameContext> gameContexts);
	List<IGameContext> getContexts();
	
	IGameRunner getGameRunner();
	
	void start();
	void end();

}
