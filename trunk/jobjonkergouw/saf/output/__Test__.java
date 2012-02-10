import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import saf.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SAFLexer lex = new SAFLexer(new ANTLRFileStream("/Users/job/Programming/svn-sc/saf/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SAFParser g = new SAFParser(tokens, 49100, null);
        try {
            g.fighter();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}