// $ANTLR 3.4 D:\\Master\\Software Construction\\ANTLR\\SAF.g 2012-02-20 23:59:04

	package safreader.antlrgenerated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int AND=4;
    public static final int BEHAVIOUR=5;
    public static final int CHOOSE=6;
    public static final int CONDITION=7;
    public static final int FIGHTER=8;
    public static final int NUMBER=9;
    public static final int OR=10;
    public static final int PERSONALITY=11;
    public static final int STRING=12;
    public static final int WHITESPACE=13;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SAFLexer() {} 
    public SAFLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SAFLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Master\\Software Construction\\ANTLR\\SAF.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:6:5: ( 'and' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:6:7: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:7:8: ( 'choose' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:7:10: 'choose'
            {
            match("choose"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHOOSE"

    // $ANTLR start "CONDITION"
    public final void mCONDITION() throws RecognitionException {
        try {
            int _type = CONDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:8:11: ( 'CONDITION' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:8:13: 'CONDITION'
            {
            match("CONDITION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONDITION"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:9:4: ( 'or' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:9:6: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:10:7: ( '(' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:10:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:11:7: ( ')' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:11:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:12:7: ( '=' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:13:7: ( '[' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:14:7: ( ']' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:15:7: ( '{' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:16:7: ( '}' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:141:2: ( ( '0' .. '9' )+ )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:141:4: ( '0' .. '9' )+
            {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:141:4: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:145:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:145:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:145:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:149:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+ )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:149:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+
            {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:149:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:8: ( AND | CHOOSE | CONDITION | OR | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | NUMBER | WHITESPACE | STRING )
        int alt4=14;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:10: AND
                {
                mAND(); 


                }
                break;
            case 2 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:14: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 3 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:21: CONDITION
                {
                mCONDITION(); 


                }
                break;
            case 4 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:31: OR
                {
                mOR(); 


                }
                break;
            case 5 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:46: T__16
                {
                mT__16(); 


                }
                break;
            case 8 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:52: T__17
                {
                mT__17(); 


                }
                break;
            case 9 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:58: T__18
                {
                mT__18(); 


                }
                break;
            case 10 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:64: T__19
                {
                mT__19(); 


                }
                break;
            case 11 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:70: T__20
                {
                mT__20(); 


                }
                break;
            case 12 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:76: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 13 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:83: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 14 :
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:1:94: STRING
                {
                mSTRING(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\4\16\7\uffff\1\23\2\uffff\3\16\1\27\1\uffff\1\30\2\16\2"+
        "\uffff\4\16\1\37\1\16\1\uffff\2\16\1\43\1\uffff";
    static final String DFA4_eofS =
        "\44\uffff";
    static final String DFA4_minS =
        "\1\11\1\156\1\150\1\117\1\162\7\uffff\1\55\2\uffff\1\144\1\157\1"+
        "\116\1\55\1\uffff\1\55\1\157\1\104\2\uffff\1\163\1\111\1\145\1\124"+
        "\1\55\1\111\1\uffff\1\117\1\116\1\55\1\uffff";
    static final String DFA4_maxS =
        "\1\175\1\156\1\150\1\117\1\162\7\uffff\1\172\2\uffff\1\144\1\157"+
        "\1\116\1\172\1\uffff\1\172\1\157\1\104\2\uffff\1\163\1\111\1\145"+
        "\1\124\1\172\1\111\1\uffff\1\117\1\116\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff\1\15\1\16\4\uffff"+
        "\1\14\3\uffff\1\4\1\1\6\uffff\1\2\3\uffff\1\3";
    static final String DFA4_specialS =
        "\44\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\15\1\uffff\2\15\22\uffff\1\15\7\uffff\1\5\1\6\3\uffff\1\16"+
            "\2\uffff\12\14\3\uffff\1\7\3\uffff\2\16\1\3\27\16\1\10\1\uffff"+
            "\1\11\1\uffff\1\16\1\uffff\1\1\1\16\1\2\13\16\1\4\13\16\1\12"+
            "\1\uffff\1\13",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\2\uffff\12\14\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\31",
            "\1\32",
            "",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\40",
            "",
            "\1\41",
            "\1\42",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AND | CHOOSE | CONDITION | OR | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | NUMBER | WHITESPACE | STRING );";
        }
    }
 

}