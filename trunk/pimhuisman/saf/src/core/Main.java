// Copyright © Pim Huisman 2012.
package core;

import gui.BaseFrame;
import gui.MenuScreen;
import javax.swing.*;

public class Main extends BaseFrame {  
	
	private static final long serialVersionUID = 1L;
	
	public Main() {
		
	}

	@Override
	public void onInitialize() {
		setTitle("SAF Redux - Pim Huisman © 2012");
	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	setSize(1280, 720);
	 	switchScreen(new MenuScreen(this));
	}
	
	@Override
	public void onUpdate() {
		
	}

	@Override
	public void onDestroy() {

	}
	
	public static void main(String[]args) {  
		
		Main game = new Main();
		game.initialize();
		Boolean updating = true;
		while ( updating ) {
			updating = game.update();
			if ( updating ) {
				game.draw();
			}
			try {
				Thread.sleep(100); // Update 10 times per second.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		game.destroy();
		
	}
	
}
