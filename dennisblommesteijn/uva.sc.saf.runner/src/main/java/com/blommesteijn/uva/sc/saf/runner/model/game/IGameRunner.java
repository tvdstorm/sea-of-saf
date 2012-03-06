package com.blommesteijn.uva.sc.saf.runner.model.game;

import java.util.List;

public interface IGameRunner extends Runnable
{
	void start();
	void join() throws InterruptedException;
	void stop();

	void setContext(List<IGameContext> gameContexts);
	
	boolean isSkippingDraw();
}
