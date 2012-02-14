package main;

import java.io.IOException;

import logger.ErrorLog;
import game.FightStart;
import grammar.ParseException;

import visitor.SAFElementValidatorVisitor;
import astelements.Bots;
public class Main {

	public static void main(String args[]) {
		startGame("C:\\Users\\martijn.van.der.maas\\workspace\\SAF-Martijn\\input\\validInput.saf", false);
	}
	
	public static void startGame(String inputFile, boolean reinit) {
		Bots bots;
		try {
			/* Parse input */
			bots = new Parser(inputFile, reinit).getBots();
		
			try {
				/* Validate input */
				bots.accept(new SAFElementValidatorVisitor());
				
				/* Open FightView */
				new FightStart(bots);
			} catch (Exception e) {
				new ErrorLog("Validation error: " + e.getMessage());
			}
		} catch (ParseException | IOException e) {
			new ErrorLog("Parsing error: " + e.getMessage());
		}
	}
}
