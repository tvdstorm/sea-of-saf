// $ANTLR 3.4 /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g 2012-02-20 23:10:15
 
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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:59:1: behaviourrule returns [BehaviourRule br] : conditions '[' walkAction fightAction ']' ;
    public final BehaviourRule behaviourrule() throws RecognitionException {
        BehaviourRule br = null;


        Condition conditions8 =null;

        WalkAction walkAction9 =null;

        FightAction fightAction10 =null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:60:3: ( conditions '[' walkAction fightAction ']' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:60:5: conditions '[' walkAction fightAction ']'
            {
            pushFollow(FOLLOW_conditions_in_behaviourrule292);
            conditions8=conditions();

            state._fsp--;


            match(input,11,FOLLOW_11_in_behaviourrule294); 

            pushFollow(FOLLOW_walkAction_in_behaviourrule296);
            walkAction9=walkAction();

            state._fsp--;


            pushFollow(FOLLOW_fightAction_in_behaviourrule298);
            fightAction10=fightAction();

            state._fsp--;


            match(input,12,FOLLOW_12_in_behaviourrule300); 

             br = new BehaviourRule(conditions8, walkAction9, fightAction10); 

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



    // $ANTLR start "conditions"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:64:1: conditions returns [Condition c] : ( atom | connective );
    public final Condition conditions() throws RecognitionException {
        Condition c = null;


        Condition atom11 =null;

        Condition connective12 =null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:65:3: ( atom | connective )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==9||LA3_1==11) ) {
                    alt3=1;
                }
                else if ( ((LA3_1 >= 13 && LA3_1 <= 14)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
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
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:65:5: atom
                    {
                    pushFollow(FOLLOW_atom_in_conditions325);
                    atom11=atom();

                    state._fsp--;


                     c = atom11;

                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:66:5: connective
                    {
                    pushFollow(FOLLOW_connective_in_conditions333);
                    connective12=connective();

                    state._fsp--;


                     c = connective12; 

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
    // $ANTLR end "conditions"



    // $ANTLR start "atom"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:68:1: atom returns [Condition atom] : ID ;
    public final Condition atom() throws RecognitionException {
        Condition atom = null;


        Token ID13=null;

        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:69:3: ( ID )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:69:5: ID
            {
            ID13=(Token)match(input,ID,FOLLOW_ID_in_atom352); 

             atom = new ConditionAction((ID13!=null?ID13.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return atom;
    }
    // $ANTLR end "atom"



    // $ANTLR start "connective"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:73:1: connective returns [Condition c] : ( '(' lhs= conditions ')' op= ( 'and' | 'or' ) rhs= conditions |lhs= atom op= ( 'and' | 'or' ) '(' rhs= conditions ')' |lhs= atom op= ( 'and' | 'or' ) rhs= atom ) ;
    public final Condition connective() throws RecognitionException {
        Condition c = null;


        Token op=null;
        Condition lhs =null;

        Condition rhs =null;


        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:73:33: ( ( '(' lhs= conditions ')' op= ( 'and' | 'or' ) rhs= conditions |lhs= atom op= ( 'and' | 'or' ) '(' rhs= conditions ')' |lhs= atom op= ( 'and' | 'or' ) rhs= atom ) )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:73:35: ( '(' lhs= conditions ')' op= ( 'and' | 'or' ) rhs= conditions |lhs= atom op= ( 'and' | 'or' ) '(' rhs= conditions ')' |lhs= atom op= ( 'and' | 'or' ) rhs= atom )
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:73:35: ( '(' lhs= conditions ')' op= ( 'and' | 'or' ) rhs= conditions |lhs= atom op= ( 'and' | 'or' ) '(' rhs= conditions ')' |lhs= atom op= ( 'and' | 'or' ) rhs= atom )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==8) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                int LA4_2 = input.LA(2);

                if ( ((LA4_2 >= 13 && LA4_2 <= 14)) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==8) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==ID) ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:74:5: '(' lhs= conditions ')' op= ( 'and' | 'or' ) rhs= conditions
                    {
                    match(input,8,FOLLOW_8_in_connective375); 

                    pushFollow(FOLLOW_conditions_in_connective381);
                    lhs=conditions();

                    state._fsp--;


                    match(input,9,FOLLOW_9_in_connective383); 

                    op=(Token)input.LT(1);

                    if ( (input.LA(1) >= 13 && input.LA(1) <= 14) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_conditions_in_connective401);
                    rhs=conditions();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:75:7: lhs= atom op= ( 'and' | 'or' ) '(' rhs= conditions ')'
                    {
                    pushFollow(FOLLOW_atom_in_connective413);
                    lhs=atom();

                    state._fsp--;


                    op=(Token)input.LT(1);

                    if ( (input.LA(1) >= 13 && input.LA(1) <= 14) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,8,FOLLOW_8_in_connective427); 

                    pushFollow(FOLLOW_conditions_in_connective433);
                    rhs=conditions();

                    state._fsp--;


                    match(input,9,FOLLOW_9_in_connective435); 

                    }
                    break;
                case 3 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:76:7: lhs= atom op= ( 'and' | 'or' ) rhs= atom
                    {
                    pushFollow(FOLLOW_atom_in_connective447);
                    lhs=atom();

                    state._fsp--;


                    op=(Token)input.LT(1);

                    if ( (input.LA(1) >= 13 && input.LA(1) <= 14) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_atom_in_connective465);
                    rhs=atom();

                    state._fsp--;


                    }
                    break;

            }


             
                if((op!=null?op.getText():null).equals("and"))
                  c = new ConditionAnd(lhs, rhs);
                else
                  c = new ConditionOr(lhs, rhs);
              

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
    // $ANTLR end "connective"



    // $ANTLR start "walkAction"
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:84:1: walkAction returns [WalkAction wa] : (w1= ID | CHOOSE '(' (w2= ID )+ ')' ) ;
    public final WalkAction walkAction() throws RecognitionException {
        WalkAction wa = null;


        Token w1=null;
        Token w2=null;

         List<String> walks = new ArrayList<String>(); 
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:86:3: ( (w1= ID | CHOOSE '(' (w2= ID )+ ')' ) )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:86:5: (w1= ID | CHOOSE '(' (w2= ID )+ ')' )
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:86:5: (w1= ID | CHOOSE '(' (w2= ID )+ ')' )
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
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:87:7: w1= ID
                    {
                    w1=(Token)match(input,ID,FOLLOW_ID_in_walkAction502); 

                     walks.add((w1!=null?w1.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:89:7: CHOOSE '(' (w2= ID )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_walkAction522); 

                    match(input,8,FOLLOW_8_in_walkAction524); 

                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:89:18: (w2= ID )+
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
                    	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:89:19: w2= ID
                    	    {
                    	    w2=(Token)match(input,ID,FOLLOW_ID_in_walkAction531); 

                    	     walks.add((w2!=null?w2.getText():null)); 

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


                    match(input,9,FOLLOW_9_in_walkAction538); 

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
    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:94:1: fightAction returns [FightAction fa] : (f1= ID | CHOOSE '(' (f2= ID )+ ')' ) ;
    public final FightAction fightAction() throws RecognitionException {
        FightAction fa = null;


        Token f1=null;
        Token f2=null;

         List<String> fights = new ArrayList<String>(); 
        try {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:96:3: ( (f1= ID | CHOOSE '(' (f2= ID )+ ')' ) )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:96:5: (f1= ID | CHOOSE '(' (f2= ID )+ ')' )
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:96:5: (f1= ID | CHOOSE '(' (f2= ID )+ ')' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==CHOOSE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:97:7: f1= ID
                    {
                    f1=(Token)match(input,ID,FOLLOW_ID_in_fightAction583); 

                     fights.add((f1!=null?f1.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:99:7: CHOOSE '(' (f2= ID )+ ')'
                    {
                    match(input,CHOOSE,FOLLOW_CHOOSE_in_fightAction603); 

                    match(input,8,FOLLOW_8_in_fightAction605); 

                    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:99:18: (f2= ID )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:99:19: f2= ID
                    	    {
                    	    f2=(Token)match(input,ID,FOLLOW_ID_in_fightAction612); 

                    	     fights.add((f2!=null?f2.getText():null)); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    match(input,9,FOLLOW_9_in_fightAction619); 

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
    public static final BitSet FOLLOW_conditions_in_behaviourrule292 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviourrule294 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_walkAction_in_behaviourrule296 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_fightAction_in_behaviourrule298 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviourrule300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_conditions325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connective_in_conditions333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_connective375 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_conditions_in_connective381 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_connective383 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_set_in_connective389 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_conditions_in_connective401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_connective413 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_set_in_connective419 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_connective427 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_conditions_in_connective433 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_connective435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_connective447 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_set_in_connective453 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_atom_in_connective465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_walkAction502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_walkAction522 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_walkAction524 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_walkAction531 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_9_in_walkAction538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fightAction583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_fightAction603 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_fightAction605 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_fightAction612 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_9_in_fightAction619 = new BitSet(new long[]{0x0000000000000002L});

}