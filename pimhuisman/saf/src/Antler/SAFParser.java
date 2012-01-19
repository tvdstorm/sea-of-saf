// $ANTLR 3.4 C:\\Users\\Pim\\Desktop\\SAF.g 2012-01-19 18:02:14

package Antler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Number", "String", "Whitespace", "'('", "')'", "'='", "'['", "']'", "'always'", "'block_high'", "'block_low'", "'choose'", "'crouch'", "'even'", "'far'", "'jump'", "'kickPower'", "'kickReach'", "'kick_high'", "'kick_low'", "'much_stronger'", "'much_weaker'", "'near'", "'punchPower'", "'punchReach'", "'punch_high'", "'punch_low'", "'run_away'", "'run_towards'", "'stand'", "'stronger'", "'walk_away'", "'walk_towards'", "'weaker'", "'{'", "'}'"
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
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int Number=4;
    public static final int String=5;
    public static final int Whitespace=6;

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
    public String getGrammarFileName() { return "C:\\Users\\Pim\\Desktop\\SAF.g"; }



    // $ANTLR start "fighter"
    // C:\\Users\\Pim\\Desktop\\SAF.g:47:1: fighter : String '{' personality behaviour '}' ;
    public final void fighter() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Desktop\\SAF.g:47:10: ( String '{' personality behaviour '}' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:47:12: String '{' personality behaviour '}'
            {
            match(input,String,FOLLOW_String_in_fighter100); 

            match(input,38,FOLLOW_38_in_fighter102); 

            pushFollow(FOLLOW_personality_in_fighter108);
            personality();

            state._fsp--;


            pushFollow(FOLLOW_behaviour_in_fighter114);
            behaviour();

            state._fsp--;


            match(input,39,FOLLOW_39_in_fighter119); 

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
    // $ANTLR end "fighter"



    // $ANTLR start "characteristic"
    // C:\\Users\\Pim\\Desktop\\SAF.g:52:1: characteristic : characteristicType '=' Number ;
    public final void characteristic() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Desktop\\SAF.g:52:16: ( characteristicType '=' Number )
            // C:\\Users\\Pim\\Desktop\\SAF.g:52:18: characteristicType '=' Number
            {
            pushFollow(FOLLOW_characteristicType_in_characteristic127);
            characteristicType();

            state._fsp--;


            match(input,9,FOLLOW_9_in_characteristic129); 

            match(input,Number,FOLLOW_Number_in_characteristic131); 

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



    // $ANTLR start "personality"
    // C:\\Users\\Pim\\Desktop\\SAF.g:53:1: personality : ( characteristic )+ ;
    public final void personality() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Desktop\\SAF.g:53:13: ( ( characteristic )+ )
            // C:\\Users\\Pim\\Desktop\\SAF.g:53:15: ( characteristic )+
            {
            // C:\\Users\\Pim\\Desktop\\SAF.g:53:15: ( characteristic )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 20 && LA1_0 <= 21)||(LA1_0 >= 27 && LA1_0 <= 28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Pim\\Desktop\\SAF.g:53:15: characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_personality138);
            	    characteristic();

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
    // $ANTLR end "personality"



    // $ANTLR start "behaviour"
    // C:\\Users\\Pim\\Desktop\\SAF.g:55:1: behaviour : ( rule )+ ;
    public final void behaviour() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Desktop\\SAF.g:55:11: ( ( rule )+ )
            // C:\\Users\\Pim\\Desktop\\SAF.g:55:13: ( rule )+
            {
            // C:\\Users\\Pim\\Desktop\\SAF.g:55:13: ( rule )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||(LA2_0 >= 17 && LA2_0 <= 18)||(LA2_0 >= 24 && LA2_0 <= 26)||LA2_0==34||LA2_0==37) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Pim\\Desktop\\SAF.g:55:13: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_behaviour147);
            	    rule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "behaviour"



    // $ANTLR start "rule"
    // C:\\Users\\Pim\\Desktop\\SAF.g:56:1: rule : conditionType '[' moveAction attackAction ']' ;
    public final void rule() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Desktop\\SAF.g:56:7: ( conditionType '[' moveAction attackAction ']' )
            // C:\\Users\\Pim\\Desktop\\SAF.g:56:9: conditionType '[' moveAction attackAction ']'
            {
            pushFollow(FOLLOW_conditionType_in_rule156);
            conditionType();

            state._fsp--;


            match(input,10,FOLLOW_10_in_rule158); 

            pushFollow(FOLLOW_moveAction_in_rule160);
            moveAction();

            state._fsp--;


            pushFollow(FOLLOW_attackAction_in_rule162);
            attackAction();

            state._fsp--;


            match(input,11,FOLLOW_11_in_rule164); 

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



    // $ANTLR start "moveAction"
    // C:\\Users\\Pim\\Desktop\\SAF.g:57:1: moveAction : ( moveActionType | 'choose' '(' ( moveActionType )+ ')' );
    public final void moveAction() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Desktop\\SAF.g:57:12: ( moveActionType | 'choose' '(' ( moveActionType )+ ')' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16||LA4_0==19||(LA4_0 >= 31 && LA4_0 <= 33)||(LA4_0 >= 35 && LA4_0 <= 36)) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Pim\\Desktop\\SAF.g:57:14: moveActionType
                    {
                    pushFollow(FOLLOW_moveActionType_in_moveAction171);
                    moveActionType();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Pim\\Desktop\\SAF.g:57:31: 'choose' '(' ( moveActionType )+ ')'
                    {
                    match(input,15,FOLLOW_15_in_moveAction175); 

                    match(input,7,FOLLOW_7_in_moveAction177); 

                    // C:\\Users\\Pim\\Desktop\\SAF.g:57:44: ( moveActionType )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16||LA3_0==19||(LA3_0 >= 31 && LA3_0 <= 33)||(LA3_0 >= 35 && LA3_0 <= 36)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Pim\\Desktop\\SAF.g:57:44: moveActionType
                    	    {
                    	    pushFollow(FOLLOW_moveActionType_in_moveAction179);
                    	    moveActionType();

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


                    match(input,8,FOLLOW_8_in_moveAction182); 

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
    // $ANTLR end "moveAction"



    // $ANTLR start "attackAction"
    // C:\\Users\\Pim\\Desktop\\SAF.g:58:1: attackAction : ( attackActionType | 'choose' '(' ( attackActionType )+ ')' );
    public final void attackAction() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Desktop\\SAF.g:58:14: ( attackActionType | 'choose' '(' ( attackActionType )+ ')' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= 13 && LA6_0 <= 14)||(LA6_0 >= 22 && LA6_0 <= 23)||(LA6_0 >= 29 && LA6_0 <= 30)) ) {
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
                    // C:\\Users\\Pim\\Desktop\\SAF.g:58:16: attackActionType
                    {
                    pushFollow(FOLLOW_attackActionType_in_attackAction189);
                    attackActionType();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Pim\\Desktop\\SAF.g:58:35: 'choose' '(' ( attackActionType )+ ')'
                    {
                    match(input,15,FOLLOW_15_in_attackAction193); 

                    match(input,7,FOLLOW_7_in_attackAction195); 

                    // C:\\Users\\Pim\\Desktop\\SAF.g:58:48: ( attackActionType )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= 13 && LA5_0 <= 14)||(LA5_0 >= 22 && LA5_0 <= 23)||(LA5_0 >= 29 && LA5_0 <= 30)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Pim\\Desktop\\SAF.g:58:48: attackActionType
                    	    {
                    	    pushFollow(FOLLOW_attackActionType_in_attackAction197);
                    	    attackActionType();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    match(input,8,FOLLOW_8_in_attackAction200); 

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
    // $ANTLR end "attackAction"



    // $ANTLR start "characteristicType"
    // C:\\Users\\Pim\\Desktop\\SAF.g:60:1: characteristicType : ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' ) ;
    public final void characteristicType() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Desktop\\SAF.g:60:20: ( ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' ) )
            // C:\\Users\\Pim\\Desktop\\SAF.g:
            {
            if ( (input.LA(1) >= 20 && input.LA(1) <= 21)||(input.LA(1) >= 27 && input.LA(1) <= 28) ) {
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
    // $ANTLR end "characteristicType"



    // $ANTLR start "conditionType"
    // C:\\Users\\Pim\\Desktop\\SAF.g:61:1: conditionType : ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' ) ;
    public final void conditionType() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Desktop\\SAF.g:61:16: ( ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' ) )
            // C:\\Users\\Pim\\Desktop\\SAF.g:
            {
            if ( input.LA(1)==12||(input.LA(1) >= 17 && input.LA(1) <= 18)||(input.LA(1) >= 24 && input.LA(1) <= 26)||input.LA(1)==34||input.LA(1)==37 ) {
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
    // $ANTLR end "conditionType"



    // $ANTLR start "moveActionType"
    // C:\\Users\\Pim\\Desktop\\SAF.g:62:1: moveActionType : ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' ) ;
    public final void moveActionType() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Desktop\\SAF.g:62:17: ( ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' ) )
            // C:\\Users\\Pim\\Desktop\\SAF.g:
            {
            if ( input.LA(1)==16||input.LA(1)==19||(input.LA(1) >= 31 && input.LA(1) <= 33)||(input.LA(1) >= 35 && input.LA(1) <= 36) ) {
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
    // $ANTLR end "moveActionType"



    // $ANTLR start "attackActionType"
    // C:\\Users\\Pim\\Desktop\\SAF.g:63:1: attackActionType : ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' ) ;
    public final void attackActionType() throws RecognitionException {
        try {
            // C:\\Users\\Pim\\Desktop\\SAF.g:63:18: ( ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' ) )
            // C:\\Users\\Pim\\Desktop\\SAF.g:
            {
            if ( (input.LA(1) >= 13 && input.LA(1) <= 14)||(input.LA(1) >= 22 && input.LA(1) <= 23)||(input.LA(1) >= 29 && input.LA(1) <= 30) ) {
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
    // $ANTLR end "attackActionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_String_in_fighter100 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fighter102 = new BitSet(new long[]{0x0000000018300000L});
    public static final BitSet FOLLOW_personality_in_fighter108 = new BitSet(new long[]{0x0000002407061000L});
    public static final BitSet FOLLOW_behaviour_in_fighter114 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_fighter119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristicType_in_characteristic127 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_characteristic129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Number_in_characteristic131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_personality138 = new BitSet(new long[]{0x0000000018300002L});
    public static final BitSet FOLLOW_rule_in_behaviour147 = new BitSet(new long[]{0x0000002407061002L});
    public static final BitSet FOLLOW_conditionType_in_rule156 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_rule158 = new BitSet(new long[]{0x0000001B80098000L});
    public static final BitSet FOLLOW_moveAction_in_rule160 = new BitSet(new long[]{0x0000000060C0E000L});
    public static final BitSet FOLLOW_attackAction_in_rule162 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rule164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveActionType_in_moveAction171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_moveAction175 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_moveAction177 = new BitSet(new long[]{0x0000001B80090000L});
    public static final BitSet FOLLOW_moveActionType_in_moveAction179 = new BitSet(new long[]{0x0000001B80090100L});
    public static final BitSet FOLLOW_8_in_moveAction182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attackActionType_in_attackAction189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_attackAction193 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_attackAction195 = new BitSet(new long[]{0x0000000060C06000L});
    public static final BitSet FOLLOW_attackActionType_in_attackAction197 = new BitSet(new long[]{0x0000000060C06100L});
    public static final BitSet FOLLOW_8_in_attackAction200 = new BitSet(new long[]{0x0000000000000002L});

}