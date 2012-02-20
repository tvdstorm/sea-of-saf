import org.junit.*;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public abstract class RedirectOutput
{
    private static PrintStream systemStdout;
    private static PrintStream systemStderr;

    public static void redirectTo(String fileName)
    {
        try
        {
            systemStdout = System.out;
            systemStderr = System.err;

            PrintStream logFile = new PrintStream(fileName);
            System.setOut(logFile);
            System.setErr(logFile);
        } catch (FileNotFoundException e)
        {
            System.err.println("Couldn't open log file\n" + e.getMessage());
        }
    }

    @AfterClass
    public static void unRedirect()
    {
        System.setOut(systemStdout);
        System.setErr(systemStderr);
    }
}

