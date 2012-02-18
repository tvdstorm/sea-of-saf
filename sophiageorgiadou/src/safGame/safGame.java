package safGame;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import parser.ParseException;
import parser.Saf;

import abstractSyntaxTree.Fighter;

public class safGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        String safInput;
        InputStream stream = null;
        ArrayList<Fighter> fighters = null;
		try {
			safInput = "fighters.saf";
			stream = new FileInputStream(safInput);
		} catch (IOException e) {
			System.out.println("Parser status:\nERROR: "+e.getMessage());
			e.printStackTrace();
			System.exit(-1);
		}
		
        Saf parser = new Saf(stream);

        System.out.println("Parsing...");
        
		try {
			fighters = parser.Parse();
		} catch (ParseException e) {
			System.out.println("Parser status:\nERROR: "+e.getMessage());
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Parser status: SUCCEED");
		
		System.out.println("Results:");
		System.out.println(fighters);
	}

}
