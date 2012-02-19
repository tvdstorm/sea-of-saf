package saf.tests;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import org.junit.* ;

import parser.SAFParser;

import saf.astelements.Fighter;
import saf.astvisitors.Printer;

import static org.junit.Assert.* ;

public class PrinterTest {
	@Test
	public void test_parsing(){
		String dir = "N:\\SoftwareConstruction\\SVN\\dennisvanleeuwen\\src\\saf\\tests\\exampleFighters\\";
		try{
			Fighter fighter = loadFile(dir + "AllStatements.saf").Fighter();
			String fileContent = readFile(dir + "AllStatements.saf");
			fileContent = fileContent.replaceAll("[ \n\t\r]", "");
			String printedString = Printer.printAsString(fighter).replaceAll("[ \n\t\r]", "");
			assertTrue(printedString.equals(fileContent));
		}
		catch(Exception e){
			//If it throws an exception there is an error!
			assertTrue(false);
		}
	}
	
	public SAFParser loadFile(String file){
		SAFParser parser = null;
		try {
			InputStream inputStream = new FileInputStream(file);
			parser = new SAFParser(inputStream);
		} catch (FileNotFoundException e) {
			assertTrue(false);
		}
		assertTrue(parser != null);
		return parser;
	}
	
	private String readFile(String file) throws IOException {
		//Uses Filereader and buffered because this way reading can be done by getting each line instead of character.
	    BufferedReader reader = new BufferedReader(new FileReader(file));
	    String line  = null;
	    StringBuilder stringBuilder = new StringBuilder();
	    String ls = System.getProperty("line.separator");
	    while((line = reader.readLine()) != null){
	        stringBuilder.append(line);
	        stringBuilder.append(ls);
	    }
	    return stringBuilder.toString();
	 }

}