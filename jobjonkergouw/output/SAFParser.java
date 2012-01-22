// $ANTLR 3.4 /Users/job/Desktop/grammars/saf/SAF.g 2012-01-22 16:59:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int ID=4;
    public static final int INT=5;
    public static final int NEWLINE=6;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SAFParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SAFParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SAFParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/job/Desktop/grammars/saf/SAF.g"; }



    // $ANTLR start "fighter"
    // /Users/job/Desktop/grammars/saf/SAF.g:3:1: fighter returns [String name] : (fighterName= ID '{' '}' ) ;
    public final String fighter() throws RecognitionException {
        String name = null;


        Token fighterName=null;


        	name = "";

        try {
            // /Users/job/Desktop/grammars/saf/SAF.g:7:2: ( (fighterName= ID '{' '}' ) )
            // /Users/job/Desktop/grammars/saf/SAF.g:7:4: (fighterName= ID '{' '}' )
            {
            // /Users/job/Desktop/grammars/saf/SAF.g:7:4: (fighterName= ID '{' '}' )
            // /Users/job/Desktop/grammars/saf/SAF.g:8:3: fighterName= ID '{' '}'
            {
            fighterName=(Token)match(input,ID,FOLLOW_ID_in_fighter27); 

            name = (fighterName!=null?fighterName.getText():null);

            match(input,7,FOLLOW_7_in_fighter34); 

            match(input,8,FOLLOW_8_in_fighter36); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "fighter"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_fighter27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_fighter34 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_fighter36 = new BitSet(new long[]{0x0000000000000002L});

}