package main;

import grammar.ParseException;
import grammar.SAFGrammar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import astelements.Bots;

public class Parser {

	private Bots bots;
	private boolean reinit;

	public Parser(String inputFile, boolean reinit) throws ParseException {
		this.reinit = reinit;
		InputStream fileContent = getInputFileStream(inputFile);
		setBots(parseFileContent(fileContent));
	}

	private Bots parseFileContent(InputStream fileContent) throws ParseException {
		if (!reinit) {
			new SAFGrammar(fileContent);
			return SAFGrammar.Start();
		} else {
			SAFGrammar.ReInit(fileContent);
			return SAFGrammar.Start();
		}
	}

	private InputStream getInputFileStream(String fileName) {
		InputStream fileContent;
		try {
			String projectPath = new java.io.File(".").getCanonicalPath();

			fileContent = new FileInputStream(projectPath + "/src/input/"
					+ fileName);
			return fileContent;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Bots getBots() {
		return bots;
	}

	public void setBots(Bots bots) {
		this.bots = bots;
	}
}
