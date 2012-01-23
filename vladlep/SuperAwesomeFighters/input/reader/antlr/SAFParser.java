// $ANTLR 3.4 D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g 2012-01-23 10:39:46

package reader.antlr;
  import fighter.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTACKS", "COMMENTS", "CONDITIONS", "IDENT", "MOVES", "STRENGTHS", "TWODIGITS", "WHITESPACE", "')'", "'='", "'['", "']'", "'always'", "'and'", "'choose('", "'or'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int ATTACKS=4;
    public static final int COMMENTS=5;
    public static final int CONDITIONS=6;
    public static final int IDENT=7;
    public static final int MOVES=8;
    public static final int STRENGTHS=9;
    public static final int TWODIGITS=10;
    public static final int WHITESPACE=11;

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
    public String getGrammarFileName() { return "D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g"; }



    // $ANTLR start "fighter"
    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:16:1: fighter returns [Bot bot] : IDENT '{' personality behaviour '}' ;
    public final Bot fighter() throws RecognitionException {
        Bot bot = null;


        Token IDENT1=null;
        Personality personality2 =null;

        Behaviour behaviour3 =null;


        try {
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:17:3: ( IDENT '{' personality behaviour '}' )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:18:3: IDENT '{' personality behaviour '}'
            {
            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter47); 

            match(input,20,FOLLOW_20_in_fighter49); 

            pushFollow(FOLLOW_personality_in_fighter51);
            personality2=personality();

            state._fsp--;


            pushFollow(FOLLOW_behaviour_in_fighter53);
            behaviour3=behaviour();

            state._fsp--;



                                               bot = new Bot(IDENT1.getText(), personality2, behaviour3);                  
                                              

            match(input,21,FOLLOW_21_in_fighter94); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return bot;
    }
    // $ANTLR end "fighter"



    // $ANTLR start "personality"
    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:25:1: personality returns [Personality personality] : ( STRENGTHS '=' TWODIGITS )* ;
    public final Personality personality() throws RecognitionException {
        Personality personality = null;


        Token STRENGTHS4=null;
        Token TWODIGITS5=null;

        try {
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:26:3: ( ( STRENGTHS '=' TWODIGITS )* )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:28:4: ( STRENGTHS '=' TWODIGITS )*
            {

                personality = new Personality();
                Caracteristic caracteristic = new Caracteristic();
                personality.addCaracteristic(caracteristic);
               

            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:33:3: ( STRENGTHS '=' TWODIGITS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRENGTHS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:33:4: STRENGTHS '=' TWODIGITS
            	    {
            	    STRENGTHS4=(Token)match(input,STRENGTHS,FOLLOW_STRENGTHS_in_personality122); 

            	    match(input,13,FOLLOW_13_in_personality124); 

            	    TWODIGITS5=(Token)match(input,TWODIGITS,FOLLOW_TWODIGITS_in_personality126); 


            	                                if (STRENGTHS4.getText().equals("punchReach")) {
            	                                                  	caracteristic.setPunchReach(Integer.parseInt((TWODIGITS5!=null?TWODIGITS5.getText():null)));
            	                                }
            	                                if ((STRENGTHS4!=null?STRENGTHS4.getText():null).equals("punchPower")) {
            	                                	caracteristic.setPunchPower(Integer.parseInt((TWODIGITS5!=null?TWODIGITS5.getText():null)));
            	                                }
            	                                if ((STRENGTHS4!=null?STRENGTHS4.getText():null).equals("kickReach")) {
            	                                	caracteristic.setKickReach(Integer.parseInt((TWODIGITS5!=null?TWODIGITS5.getText():null)));
            	                                }
            	                                if ((STRENGTHS4!=null?STRENGTHS4.getText():null).equals( "kickPower")) {
            	                                	caracteristic.setKickPower(Integer.parseInt((TWODIGITS5!=null?TWODIGITS5.getText():null)));
            	                                }
            	                                ;
            	                               

            	    }
            	    break;

            	default :
            	    break loop1;
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
        return personality;
    }
    // $ANTLR end "personality"



    // $ANTLR start "behaviour"
    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:51:1: behaviour returns [Behaviour behaviour] : ( ( ( CONDITIONS | ( CONDITIONS 'and' CONDITIONS ) | ( CONDITIONS 'or' CONDITIONS ) )* ) '[' ( MOVES | ( 'choose(' MOVES MOVES ')' ) ) ( ATTACKS | 'choose(' ATTACKS ATTACKS ')' ) ']' )* 'always' '[' MOVES ATTACKS ']' ;
    public final Behaviour behaviour() throws RecognitionException {
        Behaviour behaviour = null;


        try {
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:52:3: ( ( ( ( CONDITIONS | ( CONDITIONS 'and' CONDITIONS ) | ( CONDITIONS 'or' CONDITIONS ) )* ) '[' ( MOVES | ( 'choose(' MOVES MOVES ')' ) ) ( ATTACKS | 'choose(' ATTACKS ATTACKS ')' ) ']' )* 'always' '[' MOVES ATTACKS ']' )
            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:53:3: ( ( ( CONDITIONS | ( CONDITIONS 'and' CONDITIONS ) | ( CONDITIONS 'or' CONDITIONS ) )* ) '[' ( MOVES | ( 'choose(' MOVES MOVES ')' ) ) ( ATTACKS | 'choose(' ATTACKS ATTACKS ')' ) ']' )* 'always' '[' MOVES ATTACKS ']'
            {

              behaviour = new Behaviour();
              

            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:56:3: ( ( ( CONDITIONS | ( CONDITIONS 'and' CONDITIONS ) | ( CONDITIONS 'or' CONDITIONS ) )* ) '[' ( MOVES | ( 'choose(' MOVES MOVES ')' ) ) ( ATTACKS | 'choose(' ATTACKS ATTACKS ')' ) ']' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CONDITIONS||LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:57:5: ( ( CONDITIONS | ( CONDITIONS 'and' CONDITIONS ) | ( CONDITIONS 'or' CONDITIONS ) )* ) '[' ( MOVES | ( 'choose(' MOVES MOVES ')' ) ) ( ATTACKS | 'choose(' ATTACKS ATTACKS ')' ) ']'
            	    {
            	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:57:5: ( ( CONDITIONS | ( CONDITIONS 'and' CONDITIONS ) | ( CONDITIONS 'or' CONDITIONS ) )* )
            	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:58:7: ( CONDITIONS | ( CONDITIONS 'and' CONDITIONS ) | ( CONDITIONS 'or' CONDITIONS ) )*
            	    {
            	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:58:7: ( CONDITIONS | ( CONDITIONS 'and' CONDITIONS ) | ( CONDITIONS 'or' CONDITIONS ) )*
            	    loop2:
            	    do {
            	        int alt2=4;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==CONDITIONS) ) {
            	            switch ( input.LA(2) ) {
            	            case 17:
            	                {
            	                alt2=2;
            	                }
            	                break;
            	            case 19:
            	                {
            	                alt2=3;
            	                }
            	                break;
            	            case CONDITIONS:
            	            case 14:
            	                {
            	                alt2=1;
            	                }
            	                break;

            	            }

            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:58:8: CONDITIONS
            	    	    {
            	    	    match(input,CONDITIONS,FOLLOW_CONDITIONS_in_behaviour196); 

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:59:9: ( CONDITIONS 'and' CONDITIONS )
            	    	    {
            	    	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:59:9: ( CONDITIONS 'and' CONDITIONS )
            	    	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:59:10: CONDITIONS 'and' CONDITIONS
            	    	    {
            	    	    match(input,CONDITIONS,FOLLOW_CONDITIONS_in_behaviour207); 

            	    	    match(input,17,FOLLOW_17_in_behaviour209); 

            	    	    match(input,CONDITIONS,FOLLOW_CONDITIONS_in_behaviour211); 

            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:60:9: ( CONDITIONS 'or' CONDITIONS )
            	    	    {
            	    	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:60:9: ( CONDITIONS 'or' CONDITIONS )
            	    	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:60:10: CONDITIONS 'or' CONDITIONS
            	    	    {
            	    	    match(input,CONDITIONS,FOLLOW_CONDITIONS_in_behaviour223); 

            	    	    match(input,19,FOLLOW_19_in_behaviour225); 

            	    	    match(input,CONDITIONS,FOLLOW_CONDITIONS_in_behaviour227); 

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    match(input,14,FOLLOW_14_in_behaviour242); 

            	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:63:5: ( MOVES | ( 'choose(' MOVES MOVES ')' ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==MOVES) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==18) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:64:7: MOVES
            	            {
            	            match(input,MOVES,FOLLOW_MOVES_in_behaviour256); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:65:9: ( 'choose(' MOVES MOVES ')' )
            	            {
            	            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:65:9: ( 'choose(' MOVES MOVES ')' )
            	            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:65:10: 'choose(' MOVES MOVES ')'
            	            {
            	            match(input,18,FOLLOW_18_in_behaviour267); 

            	            match(input,MOVES,FOLLOW_MOVES_in_behaviour269); 

            	            match(input,MOVES,FOLLOW_MOVES_in_behaviour271); 

            	            match(input,12,FOLLOW_12_in_behaviour273); 

            	            }


            	            }
            	            break;

            	    }


            	    // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:67:5: ( ATTACKS | 'choose(' ATTACKS ATTACKS ')' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==ATTACKS) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==18) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:68:7: ATTACKS
            	            {
            	            match(input,ATTACKS,FOLLOW_ATTACKS_in_behaviour294); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\vlad\\serios\\master\\Software Construction\\java_code\\SuperAwesomeFighters\\src\\grammar\\SAF.g:69:9: 'choose(' ATTACKS ATTACKS ')'
            	            {
            	            match(input,18,FOLLOW_18_in_behaviour304); 

            	            match(input,ATTACKS,FOLLOW_ATTACKS_in_behaviour306); 

            	            match(input,ATTACKS,FOLLOW_ATTACKS_in_behaviour308); 

            	            match(input,12,FOLLOW_12_in_behaviour310); 

            	            }
            	            break;

            	    }


            	    match(input,15,FOLLOW_15_in_behaviour322); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_behaviour331); 

            match(input,14,FOLLOW_14_in_behaviour333); 

            match(input,MOVES,FOLLOW_MOVES_in_behaviour335); 

            match(input,ATTACKS,FOLLOW_ATTACKS_in_behaviour337); 

            match(input,15,FOLLOW_15_in_behaviour339); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return behaviour;
    }
    // $ANTLR end "behaviour"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighter47 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_fighter49 = new BitSet(new long[]{0x0000000000014240L});
    public static final BitSet FOLLOW_personality_in_fighter51 = new BitSet(new long[]{0x0000000000014040L});
    public static final BitSet FOLLOW_behaviour_in_fighter53 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_fighter94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRENGTHS_in_personality122 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_personality124 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TWODIGITS_in_personality126 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_CONDITIONS_in_behaviour196 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_CONDITIONS_in_behaviour207 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_behaviour209 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CONDITIONS_in_behaviour211 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_CONDITIONS_in_behaviour223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_behaviour225 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CONDITIONS_in_behaviour227 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_14_in_behaviour242 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_MOVES_in_behaviour256 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_behaviour267 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_MOVES_in_behaviour269 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_MOVES_in_behaviour271 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviour273 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ATTACKS_in_behaviour294 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18_in_behaviour304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ATTACKS_in_behaviour306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ATTACKS_in_behaviour308 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behaviour310 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_behaviour322 = new BitSet(new long[]{0x0000000000014040L});
    public static final BitSet FOLLOW_16_in_behaviour331 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_behaviour333 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_MOVES_in_behaviour335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ATTACKS_in_behaviour337 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_behaviour339 = new BitSet(new long[]{0x0000000000000002L});

}