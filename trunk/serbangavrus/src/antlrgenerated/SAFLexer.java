// $ANTLR 3.4 D:\\Master\\Software Construction\\ANTLR\\SAF.g 2012-01-30 20:35:19

	package antlrgenerated;
	import nodes.*;


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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:7:5: ( 'and' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:7:7: 'and'
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:8:8: ( 'choose' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:8:10: 'choose'
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:9:11: ( 'CONDITION' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:9:13: 'CONDITION'
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:10:4: ( 'or' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:10:6: 'or'
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:11:7: ( '(' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:11:9: '('
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:12:7: ( ')' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:12:9: ')'
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:13:7: ( '=' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:13:9: '='
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:14:7: ( '[' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:14:9: '['
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:15:7: ( ']' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:15:9: ']'
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:16:7: ( '{' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:16:9: '{'
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:17:7: ( '}' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:17:9: '}'
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:139:2: ( '0' .. '9' | '10' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='1') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='0') ) {
                    alt1=2;
                }
                else {
                    alt1=1;
                }
            }
            else if ( (LA1_0=='0'||(LA1_0 >= '2' && LA1_0 <= '9')) ) {
                alt1=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:139:4: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:140:4: '10'
                    {
                    match("10"); 



                    }
                    break;

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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:144:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:144:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:144:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:148:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+ )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:148:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+
            {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:148:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+
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
        switch ( input.LA(1) ) {
        case 'a':
            {
            int LA4_1 = input.LA(2);

            if ( (LA4_1=='n') ) {
                int LA4_16 = input.LA(3);

                if ( (LA4_16=='d') ) {
                    int LA4_22 = input.LA(4);

                    if ( (LA4_22=='-'||(LA4_22 >= '0' && LA4_22 <= '9')||(LA4_22 >= 'A' && LA4_22 <= 'Z')||LA4_22=='_'||(LA4_22 >= 'a' && LA4_22 <= 'z')) ) {
                        alt4=14;
                    }
                    else {
                        alt4=1;
                    }
                }
                else {
                    alt4=14;
                }
            }
            else {
                alt4=14;
            }
            }
            break;
        case 'c':
            {
            int LA4_2 = input.LA(2);

            if ( (LA4_2=='h') ) {
                int LA4_17 = input.LA(3);

                if ( (LA4_17=='o') ) {
                    int LA4_23 = input.LA(4);

                    if ( (LA4_23=='o') ) {
                        int LA4_27 = input.LA(5);

                        if ( (LA4_27=='s') ) {
                            int LA4_29 = input.LA(6);

                            if ( (LA4_29=='e') ) {
                                int LA4_31 = input.LA(7);

                                if ( (LA4_31=='-'||(LA4_31 >= '0' && LA4_31 <= '9')||(LA4_31 >= 'A' && LA4_31 <= 'Z')||LA4_31=='_'||(LA4_31 >= 'a' && LA4_31 <= 'z')) ) {
                                    alt4=14;
                                }
                                else {
                                    alt4=2;
                                }
                            }
                            else {
                                alt4=14;
                            }
                        }
                        else {
                            alt4=14;
                        }
                    }
                    else {
                        alt4=14;
                    }
                }
                else {
                    alt4=14;
                }
            }
            else {
                alt4=14;
            }
            }
            break;
        case 'C':
            {
            int LA4_3 = input.LA(2);

            if ( (LA4_3=='O') ) {
                int LA4_18 = input.LA(3);

                if ( (LA4_18=='N') ) {
                    int LA4_24 = input.LA(4);

                    if ( (LA4_24=='D') ) {
                        int LA4_28 = input.LA(5);

                        if ( (LA4_28=='I') ) {
                            int LA4_30 = input.LA(6);

                            if ( (LA4_30=='T') ) {
                                int LA4_32 = input.LA(7);

                                if ( (LA4_32=='I') ) {
                                    int LA4_34 = input.LA(8);

                                    if ( (LA4_34=='O') ) {
                                        int LA4_35 = input.LA(9);

                                        if ( (LA4_35=='N') ) {
                                            int LA4_36 = input.LA(10);

                                            if ( (LA4_36=='-'||(LA4_36 >= '0' && LA4_36 <= '9')||(LA4_36 >= 'A' && LA4_36 <= 'Z')||LA4_36=='_'||(LA4_36 >= 'a' && LA4_36 <= 'z')) ) {
                                                alt4=14;
                                            }
                                            else {
                                                alt4=3;
                                            }
                                        }
                                        else {
                                            alt4=14;
                                        }
                                    }
                                    else {
                                        alt4=14;
                                    }
                                }
                                else {
                                    alt4=14;
                                }
                            }
                            else {
                                alt4=14;
                            }
                        }
                        else {
                            alt4=14;
                        }
                    }
                    else {
                        alt4=14;
                    }
                }
                else {
                    alt4=14;
                }
            }
            else {
                alt4=14;
            }
            }
            break;
        case 'o':
            {
            int LA4_4 = input.LA(2);

            if ( (LA4_4=='r') ) {
                int LA4_19 = input.LA(3);

                if ( (LA4_19=='-'||(LA4_19 >= '0' && LA4_19 <= '9')||(LA4_19 >= 'A' && LA4_19 <= 'Z')||LA4_19=='_'||(LA4_19 >= 'a' && LA4_19 <= 'z')) ) {
                    alt4=14;
                }
                else {
                    alt4=4;
                }
            }
            else {
                alt4=14;
            }
            }
            break;
        case '(':
            {
            alt4=5;
            }
            break;
        case ')':
            {
            alt4=6;
            }
            break;
        case '=':
            {
            alt4=7;
            }
            break;
        case '[':
            {
            alt4=8;
            }
            break;
        case ']':
            {
            alt4=9;
            }
            break;
        case '{':
            {
            alt4=10;
            }
            break;
        case '}':
            {
            alt4=11;
            }
            break;
        case '1':
            {
            switch ( input.LA(2) ) {
            case '0':
                {
                int LA4_20 = input.LA(3);

                if ( (LA4_20=='-'||(LA4_20 >= '0' && LA4_20 <= '9')||(LA4_20 >= 'A' && LA4_20 <= 'Z')||LA4_20=='_'||(LA4_20 >= 'a' && LA4_20 <= 'z')) ) {
                    alt4=14;
                }
                else {
                    alt4=12;
                }
                }
                break;
            case '-':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt4=14;
                }
                break;
            default:
                alt4=12;
            }

            }
            break;
        case '0':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            int LA4_13 = input.LA(2);

            if ( (LA4_13=='-'||(LA4_13 >= '0' && LA4_13 <= '9')||(LA4_13 >= 'A' && LA4_13 <= 'Z')||LA4_13=='_'||(LA4_13 >= 'a' && LA4_13 <= 'z')) ) {
                alt4=14;
            }
            else {
                alt4=12;
            }
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt4=13;
            }
            break;
        case '-':
        case 'A':
        case 'B':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'b':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt4=14;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

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


 

}