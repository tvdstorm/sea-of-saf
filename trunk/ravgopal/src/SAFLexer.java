// $ANTLR 3.4 /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g 2012-01-24 14:31:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int ACTION=4;
    public static final int AND=5;
    public static final int BEHAVIOUR=6;
    public static final int CHARACTERISTIC=7;
    public static final int CHOICE=8;
    public static final int CHOICE_END=9;
    public static final int CHOICE_START=10;
    public static final int CHOOSE=11;
    public static final int CONDITION=12;
    public static final int EQLS=13;
    public static final int FIGHTER_END=14;
    public static final int FIGHTER_START=15;
    public static final int INT=16;
    public static final int NAME=17;
    public static final int OR=18;
    public static final int PERSONALITY=19;
    public static final int RULE_END=20;
    public static final int RULE_START=21;
    public static final int STRING=22;
    public static final int WHITESPACE=23;

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
    public String getGrammarFileName() { return "/Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:2:5: ( 'and' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:2:7: 'and'
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

    // $ANTLR start "CHOICE_END"
    public final void mCHOICE_END() throws RecognitionException {
        try {
            int _type = CHOICE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:3:12: ( ')' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:3:14: ')'
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
    // $ANTLR end "CHOICE_END"

    // $ANTLR start "CHOICE_START"
    public final void mCHOICE_START() throws RecognitionException {
        try {
            int _type = CHOICE_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:4:14: ( '(' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:4:16: '('
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
    // $ANTLR end "CHOICE_START"

    // $ANTLR start "CHOOSE"
    public final void mCHOOSE() throws RecognitionException {
        try {
            int _type = CHOOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:5:8: ( 'choose' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:5:10: 'choose'
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

    // $ANTLR start "EQLS"
    public final void mEQLS() throws RecognitionException {
        try {
            int _type = EQLS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:6:6: ( '=' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:6:8: '='
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
    // $ANTLR end "EQLS"

    // $ANTLR start "FIGHTER_END"
    public final void mFIGHTER_END() throws RecognitionException {
        try {
            int _type = FIGHTER_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:7:13: ( '}' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:7:15: '}'
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
    // $ANTLR end "FIGHTER_END"

    // $ANTLR start "FIGHTER_START"
    public final void mFIGHTER_START() throws RecognitionException {
        try {
            int _type = FIGHTER_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:8:15: ( '{' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:8:17: '{'
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
    // $ANTLR end "FIGHTER_START"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:9:4: ( 'or' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:9:6: 'or'
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

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            int _type = RULE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:10:10: ( ']' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:10:12: ']'
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
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_START"
    public final void mRULE_START() throws RecognitionException {
        try {
            int _type = RULE_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:11:12: ( '[' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:11:14: '['
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
    // $ANTLR end "RULE_START"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:12:7: ( 'kickPower' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:12:9: 'kickPower'
            {
            match("kickPower"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:13:7: ( 'kickReach' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:13:9: 'kickReach'
            {
            match("kickReach"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:14:7: ( 'punchPower' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:14:9: 'punchPower'
            {
            match("punchPower"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:15:7: ( 'punchReach' )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:15:9: 'punchReach'
            {
            match("punchReach"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:78:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:78:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:78:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:
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
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:82:3: ( ( '0' .. '9' )+ )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:82:5: ( '0' .. '9' )+
            {
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:82:5: ( '0' .. '9' )+
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
            	    // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:86:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:86:5: ( ' ' | '\\t' | '\\r' | '\\n' )
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
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:8: ( AND | CHOICE_END | CHOICE_START | CHOOSE | EQLS | FIGHTER_END | FIGHTER_START | OR | RULE_END | RULE_START | T__24 | T__25 | T__26 | T__27 | STRING | INT | WHITESPACE )
        int alt3=17;
        switch ( input.LA(1) ) {
        case 'a':
            {
            int LA3_1 = input.LA(2);

            if ( (LA3_1=='n') ) {
                int LA3_16 = input.LA(3);

                if ( (LA3_16=='d') ) {
                    int LA3_21 = input.LA(4);

                    if ( ((LA3_21 >= '0' && LA3_21 <= '9')||(LA3_21 >= 'A' && LA3_21 <= 'Z')||LA3_21=='_'||(LA3_21 >= 'a' && LA3_21 <= 'z')) ) {
                        alt3=15;
                    }
                    else {
                        alt3=1;
                    }
                }
                else {
                    alt3=15;
                }
            }
            else {
                alt3=15;
            }
            }
            break;
        case ')':
            {
            alt3=2;
            }
            break;
        case '(':
            {
            alt3=3;
            }
            break;
        case 'c':
            {
            int LA3_4 = input.LA(2);

            if ( (LA3_4=='h') ) {
                int LA3_17 = input.LA(3);

                if ( (LA3_17=='o') ) {
                    int LA3_22 = input.LA(4);

                    if ( (LA3_22=='o') ) {
                        int LA3_27 = input.LA(5);

                        if ( (LA3_27=='s') ) {
                            int LA3_30 = input.LA(6);

                            if ( (LA3_30=='e') ) {
                                int LA3_34 = input.LA(7);

                                if ( ((LA3_34 >= '0' && LA3_34 <= '9')||(LA3_34 >= 'A' && LA3_34 <= 'Z')||LA3_34=='_'||(LA3_34 >= 'a' && LA3_34 <= 'z')) ) {
                                    alt3=15;
                                }
                                else {
                                    alt3=4;
                                }
                            }
                            else {
                                alt3=15;
                            }
                        }
                        else {
                            alt3=15;
                        }
                    }
                    else {
                        alt3=15;
                    }
                }
                else {
                    alt3=15;
                }
            }
            else {
                alt3=15;
            }
            }
            break;
        case '=':
            {
            alt3=5;
            }
            break;
        case '}':
            {
            alt3=6;
            }
            break;
        case '{':
            {
            alt3=7;
            }
            break;
        case 'o':
            {
            int LA3_8 = input.LA(2);

            if ( (LA3_8=='r') ) {
                int LA3_18 = input.LA(3);

                if ( ((LA3_18 >= '0' && LA3_18 <= '9')||(LA3_18 >= 'A' && LA3_18 <= 'Z')||LA3_18=='_'||(LA3_18 >= 'a' && LA3_18 <= 'z')) ) {
                    alt3=15;
                }
                else {
                    alt3=8;
                }
            }
            else {
                alt3=15;
            }
            }
            break;
        case ']':
            {
            alt3=9;
            }
            break;
        case '[':
            {
            alt3=10;
            }
            break;
        case 'k':
            {
            int LA3_11 = input.LA(2);

            if ( (LA3_11=='i') ) {
                int LA3_19 = input.LA(3);

                if ( (LA3_19=='c') ) {
                    int LA3_24 = input.LA(4);

                    if ( (LA3_24=='k') ) {
                        switch ( input.LA(5) ) {
                        case 'P':
                            {
                            int LA3_31 = input.LA(6);

                            if ( (LA3_31=='o') ) {
                                int LA3_35 = input.LA(7);

                                if ( (LA3_35=='w') ) {
                                    int LA3_40 = input.LA(8);

                                    if ( (LA3_40=='e') ) {
                                        int LA3_44 = input.LA(9);

                                        if ( (LA3_44=='r') ) {
                                            int LA3_48 = input.LA(10);

                                            if ( ((LA3_48 >= '0' && LA3_48 <= '9')||(LA3_48 >= 'A' && LA3_48 <= 'Z')||LA3_48=='_'||(LA3_48 >= 'a' && LA3_48 <= 'z')) ) {
                                                alt3=15;
                                            }
                                            else {
                                                alt3=11;
                                            }
                                        }
                                        else {
                                            alt3=15;
                                        }
                                    }
                                    else {
                                        alt3=15;
                                    }
                                }
                                else {
                                    alt3=15;
                                }
                            }
                            else {
                                alt3=15;
                            }
                            }
                            break;
                        case 'R':
                            {
                            int LA3_32 = input.LA(6);

                            if ( (LA3_32=='e') ) {
                                int LA3_36 = input.LA(7);

                                if ( (LA3_36=='a') ) {
                                    int LA3_41 = input.LA(8);

                                    if ( (LA3_41=='c') ) {
                                        int LA3_45 = input.LA(9);

                                        if ( (LA3_45=='h') ) {
                                            int LA3_49 = input.LA(10);

                                            if ( ((LA3_49 >= '0' && LA3_49 <= '9')||(LA3_49 >= 'A' && LA3_49 <= 'Z')||LA3_49=='_'||(LA3_49 >= 'a' && LA3_49 <= 'z')) ) {
                                                alt3=15;
                                            }
                                            else {
                                                alt3=12;
                                            }
                                        }
                                        else {
                                            alt3=15;
                                        }
                                    }
                                    else {
                                        alt3=15;
                                    }
                                }
                                else {
                                    alt3=15;
                                }
                            }
                            else {
                                alt3=15;
                            }
                            }
                            break;
                        default:
                            alt3=15;
                        }

                    }
                    else {
                        alt3=15;
                    }
                }
                else {
                    alt3=15;
                }
            }
            else {
                alt3=15;
            }
            }
            break;
        case 'p':
            {
            int LA3_12 = input.LA(2);

            if ( (LA3_12=='u') ) {
                int LA3_20 = input.LA(3);

                if ( (LA3_20=='n') ) {
                    int LA3_25 = input.LA(4);

                    if ( (LA3_25=='c') ) {
                        int LA3_29 = input.LA(5);

                        if ( (LA3_29=='h') ) {
                            switch ( input.LA(6) ) {
                            case 'P':
                                {
                                int LA3_37 = input.LA(7);

                                if ( (LA3_37=='o') ) {
                                    int LA3_42 = input.LA(8);

                                    if ( (LA3_42=='w') ) {
                                        int LA3_46 = input.LA(9);

                                        if ( (LA3_46=='e') ) {
                                            int LA3_50 = input.LA(10);

                                            if ( (LA3_50=='r') ) {
                                                int LA3_54 = input.LA(11);

                                                if ( ((LA3_54 >= '0' && LA3_54 <= '9')||(LA3_54 >= 'A' && LA3_54 <= 'Z')||LA3_54=='_'||(LA3_54 >= 'a' && LA3_54 <= 'z')) ) {
                                                    alt3=15;
                                                }
                                                else {
                                                    alt3=13;
                                                }
                                            }
                                            else {
                                                alt3=15;
                                            }
                                        }
                                        else {
                                            alt3=15;
                                        }
                                    }
                                    else {
                                        alt3=15;
                                    }
                                }
                                else {
                                    alt3=15;
                                }
                                }
                                break;
                            case 'R':
                                {
                                int LA3_38 = input.LA(7);

                                if ( (LA3_38=='e') ) {
                                    int LA3_43 = input.LA(8);

                                    if ( (LA3_43=='a') ) {
                                        int LA3_47 = input.LA(9);

                                        if ( (LA3_47=='c') ) {
                                            int LA3_51 = input.LA(10);

                                            if ( (LA3_51=='h') ) {
                                                int LA3_55 = input.LA(11);

                                                if ( ((LA3_55 >= '0' && LA3_55 <= '9')||(LA3_55 >= 'A' && LA3_55 <= 'Z')||LA3_55=='_'||(LA3_55 >= 'a' && LA3_55 <= 'z')) ) {
                                                    alt3=15;
                                                }
                                                else {
                                                    alt3=14;
                                                }
                                            }
                                            else {
                                                alt3=15;
                                            }
                                        }
                                        else {
                                            alt3=15;
                                        }
                                    }
                                    else {
                                        alt3=15;
                                    }
                                }
                                else {
                                    alt3=15;
                                }
                                }
                                break;
                            default:
                                alt3=15;
                            }

                        }
                        else {
                            alt3=15;
                        }
                    }
                    else {
                        alt3=15;
                    }
                }
                else {
                    alt3=15;
                }
            }
            else {
                alt3=15;
            }
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
        case 'b':
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
            alt3=15;
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
            alt3=16;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=17;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:10: AND
                {
                mAND(); 


                }
                break;
            case 2 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:14: CHOICE_END
                {
                mCHOICE_END(); 


                }
                break;
            case 3 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:25: CHOICE_START
                {
                mCHOICE_START(); 


                }
                break;
            case 4 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:38: CHOOSE
                {
                mCHOOSE(); 


                }
                break;
            case 5 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:45: EQLS
                {
                mEQLS(); 


                }
                break;
            case 6 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:50: FIGHTER_END
                {
                mFIGHTER_END(); 


                }
                break;
            case 7 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:62: FIGHTER_START
                {
                mFIGHTER_START(); 


                }
                break;
            case 8 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:76: OR
                {
                mOR(); 


                }
                break;
            case 9 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:79: RULE_END
                {
                mRULE_END(); 


                }
                break;
            case 10 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:88: RULE_START
                {
                mRULE_START(); 


                }
                break;
            case 11 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:99: T__24
                {
                mT__24(); 


                }
                break;
            case 12 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:105: T__25
                {
                mT__25(); 


                }
                break;
            case 13 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:111: T__26
                {
                mT__26(); 


                }
                break;
            case 14 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:117: T__27
                {
                mT__27(); 


                }
                break;
            case 15 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:123: STRING
                {
                mSTRING(); 


                }
                break;
            case 16 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:130: INT
                {
                mINT(); 


                }
                break;
            case 17 :
                // /Users/ravish/Documents/Informatica/SE/Evolution/workspace/saf/src/SAF.g:1:134: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


 

}