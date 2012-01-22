// $ANTLR 3.4 C:\\Antlr\\SAF\\SAF.g 2012-01-22 01:25:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "CONDITION", "CURLYCLOSE", "CURLYOPEN", "INT", "IS", "MOVEMENT", "NAME", "NEWLINE", "PARENTHESESCLOSE", "PARENTHESESOPEN", "PROPERTY", "SQUARECLOSE", "SQUAREOPEN", "WS", "'and'", "'choose'", "'or'"
    };

    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int ACTION=4;
    public static final int CONDITION=5;
    public static final int CURLYCLOSE=6;
    public static final int CURLYOPEN=7;
    public static final int INT=8;
    public static final int IS=9;
    public static final int MOVEMENT=10;
    public static final int NAME=11;
    public static final int NEWLINE=12;
    public static final int PARENTHESESCLOSE=13;
    public static final int PARENTHESESOPEN=14;
    public static final int PROPERTY=15;
    public static final int SQUARECLOSE=16;
    public static final int SQUAREOPEN=17;
    public static final int WS=18;

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
    public String getGrammarFileName() { return "C:\\Antlr\\SAF\\SAF.g"; }



    // $ANTLR start "fighter"
    // C:\\Antlr\\SAF\\SAF.g:21:1: fighter : NAME NEWLINE CURLYOPEN NEWLINE ( codeline )+ CURLYCLOSE ;
    public final void fighter() throws RecognitionException {
        try {
            // C:\\Antlr\\SAF\\SAF.g:22:3: ( NAME NEWLINE CURLYOPEN NEWLINE ( codeline )+ CURLYCLOSE )
            // C:\\Antlr\\SAF\\SAF.g:22:3: NAME NEWLINE CURLYOPEN NEWLINE ( codeline )+ CURLYCLOSE
            {
            match(input,NAME,FOLLOW_NAME_in_fighter300); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_fighter302); 

            match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_fighter304); 

            match(input,NEWLINE,FOLLOW_NEWLINE_in_fighter306); 

            // C:\\Antlr\\SAF\\SAF.g:22:34: ( codeline )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CONDITION||LA1_0==NEWLINE||LA1_0==PROPERTY||LA1_0==WS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Antlr\\SAF\\SAF.g:22:34: codeline
            	    {
            	    pushFollow(FOLLOW_codeline_in_fighter308);
            	    codeline();

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


            match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_fighter311); 

            System.out.println("fighter");

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



    // $ANTLR start "codeline"
    // C:\\Antlr\\SAF\\SAF.g:24:1: codeline : ( ( WS )* PROPERTY IS INT NEWLINE | ( WS )* condition SQUAREOPEN choosemovement chooseaction SQUARECLOSE NEWLINE | ( WS )* NEWLINE );
    public final void codeline() throws RecognitionException {
        try {
            // C:\\Antlr\\SAF\\SAF.g:25:6: ( ( WS )* PROPERTY IS INT NEWLINE | ( WS )* condition SQUAREOPEN choosemovement chooseaction SQUARECLOSE NEWLINE | ( WS )* NEWLINE )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:25:6: ( WS )* PROPERTY IS INT NEWLINE
                    {
                    // C:\\Antlr\\SAF\\SAF.g:25:6: ( WS )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==WS) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Antlr\\SAF\\SAF.g:25:6: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_codeline324); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    match(input,PROPERTY,FOLLOW_PROPERTY_in_codeline327); 

                    match(input,IS,FOLLOW_IS_in_codeline329); 

                    match(input,INT,FOLLOW_INT_in_codeline331); 

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_codeline333); 

                    System.out.println("codeline property");

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:26:4: ( WS )* condition SQUAREOPEN choosemovement chooseaction SQUARECLOSE NEWLINE
                    {
                    // C:\\Antlr\\SAF\\SAF.g:26:4: ( WS )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==WS) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Antlr\\SAF\\SAF.g:26:4: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_codeline340); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    pushFollow(FOLLOW_condition_in_codeline343);
                    condition();

                    state._fsp--;


                    match(input,SQUAREOPEN,FOLLOW_SQUAREOPEN_in_codeline345); 

                    pushFollow(FOLLOW_choosemovement_in_codeline347);
                    choosemovement();

                    state._fsp--;


                    pushFollow(FOLLOW_chooseaction_in_codeline349);
                    chooseaction();

                    state._fsp--;


                    match(input,SQUARECLOSE,FOLLOW_SQUARECLOSE_in_codeline351); 

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_codeline353); 

                    System.out.println("codeline condition");

                    }
                    break;
                case 3 :
                    // C:\\Antlr\\SAF\\SAF.g:27:4: ( WS )* NEWLINE
                    {
                    // C:\\Antlr\\SAF\\SAF.g:27:4: ( WS )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==WS) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Antlr\\SAF\\SAF.g:27:4: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_codeline359); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_codeline362); 

                    System.out.println("codeline newline");

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
    // $ANTLR end "codeline"



    // $ANTLR start "condition"
    // C:\\Antlr\\SAF\\SAF.g:30:1: condition : ( CONDITION | CONDITION ( WS )+ 'and' ( WS )+ CONDITION | CONDITION ( WS )+ 'or' ( WS )+ CONDITION ) ;
    public final void condition() throws RecognitionException {
        try {
            // C:\\Antlr\\SAF\\SAF.g:31:3: ( ( CONDITION | CONDITION ( WS )+ 'and' ( WS )+ CONDITION | CONDITION ( WS )+ 'or' ( WS )+ CONDITION ) )
            // C:\\Antlr\\SAF\\SAF.g:31:3: ( CONDITION | CONDITION ( WS )+ 'and' ( WS )+ CONDITION | CONDITION ( WS )+ 'or' ( WS )+ CONDITION )
            {
            // C:\\Antlr\\SAF\\SAF.g:31:3: ( CONDITION | CONDITION ( WS )+ 'and' ( WS )+ CONDITION | CONDITION ( WS )+ 'or' ( WS )+ CONDITION )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:32:4: CONDITION
                    {
                    match(input,CONDITION,FOLLOW_CONDITION_in_condition378); 

                    System.out.println("condition");

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:33:4: CONDITION ( WS )+ 'and' ( WS )+ CONDITION
                    {
                    match(input,CONDITION,FOLLOW_CONDITION_in_condition386); 

                    // C:\\Antlr\\SAF\\SAF.g:33:14: ( WS )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==WS) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Antlr\\SAF\\SAF.g:33:14: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_condition388); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    match(input,19,FOLLOW_19_in_condition391); 

                    // C:\\Antlr\\SAF\\SAF.g:33:24: ( WS )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==WS) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Antlr\\SAF\\SAF.g:33:24: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_condition393); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    match(input,CONDITION,FOLLOW_CONDITION_in_condition396); 

                    System.out.println("condition and");

                    }
                    break;
                case 3 :
                    // C:\\Antlr\\SAF\\SAF.g:34:4: CONDITION ( WS )+ 'or' ( WS )+ CONDITION
                    {
                    match(input,CONDITION,FOLLOW_CONDITION_in_condition403); 

                    // C:\\Antlr\\SAF\\SAF.g:34:14: ( WS )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==WS) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Antlr\\SAF\\SAF.g:34:14: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_condition405); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    match(input,21,FOLLOW_21_in_condition408); 

                    // C:\\Antlr\\SAF\\SAF.g:34:23: ( WS )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==WS) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Antlr\\SAF\\SAF.g:34:23: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_condition410); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    match(input,CONDITION,FOLLOW_CONDITION_in_condition413); 

                    System.out.println("condition or");

                    }
                    break;

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
    // $ANTLR end "condition"



    // $ANTLR start "choosemovement"
    // C:\\Antlr\\SAF\\SAF.g:37:1: choosemovement : ( MOVEMENT ( WS )+ | 'choose' PARENTHESESOPEN MOVEMENT ( WS )+ MOVEMENT PARENTHESESCLOSE ) ;
    public final void choosemovement() throws RecognitionException {
        try {
            // C:\\Antlr\\SAF\\SAF.g:38:3: ( ( MOVEMENT ( WS )+ | 'choose' PARENTHESESOPEN MOVEMENT ( WS )+ MOVEMENT PARENTHESESCLOSE ) )
            // C:\\Antlr\\SAF\\SAF.g:38:3: ( MOVEMENT ( WS )+ | 'choose' PARENTHESESOPEN MOVEMENT ( WS )+ MOVEMENT PARENTHESESCLOSE )
            {
            // C:\\Antlr\\SAF\\SAF.g:38:3: ( MOVEMENT ( WS )+ | 'choose' PARENTHESESOPEN MOVEMENT ( WS )+ MOVEMENT PARENTHESESCLOSE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==MOVEMENT) ) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:38:4: MOVEMENT ( WS )+
                    {
                    match(input,MOVEMENT,FOLLOW_MOVEMENT_in_choosemovement428); 

                    // C:\\Antlr\\SAF\\SAF.g:38:13: ( WS )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==WS) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Antlr\\SAF\\SAF.g:38:13: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_choosemovement430); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    System.out.println("movement");

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:39:4: 'choose' PARENTHESESOPEN MOVEMENT ( WS )+ MOVEMENT PARENTHESESCLOSE
                    {
                    match(input,20,FOLLOW_20_in_choosemovement438); 

                    match(input,PARENTHESESOPEN,FOLLOW_PARENTHESESOPEN_in_choosemovement440); 

                    match(input,MOVEMENT,FOLLOW_MOVEMENT_in_choosemovement442); 

                    // C:\\Antlr\\SAF\\SAF.g:39:38: ( WS )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==WS) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Antlr\\SAF\\SAF.g:39:38: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_choosemovement444); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    match(input,MOVEMENT,FOLLOW_MOVEMENT_in_choosemovement447); 

                    match(input,PARENTHESESCLOSE,FOLLOW_PARENTHESESCLOSE_in_choosemovement449); 

                    }
                    break;

            }


            System.out.println("choose movement");

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
    // $ANTLR end "choosemovement"



    // $ANTLR start "chooseaction"
    // C:\\Antlr\\SAF\\SAF.g:41:1: chooseaction : ( ACTION | 'choose' PARENTHESESOPEN ACTION ( WS )+ ACTION PARENTHESESCLOSE ) ;
    public final void chooseaction() throws RecognitionException {
        try {
            // C:\\Antlr\\SAF\\SAF.g:42:3: ( ( ACTION | 'choose' PARENTHESESOPEN ACTION ( WS )+ ACTION PARENTHESESCLOSE ) )
            // C:\\Antlr\\SAF\\SAF.g:42:3: ( ACTION | 'choose' PARENTHESESOPEN ACTION ( WS )+ ACTION PARENTHESESCLOSE )
            {
            // C:\\Antlr\\SAF\\SAF.g:42:3: ( ACTION | 'choose' PARENTHESESOPEN ACTION ( WS )+ ACTION PARENTHESESCLOSE )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ACTION) ) {
                alt15=1;
            }
            else if ( (LA15_0==20) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Antlr\\SAF\\SAF.g:42:4: ACTION
                    {
                    match(input,ACTION,FOLLOW_ACTION_in_chooseaction461); 

                    System.out.println("action");

                    }
                    break;
                case 2 :
                    // C:\\Antlr\\SAF\\SAF.g:43:4: 'choose' PARENTHESESOPEN ACTION ( WS )+ ACTION PARENTHESESCLOSE
                    {
                    match(input,20,FOLLOW_20_in_chooseaction468); 

                    match(input,PARENTHESESOPEN,FOLLOW_PARENTHESESOPEN_in_chooseaction470); 

                    match(input,ACTION,FOLLOW_ACTION_in_chooseaction472); 

                    // C:\\Antlr\\SAF\\SAF.g:43:36: ( WS )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==WS) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Antlr\\SAF\\SAF.g:43:36: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_chooseaction474); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    match(input,ACTION,FOLLOW_ACTION_in_chooseaction477); 

                    match(input,PARENTHESESCLOSE,FOLLOW_PARENTHESESCLOSE_in_chooseaction479); 

                    }
                    break;

            }


            System.out.println("choose action");

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
    // $ANTLR end "chooseaction"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\2\5\3\uffff";
    static final String DFA5_maxS =
        "\2\22\3\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\1\2\1\3";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\3\6\uffff\1\4\2\uffff\1\2\2\uffff\1\1",
            "\1\3\6\uffff\1\4\2\uffff\1\2\2\uffff\1\1",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "24:1: codeline : ( ( WS )* PROPERTY IS INT NEWLINE | ( WS )* condition SQUAREOPEN choosemovement chooseaction SQUARECLOSE NEWLINE | ( WS )* NEWLINE );";
        }
    }
    static final String DFA10_eotS =
        "\6\uffff";
    static final String DFA10_eofS =
        "\6\uffff";
    static final String DFA10_minS =
        "\1\5\1\21\1\uffff\1\22\2\uffff";
    static final String DFA10_maxS =
        "\1\5\1\22\1\uffff\1\25\2\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\3";
    static final String DFA10_specialS =
        "\6\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\1\2\1\3",
            "",
            "\1\3\1\4\1\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "31:3: ( CONDITION | CONDITION ( WS )+ 'and' ( WS )+ CONDITION | CONDITION ( WS )+ 'or' ( WS )+ CONDITION )";
        }
    }
 

    public static final BitSet FOLLOW_NAME_in_fighter300 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_fighter302 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CURLYOPEN_in_fighter304 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_fighter306 = new BitSet(new long[]{0x0000000000049020L});
    public static final BitSet FOLLOW_codeline_in_fighter308 = new BitSet(new long[]{0x0000000000049060L});
    public static final BitSet FOLLOW_CURLYCLOSE_in_fighter311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_codeline324 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_PROPERTY_in_codeline327 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_IS_in_codeline329 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INT_in_codeline331 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_codeline333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_codeline340 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_condition_in_codeline343 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SQUAREOPEN_in_codeline345 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_choosemovement_in_codeline347 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_chooseaction_in_codeline349 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SQUARECLOSE_in_codeline351 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NEWLINE_in_codeline353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_codeline359 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_NEWLINE_in_codeline362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_in_condition378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_in_condition386 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_WS_in_condition388 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_condition391 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_WS_in_condition393 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_CONDITION_in_condition396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_in_condition403 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_WS_in_condition405 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_condition408 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_WS_in_condition410 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_CONDITION_in_condition413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEMENT_in_choosemovement428 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_WS_in_choosemovement430 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_20_in_choosemovement438 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_PARENTHESESOPEN_in_choosemovement440 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_MOVEMENT_in_choosemovement442 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_WS_in_choosemovement444 = new BitSet(new long[]{0x0000000000040400L});
    public static final BitSet FOLLOW_MOVEMENT_in_choosemovement447 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARENTHESESCLOSE_in_choosemovement449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_chooseaction461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_chooseaction468 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_PARENTHESESOPEN_in_chooseaction470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ACTION_in_chooseaction472 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_WS_in_chooseaction474 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ACTION_in_chooseaction477 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PARENTHESESCLOSE_in_chooseaction479 = new BitSet(new long[]{0x0000000000000002L});

}