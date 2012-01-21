// $ANTLR 3.4 /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g 2012-01-21 13:10:01

  package saf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class botParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "WS", "'('", "')'", "'='", "'['", "']'", "'choose'", "'{'", "'}'"
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
    public static final int IDENT=4;
    public static final int INTEGER=5;
    public static final int WS=6;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public botParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public botParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return botParser.tokenNames; }
    public String getGrammarFileName() { return "/home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g"; }



    // $ANTLR start "bot"
    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:15:1: bot : IDENT '{' ( attribute )* '}' ;
    public final void bot() throws RecognitionException {
        try {
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:15:5: ( IDENT '{' ( attribute )* '}' )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:15:7: IDENT '{' ( attribute )* '}'
            {
            match(input,IDENT,FOLLOW_IDENT_in_bot39); 

            match(input,13,FOLLOW_13_in_bot41); 

            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:15:16: ( attribute )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:15:16: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_bot42);
            	    attribute();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,14,FOLLOW_14_in_bot44); 

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



    // $ANTLR start "attribute"
    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:17:1: attribute : ( characteristic | behaviour );
    public final void attribute() throws RecognitionException {
        try {
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:17:14: ( characteristic | behaviour )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==9) ) {
                    alt2=1;
                }
                else if ( (LA2_1==10) ) {
                    alt2=2;
                }
                else {
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
                    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:17:16: characteristic
                    {
                    pushFollow(FOLLOW_characteristic_in_attribute56);
                    characteristic();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:17:33: behaviour
                    {
                    pushFollow(FOLLOW_behaviour_in_attribute60);
                    behaviour();

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
    // $ANTLR end "attribute"



    // $ANTLR start "characteristic"
    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:19:1: characteristic : IDENT '=' INTEGER ;
    public final void characteristic() throws RecognitionException {
        try {
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:19:16: ( IDENT '=' INTEGER )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:19:18: IDENT '=' INTEGER
            {
            match(input,IDENT,FOLLOW_IDENT_in_characteristic69); 

            match(input,9,FOLLOW_9_in_characteristic71); 

            match(input,INTEGER,FOLLOW_INTEGER_in_characteristic73); 

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
    // $ANTLR end "characteristic"



    // $ANTLR start "behaviour"
    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:21:1: behaviour : IDENT '[' behaviour_attribute behaviour_attribute ']' ;
    public final void behaviour() throws RecognitionException {
        try {
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:21:13: ( IDENT '[' behaviour_attribute behaviour_attribute ']' )
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:21:15: IDENT '[' behaviour_attribute behaviour_attribute ']'
            {
            match(input,IDENT,FOLLOW_IDENT_in_behaviour83); 

            match(input,10,FOLLOW_10_in_behaviour85); 

            pushFollow(FOLLOW_behaviour_attribute_in_behaviour87);
            behaviour_attribute();

            state._fsp--;


            pushFollow(FOLLOW_behaviour_attribute_in_behaviour89);
            behaviour_attribute();

            state._fsp--;


            match(input,11,FOLLOW_11_in_behaviour90); 

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
    // $ANTLR end "behaviour"



    // $ANTLR start "behaviour_attribute"
    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:23:1: behaviour_attribute : ( IDENT | 'choose' '(' IDENT ( IDENT )+ ')' );
    public final void behaviour_attribute() throws RecognitionException {
        try {
            // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:24:5: ( IDENT | 'choose' '(' IDENT ( IDENT )+ ')' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENT) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:24:7: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_behaviour_attribute103); 

                    }
                    break;
                case 2 :
                    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:25:7: 'choose' '(' IDENT ( IDENT )+ ')'
                    {
                    match(input,12,FOLLOW_12_in_behaviour_attribute111); 

                    match(input,7,FOLLOW_7_in_behaviour_attribute113); 

                    match(input,IDENT,FOLLOW_IDENT_in_behaviour_attribute115); 

                    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:25:26: ( IDENT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==IDENT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/maurits/Eclipse ANTLR workspace/software-construction/src/saf/bot.g:25:26: IDENT
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_behaviour_attribute117); 

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


                    match(input,8,FOLLOW_8_in_behaviour_attribute120); 

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
    // $ANTLR end "behaviour_attribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_bot39 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_bot41 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_attribute_in_bot42 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_bot44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_attribute56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_attribute60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_characteristic69 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_characteristic71 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INTEGER_in_characteristic73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behaviour83 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_behaviour85 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_behaviour_attribute_in_behaviour87 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_behaviour_attribute_in_behaviour89 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_behaviour90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behaviour_attribute103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_behaviour_attribute111 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_behaviour_attribute113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_behaviour_attribute115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_behaviour_attribute117 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_8_in_behaviour_attribute120 = new BitSet(new long[]{0x0000000000000002L});

}