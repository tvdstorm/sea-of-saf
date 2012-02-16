package saf;

import saf.parser.SAFParser;
import saf.syntax.Fighter;

import org.antlr.runtime.RecognitionException;

public class Main
{
    public static void main(String[] args)
        throws RecognitionException, java.io.IOException
    {
        for (String s : args)
        {
            Fighter fighter = SAFParser.parseFromFile(s);
            System.out.println(fighter.toString());
        }
    }
}
