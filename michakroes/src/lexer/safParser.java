// $ANTLR 3.4 /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g 2012-02-21 13:27:13
 
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHOOSE", "ID", "INT", "WS", "'('", "')'", "'='", "'['", "']'", "'and'", "'or'", "'{'", "'}'"
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

            match(input,15,FOLLOW_15_in_saf179); 

            pushFollow(FOLLOW_personality_in_saf181);
            personality2=personality();

            state._fsp--;


            pushFollow(FOLLOW_behaviour_in_saf183);
            behaviour3=behaviour();

            state._fsp--;


            match(input,16,FOLLOW_16_in_saf185); 

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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:42:1: personality returns [Personality p] : ( strength )+ ;
    public final Personality personality() throws RecognitionException {
        Personality p = null;


        Strength strength4 =null;


         List<Strength> strengths = new ArrayList<Strength>(); 
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:44:3: ( ( strength )+ )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:44:5: ( strength )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:44:5: ( strength )+
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
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:44:6: strength
            	    {
            	    pushFollow(FOLLOW_strength_in_personality214);
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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:48:1: strength returns [Strength s] : ID '=' INT ;
    public final Strength strength() throws RecognitionException {
        Strength s = null;


        Token ID5=null;
        Token INT6=null;

        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:49:3: ( ID '=' INT )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:49:5: ID '=' INT
            {
            ID5=(Token)match(input,ID,FOLLOW_ID_in_strength238); 

            match(input,10,FOLLOW_10_in_strength240); 

            INT6=(Token)match(input,INT,FOLLOW_INT_in_strength242); 

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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:53:1: behaviour returns [Behaviour b] : ( behaviourrule )+ ;
    public final Behaviour behaviour() throws RecognitionException {
        Behaviour b = null;


        BehaviourRule behaviourrule7 =null;


         ArrayList<BehaviourRule> behaviourRules = new ArrayList<BehaviourRule>(); 
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:55:3: ( ( behaviourrule )+ )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:55:5: ( behaviourrule )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:55:5: ( behaviourrule )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID||LA2_0==8) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:55:6: behaviourrule
            	    {
            	    pushFollow(FOLLOW_behaviourrule_in_behaviour268);
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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:59:1: behaviourrule returns [BehaviourRule br] : condition '[' walkAction fightAction ']' ;
    public final BehaviourRule behaviourrule() throws RecognitionException {
        BehaviourRule br = null;


        Condition condition8 =null;

        WalkAction walkAction9 =null;

        FightAction fightAction10 =null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:60:3: ( condition '[' walkAction fightAction ']' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:60:5: condition '[' walkAction fightAction ']'
            {
            pushFollow(FOLLOW_condition_in_behaviourrule292);
            condition8=condition();

            state._fsp--;


            match(input,11,FOLLOW_11_in_behaviourrule294); 

            pushFollow(FOLLOW_walkAction_in_behaviourrule296);
            walkAction9=walkAction();

            state._fsp--;


            pushFollow(FOLLOW_fightAction_in_behaviourrule298);
            fightAction10=fightAction();

            state._fsp--;


            match(input,12,FOLLOW_12_in_behaviourrule300); 

             br = new BehaviourRule(condition8, walkAction9, fightAction10); 

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



    // $ANTLR start "condition"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:64:1: condition returns [Condition c] : ( orCondition ) ;
    public final Condition condition() throws RecognitionException {
        Condition c = null;


        Condition orCondition11 =null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:65:3: ( ( orCondition ) )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:65:5: ( orCondition )
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:65:5: ( orCondition )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:65:6: orCondition
            {
            pushFollow(FOLLOW_orCondition_in_condition326);
            orCondition11=orCondition();

            state._fsp--;


             c = orCondition11; 

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
        return c;
    }
    // $ANTLR end "condition"



    // $ANTLR start "atomCondition"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:68:1: atomCondition returns [Condition c] : ( ( ID ) | ( '(' condition ')' ) );
    public final Condition atomCondition() throws RecognitionException {
        Condition c = null;


        Token ID12=null;
        Condition condition13 =null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:69:3: ( ( ID ) | ( '(' condition ')' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==8) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:69:5: ( ID )
                    {
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:69:5: ( ID )
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:69:6: ID
                    {
                    ID12=(Token)match(input,ID,FOLLOW_ID_in_atomCondition349); 

                    c = new ConditionAction((ID12!=null?ID12.getText():null)); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:71:5: ( '(' condition ')' )
                    {
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:71:5: ( '(' condition ')' )
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:71:6: '(' condition ')'
                    {
                    match(input,8,FOLLOW_8_in_atomCondition365); 

                    pushFollow(FOLLOW_condition_in_atomCondition367);
                    condition13=condition();

                    state._fsp--;


                    match(input,9,FOLLOW_9_in_atomCondition369); 

                     c = condition13; 

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
        return c;
    }
    // $ANTLR end "atomCondition"



    // $ANTLR start "andCondition"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:74:1: andCondition returns [Condition c] : cond1= atomCondition ( 'and' cond2= atomCondition )* ;
    public final Condition andCondition() throws RecognitionException {
        Condition c = null;


        Condition cond1 =null;

        Condition cond2 =null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:75:3: (cond1= atomCondition ( 'and' cond2= atomCondition )* )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:75:5: cond1= atomCondition ( 'and' cond2= atomCondition )*
            {
            pushFollow(FOLLOW_atomCondition_in_andCondition393);
            cond1=atomCondition();

            state._fsp--;


             c = cond1; 

            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:76:3: ( 'and' cond2= atomCondition )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:76:4: 'and' cond2= atomCondition
            	    {
            	    match(input,13,FOLLOW_13_in_andCondition400); 

            	    pushFollow(FOLLOW_atomCondition_in_andCondition406);
            	    cond2=atomCondition();

            	    state._fsp--;


            	     c = new ConditionAnd(c, cond2);
            	      

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
        return c;
    }
    // $ANTLR end "andCondition"



    // $ANTLR start "orCondition"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:80:1: orCondition returns [Condition c] : cond1= andCondition ( 'or' cond2= andCondition )* ;
    public final Condition orCondition() throws RecognitionException {
        Condition c = null;


        Condition cond1 =null;

        Condition cond2 =null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:81:3: (cond1= andCondition ( 'or' cond2= andCondition )* )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:81:5: cond1= andCondition ( 'or' cond2= andCondition )*
            {
            pushFollow(FOLLOW_andCondition_in_orCondition431);
            cond1=andCondition();

            state._fsp--;


             c = cond1; 

            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:82:3: ( 'or' cond2= andCondition )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:82:4: 'or' cond2= andCondition
            	    {
            	    match(input,14,FOLLOW_14_in_orCondition438); 

            	    pushFollow(FOLLOW_andCondition_in_orCondition444);
            	    cond2=andCondition();

            	    state._fsp--;


            	     c = new ConditionOr(c, cond2); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
        return c;
    }
    // $ANTLR end "orCondition"



    // $ANTLR start "walkAction"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:86:1: walkAction returns [WalkAction wa] : (w1= ID | CHOOSE '(' (w2= ID )+ ')' ) ;
    public final WalkAction walkAction() throws RecognitionException {
        WalkAction wa = null;


        Token w1=null;
        Token w2=null;

         List<String> walks = new ArrayList<String>(); 
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:88:3: ( (w1= ID | CHOOSE '(' (w2= ID )+ ')' ) )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:88:5: (w1= ID | CHOOSE '(' (w2= ID )+ ')' )
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:88:5: (w1= ID | CHOOSE '(' (w2= ID )+ ')' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
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
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:89:7: w1= ID
                    {
                    w1=(Token)match(input,ID,FOLLOW_ID_in_walkAction485); 

                     walks.add((w1!=null?w1.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:91:7: CHOOSE '(' (w2= ID )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_walkAction505); 

                    match(input,8,FOLLOW_8_in_walkAction507); 

                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:91:18: (w2= ID )+
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
                    	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:91:19: w2= ID
                    	    {
                    	    w2=(Token)match(input,ID,FOLLOW_ID_in_walkAction514); 

                    	     walks.add((w2!=null?w2.getText():null)); 

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


                    match(input,9,FOLLOW_9_in_walkAction521); 

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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:96:1: fightAction returns [FightAction fa] : (f1= ID | CHOOSE '(' (f2= ID )+ ')' ) ;
    public final FightAction fightAction() throws RecognitionException {
        FightAction fa = null;


        Token f1=null;
        Token f2=null;

         List<String> fights = new ArrayList<String>(); 
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:98:3: ( (f1= ID | CHOOSE '(' (f2= ID )+ ')' ) )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:98:5: (f1= ID | CHOOSE '(' (f2= ID )+ ')' )
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:98:5: (f1= ID | CHOOSE '(' (f2= ID )+ ')' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
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
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:99:7: f1= ID
                    {
                    f1=(Token)match(input,ID,FOLLOW_ID_in_fightAction566); 

                     fights.add((f1!=null?f1.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:101:7: CHOOSE '(' (f2= ID )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_fightAction586); 

                    match(input,8,FOLLOW_8_in_fightAction588); 

                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:101:18: (f2= ID )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:101:19: f2= ID
                    	    {
                    	    f2=(Token)match(input,ID,FOLLOW_ID_in_fightAction595); 

                    	     fights.add((f2!=null?f2.getText():null)); 

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


                    match(input,9,FOLLOW_9_in_fightAction602); 

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


 

    public static final BitSet FOLLOW_ID_in_saf177 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_saf179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_personality_in_saf181 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_behaviour_in_saf183 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_saf185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_saf187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strength_in_personality214 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_strength238 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_strength240 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_strength242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviourrule_in_behaviour268 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_condition_in_behaviourrule292 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviourrule294 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_walkAction_in_behaviourrule296 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_fightAction_in_behaviourrule298 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviourrule300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_condition326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atomCondition349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atomCondition365 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_condition_in_atomCondition367 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atomCondition369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomCondition_in_andCondition393 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_andCondition400 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_atomCondition_in_andCondition406 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_andCondition_in_orCondition431 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_orCondition438 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_andCondition_in_orCondition444 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ID_in_walkAction485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_walkAction505 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_walkAction507 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_walkAction514 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_9_in_walkAction521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fightAction566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_fightAction586 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_fightAction588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_fightAction595 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_9_in_fightAction602 = new BitSet(new long[]{0x0000000000000002L});

}