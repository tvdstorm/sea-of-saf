// $ANTLR 3.4 D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g 2012-01-21 22:20:22

  package nl.uva.lap.saf;
  import nl.uva.lap.saf.Fighter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "IDENT", "INTEGER", "MULTICOMMENT", "WS", "'('", "')'", "'='", "'['", "']'", "'always'", "'and'", "'block_high'", "'block_low'", "'choose'", "'crouch'", "'far'", "'kickPower'", "'kickReach'", "'kick_high'", "'kick_low'", "'much_stronger'", "'much_weaker'", "'near'", "'or'", "'punchPower'", "'punchReach'", "'punch_high'", "'punch_low'", "'run_away'", "'run_towards'", "'stand'", "'stronger'", "'walk_away'", "'walk_towards'", "'weaker'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
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


    	//we hold our own fighter and the grammar is going to set its properties for us! 
    	private Fighter f = new Fighter();
    	
    	public Fighter getFighter(){return f;}



    // $ANTLR start "fighter"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:26:1: fighter : IDENT '{' ( statement )* '}' ;
    public final void fighter() throws RecognitionException {
        Token IDENT1=null;

        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:26:8: ( IDENT '{' ( statement )* '}' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:27:2: IDENT '{' ( statement )* '}'
            {
            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter48); 

            match(input,40,FOLLOW_40_in_fighter50); 

            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:27:12: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9||LA1_0==14||(LA1_0 >= 20 && LA1_0 <= 22)||(LA1_0 >= 25 && LA1_0 <= 27)||(LA1_0 >= 29 && LA1_0 <= 30)||LA1_0==36||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:27:12: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_fighter52);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,41,FOLLOW_41_in_fighter55); 

            f.setName((IDENT1!=null?IDENT1.getText():null));

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
    // $ANTLR end "fighter"



    // $ANTLR start "statement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:29:1: statement : ( personalityStatement | behaviourStatement );
    public final void statement() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:29:10: ( personalityStatement | behaviourStatement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 21 && LA2_0 <= 22)||(LA2_0 >= 29 && LA2_0 <= 30)) ) {
                alt2=1;
            }
            else if ( (LA2_0==9||LA2_0==14||LA2_0==20||(LA2_0 >= 25 && LA2_0 <= 27)||LA2_0==36||LA2_0==39) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:30:2: personalityStatement
                    {
                    pushFollow(FOLLOW_personalityStatement_in_statement67);
                    personalityStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:30:25: behaviourStatement
                    {
                    pushFollow(FOLLOW_behaviourStatement_in_statement71);
                    behaviourStatement();

                    state._fsp--;


                    }
                    break;

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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:32:1: personalityStatement : personality '=' INTEGER ;
    public final void personalityStatement() throws RecognitionException {
        Token INTEGER3=null;
        SAFParser.personality_return personality2 =null;


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:32:21: ( personality '=' INTEGER )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:33:2: personality '=' INTEGER
            {
            pushFollow(FOLLOW_personality_in_personalityStatement80);
            personality2=personality();

            state._fsp--;


            match(input,11,FOLLOW_11_in_personalityStatement82); 

            INTEGER3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_personalityStatement84); 

            f.setPersonality((personality2!=null?input.toString(personality2.start,personality2.stop):null), (INTEGER3!=null?INTEGER3.getText():null));

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


    public static class personality_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "personality"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:34:1: personality : ( 'kickPower' | 'punchPower' | 'kickReach' | 'punchReach' );
    public final SAFParser.personality_return personality() throws RecognitionException {
        SAFParser.personality_return retval = new SAFParser.personality_return();
        retval.start = input.LT(1);


        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:34:13: ( 'kickPower' | 'punchPower' | 'kickReach' | 'punchReach' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:
            {
            if ( (input.LA(1) >= 21 && input.LA(1) <= 22)||(input.LA(1) >= 29 && input.LA(1) <= 30) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "personality"



    // $ANTLR start "behaviourStatement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:36:1: behaviourStatement : conditions '[' actionStatement ']' ;
    public final void behaviourStatement() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:36:20: ( conditions '[' actionStatement ']' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:36:22: conditions '[' actionStatement ']'
            {
            pushFollow(FOLLOW_conditions_in_behaviourStatement113);
            conditions();

            state._fsp--;


            match(input,12,FOLLOW_12_in_behaviourStatement115); 

            pushFollow(FOLLOW_actionStatement_in_behaviourStatement117);
            actionStatement();

            state._fsp--;


            match(input,13,FOLLOW_13_in_behaviourStatement119); 

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
    // $ANTLR end "behaviourStatement"



    // $ANTLR start "expression"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:38:1: expression : ( condition | '(' conditions ')' );
    public final void expression() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:38:12: ( condition | '(' conditions ')' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14||LA3_0==20||(LA3_0 >= 25 && LA3_0 <= 27)||LA3_0==36||LA3_0==39) ) {
                alt3=1;
            }
            else if ( (LA3_0==9) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:38:14: condition
                    {
                    pushFollow(FOLLOW_condition_in_expression127);
                    condition();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:38:26: '(' conditions ')'
                    {
                    match(input,9,FOLLOW_9_in_expression131); 

                    pushFollow(FOLLOW_conditions_in_expression133);
                    conditions();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_expression135); 

                    }
                    break;

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
    // $ANTLR end "expression"



    // $ANTLR start "conditions"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:39:1: conditions : expression ( ( 'and' | 'or' ) expression )* ;
    public final void conditions() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:39:12: ( expression ( ( 'and' | 'or' ) expression )* )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:39:14: expression ( ( 'and' | 'or' ) expression )*
            {
            pushFollow(FOLLOW_expression_in_conditions142);
            expression();

            state._fsp--;


            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:39:25: ( ( 'and' | 'or' ) expression )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:39:26: ( 'and' | 'or' ) expression
            	    {
            	    if ( input.LA(1)==15||input.LA(1)==28 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_expression_in_conditions153);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "conditions"



    // $ANTLR start "condition"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:40:1: condition : ( 'far' | 'near' | 'stronger' | 'much_stronger' | 'weaker' | 'much_weaker' | 'always' );
    public final void condition() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:40:11: ( 'far' | 'near' | 'stronger' | 'much_stronger' | 'weaker' | 'much_weaker' | 'always' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:
            {
            if ( input.LA(1)==14||input.LA(1)==20||(input.LA(1) >= 25 && input.LA(1) <= 27)||input.LA(1)==36||input.LA(1)==39 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
        return ;
    }
    // $ANTLR end "condition"



    // $ANTLR start "actionStatement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:43:1: actionStatement : ( action | ( 'choose' '(' ( action )+ ')' ) )+ ;
    public final void actionStatement() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:43:17: ( ( action | ( 'choose' '(' ( action )+ ')' ) )+ )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:43:19: ( action | ( 'choose' '(' ( action )+ ')' ) )+
            {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:43:19: ( action | ( 'choose' '(' ( action )+ ')' ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= 16 && LA6_0 <= 17)||LA6_0==19||(LA6_0 >= 23 && LA6_0 <= 24)||(LA6_0 >= 31 && LA6_0 <= 35)||(LA6_0 >= 37 && LA6_0 <= 38)) ) {
                    alt6=1;
                }
                else if ( (LA6_0==18) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:43:20: action
            	    {
            	    pushFollow(FOLLOW_action_in_actionStatement196);
            	    action();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:43:29: ( 'choose' '(' ( action )+ ')' )
            	    {
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:43:29: ( 'choose' '(' ( action )+ ')' )
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:43:30: 'choose' '(' ( action )+ ')'
            	    {
            	    match(input,18,FOLLOW_18_in_actionStatement201); 

            	    match(input,9,FOLLOW_9_in_actionStatement203); 

            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:43:43: ( action )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0 >= 16 && LA5_0 <= 17)||LA5_0==19||(LA5_0 >= 23 && LA5_0 <= 24)||(LA5_0 >= 31 && LA5_0 <= 35)||(LA5_0 >= 37 && LA5_0 <= 38)) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:43:43: action
            	    	    {
            	    	    pushFollow(FOLLOW_action_in_actionStatement205);
            	    	    action();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);


            	    match(input,10,FOLLOW_10_in_actionStatement208); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


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
    // $ANTLR end "actionStatement"



    // $ANTLR start "action"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:44:1: action : ( 'kick_low' | 'kick_high' | 'punch_low' | 'punch_high' | 'run_away' | 'run_towards' | 'walk_away' | 'walk_towards' | 'stand' | 'crouch' | 'block_low' | 'block_high' );
    public final void action() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:44:8: ( 'kick_low' | 'kick_high' | 'punch_low' | 'punch_high' | 'run_away' | 'run_towards' | 'walk_away' | 'walk_towards' | 'stand' | 'crouch' | 'block_low' | 'block_high' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:
            {
            if ( (input.LA(1) >= 16 && input.LA(1) <= 17)||input.LA(1)==19||(input.LA(1) >= 23 && input.LA(1) <= 24)||(input.LA(1) >= 31 && input.LA(1) <= 35)||(input.LA(1) >= 37 && input.LA(1) <= 38) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
        return ;
    }
    // $ANTLR end "action"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighter48 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fighter50 = new BitSet(new long[]{0x000002906E704200L});
    public static final BitSet FOLLOW_statement_in_fighter52 = new BitSet(new long[]{0x000002906E704200L});
    public static final BitSet FOLLOW_41_in_fighter55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personalityStatement_in_statement67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviourStatement_in_statement71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personality_in_personalityStatement80 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_personalityStatement82 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INTEGER_in_personalityStatement84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditions_in_behaviourStatement113 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviourStatement115 = new BitSet(new long[]{0x0000006F818F0000L});
    public static final BitSet FOLLOW_actionStatement_in_behaviourStatement117 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_behaviourStatement119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_expression127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_expression131 = new BitSet(new long[]{0x000000900E104200L});
    public static final BitSet FOLLOW_conditions_in_expression133 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_conditions142 = new BitSet(new long[]{0x0000000010008002L});
    public static final BitSet FOLLOW_set_in_conditions145 = new BitSet(new long[]{0x000000900E104200L});
    public static final BitSet FOLLOW_expression_in_conditions153 = new BitSet(new long[]{0x0000000010008002L});
    public static final BitSet FOLLOW_action_in_actionStatement196 = new BitSet(new long[]{0x0000006F818F0002L});
    public static final BitSet FOLLOW_18_in_actionStatement201 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_actionStatement203 = new BitSet(new long[]{0x0000006F818B0000L});
    public static final BitSet FOLLOW_action_in_actionStatement205 = new BitSet(new long[]{0x0000006F818B0400L});
    public static final BitSet FOLLOW_10_in_actionStatement208 = new BitSet(new long[]{0x0000006F818F0002L});

}