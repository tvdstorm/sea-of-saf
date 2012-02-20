package jsaf.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import jsaf.astelements.Bots;
import jsaf.grammar.ParseException;
import jsaf.grammar.SAFGrammar;

public class Parser {

	private Bots bots;

	public Parser(String inputFile) throws ParseException, IOException {
		InputStream fileContent = getInputFileStream(inputFile);
		setBots(parseFileContent(fileContent));
	}

	private Bots parseFileContent(InputStream fileContent) throws ParseException {
		SAFGrammar grammer = new SAFGrammar(fileContent);
		return grammer.Start();
	}

	private InputStream getInputFileStream(String fileName) throws IOException {
			InputStream fileContent = new FileInputStream(fileName);
			return fileContent;
	}

	public Bots getBots() {
		return bots;
	}

	public void setBots(Bots bots) {
		this.bots = bots;
	}
}
