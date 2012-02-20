package com.blommesteijn.uva.sc.saf.runner.model.game;

import java.util.List;

public interface IGameRunner extends Runnable
{
	void start();
	void join() throws InterruptedException;

	void setContext(List<IGameContext> gameContexts);
	
	boolean isSkippingDraw();
}
