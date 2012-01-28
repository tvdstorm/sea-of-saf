// $ANTLR 3.4 D:\\Master\\Software Construction\\ANTLR\\SAF.g 2012-01-28 19:11:58

	package antlrgenerated;
	import nodes.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BEHAVIOUR", "CHOOSE", "CONDITION", "FIGHTER", "NUMBER", "OR", "PERSONALITY", "STRING", "WHITESPACE", "'('", "')'", "'='", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int AND=4;
    public static final int BEHAVIOUR=5;
    public static final int CHOOSE=6;
    public static final int CONDITION=7;
    public static final int FIGHTER=8;
    public static final int NUMBER=9;
    public static final int OR=10;
    public static final int PERSONALITY=11;
    public static final int STRING=12;
    public static final int WHITESPACE=13;

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
        public Fighter f;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:31:1: fighter returns [Fighter f] : STRING '{' ( spec )+ '}' -> ^( STRING ( spec )+ ) ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING1=null;
        Token char_literal2=null;
        Token char_literal4=null;
        SAFParser.spec_return spec3 =null;


        Object STRING1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal4_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_spec=new RewriteRuleSubtreeStream(adaptor,"rule spec");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:2: ( STRING '{' ( spec )+ '}' -> ^( STRING ( spec )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:4: STRING '{' ( spec )+ '}'
            {
            STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_fighter95);  
            stream_STRING.add(STRING1);


            char_literal2=(Token)match(input,19,FOLLOW_19_in_fighter97);  
            stream_19.add(char_literal2);


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:15: ( spec )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:15: spec
            	    {
            	    pushFollow(FOLLOW_spec_in_fighter99);
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


            char_literal4=(Token)match(input,20,FOLLOW_20_in_fighter102);  
            stream_20.add(char_literal4);


             retval.f = new Fighter((STRING1!=null?STRING1.getText():null)); 

            // AST REWRITE
            // elements: STRING, spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 33:3: -> ^( STRING ( spec )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:33:6: ^( STRING ( spec )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_STRING.nextNode()
                , root_1);

                if ( !(stream_spec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_spec.hasNext() ) {
                    adaptor.addChild(root_1, stream_spec.nextTree());

                }
                stream_spec.reset();

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


    public static class spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spec"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:36:1: spec : ( personality | behaviour ) ;
    public final SAFParser.spec_return spec() throws RecognitionException {
        SAFParser.spec_return retval = new SAFParser.spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.personality_return personality5 =null;

        SAFParser.behaviour_return behaviour6 =null;



        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:37:2: ( ( personality | behaviour ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:37:4: ( personality | behaviour )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:37:4: ( personality | behaviour )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==16) ) {
                    alt2=1;
                }
                else if ( (LA2_1==AND||LA2_1==OR||LA2_1==17) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:37:5: personality
                    {
                    pushFollow(FOLLOW_personality_in_spec127);
                    personality5=personality();

                    state._fsp--;

                    adaptor.addChild(root_0, personality5.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:37:19: behaviour
                    {
                    pushFollow(FOLLOW_behaviour_in_spec131);
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


    public static class personality_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:40:1: personality : assignment -> ^( PERSONALITY assignment ) ;
    public final SAFParser.personality_return personality() throws RecognitionException {
        SAFParser.personality_return retval = new SAFParser.personality_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.assignment_return assignment7 =null;


        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:41:2: ( assignment -> ^( PERSONALITY assignment ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:41:4: assignment
            {
            pushFollow(FOLLOW_assignment_in_personality143);
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
            // 41:15: -> ^( PERSONALITY assignment )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:41:18: ^( PERSONALITY assignment )
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
    // $ANTLR end "personality"


    public static class behaviour_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:44:1: behaviour : tactic -> ^( BEHAVIOUR tactic ) ;
    public final SAFParser.behaviour_return behaviour() throws RecognitionException {
        SAFParser.behaviour_return retval = new SAFParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.tactic_return tactic8 =null;


        RewriteRuleSubtreeStream stream_tactic=new RewriteRuleSubtreeStream(adaptor,"rule tactic");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:45:2: ( tactic -> ^( BEHAVIOUR tactic ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:45:4: tactic
            {
            pushFollow(FOLLOW_tactic_in_behaviour163);
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
            // 45:11: -> ^( BEHAVIOUR tactic )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:45:14: ^( BEHAVIOUR tactic )
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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:48:1: tactic : condition '[' move attack ']' -> condition move attack ;
    public final SAFParser.tactic_return tactic() throws RecognitionException {
        SAFParser.tactic_return retval = new SAFParser.tactic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal10=null;
        Token char_literal13=null;
        SAFParser.condition_return condition9 =null;

        SAFParser.move_return move11 =null;

        SAFParser.attack_return attack12 =null;


        Object char_literal10_tree=null;
        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_attack=new RewriteRuleSubtreeStream(adaptor,"rule attack");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:49:2: ( condition '[' move attack ']' -> condition move attack )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:49:4: condition '[' move attack ']'
            {
            pushFollow(FOLLOW_condition_in_tactic182);
            condition9=condition();

            state._fsp--;

            stream_condition.add(condition9.getTree());

            char_literal10=(Token)match(input,17,FOLLOW_17_in_tactic184);  
            stream_17.add(char_literal10);


            pushFollow(FOLLOW_move_in_tactic186);
            move11=move();

            state._fsp--;

            stream_move.add(move11.getTree());

            pushFollow(FOLLOW_attack_in_tactic188);
            attack12=attack();

            state._fsp--;

            stream_attack.add(attack12.getTree());

            char_literal13=(Token)match(input,18,FOLLOW_18_in_tactic190);  
            stream_18.add(char_literal13);


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
            // 49:34: -> condition move attack
            {
                adaptor.addChild(root_0, stream_condition.nextTree());

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
    // $ANTLR end "tactic"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:52:1: assignment : strength '=' NUMBER -> strength NUMBER ;
    public final SAFParser.assignment_return assignment() throws RecognitionException {
        SAFParser.assignment_return retval = new SAFParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal15=null;
        Token NUMBER16=null;
        SAFParser.strength_return strength14 =null;


        Object char_literal15_tree=null;
        Object NUMBER16_tree=null;
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_strength=new RewriteRuleSubtreeStream(adaptor,"rule strength");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:53:2: ( strength '=' NUMBER -> strength NUMBER )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:53:4: strength '=' NUMBER
            {
            pushFollow(FOLLOW_strength_in_assignment210);
            strength14=strength();

            state._fsp--;

            stream_strength.add(strength14.getTree());

            char_literal15=(Token)match(input,16,FOLLOW_16_in_assignment212);  
            stream_16.add(char_literal15);


            NUMBER16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_assignment214);  
            stream_NUMBER.add(NUMBER16);


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
            // 53:24: -> strength NUMBER
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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:56:1: strength : STRING ;
    public final SAFParser.strength_return strength() throws RecognitionException {
        SAFParser.strength_return retval = new SAFParser.strength_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING17=null;

        Object STRING17_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:57:2: ( STRING )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:57:4: STRING
            {
            root_0 = (Object)adaptor.nil();


            STRING17=(Token)match(input,STRING,FOLLOW_STRING_in_strength231); 
            STRING17_tree = 
            (Object)adaptor.create(STRING17)
            ;
            adaptor.addChild(root_0, STRING17_tree);


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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:60:1: condition : ( condition_or | condition_and | STRING ) ;
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING20=null;
        SAFParser.condition_or_return condition_or18 =null;

        SAFParser.condition_and_return condition_and19 =null;


        Object STRING20_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:61:2: ( ( condition_or | condition_and | STRING ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:61:4: ( condition_or | condition_and | STRING )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:61:4: ( condition_or | condition_and | STRING )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==STRING) ) {
                switch ( input.LA(2) ) {
                case OR:
                    {
                    alt3=1;
                    }
                    break;
                case AND:
                    {
                    alt3=2;
                    }
                    break;
                case 17:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:61:5: condition_or
                    {
                    pushFollow(FOLLOW_condition_or_in_condition244);
                    condition_or18=condition_or();

                    state._fsp--;

                    adaptor.addChild(root_0, condition_or18.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:61:20: condition_and
                    {
                    pushFollow(FOLLOW_condition_and_in_condition248);
                    condition_and19=condition_and();

                    state._fsp--;

                    adaptor.addChild(root_0, condition_and19.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:61:36: STRING
                    {
                    STRING20=(Token)match(input,STRING,FOLLOW_STRING_in_condition252); 
                    STRING20_tree = 
                    (Object)adaptor.create(STRING20)
                    ;
                    adaptor.addChild(root_0, STRING20_tree);


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
    // $ANTLR end "condition"


    public static class condition_or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_or"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:64:1: condition_or : STRING ( OR STRING )+ -> ^( OR ( STRING )+ ) ;
    public final SAFParser.condition_or_return condition_or() throws RecognitionException {
        SAFParser.condition_or_return retval = new SAFParser.condition_or_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING21=null;
        Token OR22=null;
        Token STRING23=null;

        Object STRING21_tree=null;
        Object OR22_tree=null;
        Object STRING23_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:65:2: ( STRING ( OR STRING )+ -> ^( OR ( STRING )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:65:4: STRING ( OR STRING )+
            {
            STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_condition_or264);  
            stream_STRING.add(STRING21);


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:65:11: ( OR STRING )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==OR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:65:12: OR STRING
            	    {
            	    OR22=(Token)match(input,OR,FOLLOW_OR_in_condition_or267);  
            	    stream_OR.add(OR22);


            	    STRING23=(Token)match(input,STRING,FOLLOW_STRING_in_condition_or269);  
            	    stream_STRING.add(STRING23);


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            // AST REWRITE
            // elements: STRING, OR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 65:24: -> ^( OR ( STRING )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:65:27: ^( OR ( STRING )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_OR.nextNode()
                , root_1);

                if ( !(stream_STRING.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING.nextNode()
                    );

                }
                stream_STRING.reset();

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
    // $ANTLR end "condition_or"


    public static class condition_and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_and"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:68:1: condition_and : STRING ( AND STRING )+ -> ^( AND ( STRING )+ ) ;
    public final SAFParser.condition_and_return condition_and() throws RecognitionException {
        SAFParser.condition_and_return retval = new SAFParser.condition_and_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING24=null;
        Token AND25=null;
        Token STRING26=null;

        Object STRING24_tree=null;
        Object AND25_tree=null;
        Object STRING26_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:69:2: ( STRING ( AND STRING )+ -> ^( AND ( STRING )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:69:4: STRING ( AND STRING )+
            {
            STRING24=(Token)match(input,STRING,FOLLOW_STRING_in_condition_and292);  
            stream_STRING.add(STRING24);


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:69:11: ( AND STRING )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==AND) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:69:12: AND STRING
            	    {
            	    AND25=(Token)match(input,AND,FOLLOW_AND_in_condition_and295);  
            	    stream_AND.add(AND25);


            	    STRING26=(Token)match(input,STRING,FOLLOW_STRING_in_condition_and297);  
            	    stream_STRING.add(STRING26);


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            // AST REWRITE
            // elements: AND, STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 69:25: -> ^( AND ( STRING )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:69:28: ^( AND ( STRING )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_AND.nextNode()
                , root_1);

                if ( !(stream_STRING.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING.nextNode()
                    );

                }
                stream_STRING.reset();

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
    // $ANTLR end "condition_and"


    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:72:1: move : ( choose_move | STRING ) ;
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING28=null;
        SAFParser.choose_move_return choose_move27 =null;


        Object STRING28_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:73:2: ( ( choose_move | STRING ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:73:4: ( choose_move | STRING )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:73:4: ( choose_move | STRING )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CHOOSE) ) {
                alt6=1;
            }
            else if ( (LA6_0==STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:73:5: choose_move
                    {
                    pushFollow(FOLLOW_choose_move_in_move320);
                    choose_move27=choose_move();

                    state._fsp--;

                    adaptor.addChild(root_0, choose_move27.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:73:19: STRING
                    {
                    STRING28=(Token)match(input,STRING,FOLLOW_STRING_in_move324); 
                    STRING28_tree = 
                    (Object)adaptor.create(STRING28)
                    ;
                    adaptor.addChild(root_0, STRING28_tree);


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
    // $ANTLR end "move"


    public static class choose_move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "choose_move"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:76:1: choose_move : CHOOSE '(' ( STRING )+ ')' -> ^( CHOOSE ( STRING )+ ) ;
    public final SAFParser.choose_move_return choose_move() throws RecognitionException {
        SAFParser.choose_move_return retval = new SAFParser.choose_move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE29=null;
        Token char_literal30=null;
        Token STRING31=null;
        Token char_literal32=null;

        Object CHOOSE29_tree=null;
        Object char_literal30_tree=null;
        Object STRING31_tree=null;
        Object char_literal32_tree=null;
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:77:2: ( CHOOSE '(' ( STRING )+ ')' -> ^( CHOOSE ( STRING )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:77:4: CHOOSE '(' ( STRING )+ ')'
            {
            CHOOSE29=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_choose_move336);  
            stream_CHOOSE.add(CHOOSE29);


            char_literal30=(Token)match(input,14,FOLLOW_14_in_choose_move338);  
            stream_14.add(char_literal30);


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:77:15: ( STRING )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:77:15: STRING
            	    {
            	    STRING31=(Token)match(input,STRING,FOLLOW_STRING_in_choose_move340);  
            	    stream_STRING.add(STRING31);


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            char_literal32=(Token)match(input,15,FOLLOW_15_in_choose_move343);  
            stream_15.add(char_literal32);


            // AST REWRITE
            // elements: CHOOSE, STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 77:27: -> ^( CHOOSE ( STRING )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:77:30: ^( CHOOSE ( STRING )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_CHOOSE.nextNode()
                , root_1);

                if ( !(stream_STRING.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING.nextNode()
                    );

                }
                stream_STRING.reset();

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
    // $ANTLR end "choose_move"


    public static class attack_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attack"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:80:1: attack : ( attack_move | STRING ) ;
    public final SAFParser.attack_return attack() throws RecognitionException {
        SAFParser.attack_return retval = new SAFParser.attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING34=null;
        SAFParser.attack_move_return attack_move33 =null;


        Object STRING34_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:81:2: ( ( attack_move | STRING ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:81:4: ( attack_move | STRING )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:81:4: ( attack_move | STRING )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==CHOOSE) ) {
                alt8=1;
            }
            else if ( (LA8_0==STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:81:6: attack_move
                    {
                    pushFollow(FOLLOW_attack_move_in_attack365);
                    attack_move33=attack_move();

                    state._fsp--;

                    adaptor.addChild(root_0, attack_move33.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:81:20: STRING
                    {
                    STRING34=(Token)match(input,STRING,FOLLOW_STRING_in_attack369); 
                    STRING34_tree = 
                    (Object)adaptor.create(STRING34)
                    ;
                    adaptor.addChild(root_0, STRING34_tree);


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
    // $ANTLR end "attack"


    public static class attack_move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attack_move"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:84:1: attack_move : CHOOSE '(' ( STRING )+ ')' -> ^( CHOOSE ( STRING )+ ) ;
    public final SAFParser.attack_move_return attack_move() throws RecognitionException {
        SAFParser.attack_move_return retval = new SAFParser.attack_move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE35=null;
        Token char_literal36=null;
        Token STRING37=null;
        Token char_literal38=null;

        Object CHOOSE35_tree=null;
        Object char_literal36_tree=null;
        Object STRING37_tree=null;
        Object char_literal38_tree=null;
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:85:2: ( CHOOSE '(' ( STRING )+ ')' -> ^( CHOOSE ( STRING )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:85:4: CHOOSE '(' ( STRING )+ ')'
            {
            CHOOSE35=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_attack_move382);  
            stream_CHOOSE.add(CHOOSE35);


            char_literal36=(Token)match(input,14,FOLLOW_14_in_attack_move384);  
            stream_14.add(char_literal36);


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:85:15: ( STRING )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:85:15: STRING
            	    {
            	    STRING37=(Token)match(input,STRING,FOLLOW_STRING_in_attack_move386);  
            	    stream_STRING.add(STRING37);


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            char_literal38=(Token)match(input,15,FOLLOW_15_in_attack_move389);  
            stream_15.add(char_literal38);


            // AST REWRITE
            // elements: STRING, CHOOSE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 85:27: -> ^( CHOOSE ( STRING )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:85:30: ^( CHOOSE ( STRING )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_CHOOSE.nextNode()
                , root_1);

                if ( !(stream_STRING.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STRING.nextNode()
                    );

                }
                stream_STRING.reset();

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
    // $ANTLR end "attack_move"

    // Delegated rules


 

    public static final BitSet FOLLOW_STRING_in_fighter95 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_fighter97 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_spec_in_fighter99 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_20_in_fighter102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personality_in_spec127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_spec131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_personality143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tactic_in_behaviour163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_tactic182 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_tactic184 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_move_in_tactic186 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_attack_in_tactic188 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_tactic190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strength_in_assignment210 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_assignment212 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_assignment214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_strength231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_or_in_condition244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_and_in_condition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_condition252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_condition_or264 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OR_in_condition_or267 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_condition_or269 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_STRING_in_condition_and292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_condition_and295 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_condition_and297 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_choose_move_in_move320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_move324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_choose_move336 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_choose_move338 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_choose_move340 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_choose_move343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attack_move_in_attack365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_attack369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_attack_move382 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_attack_move384 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_attack_move386 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_attack_move389 = new BitSet(new long[]{0x0000000000000002L});

}