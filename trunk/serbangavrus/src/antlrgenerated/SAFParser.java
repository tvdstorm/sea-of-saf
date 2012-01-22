// $ANTLR 3.4 D:\\Master\\Software Construction\\ANTLR\\SAF.g 2012-01-22 19:55:51

	package antlrgenerated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEHAVIOUR", "CURLY_END", "CURLY_START", "NAME", "NUMBER", "PERSONALITY", "WHITESPACE", "'='", "'['", "']'", "'always'", "'block_high'", "'block_low'", "'crouch'", "'even'", "'far'", "'jump'", "'kickPower'", "'kickReach'", "'kick_high'", "'kick_low'", "'much_stronger'", "'much_weaker'", "'near'", "'punchPower'", "'punchReach'", "'punch_high'", "'punch_low'", "'run_away'", "'run_towards'", "'stand'", "'stronger'", "'walk_away'", "'walk_towards'", "'weaker'"
    };

    public static final int EOF=-1;
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
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int BEHAVIOUR=4;
    public static final int CURLY_END=5;
    public static final int CURLY_START=6;
    public static final int NAME=7;
    public static final int NUMBER=8;
    public static final int PERSONALITY=9;
    public static final int WHITESPACE=10;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SAFParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SAFParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SAFParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Master\\Software Construction\\ANTLR\\SAF.g"; }


    public static class curly_start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "curly_start"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:29:1: curly_start : '{' ->;
    public final SAFParser.curly_start_return curly_start() throws RecognitionException {
        SAFParser.curly_start_return retval = new SAFParser.curly_start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal1=null;

        CommonTree char_literal1_tree=null;
        RewriteRuleTokenStream stream_CURLY_START=new RewriteRuleTokenStream(adaptor,"token CURLY_START");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:30:2: ( '{' ->)
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:30:4: '{'
            {
            char_literal1=(Token)match(input,CURLY_START,FOLLOW_CURLY_START_in_curly_start89);  
            stream_CURLY_START.add(char_literal1);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 30:8: ->
            {
                root_0 = null;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "curly_start"


    public static class curly_end_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "curly_end"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:33:1: curly_end : '}' ->;
    public final SAFParser.curly_end_return curly_end() throws RecognitionException {
        SAFParser.curly_end_return retval = new SAFParser.curly_end_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal2=null;

        CommonTree char_literal2_tree=null;
        RewriteRuleTokenStream stream_CURLY_END=new RewriteRuleTokenStream(adaptor,"token CURLY_END");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:34:2: ( '}' ->)
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:34:4: '}'
            {
            char_literal2=(Token)match(input,CURLY_END,FOLLOW_CURLY_END_in_curly_end102);  
            stream_CURLY_END.add(char_literal2);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 34:8: ->
            {
                root_0 = null;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "curly_end"


    public static class fighter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:37:1: fighter : NAME ^ curly_start ( spec )+ curly_end ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NAME3=null;
        SAFParser.curly_start_return curly_start4 =null;

        SAFParser.spec_return spec5 =null;

        SAFParser.curly_end_return curly_end6 =null;


        CommonTree NAME3_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:38:2: ( NAME ^ curly_start ( spec )+ curly_end )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:38:4: NAME ^ curly_start ( spec )+ curly_end
            {
            root_0 = (CommonTree)adaptor.nil();


            NAME3=(Token)match(input,NAME,FOLLOW_NAME_in_fighter116); 
            NAME3_tree = 
            (CommonTree)adaptor.create(NAME3)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(NAME3_tree, root_0);


            pushFollow(FOLLOW_curly_start_in_fighter119);
            curly_start4=curly_start();

            state._fsp--;

            adaptor.addChild(root_0, curly_start4.getTree());

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:38:22: ( spec )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0 >= 18 && LA1_0 <= 19)||(LA1_0 >= 21 && LA1_0 <= 22)||(LA1_0 >= 25 && LA1_0 <= 29)||LA1_0==35||LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:38:22: spec
            	    {
            	    pushFollow(FOLLOW_spec_in_fighter121);
            	    spec5=spec();

            	    state._fsp--;

            	    adaptor.addChild(root_0, spec5.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            pushFollow(FOLLOW_curly_end_in_fighter124);
            curly_end6=curly_end();

            state._fsp--;

            adaptor.addChild(root_0, curly_end6.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fighter"


    public static class spec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spec"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:41:1: spec : ( parsonality | behaviour ) ;
    public final SAFParser.spec_return spec() throws RecognitionException {
        SAFParser.spec_return retval = new SAFParser.spec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.parsonality_return parsonality7 =null;

        SAFParser.behaviour_return behaviour8 =null;



        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:42:2: ( ( parsonality | behaviour ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:42:4: ( parsonality | behaviour )
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:42:4: ( parsonality | behaviour )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 21 && LA2_0 <= 22)||(LA2_0 >= 28 && LA2_0 <= 29)) ) {
                alt2=1;
            }
            else if ( (LA2_0==14||(LA2_0 >= 18 && LA2_0 <= 19)||(LA2_0 >= 25 && LA2_0 <= 27)||LA2_0==35||LA2_0==38) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:42:5: parsonality
                    {
                    pushFollow(FOLLOW_parsonality_in_spec136);
                    parsonality7=parsonality();

                    state._fsp--;

                    adaptor.addChild(root_0, parsonality7.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:42:19: behaviour
                    {
                    pushFollow(FOLLOW_behaviour_in_spec140);
                    behaviour8=behaviour();

                    state._fsp--;

                    adaptor.addChild(root_0, behaviour8.getTree());

                    }
                    break;

            }


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "spec"


    public static class parsonality_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parsonality"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:45:1: parsonality : assignment -> ^( PERSONALITY assignment ) ;
    public final SAFParser.parsonality_return parsonality() throws RecognitionException {
        SAFParser.parsonality_return retval = new SAFParser.parsonality_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.assignment_return assignment9 =null;


        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:46:2: ( assignment -> ^( PERSONALITY assignment ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:46:4: assignment
            {
            pushFollow(FOLLOW_assignment_in_parsonality152);
            assignment9=assignment();

            state._fsp--;

            stream_assignment.add(assignment9.getTree());

            // AST REWRITE
            // elements: assignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 46:15: -> ^( PERSONALITY assignment )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:46:18: ^( PERSONALITY assignment )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PERSONALITY, "PERSONALITY")
                , root_1);

                adaptor.addChild(root_1, stream_assignment.nextTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parsonality"


    public static class behaviour_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:49:1: behaviour : tactic -> ^( BEHAVIOUR tactic ) ;
    public final SAFParser.behaviour_return behaviour() throws RecognitionException {
        SAFParser.behaviour_return retval = new SAFParser.behaviour_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.tactic_return tactic10 =null;


        RewriteRuleSubtreeStream stream_tactic=new RewriteRuleSubtreeStream(adaptor,"rule tactic");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:50:2: ( tactic -> ^( BEHAVIOUR tactic ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:50:4: tactic
            {
            pushFollow(FOLLOW_tactic_in_behaviour172);
            tactic10=tactic();

            state._fsp--;

            stream_tactic.add(tactic10.getTree());

            // AST REWRITE
            // elements: tactic
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 50:11: -> ^( BEHAVIOUR tactic )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:50:14: ^( BEHAVIOUR tactic )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BEHAVIOUR, "BEHAVIOUR")
                , root_1);

                adaptor.addChild(root_1, stream_tactic.nextTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "behaviour"


    public static class tactic_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tactic"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:53:1: tactic : condition '[' move attack ']' ;
    public final SAFParser.tactic_return tactic() throws RecognitionException {
        SAFParser.tactic_return retval = new SAFParser.tactic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal12=null;
        Token char_literal15=null;
        SAFParser.condition_return condition11 =null;

        SAFParser.move_return move13 =null;

        SAFParser.attack_return attack14 =null;


        CommonTree char_literal12_tree=null;
        CommonTree char_literal15_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:54:2: ( condition '[' move attack ']' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:54:4: condition '[' move attack ']'
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_condition_in_tactic191);
            condition11=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition11.getTree());

            char_literal12=(Token)match(input,12,FOLLOW_12_in_tactic193); 
            char_literal12_tree = 
            (CommonTree)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);


            pushFollow(FOLLOW_move_in_tactic195);
            move13=move();

            state._fsp--;

            adaptor.addChild(root_0, move13.getTree());

            pushFollow(FOLLOW_attack_in_tactic197);
            attack14=attack();

            state._fsp--;

            adaptor.addChild(root_0, attack14.getTree());

            char_literal15=(Token)match(input,13,FOLLOW_13_in_tactic199); 
            char_literal15_tree = 
            (CommonTree)adaptor.create(char_literal15)
            ;
            adaptor.addChild(root_0, char_literal15_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tactic"


    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:57:1: assignment : strength '=' NUMBER ;
    public final SAFParser.assignment_return assignment() throws RecognitionException {
        SAFParser.assignment_return retval = new SAFParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal17=null;
        Token NUMBER18=null;
        SAFParser.strength_return strength16 =null;


        CommonTree char_literal17_tree=null;
        CommonTree NUMBER18_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:58:2: ( strength '=' NUMBER )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:58:4: strength '=' NUMBER
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_strength_in_assignment211);
            strength16=strength();

            state._fsp--;

            adaptor.addChild(root_0, strength16.getTree());

            char_literal17=(Token)match(input,11,FOLLOW_11_in_assignment213); 
            char_literal17_tree = 
            (CommonTree)adaptor.create(char_literal17)
            ;
            adaptor.addChild(root_0, char_literal17_tree);


            NUMBER18=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_assignment215); 
            NUMBER18_tree = 
            (CommonTree)adaptor.create(NUMBER18)
            ;
            adaptor.addChild(root_0, NUMBER18_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class strength_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "strength"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:62:1: strength : ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' );
    public final SAFParser.strength_return strength() throws RecognitionException {
        SAFParser.strength_return retval = new SAFParser.strength_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set19=null;

        CommonTree set19_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:63:2: ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set19=(Token)input.LT(1);

            if ( (input.LA(1) >= 21 && input.LA(1) <= 22)||(input.LA(1) >= 28 && input.LA(1) <= 29) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set19)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "strength"


    public static class condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:69:1: condition : ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' );
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set20=null;

        CommonTree set20_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:70:2: ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set20=(Token)input.LT(1);

            if ( input.LA(1)==14||(input.LA(1) >= 18 && input.LA(1) <= 19)||(input.LA(1) >= 25 && input.LA(1) <= 27)||input.LA(1)==35||input.LA(1)==38 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set20)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class move_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:80:1: move : ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' );
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set21=null;

        CommonTree set21_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:81:2: ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set21=(Token)input.LT(1);

            if ( input.LA(1)==17||input.LA(1)==20||(input.LA(1) >= 32 && input.LA(1) <= 34)||(input.LA(1) >= 36 && input.LA(1) <= 37) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set21)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "move"


    public static class attack_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attack"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:90:1: attack : ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' );
    public final SAFParser.attack_return attack() throws RecognitionException {
        SAFParser.attack_return retval = new SAFParser.attack_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set22=null;

        CommonTree set22_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:91:2: ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set22=(Token)input.LT(1);

            if ( (input.LA(1) >= 15 && input.LA(1) <= 16)||(input.LA(1) >= 23 && input.LA(1) <= 24)||(input.LA(1) >= 30 && input.LA(1) <= 31) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set22)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attack"

    // Delegated rules


 

    public static final BitSet FOLLOW_CURLY_START_in_curly_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_END_in_curly_end102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_fighter116 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_curly_start_in_fighter119 = new BitSet(new long[]{0x000000483E6C4000L});
    public static final BitSet FOLLOW_spec_in_fighter121 = new BitSet(new long[]{0x000000483E6C4020L});
    public static final BitSet FOLLOW_curly_end_in_fighter124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parsonality_in_spec136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_spec140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_parsonality152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tactic_in_behaviour172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_tactic191 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_tactic193 = new BitSet(new long[]{0x0000003700120000L});
    public static final BitSet FOLLOW_move_in_tactic195 = new BitSet(new long[]{0x00000000C1818000L});
    public static final BitSet FOLLOW_attack_in_tactic197 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_tactic199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strength_in_assignment211 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_assignment213 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_assignment215 = new BitSet(new long[]{0x0000000000000002L});

}