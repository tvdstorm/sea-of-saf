// $ANTLR 3.4 C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g 2013-07-25 13:56:53

  package com.yennick.fighter;
  import com.yennick.fighter.bot.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHOOSE", "IDENT", "VALUE", "WHITESPACE", "'('", "')'", "'='", "'['", "']'", "'and'", "'or'", "'{'", "'}'"
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
    public static final int CHOOSE=4;
    public static final int IDENT=5;
    public static final int VALUE=6;
    public static final int WHITESPACE=7;

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
    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:23:1: fighter returns [Bot fighter] : IDENT ( '{' )? ( personality | behaviour )* ( '}' )? ;
    public final Bot fighter() throws RecognitionException {
        Bot fighter = null;


        Token IDENT1=null;
        Personality personality2 =null;

        Behaviour behaviour3 =null;


        try {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:24:2: ( IDENT ( '{' )? ( personality | behaviour )* ( '}' )? )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:24:4: IDENT ( '{' )? ( personality | behaviour )* ( '}' )?
            {
            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter64); 

            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:24:10: ( '{' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:24:10: '{'
                    {
                    match(input,15,FOLLOW_15_in_fighter66); 

                    }
                    break;

            }


             fighter = new Bot((IDENT1!=null?IDENT1.getText():null)); 


            			System.out.println( fighter.toString()); 
            		

            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:28:4: ( personality | behaviour )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==10) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==IDENT||LA2_2==11||(LA2_2 >= 13 && LA2_2 <= 14)) ) {
                        alt2=2;
                    }


                }
                else if ( (LA2_0==11) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:28:5: personality
            	    {
            	    pushFollow(FOLLOW_personality_in_fighter79);
            	    personality2=personality();

            	    state._fsp--;


            	    fighter.addPersonality(personality2);

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:29:5: behaviour
            	    {
            	    pushFollow(FOLLOW_behaviour_in_fighter87);
            	    behaviour3=behaviour();

            	    state._fsp--;


            	    fighter.addBehaviour(behaviour3);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:30:3: ( '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:30:3: '}'
                    {
                    match(input,16,FOLLOW_16_in_fighter96); 

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
    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:33:1: behaviour returns [Behaviour behaviour] : cond= condition '[' moveAction= action fightAction= action ']' ;
    public final Behaviour behaviour() throws RecognitionException {
        Behaviour behaviour = null;


        Condition cond =null;

        Action moveAction =null;

        Action fightAction =null;


        try {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:34:2: (cond= condition '[' moveAction= action fightAction= action ']' )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:34:4: cond= condition '[' moveAction= action fightAction= action ']'
            {
            pushFollow(FOLLOW_condition_in_behaviour116);
            cond=condition();

            state._fsp--;


            match(input,11,FOLLOW_11_in_behaviour119); 

            pushFollow(FOLLOW_action_in_behaviour123);
            moveAction=action();

            state._fsp--;


            pushFollow(FOLLOW_action_in_behaviour127);
            fightAction=action();

            state._fsp--;


            match(input,12,FOLLOW_12_in_behaviour129); 

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
    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:41:1: condition returns [Condition condition] : (first= IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )* ;
    public final Condition condition() throws RecognitionException {
        Condition condition = null;


        Token first=null;
        Token second=null;

        try {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:42:2: ( (first= IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )* )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:42:4: (first= IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )*
            {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:42:4: (first= IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )*
            loop4:
            do {
                int alt4=4;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IDENT) ) {
                    switch ( input.LA(2) ) {
                    case 14:
                        {
                        alt4=2;
                        }
                        break;
                    case 13:
                        {
                        alt4=3;
                        }
                        break;
                    case IDENT:
                    case 11:
                        {
                        alt4=1;
                        }
                        break;

                    }

                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:42:5: first= IDENT
            	    {
            	    first=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition157); 

            	     condition = new Condition((first!=null?first.getText():null)); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:43:2: first= IDENT 'or' second= IDENT
            	    {
            	    first=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition167); 

            	    match(input,14,FOLLOW_14_in_condition169); 

            	    second=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition173); 

            	     condition = new Condition((first!=null?first.getText():null),(second!=null?second.getText():null),"or"); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:44:2: first= IDENT 'and' second= IDENT
            	    {
            	    first=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition183); 

            	    match(input,13,FOLLOW_13_in_condition185); 

            	    second=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition189); 

            	     condition = new Condition((first!=null?first.getText():null),(second!=null?second.getText():null),"and"); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);



            			System.out.println(condition.toString()); 
            		

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
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CHOOSE) ) {
                alt5=1;
            }
            else if ( (LA5_0==IDENT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:53:3: 'choose' '(' a1= IDENT a2= IDENT ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_action220); 

                    match(input,8,FOLLOW_8_in_action222); 

                    a1=(Token)match(input,IDENT,FOLLOW_IDENT_in_action226); 

                    a2=(Token)match(input,IDENT,FOLLOW_IDENT_in_action230); 

                    match(input,9,FOLLOW_9_in_action232); 

                     action = new Action((a1!=null?a1.getText():null), (a2!=null?a2.getText():null),true); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:54:5: act= IDENT
                    {
                    act=(Token)match(input,IDENT,FOLLOW_IDENT_in_action242); 

                     action = new Action((act!=null?act.getText():null)); 

                    }
                    break;

            }



            			System.out.println( "   " + action.toString()); 
            		

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
    // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:62:1: personality returns [Personality personality] : IDENT '=' VALUE ;
    public final Personality personality() throws RecognitionException {
        Personality personality = null;


        Token IDENT4=null;
        Token VALUE5=null;

        try {
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:63:2: ( IDENT '=' VALUE )
            // C:\\Users\\Famke Kweekel\\workspace\\Aliquam Pugnator\\src\\com\\yennick\\fighter\\SAF.g:63:4: IDENT '=' VALUE
            {
            IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_personality270); 

            match(input,10,FOLLOW_10_in_personality272); 

            VALUE5=(Token)match(input,VALUE,FOLLOW_VALUE_in_personality274); 


            			personality = new Personality((IDENT4!=null?IDENT4.getText():null),Integer.parseInt((VALUE5!=null?VALUE5.getText():null))); 
            		


            			System.out.println( personality.toString()); 
            		

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


 

    public static final BitSet FOLLOW_IDENT_in_fighter64 = new BitSet(new long[]{0x0000000000018822L});
    public static final BitSet FOLLOW_15_in_fighter66 = new BitSet(new long[]{0x0000000000010822L});
    public static final BitSet FOLLOW_personality_in_fighter79 = new BitSet(new long[]{0x0000000000010822L});
    public static final BitSet FOLLOW_behaviour_in_fighter87 = new BitSet(new long[]{0x0000000000010822L});
    public static final BitSet FOLLOW_16_in_fighter96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour116 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviour119 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour123 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour127 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviour129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_condition157 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENT_in_condition167 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_condition169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_condition173 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENT_in_condition183 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_condition185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_condition189 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_CHOOSE_in_action220 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action226 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action230 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_personality270 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_personality272 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_VALUE_in_personality274 = new BitSet(new long[]{0x0000000000000002L});

}