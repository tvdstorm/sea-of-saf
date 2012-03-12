// $ANTLR 3.4 SAF.g 2012-03-12 11:41:18

    package saf.syntax;
    import saf.ast.nodes.*;
    import saf.bot.GameBot;
    import java.lang.String;
    


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "WS", "'('", "')'", "'='", "'['", "']'", "'and'", "'choose'", "'or'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int ID=4;
    public static final int INT=5;
    public static final int WS=6;

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
    public String getGrammarFileName() { return "SAF.g"; }



    // $ANTLR start "fighter"
    // SAF.g:20:1: fighter returns [GameBot fighter] : name= ID '{' ( strength | rule )* '}' ;
    public final GameBot fighter() throws RecognitionException {
        GameBot fighter = null;


        Token name=null;
        Strength strength1 =null;

        Rule rule2 =null;


        try {
            // SAF.g:21:5: (name= ID '{' ( strength | rule )* '}' )
            // SAF.g:21:9: name= ID '{' ( strength | rule )* '}'
            {
            name=(Token)match(input,ID,FOLLOW_ID_in_fighter60); 

             fighter = new GameBot((name!=null?name.getText():null)); 

            match(input,15,FOLLOW_15_in_fighter88); 

            // SAF.g:23:13: ( strength | rule )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==9) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==10||LA1_2==12||LA1_2==14) ) {
                        alt1=2;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // SAF.g:23:17: strength
            	    {
            	    pushFollow(FOLLOW_strength_in_fighter107);
            	    strength1=strength();

            	    state._fsp--;


            	     fighter.addStrength(strength1); 

            	    }
            	    break;
            	case 2 :
            	    // SAF.g:24:19: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_fighter136);
            	    rule2=rule();

            	    state._fsp--;


            	     fighter.addRule(rule2); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_fighter172); 

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



    // $ANTLR start "strength"
    // SAF.g:29:1: strength returns [Strength s] : ID '=' INT ;
    public final Strength strength() throws RecognitionException {
        Strength s = null;


        Token ID3=null;
        Token INT4=null;

        try {
            // SAF.g:30:5: ( ID '=' INT )
            // SAF.g:30:7: ID '=' INT
            {
            ID3=(Token)match(input,ID,FOLLOW_ID_in_strength199); 

            match(input,9,FOLLOW_9_in_strength201); 

            INT4=(Token)match(input,INT,FOLLOW_INT_in_strength203); 

             s = new Strength((ID3!=null?ID3.getText():null), (INT4!=null?Integer.valueOf(INT4.getText()):0)); 

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



    // $ANTLR start "rule"
    // SAF.g:33:1: rule returns [Rule r] : condition '[' (m0= ID | 'choose' '(' m1= ID m2= ID ')' ) (a0= ID | 'choose' '(' a1= ID a2= ID ')' ) ']' ;
    public final Rule rule() throws RecognitionException {
        Rule r = null;


        Token m0=null;
        Token m1=null;
        Token m2=null;
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Condition condition5 =null;


        try {
            // SAF.g:34:5: ( condition '[' (m0= ID | 'choose' '(' m1= ID m2= ID ')' ) (a0= ID | 'choose' '(' a1= ID a2= ID ')' ) ']' )
            // SAF.g:34:42: condition '[' (m0= ID | 'choose' '(' m1= ID m2= ID ')' ) (a0= ID | 'choose' '(' a1= ID a2= ID ')' ) ']'
            {
             r = new Rule();

            pushFollow(FOLLOW_condition_in_rule285);
            condition5=condition();

            state._fsp--;


             r.setCondition(condition5); 

            match(input,10,FOLLOW_10_in_rule318); 

            // SAF.g:37:9: (m0= ID | 'choose' '(' m1= ID m2= ID ')' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // SAF.g:37:10: m0= ID
                    {
                    m0=(Token)match(input,ID,FOLLOW_ID_in_rule332); 

                     r.addMove(new Move((m0!=null?m0.getText():null))); 

                    }
                    break;
                case 2 :
                    // SAF.g:38:11: 'choose' '(' m1= ID m2= ID ')'
                    {
                    match(input,13,FOLLOW_13_in_rule375); 

                    match(input,7,FOLLOW_7_in_rule377); 

                    m1=(Token)match(input,ID,FOLLOW_ID_in_rule381); 

                    m2=(Token)match(input,ID,FOLLOW_ID_in_rule385); 

                    match(input,8,FOLLOW_8_in_rule387); 

                     r.addMove(new Move((m1!=null?m1.getText():null)));
                                                                  r.addMove(new Move((m2!=null?m2.getText():null))); 

                    }
                    break;

            }


            // SAF.g:41:9: (a0= ID | 'choose' '(' a1= ID a2= ID ')' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // SAF.g:41:10: a0= ID
                    {
                    a0=(Token)match(input,ID,FOLLOW_ID_in_rule417); 

                     r.addAttack(new Attack((a0!=null?a0.getText():null))); 

                    }
                    break;
                case 2 :
                    // SAF.g:42:11: 'choose' '(' a1= ID a2= ID ')'
                    {
                    match(input,13,FOLLOW_13_in_rule460); 

                    match(input,7,FOLLOW_7_in_rule462); 

                    a1=(Token)match(input,ID,FOLLOW_ID_in_rule466); 

                    a2=(Token)match(input,ID,FOLLOW_ID_in_rule470); 

                    match(input,8,FOLLOW_8_in_rule472); 

                     r.addAttack(new Attack((a1!=null?a1.getText():null)));
                                                                  r.addAttack(new Attack((a2!=null?a2.getText():null))); 

                    }
                    break;

            }


            match(input,11,FOLLOW_11_in_rule495); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "rule"



    // $ANTLR start "condition"
    // SAF.g:49:1: condition returns [Condition c] : ID ( 'and' c1= conditionTail | 'or' c2= conditionTail |) ;
    public final Condition condition() throws RecognitionException {
        Condition c = null;


        Token ID6=null;
        Condition c1 =null;

        Condition c2 =null;


        try {
            // SAF.g:50:5: ( ID ( 'and' c1= conditionTail | 'or' c2= conditionTail |) )
            // SAF.g:50:7: ID ( 'and' c1= conditionTail | 'or' c2= conditionTail |)
            {
            ID6=(Token)match(input,ID,FOLLOW_ID_in_condition517); 

            // SAF.g:51:2: ( 'and' c1= conditionTail | 'or' c2= conditionTail |)
            int alt4=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 10:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // SAF.g:52:5: 'and' c1= conditionTail
                    {
                    match(input,12,FOLLOW_12_in_condition532); 

                    pushFollow(FOLLOW_conditionTail_in_condition536);
                    c1=conditionTail();

                    state._fsp--;


                     c = new ConditionOperator("and");
                    		                              c.addCondition(new ConditionName((ID6!=null?ID6.getText():null)));
                    		                              c.addCondition(c1);

                    }
                    break;
                case 2 :
                    // SAF.g:55:5: 'or' c2= conditionTail
                    {
                    match(input,14,FOLLOW_14_in_condition547); 

                    pushFollow(FOLLOW_conditionTail_in_condition551);
                    c2=conditionTail();

                    state._fsp--;


                     c = new ConditionOperator("or");
                    		                              c.addCondition(new ConditionName((ID6!=null?ID6.getText():null)));
                    		                              c.addCondition(c2);

                    }
                    break;
                case 3 :
                    // SAF.g:58:14: 
                    {
                     c = new ConditionName((ID6!=null?ID6.getText():null)); 

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
        return c;
    }
    // $ANTLR end "condition"



    // $ANTLR start "conditionTail"
    // SAF.g:62:1: conditionTail returns [Condition c] : condition ;
    public final Condition conditionTail() throws RecognitionException {
        Condition c = null;


        Condition condition7 =null;


        try {
            // SAF.g:63:5: ( condition )
            // SAF.g:63:7: condition
            {
            pushFollow(FOLLOW_condition_in_conditionTail595);
            condition7=condition();

            state._fsp--;


             c = condition7; 

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
    // $ANTLR end "conditionTail"



    // $ANTLR start "move"
    // SAF.g:66:1: move returns [Move m] : ID ;
    public final Move move() throws RecognitionException {
        Move m = null;


        Token ID8=null;

        try {
            // SAF.g:67:2: ( ID )
            // SAF.g:67:4: ID
            {
            ID8=(Token)match(input,ID,FOLLOW_ID_in_move643); 

             m = new Move((ID8!=null?ID8.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return m;
    }
    // $ANTLR end "move"



    // $ANTLR start "attack"
    // SAF.g:70:1: attack returns [Attack a] : ID ;
    public final Attack attack() throws RecognitionException {
        Attack a = null;


        Token ID9=null;

        try {
            // SAF.g:71:2: ( ID )
            // SAF.g:71:4: ID
            {
            ID9=(Token)match(input,ID,FOLLOW_ID_in_attack668); 

             a = new Attack((ID9!=null?ID9.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return a;
    }
    // $ANTLR end "attack"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_fighter60 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_fighter88 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_strength_in_fighter107 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule_in_fighter136 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_fighter172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_strength199 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_strength201 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_strength203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_rule285 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_rule318 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ID_in_rule332 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_rule375 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_rule377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_rule381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_rule385 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_rule387 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ID_in_rule417 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13_in_rule460 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_rule462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_rule466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_rule470 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_rule472 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rule495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_condition517 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_12_in_condition532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_conditionTail_in_condition536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_condition547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_conditionTail_in_condition551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_conditionTail595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_move643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attack668 = new BitSet(new long[]{0x0000000000000002L});

}