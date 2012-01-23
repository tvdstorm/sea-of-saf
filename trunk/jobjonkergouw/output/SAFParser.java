// $ANTLR 3.4 /Users/job/Programming/svn-sc/SAFparser.g 2012-01-23 09:59:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFparser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "ATTACK_TYPE", "CHOOSE", "CONDITION_TYPE", "DIGIT", "ID", "LEFT_BRACE", "LEFT_BRACKET", "LEFT_PAREN", "LOGICAL_OPERATOR", "MOVE_TYPE", "NEWLINE", "RIGHT_BRACE", "RIGHT_BRACKET", "RIGHT_PAREN", "STRENGTH", "WHITESPACE", "BEHAVIOUR", "PERSONALITY"
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
    public static final int PERSONALITY=22;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "fighter", "behaviour", "property", "characteristic", 
    "condition", "attack", "move"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public SAFparser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public SAFparser(TokenStream input, int port, RecognizerSharedState state) {
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

public SAFparser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return SAFparser.tokenNames; }
    public String getGrammarFileName() { return "/Users/job/Programming/svn-sc/SAFparser.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // /Users/job/Programming/svn-sc/SAFparser.g:13:1: fighter : ID ^ LEFT_BRACE ! ( property )+ RIGHT_BRACE !;
    public final SAFparser.fighter_return fighter() throws RecognitionException {
        SAFparser.fighter_return retval = new SAFparser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID1=null;
        Token LEFT_BRACE2=null;
        Token RIGHT_BRACE4=null;
        SAFparser.property_return property3 =null;


        Object ID1_tree=null;
        Object LEFT_BRACE2_tree=null;
        Object RIGHT_BRACE4_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fighter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:13:11: ( ID ^ LEFT_BRACE ! ( property )+ RIGHT_BRACE !)
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFparser.g:13:14: ID ^ LEFT_BRACE ! ( property )+ RIGHT_BRACE !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(13,16);
            ID1=(Token)match(input,ID,FOLLOW_ID_in_fighter49); 
            ID1_tree = 
            (Object)adaptor.create(ID1)
            ;
            root_0 = (Object)adaptor.becomeRoot(ID1_tree, root_0);

            dbg.location(13,28);
            LEFT_BRACE2=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_fighter52); 
            dbg.location(13,30);
            // /Users/job/Programming/svn-sc/SAFparser.g:13:30: ( property )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==CONDITION_TYPE||LA1_0==STRENGTH) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/job/Programming/svn-sc/SAFparser.g:13:30: property
            	    {
            	    dbg.location(13,30);
            	    pushFollow(FOLLOW_property_in_fighter55);
            	    property3=property();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property3.getTree());

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

            dbg.location(13,51);
            RIGHT_BRACE4=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_fighter58); 

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
        dbg.location(13, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fighter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fighter"


    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property"
    // /Users/job/Programming/svn-sc/SAFparser.g:15:1: property : ( characteristic | behaviour );
    public final SAFparser.property_return property() throws RecognitionException {
        SAFparser.property_return retval = new SAFparser.property_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFparser.characteristic_return characteristic5 =null;

        SAFparser.behaviour_return behaviour6 =null;



        try { dbg.enterRule(getGrammarFileName(), "property");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:15:11: ( characteristic | behaviour )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==STRENGTH) ) {
                alt2=1;
            }
            else if ( (LA2_0==CONDITION_TYPE) ) {
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

                    // /Users/job/Programming/svn-sc/SAFparser.g:15:13: characteristic
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(15,13);
                    pushFollow(FOLLOW_characteristic_in_property68);
                    characteristic5=characteristic();

                    state._fsp--;

                    adaptor.addChild(root_0, characteristic5.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/job/Programming/svn-sc/SAFparser.g:15:30: behaviour
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(15,30);
                    pushFollow(FOLLOW_behaviour_in_property72);
                    behaviour6=behaviour();

                    state._fsp--;

                    adaptor.addChild(root_0, behaviour6.getTree());

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
        dbg.location(15, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "property");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "property"


    public static class characteristic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // /Users/job/Programming/svn-sc/SAFparser.g:17:1: characteristic : STRENGTH ASSIGN DIGIT -> ^( PERSONALITY STRENGTH DIGIT ) ;
    public final SAFparser.characteristic_return characteristic() throws RecognitionException {
        SAFparser.characteristic_return retval = new SAFparser.characteristic_return();
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
        dbg.location(17, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:17:16: ( STRENGTH ASSIGN DIGIT -> ^( PERSONALITY STRENGTH DIGIT ) )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFparser.g:17:18: STRENGTH ASSIGN DIGIT
            {
            dbg.location(17,18);
            STRENGTH7=(Token)match(input,STRENGTH,FOLLOW_STRENGTH_in_characteristic80);  
            stream_STRENGTH.add(STRENGTH7);

            dbg.location(17,27);
            ASSIGN8=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_characteristic82);  
            stream_ASSIGN.add(ASSIGN8);

            dbg.location(17,34);
            DIGIT9=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_characteristic84);  
            stream_DIGIT.add(DIGIT9);


            // AST REWRITE
            // elements: STRENGTH, DIGIT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 17:40: -> ^( PERSONALITY STRENGTH DIGIT )
            {
                dbg.location(17,43);
                // /Users/job/Programming/svn-sc/SAFparser.g:17:43: ^( PERSONALITY STRENGTH DIGIT )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(17,45);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PERSONALITY, "PERSONALITY")
                , root_1);

                dbg.location(17,57);
                adaptor.addChild(root_1, 
                stream_STRENGTH.nextNode()
                );
                dbg.location(17,66);
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
        dbg.location(17, 71);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "characteristic");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "characteristic"


    public static class behaviour_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // /Users/job/Programming/svn-sc/SAFparser.g:19:1: behaviour : condition LEFT_BRACKET move attack RIGHT_BRACKET -> ^( BEHAVIOUR condition move attack ) ;
    public final SAFparser.behaviour_return behaviour() throws RecognitionException {
        SAFparser.behaviour_return retval = new SAFparser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET11=null;
        Token RIGHT_BRACKET14=null;
        SAFparser.condition_return condition10 =null;

        SAFparser.move_return move12 =null;

        SAFparser.attack_return attack13 =null;


        Object LEFT_BRACKET11_tree=null;
        Object RIGHT_BRACKET14_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_attack=new RewriteRuleSubtreeStream(adaptor,"rule attack");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        try { dbg.enterRule(getGrammarFileName(), "behaviour");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:19:12: ( condition LEFT_BRACKET move attack RIGHT_BRACKET -> ^( BEHAVIOUR condition move attack ) )
            dbg.enterAlt(1);

            // /Users/job/Programming/svn-sc/SAFparser.g:19:14: condition LEFT_BRACKET move attack RIGHT_BRACKET
            {
            dbg.location(19,14);
            pushFollow(FOLLOW_condition_in_behaviour104);
            condition10=condition();

            state._fsp--;

            stream_condition.add(condition10.getTree());
            dbg.location(19,24);
            LEFT_BRACKET11=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_behaviour106);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET11);

            dbg.location(19,37);
            pushFollow(FOLLOW_move_in_behaviour108);
            move12=move();

            state._fsp--;

            stream_move.add(move12.getTree());
            dbg.location(19,42);
            pushFollow(FOLLOW_attack_in_behaviour110);
            attack13=attack();

            state._fsp--;

            stream_attack.add(attack13.getTree());
            dbg.location(19,49);
            RIGHT_BRACKET14=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_behaviour112);  
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
            // 19:63: -> ^( BEHAVIOUR condition move attack )
            {
                dbg.location(19,66);
                // /Users/job/Programming/svn-sc/SAFparser.g:19:66: ^( BEHAVIOUR condition move attack )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(19,68);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BEHAVIOUR, "BEHAVIOUR")
                , root_1);

                dbg.location(19,78);
                adaptor.addChild(root_1, stream_condition.nextTree());
                dbg.location(19,88);
                adaptor.addChild(root_1, stream_move.nextTree());
                dbg.location(19,93);
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
        dbg.location(19, 99);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "behaviour");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "behaviour"


    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // /Users/job/Programming/svn-sc/SAFparser.g:21:1: move : ( CHOOSE LEFT_PAREN MOVE_TYPE MOVE_TYPE RIGHT_PAREN -> ^( CHOOSE MOVE_TYPE MOVE_TYPE ) | MOVE_TYPE );
    public final SAFparser.move_return move() throws RecognitionException {
        SAFparser.move_return retval = new SAFparser.move_return();
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
        dbg.location(21, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:21:8: ( CHOOSE LEFT_PAREN MOVE_TYPE MOVE_TYPE RIGHT_PAREN -> ^( CHOOSE MOVE_TYPE MOVE_TYPE ) | MOVE_TYPE )
            int alt3=2;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==CHOOSE) ) {
                alt3=1;
            }
            else if ( (LA3_0==MOVE_TYPE) ) {
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

                    // /Users/job/Programming/svn-sc/SAFparser.g:21:10: CHOOSE LEFT_PAREN MOVE_TYPE MOVE_TYPE RIGHT_PAREN
                    {
                    dbg.location(21,10);
                    CHOOSE15=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_move134);  
                    stream_CHOOSE.add(CHOOSE15);

                    dbg.location(21,17);
                    LEFT_PAREN16=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_move136);  
                    stream_LEFT_PAREN.add(LEFT_PAREN16);

                    dbg.location(21,28);
                    MOVE_TYPE17=(Token)match(input,MOVE_TYPE,FOLLOW_MOVE_TYPE_in_move138);  
                    stream_MOVE_TYPE.add(MOVE_TYPE17);

                    dbg.location(21,38);
                    MOVE_TYPE18=(Token)match(input,MOVE_TYPE,FOLLOW_MOVE_TYPE_in_move140);  
                    stream_MOVE_TYPE.add(MOVE_TYPE18);

                    dbg.location(21,48);
                    RIGHT_PAREN19=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_move142);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN19);


                    // AST REWRITE
                    // elements: MOVE_TYPE, MOVE_TYPE, CHOOSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 21:60: -> ^( CHOOSE MOVE_TYPE MOVE_TYPE )
                    {
                        dbg.location(21,63);
                        // /Users/job/Programming/svn-sc/SAFparser.g:21:63: ^( CHOOSE MOVE_TYPE MOVE_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(21,65);
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CHOOSE.nextNode()
                        , root_1);

                        dbg.location(21,72);
                        adaptor.addChild(root_1, 
                        stream_MOVE_TYPE.nextNode()
                        );
                        dbg.location(21,82);
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

                    // /Users/job/Programming/svn-sc/SAFparser.g:22:7: MOVE_TYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(22,7);
                    MOVE_TYPE20=(Token)match(input,MOVE_TYPE,FOLLOW_MOVE_TYPE_in_move160); 
                    MOVE_TYPE20_tree = 
                    (Object)adaptor.create(MOVE_TYPE20)
                    ;
                    adaptor.addChild(root_0, MOVE_TYPE20_tree);


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
        dbg.location(22, 15);

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
    // /Users/job/Programming/svn-sc/SAFparser.g:24:1: attack : ( CHOOSE LEFT_PAREN ATTACK_TYPE ATTACK_TYPE RIGHT_PAREN -> ^( CHOOSE ATTACK_TYPE ATTACK_TYPE ) | ATTACK_TYPE );
    public final SAFparser.attack_return attack() throws RecognitionException {
        SAFparser.attack_return retval = new SAFparser.attack_return();
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
        dbg.location(24, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:24:10: ( CHOOSE LEFT_PAREN ATTACK_TYPE ATTACK_TYPE RIGHT_PAREN -> ^( CHOOSE ATTACK_TYPE ATTACK_TYPE ) | ATTACK_TYPE )
            int alt4=2;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==CHOOSE) ) {
                alt4=1;
            }
            else if ( (LA4_0==ATTACK_TYPE) ) {
                alt4=2;
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

                    // /Users/job/Programming/svn-sc/SAFparser.g:24:12: CHOOSE LEFT_PAREN ATTACK_TYPE ATTACK_TYPE RIGHT_PAREN
                    {
                    dbg.location(24,12);
                    CHOOSE21=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_attack170);  
                    stream_CHOOSE.add(CHOOSE21);

                    dbg.location(24,19);
                    LEFT_PAREN22=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attack172);  
                    stream_LEFT_PAREN.add(LEFT_PAREN22);

                    dbg.location(24,30);
                    ATTACK_TYPE23=(Token)match(input,ATTACK_TYPE,FOLLOW_ATTACK_TYPE_in_attack174);  
                    stream_ATTACK_TYPE.add(ATTACK_TYPE23);

                    dbg.location(24,42);
                    ATTACK_TYPE24=(Token)match(input,ATTACK_TYPE,FOLLOW_ATTACK_TYPE_in_attack176);  
                    stream_ATTACK_TYPE.add(ATTACK_TYPE24);

                    dbg.location(24,54);
                    RIGHT_PAREN25=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attack178);  
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
                    // 24:66: -> ^( CHOOSE ATTACK_TYPE ATTACK_TYPE )
                    {
                        dbg.location(24,69);
                        // /Users/job/Programming/svn-sc/SAFparser.g:24:69: ^( CHOOSE ATTACK_TYPE ATTACK_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(24,71);
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CHOOSE.nextNode()
                        , root_1);

                        dbg.location(24,78);
                        adaptor.addChild(root_1, 
                        stream_ATTACK_TYPE.nextNode()
                        );
                        dbg.location(24,90);
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

                    // /Users/job/Programming/svn-sc/SAFparser.g:25:7: ATTACK_TYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(25,7);
                    ATTACK_TYPE26=(Token)match(input,ATTACK_TYPE,FOLLOW_ATTACK_TYPE_in_attack196); 
                    ATTACK_TYPE26_tree = 
                    (Object)adaptor.create(ATTACK_TYPE26)
                    ;
                    adaptor.addChild(root_0, ATTACK_TYPE26_tree);


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
        dbg.location(25, 17);

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
    // /Users/job/Programming/svn-sc/SAFparser.g:27:1: condition : ( CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE -> ^( LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE ) | CONDITION_TYPE );
    public final SAFparser.condition_return condition() throws RecognitionException {
        SAFparser.condition_return retval = new SAFparser.condition_return();
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
        dbg.location(27, 0);

        try {
            // /Users/job/Programming/svn-sc/SAFparser.g:27:12: ( CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE -> ^( LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE ) | CONDITION_TYPE )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==CONDITION_TYPE) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==LOGICAL_OPERATOR) ) {
                    alt5=1;
                }
                else if ( (LA5_1==LEFT_BRACKET) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/job/Programming/svn-sc/SAFparser.g:27:14: CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE
                    {
                    dbg.location(27,14);
                    CONDITION_TYPE27=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_condition205);  
                    stream_CONDITION_TYPE.add(CONDITION_TYPE27);

                    dbg.location(27,29);
                    LOGICAL_OPERATOR28=(Token)match(input,LOGICAL_OPERATOR,FOLLOW_LOGICAL_OPERATOR_in_condition207);  
                    stream_LOGICAL_OPERATOR.add(LOGICAL_OPERATOR28);

                    dbg.location(27,46);
                    CONDITION_TYPE29=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_condition209);  
                    stream_CONDITION_TYPE.add(CONDITION_TYPE29);


                    // AST REWRITE
                    // elements: CONDITION_TYPE, LOGICAL_OPERATOR, CONDITION_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 27:61: -> ^( LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE )
                    {
                        dbg.location(27,64);
                        // /Users/job/Programming/svn-sc/SAFparser.g:27:64: ^( LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(27,66);
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LOGICAL_OPERATOR.nextNode()
                        , root_1);

                        dbg.location(27,83);
                        adaptor.addChild(root_1, 
                        stream_CONDITION_TYPE.nextNode()
                        );
                        dbg.location(27,98);
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

                    // /Users/job/Programming/svn-sc/SAFparser.g:28:8: CONDITION_TYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(28,8);
                    CONDITION_TYPE30=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_condition228); 
                    CONDITION_TYPE30_tree = 
                    (Object)adaptor.create(CONDITION_TYPE30)
                    ;
                    adaptor.addChild(root_0, CONDITION_TYPE30_tree);


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
        dbg.location(28, 21);

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


 

    public static final BitSet FOLLOW_ID_in_fighter49 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_fighter52 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_property_in_fighter55 = new BitSet(new long[]{0x0000000000090080L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_fighter58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_property68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_property72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRENGTH_in_characteristic80 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ASSIGN_in_characteristic82 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DIGIT_in_characteristic84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour104 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_behaviour106 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_move_in_behaviour108 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_attack_in_behaviour110 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_behaviour112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_move134 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_move136 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MOVE_TYPE_in_move138 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MOVE_TYPE_in_move140 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_move142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_TYPE_in_move160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_attack170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attack172 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ATTACK_TYPE_in_attack174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ATTACK_TYPE_in_attack176 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attack178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACK_TYPE_in_attack196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_condition205 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LOGICAL_OPERATOR_in_condition207 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_condition209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_condition228 = new BitSet(new long[]{0x0000000000000002L});

}