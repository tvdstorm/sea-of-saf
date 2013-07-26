package com.yennick.fighter;

import java.io.IOException;

import org.antlr.runtime.RecognitionException;

import com.yennick.fight.Engine;
import com.yennick.gui.Gui;


public class Exec {
	
	public static void main(String[] args) throws RecognitionException, IOException{

		System.setProperty("apple.laf.useScreenMenuBar", "true");
	    System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Aliquam Pugnator");

		Engine engine = new Engine();
		new Gui(engine);
	}
}
