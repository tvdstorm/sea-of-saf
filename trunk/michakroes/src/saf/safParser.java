// $ANTLR 3.4 /Users/michakroes/Documents/workspace/saf/src/saf/saf.g 2012-02-11 18:49:14
 package saf; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class safParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHOOSE", "ID", "INT", "WS", "'('", "')'", "'='", "'['", "']'", "'crouch'", "'jump'", "'kickPower'", "'kickReach'", "'punchPower'", "'punchReach'", "'run_away'", "'run_towards'", "'stand'", "'walk_away'", "'walk_towards'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
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
    public static final int CHOOSE=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int WS=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public safParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public safParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return safParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/michakroes/Documents/workspace/saf/src/saf/saf.g"; }



    // $ANTLR start "saf"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:29:1: saf returns [Saf saf] : name '{' personality behaviour '}' EOF ;
    public final Saf saf() throws RecognitionException {
        Saf saf = null;


        safParser.name_return name1 =null;

        Personality personality2 =null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:30:3: ( name '{' personality behaviour '}' EOF )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:30:5: name '{' personality behaviour '}' EOF
            {
            pushFollow(FOLLOW_name_in_saf174);
            name1=name();

            state._fsp--;


            match(input,24,FOLLOW_24_in_saf176); 

            pushFollow(FOLLOW_personality_in_saf178);
            personality2=personality();

            state._fsp--;


            pushFollow(FOLLOW_behaviour_in_saf180);
            behaviour();

            state._fsp--;


            match(input,25,FOLLOW_25_in_saf182); 

            match(input,EOF,FOLLOW_EOF_in_saf184); 

             saf = new Saf((name1!=null?input.toString(name1.start,name1.stop):null), personality2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return saf;
    }
    // $ANTLR end "saf"


    public static class name_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "name"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:33:1: name : ID ;
    public final safParser.name_return name() throws RecognitionException {
        safParser.name_return retval = new safParser.name_return();
        retval.start = input.LT(1);


        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:34:3: ( ID )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:34:5: ID
            {
            match(input,ID,FOLLOW_ID_in_name204); 

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
    // $ANTLR end "name"



    // $ANTLR start "personality"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:35:1: personality returns [Personality p] : ( strength )+ ;
    public final Personality personality() throws RecognitionException {
        Personality p = null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:36:3: ( ( strength )+ )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:36:5: ( strength )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:36:5: ( strength )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 15 && LA1_0 <= 18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:36:5: strength
            	    {
            	    pushFollow(FOLLOW_strength_in_personality217);
            	    strength();

            	    state._fsp--;


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


             p = new Personality(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "personality"



    // $ANTLR start "strength"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:39:1: strength : characteristic '=' power ;
    public final void strength() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:40:3: ( characteristic '=' power )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:40:5: characteristic '=' power
            {
            pushFollow(FOLLOW_characteristic_in_strength236);
            characteristic();

            state._fsp--;


            match(input,10,FOLLOW_10_in_strength238); 

            pushFollow(FOLLOW_power_in_strength240);
            power();

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
    // $ANTLR end "strength"



    // $ANTLR start "power"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:41:1: power : INT ;
    public final void power() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:41:6: ( INT )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:41:8: INT
            {
            match(input,INT,FOLLOW_INT_in_power246); 

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
    // $ANTLR end "power"



    // $ANTLR start "characteristic"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:42:1: characteristic : ( 'punchPower' | 'punchReach' | 'kickPower' | 'kickReach' );
    public final void characteristic() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:43:3: ( 'punchPower' | 'punchReach' | 'kickPower' | 'kickReach' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:
            {
            if ( (input.LA(1) >= 15 && input.LA(1) <= 18) ) {
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
    // $ANTLR end "characteristic"



    // $ANTLR start "behaviour"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:47:1: behaviour : ( behaviourrules )+ ;
    public final void behaviour() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:48:3: ( ( behaviourrules )+ )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:48:5: ( behaviourrules )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:48:5: ( behaviourrules )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:48:5: behaviourrules
            	    {
            	    pushFollow(FOLLOW_behaviourrules_in_behaviour285);
            	    behaviourrules();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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



    // $ANTLR start "behaviourrules"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:49:1: behaviourrules : condition '[' moveAction fightAction ']' ;
    public final void behaviourrules() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:50:3: ( condition '[' moveAction fightAction ']' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:50:5: condition '[' moveAction fightAction ']'
            {
            pushFollow(FOLLOW_condition_in_behaviourrules295);
            condition();

            state._fsp--;


            match(input,11,FOLLOW_11_in_behaviourrules297); 

            pushFollow(FOLLOW_moveAction_in_behaviourrules299);
            moveAction();

            state._fsp--;


            pushFollow(FOLLOW_fightAction_in_behaviourrules301);
            fightAction();

            state._fsp--;


            match(input,12,FOLLOW_12_in_behaviourrules303); 

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
    // $ANTLR end "behaviourrules"



    // $ANTLR start "condition"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:51:1: condition : ID ;
    public final void condition() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:52:3: ( ID )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:52:5: ID
            {
            match(input,ID,FOLLOW_ID_in_condition313); 

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



    // $ANTLR start "moveAction"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:53:1: moveAction : ( move | CHOOSE '(' moves ')' );
    public final void moveAction() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:54:3: ( move | CHOOSE '(' moves ')' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 13 && LA3_0 <= 14)||(LA3_0 >= 19 && LA3_0 <= 23)) ) {
                alt3=1;
            }
            else if ( (LA3_0==CHOOSE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:54:5: move
                    {
                    pushFollow(FOLLOW_move_in_moveAction322);
                    move();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:55:5: CHOOSE '(' moves ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_moveAction329); 

                    match(input,8,FOLLOW_8_in_moveAction331); 

                    pushFollow(FOLLOW_moves_in_moveAction333);
                    moves();

                    state._fsp--;


                    match(input,9,FOLLOW_9_in_moveAction335); 

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
    // $ANTLR end "moveAction"



    // $ANTLR start "moves"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:56:1: moves : ( move )+ ;
    public final void moves() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:57:3: ( ( move )+ )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:57:5: ( move )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:57:5: ( move )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= 13 && LA4_0 <= 14)||(LA4_0 >= 19 && LA4_0 <= 23)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:57:6: move
            	    {
            	    pushFollow(FOLLOW_move_in_moves345);
            	    move();

            	    state._fsp--;


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
    // $ANTLR end "moves"



    // $ANTLR start "move"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:58:1: move : ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' );
    public final void move() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:59:3: ( 'walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand' )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:
            {
            if ( (input.LA(1) >= 13 && input.LA(1) <= 14)||(input.LA(1) >= 19 && input.LA(1) <= 23) ) {
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
    // $ANTLR end "move"



    // $ANTLR start "fightAction"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:66:1: fightAction : ( fight | CHOOSE '(' fights ')' );
    public final void fightAction() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:67:3: ( fight | CHOOSE '(' fights ')' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==CHOOSE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:67:5: fight
                    {
                    pushFollow(FOLLOW_fight_in_fightAction409);
                    fight();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:68:5: CHOOSE '(' fights ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_fightAction416); 

                    match(input,8,FOLLOW_8_in_fightAction418); 

                    pushFollow(FOLLOW_fights_in_fightAction420);
                    fights();

                    state._fsp--;


                    match(input,9,FOLLOW_9_in_fightAction422); 

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
    // $ANTLR end "fightAction"



    // $ANTLR start "fights"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:69:1: fights : ( fight )+ ;
    public final void fights() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:70:3: ( ( fight )+ )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:70:5: ( fight )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:70:5: ( fight )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:70:6: fight
            	    {
            	    pushFollow(FOLLOW_fight_in_fights432);
            	    fight();

            	    state._fsp--;


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
    // $ANTLR end "fights"



    // $ANTLR start "fight"
    // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:71:1: fight : ID ;
    public final void fight() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:72:3: ( ID )
            // /Users/michakroes/Documents/workspace/saf/src/saf/saf.g:72:5: ID
            {
            match(input,ID,FOLLOW_ID_in_fight444); 

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
    // $ANTLR end "fight"

    // Delegated rules


 

    public static final BitSet FOLLOW_name_in_saf174 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_saf176 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_personality_in_saf178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_behaviour_in_saf180 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_saf182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_saf184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strength_in_personality217 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_characteristic_in_strength236 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_strength238 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_power_in_strength240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_power246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviourrules_in_behaviour285 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_condition_in_behaviourrules295 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviourrules297 = new BitSet(new long[]{0x0000000000F86010L});
    public static final BitSet FOLLOW_moveAction_in_behaviourrules299 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_fightAction_in_behaviourrules301 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviourrules303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_condition313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_moveAction322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_moveAction329 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_moveAction331 = new BitSet(new long[]{0x0000000000F86000L});
    public static final BitSet FOLLOW_moves_in_moveAction333 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_moveAction335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_moves345 = new BitSet(new long[]{0x0000000000F86002L});
    public static final BitSet FOLLOW_fight_in_fightAction409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_fightAction416 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_fightAction418 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_fights_in_fightAction420 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_fightAction422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fight_in_fights432 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_fight444 = new BitSet(new long[]{0x0000000000000002L});

}