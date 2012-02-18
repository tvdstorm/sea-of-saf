package main;

import game.FightStart;
import grammar.ParseException;

import java.io.File;
import java.io.IOException;

import logger.ErrorLog;
import visitor.SAFElementValidatorVisitor;
import astelements.Bots;

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
				bots.accept(new SAFElementValidatorVisitor());

				/* Open FightView */
				new FightStart(bots);
			}
			catch (Exception e)
			{
				new ErrorLog("Validation error: " + e.getMessage());
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
		String relativePath = relativePathFile.getAbsolutePath();
		return relativePath + '\\';
	}
}
