// $ANTLR 3.4 /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g 2013-06-13 13:02:12

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
    public String getGrammarFileName() { return "/Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g"; }



    // $ANTLR start "fighter"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:23:1: fighter returns [Bot fighter] : IDENT ( '{' )? ( personality | behaviour )* ( '}' )? ;
    public final Bot fighter() throws RecognitionException {
        Bot fighter = null;


        Token IDENT1=null;
        Personality personality2 =null;

        Behaviour behaviour3 =null;


        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:24:2: ( IDENT ( '{' )? ( personality | behaviour )* ( '}' )? )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:24:4: IDENT ( '{' )? ( personality | behaviour )* ( '}' )?
            {
            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter64); 

            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:24:10: ( '{' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:24:10: '{'
                    {
                    match(input,15,FOLLOW_15_in_fighter66); 

                    }
                    break;

            }


             fighter = new Bot((IDENT1!=null?IDENT1.getText():null)); 


            			System.out.println( fighter.toString()); 
            		

            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:28:4: ( personality | behaviour )*
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
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:28:5: personality
            	    {
            	    pushFollow(FOLLOW_personality_in_fighter79);
            	    personality2=personality();

            	    state._fsp--;


            	    fighter.addPersonality(personality2);

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:29:5: behaviour
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


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:30:3: ( '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:30:3: '}'
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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:33:1: behaviour returns [Behaviour behaviour] : ( condition ) '[' a1= action a2= action ']' ;
    public final Behaviour behaviour() throws RecognitionException {
        Behaviour behaviour = null;


        Action a1 =null;

        Action a2 =null;

        Condition condition4 =null;


        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:34:2: ( ( condition ) '[' a1= action a2= action ']' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:35:3: ( condition ) '[' a1= action a2= action ']'
            {
            	behaviour = new Behaviour();	

            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:36:3: ( condition )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:36:4: condition
            {
            pushFollow(FOLLOW_condition_in_behaviour121);
            condition4=condition();

            state._fsp--;


            behaviour.addCondition(condition4);

            }


            match(input,11,FOLLOW_11_in_behaviour130); 

            pushFollow(FOLLOW_action_in_behaviour134);
            a1=action();

            state._fsp--;


            pushFollow(FOLLOW_action_in_behaviour138);
            a2=action();

            state._fsp--;


            match(input,12,FOLLOW_12_in_behaviour140); 

            behaviour.addAction(a1,a2);

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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:40:1: condition returns [Condition condition] : (first= IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )* ;
    public final Condition condition() throws RecognitionException {
        Condition condition = null;


        Token first=null;
        Token second=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:41:2: ( (first= IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )* )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:41:4: (first= IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )*
            {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:41:4: (first= IDENT |first= IDENT 'or' second= IDENT |first= IDENT 'and' second= IDENT )*
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
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:41:5: first= IDENT
            	    {
            	    first=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition162); 

            	     condition = new Condition((first!=null?first.getText():null)); 

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:42:2: first= IDENT 'or' second= IDENT
            	    {
            	    first=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition172); 

            	    match(input,14,FOLLOW_14_in_condition174); 

            	    second=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition178); 

            	     condition = new Condition((first!=null?first.getText():null),(second!=null?second.getText():null),"or"); 

            	    }
            	    break;
            	case 3 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:43:2: first= IDENT 'and' second= IDENT
            	    {
            	    first=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition188); 

            	    match(input,13,FOLLOW_13_in_condition190); 

            	    second=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition194); 

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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:50:1: action returns [Action action] : ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT ) ;
    public final Action action() throws RecognitionException {
        Action action = null;


        Token a1=null;
        Token a2=null;
        Token act=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:51:2: ( ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:51:4: ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT )
            {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:51:4: ( 'choose' '(' a1= IDENT a2= IDENT ')' |act= IDENT )
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
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:52:3: 'choose' '(' a1= IDENT a2= IDENT ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_action225); 

                    match(input,8,FOLLOW_8_in_action227); 

                    a1=(Token)match(input,IDENT,FOLLOW_IDENT_in_action231); 

                    a2=(Token)match(input,IDENT,FOLLOW_IDENT_in_action235); 

                    match(input,9,FOLLOW_9_in_action237); 

                     action = new Action((a1!=null?a1.getText():null), (a2!=null?a2.getText():null),true); 

                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:53:5: act= IDENT
                    {
                    act=(Token)match(input,IDENT,FOLLOW_IDENT_in_action247); 

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
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:61:1: personality returns [Personality personality] : IDENT '=' VALUE ;
    public final Personality personality() throws RecognitionException {
        Personality personality = null;


        Token IDENT5=null;
        Token VALUE6=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:62:2: ( IDENT '=' VALUE )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/fighter/SAF.g:62:4: IDENT '=' VALUE
            {
            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_personality275); 

            match(input,10,FOLLOW_10_in_personality277); 

            VALUE6=(Token)match(input,VALUE,FOLLOW_VALUE_in_personality279); 


            			personality = new Personality((IDENT5!=null?IDENT5.getText():null),Integer.parseInt((VALUE6!=null?VALUE6.getText():null))); 
            		


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
    public static final BitSet FOLLOW_condition_in_behaviour121 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviour130 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour134 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_action_in_behaviour138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviour140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_condition162 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENT_in_condition172 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_condition174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_condition178 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDENT_in_condition188 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_condition190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_condition194 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_CHOOSE_in_action225 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action231 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_action235 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_personality275 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_personality277 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_VALUE_in_personality279 = new BitSet(new long[]{0x0000000000000002L});

}