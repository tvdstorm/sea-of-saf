package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import elements.Bots;


import visitor.SAFElementValidatorVisitor;


import game.FightStart;
import grammar.ParseException;
import grammar.SAFGrammar;

public class Main {

	public static void main(String args[]) {
			InputStream fileContent = getInputFileStream("validInput.saf");		
			Bots bots = parseFileContent(fileContent);					
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

	private static Bots parseFileContent(InputStream fileContent) {
		try {
			new SAFGrammar(fileContent);
			return SAFGrammar.Start();
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static InputStream getInputFileStream(String fileName) {
		InputStream fileContent;
		try {
			String projectPath = new java.io.File(".").getCanonicalPath();

			fileContent = new FileInputStream(projectPath
					+ "/src/input/" + fileName);
			return fileContent;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
