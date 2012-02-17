package saf.tests;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.* ;

import parser.SAFParser;

import saf.astelements.Arena;
import saf.astelements.Fighter;
import saf.astvisitors.Printer;
import saf.astvisitors.Validator;

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(parser != null);
		return parser;
	}
	
	private String readFile(String file) throws IOException {
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
