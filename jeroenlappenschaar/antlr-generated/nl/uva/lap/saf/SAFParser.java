// $ANTLR 3.4 D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g 2012-01-21 14:33:32

  package nl.uva.lap.saf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "IDENT", "INTEGER", "MULTICOMMENT", "WS", "'('", "')'", "'='", "'['", "']'", "'always'", "'block_high'", "'block_low'", "'choose'", "'crouch'", "'far'", "'kickPower'", "'kickReach'", "'kick_high'", "'kick_low'", "'much_stronger'", "'much_weaker'", "'near'", "'punchPower'", "'punchReach'", "'punch_high'", "'punch_low'", "'run_away'", "'run_towards'", "'stand'", "'stronger'", "'walk_away'", "'walk_towards'", "'weaker'", "'{'", "'}'"
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



    // $ANTLR start "fighter"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:15:1: fighter : IDENT '{' ( statement )* '}' ;
    public final void fighter() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:15:9: ( IDENT '{' ( statement )* '}' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:15:11: IDENT '{' ( statement )* '}'
            {
            match(input,IDENT,FOLLOW_IDENT_in_fighter39); 

            match(input,38,FOLLOW_38_in_fighter41); 

            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:15:21: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0 >= 19 && LA1_0 <= 21)||(LA1_0 >= 24 && LA1_0 <= 28)||LA1_0==34||LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:15:21: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_fighter43);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,39,FOLLOW_39_in_fighter46); 

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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:17:1: statement : ( personalityStatement | behaviourStatement );
    public final void statement() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:17:11: ( personalityStatement | behaviourStatement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 20 && LA2_0 <= 21)||(LA2_0 >= 27 && LA2_0 <= 28)) ) {
                alt2=1;
            }
            else if ( (LA2_0==14||LA2_0==19||(LA2_0 >= 24 && LA2_0 <= 26)||LA2_0==34||LA2_0==37) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:17:13: personalityStatement
                    {
                    pushFollow(FOLLOW_personalityStatement_in_statement55);
                    personalityStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:17:36: behaviourStatement
                    {
                    pushFollow(FOLLOW_behaviourStatement_in_statement59);
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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:19:1: personalityStatement : personality '=' INTEGER ;
    public final void personalityStatement() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:19:22: ( personality '=' INTEGER )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:19:24: personality '=' INTEGER
            {
            pushFollow(FOLLOW_personality_in_personalityStatement67);
            personality();

            state._fsp--;


            match(input,11,FOLLOW_11_in_personalityStatement69); 

            match(input,INTEGER,FOLLOW_INTEGER_in_personalityStatement71); 

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



    // $ANTLR start "personality"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:20:1: personality : ( 'kickPower' | 'punchPower' | 'kickReach' | 'punchReach' );
    public final void personality() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:20:13: ( 'kickPower' | 'punchPower' | 'kickReach' | 'punchReach' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:
            {
            if ( (input.LA(1) >= 20 && input.LA(1) <= 21)||(input.LA(1) >= 27 && input.LA(1) <= 28) ) {
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
    // $ANTLR end "personality"



    // $ANTLR start "behaviourStatement"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:22:1: behaviourStatement : condition '[' actionStatement ']' ;
    public final void behaviourStatement() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:22:20: ( condition '[' actionStatement ']' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:22:22: condition '[' actionStatement ']'
            {
            pushFollow(FOLLOW_condition_in_behaviourStatement98);
            condition();

            state._fsp--;


            match(input,12,FOLLOW_12_in_behaviourStatement100); 

            pushFollow(FOLLOW_actionStatement_in_behaviourStatement102);
            actionStatement();

            state._fsp--;


            match(input,13,FOLLOW_13_in_behaviourStatement104); 

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



    // $ANTLR start "condition"
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:23:1: condition : ( 'far' | 'near' | 'stronger' | 'much_stronger' | 'weaker' | 'much_weaker' | 'always' );
    public final void condition() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:23:11: ( 'far' | 'near' | 'stronger' | 'much_stronger' | 'weaker' | 'much_weaker' | 'always' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:
            {
            if ( input.LA(1)==14||input.LA(1)==19||(input.LA(1) >= 24 && input.LA(1) <= 26)||input.LA(1)==34||input.LA(1)==37 ) {
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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:26:1: actionStatement : ( action | ( 'choose' '(' ( action )+ ')' ) )+ ;
    public final void actionStatement() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:26:17: ( ( action | ( 'choose' '(' ( action )+ ')' ) )+ )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:26:19: ( action | ( 'choose' '(' ( action )+ ')' ) )+
            {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:26:19: ( action | ( 'choose' '(' ( action )+ ')' ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= 15 && LA4_0 <= 16)||LA4_0==18||(LA4_0 >= 22 && LA4_0 <= 23)||(LA4_0 >= 29 && LA4_0 <= 33)||(LA4_0 >= 35 && LA4_0 <= 36)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==17) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:26:20: action
            	    {
            	    pushFollow(FOLLOW_action_in_actionStatement145);
            	    action();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:26:29: ( 'choose' '(' ( action )+ ')' )
            	    {
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:26:29: ( 'choose' '(' ( action )+ ')' )
            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:26:30: 'choose' '(' ( action )+ ')'
            	    {
            	    match(input,17,FOLLOW_17_in_actionStatement150); 

            	    match(input,9,FOLLOW_9_in_actionStatement152); 

            	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:26:43: ( action )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0 >= 15 && LA3_0 <= 16)||LA3_0==18||(LA3_0 >= 22 && LA3_0 <= 23)||(LA3_0 >= 29 && LA3_0 <= 33)||(LA3_0 >= 35 && LA3_0 <= 36)) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:26:43: action
            	    	    {
            	    	    pushFollow(FOLLOW_action_in_actionStatement154);
            	    	    action();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);


            	    match(input,10,FOLLOW_10_in_actionStatement157); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:27:1: action : ( 'kick_low' | 'kick_high' | 'punch_low' | 'punch_high' | 'run_away' | 'run_towards' | 'walk_away' | 'walk_towards' | 'stand' | 'crouch' | 'block_low' | 'block_high' );
    public final void action() throws RecognitionException {
        try {
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:27:8: ( 'kick_low' | 'kick_high' | 'punch_low' | 'punch_high' | 'run_away' | 'run_towards' | 'walk_away' | 'walk_towards' | 'stand' | 'crouch' | 'block_low' | 'block_high' )
            // D:\\Jeroen\\Uni\\SC\\workspace\\SAF\\src\\nl\\uva\\lap\\saf\\SAF.g:
            {
            if ( (input.LA(1) >= 15 && input.LA(1) <= 16)||input.LA(1)==18||(input.LA(1) >= 22 && input.LA(1) <= 23)||(input.LA(1) >= 29 && input.LA(1) <= 33)||(input.LA(1) >= 35 && input.LA(1) <= 36) ) {
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


 

    public static final BitSet FOLLOW_IDENT_in_fighter39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fighter41 = new BitSet(new long[]{0x000000A41F384000L});
    public static final BitSet FOLLOW_statement_in_fighter43 = new BitSet(new long[]{0x000000A41F384000L});
    public static final BitSet FOLLOW_39_in_fighter46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personalityStatement_in_statement55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviourStatement_in_statement59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personality_in_personalityStatement67 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_personalityStatement69 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INTEGER_in_personalityStatement71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviourStatement98 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviourStatement100 = new BitSet(new long[]{0x0000001BE0C78000L});
    public static final BitSet FOLLOW_actionStatement_in_behaviourStatement102 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_behaviourStatement104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_actionStatement145 = new BitSet(new long[]{0x0000001BE0C78002L});
    public static final BitSet FOLLOW_17_in_actionStatement150 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_actionStatement152 = new BitSet(new long[]{0x0000001BE0C58000L});
    public static final BitSet FOLLOW_action_in_actionStatement154 = new BitSet(new long[]{0x0000001BE0C58400L});
    public static final BitSet FOLLOW_10_in_actionStatement157 = new BitSet(new long[]{0x0000001BE0C78002L});

}