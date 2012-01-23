// $ANTLR 3.4 /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g 2012-01-23 10:41:05

  package com.yennick.SAF;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int ATTACK=4;
    public static final int CONDITION=5;
    public static final int CURLYCLOSE=6;
    public static final int CURLYOPEN=7;
    public static final int DIRECTION=8;
    public static final int DISTANCE=9;
    public static final int EQUALS=10;
    public static final int FIGHTACTION=11;
    public static final int FIGHTERNAME=12;
    public static final int MOVEACTION=13;
    public static final int SKILLS=14;
    public static final int SKILLVALUE=15;
    public static final int WHITESPACE=16;

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
    public String getGrammarFileName() { return "/Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g"; }

    // $ANTLR start "CURLYCLOSE"
    public final void mCURLYCLOSE() throws RecognitionException {
        try {
            int _type = CURLYCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:11:12: ( '}' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:11:14: '}'
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
    // $ANTLR end "CURLYCLOSE"

    // $ANTLR start "CURLYOPEN"
    public final void mCURLYOPEN() throws RecognitionException {
        try {
            int _type = CURLYOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:12:11: ( '{' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:12:13: '{'
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
    // $ANTLR end "CURLYOPEN"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:13:8: ( '=' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:13:10: '='
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
    // $ANTLR end "EQUALS"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:14:7: ( '(' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:14:9: '('
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:15:7: ( ')' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:15:9: ')'
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:16:7: ( '[' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:16:9: '['
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:17:7: ( ']' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:17:9: ']'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:18:7: ( 'always' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:18:9: 'always'
            {
            match("always"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:19:7: ( 'choose' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:19:9: 'choose'
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:20:7: ( 'height' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:20:9: 'height'
            {
            match("height"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:21:7: ( 'speed' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:21:9: 'speed'
            {
            match("speed"); 



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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:22:7: ( 'stand' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:22:9: 'stand'
            {
            match("stand"); 



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
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:23:7: ( 'weight' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:23:9: 'weight'
            {
            match("weight"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "ATTACK"
    public final void mATTACK() throws RecognitionException {
        try {
            int _type = ATTACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:69:10: ( ( 'kick' | 'punch' | 'block' ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:69:12: ( 'kick' | 'punch' | 'block' )
            {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:69:12: ( 'kick' | 'punch' | 'block' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'k':
                {
                alt1=1;
                }
                break;
            case 'p':
                {
                alt1=2;
                }
                break;
            case 'b':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:69:13: 'kick'
                    {
                    match("kick"); 



                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:69:20: 'punch'
                    {
                    match("punch"); 



                    }
                    break;
                case 3 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:69:28: 'block'
                    {
                    match("block"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ATTACK"

    // $ANTLR start "DISTANCE"
    public final void mDISTANCE() throws RecognitionException {
        try {
            int _type = DISTANCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:70:11: ( ( 'far' | 'near' | 'always' ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:70:13: ( 'far' | 'near' | 'always' )
            {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:70:13: ( 'far' | 'near' | 'always' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'f':
                {
                alt2=1;
                }
                break;
            case 'n':
                {
                alt2=2;
                }
                break;
            case 'a':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:70:14: 'far'
                    {
                    match("far"); 



                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:70:20: 'near'
                    {
                    match("near"); 



                    }
                    break;
                case 3 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:70:27: 'always'
                    {
                    match("always"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DISTANCE"

    // $ANTLR start "DIRECTION"
    public final void mDIRECTION() throws RecognitionException {
        try {
            int _type = DIRECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:71:12: ( ( 'high' | 'low' ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:71:14: ( 'high' | 'low' )
            {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:71:14: ( 'high' | 'low' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='h') ) {
                alt3=1;
            }
            else if ( (LA3_0=='l') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:71:15: 'high'
                    {
                    match("high"); 



                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:71:22: 'low'
                    {
                    match("low"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIRECTION"

    // $ANTLR start "FIGHTACTION"
    public final void mFIGHTACTION() throws RecognitionException {
        try {
            int _type = FIGHTACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:72:13: ( ATTACK '_' DIRECTION )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:72:15: ATTACK '_' DIRECTION
            {
            mATTACK(); 


            match('_'); 

            mDIRECTION(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FIGHTACTION"

    // $ANTLR start "CONDITION"
    public final void mCONDITION() throws RecognitionException {
        try {
            int _type = CONDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:73:12: ( ( 'much' '_' )? ( 'stronger' | 'weaker' ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:73:14: ( 'much' '_' )? ( 'stronger' | 'weaker' )
            {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:73:14: ( 'much' '_' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='m') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:73:15: 'much' '_'
                    {
                    match("much"); 



                    match('_'); 

                    }
                    break;

            }


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:73:26: ( 'stronger' | 'weaker' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='s') ) {
                alt5=1;
            }
            else if ( (LA5_0=='w') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:73:27: 'stronger'
                    {
                    match("stronger"); 



                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:73:38: 'weaker'
                    {
                    match("weaker"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONDITION"

    // $ANTLR start "MOVEACTION"
    public final void mMOVEACTION() throws RecognitionException {
        try {
            int _type = MOVEACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:74:12: ( ( 'run' | 'crouch' | 'walk' | 'jump' ) ( '_' ( 'towards' | 'away' ) )? )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:74:14: ( 'run' | 'crouch' | 'walk' | 'jump' ) ( '_' ( 'towards' | 'away' ) )?
            {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:74:14: ( 'run' | 'crouch' | 'walk' | 'jump' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 'r':
                {
                alt6=1;
                }
                break;
            case 'c':
                {
                alt6=2;
                }
                break;
            case 'w':
                {
                alt6=3;
                }
                break;
            case 'j':
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:74:15: 'run'
                    {
                    match("run"); 



                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:74:21: 'crouch'
                    {
                    match("crouch"); 



                    }
                    break;
                case 3 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:74:30: 'walk'
                    {
                    match("walk"); 



                    }
                    break;
                case 4 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:74:37: 'jump'
                    {
                    match("jump"); 



                    }
                    break;

            }


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:74:44: ( '_' ( 'towards' | 'away' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='_') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:74:45: '_' ( 'towards' | 'away' )
                    {
                    match('_'); 

                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:74:48: ( 'towards' | 'away' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='t') ) {
                        alt7=1;
                    }
                    else if ( (LA7_0=='a') ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;

                    }
                    switch (alt7) {
                        case 1 :
                            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:74:49: 'towards'
                            {
                            match("towards"); 



                            }
                            break;
                        case 2 :
                            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:74:59: 'away'
                            {
                            match("away"); 



                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOVEACTION"

    // $ANTLR start "SKILLS"
    public final void mSKILLS() throws RecognitionException {
        try {
            int _type = SKILLS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:75:10: ( ATTACK ( 'Reach' | 'Power' ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:75:12: ATTACK ( 'Reach' | 'Power' )
            {
            mATTACK(); 


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:75:18: ( 'Reach' | 'Power' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='R') ) {
                alt9=1;
            }
            else if ( (LA9_0=='P') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:75:19: 'Reach'
                    {
                    match("Reach"); 



                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:75:27: 'Power'
                    {
                    match("Power"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SKILLS"

    // $ANTLR start "FIGHTERNAME"
    public final void mFIGHTERNAME() throws RecognitionException {
        try {
            int _type = FIGHTERNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:78:13: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' )+ )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:78:15: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' )+
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:78:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='-'||(LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FIGHTERNAME"

    // $ANTLR start "SKILLVALUE"
    public final void mSKILLVALUE() throws RecognitionException {
        try {
            int _type = SKILLVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:79:12: ( '0' .. '9' | '10' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='1') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='0') ) {
                    alt11=2;
                }
                else {
                    alt11=1;
                }
            }
            else if ( (LA11_0=='0'||(LA11_0 >= '2' && LA11_0 <= '9')) ) {
                alt11=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:79:14: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:79:24: '10'
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
    // $ANTLR end "SKILLVALUE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:81:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:81:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:81:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||(LA12_0 >= '\f' && LA12_0 <= '\r')||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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

    public void mTokens() throws RecognitionException {
        // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:8: ( CURLYCLOSE | CURLYOPEN | EQUALS | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ATTACK | DISTANCE | DIRECTION | FIGHTACTION | CONDITION | MOVEACTION | SKILLS | FIGHTERNAME | SKILLVALUE | WHITESPACE )
        int alt13=23;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:10: CURLYCLOSE
                {
                mCURLYCLOSE(); 


                }
                break;
            case 2 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:21: CURLYOPEN
                {
                mCURLYOPEN(); 


                }
                break;
            case 3 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:31: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 4 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:38: T__17
                {
                mT__17(); 


                }
                break;
            case 5 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:44: T__18
                {
                mT__18(); 


                }
                break;
            case 6 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:50: T__19
                {
                mT__19(); 


                }
                break;
            case 7 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:56: T__20
                {
                mT__20(); 


                }
                break;
            case 8 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:62: T__21
                {
                mT__21(); 


                }
                break;
            case 9 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:68: T__22
                {
                mT__22(); 


                }
                break;
            case 10 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:74: T__23
                {
                mT__23(); 


                }
                break;
            case 11 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:80: T__24
                {
                mT__24(); 


                }
                break;
            case 12 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:86: T__25
                {
                mT__25(); 


                }
                break;
            case 13 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:92: T__26
                {
                mT__26(); 


                }
                break;
            case 14 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:98: ATTACK
                {
                mATTACK(); 


                }
                break;
            case 15 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:105: DISTANCE
                {
                mDISTANCE(); 


                }
                break;
            case 16 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:114: DIRECTION
                {
                mDIRECTION(); 


                }
                break;
            case 17 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:124: FIGHTACTION
                {
                mFIGHTACTION(); 


                }
                break;
            case 18 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:136: CONDITION
                {
                mCONDITION(); 


                }
                break;
            case 19 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:146: MOVEACTION
                {
                mMOVEACTION(); 


                }
                break;
            case 20 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:157: SKILLS
                {
                mSKILLS(); 


                }
                break;
            case 21 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:164: FIGHTERNAME
                {
                mFIGHTERNAME(); 


                }
                break;
            case 22 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:176: SKILLVALUE
                {
                mSKILLVALUE(); 


                }
                break;
            case 23 :
                // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:1:187: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\31\uffff\40\26\1\115\1\26\1\117\1\26\1\121\5\26\1\117\5\26\1\121"+
        "\1\134\2\26\1\uffff\1\115\1\uffff\1\26\1\uffff\1\121\4\26\1\147"+
        "\1\150\3\26\2\uffff\2\26\2\134\1\uffff\1\156\1\157\1\121\1\160\2"+
        "\uffff\1\26\1\162\1\142\2\26\3\uffff\1\26\1\uffff\2\26\1\142\2\26"+
        "\2\172\1\uffff";
    static final String DFA13_eofS =
        "\173\uffff";
    static final String DFA13_minS =
        "\1\11\7\uffff\16\55\3\uffff\1\167\2\157\1\151\1\147\1\145\2\141"+
        "\1\154\1\143\1\156\1\157\1\162\1\141\1\167\1\143\1\156\1\155\1\141"+
        "\1\157\1\165\1\147\1\150\1\145\1\156\1\157\1\147\3\153\2\143\1\55"+
        "\1\162\1\55\1\150\1\55\1\160\1\171\1\163\1\143\1\150\1\55\2\144"+
        "\1\156\1\150\1\145\2\55\1\150\1\153\1\uffff\1\55\1\uffff\1\137\1"+
        "\uffff\1\55\1\163\1\145\1\150\1\164\2\55\1\147\1\164\1\162\2\uffff"+
        "\1\145\1\157\2\55\1\uffff\4\55\2\uffff\1\145\2\55\1\141\1\167\3"+
        "\uffff\1\162\1\uffff\1\143\1\145\1\55\1\150\1\162\2\55\1\uffff";
    static final String DFA13_maxS =
        "\1\175\7\uffff\16\172\3\uffff\1\167\2\157\1\151\1\147\1\145\1\162"+
        "\1\151\1\154\1\143\1\156\1\157\1\162\1\141\1\167\1\143\1\156\1\155"+
        "\1\141\1\157\1\165\1\147\1\150\1\145\1\156\1\157\1\147\3\153\2\143"+
        "\1\172\1\162\1\172\1\150\1\172\1\160\1\171\1\163\1\143\1\150\1\172"+
        "\2\144\1\156\1\150\1\145\2\172\1\150\1\153\1\uffff\1\172\1\uffff"+
        "\1\137\1\uffff\1\172\1\163\1\145\1\150\1\164\2\172\1\147\1\164\1"+
        "\162\2\uffff\1\145\1\157\2\172\1\uffff\4\172\2\uffff\1\145\2\172"+
        "\1\141\1\167\3\uffff\1\162\1\uffff\1\143\1\145\1\172\1\150\1\162"+
        "\2\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\16\uffff\1\25\1\26\1\27\64"+
        "\uffff\1\17\1\uffff\1\20\1\uffff\1\23\12\uffff\1\16\1\21\4\uffff"+
        "\1\22\4\uffff\1\13\1\14\5\uffff\1\10\1\11\1\12\1\uffff\1\15\7\uffff"+
        "\1\24";
    static final String DFA13_specialS =
        "\173\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\30\1\uffff\2\30\22\uffff\1\30\7\uffff\1\4\1\5\6\uffff\12"+
            "\27\3\uffff\1\3\3\uffff\32\26\1\6\1\uffff\1\7\3\uffff\1\10\1"+
            "\17\1\11\2\26\1\20\1\26\1\12\1\26\1\25\1\15\1\22\1\23\1\21\1"+
            "\26\1\16\1\26\1\24\1\13\3\26\1\14\3\26\1\2\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\13\26\1\31\16\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\7\26\1\32\11\26\1"+
            "\33\10\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\4\26\1\34\3\26\1"+
            "\35\21\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\17\26\1\36\3\26\1"+
            "\37\6\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\1\41\3\26\1\40\25"+
            "\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\10\26\1\42\21\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\24\26\1\43\5\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\13\26\1\44\16\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\1\45\31\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\4\26\1\46\25\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\16\26\1\47\13\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\24\26\1\50\5\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\24\26\1\51\5\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\24\26\1\52\5\26",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61\20\uffff\1\62",
            "\1\64\7\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\116",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\120",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\17\26\1\137\1\26\1\136\10\26\4"+
            "\uffff\1\135\1\uffff\32\26",
            "\1\140",
            "\1\141",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "\1\142",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "\1\154",
            "\1\155",
            "\1\26\2\uffff\12\26\7\uffff\17\26\1\137\1\26\1\136\10\26\4"+
            "\uffff\1\135\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\17\26\1\137\1\26\1\136\10\26\4"+
            "\uffff\1\135\1\uffff\32\26",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "",
            "\1\161",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\163",
            "\1\164",
            "",
            "",
            "",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\170",
            "\1\171",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( CURLYCLOSE | CURLYOPEN | EQUALS | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ATTACK | DISTANCE | DIRECTION | FIGHTACTION | CONDITION | MOVEACTION | SKILLS | FIGHTERNAME | SKILLVALUE | WHITESPACE );";
        }
    }
 

}