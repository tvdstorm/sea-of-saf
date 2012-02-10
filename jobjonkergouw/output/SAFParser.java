// $ANTLR 3.4 /Users/job/Programming/svn-sc/SAFParser.g 2012-02-04 21:22:07

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "ATTACK_TYPE", "CHOOSE", "CONDITION_TYPE", "DIGIT", "ID", "LEFT_BRACE", "LEFT_BRACKET", "LEFT_PAREN", "LOGICAL_OPERATOR", "MOVE_TYPE", "NEWLINE", "RIGHT_BRACE", "RIGHT_BRACKET", "RIGHT_PAREN", "STRENGTH_TYPE", "WHITESPACE", "CHARACTERISTIC", "CONDITION", "FIGHTACTION", "FIGHTER", "MOVEACTION", "NAME", "RULE", "STRENGTH", "VALUE", "'('", "')'", "'['", "']'", "'{'", "'}'"
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
    public static final int STRENGTH_TYPE=19;
    public static final int WHITESPACE=20;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int CHARACTERISTIC=21;
    public static final int CONDITION=22;
    public static final int FIGHTACTION=23;
    public static final int FIGHTER=24;
    public static final int MOVEACTION=25;
    public static final int NAME=26;
    public static final int RULE=27;
    public static final int STRENGTH=28;
    public static final int VALUE=29;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "condition", "rule", "attack", "characteristic", "fighter", 
    "move", "name"
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
    // /Users/job/Programming/svn-sc/SAFParser.g:20:1: fighter : name '{' ( characteristic | rule )* '}' -> ^( FIGHTER name ( characteristic )* ( rule )* ) ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal2=null;
        Token char_literal5=null;
        SAFParser.name_return name1 =null;

        SAFParser.characteristic_return characteristic3 =null;

        SAFParser.rule_return rule4 =null;


        Object char_literal2_tree=null;
        Object char_literal5_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_rule=new RewriteRuleSubtreeStream(adaptor,"rule rule");
        RewriteRuleSubtreeStream stream_characteristic=new RewriteRuleSubtreeStream(adaptor,"rule characteristic");
        try { dbg.enterRule(getGrammarFileName(), "fighter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:20:11: ( name '{' ( characteristic | rule )* '}' -> ^( FIGHTER name ( characteristic )* ( rule )* ) )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFParser.g:20:14: name '{' ( characteristic | rule )* '}'
            {
            dbg.location(20,14);
            pushFollow(FOLLOW_name_in_fighter77);
            name1=name();

            state._fsp--;

            stream_name.add(name1.getTree());
            dbg.location(20,19);
            char_literal2=(Token)match(input,34,FOLLOW_34_in_fighter79);  
            stream_34.add(char_literal2);

            dbg.location(20,23);
            // /Users/job/Programming/svn-sc/SAFParser.g:20:23: ( characteristic | rule )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRENGTH_TYPE) ) {
                    alt1=1;
                }
                else if ( (LA1_0==CONDITION_TYPE) ) {
                    alt1=2;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/job/Programming/svn-sc/SAFParser.g:20:24: characteristic
            	    {
            	    dbg.location(20,24);
            	    pushFollow(FOLLOW_characteristic_in_fighter82);
            	    characteristic3=characteristic();

            	    state._fsp--;

            	    stream_characteristic.add(characteristic3.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/job/Programming/svn-sc/SAFParser.g:20:41: rule
            	    {
            	    dbg.location(20,41);
            	    pushFollow(FOLLOW_rule_in_fighter86);
            	    rule4=rule();

            	    state._fsp--;

            	    stream_rule.add(rule4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(20,48);
            char_literal5=(Token)match(input,35,FOLLOW_35_in_fighter90);  
            stream_35.add(char_literal5);


            // AST REWRITE
            // elements: characteristic, rule, name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 20:52: -> ^( FIGHTER name ( characteristic )* ( rule )* )
            {
                dbg.location(20,55);
                // /Users/job/Programming/svn-sc/SAFParser.g:20:55: ^( FIGHTER name ( characteristic )* ( rule )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(20,57);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIGHTER, "FIGHTER")
                , root_1);

                dbg.location(20,65);
                adaptor.addChild(root_1, stream_name.nextTree());
                dbg.location(20,70);
                // /Users/job/Programming/svn-sc/SAFParser.g:20:70: ( characteristic )*
                while ( stream_characteristic.hasNext() ) {
                    dbg.location(20,70);
                    adaptor.addChild(root_1, stream_characteristic.nextTree());

                }
                stream_characteristic.reset();
                dbg.location(20,86);
                // /Users/job/Programming/svn-sc/SAFParser.g:20:86: ( rule )*
                while ( stream_rule.hasNext() ) {
                    dbg.location(20,86);
                    adaptor.addChild(root_1, stream_rule.nextTree());

                }
                stream_rule.reset();

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
        dbg.location(20, 91);

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
    // /Users/job/Programming/svn-sc/SAFParser.g:22:1: name : ID -> ^( NAME ID ) ;
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
        dbg.location(22, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:22:8: ( ID -> ^( NAME ID ) )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFParser.g:22:10: ID
            {
            dbg.location(22,10);
            ID6=(Token)match(input,ID,FOLLOW_ID_in_name114);  
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
            // 22:13: -> ^( NAME ID )
            {
                dbg.location(22,16);
                // /Users/job/Programming/svn-sc/SAFParser.g:22:16: ^( NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(22,18);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAME, "NAME")
                , root_1);

                dbg.location(22,23);
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
        dbg.location(22, 25);

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
    // /Users/job/Programming/svn-sc/SAFParser.g:24:1: characteristic : STRENGTH_TYPE ASSIGN DIGIT -> ^( CHARACTERISTIC ^( STRENGTH STRENGTH_TYPE ) ^( VALUE DIGIT ) ) ;
    public final SAFParser.characteristic_return characteristic() throws RecognitionException {
        SAFParser.characteristic_return retval = new SAFParser.characteristic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRENGTH_TYPE7=null;
        Token ASSIGN8=null;
        Token DIGIT9=null;

        Object STRENGTH_TYPE7_tree=null;
        Object ASSIGN8_tree=null;
        Object DIGIT9_tree=null;
        RewriteRuleTokenStream stream_DIGIT=new RewriteRuleTokenStream(adaptor,"token DIGIT");
        RewriteRuleTokenStream stream_STRENGTH_TYPE=new RewriteRuleTokenStream(adaptor,"token STRENGTH_TYPE");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try { dbg.enterRule(getGrammarFileName(), "characteristic");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:24:16: ( STRENGTH_TYPE ASSIGN DIGIT -> ^( CHARACTERISTIC ^( STRENGTH STRENGTH_TYPE ) ^( VALUE DIGIT ) ) )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFParser.g:24:18: STRENGTH_TYPE ASSIGN DIGIT
            {
            dbg.location(24,18);
            STRENGTH_TYPE7=(Token)match(input,STRENGTH_TYPE,FOLLOW_STRENGTH_TYPE_in_characteristic130);  
            stream_STRENGTH_TYPE.add(STRENGTH_TYPE7);

            dbg.location(24,32);
            ASSIGN8=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_characteristic132);  
            stream_ASSIGN.add(ASSIGN8);

            dbg.location(24,39);
            DIGIT9=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_characteristic134);  
            stream_DIGIT.add(DIGIT9);


            // AST REWRITE
            // elements: STRENGTH_TYPE, DIGIT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 24:45: -> ^( CHARACTERISTIC ^( STRENGTH STRENGTH_TYPE ) ^( VALUE DIGIT ) )
            {
                dbg.location(24,48);
                // /Users/job/Programming/svn-sc/SAFParser.g:24:48: ^( CHARACTERISTIC ^( STRENGTH STRENGTH_TYPE ) ^( VALUE DIGIT ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(24,50);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHARACTERISTIC, "CHARACTERISTIC")
                , root_1);

                dbg.location(24,65);
                // /Users/job/Programming/svn-sc/SAFParser.g:24:65: ^( STRENGTH STRENGTH_TYPE )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(24,67);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STRENGTH, "STRENGTH")
                , root_2);

                dbg.location(24,76);
                adaptor.addChild(root_2, 
                stream_STRENGTH_TYPE.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(24,91);
                // /Users/job/Programming/svn-sc/SAFParser.g:24:91: ^( VALUE DIGIT )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(24,93);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VALUE, "VALUE")
                , root_2);

                dbg.location(24,99);
                adaptor.addChild(root_2, 
                stream_DIGIT.nextNode()
                );

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
        dbg.location(24, 105);

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
    // /Users/job/Programming/svn-sc/SAFParser.g:26:1: rule : condition '[' move attack ']' -> ^( RULE condition move attack ) ;
    public final SAFParser.rule_return rule() throws RecognitionException {
        SAFParser.rule_return retval = new SAFParser.rule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal11=null;
        Token char_literal14=null;
        SAFParser.condition_return condition10 =null;

        SAFParser.move_return move12 =null;

        SAFParser.attack_return attack13 =null;


        Object char_literal11_tree=null;
        Object char_literal14_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_attack=new RewriteRuleSubtreeStream(adaptor,"rule attack");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:26:8: ( condition '[' move attack ']' -> ^( RULE condition move attack ) )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFParser.g:26:10: condition '[' move attack ']'
            {
            dbg.location(26,10);
            pushFollow(FOLLOW_condition_in_rule163);
            condition10=condition();

            state._fsp--;

            stream_condition.add(condition10.getTree());
            dbg.location(26,20);
            char_literal11=(Token)match(input,32,FOLLOW_32_in_rule165);  
            stream_32.add(char_literal11);

            dbg.location(26,24);
            pushFollow(FOLLOW_move_in_rule167);
            move12=move();

            state._fsp--;

            stream_move.add(move12.getTree());
            dbg.location(26,29);
            pushFollow(FOLLOW_attack_in_rule169);
            attack13=attack();

            state._fsp--;

            stream_attack.add(attack13.getTree());
            dbg.location(26,36);
            char_literal14=(Token)match(input,33,FOLLOW_33_in_rule171);  
            stream_33.add(char_literal14);


            // AST REWRITE
            // elements: move, attack, condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 26:40: -> ^( RULE condition move attack )
            {
                dbg.location(26,43);
                // /Users/job/Programming/svn-sc/SAFParser.g:26:43: ^( RULE condition move attack )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(26,45);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RULE, "RULE")
                , root_1);

                dbg.location(26,50);
                adaptor.addChild(root_1, stream_condition.nextTree());
                dbg.location(26,60);
                adaptor.addChild(root_1, stream_move.nextTree());
                dbg.location(26,65);
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
        dbg.location(26, 71);

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
    // /Users/job/Programming/svn-sc/SAFParser.g:28:1: move : ( CHOOSE '(' MOVE_TYPE MOVE_TYPE ')' -> ^( MOVEACTION MOVE_TYPE MOVE_TYPE ) | MOVE_TYPE -> ^( MOVEACTION MOVE_TYPE ) );
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE15=null;
        Token char_literal16=null;
        Token MOVE_TYPE17=null;
        Token MOVE_TYPE18=null;
        Token char_literal19=null;
        Token MOVE_TYPE20=null;

        Object CHOOSE15_tree=null;
        Object char_literal16_tree=null;
        Object MOVE_TYPE17_tree=null;
        Object MOVE_TYPE18_tree=null;
        Object char_literal19_tree=null;
        Object MOVE_TYPE20_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_MOVE_TYPE=new RewriteRuleTokenStream(adaptor,"token MOVE_TYPE");

        try { dbg.enterRule(getGrammarFileName(), "move");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:28:8: ( CHOOSE '(' MOVE_TYPE MOVE_TYPE ')' -> ^( MOVEACTION MOVE_TYPE MOVE_TYPE ) | MOVE_TYPE -> ^( MOVEACTION MOVE_TYPE ) )
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

                    // /Users/job/Programming/svn-sc/SAFParser.g:28:10: CHOOSE '(' MOVE_TYPE MOVE_TYPE ')'
                    {
                    dbg.location(28,10);
                    CHOOSE15=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_move193);  
                    stream_CHOOSE.add(CHOOSE15);

                    dbg.location(28,17);
                    char_literal16=(Token)match(input,30,FOLLOW_30_in_move195);  
                    stream_30.add(char_literal16);

                    dbg.location(28,21);
                    MOVE_TYPE17=(Token)match(input,MOVE_TYPE,FOLLOW_MOVE_TYPE_in_move197);  
                    stream_MOVE_TYPE.add(MOVE_TYPE17);

                    dbg.location(28,31);
                    MOVE_TYPE18=(Token)match(input,MOVE_TYPE,FOLLOW_MOVE_TYPE_in_move199);  
                    stream_MOVE_TYPE.add(MOVE_TYPE18);

                    dbg.location(28,41);
                    char_literal19=(Token)match(input,31,FOLLOW_31_in_move201);  
                    stream_31.add(char_literal19);


                    // AST REWRITE
                    // elements: MOVE_TYPE, MOVE_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 28:45: -> ^( MOVEACTION MOVE_TYPE MOVE_TYPE )
                    {
                        dbg.location(28,48);
                        // /Users/job/Programming/svn-sc/SAFParser.g:28:48: ^( MOVEACTION MOVE_TYPE MOVE_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(28,50);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MOVEACTION, "MOVEACTION")
                        , root_1);

                        dbg.location(28,61);
                        adaptor.addChild(root_1, 
                        stream_MOVE_TYPE.nextNode()
                        );
                        dbg.location(28,71);
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

                    // /Users/job/Programming/svn-sc/SAFParser.g:29:7: MOVE_TYPE
                    {
                    dbg.location(29,7);
                    MOVE_TYPE20=(Token)match(input,MOVE_TYPE,FOLLOW_MOVE_TYPE_in_move219);  
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
                    // 29:17: -> ^( MOVEACTION MOVE_TYPE )
                    {
                        dbg.location(29,20);
                        // /Users/job/Programming/svn-sc/SAFParser.g:29:20: ^( MOVEACTION MOVE_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(29,22);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MOVEACTION, "MOVEACTION")
                        , root_1);

                        dbg.location(29,33);
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
        dbg.location(29, 42);

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
    // /Users/job/Programming/svn-sc/SAFParser.g:31:1: attack : ( CHOOSE '(' ATTACK_TYPE ATTACK_TYPE ')' -> ^( FIGHTACTION ATTACK_TYPE ATTACK_TYPE ) | ATTACK_TYPE -> ^( FIGHTACTION ATTACK_TYPE ) );
    public final SAFParser.attack_return attack() throws RecognitionException {
        SAFParser.attack_return retval = new SAFParser.attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE21=null;
        Token char_literal22=null;
        Token ATTACK_TYPE23=null;
        Token ATTACK_TYPE24=null;
        Token char_literal25=null;
        Token ATTACK_TYPE26=null;

        Object CHOOSE21_tree=null;
        Object char_literal22_tree=null;
        Object ATTACK_TYPE23_tree=null;
        Object ATTACK_TYPE24_tree=null;
        Object char_literal25_tree=null;
        Object ATTACK_TYPE26_tree=null;
        RewriteRuleTokenStream stream_ATTACK_TYPE=new RewriteRuleTokenStream(adaptor,"token ATTACK_TYPE");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");

        try { dbg.enterRule(getGrammarFileName(), "attack");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:31:10: ( CHOOSE '(' ATTACK_TYPE ATTACK_TYPE ')' -> ^( FIGHTACTION ATTACK_TYPE ATTACK_TYPE ) | ATTACK_TYPE -> ^( FIGHTACTION ATTACK_TYPE ) )
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

                    // /Users/job/Programming/svn-sc/SAFParser.g:31:12: CHOOSE '(' ATTACK_TYPE ATTACK_TYPE ')'
                    {
                    dbg.location(31,12);
                    CHOOSE21=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_attack237);  
                    stream_CHOOSE.add(CHOOSE21);

                    dbg.location(31,19);
                    char_literal22=(Token)match(input,30,FOLLOW_30_in_attack239);  
                    stream_30.add(char_literal22);

                    dbg.location(31,23);
                    ATTACK_TYPE23=(Token)match(input,ATTACK_TYPE,FOLLOW_ATTACK_TYPE_in_attack241);  
                    stream_ATTACK_TYPE.add(ATTACK_TYPE23);

                    dbg.location(31,35);
                    ATTACK_TYPE24=(Token)match(input,ATTACK_TYPE,FOLLOW_ATTACK_TYPE_in_attack243);  
                    stream_ATTACK_TYPE.add(ATTACK_TYPE24);

                    dbg.location(31,47);
                    char_literal25=(Token)match(input,31,FOLLOW_31_in_attack245);  
                    stream_31.add(char_literal25);


                    // AST REWRITE
                    // elements: ATTACK_TYPE, ATTACK_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 31:51: -> ^( FIGHTACTION ATTACK_TYPE ATTACK_TYPE )
                    {
                        dbg.location(31,54);
                        // /Users/job/Programming/svn-sc/SAFParser.g:31:54: ^( FIGHTACTION ATTACK_TYPE ATTACK_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(31,56);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIGHTACTION, "FIGHTACTION")
                        , root_1);

                        dbg.location(31,68);
                        adaptor.addChild(root_1, 
                        stream_ATTACK_TYPE.nextNode()
                        );
                        dbg.location(31,80);
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

                    // /Users/job/Programming/svn-sc/SAFParser.g:32:7: ATTACK_TYPE
                    {
                    dbg.location(32,7);
                    ATTACK_TYPE26=(Token)match(input,ATTACK_TYPE,FOLLOW_ATTACK_TYPE_in_attack263);  
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
                    // 32:19: -> ^( FIGHTACTION ATTACK_TYPE )
                    {
                        dbg.location(32,22);
                        // /Users/job/Programming/svn-sc/SAFParser.g:32:22: ^( FIGHTACTION ATTACK_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(32,24);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIGHTACTION, "FIGHTACTION")
                        , root_1);

                        dbg.location(32,36);
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
        dbg.location(32, 47);

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
    // /Users/job/Programming/svn-sc/SAFParser.g:34:1: condition : ( CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE -> ^( CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE ) | CONDITION_TYPE -> ^( CONDITION CONDITION_TYPE ) );
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
        dbg.location(34, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFParser.g:34:12: ( CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE -> ^( CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE ) | CONDITION_TYPE -> ^( CONDITION CONDITION_TYPE ) )
            int alt4=2;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==CONDITION_TYPE) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==LOGICAL_OPERATOR) ) {
                    alt4=1;
                }
                else if ( (LA4_1==32) ) {
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

                    // /Users/job/Programming/svn-sc/SAFParser.g:34:14: CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE
                    {
                    dbg.location(34,14);
                    CONDITION_TYPE27=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_condition280);  
                    stream_CONDITION_TYPE.add(CONDITION_TYPE27);

                    dbg.location(34,29);
                    LOGICAL_OPERATOR28=(Token)match(input,LOGICAL_OPERATOR,FOLLOW_LOGICAL_OPERATOR_in_condition282);  
                    stream_LOGICAL_OPERATOR.add(LOGICAL_OPERATOR28);

                    dbg.location(34,46);
                    CONDITION_TYPE29=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_condition284);  
                    stream_CONDITION_TYPE.add(CONDITION_TYPE29);


                    // AST REWRITE
                    // elements: CONDITION_TYPE, CONDITION_TYPE, LOGICAL_OPERATOR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 34:61: -> ^( CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE )
                    {
                        dbg.location(34,64);
                        // /Users/job/Programming/svn-sc/SAFParser.g:34:64: ^( CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(34,66);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONDITION, "CONDITION")
                        , root_1);

                        dbg.location(34,76);
                        adaptor.addChild(root_1, 
                        stream_LOGICAL_OPERATOR.nextNode()
                        );
                        dbg.location(34,93);
                        adaptor.addChild(root_1, 
                        stream_CONDITION_TYPE.nextNode()
                        );
                        dbg.location(34,108);
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

                    // /Users/job/Programming/svn-sc/SAFParser.g:35:8: CONDITION_TYPE
                    {
                    dbg.location(35,8);
                    CONDITION_TYPE30=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_condition305);  
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
                    // 35:23: -> ^( CONDITION CONDITION_TYPE )
                    {
                        dbg.location(35,26);
                        // /Users/job/Programming/svn-sc/SAFParser.g:35:26: ^( CONDITION CONDITION_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(35,28);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONDITION, "CONDITION")
                        , root_1);

                        dbg.location(35,38);
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
        dbg.location(35, 52);

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


 

    public static final BitSet FOLLOW_name_in_fighter77 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_fighter79 = new BitSet(new long[]{0x0000000800080080L});
    public static final BitSet FOLLOW_characteristic_in_fighter82 = new BitSet(new long[]{0x0000000800080080L});
    public static final BitSet FOLLOW_rule_in_fighter86 = new BitSet(new long[]{0x0000000800080080L});
    public static final BitSet FOLLOW_35_in_fighter90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRENGTH_TYPE_in_characteristic130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_characteristic132 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DIGIT_in_characteristic134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_rule163 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rule165 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_move_in_rule167 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_attack_in_rule169 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rule171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_move193 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_move195 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MOVE_TYPE_in_move197 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MOVE_TYPE_in_move199 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_move201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_TYPE_in_move219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_attack237 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_attack239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ATTACK_TYPE_in_attack241 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ATTACK_TYPE_in_attack243 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_attack245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACK_TYPE_in_attack263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_condition280 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LOGICAL_OPERATOR_in_condition282 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_condition284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_condition305 = new BitSet(new long[]{0x0000000000000002L});

}