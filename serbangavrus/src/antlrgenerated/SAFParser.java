// $ANTLR 3.4 D:\\Master\\Software Construction\\ANTLR\\SAF.g 2012-01-30 20:35:19

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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:31:1: fighter returns [Fighter f] : STRING '{' (s= spec )+ '}' -> ^( STRING ( spec )+ ) ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING1=null;
        Token char_literal2=null;
        Token char_literal3=null;
        SAFParser.spec_return s =null;


        Object STRING1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal3_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_spec=new RewriteRuleSubtreeStream(adaptor,"rule spec");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:2: ( STRING '{' (s= spec )+ '}' -> ^( STRING ( spec )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:4: STRING '{' (s= spec )+ '}'
            {
            STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_fighter95);  
            stream_STRING.add(STRING1);


            	retval.f = new Fighter((STRING1!=null?STRING1.getText():null));
            					

            char_literal2=(Token)match(input,19,FOLLOW_19_in_fighter102);  
            stream_19.add(char_literal2);


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:34:6: (s= spec )+
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
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:34:7: s= spec
            	    {
            	    pushFollow(FOLLOW_spec_in_fighter107);
            	    s=spec();

            	    state._fsp--;

            	    stream_spec.add(s.getTree());

            	    	retval.f.addSpec((s!=null?s.s:null));
            	    					

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


            char_literal3=(Token)match(input,20,FOLLOW_20_in_fighter117);  
            stream_20.add(char_literal3);


            // AST REWRITE
            // elements: spec, STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 37:2: -> ^( STRING ( spec )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:37:5: ^( STRING ( spec )+ )
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
        public Specification s;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spec"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:40:1: spec returns [Specification s] : (p= personality |b= behaviour ) ;
    public final SAFParser.spec_return spec() throws RecognitionException {
        SAFParser.spec_return retval = new SAFParser.spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.personality_return p =null;

        SAFParser.behaviour_return b =null;



        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:41:2: ( (p= personality |b= behaviour ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:41:3: (p= personality |b= behaviour )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:41:3: (p= personality |b= behaviour )
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
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:41:4: p= personality
                    {
                    pushFollow(FOLLOW_personality_in_spec144);
                    p=personality();

                    state._fsp--;

                    adaptor.addChild(root_0, p.getTree());

                    	retval.s = (p!=null?p.p:null);
                    					

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:43:4: b= behaviour
                    {
                    pushFollow(FOLLOW_behaviour_in_spec155);
                    b=behaviour();

                    state._fsp--;

                    adaptor.addChild(root_0, b.getTree());

                    	retval.s = (b!=null?b.b:null);
                    					

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
        public Personality p;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:48:1: personality returns [Personality p] : s= strength '=' n= NUMBER -> ^( PERSONALITY strength NUMBER ) ;
    public final SAFParser.personality_return personality() throws RecognitionException {
        SAFParser.personality_return retval = new SAFParser.personality_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token n=null;
        Token char_literal4=null;
        SAFParser.strength_return s =null;


        Object n_tree=null;
        Object char_literal4_tree=null;
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_strength=new RewriteRuleSubtreeStream(adaptor,"rule strength");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:49:2: (s= strength '=' n= NUMBER -> ^( PERSONALITY strength NUMBER ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:49:4: s= strength '=' n= NUMBER
            {
            pushFollow(FOLLOW_strength_in_personality179);
            s=strength();

            state._fsp--;

            stream_strength.add(s.getTree());

            char_literal4=(Token)match(input,16,FOLLOW_16_in_personality181);  
            stream_16.add(char_literal4);


            n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_personality185);  
            stream_NUMBER.add(n);


            	retval.p = new Personality((s!=null?s.str:null), Integer.parseInt((n!=null?n.getText():null)));
            					

            // AST REWRITE
            // elements: NUMBER, strength
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 51:2: -> ^( PERSONALITY strength NUMBER )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:51:5: ^( PERSONALITY strength NUMBER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PERSONALITY, "PERSONALITY")
                , root_1);

                adaptor.addChild(root_1, stream_strength.nextTree());

                adaptor.addChild(root_1, 
                stream_NUMBER.nextNode()
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
        return retval;
    }
    // $ANTLR end "personality"


    public static class behaviour_return extends ParserRuleReturnScope {
        public Behaviour b;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:54:1: behaviour returns [Behaviour b] : c= condition '[' move attack ']' -> ^( BEHAVIOUR condition move attack ) ;
    public final SAFParser.behaviour_return behaviour() throws RecognitionException {
        SAFParser.behaviour_return retval = new SAFParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal5=null;
        Token char_literal8=null;
        SAFParser.condition_return c =null;

        SAFParser.move_return move6 =null;

        SAFParser.attack_return attack7 =null;


        Object char_literal5_tree=null;
        Object char_literal8_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_attack=new RewriteRuleSubtreeStream(adaptor,"rule attack");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:55:2: (c= condition '[' move attack ']' -> ^( BEHAVIOUR condition move attack ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:55:4: c= condition '[' move attack ']'
            {
            pushFollow(FOLLOW_condition_in_behaviour217);
            c=condition();

            state._fsp--;

            stream_condition.add(c.getTree());

            char_literal5=(Token)match(input,17,FOLLOW_17_in_behaviour219);  
            stream_17.add(char_literal5);


            pushFollow(FOLLOW_move_in_behaviour221);
            move6=move();

            state._fsp--;

            stream_move.add(move6.getTree());

            pushFollow(FOLLOW_attack_in_behaviour223);
            attack7=attack();

            state._fsp--;

            stream_attack.add(attack7.getTree());

            char_literal8=(Token)match(input,18,FOLLOW_18_in_behaviour225);  
            stream_18.add(char_literal8);


            	retval.b = new Behaviour();
            							retval.b.addCondition((c!=null?c.cond:null));
            						

            // AST REWRITE
            // elements: attack, move, condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 58:2: -> ^( BEHAVIOUR condition move attack )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:58:5: ^( BEHAVIOUR condition move attack )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BEHAVIOUR, "BEHAVIOUR")
                , root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_1, stream_move.nextTree());

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
        return retval;
    }
    // $ANTLR end "behaviour"


    public static class strength_return extends ParserRuleReturnScope {
        public String str;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "strength"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:61:1: strength returns [String str] : STRING ;
    public final SAFParser.strength_return strength() throws RecognitionException {
        SAFParser.strength_return retval = new SAFParser.strength_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING9=null;

        Object STRING9_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:62:2: ( STRING )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:62:4: STRING
            {
            root_0 = (Object)adaptor.nil();


            STRING9=(Token)match(input,STRING,FOLLOW_STRING_in_strength255); 
            STRING9_tree = 
            (Object)adaptor.create(STRING9)
            ;
            adaptor.addChild(root_0, STRING9_tree);


            	retval.str = (STRING9!=null?STRING9.getText():null);
            					

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
        public Condition cond;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:66:1: condition returns [Condition cond] : (c_o= condition_or |c_a= condition_and | STRING ) ;
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING10=null;
        SAFParser.condition_or_return c_o =null;

        SAFParser.condition_and_return c_a =null;


        Object STRING10_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:67:2: ( (c_o= condition_or |c_a= condition_and | STRING ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:67:4: (c_o= condition_or |c_a= condition_and | STRING )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:67:4: (c_o= condition_or |c_a= condition_and | STRING )
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
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:67:5: c_o= condition_or
                    {
                    pushFollow(FOLLOW_condition_or_in_condition278);
                    c_o=condition_or();

                    state._fsp--;

                    adaptor.addChild(root_0, c_o.getTree());

                    	retval.cond = c_o.cond;
                    					

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:69:4: c_a= condition_and
                    {
                    pushFollow(FOLLOW_condition_and_in_condition289);
                    c_a=condition_and();

                    state._fsp--;

                    adaptor.addChild(root_0, c_a.getTree());

                    	retval.cond = c_a.cond;
                    					

                    }
                    break;
                case 3 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:71:4: STRING
                    {
                    STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_condition297); 
                    STRING10_tree = 
                    (Object)adaptor.create(STRING10)
                    ;
                    adaptor.addChild(root_0, STRING10_tree);


                    	retval.cond = new Condition();
                    						retval.cond.addCondition((STRING10!=null?STRING10.getText():null));
                    					

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
        public Condition cond;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_or"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:77:1: condition_or returns [Condition cond] :s1= STRING ( OR s2= STRING )+ -> ^( OR ( STRING )+ ) ;
    public final SAFParser.condition_or_return condition_or() throws RecognitionException {
        SAFParser.condition_or_return retval = new SAFParser.condition_or_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token s1=null;
        Token s2=null;
        Token OR11=null;

        Object s1_tree=null;
        Object s2_tree=null;
        Object OR11_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:78:2: (s1= STRING ( OR s2= STRING )+ -> ^( OR ( STRING )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:78:7: s1= STRING ( OR s2= STRING )+
            {
            	retval.cond = new ConditionOr();
            					

            s1=(Token)match(input,STRING,FOLLOW_STRING_in_condition_or327);  
            stream_STRING.add(s1);


            	retval.cond.addCondition((s1!=null?s1.getText():null));
            					

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:82:2: ( OR s2= STRING )+
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
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:82:3: OR s2= STRING
            	    {
            	    OR11=(Token)match(input,OR,FOLLOW_OR_in_condition_or335);  
            	    stream_OR.add(OR11);


            	    s2=(Token)match(input,STRING,FOLLOW_STRING_in_condition_or339);  
            	    stream_STRING.add(s2);


            	    	retval.cond.addCondition((s2!=null?s2.getText():null));
            	    					

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
            // elements: OR, STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 85:2: -> ^( OR ( STRING )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:85:5: ^( OR ( STRING )+ )
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
        public Condition cond;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_and"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:88:1: condition_and returns [Condition cond] :s1= STRING ( AND s2= STRING )+ -> ^( AND ( STRING )+ ) ;
    public final SAFParser.condition_and_return condition_and() throws RecognitionException {
        SAFParser.condition_and_return retval = new SAFParser.condition_and_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token s1=null;
        Token s2=null;
        Token AND12=null;

        Object s1_tree=null;
        Object s2_tree=null;
        Object AND12_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:89:2: (s1= STRING ( AND s2= STRING )+ -> ^( AND ( STRING )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:89:7: s1= STRING ( AND s2= STRING )+
            {
            	retval.cond = new ConditionAnd();
            					

            s1=(Token)match(input,STRING,FOLLOW_STRING_in_condition_and381);  
            stream_STRING.add(s1);


            	retval.cond.addCondition((s1!=null?s1.getText():null));
            					

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:93:2: ( AND s2= STRING )+
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
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:93:3: AND s2= STRING
            	    {
            	    AND12=(Token)match(input,AND,FOLLOW_AND_in_condition_and389);  
            	    stream_AND.add(AND12);


            	    s2=(Token)match(input,STRING,FOLLOW_STRING_in_condition_and393);  
            	    stream_STRING.add(s2);


            	    	retval.cond.addCondition((s2!=null?s2.getText():null));
            	    					

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
            // elements: STRING, AND
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 96:2: -> ^( AND ( STRING )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:96:5: ^( AND ( STRING )+ )
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
        public Move move;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:99:1: move returns [Move move] : (c_m= choose_move | STRING ) ;
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING13=null;
        SAFParser.choose_move_return c_m =null;


        Object STRING13_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:100:2: ( (c_m= choose_move | STRING ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:100:4: (c_m= choose_move | STRING )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:100:4: (c_m= choose_move | STRING )
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
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:100:5: c_m= choose_move
                    {
                    pushFollow(FOLLOW_choose_move_in_move429);
                    c_m=choose_move();

                    state._fsp--;

                    adaptor.addChild(root_0, c_m.getTree());

                    	retval.move = (c_m!=null?c_m.move:null);
                    					

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:102:4: STRING
                    {
                    STRING13=(Token)match(input,STRING,FOLLOW_STRING_in_move437); 
                    STRING13_tree = 
                    (Object)adaptor.create(STRING13)
                    ;
                    adaptor.addChild(root_0, STRING13_tree);


                    	retval.move = new Move();
                    						retval.move.addMove((STRING13!=null?STRING13.getText():null));
                    					

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
        public Move move;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "choose_move"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:108:1: choose_move returns [Move move] : CHOOSE '(' ( STRING )+ ')' -> ^( CHOOSE ( STRING )+ ) ;
    public final SAFParser.choose_move_return choose_move() throws RecognitionException {
        SAFParser.choose_move_return retval = new SAFParser.choose_move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE14=null;
        Token char_literal15=null;
        Token STRING16=null;
        Token char_literal17=null;

        Object CHOOSE14_tree=null;
        Object char_literal15_tree=null;
        Object STRING16_tree=null;
        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:109:2: ( CHOOSE '(' ( STRING )+ ')' -> ^( CHOOSE ( STRING )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:109:7: CHOOSE '(' ( STRING )+ ')'
            {
            	retval.move = new Move();
            					

            CHOOSE14=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_choose_move465);  
            stream_CHOOSE.add(CHOOSE14);


            char_literal15=(Token)match(input,14,FOLLOW_14_in_choose_move467);  
            stream_14.add(char_literal15);


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:111:13: ( STRING )+
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
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:111:14: STRING
            	    {
            	    STRING16=(Token)match(input,STRING,FOLLOW_STRING_in_choose_move470);  
            	    stream_STRING.add(STRING16);


            	    	retval.move.addMove((STRING16!=null?STRING16.getText():null));
            	    					

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


            char_literal17=(Token)match(input,15,FOLLOW_15_in_choose_move479);  
            stream_15.add(char_literal17);


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
            // 114:2: -> ^( CHOOSE ( STRING )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:114:5: ^( CHOOSE ( STRING )+ )
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
        public Attack attack;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attack"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:117:1: attack returns [Attack attack] : (c_a= choose_attack | STRING ) ;
    public final SAFParser.attack_return attack() throws RecognitionException {
        SAFParser.attack_return retval = new SAFParser.attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING18=null;
        SAFParser.choose_attack_return c_a =null;


        Object STRING18_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:118:2: ( (c_a= choose_attack | STRING ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:118:4: (c_a= choose_attack | STRING )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:118:4: (c_a= choose_attack | STRING )
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
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:118:6: c_a= choose_attack
                    {
                    pushFollow(FOLLOW_choose_attack_in_attack508);
                    c_a=choose_attack();

                    state._fsp--;

                    adaptor.addChild(root_0, c_a.getTree());

                    	retval.attack = (c_a!=null?c_a.attack:null);
                    					

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:120:4: STRING
                    {
                    STRING18=(Token)match(input,STRING,FOLLOW_STRING_in_attack516); 
                    STRING18_tree = 
                    (Object)adaptor.create(STRING18)
                    ;
                    adaptor.addChild(root_0, STRING18_tree);


                    	retval.attack = new Attack();
                    						retval.attack.addAttack((STRING18!=null?STRING18.getText():null));
                    					

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


    public static class choose_attack_return extends ParserRuleReturnScope {
        public Attack attack;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "choose_attack"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:126:1: choose_attack returns [Attack attack] : CHOOSE '(' ( STRING )+ ')' -> ^( CHOOSE ( STRING )+ ) ;
    public final SAFParser.choose_attack_return choose_attack() throws RecognitionException {
        SAFParser.choose_attack_return retval = new SAFParser.choose_attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE19=null;
        Token char_literal20=null;
        Token STRING21=null;
        Token char_literal22=null;

        Object CHOOSE19_tree=null;
        Object char_literal20_tree=null;
        Object STRING21_tree=null;
        Object char_literal22_tree=null;
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:127:2: ( CHOOSE '(' ( STRING )+ ')' -> ^( CHOOSE ( STRING )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:127:7: CHOOSE '(' ( STRING )+ ')'
            {
            	retval.attack = new Attack();
            					

            CHOOSE19=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_choose_attack544);  
            stream_CHOOSE.add(CHOOSE19);


            char_literal20=(Token)match(input,14,FOLLOW_14_in_choose_attack546);  
            stream_14.add(char_literal20);


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:129:13: ( STRING )+
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
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:129:14: STRING
            	    {
            	    STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_choose_attack549);  
            	    stream_STRING.add(STRING21);


            	    	retval.attack.addAttack((STRING21!=null?STRING21.getText():null));
            	    					

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


            char_literal22=(Token)match(input,15,FOLLOW_15_in_choose_attack558);  
            stream_15.add(char_literal22);


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
            // 131:9: -> ^( CHOOSE ( STRING )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:131:12: ^( CHOOSE ( STRING )+ )
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
    // $ANTLR end "choose_attack"

    // Delegated rules


 

    public static final BitSet FOLLOW_STRING_in_fighter95 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_fighter102 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_spec_in_fighter107 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_20_in_fighter117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_personality_in_spec144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_spec155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strength_in_personality179 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_personality181 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_personality185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour217 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_behaviour219 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_move_in_behaviour221 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_attack_in_behaviour223 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_behaviour225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_strength255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_or_in_condition278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_and_in_condition289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_condition297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_condition_or327 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OR_in_condition_or335 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_condition_or339 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_STRING_in_condition_and381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_condition_and389 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_condition_and393 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_choose_move_in_move429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_move437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_choose_move465 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_choose_move467 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_choose_move470 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_choose_move479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_attack_in_attack508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_attack516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_choose_attack544 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_choose_attack546 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_choose_attack549 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_choose_attack558 = new BitSet(new long[]{0x0000000000000002L});

}