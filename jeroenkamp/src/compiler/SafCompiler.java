package compiler;

import java.io.*;

import compiler.types.*;

public class SafCompiler {
	public static void main(String[] args) {
		String s=args[0];
		String response=compile(s);
		System.out.println(response);
		try{
			java.io.FileWriter stream=new FileWriter(args[1]);
			stream.write(response);
		}catch(Exception e){}
	}
	private static String compile(String file){
		try{
			InputStream input=new FileInputStream(file);
			SafLexer  lexer  = new SafLexer(input);

			lexer.nextToken();
			SafParser parser = new SafParser(lexer);
			parser.parse();
			input.close();
			SafObject root=parser.getRootNode();
			return root.toJavaCode();
		}catch(FileNotFoundException fnfe){

		}
		catch(IOException ioe){
			//pointless java
			//file most likely already closed , disposed

		}
		return "error occurred";


	}

	public static void fatalError(String msg) {
		System.out.println("Fatal ERROR: " + msg);
		System.exit(1);
	}
	public static void error(String msg) {
		System.out.println("ERROR: " + msg);
	}
}
