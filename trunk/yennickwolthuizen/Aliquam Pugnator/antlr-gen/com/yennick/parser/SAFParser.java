// $ANTLR 3.4 C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g 2013-08-02 13:12:41

  package com.yennick.parser;
  import com.yennick.fighter.bot.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHOOSE", "IDENT", "LEFTCURLY", "RIGHTCURLY", "VALUE", "WHITESPACE", "'('", "')'", "'='", "'['", "']'", "'and'", "'or'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int CHOOSE=4;
    public static final int IDENT=5;
    public static final int LEFTCURLY=6;
    public static final int RIGHTCURLY=7;
    public static final int VALUE=8;
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
    public String getGrammarFileName() { return "C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g"; }



    // $ANTLR start "fighter"
    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:24:1: fighter returns [Bot fighter] : IDENT ( LEFTCURLY )? ( personality | behaviour )* ( RIGHTCURLY )? ;
    public final Bot fighter() throws RecognitionException {
        Bot fighter = null;


        Token IDENT1=null;
        Personality personality2 =null;

        Behaviour behaviour3 =null;


        try {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:25:2: ( IDENT ( LEFTCURLY )? ( personality | behaviour )* ( RIGHTCURLY )? )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:25:4: IDENT ( LEFTCURLY )? ( personality | behaviour )* ( RIGHTCURLY )?
            {
            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter85); 

            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:25:10: ( LEFTCURLY )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==LEFTCURLY) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:25:10: LEFTCURLY
                    {
                    match(input,LEFTCURLY,FOLLOW_LEFTCURLY_in_fighter87); 

                    }
                    break;

            }


             fighter = new Bot((IDENT1!=null?IDENT1.getText():null)); 

            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:26:3: ( personality | behaviour )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==12) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==13||(LA2_2 >= 15 && LA2_2 <= 16)) ) {
                        alt2=2;
                    }


                }
                else if ( (LA2_0==10) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:26:4: personality
            	    {
            	    pushFollow(FOLLOW_personality_in_fighter95);
            	    personality2=personality();

            	    state._fsp--;


            	    fighter.addPersonality(personality2);

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:27:4: behaviour
            	    {
            	    pushFollow(FOLLOW_behaviour_in_fighter102);
            	    behaviour3=behaviour();

            	    state._fsp--;


            	    fighter.addBehaviour(behaviour3);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:28:3: ( RIGHTCURLY )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RIGHTCURLY) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:28:3: RIGHTCURLY
                    {
                    match(input,RIGHTCURLY,FOLLOW_RIGHTCURLY_in_fighter111); 

                    }
                    break;

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
        return fighter;
    }
    // $ANTLR end "fighter"



    // $ANTLR start "behaviour"
    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:31:1: behaviour returns [Behaviour behaviour] : cond= condition '[' moveAction= action fightAction= action ']' ;
    public final Behaviour behaviour() throws RecognitionException {
        Behaviour behaviour = null;


        Condition cond =null;

        Action moveAction =null;

        Action fightAction =null;


        try {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:32:2: (cond= condition '[' moveAction= action fightAction= action ']' )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:32:4: cond= condition '[' moveAction= action fightAction= action ']'
            {
            pushFollow(FOLLOW_condition_in_behaviour131);
            cond=condition();

            state._fsp--;


            match(input,13,FOLLOW_13_in_behaviour134); 

            pushFollow(FOLLOW_action_in_behaviour138);
            moveAction=action();

            state._fsp--;


            pushFollow(FOLLOW_action_in_behaviour142);
            fightAction=action();

            state._fsp--;


            match(input,14,FOLLOW_14_in_behaviour144); 

             	behaviour = new Behaviour(cond, moveAction, fightAction);	

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
    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:36:1: condition returns [Condition condition] : first= andcondition ( 'or' second= condition )? ;
    public final Condition condition() throws RecognitionException {
        Condition condition = null;


        SAFParser.andcondition_return first =null;

        Condition second =null;


        try {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:37:3: (first= andcondition ( 'or' second= condition )? )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:37:5: first= andcondition ( 'or' second= condition )?
            {
            pushFollow(FOLLOW_andcondition_in_condition166);
            first=andcondition();

            state._fsp--;


            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:37:24: ( 'or' second= condition )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:37:25: 'or' second= condition
                    {
                    match(input,16,FOLLOW_16_in_condition169); 

                    pushFollow(FOLLOW_condition_in_condition173);
                    second=condition();

                    state._fsp--;


                    condition = new CombCondition((first!=null?first.condition:null),second,false); 

                    }
                    break;

            }


            condition = new ConcreteCondition((first!=null?input.toString(first.start,first.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return condition;
    }
    // $ANTLR end "condition"


    public static class andcondition_return extends ParserRuleReturnScope {
        public Condition condition;
    };


    // $ANTLR start "andcondition"
    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:40:1: andcondition returns [Condition condition] : first= singlecondition ( 'and' second= andcondition )? ;
    public final SAFParser.andcondition_return andcondition() throws RecognitionException {
        SAFParser.andcondition_return retval = new SAFParser.andcondition_return();
        retval.start = input.LT(1);


        SAFParser.singlecondition_return first =null;

        SAFParser.andcondition_return second =null;


        try {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:41:3: (first= singlecondition ( 'and' second= andcondition )? )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:41:5: first= singlecondition ( 'and' second= andcondition )?
            {
            pushFollow(FOLLOW_singlecondition_in_andcondition200);
            first=singlecondition();

            state._fsp--;


            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:41:27: ( 'and' second= andcondition )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:41:28: 'and' second= andcondition
                    {
                    match(input,15,FOLLOW_15_in_andcondition203); 

                    pushFollow(FOLLOW_andcondition_in_andcondition207);
                    second=andcondition();

                    state._fsp--;


                    retval.condition = new CombCondition((first!=null?first.condition:null),(second!=null?second.condition:null),true); 

                    }
                    break;

            }


            retval.condition = new ConcreteCondition((first!=null?input.toString(first.start,first.stop):null)); 

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
    // $ANTLR end "andcondition"


    public static class singlecondition_return extends ParserRuleReturnScope {
        public Condition condition;
    };


    // $ANTLR start "singlecondition"
    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:45:1: singlecondition returns [Condition condition] : (first= IDENT | '(' cond= condition ')' );
    public final SAFParser.singlecondition_return singlecondition() throws RecognitionException {
        SAFParser.singlecondition_return retval = new SAFParser.singlecondition_return();
        retval.start = input.LT(1);


        Token first=null;
        Condition cond =null;


        try {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:46:3: (first= IDENT | '(' cond= condition ')' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                alt6=1;
            }
            else if ( (LA6_0==10) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:47:3: first= IDENT
                    {
                    first=(Token)match(input,IDENT,FOLLOW_IDENT_in_singlecondition240); 

                     retval.condition = new ConcreteCondition((first!=null?first.getText():null)); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:48:4: '(' cond= condition ')'
                    {
                    match(input,10,FOLLOW_10_in_singlecondition250); 

                    pushFollow(FOLLOW_condition_in_singlecondition254);
                    cond=condition();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_singlecondition256); 

                     retval.condition = cond; 

                    }
                    break;

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
    // $ANTLR end "singlecondition"



    // $ANTLR start "action"
    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:51:1: action returns [Action action] : ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT ) ;
    public final Action action() throws RecognitionException {
        Action action = null;


        Token a1=null;
        Token a2=null;
        Token act=null;

        try {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:52:2: ( ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT ) )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:52:4: ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT )
            {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:52:4: ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CHOOSE) ) {
                alt7=1;
            }
            else if ( (LA7_0==IDENT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:53:3: 'choose' '(' a1= IDENT a2= IDENT ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_action281); 

                    match(input,10,FOLLOW_10_in_action283); 

                    a1=(Token)match(input,IDENT,FOLLOW_IDENT_in_action287); 

                    a2=(Token)match(input,IDENT,FOLLOW_IDENT_in_action291); 

                    match(input,11,FOLLOW_11_in_action293); 

                     action = new Action((a1!=null?a1.getText():null), (a2!=null?a2.getText():null),true); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:54:5: act= IDENT
                    {
                    act=(Token)match(input,IDENT,FOLLOW_IDENT_in_action303); 

                     action = new Action((act!=null?act.getText():null)); 

                    }
                    break;

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
        return action;
    }
    // $ANTLR end "action"



    // $ANTLR start "personality"
    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:58:1: personality returns [Personality personality] : IDENT '=' VALUE ;
    public final Personality personality() throws RecognitionException {
        Personality personality = null;


        Token IDENT4=null;
        Token VALUE5=null;

        try {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:59:2: ( IDENT '=' VALUE )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:59:4: IDENT '=' VALUE
            {
            IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_personality325); 

            match(input,12,FOLLOW_12_in_personality327); 

            VALUE5=(Token)match(input,VALUE,FOLLOW_VALUE_in_personality329); 


            			personality = new Personality((IDENT4!=null?IDENT4.getText():null),Integer.parseInt((VALUE5!=null?VALUE5.getText():null))); 
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighter85 = new BitSet(new long[]{0x00000000000004E2L});
    public static final BitSet FOLLOW_LEFTCURLY_in_fighter87 = new BitSet(new long[]{0x00000000000004A2L});
    public static final BitSet FOLLOW_personality_in_fighter95 = new BitSet(new long[]{0x00000000000004A2L});
    public static final BitSet FOLLOW_behaviour_in_fighter102 = new BitSet(new long[]{0x00000000000004A2L});
    public static final BitSet FOLLOW_RIGHTCURLY_in_fighter111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour131 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_behaviour134 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour138 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour142 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_behaviour144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andcondition_in_condition166 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_condition169 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_condition_in_condition173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singlecondition_in_andcondition200 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_andcondition203 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_andcondition_in_andcondition207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_singlecondition240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_singlecondition250 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_condition_in_singlecondition254 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_singlecondition256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_action281 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_action283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action291 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_action293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_personality325 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_personality327 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VALUE_in_personality329 = new BitSet(new long[]{0x0000000000000002L});

}