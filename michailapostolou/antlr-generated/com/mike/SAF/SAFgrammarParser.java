// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g 2012-02-21 16:21:56

  package com.mike.SAF;
  import game.*;
  import com.mike.SAF.Behavior;
  import com.mike.SAF.Bot;
  import messages.*;
  import java.lang.Integer;
  import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SAFgrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NAME", "ATTRIBUTE", "DIGIT", "MOVE", "FIGHT", "CONDITION", "AND", "OR", "WS", "'{'", "'}'", "'='", "'['", "']'", "'choose'", "'('", "')'"
    };
    public static final int T__20=20;
    public static final int ATTRIBUTE=5;
    public static final int CONDITION=9;
    public static final int AND=10;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int NAME=4;
    public static final int WS=12;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int FIGHT=8;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int MOVE=7;
    public static final int T__13=13;
    public static final int OR=11;
    public static final int DIGIT=6;

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


        public ArrayList<Message> errors = new ArrayList<Message>();
        
        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String errorToken = e.token.getText();
            if(errorToken.equals("["))
            	errors.add(new ConditionMessage(e.line,e.charPositionInLine));
           	else if(errorToken.equals(")"))
           		errors.add(new ChoiceMessage(e.line,e.charPositionInLine));
       		else
       			errors.add(new IdentifierMessage(errorToken,e.line,e.charPositionInLine));
        }
        
        public void printErrors() {
            for(Message error:errors)
            	System.out.println(error.getMessage());
        }
        
        public boolean compileSuccesful(){
       		return errors.size()==0?true:false;
       	}


    public static class program_return extends ParserRuleReturnScope {
        public Game g;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:53:1: program returns [Game g] : (b1= bot (b2= bot )* | b3= bot EOF );
    public final SAFgrammarParser.program_return program() throws RecognitionException {
        SAFgrammarParser.program_return retval = new SAFgrammarParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF1=null;
        SAFgrammarParser.bot_return b1 = null;

        SAFgrammarParser.bot_return b2 = null;

        SAFgrammarParser.bot_return b3 = null;


        Object EOF1_tree=null;

        retval.g = new Game(errors);
        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:54:2: (b1= bot (b2= bot )* | b3= bot EOF )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:55:3: b1= bot (b2= bot )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bot_in_program73);
                    b1=bot();

                    state._fsp--;

                    adaptor.addChild(root_0, b1.getTree());
                    retval.g.loadBrain((b1!=null?b1.bot:null));
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:55:36: (b2= bot )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==NAME) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:55:36: b2= bot
                    	    {
                    	    pushFollow(FOLLOW_bot_in_program78);
                    	    b2=bot();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, b2.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    retval.g.loadBrain((b2!=null?b2.bot:null));

                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:55:69: b3= bot EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bot_in_program87);
                    b3=bot();

                    state._fsp--;

                    adaptor.addChild(root_0, b3.getTree());
                    retval.g.loadBrain((b3!=null?b3.bot:null));retval.g.start();
                    EOF1=(Token)match(input,EOF,FOLLOW_EOF_in_program91); 
                    EOF1_tree = (Object)adaptor.create(EOF1);
                    adaptor.addChild(root_0, EOF1_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class bot_return extends ParserRuleReturnScope {
        public Bot bot;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bot"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:58:1: bot returns [Bot bot] : NAME '{' ( personality | b= behavior )* '}' ;
    public final SAFgrammarParser.bot_return bot() throws RecognitionException {
        SAFgrammarParser.bot_return retval = new SAFgrammarParser.bot_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME2=null;
        Token char_literal3=null;
        Token char_literal5=null;
        SAFgrammarParser.behavior_return b = null;

        SAFgrammarParser.personality_return personality4 = null;


        Object NAME2_tree=null;
        Object char_literal3_tree=null;
        Object char_literal5_tree=null;

         retval.bot = new Bot();
        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:59:2: ( NAME '{' ( personality | b= behavior )* '}' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:60:6: NAME '{' ( personality | b= behavior )* '}'
            {
            root_0 = (Object)adaptor.nil();

            NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_bot116); 
            NAME2_tree = (Object)adaptor.create(NAME2);
            adaptor.addChild(root_0, NAME2_tree);

            retval.bot.setBotName(NAME2.getText());
            char_literal3=(Token)match(input,13,FOLLOW_13_in_bot119); 
            char_literal3_tree = (Object)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:60:50: ( personality | b= behavior )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ATTRIBUTE) ) {
                    alt3=1;
                }
                else if ( (LA3_0==CONDITION) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:60:51: personality
            	    {
            	    pushFollow(FOLLOW_personality_in_bot122);
            	    personality4=personality();

            	    state._fsp--;

            	    adaptor.addChild(root_0, personality4.getTree());
            	    retval.bot.addAttribute((personality4!=null?personality4.a:null));

            	    }
            	    break;
            	case 2 :
            	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:60:101: b= behavior
            	    {
            	    pushFollow(FOLLOW_behavior_in_bot131);
            	    b=behavior();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());
            	    retval.bot.addBehavior((b!=null?b.behaviors:null));

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal5=(Token)match(input,14,FOLLOW_14_in_bot136); 
            char_literal5_tree = (Object)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bot"

    public static class personality_return extends ParserRuleReturnScope {
        public Attribute a;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "personality"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:65:1: personality returns [Attribute a] : ATTRIBUTE '=' DIGIT ;
    public final SAFgrammarParser.personality_return personality() throws RecognitionException {
        SAFgrammarParser.personality_return retval = new SAFgrammarParser.personality_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ATTRIBUTE6=null;
        Token char_literal7=null;
        Token DIGIT8=null;

        Object ATTRIBUTE6_tree=null;
        Object char_literal7_tree=null;
        Object DIGIT8_tree=null;

        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:65:33: ( ATTRIBUTE '=' DIGIT )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:66:2: ATTRIBUTE '=' DIGIT
            {
            root_0 = (Object)adaptor.nil();

            ATTRIBUTE6=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_personality152); 
            ATTRIBUTE6_tree = (Object)adaptor.create(ATTRIBUTE6);
            adaptor.addChild(root_0, ATTRIBUTE6_tree);

            char_literal7=(Token)match(input,15,FOLLOW_15_in_personality154); 
            char_literal7_tree = (Object)adaptor.create(char_literal7);
            adaptor.addChild(root_0, char_literal7_tree);

            DIGIT8=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_personality156); 
            DIGIT8_tree = (Object)adaptor.create(DIGIT8);
            adaptor.addChild(root_0, DIGIT8_tree);

            retval.a = new Attribute(ATTRIBUTE6.getText(),Integer.parseInt(DIGIT8.getText()));

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "personality"

    public static class behavior_return extends ParserRuleReturnScope {
        public ArrayList<Behavior> behaviors;
        public boolean mCb;
        public boolean fCb;
        public boolean m1b;
        public boolean f1b;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "behavior"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:69:1: behavior returns [ArrayList<Behavior> behaviors,boolean mCb,boolean fCb,boolean m1b,boolean f1b] : bList= or_condition '[' (v1= MOVE | v2= movechoice ) (v3= FIGHT | v4= fightchoice ) ']' ;
    public final SAFgrammarParser.behavior_return behavior() throws RecognitionException {
        SAFgrammarParser.behavior_return retval = new SAFgrammarParser.behavior_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v1=null;
        Token v3=null;
        Token char_literal9=null;
        Token char_literal10=null;
        SAFgrammarParser.or_condition_return bList = null;

        SAFgrammarParser.movechoice_return v2 = null;

        SAFgrammarParser.fightchoice_return v4 = null;


        Object v1_tree=null;
        Object v3_tree=null;
        Object char_literal9_tree=null;
        Object char_literal10_tree=null;

        retval.mCb = false; retval.fCb = false;retval.f1b = false;retval.m1b = false;
        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:70:2: (bList= or_condition '[' (v1= MOVE | v2= movechoice ) (v3= FIGHT | v4= fightchoice ) ']' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:71:3: bList= or_condition '[' (v1= MOVE | v2= movechoice ) (v3= FIGHT | v4= fightchoice ) ']'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_condition_in_behavior183);
            bList=or_condition();

            state._fsp--;

            adaptor.addChild(root_0, bList.getTree());
            char_literal9=(Token)match(input,16,FOLLOW_16_in_behavior185); 
            char_literal9_tree = (Object)adaptor.create(char_literal9);
            adaptor.addChild(root_0, char_literal9_tree);

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:71:28: (v1= MOVE | v2= movechoice )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==MOVE) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:71:30: v1= MOVE
                    {
                    v1=(Token)match(input,MOVE,FOLLOW_MOVE_in_behavior191); 
                    v1_tree = (Object)adaptor.create(v1);
                    adaptor.addChild(root_0, v1_tree);

                    retval.m1b = true;

                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:71:54: v2= movechoice
                    {
                    pushFollow(FOLLOW_movechoice_in_behavior198);
                    v2=movechoice();

                    state._fsp--;

                    adaptor.addChild(root_0, v2.getTree());
                    retval.mCb = true;

                    }
                    break;

            }

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:71:85: (v3= FIGHT | v4= fightchoice )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==FIGHT) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:71:86: v3= FIGHT
                    {
                    v3=(Token)match(input,FIGHT,FOLLOW_FIGHT_in_behavior207); 
                    v3_tree = (Object)adaptor.create(v3);
                    adaptor.addChild(root_0, v3_tree);

                    retval.f1b = true;

                    }
                    break;
                case 2 :
                    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:71:111: v4= fightchoice
                    {
                    pushFollow(FOLLOW_fightchoice_in_behavior214);
                    v4=fightchoice();

                    state._fsp--;

                    adaptor.addChild(root_0, v4.getTree());
                    retval.fCb = true;

                    }
                    break;

            }

            char_literal10=(Token)match(input,17,FOLLOW_17_in_behavior220); 
            char_literal10_tree = (Object)adaptor.create(char_literal10);
            adaptor.addChild(root_0, char_literal10_tree);


            			for(int i=0; i<(bList!=null?bList.behaviorList:null).size(); i++)
            			{
            				Behavior behav = (Behavior)(bList!=null?bList.behaviorList:null).get(i);
            				if(retval.m1b)	
            					behav.addMove(v1.getText());
            				if(retval.mCb)
            					behav.addMove((v2!=null?v2.mv:null));
            				if(retval.f1b)
            					behav.addFight_move(v3.getText());
            				if(retval.fCb)
            					behav.addFight_move((v4!=null?v4.f:null));
            			}
            			retval.behaviors = (bList!=null?bList.behaviorList:null);
            		

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "behavior"

    public static class condition_return extends ParserRuleReturnScope {
        public Behavior behavior;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:89:1: condition returns [Behavior behavior] : (c1= CONDITION ) ( AND c2= CONDITION )* ;
    public final SAFgrammarParser.condition_return condition() throws RecognitionException {
        SAFgrammarParser.condition_return retval = new SAFgrammarParser.condition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token c1=null;
        Token c2=null;
        Token AND11=null;

        Object c1_tree=null;
        Object c2_tree=null;
        Object AND11_tree=null;

        retval.behavior = new Behavior();
        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:90:2: ( (c1= CONDITION ) ( AND c2= CONDITION )* )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:91:3: (c1= CONDITION ) ( AND c2= CONDITION )*
            {
            root_0 = (Object)adaptor.nil();

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:91:3: (c1= CONDITION )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:91:5: c1= CONDITION
            {
            c1=(Token)match(input,CONDITION,FOLLOW_CONDITION_in_condition251); 
            c1_tree = (Object)adaptor.create(c1);
            adaptor.addChild(root_0, c1_tree);

            retval.behavior.addCondition(c1.getText());

            }

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:91:60: ( AND c2= CONDITION )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==AND) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:91:61: AND c2= CONDITION
            	    {
            	    AND11=(Token)match(input,AND,FOLLOW_AND_in_condition257); 
            	    AND11_tree = (Object)adaptor.create(AND11);
            	    adaptor.addChild(root_0, AND11_tree);

            	    c2=(Token)match(input,CONDITION,FOLLOW_CONDITION_in_condition261); 
            	    c2_tree = (Object)adaptor.create(c2);
            	    adaptor.addChild(root_0, c2_tree);

            	    retval.behavior.addCondition(c2.getText());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition"

    public static class or_condition_return extends ParserRuleReturnScope {
        public ArrayList<Behavior> behaviorList;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_condition"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:94:1: or_condition returns [ArrayList<Behavior> behaviorList] : cs1= condition ( OR cs2= condition )* ;
    public final SAFgrammarParser.or_condition_return or_condition() throws RecognitionException {
        SAFgrammarParser.or_condition_return retval = new SAFgrammarParser.or_condition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR12=null;
        SAFgrammarParser.condition_return cs1 = null;

        SAFgrammarParser.condition_return cs2 = null;


        Object OR12_tree=null;

         retval.behaviorList = new ArrayList<Behavior>();
        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:95:2: (cs1= condition ( OR cs2= condition )* )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:96:3: cs1= condition ( OR cs2= condition )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condition_in_or_condition290);
            cs1=condition();

            state._fsp--;

            adaptor.addChild(root_0, cs1.getTree());
            retval.behaviorList.add((cs1!=null?cs1.behavior:null));
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:98:2: ( OR cs2= condition )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==OR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:98:4: OR cs2= condition
            	    {
            	    OR12=(Token)match(input,OR,FOLLOW_OR_in_or_condition298); 
            	    OR12_tree = (Object)adaptor.create(OR12);
            	    adaptor.addChild(root_0, OR12_tree);

            	    pushFollow(FOLLOW_condition_in_or_condition302);
            	    cs2=condition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cs2.getTree());
            	    retval.behaviorList.add((cs2!=null?cs2.behavior:null));

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "or_condition"

    public static class movechoice_return extends ParserRuleReturnScope {
        public ArrayList<String> mv;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "movechoice"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:103:1: movechoice returns [ArrayList<String> mv] : 'choose' '(' (m1= MOVE ) (m2= MOVE ) ')' ;
    public final SAFgrammarParser.movechoice_return movechoice() throws RecognitionException {
        SAFgrammarParser.movechoice_return retval = new SAFgrammarParser.movechoice_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token m1=null;
        Token m2=null;
        Token string_literal13=null;
        Token char_literal14=null;
        Token char_literal15=null;

        Object m1_tree=null;
        Object m2_tree=null;
        Object string_literal13_tree=null;
        Object char_literal14_tree=null;
        Object char_literal15_tree=null;

        retval.mv = new ArrayList<String>();
        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:104:2: ( 'choose' '(' (m1= MOVE ) (m2= MOVE ) ')' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:105:2: 'choose' '(' (m1= MOVE ) (m2= MOVE ) ')'
            {
            root_0 = (Object)adaptor.nil();

            string_literal13=(Token)match(input,18,FOLLOW_18_in_movechoice331); 
            string_literal13_tree = (Object)adaptor.create(string_literal13);
            root_0 = (Object)adaptor.becomeRoot(string_literal13_tree, root_0);

            char_literal14=(Token)match(input,19,FOLLOW_19_in_movechoice334); 
            char_literal14_tree = (Object)adaptor.create(char_literal14);
            adaptor.addChild(root_0, char_literal14_tree);

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:105:16: (m1= MOVE )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:105:18: m1= MOVE
            {
            m1=(Token)match(input,MOVE,FOLLOW_MOVE_in_movechoice342); 
            m1_tree = (Object)adaptor.create(m1);
            adaptor.addChild(root_0, m1_tree);

            System.out.println(m1.getText()); retval.mv.add(m1.getText()); 

            }

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:105:91: (m2= MOVE )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:105:92: m2= MOVE
            {
            m2=(Token)match(input,MOVE,FOLLOW_MOVE_in_movechoice352); 
            m2_tree = (Object)adaptor.create(m2);
            adaptor.addChild(root_0, m2_tree);

            retval.mv.add(m2.getText());

            }

            char_literal15=(Token)match(input,20,FOLLOW_20_in_movechoice356); 
            char_literal15_tree = (Object)adaptor.create(char_literal15);
            adaptor.addChild(root_0, char_literal15_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "movechoice"

    public static class fightchoice_return extends ParserRuleReturnScope {
        public ArrayList<String> f;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fightchoice"
    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:107:1: fightchoice returns [ArrayList<String> f] : 'choose' '(' (f1= FIGHT ) (f2= FIGHT )+ ')' ;
    public final SAFgrammarParser.fightchoice_return fightchoice() throws RecognitionException {
        SAFgrammarParser.fightchoice_return retval = new SAFgrammarParser.fightchoice_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token f1=null;
        Token f2=null;
        Token string_literal16=null;
        Token char_literal17=null;
        Token char_literal18=null;

        Object f1_tree=null;
        Object f2_tree=null;
        Object string_literal16_tree=null;
        Object char_literal17_tree=null;
        Object char_literal18_tree=null;

        retval.f = new ArrayList<String>();
        try {
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:107:78: ( 'choose' '(' (f1= FIGHT ) (f2= FIGHT )+ ')' )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:108:2: 'choose' '(' (f1= FIGHT ) (f2= FIGHT )+ ')'
            {
            root_0 = (Object)adaptor.nil();

            string_literal16=(Token)match(input,18,FOLLOW_18_in_fightchoice372); 
            string_literal16_tree = (Object)adaptor.create(string_literal16);
            root_0 = (Object)adaptor.becomeRoot(string_literal16_tree, root_0);

            char_literal17=(Token)match(input,19,FOLLOW_19_in_fightchoice375); 
            char_literal17_tree = (Object)adaptor.create(char_literal17);
            adaptor.addChild(root_0, char_literal17_tree);

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:108:16: (f1= FIGHT )
            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:108:17: f1= FIGHT
            {
            f1=(Token)match(input,FIGHT,FOLLOW_FIGHT_in_fightchoice380); 
            f1_tree = (Object)adaptor.create(f1);
            adaptor.addChild(root_0, f1_tree);

             retval.f.add(f1.getText()); 

            }

            // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:108:54: (f2= FIGHT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==FIGHT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/micapo2607/Documents/workspace/SAF/src/com/mike/SAF/SAFgrammar.g:108:55: f2= FIGHT
            	    {
            	    f2=(Token)match(input,FIGHT,FOLLOW_FIGHT_in_fightchoice388); 
            	    f2_tree = (Object)adaptor.create(f2);
            	    adaptor.addChild(root_0, f2_tree);

            	     retval.f.add(f2.getText()); 

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

            char_literal18=(Token)match(input,20,FOLLOW_20_in_fightchoice394); 
            char_literal18_tree = (Object)adaptor.create(char_literal18);
            adaptor.addChild(root_0, char_literal18_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fightchoice"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\37\uffff";
    static final String DFA2_eofS =
        "\5\uffff\1\13\5\uffff\1\21\23\uffff";
    static final String DFA2_minS =
        "\1\4\1\15\1\5\1\17\1\12\1\4\1\6\2\11\1\7\1\uffff\1\0\1\5\2\12\1"+
        "\10\1\23\1\uffff\1\11\1\21\1\23\1\7\1\12\1\5\1\10\1\7\1\10\1\24"+
        "\2\10\1\21";
    static final String DFA2_maxS =
        "\1\4\1\15\1\16\1\17\1\20\1\4\1\6\2\11\1\22\1\uffff\1\0\1\16\2\20"+
        "\1\22\1\23\1\uffff\1\11\1\21\1\23\1\7\1\20\1\16\1\10\1\7\1\10\2"+
        "\24\1\22\1\21";
    static final String DFA2_acceptS =
        "\12\uffff\1\1\6\uffff\1\2\15\uffff";
    static final String DFA2_specialS =
        "\37\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\3\uffff\1\4\4\uffff\1\5",
            "\1\6",
            "\1\7\1\10\4\uffff\1\11",
            "\1\12",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17\12\uffff\1\20",
            "",
            "\1\uffff",
            "\1\3\3\uffff\1\4\4\uffff\1\5",
            "\1\7\1\10\4\uffff\1\11",
            "\1\22\1\10\4\uffff\1\11",
            "\1\23\11\uffff\1\24",
            "\1\25",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\22\1\10\4\uffff\1\11",
            "\1\3\3\uffff\1\4\4\uffff\1\5",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\34\13\uffff\1\36",
            "\1\23\11\uffff\1\24",
            "\1\27"
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
            return "53:1: program returns [Game g] : (b1= bot (b2= bot )* | b3= bot EOF );";
        }
    }
 

    public static final BitSet FOLLOW_bot_in_program73 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_bot_in_program78 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_bot_in_program87 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_bot116 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_bot119 = new BitSet(new long[]{0x0000000000004220L});
    public static final BitSet FOLLOW_personality_in_bot122 = new BitSet(new long[]{0x0000000000004220L});
    public static final BitSet FOLLOW_behavior_in_bot131 = new BitSet(new long[]{0x0000000000004220L});
    public static final BitSet FOLLOW_14_in_bot136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_personality152 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_personality154 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DIGIT_in_personality156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_condition_in_behavior183 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_behavior185 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_MOVE_in_behavior191 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_movechoice_in_behavior198 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_FIGHT_in_behavior207 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_fightchoice_in_behavior214 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_behavior220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_in_condition251 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_AND_in_condition257 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CONDITION_in_condition261 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_condition_in_or_condition290 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_OR_in_or_condition298 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_condition_in_or_condition302 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_18_in_movechoice331 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_movechoice334 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_MOVE_in_movechoice342 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_MOVE_in_movechoice352 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_movechoice356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_fightchoice372 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_fightchoice375 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FIGHT_in_fightchoice380 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FIGHT_in_fightchoice388 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_20_in_fightchoice394 = new BitSet(new long[]{0x0000000000000002L});

}