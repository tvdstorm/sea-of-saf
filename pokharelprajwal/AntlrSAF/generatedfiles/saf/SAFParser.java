// $ANTLR 3.4 D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g 2012-02-19 16:51:21

  package saf;
  import saf.ast.*;
  import saf.ast.action.*;


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
    public String getGrammarFileName() { return "D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g"; }



    // $ANTLR start "bot"
    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:14:1: bot returns [Bot fighter] : IDENT '{' (c= characterstics |r= rule )* '}' ;
    public final Bot bot() throws RecognitionException {
        Bot fighter = null;


        Token IDENT1=null;
        Characterstics c =null;

        Rule r =null;


        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:15:2: ( IDENT '{' (c= characterstics |r= rule )* '}' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:16:3: IDENT '{' (c= characterstics |r= rule )* '}'
            {
             
            			Personality personality = new Personality();  
            			Behaviour behaviour = new Behaviour();
            		

            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_bot38); 

            match(input,15,FOLLOW_15_in_bot40); 

            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:21:6: (c= characterstics |r= rule )*
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
            	    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:22:7: c= characterstics
            	    {
            	    pushFollow(FOLLOW_characterstics_in_bot62);
            	    c=characterstics();

            	    state._fsp--;


            	     personality.addCharacterstics(c); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:23:9: r= rule
            	    {
            	    pushFollow(FOLLOW_rule_in_bot80);
            	    r=rule();

            	    state._fsp--;


            	     behaviour.addRule(r); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_bot98); 

             
            			fighter = new Bot((IDENT1!=null?IDENT1.getText():null), personality , behaviour); 
            		

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
    // $ANTLR end "bot"



    // $ANTLR start "characterstics"
    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:32:1: characterstics returns [Characterstics characterstics] : IDENT '=' INTEGER ;
    public final Characterstics characterstics() throws RecognitionException {
        Characterstics characterstics = null;


        Token IDENT2=null;
        Token INTEGER3=null;

        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:33:2: ( IDENT '=' INTEGER )
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:34:3: IDENT '=' INTEGER
            {
            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_characterstics121); 

            match(input,9,FOLLOW_9_in_characterstics123); 

            INTEGER3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_characterstics125); 

             characterstics = new Characterstics((IDENT2!=null?IDENT2.getText():null), (INTEGER3!=null?INTEGER3.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return characterstics;
    }
    // $ANTLR end "characterstics"



    // $ANTLR start "rule"
    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:45:1: rule returns [Rule rule] : (a= action | '(' (r1= rule )* ')' ) (o= operator r2= rule )? ;
    public final Rule rule() throws RecognitionException {
        Rule rule = null;


        Action a =null;

        Rule r1 =null;

        SAFParser.operator_return o =null;

        Rule r2 =null;


        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:46:2: ( (a= action | '(' (r1= rule )* ')' ) (o= operator r2= rule )? )
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:46:3: (a= action | '(' (r1= rule )* ')' ) (o= operator r2= rule )?
            {
             Rule r = new Rule(); 

            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:47:2: (a= action | '(' (r1= rule )* ')' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENT||LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==7) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:47:3: a= action
                    {
                    pushFollow(FOLLOW_action_in_rule164);
                    a=action();

                    state._fsp--;


                     r.AddAction(a); 

                    }
                    break;
                case 2 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:47:36: '(' (r1= rule )* ')'
                    {
                    match(input,7,FOLLOW_7_in_rule170); 

                    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:47:43: (r1= rule )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==IDENT||LA2_0==7||LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:47:43: r1= rule
                    	    {
                    	    pushFollow(FOLLOW_rule_in_rule176);
                    	    r1=rule();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                     r.AddRule(r1); 

                    match(input,8,FOLLOW_8_in_rule182); 

                    }
                    break;

            }


            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:47:76: (o= operator r2= rule )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12||LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:47:78: o= operator r2= rule
                    {
                    pushFollow(FOLLOW_operator_in_rule191);
                    o=operator();

                    state._fsp--;


                    pushFollow(FOLLOW_rule_in_rule197);
                    r2=rule();

                    state._fsp--;


                     r.AddOperator((o!=null?input.toString(o.start,o.stop):null), a, r2); 

                    }
                    break;

            }


             rule = r; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return rule;
    }
    // $ANTLR end "rule"



    // $ANTLR start "action"
    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:52:1: action returns [Action action] : ( IDENT |f= function |c= choose );
    public final Action action() throws RecognitionException {
        Action action = null;


        Token IDENT4=null;
        Function f =null;

        Choose c =null;


        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:53:2: ( IDENT |f= function |c= choose )
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
                    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:54:2: IDENT
                    {
                    IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_action223); 

                     action = new Ident((IDENT4!=null?IDENT4.getText():null)); 

                    }
                    break;
                case 2 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:55:3: f= function
                    {
                    pushFollow(FOLLOW_function_in_action233);
                    f=function();

                    state._fsp--;


                     action = f; 

                    }
                    break;
                case 3 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:56:3: c= choose
                    {
                    pushFollow(FOLLOW_choose_in_action244);
                    c=choose();

                    state._fsp--;


                    action = c ;

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
        return action;
    }
    // $ANTLR end "action"



    // $ANTLR start "function"
    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:60:1: function returns [Function function] : IDENT '[' p= parameters ']' ;
    public final Function function() throws RecognitionException {
        Function function = null;


        Token IDENT5=null;
        Parameters p =null;


        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:61:2: ( IDENT '[' p= parameters ']' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:62:2: IDENT '[' p= parameters ']'
            {
            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_function266); 

            match(input,10,FOLLOW_10_in_function268); 

            pushFollow(FOLLOW_parameters_in_function274);
            p=parameters();

            state._fsp--;


            match(input,11,FOLLOW_11_in_function276); 

             function = new Function((IDENT5!=null?IDENT5.getText():null), p); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return function;
    }
    // $ANTLR end "function"



    // $ANTLR start "choose"
    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:66:1: choose returns [Choose choose] : 'choose(' i1= IDENT i2= IDENT ')' ;
    public final Choose choose() throws RecognitionException {
        Choose choose = null;


        Token i1=null;
        Token i2=null;

        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:67:2: ( 'choose(' i1= IDENT i2= IDENT ')' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:68:2: 'choose(' i1= IDENT i2= IDENT ')'
            {
            match(input,13,FOLLOW_13_in_choose294); 

            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_choose300); 

            i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_choose306); 

            match(input,8,FOLLOW_8_in_choose308); 

            choose = new Choose((i1!=null?i1.getText():null), (i2!=null?i2.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return choose;
    }
    // $ANTLR end "choose"



    // $ANTLR start "parameters"
    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:72:1: parameters returns [Parameters parameters] : (i1= IDENT i2= IDENT |c1= choose i3= IDENT |i4= IDENT c2= choose |c3= choose c4= choose );
    public final Parameters parameters() throws RecognitionException {
        Parameters parameters = null;


        Token i1=null;
        Token i2=null;
        Token i3=null;
        Token i4=null;
        Choose c1 =null;

        Choose c2 =null;

        Choose c3 =null;

        Choose c4 =null;


        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:73:2: (i1= IDENT i2= IDENT |c1= choose i3= IDENT |i4= IDENT c2= choose |c3= choose c4= choose )
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
                    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:74:2: i1= IDENT i2= IDENT
                    {
                    i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameters332); 

                    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameters338); 

                     parameters = new Parameters((i1!=null?i1.getText():null), (i2!=null?i2.getText():null)); 

                    }
                    break;
                case 2 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:75:3: c1= choose i3= IDENT
                    {
                    pushFollow(FOLLOW_choose_in_parameters348);
                    c1=choose();

                    state._fsp--;


                    i3=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameters354); 

                     parameters = new Parameters(c1, (i3!=null?i3.getText():null)); 

                    }
                    break;
                case 3 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:76:3: i4= IDENT c2= choose
                    {
                    i4=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameters364); 

                    pushFollow(FOLLOW_choose_in_parameters370);
                    c2=choose();

                    state._fsp--;


                     parameters = new Parameters((i4!=null?i4.getText():null), c2); 

                    }
                    break;
                case 4 :
                    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:77:3: c3= choose c4= choose
                    {
                    pushFollow(FOLLOW_choose_in_parameters380);
                    c3=choose();

                    state._fsp--;


                    pushFollow(FOLLOW_choose_in_parameters386);
                    c4=choose();

                    state._fsp--;


                     parameters = new Parameters(c3, c4); 

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
        return parameters;
    }
    // $ANTLR end "parameters"


    public static class operator_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "operator"
    // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:81:1: operator : ( 'and' | 'or' );
    public final SAFParser.operator_return operator() throws RecognitionException {
        SAFParser.operator_return retval = new SAFParser.operator_return();
        retval.start = input.LT(1);


        try {
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:82:2: ( 'and' | 'or' )
            // D:\\SAF\\AntlrSAF\\src\\saf\\grammar\\SAF.g:
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

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operator"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_bot38 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_bot40 = new BitSet(new long[]{0x0000000000012090L});
    public static final BitSet FOLLOW_characterstics_in_bot62 = new BitSet(new long[]{0x0000000000012090L});
    public static final BitSet FOLLOW_rule_in_bot80 = new BitSet(new long[]{0x0000000000012090L});
    public static final BitSet FOLLOW_16_in_bot98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_characterstics121 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_characterstics123 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INTEGER_in_characterstics125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_rule164 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_7_in_rule170 = new BitSet(new long[]{0x0000000000002190L});
    public static final BitSet FOLLOW_rule_in_rule176 = new BitSet(new long[]{0x0000000000002190L});
    public static final BitSet FOLLOW_8_in_rule182 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_operator_in_rule191 = new BitSet(new long[]{0x0000000000002090L});
    public static final BitSet FOLLOW_rule_in_rule197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_action233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_action244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_function266 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_function268 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_parameters_in_function274 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_function276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_choose294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_choose300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_choose306 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_choose308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_parameters332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_parameters338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_parameters348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_parameters354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_parameters364 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_choose_in_parameters370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_parameters380 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_choose_in_parameters386 = new BitSet(new long[]{0x0000000000000002L});

}