// $ANTLR 3.4 /Users/job/Programming/svn-sc/SAFParser.g 2012-01-24 11:11:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "ATTACK_TYPE", "CHOOSE", "CONDITION_TYPE", "DIGIT", "ID", "LEFT_BRACE", "LEFT_BRACKET", "LEFT_PAREN", "LOGICAL_OPERATOR", "MOVE_TYPE", "NEWLINE", "RIGHT_BRACE", "RIGHT_BRACKET", "RIGHT_PAREN", "STRENGTH", "WHITESPACE", "BEHAVIOUR", "CHARACTERISTIC", "CONDITION", "FIGHTACTION", "FIGHTER", "MOVEACTION", "NAME", "PERSONALITY", "RULE"
    };

    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int ATTACK_TYPE=5;
    public static final int CHOOSE=6;
    public static final int CONDITION_TYPE=7;
    public static final int DIGIT=8;
    public static final int ID=9;
    public static final int LEFT_BRACE=10;
    public static final int LEFT_BRACKET=11;
    public static final int LEFT_PAREN=12;
    public static final int LOGICAL_OPERATOR=13;
    public static final int MOVE_TYPE=14;
    public static final int NEWLINE=15;
    public static final int RIGHT_BRACE=16;
    public static final int RIGHT_BRACKET=17;
    public static final int RIGHT_PAREN=18;
    public static final int STRENGTH=19;
    public static final int WHITESPACE=20;
    public static final int BEHAVIOUR=21;
    public static final int CHARACTERISTIC=22;
    public static final int CONDITION=23;
    public static final int FIGHTACTION=24;
    public static final int FIGHTER=25;
    public static final int MOVEACTION=26;
    public static final int NAME=27;
    public static final int PERSONALITY=28;
    public static final int RULE=29;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "attack", "condition", "move", "name", "rule", "fighter", 
    "characteristic"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public SAFParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public SAFParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public SAFParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return SAFParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/job/Programming/svn-sc/SAFParser.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // /Users/job/Programming/svn-sc/SAFParser.g:21:1: fighter : name LEFT_BRACE ( characteristic | rule )+ RIGHT_BRACE -> ^( FIGHTER name ^( PERSONALITY ( characteristic )+ ) ^( BEHAVIOUR ( rule )+ ) ) ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACE2=null;
        Token RIGHT_BRACE5=null;
        SAFParser.name_return name1 =null;

        SAFParser.characteristic_return characteristic3 =null;

        SAFParser.rule_return rule4 =null;


        Object LEFT_BRACE2_tree=null;
        Object RIGHT_BRACE5_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_rule=new RewriteRuleSubtreeStream(adaptor,"rule rule");
        RewriteRuleSubtreeStream stream_characteristic=new RewriteRuleSubtreeStream(adaptor,"rule characteristic");
        try { dbg.enterRule(getGrammarFileName(), "fighter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:21:11: ( name LEFT_BRACE ( characteristic | rule )+ RIGHT_BRACE -> ^( FIGHTER name ^( PERSONALITY ( characteristic )+ ) ^( BEHAVIOUR ( rule )+ ) ) )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFParser.g:21:14: name LEFT_BRACE ( characteristic | rule )+ RIGHT_BRACE
            {
            dbg.location(21,14);
            pushFollow(FOLLOW_name_in_fighter79);
            name1=name();

            state._fsp--;

            stream_name.add(name1.getTree());
            dbg.location(21,19);
            LEFT_BRACE2=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_fighter81);  
            stream_LEFT_BRACE.add(LEFT_BRACE2);

            dbg.location(21,30);
            // /Users/job/Programming/svn-sc/SAFParser.g:21:30: ( characteristic | rule )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRENGTH) ) {
                    alt1=1;
                }
                else if ( (LA1_0==CONDITION_TYPE) ) {
                    alt1=2;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/job/Programming/svn-sc/SAFParser.g:21:31: characteristic
            	    {
            	    dbg.location(21,31);
            	    pushFollow(FOLLOW_characteristic_in_fighter84);
            	    characteristic3=characteristic();

            	    state._fsp--;

            	    stream_characteristic.add(characteristic3.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/job/Programming/svn-sc/SAFParser.g:21:48: rule
            	    {
            	    dbg.location(21,48);
            	    pushFollow(FOLLOW_rule_in_fighter88);
            	    rule4=rule();

            	    state._fsp--;

            	    stream_rule.add(rule4.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(21,55);
            RIGHT_BRACE5=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_fighter92);  
            stream_RIGHT_BRACE.add(RIGHT_BRACE5);


            // AST REWRITE
            // elements: characteristic, name, rule
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 21:67: -> ^( FIGHTER name ^( PERSONALITY ( characteristic )+ ) ^( BEHAVIOUR ( rule )+ ) )
            {
                dbg.location(21,70);
                // /Users/job/Programming/svn-sc/SAFParser.g:21:70: ^( FIGHTER name ^( PERSONALITY ( characteristic )+ ) ^( BEHAVIOUR ( rule )+ ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(21,72);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIGHTER, "FIGHTER")
                , root_1);

                dbg.location(21,80);
                adaptor.addChild(root_1, stream_name.nextTree());
                dbg.location(21,85);
                // /Users/job/Programming/svn-sc/SAFParser.g:21:85: ^( PERSONALITY ( characteristic )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(21,87);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PERSONALITY, "PERSONALITY")
                , root_2);

                dbg.location(21,99);
                if ( !(stream_characteristic.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_characteristic.hasNext() ) {
                    dbg.location(21,99);
                    adaptor.addChild(root_2, stream_characteristic.nextTree());

                }
                stream_characteristic.reset();

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(21,116);
                // /Users/job/Programming/svn-sc/SAFParser.g:21:116: ^( BEHAVIOUR ( rule )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(21,118);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BEHAVIOUR, "BEHAVIOUR")
                , root_2);

                dbg.location(21,128);
                if ( !(stream_rule.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_rule.hasNext() ) {
                    dbg.location(21,128);
                    adaptor.addChild(root_2, stream_rule.nextTree());

                }
                stream_rule.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
        	// do for sure before leaving
        }
        dbg.location(21, 134);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fighter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fighter"


    public static class name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // /Users/job/Programming/svn-sc/SAFParser.g:23:1: name : ID -> ^( NAME ID ) ;
    public final SAFParser.name_return name() throws RecognitionException {
        SAFParser.name_return retval = new SAFParser.name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID6=null;

        Object ID6_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try { dbg.enterRule(getGrammarFileName(), "name");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:23:8: ( ID -> ^( NAME ID ) )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFParser.g:23:10: ID
            {
            dbg.location(23,10);
            ID6=(Token)match(input,ID,FOLLOW_ID_in_name124);  
            stream_ID.add(ID6);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 23:13: -> ^( NAME ID )
            {
                dbg.location(23,16);
                // /Users/job/Programming/svn-sc/SAFParser.g:23:16: ^( NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(23,18);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAME, "NAME")
                , root_1);

                dbg.location(23,23);
                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
        	// do for sure before leaving
        }
        dbg.location(23, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "name");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "name"


    public static class characteristic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // /Users/job/Programming/svn-sc/SAFParser.g:25:1: characteristic : STRENGTH ASSIGN DIGIT -> ^( CHARACTERISTIC STRENGTH DIGIT ) ;
    public final SAFParser.characteristic_return characteristic() throws RecognitionException {
        SAFParser.characteristic_return retval = new SAFParser.characteristic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRENGTH7=null;
        Token ASSIGN8=null;
        Token DIGIT9=null;

        Object STRENGTH7_tree=null;
        Object ASSIGN8_tree=null;
        Object DIGIT9_tree=null;
        RewriteRuleTokenStream stream_DIGIT=new RewriteRuleTokenStream(adaptor,"token DIGIT");
        RewriteRuleTokenStream stream_STRENGTH=new RewriteRuleTokenStream(adaptor,"token STRENGTH");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try { dbg.enterRule(getGrammarFileName(), "characteristic");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:25:16: ( STRENGTH ASSIGN DIGIT -> ^( CHARACTERISTIC STRENGTH DIGIT ) )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFParser.g:25:18: STRENGTH ASSIGN DIGIT
            {
            dbg.location(25,18);
            STRENGTH7=(Token)match(input,STRENGTH,FOLLOW_STRENGTH_in_characteristic140);  
            stream_STRENGTH.add(STRENGTH7);

            dbg.location(25,27);
            ASSIGN8=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_characteristic142);  
            stream_ASSIGN.add(ASSIGN8);

            dbg.location(25,34);
            DIGIT9=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_characteristic144);  
            stream_DIGIT.add(DIGIT9);


            // AST REWRITE
            // elements: DIGIT, STRENGTH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 25:40: -> ^( CHARACTERISTIC STRENGTH DIGIT )
            {
                dbg.location(25,43);
                // /Users/job/Programming/svn-sc/SAFParser.g:25:43: ^( CHARACTERISTIC STRENGTH DIGIT )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(25,45);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHARACTERISTIC, "CHARACTERISTIC")
                , root_1);

                dbg.location(25,60);
                adaptor.addChild(root_1, 
                stream_STRENGTH.nextNode()
                );
                dbg.location(25,69);
                adaptor.addChild(root_1, 
                stream_DIGIT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
        	// do for sure before leaving
        }
        dbg.location(25, 74);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "characteristic");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "characteristic"


    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // /Users/job/Programming/svn-sc/SAFParser.g:27:1: rule : condition LEFT_BRACKET move attack RIGHT_BRACKET -> ^( RULE condition move attack ) ;
    public final SAFParser.rule_return rule() throws RecognitionException {
        SAFParser.rule_return retval = new SAFParser.rule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET11=null;
        Token RIGHT_BRACKET14=null;
        SAFParser.condition_return condition10 =null;

        SAFParser.move_return move12 =null;

        SAFParser.attack_return attack13 =null;


        Object LEFT_BRACKET11_tree=null;
        Object RIGHT_BRACKET14_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_attack=new RewriteRuleSubtreeStream(adaptor,"rule attack");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:27:8: ( condition LEFT_BRACKET move attack RIGHT_BRACKET -> ^( RULE condition move attack ) )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFParser.g:27:10: condition LEFT_BRACKET move attack RIGHT_BRACKET
            {
            dbg.location(27,10);
            pushFollow(FOLLOW_condition_in_rule165);
            condition10=condition();

            state._fsp--;

            stream_condition.add(condition10.getTree());
            dbg.location(27,20);
            LEFT_BRACKET11=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_rule167);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET11);

            dbg.location(27,33);
            pushFollow(FOLLOW_move_in_rule169);
            move12=move();

            state._fsp--;

            stream_move.add(move12.getTree());
            dbg.location(27,38);
            pushFollow(FOLLOW_attack_in_rule171);
            attack13=attack();

            state._fsp--;

            stream_attack.add(attack13.getTree());
            dbg.location(27,45);
            RIGHT_BRACKET14=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_rule173);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET14);


            // AST REWRITE
            // elements: condition, attack, move
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 27:59: -> ^( RULE condition move attack )
            {
                dbg.location(27,62);
                // /Users/job/Programming/svn-sc/SAFParser.g:27:62: ^( RULE condition move attack )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(27,64);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RULE, "RULE")
                , root_1);

                dbg.location(27,69);
                adaptor.addChild(root_1, stream_condition.nextTree());
                dbg.location(27,79);
                adaptor.addChild(root_1, stream_move.nextTree());
                dbg.location(27,84);
                adaptor.addChild(root_1, stream_attack.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
        	// do for sure before leaving
        }
        dbg.location(27, 90);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rule"


    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // /Users/job/Programming/svn-sc/SAFParser.g:29:1: move : ( CHOOSE LEFT_PAREN MOVE_TYPE MOVE_TYPE RIGHT_PAREN -> ^( MOVEACTION CHOOSE MOVE_TYPE MOVE_TYPE ) | MOVE_TYPE -> ^( MOVEACTION MOVE_TYPE ) );
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE15=null;
        Token LEFT_PAREN16=null;
        Token MOVE_TYPE17=null;
        Token MOVE_TYPE18=null;
        Token RIGHT_PAREN19=null;
        Token MOVE_TYPE20=null;

        Object CHOOSE15_tree=null;
        Object LEFT_PAREN16_tree=null;
        Object MOVE_TYPE17_tree=null;
        Object MOVE_TYPE18_tree=null;
        Object RIGHT_PAREN19_tree=null;
        Object MOVE_TYPE20_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_MOVE_TYPE=new RewriteRuleTokenStream(adaptor,"token MOVE_TYPE");

        try { dbg.enterRule(getGrammarFileName(), "move");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:29:8: ( CHOOSE LEFT_PAREN MOVE_TYPE MOVE_TYPE RIGHT_PAREN -> ^( MOVEACTION CHOOSE MOVE_TYPE MOVE_TYPE ) | MOVE_TYPE -> ^( MOVEACTION MOVE_TYPE ) )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==CHOOSE) ) {
                alt2=1;
            }
            else if ( (LA2_0==MOVE_TYPE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/job/Programming/svn-sc/SAFParser.g:29:10: CHOOSE LEFT_PAREN MOVE_TYPE MOVE_TYPE RIGHT_PAREN
                    {
                    dbg.location(29,10);
                    CHOOSE15=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_move195);  
                    stream_CHOOSE.add(CHOOSE15);

                    dbg.location(29,17);
                    LEFT_PAREN16=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_move197);  
                    stream_LEFT_PAREN.add(LEFT_PAREN16);

                    dbg.location(29,28);
                    MOVE_TYPE17=(Token)match(input,MOVE_TYPE,FOLLOW_MOVE_TYPE_in_move199);  
                    stream_MOVE_TYPE.add(MOVE_TYPE17);

                    dbg.location(29,38);
                    MOVE_TYPE18=(Token)match(input,MOVE_TYPE,FOLLOW_MOVE_TYPE_in_move201);  
                    stream_MOVE_TYPE.add(MOVE_TYPE18);

                    dbg.location(29,48);
                    RIGHT_PAREN19=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_move203);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN19);


                    // AST REWRITE
                    // elements: CHOOSE, MOVE_TYPE, MOVE_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 29:60: -> ^( MOVEACTION CHOOSE MOVE_TYPE MOVE_TYPE )
                    {
                        dbg.location(29,63);
                        // /Users/job/Programming/svn-sc/SAFParser.g:29:63: ^( MOVEACTION CHOOSE MOVE_TYPE MOVE_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(29,65);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MOVEACTION, "MOVEACTION")
                        , root_1);

                        dbg.location(29,76);
                        adaptor.addChild(root_1, 
                        stream_CHOOSE.nextNode()
                        );
                        dbg.location(29,83);
                        adaptor.addChild(root_1, 
                        stream_MOVE_TYPE.nextNode()
                        );
                        dbg.location(29,93);
                        adaptor.addChild(root_1, 
                        stream_MOVE_TYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/job/Programming/svn-sc/SAFParser.g:30:7: MOVE_TYPE
                    {
                    dbg.location(30,7);
                    MOVE_TYPE20=(Token)match(input,MOVE_TYPE,FOLLOW_MOVE_TYPE_in_move223);  
                    stream_MOVE_TYPE.add(MOVE_TYPE20);


                    // AST REWRITE
                    // elements: MOVE_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 30:17: -> ^( MOVEACTION MOVE_TYPE )
                    {
                        dbg.location(30,20);
                        // /Users/job/Programming/svn-sc/SAFParser.g:30:20: ^( MOVEACTION MOVE_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(30,22);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MOVEACTION, "MOVEACTION")
                        , root_1);

                        dbg.location(30,33);
                        adaptor.addChild(root_1, 
                        stream_MOVE_TYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
        	// do for sure before leaving
        }
        dbg.location(30, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "move");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "move"


    public static class attack_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attack"
    // /Users/job/Programming/svn-sc/SAFParser.g:32:1: attack : ( CHOOSE LEFT_PAREN ATTACK_TYPE ATTACK_TYPE RIGHT_PAREN -> ^( FIGHTACTION CHOOSE ATTACK_TYPE ATTACK_TYPE ) | ATTACK_TYPE -> ^( FIGHTACTION ATTACK_TYPE ) );
    public final SAFParser.attack_return attack() throws RecognitionException {
        SAFParser.attack_return retval = new SAFParser.attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE21=null;
        Token LEFT_PAREN22=null;
        Token ATTACK_TYPE23=null;
        Token ATTACK_TYPE24=null;
        Token RIGHT_PAREN25=null;
        Token ATTACK_TYPE26=null;

        Object CHOOSE21_tree=null;
        Object LEFT_PAREN22_tree=null;
        Object ATTACK_TYPE23_tree=null;
        Object ATTACK_TYPE24_tree=null;
        Object RIGHT_PAREN25_tree=null;
        Object ATTACK_TYPE26_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_ATTACK_TYPE=new RewriteRuleTokenStream(adaptor,"token ATTACK_TYPE");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");

        try { dbg.enterRule(getGrammarFileName(), "attack");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:32:10: ( CHOOSE LEFT_PAREN ATTACK_TYPE ATTACK_TYPE RIGHT_PAREN -> ^( FIGHTACTION CHOOSE ATTACK_TYPE ATTACK_TYPE ) | ATTACK_TYPE -> ^( FIGHTACTION ATTACK_TYPE ) )
            int alt3=2;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==CHOOSE) ) {
                alt3=1;
            }
            else if ( (LA3_0==ATTACK_TYPE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/job/Programming/svn-sc/SAFParser.g:32:12: CHOOSE LEFT_PAREN ATTACK_TYPE ATTACK_TYPE RIGHT_PAREN
                    {
                    dbg.location(32,12);
                    CHOOSE21=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_attack241);  
                    stream_CHOOSE.add(CHOOSE21);

                    dbg.location(32,19);
                    LEFT_PAREN22=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attack243);  
                    stream_LEFT_PAREN.add(LEFT_PAREN22);

                    dbg.location(32,30);
                    ATTACK_TYPE23=(Token)match(input,ATTACK_TYPE,FOLLOW_ATTACK_TYPE_in_attack245);  
                    stream_ATTACK_TYPE.add(ATTACK_TYPE23);

                    dbg.location(32,42);
                    ATTACK_TYPE24=(Token)match(input,ATTACK_TYPE,FOLLOW_ATTACK_TYPE_in_attack247);  
                    stream_ATTACK_TYPE.add(ATTACK_TYPE24);

                    dbg.location(32,54);
                    RIGHT_PAREN25=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attack249);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN25);


                    // AST REWRITE
                    // elements: CHOOSE, ATTACK_TYPE, ATTACK_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 32:66: -> ^( FIGHTACTION CHOOSE ATTACK_TYPE ATTACK_TYPE )
                    {
                        dbg.location(32,69);
                        // /Users/job/Programming/svn-sc/SAFParser.g:32:69: ^( FIGHTACTION CHOOSE ATTACK_TYPE ATTACK_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(32,71);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIGHTACTION, "FIGHTACTION")
                        , root_1);

                        dbg.location(32,83);
                        adaptor.addChild(root_1, 
                        stream_CHOOSE.nextNode()
                        );
                        dbg.location(32,90);
                        adaptor.addChild(root_1, 
                        stream_ATTACK_TYPE.nextNode()
                        );
                        dbg.location(32,102);
                        adaptor.addChild(root_1, 
                        stream_ATTACK_TYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/job/Programming/svn-sc/SAFParser.g:33:7: ATTACK_TYPE
                    {
                    dbg.location(33,7);
                    ATTACK_TYPE26=(Token)match(input,ATTACK_TYPE,FOLLOW_ATTACK_TYPE_in_attack269);  
                    stream_ATTACK_TYPE.add(ATTACK_TYPE26);


                    // AST REWRITE
                    // elements: ATTACK_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 33:19: -> ^( FIGHTACTION ATTACK_TYPE )
                    {
                        dbg.location(33,22);
                        // /Users/job/Programming/svn-sc/SAFParser.g:33:22: ^( FIGHTACTION ATTACK_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(33,24);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIGHTACTION, "FIGHTACTION")
                        , root_1);

                        dbg.location(33,36);
                        adaptor.addChild(root_1, 
                        stream_ATTACK_TYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
        	// do for sure before leaving
        }
        dbg.location(33, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attack");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "attack"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // /Users/job/Programming/svn-sc/SAFParser.g:35:1: condition : ( CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE -> ^( CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE ) | CONDITION_TYPE -> ^( CONDITION CONDITION_TYPE ) );
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONDITION_TYPE27=null;
        Token LOGICAL_OPERATOR28=null;
        Token CONDITION_TYPE29=null;
        Token CONDITION_TYPE30=null;

        Object CONDITION_TYPE27_tree=null;
        Object LOGICAL_OPERATOR28_tree=null;
        Object CONDITION_TYPE29_tree=null;
        Object CONDITION_TYPE30_tree=null;
        RewriteRuleTokenStream stream_LOGICAL_OPERATOR=new RewriteRuleTokenStream(adaptor,"token LOGICAL_OPERATOR");
        RewriteRuleTokenStream stream_CONDITION_TYPE=new RewriteRuleTokenStream(adaptor,"token CONDITION_TYPE");

        try { dbg.enterRule(getGrammarFileName(), "condition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:35:12: ( CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE -> ^( CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE ) | CONDITION_TYPE -> ^( CONDITION CONDITION_TYPE ) )
            int alt4=2;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==CONDITION_TYPE) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==LOGICAL_OPERATOR) ) {
                    alt4=1;
                }
                else if ( (LA4_1==LEFT_BRACKET) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/job/Programming/svn-sc/SAFParser.g:35:14: CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE
                    {
                    dbg.location(35,14);
                    CONDITION_TYPE27=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_condition286);  
                    stream_CONDITION_TYPE.add(CONDITION_TYPE27);

                    dbg.location(35,29);
                    LOGICAL_OPERATOR28=(Token)match(input,LOGICAL_OPERATOR,FOLLOW_LOGICAL_OPERATOR_in_condition288);  
                    stream_LOGICAL_OPERATOR.add(LOGICAL_OPERATOR28);

                    dbg.location(35,46);
                    CONDITION_TYPE29=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_condition290);  
                    stream_CONDITION_TYPE.add(CONDITION_TYPE29);


                    // AST REWRITE
                    // elements: LOGICAL_OPERATOR, CONDITION_TYPE, CONDITION_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 35:61: -> ^( CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE )
                    {
                        dbg.location(35,64);
                        // /Users/job/Programming/svn-sc/SAFParser.g:35:64: ^( CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(35,66);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONDITION, "CONDITION")
                        , root_1);

                        dbg.location(35,76);
                        adaptor.addChild(root_1, 
                        stream_LOGICAL_OPERATOR.nextNode()
                        );
                        dbg.location(35,93);
                        adaptor.addChild(root_1, 
                        stream_CONDITION_TYPE.nextNode()
                        );
                        dbg.location(35,108);
                        adaptor.addChild(root_1, 
                        stream_CONDITION_TYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/job/Programming/svn-sc/SAFParser.g:36:8: CONDITION_TYPE
                    {
                    dbg.location(36,8);
                    CONDITION_TYPE30=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_condition311);  
                    stream_CONDITION_TYPE.add(CONDITION_TYPE30);


                    // AST REWRITE
                    // elements: CONDITION_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 36:23: -> ^( CONDITION CONDITION_TYPE )
                    {
                        dbg.location(36,26);
                        // /Users/job/Programming/svn-sc/SAFParser.g:36:26: ^( CONDITION CONDITION_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(36,28);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONDITION, "CONDITION")
                        , root_1);

                        dbg.location(36,38);
                        adaptor.addChild(root_1, 
                        stream_CONDITION_TYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
        	// do for sure before leaving
        }
        dbg.location(36, 52);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "condition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "condition"

    // Delegated rules


 

    public static final BitSet FOLLOW_name_in_fighter79 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_fighter81 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_characteristic_in_fighter84 = new BitSet(new long[]{0x0000000000090080L});
    public static final BitSet FOLLOW_rule_in_fighter88 = new BitSet(new long[]{0x0000000000090080L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_fighter92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRENGTH_in_characteristic140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_characteristic142 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DIGIT_in_characteristic144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_rule165 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_rule167 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_move_in_rule169 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_attack_in_rule171 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_rule173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_move195 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_move197 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MOVE_TYPE_in_move199 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MOVE_TYPE_in_move201 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_move203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_TYPE_in_move223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_attack241 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attack243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ATTACK_TYPE_in_attack245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ATTACK_TYPE_in_attack247 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attack249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACK_TYPE_in_attack269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_condition286 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LOGICAL_OPERATOR_in_condition288 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_condition290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_condition311 = new BitSet(new long[]{0x0000000000000002L});

}