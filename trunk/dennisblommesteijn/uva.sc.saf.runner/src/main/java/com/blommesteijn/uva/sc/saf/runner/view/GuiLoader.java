package com.blommesteijn.uva.sc.saf.runner.view;

import java.awt.EventQueue;

import javax.swing.JPanel;

import com.blommesteijn.uva.sc.saf.runner.view.app.GuiApplication;

public class GuiLoader implements IView
{
	private GuiApplication _window = null;
	
	public GuiLoader()
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					_window = new GuiApplication();
					_window.getFrame().setVisible(true);					
				}
				catch (Exception e)
				{
				}
			}
		});
		
		//spin-lock
		while(_window == null)
		{
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
			}
		}
	}

	public void print(String string)
	{
		_window.setOutputText(string);
	}
	
	
}
