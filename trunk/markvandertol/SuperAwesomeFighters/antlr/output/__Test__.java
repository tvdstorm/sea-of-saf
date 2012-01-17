import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SuperAwesomeFightersLexer lex = new SuperAwesomeFightersLexer(new ANTLRFileStream("C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SuperAwesomeFightersParser g = new SuperAwesomeFightersParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}