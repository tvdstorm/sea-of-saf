// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g 2012-01-23 12:14:31

  package com.mike.SAF;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SAFgrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEHAVIOUR", "CHARACTERISTIC", "BETWEEN", "PROGRAM", "NAME", "CONDITION", "MOVE", "FIGHT", "DIGIT", "WS", "'{'", "'}'", "'['", "']'", "'choose'", "'('", "')'", "'punchReach'", "'punchPower'", "'kickReach'", "'kickPower'", "'='"
    };
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int CONDITION=9;
    public static final int EOF=-1;
    public static final int BEHAVIOUR=4;
    public static final int T__19=19;
    public static final int NAME=8;
    public static final int WS=13;
    public static final int T__16=16;
    public static final int FIGHT=11;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int MOVE=10;
    public static final int T__14=14;
    public static final int CHARACTERISTIC=5;
    public static final int PROGRAM=7;
    public static final int DIGIT=12;
    public static final int BETWEEN=6;

    // delegates
    // delegators


        public SAFgrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SAFgrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SAFgrammarParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:26:1: program : pr -> ^( PROGRAM pr ) ;
    public final SAFgrammarParser.program_return program() throws RecognitionException {
        SAFgrammarParser.program_return retval = new SAFgrammarParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SAFgrammarParser.pr_return pr1 = null;


        RewriteRuleSubtreeStream stream_pr=new RewriteRuleSubtreeStream(adaptor,"rule pr");
        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:26:8: ( pr -> ^( PROGRAM pr ) )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:27:2: pr
            {
            pushFollow(FOLLOW_pr_in_program80);
            pr1=pr();

            state._fsp--;

            stream_pr.add(pr1.getTree());


            // AST REWRITE
            // elements: pr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 27:5: -> ^( PROGRAM pr )
            {
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:27:8: ^( PROGRAM pr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                adaptor.addChild(root_1, stream_pr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class pr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pr"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:29:1: pr : ( bot ( bot )* | bot EOF );
    public final SAFgrammarParser.pr_return pr() throws RecognitionException {
        SAFgrammarParser.pr_return retval = new SAFgrammarParser.pr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF5=null;
        SAFgrammarParser.bot_return bot2 = null;

        SAFgrammarParser.bot_return bot3 = null;

        SAFgrammarParser.bot_return bot4 = null;


        CommonTree EOF5_tree=null;

        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:30:2: ( bot ( bot )* | bot EOF )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:31:3: bot ( bot )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bot_in_pr99);
                    bot2=bot();

                    state._fsp--;

                    adaptor.addChild(root_0, bot2.getTree());
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:31:7: ( bot )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==NAME) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:31:7: bot
                    	    {
                    	    pushFollow(FOLLOW_bot_in_pr101);
                    	    bot3=bot();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, bot3.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:31:14: bot EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bot_in_pr106);
                    bot4=bot();

                    state._fsp--;

                    adaptor.addChild(root_0, bot4.getTree());
                    EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_pr108); 
                    EOF5_tree = (CommonTree)adaptor.create(EOF5);
                    adaptor.addChild(root_0, EOF5_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pr"

    public static class bot_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bot"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:34:1: bot : NAME '{' ( personality | behaviour )* '}' ;
    public final SAFgrammarParser.bot_return bot() throws RecognitionException {
        SAFgrammarParser.bot_return retval = new SAFgrammarParser.bot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NAME6=null;
        Token char_literal7=null;
        Token char_literal10=null;
        SAFgrammarParser.personality_return personality8 = null;

        SAFgrammarParser.behaviour_return behaviour9 = null;


        CommonTree NAME6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree char_literal10_tree=null;

        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:35:2: ( NAME '{' ( personality | behaviour )* '}' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:35:7: NAME '{' ( personality | behaviour )* '}'
            {
            root_0 = (CommonTree)adaptor.nil();

            NAME6=(Token)match(input,NAME,FOLLOW_NAME_in_bot123); 
            NAME6_tree = (CommonTree)adaptor.create(NAME6);
            root_0 = (CommonTree)adaptor.becomeRoot(NAME6_tree, root_0);

            char_literal7=(Token)match(input,14,FOLLOW_14_in_bot126); 
            char_literal7_tree = (CommonTree)adaptor.create(char_literal7);
            adaptor.addChild(root_0, char_literal7_tree);

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:35:17: ( personality | behaviour )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=21 && LA3_0<=24)) ) {
                    alt3=1;
                }
                else if ( (LA3_0==CONDITION) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:35:18: personality
            	    {
            	    pushFollow(FOLLOW_personality_in_bot129);
            	    personality8=personality();

            	    state._fsp--;

            	    adaptor.addChild(root_0, personality8.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:35:32: behaviour
            	    {
            	    pushFollow(FOLLOW_behaviour_in_bot133);
            	    behaviour9=behaviour();

            	    state._fsp--;

            	    adaptor.addChild(root_0, behaviour9.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal10=(Token)match(input,15,FOLLOW_15_in_bot137); 
            char_literal10_tree = (CommonTree)adaptor.create(char_literal10);
            adaptor.addChild(root_0, char_literal10_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bot"

    public static class behaviour_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "behaviour"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:42:1: behaviour : action -> ^( BEHAVIOUR action ) ;
    public final SAFgrammarParser.behaviour_return behaviour() throws RecognitionException {
        SAFgrammarParser.behaviour_return retval = new SAFgrammarParser.behaviour_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SAFgrammarParser.action_return action11 = null;


        RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:42:10: ( action -> ^( BEHAVIOUR action ) )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:43:2: action
            {
            pushFollow(FOLLOW_action_in_behaviour179);
            action11=action();

            state._fsp--;

            stream_action.add(action11.getTree());


            // AST REWRITE
            // elements: action
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 43:9: -> ^( BEHAVIOUR action )
            {
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:43:12: ^( BEHAVIOUR action )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BEHAVIOUR, "BEHAVIOUR"), root_1);

                adaptor.addChild(root_1, stream_action.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "behaviour"

    public static class personality_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "personality"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:45:1: personality : character -> ^( CHARACTERISTIC character ) ;
    public final SAFgrammarParser.personality_return personality() throws RecognitionException {
        SAFgrammarParser.personality_return retval = new SAFgrammarParser.personality_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SAFgrammarParser.character_return character12 = null;


        RewriteRuleSubtreeStream stream_character=new RewriteRuleSubtreeStream(adaptor,"rule character");
        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:45:12: ( character -> ^( CHARACTERISTIC character ) )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:46:2: character
            {
            pushFollow(FOLLOW_character_in_personality197);
            character12=character();

            state._fsp--;

            stream_character.add(character12.getTree());


            // AST REWRITE
            // elements: character
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 46:12: -> ^( CHARACTERISTIC character )
            {
                // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:46:15: ^( CHARACTERISTIC character )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHARACTERISTIC, "CHARACTERISTIC"), root_1);

                adaptor.addChild(root_1, stream_character.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "personality"

    public static class action_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:48:1: action : CONDITION '[' ( MOVE | movechoice | FIGHT | fightchoice ) ( FIGHT | fightchoice | MOVE | movechoice ) ']' ;
    public final SAFgrammarParser.action_return action() throws RecognitionException {
        SAFgrammarParser.action_return retval = new SAFgrammarParser.action_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONDITION13=null;
        Token char_literal14=null;
        Token MOVE15=null;
        Token FIGHT17=null;
        Token FIGHT19=null;
        Token MOVE21=null;
        Token char_literal23=null;
        SAFgrammarParser.movechoice_return movechoice16 = null;

        SAFgrammarParser.fightchoice_return fightchoice18 = null;

        SAFgrammarParser.fightchoice_return fightchoice20 = null;

        SAFgrammarParser.movechoice_return movechoice22 = null;


        CommonTree CONDITION13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree MOVE15_tree=null;
        CommonTree FIGHT17_tree=null;
        CommonTree FIGHT19_tree=null;
        CommonTree MOVE21_tree=null;
        CommonTree char_literal23_tree=null;

        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:48:7: ( CONDITION '[' ( MOVE | movechoice | FIGHT | fightchoice ) ( FIGHT | fightchoice | MOVE | movechoice ) ']' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:49:2: CONDITION '[' ( MOVE | movechoice | FIGHT | fightchoice ) ( FIGHT | fightchoice | MOVE | movechoice ) ']'
            {
            root_0 = (CommonTree)adaptor.nil();

            CONDITION13=(Token)match(input,CONDITION,FOLLOW_CONDITION_in_action214); 
            CONDITION13_tree = (CommonTree)adaptor.create(CONDITION13);
            adaptor.addChild(root_0, CONDITION13_tree);

            char_literal14=(Token)match(input,16,FOLLOW_16_in_action216); 
            char_literal14_tree = (CommonTree)adaptor.create(char_literal14);
            adaptor.addChild(root_0, char_literal14_tree);

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:49:16: ( MOVE | movechoice | FIGHT | fightchoice )
            int alt4=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==19) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==FIGHT) ) {
                        alt4=4;
                    }
                    else if ( (LA4_4==MOVE) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case FIGHT:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:49:18: MOVE
                    {
                    MOVE15=(Token)match(input,MOVE,FOLLOW_MOVE_in_action220); 
                    MOVE15_tree = (CommonTree)adaptor.create(MOVE15);
                    adaptor.addChild(root_0, MOVE15_tree);


                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:49:25: movechoice
                    {
                    pushFollow(FOLLOW_movechoice_in_action224);
                    movechoice16=movechoice();

                    state._fsp--;

                    adaptor.addChild(root_0, movechoice16.getTree());

                    }
                    break;
                case 3 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:49:38: FIGHT
                    {
                    FIGHT17=(Token)match(input,FIGHT,FOLLOW_FIGHT_in_action228); 
                    FIGHT17_tree = (CommonTree)adaptor.create(FIGHT17);
                    adaptor.addChild(root_0, FIGHT17_tree);


                    }
                    break;
                case 4 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:49:45: fightchoice
                    {
                    pushFollow(FOLLOW_fightchoice_in_action231);
                    fightchoice18=fightchoice();

                    state._fsp--;

                    adaptor.addChild(root_0, fightchoice18.getTree());

                    }
                    break;

            }

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:49:60: ( FIGHT | fightchoice | MOVE | movechoice )
            int alt5=4;
            switch ( input.LA(1) ) {
            case FIGHT:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==19) ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==FIGHT) ) {
                        alt5=2;
                    }
                    else if ( (LA5_4==MOVE) ) {
                        alt5=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case MOVE:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:49:61: FIGHT
                    {
                    FIGHT19=(Token)match(input,FIGHT,FOLLOW_FIGHT_in_action237); 
                    FIGHT19_tree = (CommonTree)adaptor.create(FIGHT19);
                    adaptor.addChild(root_0, FIGHT19_tree);


                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:49:69: fightchoice
                    {
                    pushFollow(FOLLOW_fightchoice_in_action241);
                    fightchoice20=fightchoice();

                    state._fsp--;

                    adaptor.addChild(root_0, fightchoice20.getTree());

                    }
                    break;
                case 3 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:49:83: MOVE
                    {
                    MOVE21=(Token)match(input,MOVE,FOLLOW_MOVE_in_action245); 
                    MOVE21_tree = (CommonTree)adaptor.create(MOVE21);
                    adaptor.addChild(root_0, MOVE21_tree);


                    }
                    break;
                case 4 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:49:90: movechoice
                    {
                    pushFollow(FOLLOW_movechoice_in_action249);
                    movechoice22=movechoice();

                    state._fsp--;

                    adaptor.addChild(root_0, movechoice22.getTree());

                    }
                    break;

            }

            char_literal23=(Token)match(input,17,FOLLOW_17_in_action254); 
            char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
            adaptor.addChild(root_0, char_literal23_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "action"

    public static class movechoice_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "movechoice"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:53:1: movechoice : 'choose' '(' ( MOVE ( MOVE )+ ) ')' ;
    public final SAFgrammarParser.movechoice_return movechoice() throws RecognitionException {
        SAFgrammarParser.movechoice_return retval = new SAFgrammarParser.movechoice_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal24=null;
        Token char_literal25=null;
        Token MOVE26=null;
        Token MOVE27=null;
        Token char_literal28=null;

        CommonTree string_literal24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree MOVE26_tree=null;
        CommonTree MOVE27_tree=null;
        CommonTree char_literal28_tree=null;

        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:53:11: ( 'choose' '(' ( MOVE ( MOVE )+ ) ')' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:54:2: 'choose' '(' ( MOVE ( MOVE )+ ) ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal24=(Token)match(input,18,FOLLOW_18_in_movechoice267); 
            string_literal24_tree = (CommonTree)adaptor.create(string_literal24);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal24_tree, root_0);

            char_literal25=(Token)match(input,19,FOLLOW_19_in_movechoice270); 
            char_literal25_tree = (CommonTree)adaptor.create(char_literal25);
            adaptor.addChild(root_0, char_literal25_tree);

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:54:16: ( MOVE ( MOVE )+ )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:54:18: MOVE ( MOVE )+
            {
            MOVE26=(Token)match(input,MOVE,FOLLOW_MOVE_in_movechoice274); 
            MOVE26_tree = (CommonTree)adaptor.create(MOVE26);
            adaptor.addChild(root_0, MOVE26_tree);

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:54:23: ( MOVE )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MOVE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:54:23: MOVE
            	    {
            	    MOVE27=(Token)match(input,MOVE,FOLLOW_MOVE_in_movechoice276); 
            	    MOVE27_tree = (CommonTree)adaptor.create(MOVE27);
            	    adaptor.addChild(root_0, MOVE27_tree);


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


            }

            char_literal28=(Token)match(input,20,FOLLOW_20_in_movechoice280); 
            char_literal28_tree = (CommonTree)adaptor.create(char_literal28);
            adaptor.addChild(root_0, char_literal28_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "movechoice"

    public static class fightchoice_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fightchoice"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:56:1: fightchoice : 'choose' '(' FIGHT ( FIGHT )+ ')' ;
    public final SAFgrammarParser.fightchoice_return fightchoice() throws RecognitionException {
        SAFgrammarParser.fightchoice_return retval = new SAFgrammarParser.fightchoice_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal29=null;
        Token char_literal30=null;
        Token FIGHT31=null;
        Token FIGHT32=null;
        Token char_literal33=null;

        CommonTree string_literal29_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree FIGHT31_tree=null;
        CommonTree FIGHT32_tree=null;
        CommonTree char_literal33_tree=null;

        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:56:12: ( 'choose' '(' FIGHT ( FIGHT )+ ')' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:57:2: 'choose' '(' FIGHT ( FIGHT )+ ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal29=(Token)match(input,18,FOLLOW_18_in_fightchoice289); 
            string_literal29_tree = (CommonTree)adaptor.create(string_literal29);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal29_tree, root_0);

            char_literal30=(Token)match(input,19,FOLLOW_19_in_fightchoice292); 
            char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
            adaptor.addChild(root_0, char_literal30_tree);

            FIGHT31=(Token)match(input,FIGHT,FOLLOW_FIGHT_in_fightchoice294); 
            FIGHT31_tree = (CommonTree)adaptor.create(FIGHT31);
            adaptor.addChild(root_0, FIGHT31_tree);

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:57:22: ( FIGHT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==FIGHT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:57:22: FIGHT
            	    {
            	    FIGHT32=(Token)match(input,FIGHT,FOLLOW_FIGHT_in_fightchoice296); 
            	    FIGHT32_tree = (CommonTree)adaptor.create(FIGHT32);
            	    adaptor.addChild(root_0, FIGHT32_tree);


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

            char_literal33=(Token)match(input,20,FOLLOW_20_in_fightchoice300); 
            char_literal33_tree = (CommonTree)adaptor.create(char_literal33);
            adaptor.addChild(root_0, char_literal33_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fightchoice"

    public static class character_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "character"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:69:1: character : ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' ) '=' DIGIT ;
    public final SAFgrammarParser.character_return character() throws RecognitionException {
        SAFgrammarParser.character_return retval = new SAFgrammarParser.character_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set34=null;
        Token char_literal35=null;
        Token DIGIT36=null;

        CommonTree set34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree DIGIT36_tree=null;

        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:69:10: ( ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' ) '=' DIGIT )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:70:2: ( 'punchReach' | 'punchPower' | 'kickReach' | 'kickPower' ) '=' DIGIT
            {
            root_0 = (CommonTree)adaptor.nil();

            set34=(Token)input.LT(1);
            if ( (input.LA(1)>=21 && input.LA(1)<=24) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set34));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            char_literal35=(Token)match(input,25,FOLLOW_25_in_character408); 
            char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
            adaptor.addChild(root_0, char_literal35_tree);

            DIGIT36=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_character410); 
            DIGIT36_tree = (CommonTree)adaptor.create(DIGIT36);
            adaptor.addChild(root_0, DIGIT36_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "character"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\41\uffff";
    static final String DFA2_eofS =
        "\5\uffff\1\10\2\uffff\1\16\30\uffff";
    static final String DFA2_minS =
        "\1\10\1\16\1\11\1\31\1\20\1\10\1\14\1\12\1\0\1\uffff\1\11\1\12\1"+
        "\23\1\12\1\uffff\1\21\1\23\1\21\1\12\1\11\1\12\1\13\1\12\1\13\1"+
        "\12\1\13\1\12\1\13\3\12\2\21";
    static final String DFA2_maxS =
        "\1\10\1\16\1\30\1\31\1\20\1\10\1\14\1\22\1\0\1\uffff\1\30\1\22\1"+
        "\23\1\22\1\uffff\1\21\1\23\1\21\1\13\1\30\2\13\1\12\1\13\1\12\4"+
        "\24\2\22\2\21";
    static final String DFA2_acceptS =
        "\11\uffff\1\1\4\uffff\1\2\22\uffff";
    static final String DFA2_specialS =
        "\41\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\5\uffff\1\5\5\uffff\4\3",
            "\1\6",
            "\1\7",
            "\1\11",
            "\1\12",
            "\1\13\1\15\6\uffff\1\14",
            "\1\uffff",
            "",
            "\1\4\5\uffff\1\5\5\uffff\4\3",
            "\1\21\1\17\6\uffff\1\20",
            "\1\22",
            "\1\21\1\17\6\uffff\1\20",
            "",
            "\1\23",
            "\1\24",
            "\1\23",
            "\1\26\1\25",
            "\1\4\5\uffff\1\5\5\uffff\4\3",
            "\1\30\1\27",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\31\10\uffff\1\35",
            "\1\32\11\uffff\1\36",
            "\1\33\10\uffff\1\37",
            "\1\34\11\uffff\1\40",
            "\1\21\1\17\6\uffff\1\20",
            "\1\21\1\17\6\uffff\1\20",
            "\1\23",
            "\1\23"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "29:1: pr : ( bot ( bot )* | bot EOF );";
        }
    }
 

    public static final BitSet FOLLOW_pr_in_program80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bot_in_pr99 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_bot_in_pr101 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_bot_in_pr106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_pr108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_bot123 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_bot126 = new BitSet(new long[]{0x0000000001E08200L});
    public static final BitSet FOLLOW_personality_in_bot129 = new BitSet(new long[]{0x0000000001E08200L});
    public static final BitSet FOLLOW_behaviour_in_bot133 = new BitSet(new long[]{0x0000000001E08200L});
    public static final BitSet FOLLOW_15_in_bot137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_behaviour179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_personality197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_in_action214 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_action216 = new BitSet(new long[]{0x0000000000040C00L});
    public static final BitSet FOLLOW_MOVE_in_action220 = new BitSet(new long[]{0x0000000000040C00L});
    public static final BitSet FOLLOW_movechoice_in_action224 = new BitSet(new long[]{0x0000000000040C00L});
    public static final BitSet FOLLOW_FIGHT_in_action228 = new BitSet(new long[]{0x0000000000040C00L});
    public static final BitSet FOLLOW_fightchoice_in_action231 = new BitSet(new long[]{0x0000000000040C00L});
    public static final BitSet FOLLOW_FIGHT_in_action237 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_fightchoice_in_action241 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_MOVE_in_action245 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_movechoice_in_action249 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_action254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_movechoice267 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_movechoice270 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_MOVE_in_movechoice274 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_MOVE_in_movechoice276 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_20_in_movechoice280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_fightchoice289 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_fightchoice292 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_FIGHT_in_fightchoice294 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_FIGHT_in_fightchoice296 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_20_in_fightchoice300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_character392 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_character408 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DIGIT_in_character410 = new BitSet(new long[]{0x0000000000000002L});

}