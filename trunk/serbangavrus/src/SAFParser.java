// $ANTLR 3.4 D:\\Master\\Software Construction\\ANTLR\\SAF.g 2012-01-21 15:35:06

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NAME", "NUMBER", "WHITESPACE", "'='", "'['", "']'", "'always'", "'block_high'", "'block_low'", "'crouch'", "'even'", "'far'", "'jump'", "'kickPower'", "'kickReach'", "'kick_high'", "'kick_low'", "'much_stronger'", "'much_weaker'", "'near'", "'punchPower'", "'punchReach'", "'punch_high'", "'punch_low'", "'run_away'", "'run_towards'", "'stand'", "'stronger'", "'walk_away'", "'walk_towards'", "'weaker'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
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
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int NAME=4;
    public static final int NUMBER=5;
    public static final int WHITESPACE=6;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "attack", "move", "strength", "specs", "condition", "fighter", 
    "tactic", "assignment"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false
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
    public String getGrammarFileName() { return "D:\\Master\\Software Construction\\ANTLR\\SAF.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:13:1: fighter : NAME '{' specs '}' ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NAME1=null;
        Token char_literal2=null;
        Token char_literal4=null;
        SAFParser.specs_return specs3 =null;


        Object NAME1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal4_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fighter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:14:2: ( NAME '{' specs '}' )
            dbg.enterAlt(1);

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:14:4: NAME '{' specs '}'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(14,4);
            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_fighter39); 
            NAME1_tree = 
            (Object)adaptor.create(NAME1)
            ;
            adaptor.addChild(root_0, NAME1_tree);

            dbg.location(14,9);
            char_literal2=(Token)match(input,35,FOLLOW_35_in_fighter41); 
            char_literal2_tree = 
            (Object)adaptor.create(char_literal2)
            ;
            adaptor.addChild(root_0, char_literal2_tree);

            dbg.location(14,13);
            pushFollow(FOLLOW_specs_in_fighter43);
            specs3=specs();

            state._fsp--;

            adaptor.addChild(root_0, specs3.getTree());
            dbg.location(14,19);
            char_literal4=(Token)match(input,36,FOLLOW_36_in_fighter45); 
            char_literal4_tree = 
            (Object)adaptor.create(char_literal4)
            ;
            adaptor.addChild(root_0, char_literal4_tree);


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
        dbg.location(15, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fighter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fighter"


    public static class specs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specs"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:17:1: specs : ( assignment | tactic )+ ;
    public final SAFParser.specs_return specs() throws RecognitionException {
        SAFParser.specs_return retval = new SAFParser.specs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.assignment_return assignment5 =null;

        SAFParser.tactic_return tactic6 =null;



        try { dbg.enterRule(getGrammarFileName(), "specs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:18:2: ( ( assignment | tactic )+ )
            dbg.enterAlt(1);

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:18:4: ( assignment | tactic )+
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(18,4);
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:18:4: ( assignment | tactic )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 17 && LA1_0 <= 18)||(LA1_0 >= 24 && LA1_0 <= 25)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==10||(LA1_0 >= 14 && LA1_0 <= 15)||(LA1_0 >= 21 && LA1_0 <= 23)||LA1_0==31||LA1_0==34) ) {
                    alt1=2;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:18:5: assignment
            	    {
            	    dbg.location(18,5);
            	    pushFollow(FOLLOW_assignment_in_specs57);
            	    assignment5=assignment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assignment5.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:18:18: tactic
            	    {
            	    dbg.location(18,18);
            	    pushFollow(FOLLOW_tactic_in_specs61);
            	    tactic6=tactic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, tactic6.getTree());

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
        dbg.location(19, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "specs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "specs"


    public static class tactic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tactic"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:21:1: tactic : condition '[' move attack ']' ;
    public final SAFParser.tactic_return tactic() throws RecognitionException {
        SAFParser.tactic_return retval = new SAFParser.tactic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal8=null;
        Token char_literal11=null;
        SAFParser.condition_return condition7 =null;

        SAFParser.move_return move9 =null;

        SAFParser.attack_return attack10 =null;


        Object char_literal8_tree=null;
        Object char_literal11_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "tactic");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:22:2: ( condition '[' move attack ']' )
            dbg.enterAlt(1);

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:22:4: condition '[' move attack ']'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(22,4);
            pushFollow(FOLLOW_condition_in_tactic74);
            condition7=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition7.getTree());
            dbg.location(22,14);
            char_literal8=(Token)match(input,8,FOLLOW_8_in_tactic76); 
            char_literal8_tree = 
            (Object)adaptor.create(char_literal8)
            ;
            adaptor.addChild(root_0, char_literal8_tree);

            dbg.location(22,18);
            pushFollow(FOLLOW_move_in_tactic78);
            move9=move();

            state._fsp--;

            adaptor.addChild(root_0, move9.getTree());
            dbg.location(22,23);
            pushFollow(FOLLOW_attack_in_tactic80);
            attack10=attack();

            state._fsp--;

            adaptor.addChild(root_0, attack10.getTree());
            dbg.location(22,30);
            char_literal11=(Token)match(input,9,FOLLOW_9_in_tactic82); 
            char_literal11_tree = 
            (Object)adaptor.create(char_literal11)
            ;
            adaptor.addChild(root_0, char_literal11_tree);


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
        dbg.location(23, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "tactic");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "tactic"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:25:1: assignment : strength '=' NUMBER ;
    public final SAFParser.assignment_return assignment() throws RecognitionException {
        SAFParser.assignment_return retval = new SAFParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal13=null;
        Token NUMBER14=null;
        SAFParser.strength_return strength12 =null;


        Object char_literal13_tree=null;
        Object NUMBER14_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 0);

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:26:2: ( strength '=' NUMBER )
            dbg.enterAlt(1);

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:26:4: strength '=' NUMBER
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(26,4);
            pushFollow(FOLLOW_strength_in_assignment93);
            strength12=strength();

            state._fsp--;

            adaptor.addChild(root_0, strength12.getTree());
            dbg.location(26,13);
            char_literal13=(Token)match(input,7,FOLLOW_7_in_assignment95); 
            char_literal13_tree = 
            (Object)adaptor.create(char_literal13)
            ;
            adaptor.addChild(root_0, char_literal13_tree);

            dbg.location(26,17);
            NUMBER14=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_assignment97); 
            NUMBER14_tree = 
            (Object)adaptor.create(NUMBER14)
            ;
            adaptor.addChild(root_0, NUMBER14_tree);


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
        dbg.location(27, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignment"


    public static class strength_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "strength"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:30:1: strength : ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' );
    public final SAFParser.strength_return strength() throws RecognitionException {
        SAFParser.strength_return retval = new SAFParser.strength_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set15=null;

        Object set15_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "strength");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 0);

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:31:2: ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' )
            dbg.enterAlt(1);

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(31,2);
            set15=(Token)input.LT(1);

            if ( (input.LA(1) >= 17 && input.LA(1) <= 18)||(input.LA(1) >= 24 && input.LA(1) <= 25) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set15)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


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
        dbg.location(35, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "strength");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "strength"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:37:1: condition : ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' );
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set16=null;

        Object set16_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "condition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:38:2: ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' )
            dbg.enterAlt(1);

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(38,2);
            set16=(Token)input.LT(1);

            if ( input.LA(1)==10||(input.LA(1) >= 14 && input.LA(1) <= 15)||(input.LA(1) >= 21 && input.LA(1) <= 23)||input.LA(1)==31||input.LA(1)==34 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set16)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


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
        dbg.location(46, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "condition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "condition"


    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:48:1: move : ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' );
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set17=null;

        Object set17_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "move");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 0);

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:49:2: ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' )
            dbg.enterAlt(1);

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(49,2);
            set17=(Token)input.LT(1);

            if ( input.LA(1)==13||input.LA(1)==16||(input.LA(1) >= 28 && input.LA(1) <= 30)||(input.LA(1) >= 32 && input.LA(1) <= 33) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set17)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


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
        dbg.location(56, 1);

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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:58:1: attack : ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' );
    public final SAFParser.attack_return attack() throws RecognitionException {
        SAFParser.attack_return retval = new SAFParser.attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set18=null;

        Object set18_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "attack");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 0);

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:59:2: ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' )
            dbg.enterAlt(1);

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(59,2);
            set18=(Token)input.LT(1);

            if ( (input.LA(1) >= 11 && input.LA(1) <= 12)||(input.LA(1) >= 19 && input.LA(1) <= 20)||(input.LA(1) >= 26 && input.LA(1) <= 27) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set18)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


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
        dbg.location(65, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attack");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "attack"

    // Delegated rules


 

    public static final BitSet FOLLOW_NAME_in_fighter39 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_fighter41 = new BitSet(new long[]{0x0000000483E6C400L});
    public static final BitSet FOLLOW_specs_in_fighter43 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fighter45 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_specs57 = new BitSet(new long[]{0x0000000483E6C402L});
    public static final BitSet FOLLOW_tactic_in_specs61 = new BitSet(new long[]{0x0000000483E6C402L});
    public static final BitSet FOLLOW_condition_in_tactic74 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_tactic76 = new BitSet(new long[]{0x0000000370012000L});
    public static final BitSet FOLLOW_move_in_tactic78 = new BitSet(new long[]{0x000000000C181800L});
    public static final BitSet FOLLOW_attack_in_tactic80 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_tactic82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strength_in_assignment93 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_assignment95 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NUMBER_in_assignment97 = new BitSet(new long[]{0x0000000000000002L});

}