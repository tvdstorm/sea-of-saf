// $ANTLR 3.4 D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g 2012-01-20 18:54:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class saf1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Characteristic", "ID", "INT", "NEWLINE", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'='"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int Characteristic=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int NEWLINE=7;
    public static final int WS=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public saf1Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public saf1Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return saf1Parser.tokenNames; }
    public String getGrammarFileName() { return "D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g"; }



    // $ANTLR start "prog"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:4:1: prog : ( saf1 )+ ;
    public final void prog() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:4:5: ( ( saf1 )+ )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:4:8: ( saf1 )+
            {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:4:8: ( saf1 )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:4:8: saf1
            	    {
            	    pushFollow(FOLLOW_saf1_in_prog11);
            	    saf1();

            	    state._fsp--;


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
    // $ANTLR end "prog"



    // $ANTLR start "saf1"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:6:1: saf1 : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
    public final void saf1() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:6:5: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
            int alt2=3;
            switch ( input.LA(1) ) {
            case INT:
            case 9:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==14) ) {
                    alt2=2;
                }
                else if ( (LA2_2==NEWLINE||(LA2_2 >= 11 && LA2_2 <= 13)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case NEWLINE:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:6:9: expr NEWLINE
                    {
                    pushFollow(FOLLOW_expr_in_saf122);
                    expr();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_saf124); 

                    }
                    break;
                case 2 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:6:29: ID '=' expr NEWLINE
                    {
                    match(input,ID,FOLLOW_ID_in_saf133); 

                    match(input,14,FOLLOW_14_in_saf135); 

                    pushFollow(FOLLOW_expr_in_saf137);
                    expr();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_saf139); 

                    }
                    break;
                case 3 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:7:9: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_saf149); 

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
    // $ANTLR end "saf1"



    // $ANTLR start "expr"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:15:1: expr : multExpr ( ( '+' | '-' ) multExpr )* ;
    public final void expr() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:15:5: ( multExpr ( ( '+' | '-' ) multExpr )* )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:15:9: multExpr ( ( '+' | '-' ) multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_expr67);
            multExpr();

            state._fsp--;


            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:15:18: ( ( '+' | '-' ) multExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= 12 && LA3_0 <= 13)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:15:19: ( '+' | '-' ) multExpr
            	    {
            	    if ( (input.LA(1) >= 12 && input.LA(1) <= 13) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multExpr_in_expr76);
            	    multExpr();

            	    state._fsp--;


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
        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "multExpr"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:18:1: multExpr : atom ( '*' atom )* ;
    public final void multExpr() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:19:5: ( atom ( '*' atom )* )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:19:9: atom ( '*' atom )*
            {
            pushFollow(FOLLOW_atom_in_multExpr98);
            atom();

            state._fsp--;


            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:19:14: ( '*' atom )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:19:15: '*' atom
            	    {
            	    match(input,11,FOLLOW_11_in_multExpr101); 

            	    pushFollow(FOLLOW_atom_in_multExpr103);
            	    atom();

            	    state._fsp--;


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
        return ;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "punchReach"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:22:1: punchReach : INT ;
    public final void punchReach() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:22:11: ( INT )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:22:15: INT
            {
            match(input,INT,FOLLOW_INT_in_punchReach120); 

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
    // $ANTLR end "punchReach"



    // $ANTLR start "punchPower"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:23:1: punchPower : INT ;
    public final void punchPower() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:23:11: ( INT )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:23:15: INT
            {
            match(input,INT,FOLLOW_INT_in_punchPower128); 

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
    // $ANTLR end "punchPower"



    // $ANTLR start "kickReach"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:24:1: kickReach : INT ;
    public final void kickReach() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:24:10: ( INT )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:24:14: INT
            {
            match(input,INT,FOLLOW_INT_in_kickReach136); 

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
    // $ANTLR end "kickReach"



    // $ANTLR start "kickPower"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:25:1: kickPower : INT ;
    public final void kickPower() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:25:10: ( INT )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:25:14: INT
            {
            match(input,INT,FOLLOW_INT_in_kickPower144); 

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
    // $ANTLR end "kickPower"



    // $ANTLR start "atom"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:34:1: atom : ( INT | ID | '(' expr ')' );
    public final void atom() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:34:5: ( INT | ID | '(' expr ')' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                alt5=2;
                }
                break;
            case 9:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:34:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_atom225); 

                    }
                    break;
                case 2 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:34:17: ID
                    {
                    match(input,ID,FOLLOW_ID_in_atom231); 

                    }
                    break;
                case 3 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\saf1.g:34:24: '(' expr ')'
                    {
                    match(input,9,FOLLOW_9_in_atom237); 

                    pushFollow(FOLLOW_expr_in_atom239);
                    expr();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_atom241); 

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
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_saf1_in_prog11 = new BitSet(new long[]{0x00000000000002E2L});
    public static final BitSet FOLLOW_expr_in_saf122 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_saf124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_saf133 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_saf135 = new BitSet(new long[]{0x0000000000000260L});
    public static final BitSet FOLLOW_expr_in_saf137 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_saf139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_saf149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr67 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_set_in_expr70 = new BitSet(new long[]{0x0000000000000260L});
    public static final BitSet FOLLOW_multExpr_in_expr76 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_atom_in_multExpr98 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_multExpr101 = new BitSet(new long[]{0x0000000000000260L});
    public static final BitSet FOLLOW_atom_in_multExpr103 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_INT_in_punchReach120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_punchPower128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_kickReach136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_kickPower144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_atom237 = new BitSet(new long[]{0x0000000000000260L});
    public static final BitSet FOLLOW_expr_in_atom239 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_atom241 = new BitSet(new long[]{0x0000000000000002L});

}