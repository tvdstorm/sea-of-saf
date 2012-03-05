package com.blommesteijn.uva.sc.saf.runner.model.game;

import com.blommesteijn.uva.sc.saf.runner.model.utils.Common;
import com.blommesteijn.uva.sc.saf.runner.view.IView;

public class Draw implements IDraw
{
	private IView _view = null;
	private String _printCache = null;
	
	public Draw(IView view)
	{
		_view = view;
		_printCache = "";
	}
	
	
	

	public void printRaw(String matrix)
	{
		if( !_printCache.equals(matrix) )
		{
			_view.print(matrix);
			_printCache = matrix;
		}
	}


	public void clear()
	{
		// TODO Auto-generated method stub
		_view.print("");
	}

	public void printAll(char value)
	{
		int width = 40;
		int height = 20;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < height; i ++)
		{
			for(int j = 0; j < width; j++)
			{
				sb.append(value);
			}
			sb.append(Common.NEW_LINE);
		}
		_view.print(sb.toString());
	}
	

	
	public void printFighter(String[] attack, int position)
	{
		StringBuilder sb = new StringBuilder();
		for(String a : attack)
		{
			sb.append(a).append(Common.NEW_LINE);
		}
		_view.print(sb.toString());
	}



}
