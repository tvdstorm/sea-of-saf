package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import reader.antlr.SAFLexer;
import reader.antlr.SAFParser;
import fighter.IFighter;
import fighter.checker.SemanticChecker;
import fighter.gui.FightArena;
import fighter.messages.Message;
import fighter.messages.Error;

public class Main {
	private static List<Message> messages;
	private static FightArena fightArena;
	private static final String firstFile = "firstFighter.txt";
	private static final String secondFile = "secondFighter.txt";
	private static IFighter firstFighter = null;
	private static IFighter secondFighter = null;

	public static void main(String[] args) {
		messages = new ArrayList<Message>();
		readFighters();
		fightArena = FightArena.initGui(firstFighter, secondFighter);
		reportPossibleProblems();

		messages = SemanticChecker.checkFighter(firstFighter);
		reportPossibleProblems();
		messages = SemanticChecker.checkFighter(secondFighter);
		reportPossibleProblems();

		FightArena.startGame(firstFighter, secondFighter, messages);
	}

	private static void reportPossibleProblems() {
		if (messages.size() != 0) {
			fightArena.showMessages(messages);
			System.exit(0);
		}
	}

	private static void readFighters() {
		try {
			firstFighter = getFighterFromFile(firstFile);
			secondFighter = getFighterFromFile(secondFile);
		} catch (RecognitionException e) {
			messages.add(new Error(e.getMessage()));
		}
	}

	private static IFighter getFighterFromFile(String fileName)
			throws RecognitionException {
		IFighter fighter;
		SAFParser parser;
		String inputFile = "." + File.separator + "tests" + File.separator
				+ "inputFiles" + File.separator + fileName;
		CharStream chStream = null;
		try {
			chStream = new ANTLRFileStream(inputFile);
		} catch (IOException e1) {
			messages.add(new Error(
					"Could not find or read the grammar input file "
							+ inputFile));
			return null;
		}
		SAFLexer lexer = new SAFLexer(chStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		parser = new SAFParser(tokenStream);
		fighter = parser.fighter();
		return fighter;
	}
}
