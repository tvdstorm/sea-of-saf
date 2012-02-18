// $ANTLR 3.4 /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g 2012-02-18 12:32:05
 
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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:37:1: saf returns [Saf saf] : ID '{' personality behaviour '}' EOF ;
    public final Saf saf() throws RecognitionException {
        Saf saf = null;


        Token ID1=null;
        Personality personality2 =null;

        Behaviour behaviour3 =null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:38:3: ( ID '{' personality behaviour '}' EOF )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:38:5: ID '{' personality behaviour '}' EOF
            {
            ID1=(Token)match(input,ID,FOLLOW_ID_in_saf177); 

            match(input,13,FOLLOW_13_in_saf179); 

            pushFollow(FOLLOW_personality_in_saf181);
            personality2=personality();

            state._fsp--;


            pushFollow(FOLLOW_behaviour_in_saf183);
            behaviour3=behaviour();

            state._fsp--;


            match(input,14,FOLLOW_14_in_saf185); 

            match(input,EOF,FOLLOW_EOF_in_saf187); 

             saf = new Saf((ID1!=null?ID1.getText():null), personality2, behaviour3); 

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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:41:1: personality returns [Personality p] : ( strength )+ ;
    public final Personality personality() throws RecognitionException {
        Personality p = null;


        Strength strength4 =null;


         List<Strength> strengths = new ArrayList<Strength>(); 
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:43:3: ( ( strength )+ )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:43:5: ( strength )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:43:5: ( strength )+
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
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:43:6: strength
            	    {
            	    pushFollow(FOLLOW_strength_in_personality213);
            	    strength4=strength();

            	    state._fsp--;


            	     strengths.add(strength4); 

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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:46:1: strength returns [Strength s] : ID '=' INT ;
    public final Strength strength() throws RecognitionException {
        Strength s = null;


        Token ID5=null;
        Token INT6=null;

        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:47:3: ( ID '=' INT )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:47:5: ID '=' INT
            {
            ID5=(Token)match(input,ID,FOLLOW_ID_in_strength236); 

            match(input,10,FOLLOW_10_in_strength238); 

            INT6=(Token)match(input,INT,FOLLOW_INT_in_strength240); 

             s = new Strength((ID5!=null?ID5.getText():null), (INT6!=null?Integer.valueOf(INT6.getText()):0)); 

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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:50:1: behaviour returns [Behaviour b] : ( behaviourrule )+ ;
    public final Behaviour behaviour() throws RecognitionException {
        Behaviour b = null;


        BehaviourRule behaviourrule7 =null;


         ArrayList<BehaviourRule> behaviourRules = new ArrayList<BehaviourRule>(); 
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:52:3: ( ( behaviourrule )+ )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:52:5: ( behaviourrule )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:52:5: ( behaviourrule )+
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
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:52:6: behaviourrule
            	    {
            	    pushFollow(FOLLOW_behaviourrule_in_behaviour265);
            	    behaviourrule7=behaviourrule();

            	    state._fsp--;


            	     behaviourRules.add(behaviourrule7); 

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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:55:1: behaviourrule returns [BehaviourRule br] : ID '[' walkAction fightAction ']' ;
    public final BehaviourRule behaviourrule() throws RecognitionException {
        BehaviourRule br = null;


        Token ID8=null;
        WalkAction walkAction9 =null;

        FightAction fightAction10 =null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:56:3: ( ID '[' walkAction fightAction ']' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:56:5: ID '[' walkAction fightAction ']'
            {
            ID8=(Token)match(input,ID,FOLLOW_ID_in_behaviourrule288); 

            match(input,11,FOLLOW_11_in_behaviourrule290); 

            pushFollow(FOLLOW_walkAction_in_behaviourrule292);
            walkAction9=walkAction();

            state._fsp--;


            pushFollow(FOLLOW_fightAction_in_behaviourrule294);
            fightAction10=fightAction();

            state._fsp--;


            match(input,12,FOLLOW_12_in_behaviourrule296); 

             br = new BehaviourRule(new Condition((ID8!=null?ID8.getText():null)), walkAction9, fightAction10); 

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



    // $ANTLR start "walkAction"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:59:1: walkAction returns [WalkAction wa] : (w1= ID | CHOOSE '(' (w2= ID )+ ')' ) ;
    public final WalkAction walkAction() throws RecognitionException {
        WalkAction wa = null;


        Token w1=null;
        Token w2=null;

         List<String> walks = new ArrayList<String>(); 
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:61:3: ( (w1= ID | CHOOSE '(' (w2= ID )+ ')' ) )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:61:5: (w1= ID | CHOOSE '(' (w2= ID )+ ')' )
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:61:5: (w1= ID | CHOOSE '(' (w2= ID )+ ')' )
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
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:62:7: w1= ID
                    {
                    w1=(Token)match(input,ID,FOLLOW_ID_in_walkAction335); 

                     walks.add((w1!=null?w1.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:63:7: CHOOSE '(' (w2= ID )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_walkAction348); 

                    match(input,8,FOLLOW_8_in_walkAction350); 

                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:63:18: (w2= ID )+
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
                    	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:63:19: w2= ID
                    	    {
                    	    w2=(Token)match(input,ID,FOLLOW_ID_in_walkAction357); 

                    	     walks.add((w2!=null?w2.getText():null)); 

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


                    match(input,9,FOLLOW_9_in_walkAction364); 

                    }
                    break;

            }


             wa = new WalkAction(walks); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return wa;
    }
    // $ANTLR end "walkAction"



    // $ANTLR start "fightAction"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:67:1: fightAction returns [FightAction fa] : (f1= ID | CHOOSE '(' (f2= ID )+ ')' ) ;
    public final FightAction fightAction() throws RecognitionException {
        FightAction fa = null;


        Token f1=null;
        Token f2=null;

         List<String> fights = new ArrayList<String>(); 
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:69:3: ( (f1= ID | CHOOSE '(' (f2= ID )+ ')' ) )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:69:5: (f1= ID | CHOOSE '(' (f2= ID )+ ')' )
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:69:5: (f1= ID | CHOOSE '(' (f2= ID )+ ')' )
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
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:70:7: f1= ID
                    {
                    f1=(Token)match(input,ID,FOLLOW_ID_in_fightAction408); 

                     fights.add((f1!=null?f1.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:71:7: CHOOSE '(' (f2= ID )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_fightAction421); 

                    match(input,8,FOLLOW_8_in_fightAction423); 

                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:71:18: (f2= ID )+
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
                    	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:71:19: f2= ID
                    	    {
                    	    f2=(Token)match(input,ID,FOLLOW_ID_in_fightAction430); 

                    	     fights.add((f2!=null?f2.getText():null)); 

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


                    match(input,9,FOLLOW_9_in_fightAction437); 

                    }
                    break;

            }


             fa = new FightAction(fights); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return fa;
    }
    // $ANTLR end "fightAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_saf177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_saf179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_personality_in_saf181 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_behaviour_in_saf183 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_saf185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_saf187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strength_in_personality213 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_strength236 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_strength238 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_strength240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviourrule_in_behaviour265 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_behaviourrule288 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviourrule290 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_walkAction_in_behaviourrule292 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_fightAction_in_behaviourrule294 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviourrule296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_walkAction335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_walkAction348 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_walkAction350 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_walkAction357 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_9_in_walkAction364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fightAction408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_fightAction421 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_fightAction423 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_fightAction430 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_9_in_fightAction437 = new BitSet(new long[]{0x0000000000000002L});

}