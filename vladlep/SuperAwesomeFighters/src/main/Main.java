package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import reader.antlr.SAFLexer;
import reader.antlr.SAFParser;
import fighter.IFighter;
import fighter.algorithm.MainAlgorithm;
import fighter.checker.SemanticChecker;
import fighter.gui.FightArena;
import fighter.gui.MessageReporter;
import fighter.messages.Message;
import fighter.messages.Error;

public class Main {
	private static List<Message> messages;
	private static final String firstFile = "firstFighter.txt";
	private static final String secondFile = "secondFighter.txt";
	private static IFighter firstFighter = null;
	private static IFighter secondFighter = null;
	private static MessageReporter messageReporter;
	
	public static void main(String[] args) {
		messages = new ArrayList<Message>();
		readFighters();

		messageReporter =  MessageReporter.getMessageReporter(new JFrame());
		reportPossibleProblems();

		messages = SemanticChecker.checkFighter(firstFighter);
		reportPossibleProblems();
		messages = SemanticChecker.checkFighter(secondFighter);
		reportPossibleProblems();
	
		MainAlgorithm.setUpFight(firstFighter, secondFighter);
		MainAlgorithm.simulateFight();
	}

	private static void reportPossibleProblems() {
		if (messages.size() != 0) {
			messageReporter.reportMessages(messages);
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
		String inputFile = "." + File.separator + "input" + File.separator
				+ "files" + File.separator + fileName;
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
