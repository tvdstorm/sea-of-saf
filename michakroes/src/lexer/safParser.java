// $ANTLR 3.4 /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g 2012-02-13 16:42:59
 
  package lexer;
  
  import java.util.List;
  import saf.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class safParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHOOSE", "ID", "INT", "WS", "'('", "')'", "'='", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public String getGrammarFileName() { return "/Users/michakroes/Documents/workspace/saf/src/lexer/saf.g"; }



    // $ANTLR start "saf"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:34:1: saf returns [Saf saf] : ID '{' personality behaviour '}' EOF ;
    public final Saf saf() throws RecognitionException {
        Saf saf = null;


        Token ID1=null;
        Personality personality2 =null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:35:3: ( ID '{' personality behaviour '}' EOF )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:35:5: ID '{' personality behaviour '}' EOF
            {
            ID1=(Token)match(input,ID,FOLLOW_ID_in_saf174); 

            match(input,13,FOLLOW_13_in_saf176); 

            pushFollow(FOLLOW_personality_in_saf178);
            personality2=personality();

            state._fsp--;


            pushFollow(FOLLOW_behaviour_in_saf180);
            behaviour();

            state._fsp--;


            match(input,14,FOLLOW_14_in_saf182); 

            match(input,EOF,FOLLOW_EOF_in_saf184); 

             saf = new Saf((ID1!=null?ID1.getText():null), personality2); 

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



    // $ANTLR start "personality"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:38:1: personality returns [Personality p] : ( strength )+ ;
    public final Personality personality() throws RecognitionException {
        Personality p = null;


        Strength strength3 =null;


         List<Strength> strengths = new ArrayList<Strength>(); 
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:40:3: ( ( strength )+ )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:40:5: ( strength )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:40:5: ( strength )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==10) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:40:6: strength
            	    {
            	    pushFollow(FOLLOW_strength_in_personality212);
            	    strength3=strength();

            	    state._fsp--;


            	     strengths.add(strength3); 

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


             p = new Personality(strengths); 

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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:43:1: strength returns [Strength s] : ID '=' INT ;
    public final Strength strength() throws RecognitionException {
        Strength s = null;


        Token ID4=null;
        Token INT5=null;

        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:44:3: ( ID '=' INT )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:44:5: ID '=' INT
            {
            ID4=(Token)match(input,ID,FOLLOW_ID_in_strength237); 

            match(input,10,FOLLOW_10_in_strength239); 

            INT5=(Token)match(input,INT,FOLLOW_INT_in_strength241); 

             s = new Strength((ID4!=null?ID4.getText():null), (INT5!=null?INT5.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "strength"



    // $ANTLR start "behaviour"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:47:1: behaviour returns [Behaviour b] : ( behaviourrule )+ ;
    public final Behaviour behaviour() throws RecognitionException {
        Behaviour b = null;


        BehaviourRule behaviourrule6 =null;


         List<BehaviourRule> behaviourRules = new ArrayList<BehaviourRule>(); 
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:49:3: ( ( behaviourrule )+ )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:49:5: ( behaviourrule )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:49:5: ( behaviourrule )+
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
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:49:6: behaviourrule
            	    {
            	    pushFollow(FOLLOW_behaviourrule_in_behaviour268);
            	    behaviourrule6=behaviourrule();

            	    state._fsp--;


            	     behaviourRules.add(behaviourrule6); 

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


             b = new Behaviour(behaviourRules); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return b;
    }
    // $ANTLR end "behaviour"



    // $ANTLR start "behaviourrule"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:52:1: behaviourrule returns [BehaviourRule br] : ID '[' moveAction fightAction ']' ;
    public final BehaviourRule behaviourrule() throws RecognitionException {
        BehaviourRule br = null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:53:3: ( ID '[' moveAction fightAction ']' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:53:5: ID '[' moveAction fightAction ']'
            {
            match(input,ID,FOLLOW_ID_in_behaviourrule293); 

            match(input,11,FOLLOW_11_in_behaviourrule295); 

            pushFollow(FOLLOW_moveAction_in_behaviourrule297);
            moveAction();

            state._fsp--;


            pushFollow(FOLLOW_fightAction_in_behaviourrule299);
            fightAction();

            state._fsp--;


            match(input,12,FOLLOW_12_in_behaviourrule301); 

             br = new BehaviourRule(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return br;
    }
    // $ANTLR end "behaviourrule"



    // $ANTLR start "moveAction"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:56:1: moveAction : ( ID | CHOOSE '(' ( ID )+ ')' );
    public final void moveAction() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:57:3: ( ID | CHOOSE '(' ( ID )+ ')' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==CHOOSE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:57:5: ID
                    {
                    match(input,ID,FOLLOW_ID_in_moveAction317); 

                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:58:5: CHOOSE '(' ( ID )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_moveAction324); 

                    match(input,8,FOLLOW_8_in_moveAction326); 

                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:58:16: ( ID )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:58:17: ID
                    	    {
                    	    match(input,ID,FOLLOW_ID_in_moveAction329); 

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


                    match(input,9,FOLLOW_9_in_moveAction333); 

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



    // $ANTLR start "fightAction"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:59:1: fightAction : ( ID | CHOOSE '(' ( ID )+ ')' );
    public final void fightAction() throws RecognitionException {
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:60:3: ( ID | CHOOSE '(' ( ID )+ ')' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==CHOOSE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:60:5: ID
                    {
                    match(input,ID,FOLLOW_ID_in_fightAction342); 

                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:61:5: CHOOSE '(' ( ID )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_fightAction349); 

                    match(input,8,FOLLOW_8_in_fightAction351); 

                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:61:16: ( ID )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:61:17: ID
                    	    {
                    	    match(input,ID,FOLLOW_ID_in_fightAction354); 

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


                    match(input,9,FOLLOW_9_in_fightAction358); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_saf174 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_saf176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_personality_in_saf178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_behaviour_in_saf180 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_saf182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_saf184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strength_in_personality212 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_strength237 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_strength239 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_strength241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviourrule_in_behaviour268 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_behaviourrule293 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviourrule295 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_moveAction_in_behaviourrule297 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_fightAction_in_behaviourrule299 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviourrule301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_moveAction317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_moveAction324 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_moveAction326 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_moveAction329 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_9_in_moveAction333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fightAction342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_fightAction349 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_fightAction351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_fightAction354 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_9_in_fightAction358 = new BitSet(new long[]{0x0000000000000002L});

}