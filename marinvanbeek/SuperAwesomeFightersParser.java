// $ANTLR 3.4 SuperAwesomeFighters.g 2012-01-09 16:59:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SuperAwesomeFightersParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CURLY_CLOSE", "CURLY_OPEN", "EQUAL", "LEVEL", "OR", "SQUARE_CLOSE", "SQUARE_OPEN", "STRING", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int CURLY_CLOSE=5;
    public static final int CURLY_OPEN=6;
    public static final int EQUAL=7;
    public static final int LEVEL=8;
    public static final int OR=9;
    public static final int SQUARE_CLOSE=10;
    public static final int SQUARE_OPEN=11;
    public static final int STRING=12;
    public static final int WHITESPACE=13;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SuperAwesomeFightersParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SuperAwesomeFightersParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SuperAwesomeFightersParser.tokenNames; }
    public String getGrammarFileName() { return "SuperAwesomeFighters.g"; }



    // $ANTLR start "super_awesome_fighter"
    // SuperAwesomeFighters.g:20:1: super_awesome_fighter : STRING CURLY_OPEN personality behaviour CURLY_CLOSE EOF ;
    public final void super_awesome_fighter() throws RecognitionException {
        try {
            // SuperAwesomeFighters.g:21:5: ( STRING CURLY_OPEN personality behaviour CURLY_CLOSE EOF )
            // SuperAwesomeFighters.g:21:7: STRING CURLY_OPEN personality behaviour CURLY_CLOSE EOF
            {
            match(input,STRING,FOLLOW_STRING_in_super_awesome_fighter161); 

            match(input,CURLY_OPEN,FOLLOW_CURLY_OPEN_in_super_awesome_fighter163); 

            pushFollow(FOLLOW_personality_in_super_awesome_fighter165);
            personality();

            state._fsp--;


            pushFollow(FOLLOW_behaviour_in_super_awesome_fighter167);
            behaviour();

            state._fsp--;


            match(input,CURLY_CLOSE,FOLLOW_CURLY_CLOSE_in_super_awesome_fighter169); 

            match(input,EOF,FOLLOW_EOF_in_super_awesome_fighter171); 

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
    // $ANTLR end "super_awesome_fighter"



    // $ANTLR start "personality"
    // SuperAwesomeFighters.g:24:1: personality : ( property EQUAL LEVEL )+ ;
    public final void personality() throws RecognitionException {
        try {
            // SuperAwesomeFighters.g:25:5: ( ( property EQUAL LEVEL )+ )
            // SuperAwesomeFighters.g:25:7: ( property EQUAL LEVEL )+
            {
            // SuperAwesomeFighters.g:25:7: ( property EQUAL LEVEL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==EQUAL) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // SuperAwesomeFighters.g:25:8: property EQUAL LEVEL
            	    {
            	    pushFollow(FOLLOW_property_in_personality189);
            	    property();

            	    state._fsp--;


            	    match(input,EQUAL,FOLLOW_EQUAL_in_personality191); 

            	    match(input,LEVEL,FOLLOW_LEVEL_in_personality193); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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



    // $ANTLR start "property"
    // SuperAwesomeFighters.g:28:1: property : STRING ;
    public final void property() throws RecognitionException {
        try {
            // SuperAwesomeFighters.g:29:5: ( STRING )
            // SuperAwesomeFighters.g:29:7: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_property212); 

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
    // $ANTLR end "property"



    // $ANTLR start "behaviour"
    // SuperAwesomeFighters.g:32:1: behaviour : condition ( ( AND | OR ) condition )* action ;
    public final void behaviour() throws RecognitionException {
        try {
            // SuperAwesomeFighters.g:33:5: ( condition ( ( AND | OR ) condition )* action )
            // SuperAwesomeFighters.g:33:7: condition ( ( AND | OR ) condition )* action
            {
            pushFollow(FOLLOW_condition_in_behaviour229);
            condition();

            state._fsp--;


            // SuperAwesomeFighters.g:33:17: ( ( AND | OR ) condition )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AND||LA2_0==OR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // SuperAwesomeFighters.g:33:18: ( AND | OR ) condition
            	    {
            	    if ( input.LA(1)==AND||input.LA(1)==OR ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_condition_in_behaviour238);
            	    condition();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            pushFollow(FOLLOW_action_in_behaviour242);
            action();

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
    // $ANTLR end "behaviour"



    // $ANTLR start "condition"
    // SuperAwesomeFighters.g:36:1: condition : STRING ;
    public final void condition() throws RecognitionException {
        try {
            // SuperAwesomeFighters.g:37:5: ( STRING )
            // SuperAwesomeFighters.g:37:7: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_condition259); 

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
    // SuperAwesomeFighters.g:40:1: action : SQUARE_OPEN move attack SQUARE_CLOSE ;
    public final void action() throws RecognitionException {
        try {
            // SuperAwesomeFighters.g:41:5: ( SQUARE_OPEN move attack SQUARE_CLOSE )
            // SuperAwesomeFighters.g:41:7: SQUARE_OPEN move attack SQUARE_CLOSE
            {
            match(input,SQUARE_OPEN,FOLLOW_SQUARE_OPEN_in_action276); 

            pushFollow(FOLLOW_move_in_action278);
            move();

            state._fsp--;


            pushFollow(FOLLOW_attack_in_action280);
            attack();

            state._fsp--;


            match(input,SQUARE_CLOSE,FOLLOW_SQUARE_CLOSE_in_action282); 

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



    // $ANTLR start "move"
    // SuperAwesomeFighters.g:44:1: move : STRING ;
    public final void move() throws RecognitionException {
        try {
            // SuperAwesomeFighters.g:45:5: ( STRING )
            // SuperAwesomeFighters.g:45:7: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_move299); 

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
    // $ANTLR end "move"



    // $ANTLR start "attack"
    // SuperAwesomeFighters.g:48:1: attack : STRING ;
    public final void attack() throws RecognitionException {
        try {
            // SuperAwesomeFighters.g:49:5: ( STRING )
            // SuperAwesomeFighters.g:49:7: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_attack316); 

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
    // $ANTLR end "attack"

    // Delegated rules


 

    public static final BitSet FOLLOW_STRING_in_super_awesome_fighter161 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CURLY_OPEN_in_super_awesome_fighter163 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_personality_in_super_awesome_fighter165 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_behaviour_in_super_awesome_fighter167 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CURLY_CLOSE_in_super_awesome_fighter169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_super_awesome_fighter171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_personality189 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUAL_in_personality191 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LEVEL_in_personality193 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_STRING_in_property212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour229 = new BitSet(new long[]{0x0000000000000A10L});
    public static final BitSet FOLLOW_set_in_behaviour232 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_condition_in_behaviour238 = new BitSet(new long[]{0x0000000000000A10L});
    public static final BitSet FOLLOW_action_in_behaviour242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_condition259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_OPEN_in_action276 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_move_in_action278 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_attack_in_action280 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SQUARE_CLOSE_in_action282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_move299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_attack316 = new BitSet(new long[]{0x0000000000000002L});

}