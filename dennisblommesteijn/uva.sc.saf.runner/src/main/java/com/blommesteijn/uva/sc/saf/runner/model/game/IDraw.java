package com.blommesteijn.uva.sc.saf.runner.model.game;

public interface IDraw
{
	void printRaw(String string);
	void printAll(char value);

	
	void clear();
	void printFighter(String[] attack, int position);
}
