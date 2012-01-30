package compiler;

import java.io.*;

class SafCompiler {
  public static void main(String[] args) {
	  String s="c:\\fighter.saf";
	  String response=compile(s);
	  System.out.println(response);
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
		return root.toString();
	  }catch(FileNotFoundException fnfe){
		  
	  }
	  catch(IOException ioe){
		  //pointless java
		  //file most likely already closed , disposed

	  }
	  return "error occurred";
	  

  }
	
  static void fatalError(String msg) {
	System.out.println("Fatal ERROR: " + msg);
	System.exit(1);
  }
  static void error(String msg) {
		System.out.println("ERROR: " + msg);
  }
}
