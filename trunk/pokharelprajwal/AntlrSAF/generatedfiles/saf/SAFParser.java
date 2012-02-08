// $ANTLR 3.4 D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g 2012-02-08 00:45:36

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
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:11:1: bot : IDENT '{' ( characterstics | rules )* '}' ;
    public final void bot() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:12:2: ( IDENT '{' ( characterstics | rules )* '}' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:12:4: IDENT '{' ( characterstics | rules )* '}'
            {
            match(input,IDENT,FOLLOW_IDENT_in_bot27); 

            match(input,15,FOLLOW_15_in_bot29); 

            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:13:4: ( characterstics | rules )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==9) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==IDENT||LA1_2==7||LA1_2==10||(LA1_2 >= 12 && LA1_2 <= 14)||LA1_2==16) ) {
                        alt1=2;
                    }


                }
                else if ( (LA1_0==7||LA1_0==13) ) {
                    alt1=2;
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
            	    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:13:22: rules
            	    {
            	    pushFollow(FOLLOW_rules_in_bot40);
            	    rules();

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



    // $ANTLR start "rules"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:22:1: rules : rule ( operator rule )* ;
    public final void rules() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:23:2: ( rule ( operator rule )* )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:24:2: rule ( operator rule )*
            {
            pushFollow(FOLLOW_rule_in_rules79);
            rule();

            state._fsp--;


            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:24:7: ( operator rule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:24:8: operator rule
            	    {
            	    pushFollow(FOLLOW_operator_in_rules82);
            	    operator();

            	    state._fsp--;


            	    pushFollow(FOLLOW_rule_in_rules84);
            	    rule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "rules"



    // $ANTLR start "rule"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:27:1: rule : ( action | '(' ( rules )* ')' );
    public final void rule() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:28:2: ( action | '(' ( rules )* ')' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENT||LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==7) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:29:2: action
                    {
                    pushFollow(FOLLOW_action_in_rule98);
                    action();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:30:3: '(' ( rules )* ')'
                    {
                    match(input,7,FOLLOW_7_in_rule102); 

                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:30:7: ( rules )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==IDENT||LA3_0==7||LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:30:7: rules
                    	    {
                    	    pushFollow(FOLLOW_rules_in_rule104);
                    	    rules();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    match(input,8,FOLLOW_8_in_rule107); 

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
    // $ANTLR end "rule"



    // $ANTLR start "action"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:33:1: action : ( IDENT | function | choose );
    public final void action() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:34:2: ( IDENT | function | choose )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==10) ) {
                    alt5=2;
                }
                else if ( (LA5_1==IDENT||(LA5_1 >= 7 && LA5_1 <= 8)||(LA5_1 >= 12 && LA5_1 <= 14)||LA5_1==16) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA5_0==13) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:35:2: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_action119); 

                    }
                    break;
                case 2 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:36:3: function
                    {
                    pushFollow(FOLLOW_function_in_action124);
                    function();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:37:3: choose
                    {
                    pushFollow(FOLLOW_choose_in_action128);
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
    // $ANTLR end "action"



    // $ANTLR start "operator"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:40:1: operator : ( 'and' | 'or' );
    public final void operator() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:41:2: ( 'and' | 'or' )
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
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:47:1: function : IDENT '[' parameters ']' ;
    public final void function() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:48:2: ( IDENT '[' parameters ']' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:49:2: IDENT '[' parameters ']'
            {
            match(input,IDENT,FOLLOW_IDENT_in_function162); 

            match(input,10,FOLLOW_10_in_function164); 

            pushFollow(FOLLOW_parameters_in_function166);
            parameters();

            state._fsp--;


            match(input,11,FOLLOW_11_in_function168); 

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



    // $ANTLR start "choose"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:52:1: choose : 'choose(' IDENT IDENT ')' ;
    public final void choose() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:53:2: ( 'choose(' IDENT IDENT ')' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:54:2: 'choose(' IDENT IDENT ')'
            {
            match(input,13,FOLLOW_13_in_choose180); 

            match(input,IDENT,FOLLOW_IDENT_in_choose182); 

            match(input,IDENT,FOLLOW_IDENT_in_choose184); 

            match(input,8,FOLLOW_8_in_choose186); 

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



    // $ANTLR start "parameters"
    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:57:1: parameters : ( IDENT IDENT | choose IDENT | IDENT choose | choose choose );
    public final void parameters() throws RecognitionException {
        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:58:2: ( IDENT IDENT | choose IDENT | IDENT choose | choose choose )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==IDENT) ) {
                    alt6=1;
                }
                else if ( (LA6_1==13) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA6_0==13) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==IDENT) ) {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==IDENT) ) {
                        int LA6_6 = input.LA(4);

                        if ( (LA6_6==8) ) {
                            int LA6_7 = input.LA(5);

                            if ( (LA6_7==IDENT) ) {
                                alt6=2;
                            }
                            else if ( (LA6_7==13) ) {
                                alt6=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 7, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:59:2: IDENT IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_parameters200); 

                    match(input,IDENT,FOLLOW_IDENT_in_parameters202); 

                    }
                    break;
                case 2 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:60:3: choose IDENT
                    {
                    pushFollow(FOLLOW_choose_in_parameters206);
                    choose();

                    state._fsp--;


                    match(input,IDENT,FOLLOW_IDENT_in_parameters208); 

                    }
                    break;
                case 3 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:61:3: IDENT choose
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_parameters212); 

                    pushFollow(FOLLOW_choose_in_parameters214);
                    choose();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\SAF.g:62:3: choose choose
                    {
                    pushFollow(FOLLOW_choose_in_parameters218);
                    choose();

                    state._fsp--;


                    pushFollow(FOLLOW_choose_in_parameters220);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_bot27 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_bot29 = new BitSet(new long[]{0x0000000000012090L});
    public static final BitSet FOLLOW_characterstics_in_bot36 = new BitSet(new long[]{0x0000000000012090L});
    public static final BitSet FOLLOW_rules_in_bot40 = new BitSet(new long[]{0x0000000000012090L});
    public static final BitSet FOLLOW_16_in_bot47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_characterstics60 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_characterstics62 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INTEGER_in_characterstics64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_rules79 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_operator_in_rules82 = new BitSet(new long[]{0x0000000000002090L});
    public static final BitSet FOLLOW_rule_in_rules84 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_action_in_rule98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_rule102 = new BitSet(new long[]{0x0000000000002190L});
    public static final BitSet FOLLOW_rules_in_rule104 = new BitSet(new long[]{0x0000000000002190L});
    public static final BitSet FOLLOW_8_in_rule107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_action124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_action128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_function162 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_function164 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_parameters_in_function166 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_function168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_choose180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_choose182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_choose184 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_choose186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_parameters200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_parameters202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_parameters206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_parameters208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_parameters212 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_choose_in_parameters214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_parameters218 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_choose_in_parameters220 = new BitSet(new long[]{0x0000000000000002L});

}