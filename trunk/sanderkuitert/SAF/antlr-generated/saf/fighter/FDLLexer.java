// $ANTLR 3.4 /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g 2012-01-20 23:40:23

    package saf.fighter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int DIGIT=4;
    public static final int INT=5;
    public static final int LETTER=6;
    public static final int NEW_LINE=7;
    public static final int NL_CHAR=8;
    public static final int STRING=9;
    public static final int UNDER_SCORE=10;
    public static final int WHITESPACE=11;
    public static final int WHITE_CHAR=12;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public FDLLexer() {} 
    public FDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g"; }

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:45:7: ( LETTER ( LETTER | UNDER_SCORE | DIGIT )* )
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:45:17: LETTER ( LETTER | UNDER_SCORE | DIGIT )*
            {
            mLETTER(); 


            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:45:24: ( LETTER | UNDER_SCORE | DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:
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
    // $ANTLR end "STRING"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:46:4: ( ( DIGIT )+ )
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:46:17: ( DIGIT )+
            {
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:46:17: ( DIGIT )+
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
            	    // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:
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

    // $ANTLR start "NEW_LINE"
    public final void mNEW_LINE() throws RecognitionException {
        try {
            int _type = NEW_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:47:9: ( NL_CHAR )
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
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
    // $ANTLR end "NEW_LINE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:48:11: ( ( WHITE_CHAR )+ )
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:48:17: ( WHITE_CHAR )+
            {
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:48:17: ( WHITE_CHAR )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0=='\f'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:50:17: ( ( '0' .. '9' ) )
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:51:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "UNDER_SCORE"
    public final void mUNDER_SCORE() throws RecognitionException {
        try {
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:52:21: ( ( '_' ) )
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:52:25: ( '_' )
            {
            if ( input.LA(1)=='_' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDER_SCORE"

    // $ANTLR start "NL_CHAR"
    public final void mNL_CHAR() throws RecognitionException {
        try {
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:53:17: ( ( '\\r' | '\\n' ) )
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NL_CHAR"

    // $ANTLR start "WHITE_CHAR"
    public final void mWHITE_CHAR() throws RecognitionException {
        try {
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:54:20: ( ( '\\t' | ' ' | '\\u000C' ) )
            // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITE_CHAR"

    public void mTokens() throws RecognitionException {
        // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:1:8: ( STRING | INT | NEW_LINE | WHITESPACE )
        int alt4=4;
        switch ( input.LA(1) ) {
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
            alt4=1;
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
            alt4=2;
            }
            break;
        case '\n':
        case '\r':
            {
            alt4=3;
            }
            break;
        case '\t':
        case '\f':
        case ' ':
            {
            alt4=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
            case 1 :
                // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:1:10: STRING
                {
                mSTRING(); 


                }
                break;
            case 2 :
                // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:1:17: INT
                {
                mINT(); 


                }
                break;
            case 3 :
                // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:1:21: NEW_LINE
                {
                mNEW_LINE(); 


                }
                break;
            case 4 :
                // /home/sander/Documents/Study/Software Engineering Master/Software Construction/Project/Eclipse/SAF/src/saf/fighter/FDL.g:1:30: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


 

}