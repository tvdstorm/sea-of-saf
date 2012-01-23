// $ANTLR 3.4 C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g 2012-01-23 17:26:57

  package grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "IDENT", "INTEGER", "LETTER", "WS", "'('", "')'", "'='", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int DIGIT=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int LETTER=7;
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
    public String getGrammarFileName() { return "C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g"; }



    // $ANTLR start "bot"
    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:11:1: bot : IDENT '{' personality behaviour '}' ;
    public final void bot() throws RecognitionException {
        try {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:12:2: ( IDENT '{' personality behaviour '}' )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:12:4: IDENT '{' personality behaviour '}'
            {
            match(input,IDENT,FOLLOW_IDENT_in_bot27); 

            match(input,14,FOLLOW_14_in_bot29); 

            pushFollow(FOLLOW_personality_in_bot31);
            personality();

            state._fsp--;


            pushFollow(FOLLOW_behaviour_in_bot33);
            behaviour();

            state._fsp--;


            match(input,15,FOLLOW_15_in_bot35); 

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
    // $ANTLR end "bot"



    // $ANTLR start "personality"
    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:15:1: personality : ( characterstics )* ;
    public final void personality() throws RecognitionException {
        try {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:16:2: ( ( characterstics )* )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:17:2: ( characterstics )*
            {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:17:2: ( characterstics )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==11) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:17:2: characterstics
            	    {
            	    pushFollow(FOLLOW_characterstics_in_personality48);
            	    characterstics();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "personality"



    // $ANTLR start "characterstics"
    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:20:1: characterstics : IDENT '=' INTEGER ;
    public final void characterstics() throws RecognitionException {
        try {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:21:2: ( IDENT '=' INTEGER )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:22:3: IDENT '=' INTEGER
            {
            match(input,IDENT,FOLLOW_IDENT_in_characterstics62); 

            match(input,11,FOLLOW_11_in_characterstics64); 

            match(input,INTEGER,FOLLOW_INTEGER_in_characterstics66); 

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
    // $ANTLR end "characterstics"



    // $ANTLR start "behaviour"
    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:25:1: behaviour : ( rule )* ;
    public final void behaviour() throws RecognitionException {
        try {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:26:2: ( ( rule )* )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:27:2: ( rule )*
            {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:27:2: ( rule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:27:2: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_behaviour80);
            	    rule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "behaviour"



    // $ANTLR start "rule"
    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:30:1: rule : condition '[' ( action )+ ']' ;
    public final void rule() throws RecognitionException {
        try {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:31:2: ( condition '[' ( action )+ ']' )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:31:4: condition '[' ( action )+ ']'
            {
            pushFollow(FOLLOW_condition_in_rule92);
            condition();

            state._fsp--;


            match(input,12,FOLLOW_12_in_rule94); 

            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:31:18: ( action )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:31:18: action
            	    {
            	    pushFollow(FOLLOW_action_in_rule96);
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


            match(input,13,FOLLOW_13_in_rule99); 

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
    // $ANTLR end "rule"



    // $ANTLR start "condition"
    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:34:1: condition : ( IDENT )+ ;
    public final void condition() throws RecognitionException {
        try {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:35:2: ( ( IDENT )+ )
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:35:4: ( IDENT )+
            {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:35:4: ( IDENT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IDENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:35:4: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_condition110); 

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
    // $ANTLR end "condition"



    // $ANTLR start "action"
    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:38:1: action : ( IDENT '(' ( IDENT )+ ')' | IDENT );
    public final void action() throws RecognitionException {
        try {
            // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:39:2: ( IDENT '(' ( IDENT )+ ')' | IDENT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==9) ) {
                    alt6=1;
                }
                else if ( (LA6_1==IDENT||LA6_1==13) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:39:4: IDENT '(' ( IDENT )+ ')'
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_action123); 

                    match(input,9,FOLLOW_9_in_action125); 

                    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:39:14: ( IDENT )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==IDENT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:39:14: IDENT
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_action127); 

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


                    match(input,10,FOLLOW_10_in_action130); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\ASHIM\\aworkspace\\workspace\\SAF\\src\\grammar\\SAF.g:40:4: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_action135); 

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
    // $ANTLR end "action"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_bot27 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_bot29 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_personality_in_bot31 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_behaviour_in_bot33 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_bot35 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characterstics_in_personality48 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENT_in_characterstics62 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_characterstics64 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INTEGER_in_characterstics66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_behaviour80 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_condition_in_rule92 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rule94 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_action_in_rule96 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_13_in_rule99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_condition110 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENT_in_action123 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action127 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_10_in_action130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action135 = new BitSet(new long[]{0x0000000000000002L});

}