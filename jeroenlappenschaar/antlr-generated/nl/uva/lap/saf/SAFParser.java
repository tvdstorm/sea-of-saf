// $ANTLR 3.4 D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g 2012-02-17 04:14:56

  package nl.uva.lap.saf;
  import nl.uva.lap.saf.ast.fighter.Fighter;
  import nl.uva.lap.saf.ast.fighter.Personality;
  import nl.uva.lap.saf.ast.fighter.Behaviour;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "IDENT", "INTEGER", "MULTICOMMENT", "WS", "'='", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int COMMENT=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int MULTICOMMENT=7;
    public static final int WS=8;

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
    public String getGrammarFileName() { return "D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g"; }


    	Fighter fighter;
    	List<Personality> personalities = new ArrayList<Personality>();
    	List<Behaviour> behaviours = new ArrayList<Behaviour>();



    // $ANTLR start "fighter"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:29:1: fighter returns [Fighter fighter] : name= IDENT '{' ( statement )* '}' ;
    public final Fighter fighter() throws RecognitionException {
        Fighter fighter = null;


        Token name=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:29:34: (name= IDENT '{' ( statement )* '}' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:29:36: name= IDENT '{' ( statement )* '}'
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter57); 

            match(input,10,FOLLOW_10_in_fighter59); 

            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:29:51: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:29:51: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_fighter61);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,11,FOLLOW_11_in_fighter64); 

            fighter = new Fighter((name!=null?name.getText():null), personalities, behaviours);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return fighter;
    }
    // $ANTLR end "fighter"



    // $ANTLR start "statement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:32:1: statement : personalityStatement ;
    public final void statement() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:32:10: ( personalityStatement )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:32:12: personalityStatement
            {
            pushFollow(FOLLOW_personalityStatement_in_statement75);
            personalityStatement();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "personalityStatement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:34:1: personalityStatement : personality= IDENT '=' value= INTEGER ;
    public final void personalityStatement() throws RecognitionException {
        Token personality=null;
        Token value=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:34:21: (personality= IDENT '=' value= INTEGER )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:34:23: personality= IDENT '=' value= INTEGER
            {
            personality=(Token)match(input,IDENT,FOLLOW_IDENT_in_personalityStatement84); 

            match(input,9,FOLLOW_9_in_personalityStatement86); 

            value=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_personalityStatement90); 

            personalities.add(new Personality((personality!=null?personality.getText():null), (value!=null?value.getText():null)));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "personalityStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighter57 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_fighter59 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_statement_in_fighter61 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_fighter64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personalityStatement_in_statement75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_personalityStatement84 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_personalityStatement86 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INTEGER_in_personalityStatement90 = new BitSet(new long[]{0x0000000000000002L});

}