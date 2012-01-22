// $ANTLR 3.4 /Users/job/Programming/svn-sc/SAFlexer.g 2012-01-22 23:21:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFlexer extends Lexer {
    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int ID=5;
    public static final int LEFT_BRACE=6;
    public static final int LEFT_BRACKET=7;
    public static final int NEWLINE=8;
    public static final int NUMBER=9;
    public static final int PERSONALITY_TYPE=10;
    public static final int RIGHT_BRACE=11;
    public static final int RIGHT_BRACKET=12;
    public static final int WHITESPACE=13;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SAFlexer() {} 
    public SAFlexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SAFlexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/job/Programming/svn-sc/SAFlexer.g"; }

    // $ANTLR start "LEFT_BRACE"
    public final void mLEFT_BRACE() throws RecognitionException {
        try {
            int _type = LEFT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:3:13: ( '{' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:3:15: '{'
            {
            match('{'); 

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT_BRACE"

    // $ANTLR start "RIGHT_BRACE"
    public final void mRIGHT_BRACE() throws RecognitionException {
        try {
            int _type = RIGHT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:4:14: ( '}' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:4:16: '}'
            {
            match('}'); 

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT_BRACE"

    // $ANTLR start "LEFT_BRACKET"
    public final void mLEFT_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:5:14: ( '[' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:5:16: '['
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
    // $ANTLR end "LEFT_BRACKET"

    // $ANTLR start "RIGHT_BRACKET"
    public final void mRIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:6:15: ( ']' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:6:17: ']'
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
    // $ANTLR end "RIGHT_BRACKET"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:7:10: ( '=' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:7:12: '='
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
    // $ANTLR end "ASSIGN"

    // $ANTLR start "PERSONALITY_TYPE"
    public final void mPERSONALITY_TYPE() throws RecognitionException {
        try {
            int _type = PERSONALITY_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:9:18: ( 'kickPower' | 'punchPower' | 'kickReach' | 'punchReach' )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='k') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='i') ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3=='c') ) {
                        int LA1_5 = input.LA(4);

                        if ( (LA1_5=='k') ) {
                            int LA1_7 = input.LA(5);

                            if ( (LA1_7=='P') ) {
                                alt1=1;
                            }
                            else if ( (LA1_7=='R') ) {
                                alt1=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 7, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA1_0=='p') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='u') ) {
                    int LA1_4 = input.LA(3);

                    if ( (LA1_4=='n') ) {
                        int LA1_6 = input.LA(4);

                        if ( (LA1_6=='c') ) {
                            int LA1_8 = input.LA(5);

                            if ( (LA1_8=='h') ) {
                                int LA1_11 = input.LA(6);

                                if ( (LA1_11=='P') ) {
                                    alt1=2;
                                }
                                else if ( (LA1_11=='R') ) {
                                    alt1=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 11, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:9:20: 'kickPower'
                    {
                    match("kickPower"); 



                    }
                    break;
                case 2 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:9:34: 'punchPower'
                    {
                    match("punchPower"); 



                    }
                    break;
                case 3 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:9:49: 'kickReach'
                    {
                    match("kickReach"); 



                    }
                    break;
                case 4 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:9:63: 'punchReach'
                    {
                    match("punchReach"); 



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
    // $ANTLR end "PERSONALITY_TYPE"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:11:10: ( '0' .. '9' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:12:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/job/Programming/svn-sc/SAFlexer.g:12:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/job/Programming/svn-sc/SAFlexer.g:12:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/job/Programming/svn-sc/SAFlexer.g:
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
            	    break loop2;
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:14:14: ( ( ' ' | '\\t' ) )
            // /Users/job/Programming/svn-sc/SAFlexer.g:14:16: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/job/Programming/svn-sc/SAFlexer.g:15:11: ( ( '\\r' )? '\\n' )
            // /Users/job/Programming/svn-sc/SAFlexer.g:15:13: ( '\\r' )? '\\n'
            {
            // /Users/job/Programming/svn-sc/SAFlexer.g:15:13: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/job/Programming/svn-sc/SAFlexer.g:15:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /Users/job/Programming/svn-sc/SAFlexer.g:1:8: ( LEFT_BRACE | RIGHT_BRACE | LEFT_BRACKET | RIGHT_BRACKET | ASSIGN | PERSONALITY_TYPE | NUMBER | ID | WHITESPACE | NEWLINE )
        int alt4=10;
        switch ( input.LA(1) ) {
        case '{':
            {
            alt4=1;
            }
            break;
        case '}':
            {
            alt4=2;
            }
            break;
        case '[':
            {
            alt4=3;
            }
            break;
        case ']':
            {
            alt4=4;
            }
            break;
        case '=':
            {
            alt4=5;
            }
            break;
        case 'k':
            {
            int LA4_6 = input.LA(2);

            if ( (LA4_6=='i') ) {
                int LA4_12 = input.LA(3);

                if ( (LA4_12=='c') ) {
                    int LA4_14 = input.LA(4);

                    if ( (LA4_14=='k') ) {
                        switch ( input.LA(5) ) {
                        case 'P':
                            {
                            int LA4_18 = input.LA(6);

                            if ( (LA4_18=='o') ) {
                                int LA4_21 = input.LA(7);

                                if ( (LA4_21=='w') ) {
                                    int LA4_25 = input.LA(8);

                                    if ( (LA4_25=='e') ) {
                                        int LA4_29 = input.LA(9);

                                        if ( (LA4_29=='r') ) {
                                            int LA4_33 = input.LA(10);

                                            if ( ((LA4_33 >= '0' && LA4_33 <= '9')||(LA4_33 >= 'A' && LA4_33 <= 'Z')||LA4_33=='_'||(LA4_33 >= 'a' && LA4_33 <= 'z')) ) {
                                                alt4=8;
                                            }
                                            else {
                                                alt4=6;
                                            }
                                        }
                                        else {
                                            alt4=8;
                                        }
                                    }
                                    else {
                                        alt4=8;
                                    }
                                }
                                else {
                                    alt4=8;
                                }
                            }
                            else {
                                alt4=8;
                            }
                            }
                            break;
                        case 'R':
                            {
                            int LA4_19 = input.LA(6);

                            if ( (LA4_19=='e') ) {
                                int LA4_22 = input.LA(7);

                                if ( (LA4_22=='a') ) {
                                    int LA4_26 = input.LA(8);

                                    if ( (LA4_26=='c') ) {
                                        int LA4_30 = input.LA(9);

                                        if ( (LA4_30=='h') ) {
                                            int LA4_34 = input.LA(10);

                                            if ( ((LA4_34 >= '0' && LA4_34 <= '9')||(LA4_34 >= 'A' && LA4_34 <= 'Z')||LA4_34=='_'||(LA4_34 >= 'a' && LA4_34 <= 'z')) ) {
                                                alt4=8;
                                            }
                                            else {
                                                alt4=6;
                                            }
                                        }
                                        else {
                                            alt4=8;
                                        }
                                    }
                                    else {
                                        alt4=8;
                                    }
                                }
                                else {
                                    alt4=8;
                                }
                            }
                            else {
                                alt4=8;
                            }
                            }
                            break;
                        default:
                            alt4=8;
                        }

                    }
                    else {
                        alt4=8;
                    }
                }
                else {
                    alt4=8;
                }
            }
            else {
                alt4=8;
            }
            }
            break;
        case 'p':
            {
            int LA4_7 = input.LA(2);

            if ( (LA4_7=='u') ) {
                int LA4_13 = input.LA(3);

                if ( (LA4_13=='n') ) {
                    int LA4_15 = input.LA(4);

                    if ( (LA4_15=='c') ) {
                        int LA4_17 = input.LA(5);

                        if ( (LA4_17=='h') ) {
                            switch ( input.LA(6) ) {
                            case 'P':
                                {
                                int LA4_23 = input.LA(7);

                                if ( (LA4_23=='o') ) {
                                    int LA4_27 = input.LA(8);

                                    if ( (LA4_27=='w') ) {
                                        int LA4_31 = input.LA(9);

                                        if ( (LA4_31=='e') ) {
                                            int LA4_35 = input.LA(10);

                                            if ( (LA4_35=='r') ) {
                                                int LA4_38 = input.LA(11);

                                                if ( ((LA4_38 >= '0' && LA4_38 <= '9')||(LA4_38 >= 'A' && LA4_38 <= 'Z')||LA4_38=='_'||(LA4_38 >= 'a' && LA4_38 <= 'z')) ) {
                                                    alt4=8;
                                                }
                                                else {
                                                    alt4=6;
                                                }
                                            }
                                            else {
                                                alt4=8;
                                            }
                                        }
                                        else {
                                            alt4=8;
                                        }
                                    }
                                    else {
                                        alt4=8;
                                    }
                                }
                                else {
                                    alt4=8;
                                }
                                }
                                break;
                            case 'R':
                                {
                                int LA4_24 = input.LA(7);

                                if ( (LA4_24=='e') ) {
                                    int LA4_28 = input.LA(8);

                                    if ( (LA4_28=='a') ) {
                                        int LA4_32 = input.LA(9);

                                        if ( (LA4_32=='c') ) {
                                            int LA4_36 = input.LA(10);

                                            if ( (LA4_36=='h') ) {
                                                int LA4_39 = input.LA(11);

                                                if ( ((LA4_39 >= '0' && LA4_39 <= '9')||(LA4_39 >= 'A' && LA4_39 <= 'Z')||LA4_39=='_'||(LA4_39 >= 'a' && LA4_39 <= 'z')) ) {
                                                    alt4=8;
                                                }
                                                else {
                                                    alt4=6;
                                                }
                                            }
                                            else {
                                                alt4=8;
                                            }
                                        }
                                        else {
                                            alt4=8;
                                        }
                                    }
                                    else {
                                        alt4=8;
                                    }
                                }
                                else {
                                    alt4=8;
                                }
                                }
                                break;
                            default:
                                alt4=8;
                            }

                        }
                        else {
                            alt4=8;
                        }
                    }
                    else {
                        alt4=8;
                    }
                }
                else {
                    alt4=8;
                }
            }
            else {
                alt4=8;
            }
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt4=7;
            }
            break;
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
        case 'l':
        case 'm':
        case 'n':
        case 'o':
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
            alt4=8;
            }
            break;
        case '\t':
        case ' ':
            {
            alt4=9;
            }
            break;
        case '\n':
        case '\r':
            {
            alt4=10;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
            case 1 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:10: LEFT_BRACE
                {
                mLEFT_BRACE(); 


                }
                break;
            case 2 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:21: RIGHT_BRACE
                {
                mRIGHT_BRACE(); 


                }
                break;
            case 3 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:33: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 


                }
                break;
            case 4 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:46: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 


                }
                break;
            case 5 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:60: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 6 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:67: PERSONALITY_TYPE
                {
                mPERSONALITY_TYPE(); 


                }
                break;
            case 7 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:84: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 8 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:91: ID
                {
                mID(); 


                }
                break;
            case 9 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:94: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 10 :
                // /Users/job/Programming/svn-sc/SAFlexer.g:1:105: NEWLINE
                {
                mNEWLINE(); 


                }
                break;

        }

    }


 

}