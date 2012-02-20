package com.blommesteijn.uva.sc.saf.runner.view;

import java.awt.EventQueue;

import com.blommesteijn.uva.sc.saf.runner.view.app.GuiApplication;

public class GuiLoader
{
	public GuiLoader()
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					GuiApplication window = new GuiApplication();
					window.getFrame().setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
