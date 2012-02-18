package logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

public class ErrorLog
{
	private static String logFile = "error.log";

	public ErrorLog(String errorMessage)
	{
		System.err.println(errorMessage);
		try
		{
			String projectPath = new java.io.File(".").getCanonicalPath();

			FileWriter fstream = new FileWriter(projectPath + "/" + logFile, true);
			BufferedWriter out = new BufferedWriter(fstream);

			out.write(new Date().toString() + " " + errorMessage + "\n");
			out.close();
		}
		catch (Exception e)
		{
			System.err.println("LOG Error: " + e.getMessage());
		}

	}

	public static void throwException(Exception exception) throws Exception
	{
		try
		{
			String projectPath = new java.io.File(".").getCanonicalPath();

			FileWriter fstream = new FileWriter(projectPath + "/" + logFile, true);
			BufferedWriter out = new BufferedWriter(fstream);

			out.write(new Date().toString() + " " + exception.getMessage() + "\n");
			out.close();
		}
		catch (Exception e)
		{
			System.err.println("LOG Error: " + e.getMessage());
		}
		throw exception;
	}
}
