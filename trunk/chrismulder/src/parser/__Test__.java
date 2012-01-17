import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;
import parser.*;

public class __Test__ {

    public static void main(String args[]) throws Exception {
        FDLLexer lex = new FDLLexer(new ANTLRFileStream("C:\\Users\\Chris\\school\\SAFplayer\\src\\parser\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        FDLParser g = new FDLParser(tokens, 49100, null);
        try {
            g.saf();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}