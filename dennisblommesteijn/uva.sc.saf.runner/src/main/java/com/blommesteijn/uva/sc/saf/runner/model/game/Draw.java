package com.blommesteijn.uva.sc.saf.runner.model.game;

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
	
	
	

	public void print(String matrix)
	{
		if( !_printCache.equals(matrix) )
		{
			_view.print(matrix);
			_printCache = matrix;
		}
		
	}



}
