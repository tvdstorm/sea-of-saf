// $ANTLR 3.4 D:\\Master\\Software Construction\\ANTLR\\SAF.g 2012-01-23 15:59:49

	package antlrgenerated;
	//import nodes.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEHAVIOUR", "FIGHTER", "NAME", "NUMBER", "PERSONALITY", "WHITESPACE", "'='", "'['", "']'", "'always'", "'block_high'", "'block_low'", "'crouch'", "'even'", "'far'", "'jump'", "'kickPower'", "'kickReach'", "'kick_high'", "'kick_low'", "'much_stronger'", "'much_weaker'", "'near'", "'punchPower'", "'punchReach'", "'punch_high'", "'punch_low'", "'run_away'", "'run_towards'", "'stand'", "'stronger'", "'walk_away'", "'walk_towards'", "'weaker'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int BEHAVIOUR=4;
    public static final int FIGHTER=5;
    public static final int NAME=6;
    public static final int NUMBER=7;
    public static final int PERSONALITY=8;
    public static final int WHITESPACE=9;

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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:27:1: fighter : name= NAME fighter_specs -> ^( FIGHTER fighter_specs ) ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token name=null;
        SAFParser.fighter_specs_return fighter_specs1 =null;


        Object name_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleSubtreeStream stream_fighter_specs=new RewriteRuleSubtreeStream(adaptor,"rule fighter_specs");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:28:2: (name= NAME fighter_specs -> ^( FIGHTER fighter_specs ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:28:4: name= NAME fighter_specs
            {
            name=(Token)match(input,NAME,FOLLOW_NAME_in_fighter62);  
            stream_NAME.add(name);


            pushFollow(FOLLOW_fighter_specs_in_fighter64);
            fighter_specs1=fighter_specs();

            state._fsp--;

            stream_fighter_specs.add(fighter_specs1.getTree());

            // AST REWRITE
            // elements: fighter_specs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 28:28: -> ^( FIGHTER fighter_specs )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:28:31: ^( FIGHTER fighter_specs )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIGHTER, "FIGHTER")
                , root_1);

                adaptor.addChild(root_1, stream_fighter_specs.nextTree());

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
        return retval;
    }
    // $ANTLR end "fighter"


    public static class fighter_specs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter_specs"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:31:1: fighter_specs : '{' ( spec )+ '}' -> ( spec )+ ;
    public final SAFParser.fighter_specs_return fighter_specs() throws RecognitionException {
        SAFParser.fighter_specs_return retval = new SAFParser.fighter_specs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal2=null;
        Token char_literal4=null;
        SAFParser.spec_return spec3 =null;


        Object char_literal2_tree=null;
        Object char_literal4_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_spec=new RewriteRuleSubtreeStream(adaptor,"rule spec");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:2: ( '{' ( spec )+ '}' -> ( spec )+ )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:4: '{' ( spec )+ '}'
            {
            char_literal2=(Token)match(input,38,FOLLOW_38_in_fighter_specs84);  
            stream_38.add(char_literal2);


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:8: ( spec )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0 >= 17 && LA1_0 <= 18)||(LA1_0 >= 20 && LA1_0 <= 21)||(LA1_0 >= 24 && LA1_0 <= 28)||LA1_0==34||LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:8: spec
            	    {
            	    pushFollow(FOLLOW_spec_in_fighter_specs86);
            	    spec3=spec();

            	    state._fsp--;

            	    stream_spec.add(spec3.getTree());

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


            char_literal4=(Token)match(input,39,FOLLOW_39_in_fighter_specs89);  
            stream_39.add(char_literal4);


            // AST REWRITE
            // elements: spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 32:18: -> ( spec )+
            {
                if ( !(stream_spec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_spec.hasNext() ) {
                    adaptor.addChild(root_0, stream_spec.nextTree());

                }
                stream_spec.reset();

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
        return retval;
    }
    // $ANTLR end "fighter_specs"


    public static class spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spec"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:35:1: spec : ( parsonality | behaviour ) ;
    public final SAFParser.spec_return spec() throws RecognitionException {
        SAFParser.spec_return retval = new SAFParser.spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.parsonality_return parsonality5 =null;

        SAFParser.behaviour_return behaviour6 =null;



        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:36:2: ( ( parsonality | behaviour ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:36:4: ( parsonality | behaviour )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:36:4: ( parsonality | behaviour )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 20 && LA2_0 <= 21)||(LA2_0 >= 27 && LA2_0 <= 28)) ) {
                alt2=1;
            }
            else if ( (LA2_0==13||(LA2_0 >= 17 && LA2_0 <= 18)||(LA2_0 >= 24 && LA2_0 <= 26)||LA2_0==34||LA2_0==37) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:36:5: parsonality
                    {
                    pushFollow(FOLLOW_parsonality_in_spec106);
                    parsonality5=parsonality();

                    state._fsp--;

                    adaptor.addChild(root_0, parsonality5.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:36:19: behaviour
                    {
                    pushFollow(FOLLOW_behaviour_in_spec110);
                    behaviour6=behaviour();

                    state._fsp--;

                    adaptor.addChild(root_0, behaviour6.getTree());

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
    // $ANTLR end "spec"


    public static class parsonality_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parsonality"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:39:1: parsonality : assignment -> ^( PERSONALITY assignment ) ;
    public final SAFParser.parsonality_return parsonality() throws RecognitionException {
        SAFParser.parsonality_return retval = new SAFParser.parsonality_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.assignment_return assignment7 =null;


        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:40:2: ( assignment -> ^( PERSONALITY assignment ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:40:4: assignment
            {
            pushFollow(FOLLOW_assignment_in_parsonality122);
            assignment7=assignment();

            state._fsp--;

            stream_assignment.add(assignment7.getTree());

            // AST REWRITE
            // elements: assignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 40:15: -> ^( PERSONALITY assignment )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:40:18: ^( PERSONALITY assignment )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PERSONALITY, "PERSONALITY")
                , root_1);

                adaptor.addChild(root_1, stream_assignment.nextTree());

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
        return retval;
    }
    // $ANTLR end "parsonality"


    public static class behaviour_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:43:1: behaviour : tactic -> ^( BEHAVIOUR tactic ) ;
    public final SAFParser.behaviour_return behaviour() throws RecognitionException {
        SAFParser.behaviour_return retval = new SAFParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.tactic_return tactic8 =null;


        RewriteRuleSubtreeStream stream_tactic=new RewriteRuleSubtreeStream(adaptor,"rule tactic");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:44:2: ( tactic -> ^( BEHAVIOUR tactic ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:44:4: tactic
            {
            pushFollow(FOLLOW_tactic_in_behaviour142);
            tactic8=tactic();

            state._fsp--;

            stream_tactic.add(tactic8.getTree());

            // AST REWRITE
            // elements: tactic
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 44:11: -> ^( BEHAVIOUR tactic )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:44:14: ^( BEHAVIOUR tactic )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BEHAVIOUR, "BEHAVIOUR")
                , root_1);

                adaptor.addChild(root_1, stream_tactic.nextTree());

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
        return retval;
    }
    // $ANTLR end "behaviour"


    public static class tactic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tactic"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:47:1: tactic : condition move_attack ;
    public final SAFParser.tactic_return tactic() throws RecognitionException {
        SAFParser.tactic_return retval = new SAFParser.tactic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.condition_return condition9 =null;

        SAFParser.move_attack_return move_attack10 =null;



        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:48:2: ( condition move_attack )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:48:4: condition move_attack
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_condition_in_tactic161);
            condition9=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition9.getTree());

            pushFollow(FOLLOW_move_attack_in_tactic163);
            move_attack10=move_attack();

            state._fsp--;

            adaptor.addChild(root_0, move_attack10.getTree());

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


    public static class move_attack_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move_attack"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:51:1: move_attack : '[' move attack ']' -> move attack ;
    public final SAFParser.move_attack_return move_attack() throws RecognitionException {
        SAFParser.move_attack_return retval = new SAFParser.move_attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal11=null;
        Token char_literal14=null;
        SAFParser.move_return move12 =null;

        SAFParser.attack_return attack13 =null;


        Object char_literal11_tree=null;
        Object char_literal14_tree=null;
        RewriteRuleTokenStream stream_11=new RewriteRuleTokenStream(adaptor,"token 11");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleSubtreeStream stream_attack=new RewriteRuleSubtreeStream(adaptor,"rule attack");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:52:2: ( '[' move attack ']' -> move attack )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:52:4: '[' move attack ']'
            {
            char_literal11=(Token)match(input,11,FOLLOW_11_in_move_attack174);  
            stream_11.add(char_literal11);


            pushFollow(FOLLOW_move_in_move_attack176);
            move12=move();

            state._fsp--;

            stream_move.add(move12.getTree());

            pushFollow(FOLLOW_attack_in_move_attack178);
            attack13=attack();

            state._fsp--;

            stream_attack.add(attack13.getTree());

            char_literal14=(Token)match(input,12,FOLLOW_12_in_move_attack180);  
            stream_12.add(char_literal14);


            // AST REWRITE
            // elements: attack, move
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 52:24: -> move attack
            {
                adaptor.addChild(root_0, stream_move.nextTree());

                adaptor.addChild(root_0, stream_attack.nextTree());

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
        return retval;
    }
    // $ANTLR end "move_attack"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:55:1: assignment : strength '=' NUMBER -> strength NUMBER ;
    public final SAFParser.assignment_return assignment() throws RecognitionException {
        SAFParser.assignment_return retval = new SAFParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal16=null;
        Token NUMBER17=null;
        SAFParser.strength_return strength15 =null;


        Object char_literal16_tree=null;
        Object NUMBER17_tree=null;
        RewriteRuleTokenStream stream_10=new RewriteRuleTokenStream(adaptor,"token 10");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_strength=new RewriteRuleSubtreeStream(adaptor,"rule strength");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:56:2: ( strength '=' NUMBER -> strength NUMBER )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:56:4: strength '=' NUMBER
            {
            pushFollow(FOLLOW_strength_in_assignment198);
            strength15=strength();

            state._fsp--;

            stream_strength.add(strength15.getTree());

            char_literal16=(Token)match(input,10,FOLLOW_10_in_assignment200);  
            stream_10.add(char_literal16);


            NUMBER17=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_assignment202);  
            stream_NUMBER.add(NUMBER17);


            // AST REWRITE
            // elements: strength, NUMBER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:24: -> strength NUMBER
            {
                adaptor.addChild(root_0, stream_strength.nextTree());

                adaptor.addChild(root_0, 
                stream_NUMBER.nextNode()
                );

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
        return retval;
    }
    // $ANTLR end "assignment"


    public static class strength_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "strength"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:60:1: strength : ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' );
    public final SAFParser.strength_return strength() throws RecognitionException {
        SAFParser.strength_return retval = new SAFParser.strength_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set18=null;

        Object set18_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:61:2: ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (Object)adaptor.nil();


            set18=(Token)input.LT(1);

            if ( (input.LA(1) >= 20 && input.LA(1) <= 21)||(input.LA(1) >= 27 && input.LA(1) <= 28) ) {
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
    // $ANTLR end "strength"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:67:1: condition : ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' );
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set19=null;

        Object set19_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:68:2: ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (Object)adaptor.nil();


            set19=(Token)input.LT(1);

            if ( input.LA(1)==13||(input.LA(1) >= 17 && input.LA(1) <= 18)||(input.LA(1) >= 24 && input.LA(1) <= 26)||input.LA(1)==34||input.LA(1)==37 ) {
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
    // $ANTLR end "condition"


    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:78:1: move : ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' );
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set20=null;

        Object set20_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:79:2: ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (Object)adaptor.nil();


            set20=(Token)input.LT(1);

            if ( input.LA(1)==16||input.LA(1)==19||(input.LA(1) >= 31 && input.LA(1) <= 33)||(input.LA(1) >= 35 && input.LA(1) <= 36) ) {
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
    // $ANTLR end "move"


    public static class attack_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attack"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:88:1: attack : ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' );
    public final SAFParser.attack_return attack() throws RecognitionException {
        SAFParser.attack_return retval = new SAFParser.attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set21=null;

        Object set21_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:89:2: ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:
            {
            root_0 = (Object)adaptor.nil();


            set21=(Token)input.LT(1);

            if ( (input.LA(1) >= 14 && input.LA(1) <= 15)||(input.LA(1) >= 22 && input.LA(1) <= 23)||(input.LA(1) >= 29 && input.LA(1) <= 30) ) {
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
    // $ANTLR end "attack"

    // Delegated rules


 

    public static final BitSet FOLLOW_NAME_in_fighter62 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_fighter_specs_in_fighter64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_fighter_specs84 = new BitSet(new long[]{0x000000241F362000L});
    public static final BitSet FOLLOW_spec_in_fighter_specs86 = new BitSet(new long[]{0x000000A41F362000L});
    public static final BitSet FOLLOW_39_in_fighter_specs89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parsonality_in_spec106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_spec110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_parsonality122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tactic_in_behaviour142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_tactic161 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_move_attack_in_tactic163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_move_attack174 = new BitSet(new long[]{0x0000001B80090000L});
    public static final BitSet FOLLOW_move_in_move_attack176 = new BitSet(new long[]{0x0000000060C0C000L});
    public static final BitSet FOLLOW_attack_in_move_attack178 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_move_attack180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strength_in_assignment198 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_assignment200 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_assignment202 = new BitSet(new long[]{0x0000000000000002L});

}