// Copyright © Pim Huisman 2012.
package core;
import data.Fighter;
import gui.BaseFrame;
import gui.BaseScreen;
import gui.MenuButton;
import gui.MenuScreen;
import gui.SoundFile;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.swing.*;




public class Main {

	public static void main(String[] args) throws Exception {
			
		FighterLoader loader = new ANTLRFighterLoader();
		Fighter fighter = loader.loadFighterByFile("data/fighters/jackiechan.saf");
		
		TypeCheckerVisitor typeChecker = new TypeCheckerVisitor();
		ConsoleTreeVisitor consolePrinter = new ConsoleTreeVisitor();
		
		fighter.acceptTreeVisitor(typeChecker);
		fighter.acceptTreeVisitor(consolePrinter);
		
		typeChecker.printErrorsInConsole();
		
	}
	
}

/*

public class Main extends BaseFrame {  
	
	private static final long serialVersionUID = 1L;
	
	public Main() {

	}
	
	public static void main(String[]args) {  
		Main game = new Main();
		game.switchScreen(new MenuScreen(game));
		game.initialize();
	}

	@Override
	public void onInitialize() {
		setTitle("SAF Redux - Pim Huisman © 2012");
	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	setSize(1280, 720);
	}

	@Override
	public void onDestroy() {

	}
	
}*/
