// $ANTLR 3.4 /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g 2013-05-21 19:29:50

  package saf.syntax;
  
  import java.util.List;
  import saf.ast.fighter.*;
  import saf.ast.action.*;
  import saf.ast.condition.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CHOOSE", "INT", "OR", "STRING", "WHITESPACE", "'('", "')'", "'='", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int AND=4;
    public static final int CHOOSE=5;
    public static final int INT=6;
    public static final int OR=7;
    public static final int STRING=8;
    public static final int WHITESPACE=9;

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
    public String getGrammarFileName() { return "/Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g"; }



    // $ANTLR start "fighter"
    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:26:1: fighter returns [Fighter fighter] : STRING '{' personality behaviour '}' ;
    public final Fighter fighter() throws RecognitionException {
        Fighter fighter = null;


        Token STRING1=null;
        Personality personality2 =null;

        Behaviour behaviour3 =null;


        try {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:27:3: ( STRING '{' personality behaviour '}' )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:27:5: STRING '{' personality behaviour '}'
            {
            STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_fighter78); 

            match(input,15,FOLLOW_15_in_fighter80); 

            pushFollow(FOLLOW_personality_in_fighter82);
            personality2=personality();

            state._fsp--;


            pushFollow(FOLLOW_behaviour_in_fighter84);
            behaviour3=behaviour();

            state._fsp--;


            match(input,16,FOLLOW_16_in_fighter86); 

             fighter = new Fighter((STRING1!=null?STRING1.getText():null), personality2, behaviour3); 

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



    // $ANTLR start "personality"
    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:31:1: personality returns [Personality personality] : ( STRING '=' INT )* ;
    public final Personality personality() throws RecognitionException {
        Personality personality = null;


        Token STRING4=null;
        Token INT5=null;

         List<Characteristic> characteristics = new ArrayList<Characteristic>(); 
        try {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:33:3: ( ( STRING '=' INT )* )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:33:5: ( STRING '=' INT )*
            {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:33:5: ( STRING '=' INT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==12) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:33:7: STRING '=' INT
            	    {
            	    STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_personality117); 

            	    match(input,12,FOLLOW_12_in_personality119); 

            	    INT5=(Token)match(input,INT,FOLLOW_INT_in_personality121); 

            	     characteristics.add(new Characteristic((STRING4!=null?STRING4.getText():null), (INT5!=null?Integer.valueOf(INT5.getText()):0))); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


             personality = new Personality(characteristics); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return personality;
    }
    // $ANTLR end "personality"



    // $ANTLR start "behaviour"
    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:37:1: behaviour returns [Behaviour behaviour] : ( condition '[' ( moveAction fightAction ) ']' )* ;
    public final Behaviour behaviour() throws RecognitionException {
        Behaviour behaviour = null;


        Condition condition6 =null;

        MoveAction moveAction7 =null;

        FightAction fightAction8 =null;


         List<Rule> rules = new ArrayList<Rule>(); 
        try {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:39:3: ( ( condition '[' ( moveAction fightAction ) ']' )* )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:39:5: ( condition '[' ( moveAction fightAction ) ']' )*
            {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:39:5: ( condition '[' ( moveAction fightAction ) ']' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==STRING||LA2_0==10) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:39:7: condition '[' ( moveAction fightAction ) ']'
            	    {
            	    pushFollow(FOLLOW_condition_in_behaviour157);
            	    condition6=condition();

            	    state._fsp--;


            	    match(input,13,FOLLOW_13_in_behaviour159); 

            	    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:39:21: ( moveAction fightAction )
            	    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:39:22: moveAction fightAction
            	    {
            	    pushFollow(FOLLOW_moveAction_in_behaviour162);
            	    moveAction7=moveAction();

            	    state._fsp--;


            	    pushFollow(FOLLOW_fightAction_in_behaviour164);
            	    fightAction8=fightAction();

            	    state._fsp--;


            	    }


            	    match(input,14,FOLLOW_14_in_behaviour167); 

            	     rules.add(new Rule(condition6, moveAction7, fightAction8)); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


             behaviour = new Behaviour(rules); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return behaviour;
    }
    // $ANTLR end "behaviour"



    // $ANTLR start "condition"
    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:44:1: condition returns [Condition cond] : ( andCond ) ;
    public final Condition condition() throws RecognitionException {
        Condition cond = null;


        Condition andCond9 =null;


        try {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:45:3: ( ( andCond ) )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:45:5: ( andCond )
            {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:45:5: ( andCond )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:45:7: andCond
            {
            pushFollow(FOLLOW_andCond_in_condition203);
            andCond9=andCond();

            state._fsp--;


             cond = andCond9; 

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
        return cond;
    }
    // $ANTLR end "condition"



    // $ANTLR start "andCond"
    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:48:1: andCond returns [Condition cond] : cond1= orCond ( AND cond2= orCond )* ;
    public final Condition andCond() throws RecognitionException {
        Condition cond = null;


        Condition cond1 =null;

        Condition cond2 =null;


        try {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:49:3: (cond1= orCond ( AND cond2= orCond )* )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:49:5: cond1= orCond ( AND cond2= orCond )*
            {
            pushFollow(FOLLOW_orCond_in_andCond228);
            cond1=orCond();

            state._fsp--;


             cond = cond1; 

            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:50:3: ( AND cond2= orCond )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AND) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:50:5: AND cond2= orCond
            	    {
            	    match(input,AND,FOLLOW_AND_in_andCond237); 

            	    pushFollow(FOLLOW_orCond_in_andCond243);
            	    cond2=orCond();

            	    state._fsp--;


            	     cond = new And(cond, cond2); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
        return cond;
    }
    // $ANTLR end "andCond"



    // $ANTLR start "orCond"
    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:53:1: orCond returns [Condition cond] : cond1= atomCond ( OR cond2= atomCond )* ;
    public final Condition orCond() throws RecognitionException {
        Condition cond = null;


        Condition cond1 =null;

        Condition cond2 =null;


        try {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:54:3: (cond1= atomCond ( OR cond2= atomCond )* )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:54:5: cond1= atomCond ( OR cond2= atomCond )*
            {
            pushFollow(FOLLOW_atomCond_in_orCond268);
            cond1=atomCond();

            state._fsp--;


             cond = cond1; 

            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:55:3: ( OR cond2= atomCond )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==OR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:55:5: OR cond2= atomCond
            	    {
            	    match(input,OR,FOLLOW_OR_in_orCond276); 

            	    pushFollow(FOLLOW_atomCond_in_orCond282);
            	    cond2=atomCond();

            	    state._fsp--;


            	     cond = new Or(cond, cond2); 

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
        return cond;
    }
    // $ANTLR end "orCond"



    // $ANTLR start "atomCond"
    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:58:1: atomCond returns [Condition cond] : ( ( STRING ) | ( '(' condition ')' ) );
    public final Condition atomCond() throws RecognitionException {
        Condition cond = null;


        Token STRING10=null;
        Condition condition11 =null;


        try {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:59:3: ( ( STRING ) | ( '(' condition ')' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==10) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:59:5: ( STRING )
                    {
                    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:59:5: ( STRING )
                    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:59:6: STRING
                    {
                    STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_atomCond304); 

                     cond = new Atom((STRING10!=null?STRING10.getText():null)); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:60:5: ( '(' condition ')' )
                    {
                    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:60:5: ( '(' condition ')' )
                    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:60:7: '(' condition ')'
                    {
                    match(input,10,FOLLOW_10_in_atomCond315); 

                    pushFollow(FOLLOW_condition_in_atomCond317);
                    condition11=condition();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_atomCond319); 

                     cond = condition11; 

                    }


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
        return cond;
    }
    // $ANTLR end "atomCond"



    // $ANTLR start "moveAction"
    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:63:1: moveAction returns [MoveAction moveActions] : (move= STRING | CHOOSE '(' (moveChoice= STRING )+ ')' ) ;
    public final MoveAction moveAction() throws RecognitionException {
        MoveAction moveActions = null;


        Token move=null;
        Token moveChoice=null;

         List<String> moves = new ArrayList<String>(); 
        try {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:65:3: ( (move= STRING | CHOOSE '(' (moveChoice= STRING )+ ')' ) )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:65:5: (move= STRING | CHOOSE '(' (moveChoice= STRING )+ ')' )
            {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:65:5: (move= STRING | CHOOSE '(' (moveChoice= STRING )+ ')' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==CHOOSE) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:65:7: move= STRING
                    {
                    move=(Token)match(input,STRING,FOLLOW_STRING_in_moveAction353); 

                     moves.add((move!=null?move.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:66:5: CHOOSE '(' (moveChoice= STRING )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_moveAction361); 

                    match(input,10,FOLLOW_10_in_moveAction363); 

                    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:66:16: (moveChoice= STRING )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==STRING) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:66:17: moveChoice= STRING
                    	    {
                    	    moveChoice=(Token)match(input,STRING,FOLLOW_STRING_in_moveAction370); 

                    	     moves.add((moveChoice!=null?moveChoice.getText():null)); 

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


                    match(input,11,FOLLOW_11_in_moveAction376); 

                    }
                    break;

            }


             moveActions = new MoveAction(moves); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return moveActions;
    }
    // $ANTLR end "moveAction"



    // $ANTLR start "fightAction"
    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:70:1: fightAction returns [FightAction fightActions] : (fight= STRING | CHOOSE '(' (fightChoice= STRING )+ ')' ) ;
    public final FightAction fightAction() throws RecognitionException {
        FightAction fightActions = null;


        Token fight=null;
        Token fightChoice=null;

         List<String> fights = new ArrayList<String>(); 
        try {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:72:3: ( (fight= STRING | CHOOSE '(' (fightChoice= STRING )+ ')' ) )
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:72:5: (fight= STRING | CHOOSE '(' (fightChoice= STRING )+ ')' )
            {
            // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:72:5: (fight= STRING | CHOOSE '(' (fightChoice= STRING )+ ')' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==CHOOSE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:72:7: fight= STRING
                    {
                    fight=(Token)match(input,STRING,FOLLOW_STRING_in_fightAction412); 

                     fights.add((fight!=null?fight.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:73:5: CHOOSE '(' (fightChoice= STRING )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_fightAction421); 

                    match(input,10,FOLLOW_10_in_fightAction423); 

                    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:73:16: (fightChoice= STRING )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==STRING) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/ravish/Documents/SE/Evolution/workspace/saf/src/saf/syntax/SAF.g:73:17: fightChoice= STRING
                    	    {
                    	    fightChoice=(Token)match(input,STRING,FOLLOW_STRING_in_fightAction430); 

                    	     fights.add((fightChoice!=null?fightChoice.getText():null)); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    match(input,11,FOLLOW_11_in_fightAction436); 

                    }
                    break;

            }


             fightActions = new FightAction(fights); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return fightActions;
    }
    // $ANTLR end "fightAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_STRING_in_fighter78 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_fighter80 = new BitSet(new long[]{0x0000000000010500L});
    public static final BitSet FOLLOW_personality_in_fighter82 = new BitSet(new long[]{0x0000000000010500L});
    public static final BitSet FOLLOW_behaviour_in_fighter84 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fighter86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_personality117 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_personality119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_personality121 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_condition_in_behaviour157 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_behaviour159 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_moveAction_in_behaviour162 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_fightAction_in_behaviour164 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_behaviour167 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_andCond_in_condition203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCond_in_andCond228 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_andCond237 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_orCond_in_andCond243 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_atomCond_in_orCond268 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_OR_in_orCond276 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_atomCond_in_orCond282 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_STRING_in_atomCond304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_atomCond315 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_condition_in_atomCond317 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_atomCond319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_moveAction353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_moveAction361 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_moveAction363 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_STRING_in_moveAction370 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_11_in_moveAction376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_fightAction412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_fightAction421 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_fightAction423 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_STRING_in_fightAction430 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_11_in_fightAction436 = new BitSet(new long[]{0x0000000000000002L});

}