package saf.tests;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import parser.SAFParser;

public class FileLoader {
	public static final String testFileDirectory = "N:/SoftwareConstruction/SVN/dennisvanleeuwen/src/saf/tests/exampleFighters/";
	
	public static SAFParser loadFile(String file){
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
	
	public static String readFile(String file) throws IOException {
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
