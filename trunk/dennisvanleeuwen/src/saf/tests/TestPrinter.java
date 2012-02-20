package saf.tests;

import org.junit.* ;

import saf.astnodes.Fighter;
import saf.astvisitors.Printer;

import static org.junit.Assert.* ;

public class TestPrinter {
	@Test
	public void test_parsing(){
		String dir = FileLoader.testFileDirectory;
		try{
			Fighter fighter = FileLoader.loadFile(dir + "AllStatements.saf").Fighter();
			String fileContent = FileLoader.readFile(dir + "AllStatements.saf");
			fileContent = fileContent.replaceAll("[ \n\t\r]", "");
			String printedString = Printer.printAsString(fighter).replaceAll("[ \n\t\r]", "");
			assertTrue(printedString.equals(fileContent));
		}
		catch(Exception e){
			//If it throws an exception there is an error!
			assertTrue(false);
		}
	}

}
