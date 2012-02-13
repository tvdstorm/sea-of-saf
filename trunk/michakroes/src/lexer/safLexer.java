// $ANTLR 3.4 /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g 2012-02-13 16:42:59

  package lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class safLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int CHOOSE=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int WS=7;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public safLexer() {} 
    public safLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public safLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/michakroes/Documents/workspace/saf/src/lexer/saf.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:11:6: ( '(' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:11:8: '('
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:12:6: ( ')' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:12:8: ')'
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:13:7: ( '=' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:13:9: '='
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:14:7: ( '[' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:14:9: '['
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:15:7: ( ']' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:15:9: ']'
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:16:7: ( '{' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:16:9: '{'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:17:7: ( '}' )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:17:9: '}'
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
    // $ANTLR end "T__14"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:21:9: ( ( 'choose' )* )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:21:11: ( 'choose' )*
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:21:11: ( 'choose' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='c') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:21:12: 'choose'
            	    {
            	    match("choose"); 



            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHOOSE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:22:5: ( ( '0' .. '9' )+ )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:22:7: ( '0' .. '9' )+
            {
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:22:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:23:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:23:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:23:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:24:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:24:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | CHOOSE | INT | ID | WS )
        int alt4=11;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:32: T__12
                {
                mT__12(); 


                }
                break;
            case 6 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:38: T__13
                {
                mT__13(); 


                }
                break;
            case 7 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:44: T__14
                {
                mT__14(); 


                }
                break;
            case 8 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:50: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 9 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:57: INT
                {
                mINT(); 


                }
                break;
            case 10 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:61: ID
                {
                mID(); 


                }
                break;
            case 11 :
                // /Users/michakroes/Documents/workspace/saf/src/lexer/saf.g:1:64: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\11\7\uffff\1\13\4\uffff\4\13\1\11\1\13";
    static final String DFA4_eofS =
        "\23\uffff";
    static final String DFA4_minS =
        "\1\11\7\uffff\1\150\4\uffff\2\157\1\163\1\145\1\60\1\150";
    static final String DFA4_maxS =
        "\1\175\7\uffff\1\150\4\uffff\2\157\1\163\1\145\1\172\1\150";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12\1\13"+
        "\6\uffff";
    static final String DFA4_specialS =
        "\23\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\14\2\uffff\1\14\22\uffff\1\14\7\uffff\1\1\1\2\6\uffff\12"+
            "\12\3\uffff\1\3\3\uffff\32\13\1\4\1\uffff\1\5\1\uffff\1\13\1"+
            "\uffff\2\13\1\10\27\13\1\6\1\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "",
            "",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\2\13\1\22\27\13",
            "\1\15"
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
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | CHOOSE | INT | ID | WS );";
        }
    }
 

}