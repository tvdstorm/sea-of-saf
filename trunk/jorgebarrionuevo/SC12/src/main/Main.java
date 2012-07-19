package main;

import game.controller.FightController;
import java.io.*;
import java.util.ArrayList;
import model.*;
import util.*;
import alert.*;

public class Main  {
	public static void main(String[] args) throws Exception {

		FighterCompiler fighterCompiler = new FighterCompiler();

		FileInputStream fighterLeftFile = new FileInputStream("D:/Dropbox/Dropbox/Software Construction/workspace/SC12/fighter_definition/skeletor.saf");
		FileInputStream fighterRightFile = new FileInputStream("D:/Dropbox/Dropbox/Software Construction/workspace/SC12/fighter_definition/heman.saf");

		final Fighter fighterLeft = fighterCompiler.compileFighter(fighterLeftFile);
		final Fighter fighterRight = fighterCompiler.compileFighter(fighterRightFile);

		VisitorController visitiorControllerLeftFighter = new VisitorController();
		VisitorController visitorControllerRightFighter = new VisitorController();

		ArrayList<Alert> alertFighterLeft = visitiorControllerLeftFighter.checker(fighterLeft);
		ArrayList<Alert> alertFighterRight = visitorControllerRightFighter.checker(fighterRight);
		
		AlertProcessor alertProcessor = new AlertProcessor();
		
		if(!alertProcessor.isErrorFound(alertFighterLeft) && !alertProcessor.isErrorFound(alertFighterRight)){
			FightController fightController = new FightController(fighterLeft, fighterRight);
			long start = System.nanoTime();    
			fightController.startFight(start);
		}
		else{
			System.out.println("Battle not processed: Errors found");
		}
	}
}
