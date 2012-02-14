package main;

import astelements.Bots;

import visitor.SAFElementValidatorVisitor;

import game.FightStart;
import grammar.ParseException;
public class Main {

	public static void main(String args[]) throws ParseException {
		Bots bots = new Parser("validInput.saf", false).getBots();
		validateBots(bots);
		new FightStart(bots);
	}

	private static void validateBots(Bots bots) {
		try {
			bots.accept(new SAFElementValidatorVisitor());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
