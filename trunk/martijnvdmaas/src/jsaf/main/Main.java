package jsaf.main;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jsaf.astelements.Bots;
import jsaf.game.FightStart;
import jsaf.grammar.ParseException;
import jsaf.logger.ErrorLog;
import jsaf.visitor.SAFElementValidatorVisitor;


public class Main
{

	public static void main(String args[])
	{
		startGame(getRelativeProjectPath() + "input\\validInput.saf");
	}

	public static void startGame(String inputFile)
	{
		Bots bots;
		try
		{
			/* Parse input */
			bots = new Parser(inputFile).getBots();

			try
			{
				/* Validate input */
				
				SAFElementValidatorVisitor validator = new SAFElementValidatorVisitor();
				bots.accept(validator);
				
				List<String> errorMessages = new ArrayList<String>(validator.getErrorMessages());
				
				if(!errorMessages.isEmpty()) 
				{
					throw new Exception();
				}
				
				/* Open FightView */
				new FightStart(bots);
			}
			catch (Exception e)
			{
				new ErrorLog("Validation error.");
			}
		}
		catch (ParseException | IOException e)
		{
			new ErrorLog("Parsing error: " + e.getMessage());
		}
	}

	public static String getRelativeProjectPath()
	{
		File relativePathFile = new File("");
		String relativePath = relativePathFile.getAbsolutePath() + '\\';
		return relativePath;
	}
}
