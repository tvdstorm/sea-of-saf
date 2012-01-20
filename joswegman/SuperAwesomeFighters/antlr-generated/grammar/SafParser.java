// $ANTLR 3.4 /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g 2012-01-20 21:59:03

  package grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SafParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "WS", "'('", "')'", "'='", "'['", "']'", "'choose'", "'{'", "'}'"
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
    public static final int COMMENT=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int WS=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SafParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SafParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SafParser.tokenNames; }
    public String getGrammarFileName() { return "/home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g"; }



    // $ANTLR start "bot"
    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:17:1: bot returns [Bot value] : ID '{' (c= characteristic )* (r= rule )* '}' ;
    public final Bot bot() throws RecognitionException {
        Bot value = null;


        Charasteristic c =null;

        Rule r =null;


        try {
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:18:7: ( ID '{' (c= characteristic )* (r= rule )* '}' )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:18:9: ID '{' (c= characteristic )* (r= rule )* '}'
            {
            match(input,ID,FOLLOW_ID_in_bot51); 

            match(input,14,FOLLOW_14_in_bot53); 

            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:18:17: (c= characteristic )*
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
            	    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:18:17: c= characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_bot57);
            	    c=characteristic();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:18:37: (r= rule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:18:37: r= rule
            	    {
            	    pushFollow(FOLLOW_rule_in_bot63);
            	    r=rule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,15,FOLLOW_15_in_bot67); 

            value = new Bot(c, r);

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
    // $ANTLR end "bot"



    // $ANTLR start "attrib"
    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:22:1: attrib : ( characteristic | rule );
    public final void attrib() throws RecognitionException {
        try {
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:23:7: ( characteristic | rule )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==10) ) {
                    alt3=1;
                }
                else if ( (LA3_1==11) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:23:9: characteristic
                    {
                    pushFollow(FOLLOW_characteristic_in_attrib100);
                    characteristic();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:24:9: rule
                    {
                    pushFollow(FOLLOW_rule_in_attrib110);
                    rule();

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
    // $ANTLR end "attrib"



    // $ANTLR start "rule"
    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:27:1: rule returns [Rule value] : i= ID '[' e= inputRule f= inputRule ']' ;
    public final Rule rule() throws RecognitionException {
        Rule value = null;


        Token i=null;
        InputRule e =null;

        InputRule f =null;


        try {
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:28:7: (i= ID '[' e= inputRule f= inputRule ']' )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:28:9: i= ID '[' e= inputRule f= inputRule ']'
            {
            i=(Token)match(input,ID,FOLLOW_ID_in_rule139); 

            match(input,11,FOLLOW_11_in_rule140); 

            pushFollow(FOLLOW_inputRule_in_rule143);
            e=inputRule();

            state._fsp--;


            pushFollow(FOLLOW_inputRule_in_rule147);
            f=inputRule();

            state._fsp--;


            match(input,12,FOLLOW_12_in_rule148); 

            value = new Rule ( e , f);

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
    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:32:1: inputRule returns [InputRule value] : (e= ID | 'choose' '(' i= ID j= ID ')' );
    public final InputRule inputRule() throws RecognitionException {
        InputRule value = null;


        Token e=null;
        Token i=null;
        Token j=null;

        try {
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:33:7: (e= ID | 'choose' '(' i= ID j= ID ')' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
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
                    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:33:9: e= ID
                    {
                    e=(Token)match(input,ID,FOLLOW_ID_in_inputRule187); 

                    value = new InputRule((e!=null?e.getText():null), "");

                    }
                    break;
                case 2 :
                    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:34:8: 'choose' '(' i= ID j= ID ')'
                    {
                    match(input,13,FOLLOW_13_in_inputRule198); 

                    match(input,8,FOLLOW_8_in_inputRule200); 

                    i=(Token)match(input,ID,FOLLOW_ID_in_inputRule204); 

                    j=(Token)match(input,ID,FOLLOW_ID_in_inputRule208); 

                    match(input,9,FOLLOW_9_in_inputRule210); 

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
    // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:37:1: characteristic returns [Charasteristic value] : e= ID '=' i= INT ;
    public final Charasteristic characteristic() throws RecognitionException {
        Charasteristic value = null;


        Token e=null;
        Token i=null;

        try {
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:38:7: (e= ID '=' i= INT )
            // /home/jos/workspace/SuperAwesomeFighters/src/grammar/Saf.g:38:9: e= ID '=' i= INT
            {
            e=(Token)match(input,ID,FOLLOW_ID_in_characteristic240); 

            match(input,10,FOLLOW_10_in_characteristic242); 

            i=(Token)match(input,INT,FOLLOW_INT_in_characteristic246); 

            value = new Charasteristic( (e!=null?e.getText():null), Integer.parseInt((i!=null?i.getText():null)));

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


 

    public static final BitSet FOLLOW_ID_in_bot51 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_bot53 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_characteristic_in_bot57 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule_in_bot63 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_bot67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_attrib100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_attrib110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_rule139 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rule140 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_inputRule_in_rule143 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_inputRule_in_rule147 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rule148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_inputRule187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_inputRule198 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_inputRule200 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_inputRule204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_inputRule208 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_inputRule210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_characteristic240 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_characteristic242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_characteristic246 = new BitSet(new long[]{0x0000000000000002L});

}