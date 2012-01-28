// $ANTLR 3.4 D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g 2012-01-28 17:48:52

  package saf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "WS", "'('", "')'", "'='", "'['", "']'", "'and'", "'choose('", "'or'", "'{'", "'}'"
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
    public static final int IDENT=4;
    public static final int INTEGER=5;
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
    public String getGrammarFileName() { return "D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g"; }



    // $ANTLR start "bot"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:11:1: bot : IDENT '{' ( characterstics | rule )* '}' ;
    public final void bot() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:12:2: ( IDENT '{' ( characterstics | rule )* '}' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:12:4: IDENT '{' ( characterstics | rule )* '}'
            {
            match(input,IDENT,FOLLOW_IDENT_in_bot27); 

            match(input,15,FOLLOW_15_in_bot29); 

            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:13:4: ( characterstics | rule )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==9) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==10) ) {
                        alt1=2;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:13:5: characterstics
            	    {
            	    pushFollow(FOLLOW_characterstics_in_bot36);
            	    characterstics();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:13:22: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_bot40);
            	    rule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_bot47); 

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
    // $ANTLR end "bot"



    // $ANTLR start "characterstics"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:17:1: characterstics : IDENT '=' INTEGER ;
    public final void characterstics() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:18:2: ( IDENT '=' INTEGER )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:19:3: IDENT '=' INTEGER
            {
            match(input,IDENT,FOLLOW_IDENT_in_characterstics60); 

            match(input,9,FOLLOW_9_in_characterstics62); 

            match(input,INTEGER,FOLLOW_INTEGER_in_characterstics64); 

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
    // $ANTLR end "characterstics"



    // $ANTLR start "rule"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:22:1: rule : function ( operator function )* ( ruleExpression )* ;
    public final void rule() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:23:2: ( function ( operator function )* ( ruleExpression )* )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:24:2: function ( operator function )* ( ruleExpression )*
            {
            pushFollow(FOLLOW_function_in_rule79);
            function();

            state._fsp--;


            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:24:11: ( operator function )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==14) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==IDENT) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:24:12: operator function
            	    {
            	    pushFollow(FOLLOW_operator_in_rule82);
            	    operator();

            	    state._fsp--;


            	    pushFollow(FOLLOW_function_in_rule84);
            	    function();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:24:32: ( ruleExpression )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:24:33: ruleExpression
            	    {
            	    pushFollow(FOLLOW_ruleExpression_in_rule89);
            	    ruleExpression();

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
    // $ANTLR end "rule"



    // $ANTLR start "ruleExpression"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:27:1: ruleExpression : operator '(' rule ')' ;
    public final void ruleExpression() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:27:15: ( operator '(' rule ')' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:28:2: operator '(' rule ')'
            {
            pushFollow(FOLLOW_operator_in_ruleExpression103);
            operator();

            state._fsp--;


            match(input,7,FOLLOW_7_in_ruleExpression105); 

            pushFollow(FOLLOW_rule_in_ruleExpression107);
            rule();

            state._fsp--;


            match(input,8,FOLLOW_8_in_ruleExpression109); 

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
    // $ANTLR end "ruleExpression"



    // $ANTLR start "operator"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:31:1: operator : ( 'and' | 'or' );
    public final void operator() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:32:2: ( 'and' | 'or' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:
            {
            if ( input.LA(1)==12||input.LA(1)==14 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
        return ;
    }
    // $ANTLR end "operator"



    // $ANTLR start "function"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:37:1: function : IDENT '[' parameters ']' ;
    public final void function() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:38:2: ( IDENT '[' parameters ']' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:39:2: IDENT '[' parameters ']'
            {
            match(input,IDENT,FOLLOW_IDENT_in_function141); 

            match(input,10,FOLLOW_10_in_function143); 

            pushFollow(FOLLOW_parameters_in_function145);
            parameters();

            state._fsp--;


            match(input,11,FOLLOW_11_in_function147); 

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
    // $ANTLR end "function"



    // $ANTLR start "parameters"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:42:1: parameters : ( IDENT IDENT | choose IDENT | IDENT choose );
    public final void parameters() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:43:2: ( IDENT IDENT | choose IDENT | IDENT choose )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==IDENT) ) {
                    alt4=1;
                }
                else if ( (LA4_1==13) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:44:2: IDENT IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_parameters160); 

                    match(input,IDENT,FOLLOW_IDENT_in_parameters162); 

                    }
                    break;
                case 2 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:45:3: choose IDENT
                    {
                    pushFollow(FOLLOW_choose_in_parameters166);
                    choose();

                    state._fsp--;


                    match(input,IDENT,FOLLOW_IDENT_in_parameters168); 

                    }
                    break;
                case 3 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:46:3: IDENT choose
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_parameters172); 

                    pushFollow(FOLLOW_choose_in_parameters174);
                    choose();

                    state._fsp--;


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
    // $ANTLR end "parameters"



    // $ANTLR start "choose"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:49:1: choose : 'choose(' IDENT IDENT ')' ;
    public final void choose() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:50:2: ( 'choose(' IDENT IDENT ')' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:51:2: 'choose(' IDENT IDENT ')'
            {
            match(input,13,FOLLOW_13_in_choose187); 

            match(input,IDENT,FOLLOW_IDENT_in_choose189); 

            match(input,IDENT,FOLLOW_IDENT_in_choose191); 

            match(input,8,FOLLOW_8_in_choose193); 

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
    // $ANTLR end "choose"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_bot27 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_bot29 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_characterstics_in_bot36 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule_in_bot40 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_bot47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_characterstics60 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_characterstics62 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INTEGER_in_characterstics64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_rule79 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_operator_in_rule82 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_function_in_rule84 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule89 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_operator_in_ruleExpression103 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_ruleExpression105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule_in_ruleExpression107 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_ruleExpression109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_function141 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_function143 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_parameters_in_function145 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_function147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_parameters160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_parameters162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_parameters166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_parameters168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_parameters172 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_choose_in_parameters174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_choose187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_choose189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_choose191 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_choose193 = new BitSet(new long[]{0x0000000000000002L});

}