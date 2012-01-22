// $ANTLR 3.4 C:\\Sea-Of-Saf\\safgrammar.g 2012-01-22 19:40:45

package cb.saf.parser;

import cb.saf.parser.*;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SafgrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FighterName", "IgnoreSpacesTabsNewlines", "StrengthValues", "'='", "'['", "']'", "'always'", "'block_high'", "'block_low'", "'crouch'", "'even'", "'far'", "'jump'", "'kickPower'", "'kickReach'", "'kick_high'", "'kick_low'", "'much_stronger'", "'much_weaker'", "'near'", "'punchPower'", "'punchReach'", "'punch_high'", "'punch_low'", "'run_away'", "'run_towards'", "'stand'", "'stronger'", "'walk_away'", "'walk_towards'", "'weaker'", "'{'", "'}'"
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
    public static final int FighterName=4;
    public static final int IgnoreSpacesTabsNewlines=5;
    public static final int StrengthValues=6;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SafgrammarParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SafgrammarParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SafgrammarParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Sea-Of-Saf\\safgrammar.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // C:\\Sea-Of-Saf\\safgrammar.g:21:1: fighter : fighterName '{' personality behaviour '}' ;
    public final SafgrammarParser.fighter_return fighter() throws RecognitionException {
        SafgrammarParser.fighter_return retval = new SafgrammarParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal2=null;
        Token char_literal5=null;
        SafgrammarParser.fighterName_return fighterName1 =null;

        SafgrammarParser.personality_return personality3 =null;

        SafgrammarParser.behaviour_return behaviour4 =null;


        Object char_literal2_tree=null;
        Object char_literal5_tree=null;

        try {
            // C:\\Sea-Of-Saf\\safgrammar.g:22:2: ( fighterName '{' personality behaviour '}' )
            // C:\\Sea-Of-Saf\\safgrammar.g:22:5: fighterName '{' personality behaviour '}'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_fighterName_in_fighter58);
            fighterName1=fighterName();

            state._fsp--;

            adaptor.addChild(root_0, fighterName1.getTree());

            char_literal2=(Token)match(input,35,FOLLOW_35_in_fighter60); 
            char_literal2_tree = 
            (Object)adaptor.create(char_literal2)
            ;
            adaptor.addChild(root_0, char_literal2_tree);


            pushFollow(FOLLOW_personality_in_fighter64);
            personality3=personality();

            state._fsp--;

            adaptor.addChild(root_0, personality3.getTree());

            pushFollow(FOLLOW_behaviour_in_fighter66);
            behaviour4=behaviour();

            state._fsp--;

            adaptor.addChild(root_0, behaviour4.getTree());

            char_literal5=(Token)match(input,36,FOLLOW_36_in_fighter68); 
            char_literal5_tree = 
            (Object)adaptor.create(char_literal5)
            ;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fighter"


    public static class fighterName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighterName"
    // C:\\Sea-Of-Saf\\safgrammar.g:24:1: fighterName : FighterName ;
    public final SafgrammarParser.fighterName_return fighterName() throws RecognitionException {
        SafgrammarParser.fighterName_return retval = new SafgrammarParser.fighterName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FighterName6=null;

        Object FighterName6_tree=null;

        try {
            // C:\\Sea-Of-Saf\\safgrammar.g:25:2: ( FighterName )
            // C:\\Sea-Of-Saf\\safgrammar.g:25:4: FighterName
            {
            root_0 = (Object)adaptor.nil();


            FighterName6=(Token)match(input,FighterName,FOLLOW_FighterName_in_fighterName80); 
            FighterName6_tree = 
            (Object)adaptor.create(FighterName6)
            ;
            adaptor.addChild(root_0, FighterName6_tree);


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
    // $ANTLR end "fighterName"


    public static class personality_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // C:\\Sea-Of-Saf\\safgrammar.g:29:1: personality : ( characteristics )* ;
    public final SafgrammarParser.personality_return personality() throws RecognitionException {
        SafgrammarParser.personality_return retval = new SafgrammarParser.personality_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SafgrammarParser.characteristics_return characteristics7 =null;



        try {
            // C:\\Sea-Of-Saf\\safgrammar.g:30:2: ( ( characteristics )* )
            // C:\\Sea-Of-Saf\\safgrammar.g:30:5: ( characteristics )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Sea-Of-Saf\\safgrammar.g:30:5: ( characteristics )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 17 && LA1_0 <= 18)||(LA1_0 >= 24 && LA1_0 <= 25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Sea-Of-Saf\\safgrammar.g:30:5: characteristics
            	    {
            	    pushFollow(FOLLOW_characteristics_in_personality94);
            	    characteristics7=characteristics();

            	    state._fsp--;

            	    adaptor.addChild(root_0, characteristics7.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "personality"


    public static class characteristics_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristics"
    // C:\\Sea-Of-Saf\\safgrammar.g:32:1: characteristics : strengthTypes '=' strengthValues ;
    public final SafgrammarParser.characteristics_return characteristics() throws RecognitionException {
        SafgrammarParser.characteristics_return retval = new SafgrammarParser.characteristics_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal9=null;
        SafgrammarParser.strengthTypes_return strengthTypes8 =null;

        SafgrammarParser.strengthValues_return strengthValues10 =null;


        Object char_literal9_tree=null;

        try {
            // C:\\Sea-Of-Saf\\safgrammar.g:33:2: ( strengthTypes '=' strengthValues )
            // C:\\Sea-Of-Saf\\safgrammar.g:33:4: strengthTypes '=' strengthValues
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_strengthTypes_in_characteristics104);
            strengthTypes8=strengthTypes();

            state._fsp--;

            adaptor.addChild(root_0, strengthTypes8.getTree());

            char_literal9=(Token)match(input,7,FOLLOW_7_in_characteristics106); 
            char_literal9_tree = 
            (Object)adaptor.create(char_literal9)
            ;
            adaptor.addChild(root_0, char_literal9_tree);


            pushFollow(FOLLOW_strengthValues_in_characteristics108);
            strengthValues10=strengthValues();

            state._fsp--;

            adaptor.addChild(root_0, strengthValues10.getTree());

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
    // $ANTLR end "characteristics"


    public static class strengthTypes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "strengthTypes"
    // C:\\Sea-Of-Saf\\safgrammar.g:35:1: strengthTypes : ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' ) ;
    public final SafgrammarParser.strengthTypes_return strengthTypes() throws RecognitionException {
        SafgrammarParser.strengthTypes_return retval = new SafgrammarParser.strengthTypes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set11=null;

        Object set11_tree=null;

        try {
            // C:\\Sea-Of-Saf\\safgrammar.g:36:3: ( ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' ) )
            // C:\\Sea-Of-Saf\\safgrammar.g:
            {
            root_0 = (Object)adaptor.nil();


            set11=(Token)input.LT(1);

            if ( (input.LA(1) >= 17 && input.LA(1) <= 18)||(input.LA(1) >= 24 && input.LA(1) <= 25) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set11)
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
    // $ANTLR end "strengthTypes"


    public static class strengthValues_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "strengthValues"
    // C:\\Sea-Of-Saf\\safgrammar.g:38:1: strengthValues : StrengthValues ;
    public final SafgrammarParser.strengthValues_return strengthValues() throws RecognitionException {
        SafgrammarParser.strengthValues_return retval = new SafgrammarParser.strengthValues_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token StrengthValues12=null;

        Object StrengthValues12_tree=null;

        try {
            // C:\\Sea-Of-Saf\\safgrammar.g:39:2: ( StrengthValues )
            // C:\\Sea-Of-Saf\\safgrammar.g:39:4: StrengthValues
            {
            root_0 = (Object)adaptor.nil();


            StrengthValues12=(Token)match(input,StrengthValues,FOLLOW_StrengthValues_in_strengthValues138); 
            StrengthValues12_tree = 
            (Object)adaptor.create(StrengthValues12)
            ;
            adaptor.addChild(root_0, StrengthValues12_tree);


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
    // $ANTLR end "strengthValues"


    public static class behaviour_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // C:\\Sea-Of-Saf\\safgrammar.g:44:1: behaviour : ( rules )* ;
    public final SafgrammarParser.behaviour_return behaviour() throws RecognitionException {
        SafgrammarParser.behaviour_return retval = new SafgrammarParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SafgrammarParser.rules_return rules13 =null;



        try {
            // C:\\Sea-Of-Saf\\safgrammar.g:45:2: ( ( rules )* )
            // C:\\Sea-Of-Saf\\safgrammar.g:45:4: ( rules )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Sea-Of-Saf\\safgrammar.g:45:4: ( rules )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==10||(LA2_0 >= 14 && LA2_0 <= 15)||(LA2_0 >= 21 && LA2_0 <= 23)||LA2_0==31||LA2_0==34) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Sea-Of-Saf\\safgrammar.g:45:4: rules
            	    {
            	    pushFollow(FOLLOW_rules_in_behaviour152);
            	    rules13=rules();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rules13.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "behaviour"


    public static class rules_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rules"
    // C:\\Sea-Of-Saf\\safgrammar.g:47:1: rules : conditions '[' moves attacks ']' ;
    public final SafgrammarParser.rules_return rules() throws RecognitionException {
        SafgrammarParser.rules_return retval = new SafgrammarParser.rules_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal15=null;
        Token char_literal18=null;
        SafgrammarParser.conditions_return conditions14 =null;

        SafgrammarParser.moves_return moves16 =null;

        SafgrammarParser.attacks_return attacks17 =null;


        Object char_literal15_tree=null;
        Object char_literal18_tree=null;

        try {
            // C:\\Sea-Of-Saf\\safgrammar.g:47:7: ( conditions '[' moves attacks ']' )
            // C:\\Sea-Of-Saf\\safgrammar.g:47:9: conditions '[' moves attacks ']'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditions_in_rules161);
            conditions14=conditions();

            state._fsp--;

            adaptor.addChild(root_0, conditions14.getTree());

            char_literal15=(Token)match(input,8,FOLLOW_8_in_rules163); 
            char_literal15_tree = 
            (Object)adaptor.create(char_literal15)
            ;
            adaptor.addChild(root_0, char_literal15_tree);


            pushFollow(FOLLOW_moves_in_rules165);
            moves16=moves();

            state._fsp--;

            adaptor.addChild(root_0, moves16.getTree());

            pushFollow(FOLLOW_attacks_in_rules167);
            attacks17=attacks();

            state._fsp--;

            adaptor.addChild(root_0, attacks17.getTree());

            char_literal18=(Token)match(input,9,FOLLOW_9_in_rules169); 
            char_literal18_tree = 
            (Object)adaptor.create(char_literal18)
            ;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rules"


    public static class conditions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditions"
    // C:\\Sea-Of-Saf\\safgrammar.g:50:1: conditions : ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' ) ;
    public final SafgrammarParser.conditions_return conditions() throws RecognitionException {
        SafgrammarParser.conditions_return retval = new SafgrammarParser.conditions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set19=null;

        Object set19_tree=null;

        try {
            // C:\\Sea-Of-Saf\\safgrammar.g:51:2: ( ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' ) )
            // C:\\Sea-Of-Saf\\safgrammar.g:
            {
            root_0 = (Object)adaptor.nil();


            set19=(Token)input.LT(1);

            if ( input.LA(1)==10||(input.LA(1) >= 14 && input.LA(1) <= 15)||(input.LA(1) >= 21 && input.LA(1) <= 23)||input.LA(1)==31||input.LA(1)==34 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set19)
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
    // $ANTLR end "conditions"


    public static class moves_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moves"
    // C:\\Sea-Of-Saf\\safgrammar.g:53:1: moves : ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' ) ;
    public final SafgrammarParser.moves_return moves() throws RecognitionException {
        SafgrammarParser.moves_return retval = new SafgrammarParser.moves_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set20=null;

        Object set20_tree=null;

        try {
            // C:\\Sea-Of-Saf\\safgrammar.g:54:2: ( ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' ) )
            // C:\\Sea-Of-Saf\\safgrammar.g:
            {
            root_0 = (Object)adaptor.nil();


            set20=(Token)input.LT(1);

            if ( input.LA(1)==13||input.LA(1)==16||(input.LA(1) >= 28 && input.LA(1) <= 30)||(input.LA(1) >= 32 && input.LA(1) <= 33) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set20)
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
    // $ANTLR end "moves"


    public static class attacks_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attacks"
    // C:\\Sea-Of-Saf\\safgrammar.g:56:1: attacks : ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' ) ;
    public final SafgrammarParser.attacks_return attacks() throws RecognitionException {
        SafgrammarParser.attacks_return retval = new SafgrammarParser.attacks_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set21=null;

        Object set21_tree=null;

        try {
            // C:\\Sea-Of-Saf\\safgrammar.g:57:2: ( ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' ) )
            // C:\\Sea-Of-Saf\\safgrammar.g:
            {
            root_0 = (Object)adaptor.nil();


            set21=(Token)input.LT(1);

            if ( (input.LA(1) >= 11 && input.LA(1) <= 12)||(input.LA(1) >= 19 && input.LA(1) <= 20)||(input.LA(1) >= 26 && input.LA(1) <= 27) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set21)
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
    // $ANTLR end "attacks"

    // Delegated rules


 

    public static final BitSet FOLLOW_fighterName_in_fighter58 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_fighter60 = new BitSet(new long[]{0x0000001483E6C400L});
    public static final BitSet FOLLOW_personality_in_fighter64 = new BitSet(new long[]{0x0000001480E0C400L});
    public static final BitSet FOLLOW_behaviour_in_fighter66 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fighter68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FighterName_in_fighterName80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristics_in_personality94 = new BitSet(new long[]{0x0000000003060002L});
    public static final BitSet FOLLOW_strengthTypes_in_characteristics104 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_characteristics106 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_strengthValues_in_characteristics108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StrengthValues_in_strengthValues138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rules_in_behaviour152 = new BitSet(new long[]{0x0000000480E0C402L});
    public static final BitSet FOLLOW_conditions_in_rules161 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_rules163 = new BitSet(new long[]{0x0000000370012000L});
    public static final BitSet FOLLOW_moves_in_rules165 = new BitSet(new long[]{0x000000000C181800L});
    public static final BitSet FOLLOW_attacks_in_rules167 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_rules169 = new BitSet(new long[]{0x0000000000000002L});

}