// $ANTLR 3.4 syntax/SAF.g 2012-03-02 17:04:08

    package saf.syntax;
    import saf.ast.*;
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
    public String getGrammarFileName() { return "syntax/SAF.g"; }



    // $ANTLR start "fighter"
    // syntax/SAF.g:18:1: fighter returns [Fighter fighter] : name= ID '{' ( strength | rule )* '}' ;
    public final Fighter fighter() throws RecognitionException {
        Fighter fighter = null;


        Token name=null;
        Strength strength1 =null;

        Rule rule2 =null;


        try {
            // syntax/SAF.g:19:5: (name= ID '{' ( strength | rule )* '}' )
            // syntax/SAF.g:19:9: name= ID '{' ( strength | rule )* '}'
            {
            name=(Token)match(input,ID,FOLLOW_ID_in_fighter56); 

             fighter = new Fighter((name!=null?name.getText():null)); 

            match(input,15,FOLLOW_15_in_fighter84); 

            // syntax/SAF.g:21:13: ( strength | rule )*
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
            	    // syntax/SAF.g:21:17: strength
            	    {
            	    pushFollow(FOLLOW_strength_in_fighter103);
            	    strength1=strength();

            	    state._fsp--;


            	     fighter.addChild(strength1); 

            	    }
            	    break;
            	case 2 :
            	    // syntax/SAF.g:22:19: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_fighter132);
            	    rule2=rule();

            	    state._fsp--;


            	     fighter.addChild(rule2); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_fighter168); 

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
    // syntax/SAF.g:27:1: strength returns [Strength s] : ID '=' INT ;
    public final Strength strength() throws RecognitionException {
        Strength s = null;


        Token ID3=null;
        Token INT4=null;

        try {
            // syntax/SAF.g:28:5: ( ID '=' INT )
            // syntax/SAF.g:28:7: ID '=' INT
            {
            ID3=(Token)match(input,ID,FOLLOW_ID_in_strength195); 

            match(input,9,FOLLOW_9_in_strength197); 

            INT4=(Token)match(input,INT,FOLLOW_INT_in_strength199); 

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
    // syntax/SAF.g:31:1: rule returns [Rule r] : ( (c1= condition 'and' c2= condition ) | (c1= condition 'or' c2= condition ) |c1= condition ) '[' move attack ']' ;
    public final Rule rule() throws RecognitionException {
        Rule r = null;


        Condition c1 =null;

        Condition c2 =null;

        Move move5 =null;

        Attack attack6 =null;


        try {
            // syntax/SAF.g:32:5: ( ( (c1= condition 'and' c2= condition ) | (c1= condition 'or' c2= condition ) |c1= condition ) '[' move attack ']' )
            // syntax/SAF.g:32:33: ( (c1= condition 'and' c2= condition ) | (c1= condition 'or' c2= condition ) |c1= condition ) '[' move attack ']'
            {
             r = new Rule();

            // syntax/SAF.g:33:7: ( (c1= condition 'and' c2= condition ) | (c1= condition 'or' c2= condition ) |c1= condition )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                switch ( input.LA(2) ) {
                case 12:
                    {
                    alt2=1;
                    }
                    break;
                case 14:
                    {
                    alt2=2;
                    }
                    break;
                case 10:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // syntax/SAF.g:34:13: (c1= condition 'and' c2= condition )
                    {
                    // syntax/SAF.g:34:13: (c1= condition 'and' c2= condition )
                    // syntax/SAF.g:34:15: c1= condition 'and' c2= condition
                    {
                    pushFollow(FOLLOW_condition_in_rule293);
                    c1=condition();

                    state._fsp--;


                    match(input,12,FOLLOW_12_in_rule295); 

                    pushFollow(FOLLOW_condition_in_rule299);
                    c2=condition();

                    state._fsp--;


                    }


                     And and = new And(); r.addChild(and); and.addChild(c1); and.addChild(c2); 

                    }
                    break;
                case 2 :
                    // syntax/SAF.g:35:13: (c1= condition 'or' c2= condition )
                    {
                    // syntax/SAF.g:35:13: (c1= condition 'or' c2= condition )
                    // syntax/SAF.g:35:15: c1= condition 'or' c2= condition
                    {
                    pushFollow(FOLLOW_condition_in_rule321);
                    c1=condition();

                    state._fsp--;


                    match(input,14,FOLLOW_14_in_rule323); 

                    pushFollow(FOLLOW_condition_in_rule327);
                    c2=condition();

                    state._fsp--;


                    }


                     Or or = new Or(); r.addChild(or); or.addChild(c1); or.addChild(c2); 

                    }
                    break;
                case 3 :
                    // syntax/SAF.g:36:15: c1= condition
                    {
                    pushFollow(FOLLOW_condition_in_rule350);
                    c1=condition();

                    state._fsp--;


                     r.addChild(c1); 

                    }
                    break;

            }


            match(input,10,FOLLOW_10_in_rule389); 

            pushFollow(FOLLOW_move_in_rule391);
            move5=move();

            state._fsp--;


            pushFollow(FOLLOW_attack_in_rule393);
            attack6=attack();

            state._fsp--;


            match(input,11,FOLLOW_11_in_rule395); 

             r.addChild(move5); r.addChild(attack6); 

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
    // syntax/SAF.g:41:1: condition returns [Condition c] : ID ;
    public final Condition condition() throws RecognitionException {
        Condition c = null;


        Token ID7=null;

        try {
            // syntax/SAF.g:42:5: ( ID )
            // syntax/SAF.g:42:7: ID
            {
            ID7=(Token)match(input,ID,FOLLOW_ID_in_condition453); 

             c = new Condition((ID7!=null?ID7.getText():null)); 

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



    // $ANTLR start "move"
    // syntax/SAF.g:45:1: move returns [Move m] : ( 'choose' '(' m1= ID (m2= ID )* ')' |m1= ID );
    public final Move move() throws RecognitionException {
        Move m = null;


        Token m1=null;
        Token m2=null;

        try {
            // syntax/SAF.g:46:5: ( 'choose' '(' m1= ID (m2= ID )* ')' |m1= ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // syntax/SAF.g:46:7: 'choose' '(' m1= ID (m2= ID )* ')'
                    {
                    match(input,13,FOLLOW_13_in_move499); 

                    match(input,7,FOLLOW_7_in_move501); 

                    m1=(Token)match(input,ID,FOLLOW_ID_in_move526); 

                     m = new Move((m1!=null?m1.getText():null)); 

                    // syntax/SAF.g:48:20: (m2= ID )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // syntax/SAF.g:49:25: m2= ID
                    	    {
                    	    m2=(Token)match(input,ID,FOLLOW_ID_in_move584); 

                    	     m.addAction((m2!=null?m2.getText():null)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    match(input,8,FOLLOW_8_in_move637); 

                    }
                    break;
                case 2 :
                    // syntax/SAF.g:52:7: m1= ID
                    {
                    m1=(Token)match(input,ID,FOLLOW_ID_in_move650); 

                     m = new Move((m1!=null?m1.getText():null)); 

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
        return m;
    }
    // $ANTLR end "move"



    // $ANTLR start "attack"
    // syntax/SAF.g:55:1: attack returns [Attack a] : ( 'choose' '(' a1= ID (a2= ID )* ')' |a1= ID );
    public final Attack attack() throws RecognitionException {
        Attack a = null;


        Token a1=null;
        Token a2=null;

        try {
            // syntax/SAF.g:56:5: ( 'choose' '(' a1= ID (a2= ID )* ')' |a1= ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // syntax/SAF.g:56:7: 'choose' '(' a1= ID (a2= ID )* ')'
                    {
                    match(input,13,FOLLOW_13_in_attack697); 

                    match(input,7,FOLLOW_7_in_attack699); 

                    a1=(Token)match(input,ID,FOLLOW_ID_in_attack724); 

                     a = new Attack((a1!=null?a1.getText():null)); 

                    // syntax/SAF.g:58:20: (a2= ID )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // syntax/SAF.g:59:25: a2= ID
                    	    {
                    	    a2=(Token)match(input,ID,FOLLOW_ID_in_attack782); 

                    	     a.addAction((a2!=null?a2.getText():null)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match(input,8,FOLLOW_8_in_attack835); 

                    }
                    break;
                case 2 :
                    // syntax/SAF.g:62:6: a1= ID
                    {
                    a1=(Token)match(input,ID,FOLLOW_ID_in_attack847); 

                     a = new Attack((a1!=null?a1.getText():null)); 

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
        return a;
    }
    // $ANTLR end "attack"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_fighter56 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_fighter84 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_strength_in_fighter103 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule_in_fighter132 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_fighter168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_strength195 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_strength197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_strength199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_rule293 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rule295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_condition_in_rule299 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_condition_in_rule321 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rule323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_condition_in_rule327 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_condition_in_rule350 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_rule389 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_move_in_rule391 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_attack_in_rule393 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rule395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_condition453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_move499 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_move501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_move526 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ID_in_move584 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_8_in_move637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_move650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_attack697 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_attack699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_attack724 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ID_in_attack782 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_8_in_attack835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attack847 = new BitSet(new long[]{0x0000000000000002L});

}