package saf.compiler;

import java.io.*;

import saf.compiler.common.ErrorModule;
import saf.compiler.types.Fighter;
import saf.compiler.types.SafObject;

public class SafCompiler {
	public static JavaCode compile(String file){
		final String pack="";
		try{
			InputStream input=new FileInputStream(file);
			SafLexer  lexer  = new SafLexer(input);

			lexer.nextToken();
			SafParser parser = new SafParser(lexer);
			parser.parse();
			input.close();
			ErrorModule mod=ErrorModule.getErrorModule();
			if(mod.canContinue()){
				mod.printErrors();
				SafObject root=parser.getRootNode();
				return toJavaCode(root, pack, ((Fighter)root).getName());
			}
			else{
				mod.printErrors();
				System.exit(1);
			}
		}catch(IOException ioe){
			System.err.println("IO problem with "+file);
		}
		return null;
	}
	private static JavaCode toJavaCode(SafObject saf, String pack, String classname){
		final String packageStr="package "+pack+";\r\n";
		String java= saf.toJavaCode();
		if(! pack.equals("")){
			java=packageStr+java;
		}
		if(pack !=""){
			classname=pack+"."+classname;
		}
		return  new JavaCode( classname,java);
	}
}
