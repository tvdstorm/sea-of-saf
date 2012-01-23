// $ANTLR 3.4 /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g 2012-01-23 10:41:04

  package com.yennick.SAF;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTACK", "CONDITION", "CURLYCLOSE", "CURLYOPEN", "DIRECTION", "DISTANCE", "EQUALS", "FIGHTACTION", "FIGHTERNAME", "MOVEACTION", "SKILLS", "SKILLVALUE", "WHITESPACE", "'('", "')'", "'['", "']'", "'always'", "'choose'", "'height'", "'speed'", "'stand'", "'weight'"
    };

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
    public String getGrammarFileName() { return "/Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:23:1: fighter : fightername CURLYOPEN ( skills | conditions | distance | profile )+ CURLYCLOSE ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CURLYOPEN2=null;
        Token CURLYCLOSE7=null;
        SAFParser.fightername_return fightername1 =null;

        SAFParser.skills_return skills3 =null;

        SAFParser.conditions_return conditions4 =null;

        SAFParser.distance_return distance5 =null;

        SAFParser.profile_return profile6 =null;


        Object CURLYOPEN2_tree=null;
        Object CURLYCLOSE7_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:24:2: ( fightername CURLYOPEN ( skills | conditions | distance | profile )+ CURLYCLOSE )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:24:4: fightername CURLYOPEN ( skills | conditions | distance | profile )+ CURLYCLOSE
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_fightername_in_fighter81);
            fightername1=fightername();

            state._fsp--;

            adaptor.addChild(root_0, fightername1.getTree());

            CURLYOPEN2=(Token)match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_fighter83); 
            CURLYOPEN2_tree = 
            (Object)adaptor.create(CURLYOPEN2)
            ;
            adaptor.addChild(root_0, CURLYOPEN2_tree);


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:25:3: ( skills | conditions | distance | profile )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case SKILLS:
                    {
                    alt1=1;
                    }
                    break;
                case CONDITION:
                case 21:
                    {
                    alt1=2;
                    }
                    break;
                case DISTANCE:
                    {
                    alt1=3;
                    }
                    break;
                case 23:
                case 24:
                case 26:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:25:4: skills
            	    {
            	    pushFollow(FOLLOW_skills_in_fighter88);
            	    skills3=skills();

            	    state._fsp--;

            	    adaptor.addChild(root_0, skills3.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:25:11: conditions
            	    {
            	    pushFollow(FOLLOW_conditions_in_fighter90);
            	    conditions4=conditions();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conditions4.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:25:22: distance
            	    {
            	    pushFollow(FOLLOW_distance_in_fighter92);
            	    distance5=distance();

            	    state._fsp--;

            	    adaptor.addChild(root_0, distance5.getTree());

            	    }
            	    break;
            	case 4 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:25:31: profile
            	    {
            	    pushFollow(FOLLOW_profile_in_fighter94);
            	    profile6=profile();

            	    state._fsp--;

            	    adaptor.addChild(root_0, profile6.getTree());

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


            CURLYCLOSE7=(Token)match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_fighter100); 
            CURLYCLOSE7_tree = 
            (Object)adaptor.create(CURLYCLOSE7)
            ;
            adaptor.addChild(root_0, CURLYCLOSE7_tree);


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


    public static class fightername_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fightername"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:29:1: fightername : FIGHTERNAME ;
    public final SAFParser.fightername_return fightername() throws RecognitionException {
        SAFParser.fightername_return retval = new SAFParser.fightername_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FIGHTERNAME8=null;

        Object FIGHTERNAME8_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:30:2: ( FIGHTERNAME )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:30:4: FIGHTERNAME
            {
            root_0 = (Object)adaptor.nil();


            FIGHTERNAME8=(Token)match(input,FIGHTERNAME,FOLLOW_FIGHTERNAME_in_fightername112); 
            FIGHTERNAME8_tree = 
            (Object)adaptor.create(FIGHTERNAME8)
            ;
            adaptor.addChild(root_0, FIGHTERNAME8_tree);


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
    // $ANTLR end "fightername"


    public static class skills_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "skills"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:34:1: skills : SKILLS EQUALS SKILLVALUE ;
    public final SAFParser.skills_return skills() throws RecognitionException {
        SAFParser.skills_return retval = new SAFParser.skills_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SKILLS9=null;
        Token EQUALS10=null;
        Token SKILLVALUE11=null;

        Object SKILLS9_tree=null;
        Object EQUALS10_tree=null;
        Object SKILLVALUE11_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:35:2: ( SKILLS EQUALS SKILLVALUE )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:35:3: SKILLS EQUALS SKILLVALUE
            {
            root_0 = (Object)adaptor.nil();


            SKILLS9=(Token)match(input,SKILLS,FOLLOW_SKILLS_in_skills123); 
            SKILLS9_tree = 
            (Object)adaptor.create(SKILLS9)
            ;
            adaptor.addChild(root_0, SKILLS9_tree);


            EQUALS10=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_skills125); 
            EQUALS10_tree = 
            (Object)adaptor.create(EQUALS10)
            ;
            adaptor.addChild(root_0, EQUALS10_tree);


            SKILLVALUE11=(Token)match(input,SKILLVALUE,FOLLOW_SKILLVALUE_in_skills127); 
            SKILLVALUE11_tree = 
            (Object)adaptor.create(SKILLVALUE11)
            ;
            adaptor.addChild(root_0, SKILLVALUE11_tree);


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
    // $ANTLR end "skills"


    public static class profile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "profile"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:38:1: profile : ( 'weight' | 'height' | 'speed' ) ;
    public final SAFParser.profile_return profile() throws RecognitionException {
        SAFParser.profile_return retval = new SAFParser.profile_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:39:2: ( ( 'weight' | 'height' | 'speed' ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:
            {
            root_0 = (Object)adaptor.nil();


            set12=(Token)input.LT(1);

            if ( (input.LA(1) >= 23 && input.LA(1) <= 24)||input.LA(1)==26 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set12)
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
    // $ANTLR end "profile"


    public static class distance_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "distance"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:42:1: distance : DISTANCE move ;
    public final SAFParser.distance_return distance() throws RecognitionException {
        SAFParser.distance_return retval = new SAFParser.distance_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DISTANCE13=null;
        SAFParser.move_return move14 =null;


        Object DISTANCE13_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:43:2: ( DISTANCE move )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:43:4: DISTANCE move
            {
            root_0 = (Object)adaptor.nil();


            DISTANCE13=(Token)match(input,DISTANCE,FOLLOW_DISTANCE_in_distance156); 
            DISTANCE13_tree = 
            (Object)adaptor.create(DISTANCE13)
            ;
            adaptor.addChild(root_0, DISTANCE13_tree);


            pushFollow(FOLLOW_move_in_distance158);
            move14=move();

            state._fsp--;

            adaptor.addChild(root_0, move14.getTree());

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
    // $ANTLR end "distance"


    public static class conditions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditions"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:46:1: conditions : ( CONDITION | 'always' ) move ;
    public final SAFParser.conditions_return conditions() throws RecognitionException {
        SAFParser.conditions_return retval = new SAFParser.conditions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set15=null;
        SAFParser.move_return move16 =null;


        Object set15_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:47:2: ( ( CONDITION | 'always' ) move )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:47:4: ( CONDITION | 'always' ) move
            {
            root_0 = (Object)adaptor.nil();


            set15=(Token)input.LT(1);

            if ( input.LA(1)==CONDITION||input.LA(1)==21 ) {
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


            pushFollow(FOLLOW_move_in_conditions178);
            move16=move();

            state._fsp--;

            adaptor.addChild(root_0, move16.getTree());

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


    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:50:1: move : '[' ( action )+ ']' ;
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal17=null;
        Token char_literal19=null;
        SAFParser.action_return action18 =null;


        Object char_literal17_tree=null;
        Object char_literal19_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:51:2: ( '[' ( action )+ ']' )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:51:4: '[' ( action )+ ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal17=(Token)match(input,19,FOLLOW_19_in_move190); 
            char_literal17_tree = 
            (Object)adaptor.create(char_literal17)
            ;
            adaptor.addChild(root_0, char_literal17_tree);


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:51:8: ( action )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FIGHTACTION||LA2_0==MOVEACTION||LA2_0==22||LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:51:8: action
            	    {
            	    pushFollow(FOLLOW_action_in_move192);
            	    action18=action();

            	    state._fsp--;

            	    adaptor.addChild(root_0, action18.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            char_literal19=(Token)match(input,20,FOLLOW_20_in_move195); 
            char_literal19_tree = 
            (Object)adaptor.create(char_literal19)
            ;
            adaptor.addChild(root_0, char_literal19_tree);


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


    public static class action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:54:1: action : ( 'choose' '(' )? ( moveAction | fightAction ) ( ')' )? ;
    public final SAFParser.action_return action() throws RecognitionException {
        SAFParser.action_return retval = new SAFParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal20=null;
        Token char_literal21=null;
        Token char_literal24=null;
        SAFParser.moveAction_return moveAction22 =null;

        SAFParser.fightAction_return fightAction23 =null;


        Object string_literal20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal24_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:55:2: ( ( 'choose' '(' )? ( moveAction | fightAction ) ( ')' )? )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:55:5: ( 'choose' '(' )? ( moveAction | fightAction ) ( ')' )?
            {
            root_0 = (Object)adaptor.nil();


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:55:5: ( 'choose' '(' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:55:6: 'choose' '('
                    {
                    string_literal20=(Token)match(input,22,FOLLOW_22_in_action209); 
                    string_literal20_tree = 
                    (Object)adaptor.create(string_literal20)
                    ;
                    adaptor.addChild(root_0, string_literal20_tree);


                    char_literal21=(Token)match(input,17,FOLLOW_17_in_action211); 
                    char_literal21_tree = 
                    (Object)adaptor.create(char_literal21)
                    ;
                    adaptor.addChild(root_0, char_literal21_tree);


                    }
                    break;

            }


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:55:21: ( moveAction | fightAction )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==MOVEACTION||LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==FIGHTACTION) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:55:22: moveAction
                    {
                    pushFollow(FOLLOW_moveAction_in_action216);
                    moveAction22=moveAction();

                    state._fsp--;

                    adaptor.addChild(root_0, moveAction22.getTree());

                    }
                    break;
                case 2 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:55:33: fightAction
                    {
                    pushFollow(FOLLOW_fightAction_in_action218);
                    fightAction23=fightAction();

                    state._fsp--;

                    adaptor.addChild(root_0, fightAction23.getTree());

                    }
                    break;

            }


            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:55:47: ( ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:55:48: ')'
                    {
                    char_literal24=(Token)match(input,18,FOLLOW_18_in_action223); 
                    char_literal24_tree = 
                    (Object)adaptor.create(char_literal24)
                    ;
                    adaptor.addChild(root_0, char_literal24_tree);


                    }
                    break;

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
    // $ANTLR end "action"


    public static class moveAction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moveAction"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:58:1: moveAction : ( MOVEACTION | 'stand' ) ;
    public final SAFParser.moveAction_return moveAction() throws RecognitionException {
        SAFParser.moveAction_return retval = new SAFParser.moveAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set25=null;

        Object set25_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:59:2: ( ( MOVEACTION | 'stand' ) )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:
            {
            root_0 = (Object)adaptor.nil();


            set25=(Token)input.LT(1);

            if ( input.LA(1)==MOVEACTION||input.LA(1)==25 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set25)
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
    // $ANTLR end "moveAction"


    public static class fightAction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fightAction"
    // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:62:1: fightAction : FIGHTACTION ;
    public final SAFParser.fightAction_return fightAction() throws RecognitionException {
        SAFParser.fightAction_return retval = new SAFParser.fightAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FIGHTACTION26=null;

        Object FIGHTACTION26_tree=null;

        try {
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:63:2: ( FIGHTACTION )
            // /Volumes/Data/yennick/Documents/Studie/Construction/Workspace/Aliquam Pugnator/src/com/yennick/SAF/SAF.g:63:4: FIGHTACTION
            {
            root_0 = (Object)adaptor.nil();


            FIGHTACTION26=(Token)match(input,FIGHTACTION,FOLLOW_FIGHTACTION_in_fightAction255); 
            FIGHTACTION26_tree = 
            (Object)adaptor.create(FIGHTACTION26)
            ;
            adaptor.addChild(root_0, FIGHTACTION26_tree);


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
    // $ANTLR end "fightAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_fightername_in_fighter81 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CURLYOPEN_in_fighter83 = new BitSet(new long[]{0x0000000005A04220L});
    public static final BitSet FOLLOW_skills_in_fighter88 = new BitSet(new long[]{0x0000000005A04260L});
    public static final BitSet FOLLOW_conditions_in_fighter90 = new BitSet(new long[]{0x0000000005A04260L});
    public static final BitSet FOLLOW_distance_in_fighter92 = new BitSet(new long[]{0x0000000005A04260L});
    public static final BitSet FOLLOW_profile_in_fighter94 = new BitSet(new long[]{0x0000000005A04260L});
    public static final BitSet FOLLOW_CURLYCLOSE_in_fighter100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGHTERNAME_in_fightername112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SKILLS_in_skills123 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_skills125 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SKILLVALUE_in_skills127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_distance156 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_move_in_distance158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_conditions170 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_move_in_conditions178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_move190 = new BitSet(new long[]{0x0000000002402800L});
    public static final BitSet FOLLOW_action_in_move192 = new BitSet(new long[]{0x0000000002502800L});
    public static final BitSet FOLLOW_20_in_move195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_action209 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_action211 = new BitSet(new long[]{0x0000000002002800L});
    public static final BitSet FOLLOW_moveAction_in_action216 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_fightAction_in_action218 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_action223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGHTACTION_in_fightAction255 = new BitSet(new long[]{0x0000000000000002L});

}