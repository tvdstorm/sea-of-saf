// $ANTLR 3.4 D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g 2012-01-30 18:02:44

package grammar;
import  grammar.Evaluators.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class graParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "NEWLINE", "WS", "'('", "')'", "'='", "'['", "']'", "'and'", "'choose'", "'or'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int COMMENT=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int NEWLINE=7;
    public static final int WS=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public graParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public graParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return graParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g"; }



    // $ANTLR start "bot"
    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:18:1: bot returns [Bot b] : i= ID '{' (c= characteristic )* (r= rule )* '}' ;
    public final Bot bot() throws RecognitionException {
        Bot b = null;


        Token i=null;
        Characteristic c =null;

        Rule r =null;



                b = new Bot();
              
        try {
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:22:7: (i= ID '{' (c= characteristic )* (r= rule )* '}' )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:22:9: i= ID '{' (c= characteristic )* (r= rule )* '}'
            {
            i=(Token)match(input,ID,FOLLOW_ID_in_bot64); 

            b.setName((i!=null?i.getText():null));

            match(input,17,FOLLOW_17_in_bot68); 

            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:22:41: (c= characteristic )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==11) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:22:42: c= characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_bot73);
            	    c=characteristic();

            	    state._fsp--;


            	    b.addC(c);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:22:75: (r= rule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:22:76: r= rule
            	    {
            	    pushFollow(FOLLOW_rule_in_bot82);
            	    r=rule();

            	    state._fsp--;


            	    b.addR(r);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,18,FOLLOW_18_in_bot88); 

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
    // $ANTLR end "bot"



    // $ANTLR start "conditions"
    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:25:1: conditions returns [Conditions value] : (c= condition )+ ;
    public final Conditions conditions() throws RecognitionException {
        Conditions value = null;


        Condition c =null;



                value = new Conditions();
              
        try {
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:29:7: ( (c= condition )+ )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:29:9: (c= condition )+
            {
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:29:10: (c= condition )+
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
            	    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:29:10: c= condition
            	    {
            	    pushFollow(FOLLOW_condition_in_conditions127);
            	    c=condition();

            	    state._fsp--;


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


            value.addCondition(c);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "conditions"



    // $ANTLR start "condition"
    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:32:1: condition returns [Condition value] : (i= ID |b= binairycondition );
    public final Condition condition() throws RecognitionException {
        Condition value = null;


        Token i=null;
        Condition b =null;


        try {
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:33:7: (i= ID |b= binairycondition )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==14||LA4_1==16) ) {
                    alt4=2;
                }
                else if ( (LA4_1==ID||LA4_1==12) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

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
                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:33:9: i= ID
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_condition158); 

                    value = new Const((i!=null?i.getText():null));

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:34:9: b= binairycondition
                    {
                    pushFollow(FOLLOW_binairycondition_in_condition173);
                    b=binairycondition();

                    state._fsp--;


                    value = (b);

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
        return value;
    }
    // $ANTLR end "condition"



    // $ANTLR start "binairycondition"
    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:37:1: binairycondition returns [Condition value] : (i= ID 'and' j= ID |k= ID 'or' l= ID );
    public final Condition binairycondition() throws RecognitionException {
        Condition value = null;


        Token i=null;
        Token j=null;
        Token k=null;
        Token l=null;

        try {
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:38:7: (i= ID 'and' j= ID |k= ID 'or' l= ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==14) ) {
                    alt5=1;
                }
                else if ( (LA5_1==16) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:38:9: i= ID 'and' j= ID
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_binairycondition202); 

                    match(input,14,FOLLOW_14_in_binairycondition204); 

                    j=(Token)match(input,ID,FOLLOW_ID_in_binairycondition208); 

                    value =  new ConAnd((i!=null?i.getText():null), (j!=null?j.getText():null));

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:39:9: k= ID 'or' l= ID
                    {
                    k=(Token)match(input,ID,FOLLOW_ID_in_binairycondition224); 

                    match(input,16,FOLLOW_16_in_binairycondition226); 

                    l=(Token)match(input,ID,FOLLOW_ID_in_binairycondition230); 

                    value =  new ConOr((k!=null?k.getText():null), (l!=null?l.getText():null));

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
        return value;
    }
    // $ANTLR end "binairycondition"



    // $ANTLR start "rule"
    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:42:1: rule returns [Rule value] : i= conditions '[' e= inputRule f= inputRule ']' ;
    public final Rule rule() throws RecognitionException {
        Rule value = null;


        Conditions i =null;

        InputRule e =null;

        InputRule f =null;


        try {
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:43:7: (i= conditions '[' e= inputRule f= inputRule ']' )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:43:9: i= conditions '[' e= inputRule f= inputRule ']'
            {
            pushFollow(FOLLOW_conditions_in_rule269);
            i=conditions();

            state._fsp--;


            match(input,12,FOLLOW_12_in_rule271); 

            pushFollow(FOLLOW_inputRule_in_rule274);
            e=inputRule();

            state._fsp--;


            pushFollow(FOLLOW_inputRule_in_rule278);
            f=inputRule();

            state._fsp--;


            match(input,13,FOLLOW_13_in_rule279); 

            value = new Rule (i, e, f);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "rule"



    // $ANTLR start "inputRule"
    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:47:1: inputRule returns [InputRule value] : (i= ID | 'choose' '(' i= ID j= ID ')' );
    public final InputRule inputRule() throws RecognitionException {
        InputRule value = null;


        Token i=null;
        Token j=null;

        try {
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:48:7: (i= ID | 'choose' '(' i= ID j= ID ')' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:48:9: i= ID
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_inputRule317); 

                    value = new InputRule ((i!=null?i.getText():null) , null);

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:49:9: 'choose' '(' i= ID j= ID ')'
                    {
                    match(input,15,FOLLOW_15_in_inputRule330); 

                    match(input,9,FOLLOW_9_in_inputRule332); 

                    i=(Token)match(input,ID,FOLLOW_ID_in_inputRule336); 

                    j=(Token)match(input,ID,FOLLOW_ID_in_inputRule340); 

                    match(input,10,FOLLOW_10_in_inputRule342); 

                    value = new InputRule((i!=null?i.getText():null), (j!=null?j.getText():null));

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
        return value;
    }
    // $ANTLR end "inputRule"



    // $ANTLR start "characteristic"
    // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:53:1: characteristic returns [Characteristic value] : i= ID '=' j= INT ;
    public final Characteristic characteristic() throws RecognitionException {
        Characteristic value = null;


        Token i=null;
        Token j=null;

        try {
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:54:7: (i= ID '=' j= INT )
            // D:\\Master\\Software_Contruction\\Antlr\\src\\SAF\\gra.g:54:9: i= ID '=' j= INT
            {
            i=(Token)match(input,ID,FOLLOW_ID_in_characteristic382); 

            match(input,11,FOLLOW_11_in_characteristic384); 

            j=(Token)match(input,INT,FOLLOW_INT_in_characteristic388); 

            value = new Characteristic ((i!=null?i.getText():null), Integer.parseInt((j!=null?j.getText():null))); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "characteristic"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_bot64 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_bot68 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_characteristic_in_bot73 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule_in_bot82 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_bot88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_conditions127 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_condition158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binairycondition_in_condition173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_binairycondition202 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_binairycondition204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_binairycondition208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_binairycondition224 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_binairycondition226 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_binairycondition230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditions_in_rule269 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rule271 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_inputRule_in_rule274 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_inputRule_in_rule278 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rule279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_inputRule317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_inputRule330 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_inputRule332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_inputRule336 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_inputRule340 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_inputRule342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_characteristic382 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_characteristic384 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_characteristic388 = new BitSet(new long[]{0x0000000000000002L});

}