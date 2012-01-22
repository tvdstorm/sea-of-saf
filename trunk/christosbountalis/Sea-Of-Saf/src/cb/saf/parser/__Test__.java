package cb.saf.parser;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import cb.saf.parser.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SafgrammarLexer lex = new SafgrammarLexer(new ANTLRFileStream("C:\\Sea-Of-Saf\\examples\\chicken", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SafgrammarParser g = new SafgrammarParser(tokens, null);
        

    }
}