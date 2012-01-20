// $ANTLR 3.4 D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g 2012-01-20 12:51:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class jorgeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'='"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int ID=4;
    public static final int INT=5;
    public static final int NEWLINE=6;
    public static final int WS=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public jorgeParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public jorgeParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return jorgeParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g"; }



    // $ANTLR start "prog"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:4:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:4:5: ( ( stat )+ )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:4:9: ( stat )+
            {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:4:9: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==8) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:4:9: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog12);
            	    stat();

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



    // $ANTLR start "stat"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:6:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
    public final void stat() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:6:5: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
            int alt2=3;
            switch ( input.LA(1) ) {
            case INT:
            case 8:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==13) ) {
                    alt2=2;
                }
                else if ( (LA2_2==NEWLINE||(LA2_2 >= 10 && LA2_2 <= 12)) ) {
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
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:6:9: expr NEWLINE
                    {
                    pushFollow(FOLLOW_expr_in_stat23);
                    expr();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat25); 

                    }
                    break;
                case 2 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:7:9: ID '=' expr NEWLINE
                    {
                    match(input,ID,FOLLOW_ID_in_stat35); 

                    match(input,13,FOLLOW_13_in_stat37); 

                    pushFollow(FOLLOW_expr_in_stat39);
                    expr();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat41); 

                    }
                    break;
                case 3 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:8:9: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat51); 

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
    // $ANTLR end "stat"



    // $ANTLR start "expr"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:13:1: expr : multExpr ( ( '+' | '-' ) multExpr )* ;
    public final void expr() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:13:5: ( multExpr ( ( '+' | '-' ) multExpr )* )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:13:9: multExpr ( ( '+' | '-' ) multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_expr67);
            multExpr();

            state._fsp--;


            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:13:18: ( ( '+' | '-' ) multExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= 11 && LA3_0 <= 12)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:13:19: ( '+' | '-' ) multExpr
            	    {
            	    if ( (input.LA(1) >= 11 && input.LA(1) <= 12) ) {
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
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:16:1: multExpr : atom ( '*' atom )* ;
    public final void multExpr() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:17:5: ( atom ( '*' atom )* )
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:17:9: atom ( '*' atom )*
            {
            pushFollow(FOLLOW_atom_in_multExpr98);
            atom();

            state._fsp--;


            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:17:14: ( '*' atom )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==10) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:17:15: '*' atom
            	    {
            	    match(input,10,FOLLOW_10_in_multExpr101); 

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



    // $ANTLR start "atom"
    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:20:1: atom : ( INT | ID | '(' expr ')' );
    public final void atom() throws RecognitionException {
        try {
            // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:20:5: ( INT | ID | '(' expr ')' )
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
            case 8:
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
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:20:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_atom120); 

                    }
                    break;
                case 2 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:21:9: ID
                    {
                    match(input,ID,FOLLOW_ID_in_atom131); 

                    }
                    break;
                case 3 :
                    // D:\\uva\\Software Engineering\\Software Construction\\ANTLR\\jorge.g:22:9: '(' expr ')'
                    {
                    match(input,8,FOLLOW_8_in_atom141); 

                    pushFollow(FOLLOW_expr_in_atom143);
                    expr();

                    state._fsp--;


                    match(input,9,FOLLOW_9_in_atom145); 

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


 

    public static final BitSet FOLLOW_stat_in_prog12 = new BitSet(new long[]{0x0000000000000172L});
    public static final BitSet FOLLOW_expr_in_stat23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat25 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat35 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_stat37 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_stat39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr67 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_set_in_expr70 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_multExpr_in_expr76 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_atom_in_multExpr98 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_multExpr101 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_atom_in_multExpr103 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_INT_in_atom120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atom141 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_atom143 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom145 = new BitSet(new long[]{0x0000000000000002L});

}