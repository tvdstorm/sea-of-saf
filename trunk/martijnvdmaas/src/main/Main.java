package main;

import constants.SAFConstants;
import game.FightStart;

import visitor.SAFElementValidatorVisitor;
import astelements.Bots;
public class Main {

	public static void main(String args[]) throws Exception {
		/* Parse input */
		Bots bots = new Parser("validInput.saf", false).getBots();
		/* Validate input */
		bots.accept(new SAFElementValidatorVisitor());

		/* Open FightView */
		new FightStart(bots);
	}
}
