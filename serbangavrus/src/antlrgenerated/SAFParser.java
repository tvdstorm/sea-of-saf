// $ANTLR 3.4 D:\\Master\\Software Construction\\ANTLR\\SAF.g 2012-01-22 12:52:12

    package antlrgenerated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
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


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:20:1: fighter : NAME '{' specs '}' ;
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

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:21:2: ( NAME '{' specs '}' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:21:4: NAME '{' specs '}'
            {
            root_0 = (Object)adaptor.nil();


            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_fighter53); 
            NAME1_tree = 
            (Object)adaptor.create(NAME1)
            ;
            adaptor.addChild(root_0, NAME1_tree);


            char_literal2=(Token)match(input,35,FOLLOW_35_in_fighter55); 
            char_literal2_tree = 
            (Object)adaptor.create(char_literal2)
            ;
            adaptor.addChild(root_0, char_literal2_tree);


            pushFollow(FOLLOW_specs_in_fighter57);
            specs3=specs();

            state._fsp--;

            adaptor.addChild(root_0, specs3.getTree());

            char_literal4=(Token)match(input,36,FOLLOW_36_in_fighter59); 
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
        return retval;
    }
    // $ANTLR end "fighter"


    public static class specs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specs"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:24:1: specs : ( assignment | tactic )+ ;
    public final SAFParser.specs_return specs() throws RecognitionException {
        SAFParser.specs_return retval = new SAFParser.specs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.assignment_return assignment5 =null;

        SAFParser.tactic_return tactic6 =null;



        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:25:2: ( ( assignment | tactic )+ )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:25:4: ( assignment | tactic )+
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:25:4: ( assignment | tactic )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 17 && LA1_0 <= 18)||(LA1_0 >= 24 && LA1_0 <= 25)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==10||(LA1_0 >= 14 && LA1_0 <= 15)||(LA1_0 >= 21 && LA1_0 <= 23)||LA1_0==31||LA1_0==34) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:25:5: assignment
            	    {
            	    pushFollow(FOLLOW_assignment_in_specs71);
            	    assignment5=assignment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assignment5.getTree());

            	    }
            	    break;
            	case 2 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:25:18: tactic
            	    {
            	    pushFollow(FOLLOW_tactic_in_specs75);
            	    tactic6=tactic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, tactic6.getTree());

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
        return retval;
    }
    // $ANTLR end "specs"


    public static class tactic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tactic"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:28:1: tactic : condition '[' move attack ']' ;
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

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:29:2: ( condition '[' move attack ']' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:29:4: condition '[' move attack ']'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_condition_in_tactic88);
            condition7=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition7.getTree());

            char_literal8=(Token)match(input,8,FOLLOW_8_in_tactic90); 
            char_literal8_tree = 
            (Object)adaptor.create(char_literal8)
            ;
            adaptor.addChild(root_0, char_literal8_tree);


            pushFollow(FOLLOW_move_in_tactic92);
            move9=move();

            state._fsp--;

            adaptor.addChild(root_0, move9.getTree());

            pushFollow(FOLLOW_attack_in_tactic94);
            attack10=attack();

            state._fsp--;

            adaptor.addChild(root_0, attack10.getTree());

            char_literal11=(Token)match(input,9,FOLLOW_9_in_tactic96); 
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
        return retval;
    }
    // $ANTLR end "tactic"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:1: assignment : strength '=' NUMBER ;
    public final SAFParser.assignment_return assignment() throws RecognitionException {
        SAFParser.assignment_return retval = new SAFParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal13=null;
        Token NUMBER14=null;
        SAFParser.strength_return strength12 =null;


        Object char_literal13_tree=null;
        Object NUMBER14_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:33:2: ( strength '=' NUMBER )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:33:4: strength '=' NUMBER
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_strength_in_assignment107);
            strength12=strength();

            state._fsp--;

            adaptor.addChild(root_0, strength12.getTree());

            char_literal13=(Token)match(input,7,FOLLOW_7_in_assignment109); 
            char_literal13_tree = 
            (Object)adaptor.create(char_literal13)
            ;
            adaptor.addChild(root_0, char_literal13_tree);


            NUMBER14=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_assignment111); 
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
        return retval;
    }
    // $ANTLR end "assignment"


    public static class strength_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "strength"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:37:1: strength : ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' );
    public final SAFParser.strength_return strength() throws RecognitionException {
        SAFParser.strength_return retval = new SAFParser.strength_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set15=null;

        Object set15_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:38:2: ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (Object)adaptor.nil();


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
        return retval;
    }
    // $ANTLR end "strength"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:44:1: condition : ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' );
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set16=null;

        Object set16_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:45:2: ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (Object)adaptor.nil();


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
        return retval;
    }
    // $ANTLR end "condition"


    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:55:1: move : ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' );
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set17=null;

        Object set17_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:56:2: ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (Object)adaptor.nil();


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
        return retval;
    }
    // $ANTLR end "move"


    public static class attack_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attack"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:65:1: attack : ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' );
    public final SAFParser.attack_return attack() throws RecognitionException {
        SAFParser.attack_return retval = new SAFParser.attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set18=null;

        Object set18_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:66:2: ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (Object)adaptor.nil();


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
        return retval;
    }
    // $ANTLR end "attack"

    // Delegated rules


 

    public static final BitSet FOLLOW_NAME_in_fighter53 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_fighter55 = new BitSet(new long[]{0x0000000483E6C400L});
    public static final BitSet FOLLOW_specs_in_fighter57 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fighter59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_specs71 = new BitSet(new long[]{0x0000000483E6C402L});
    public static final BitSet FOLLOW_tactic_in_specs75 = new BitSet(new long[]{0x0000000483E6C402L});
    public static final BitSet FOLLOW_condition_in_tactic88 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_tactic90 = new BitSet(new long[]{0x0000000370012000L});
    public static final BitSet FOLLOW_move_in_tactic92 = new BitSet(new long[]{0x000000000C181800L});
    public static final BitSet FOLLOW_attack_in_tactic94 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_tactic96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strength_in_assignment107 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_assignment109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NUMBER_in_assignment111 = new BitSet(new long[]{0x0000000000000002L});

}