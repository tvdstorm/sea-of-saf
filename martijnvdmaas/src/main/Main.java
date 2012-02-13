package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import grammar.SAFGrammar;

public class Main {

	public static void main(String args[]) {
		try {
		String projectPath = new java.io.File(".").getCanonicalPath();
		String fileName = "validInput.saf";

		InputStream fileContent;
			fileContent = new FileInputStream(projectPath
					+ "/src/input/" + fileName);
			
			new SAFGrammar(fileContent);
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
