package main;

import game.controller.FightController;
import java.io.*;
import java.util.ArrayList;
import model.*;
import util.*;
import alert.*;

public class Main  {
	public static void main(String[] args) throws Exception {

		FighterCompiler fc = new FighterCompiler();

		FileInputStream fighterLeftFile = new FileInputStream("D:/Dropbox/Dropbox/Software Construction/workspace/SC12/fighter_definition/chicken.saf");
		FileInputStream fighterRightFile = new FileInputStream("D:/Dropbox/Dropbox/Software Construction/workspace/SC12/fighter_definition/heman.saf");

		final Fighter fighterLeft = fc.compileFighter(fighterLeftFile);
		final Fighter fighterRight = fc.compileFighter(fighterRightFile);

		VisitorController vc = new VisitorController();
		VisitorController vc1 = new VisitorController();

		ArrayList<Alert> alert = vc.checker(fighterLeft);
		ArrayList<Alert> alert1 = vc1.checker(fighterRight);

		for (int i=0; i < alert.size();i++){
			System.out.println("Alert found: "+alert.get(i).getAlert());
		}

		for (int i=0; i < alert1.size();i++){
			System.out.println("Alert found: "+ alert1.get(i).getAlert());
		}
		FightController mc = new FightController(fighterLeft, fighterRight);

		try {
			long start = System.nanoTime();    
			mc.startFight();
			long elapsedTime = System.nanoTime() - start;
			System.out.println("	" + "Total Fight time : "+ (elapsedTime / 1000000) + " miliseconds");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
