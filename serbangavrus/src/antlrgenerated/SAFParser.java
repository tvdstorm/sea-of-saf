// $ANTLR 3.4 D:\\Master\\Software Construction\\ANTLR\\SAF.g 2012-02-18 14:34:18

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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:31:1: fighter returns [Fighter f] : STRING '{' (s= spec )+ '}' -> ^( STRING ( spec )+ ) '{' ;
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:32:2: ( STRING '{' (s= spec )+ '}' -> ^( STRING ( spec )+ ) '{' )
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
            // elements: 19, STRING, spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 37:2: -> ^( STRING ( spec )+ ) '{'
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

                adaptor.addChild(root_0, 
                stream_19.nextNode()
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
    // $ANTLR end "fighter"


    public static class spec_return extends ParserRuleReturnScope {
        public Specification s;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spec"
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:41:1: spec returns [Specification s] : (p= personality |b= behaviour ) ;
    public final SAFParser.spec_return spec() throws RecognitionException {
        SAFParser.spec_return retval = new SAFParser.spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.personality_return p =null;

        SAFParser.behaviour_return b =null;



        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:42:2: ( (p= personality |b= behaviour ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:42:3: (p= personality |b= behaviour )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:42:3: (p= personality |b= behaviour )
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
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:42:4: p= personality
                    {
                    pushFollow(FOLLOW_personality_in_spec147);
                    p=personality();

                    state._fsp--;

                    adaptor.addChild(root_0, p.getTree());

                    	retval.s = (p!=null?p.p:null);
                    					

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:44:4: b= behaviour
                    {
                    pushFollow(FOLLOW_behaviour_in_spec158);
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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:49:1: personality returns [Personality p] : s= strength '=' n= NUMBER -> ^( PERSONALITY strength NUMBER ) ;
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
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:50:2: (s= strength '=' n= NUMBER -> ^( PERSONALITY strength NUMBER ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:50:4: s= strength '=' n= NUMBER
            {
            pushFollow(FOLLOW_strength_in_personality182);
            s=strength();

            state._fsp--;

            stream_strength.add(s.getTree());

            char_literal4=(Token)match(input,16,FOLLOW_16_in_personality184);  
            stream_16.add(char_literal4);


            n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_personality188);  
            stream_NUMBER.add(n);


            	retval.p = new Personality((s!=null?s.str:null), Integer.parseInt((n!=null?n.getText():null)));
            					

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
            // 52:2: -> ^( PERSONALITY strength NUMBER )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:52:5: ^( PERSONALITY strength NUMBER )
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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:55:1: behaviour returns [Behaviour b] : c= condition '[' m= move a= attack ']' -> ^( BEHAVIOUR condition move attack ) ;
    public final SAFParser.behaviour_return behaviour() throws RecognitionException {
        SAFParser.behaviour_return retval = new SAFParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal5=null;
        Token char_literal6=null;
        SAFParser.condition_return c =null;

        SAFParser.move_return m =null;

        SAFParser.attack_return a =null;


        Object char_literal5_tree=null;
        Object char_literal6_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_attack=new RewriteRuleSubtreeStream(adaptor,"rule attack");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:56:2: (c= condition '[' m= move a= attack ']' -> ^( BEHAVIOUR condition move attack ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:56:4: c= condition '[' m= move a= attack ']'
            {
            pushFollow(FOLLOW_condition_in_behaviour220);
            c=condition();

            state._fsp--;

            stream_condition.add(c.getTree());

            char_literal5=(Token)match(input,17,FOLLOW_17_in_behaviour222);  
            stream_17.add(char_literal5);


            pushFollow(FOLLOW_move_in_behaviour226);
            m=move();

            state._fsp--;

            stream_move.add(m.getTree());

            pushFollow(FOLLOW_attack_in_behaviour230);
            a=attack();

            state._fsp--;

            stream_attack.add(a.getTree());

            char_literal6=(Token)match(input,18,FOLLOW_18_in_behaviour232);  
            stream_18.add(char_literal6);


            	retval.b = new Behaviour();
            							retval.b.setCondition((c!=null?c.cond:null));
            							retval.b.setMove((m!=null?m.move:null));
            							retval.b.setAttack((a!=null?a.attack:null));
            						

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
            // 61:2: -> ^( BEHAVIOUR condition move attack )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:61:5: ^( BEHAVIOUR condition move attack )
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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:64:1: strength returns [String str] : STRING ;
    public final SAFParser.strength_return strength() throws RecognitionException {
        SAFParser.strength_return retval = new SAFParser.strength_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING7=null;

        Object STRING7_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:65:2: ( STRING )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:65:4: STRING
            {
            root_0 = (Object)adaptor.nil();


            STRING7=(Token)match(input,STRING,FOLLOW_STRING_in_strength262); 
            STRING7_tree = 
            (Object)adaptor.create(STRING7)
            ;
            adaptor.addChild(root_0, STRING7_tree);


            	retval.str = (STRING7!=null?STRING7.getText():null);
            					

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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:69:1: condition returns [Condition cond] : (c_o= condition_or |c_a= condition_and | STRING ) ;
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING8=null;
        SAFParser.condition_or_return c_o =null;

        SAFParser.condition_and_return c_a =null;


        Object STRING8_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:70:2: ( (c_o= condition_or |c_a= condition_and | STRING ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:70:4: (c_o= condition_or |c_a= condition_and | STRING )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:70:4: (c_o= condition_or |c_a= condition_and | STRING )
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
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:70:5: c_o= condition_or
                    {
                    pushFollow(FOLLOW_condition_or_in_condition285);
                    c_o=condition_or();

                    state._fsp--;

                    adaptor.addChild(root_0, c_o.getTree());

                    	retval.cond = c_o.cond;
                    					

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:72:4: c_a= condition_and
                    {
                    pushFollow(FOLLOW_condition_and_in_condition296);
                    c_a=condition_and();

                    state._fsp--;

                    adaptor.addChild(root_0, c_a.getTree());

                    	retval.cond = c_a.cond;
                    					

                    }
                    break;
                case 3 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:74:4: STRING
                    {
                    STRING8=(Token)match(input,STRING,FOLLOW_STRING_in_condition304); 
                    STRING8_tree = 
                    (Object)adaptor.create(STRING8)
                    ;
                    adaptor.addChild(root_0, STRING8_tree);


                    	retval.cond = new Condition();
                    						retval.cond.addCondition((STRING8!=null?STRING8.getText():null));
                    					

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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:80:1: condition_or returns [Condition cond] :s1= STRING ( OR s2= STRING )+ -> ^( OR ( STRING )+ ) ;
    public final SAFParser.condition_or_return condition_or() throws RecognitionException {
        SAFParser.condition_or_return retval = new SAFParser.condition_or_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token s1=null;
        Token s2=null;
        Token OR9=null;

        Object s1_tree=null;
        Object s2_tree=null;
        Object OR9_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:81:2: (s1= STRING ( OR s2= STRING )+ -> ^( OR ( STRING )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:81:7: s1= STRING ( OR s2= STRING )+
            {
            	retval.cond = new ConditionOr();
            					

            s1=(Token)match(input,STRING,FOLLOW_STRING_in_condition_or334);  
            stream_STRING.add(s1);


            	retval.cond.addCondition((s1!=null?s1.getText():null));
            					

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:85:2: ( OR s2= STRING )+
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
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:85:3: OR s2= STRING
            	    {
            	    OR9=(Token)match(input,OR,FOLLOW_OR_in_condition_or342);  
            	    stream_OR.add(OR9);


            	    s2=(Token)match(input,STRING,FOLLOW_STRING_in_condition_or346);  
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
            // 88:2: -> ^( OR ( STRING )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:88:5: ^( OR ( STRING )+ )
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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:91:1: condition_and returns [Condition cond] :s1= STRING ( AND s2= STRING )+ -> ^( AND ( STRING )+ ) ;
    public final SAFParser.condition_and_return condition_and() throws RecognitionException {
        SAFParser.condition_and_return retval = new SAFParser.condition_and_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token s1=null;
        Token s2=null;
        Token AND10=null;

        Object s1_tree=null;
        Object s2_tree=null;
        Object AND10_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:92:2: (s1= STRING ( AND s2= STRING )+ -> ^( AND ( STRING )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:92:7: s1= STRING ( AND s2= STRING )+
            {
            	retval.cond = new ConditionAnd();
            					

            s1=(Token)match(input,STRING,FOLLOW_STRING_in_condition_and388);  
            stream_STRING.add(s1);


            	retval.cond.addCondition((s1!=null?s1.getText():null));
            					

            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:96:2: ( AND s2= STRING )+
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
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:96:3: AND s2= STRING
            	    {
            	    AND10=(Token)match(input,AND,FOLLOW_AND_in_condition_and396);  
            	    stream_AND.add(AND10);


            	    s2=(Token)match(input,STRING,FOLLOW_STRING_in_condition_and400);  
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
            // 99:2: -> ^( AND ( STRING )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:99:5: ^( AND ( STRING )+ )
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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:102:1: move returns [Move move] : (c_m= choose_move | STRING ) ;
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING11=null;
        SAFParser.choose_move_return c_m =null;


        Object STRING11_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:103:2: ( (c_m= choose_move | STRING ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:103:4: (c_m= choose_move | STRING )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:103:4: (c_m= choose_move | STRING )
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
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:103:5: c_m= choose_move
                    {
                    pushFollow(FOLLOW_choose_move_in_move436);
                    c_m=choose_move();

                    state._fsp--;

                    adaptor.addChild(root_0, c_m.getTree());

                    	retval.move = (c_m!=null?c_m.move:null);
                    					

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:105:4: STRING
                    {
                    STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_move444); 
                    STRING11_tree = 
                    (Object)adaptor.create(STRING11)
                    ;
                    adaptor.addChild(root_0, STRING11_tree);


                    	retval.move = new Move();
                    						retval.move.addMove((STRING11!=null?STRING11.getText():null));
                    					

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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:111:1: choose_move returns [Move move] : CHOOSE '(' ( STRING )+ ')' -> ^( CHOOSE ( STRING )+ ) ;
    public final SAFParser.choose_move_return choose_move() throws RecognitionException {
        SAFParser.choose_move_return retval = new SAFParser.choose_move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE12=null;
        Token char_literal13=null;
        Token STRING14=null;
        Token char_literal15=null;

        Object CHOOSE12_tree=null;
        Object char_literal13_tree=null;
        Object STRING14_tree=null;
        Object char_literal15_tree=null;
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:112:2: ( CHOOSE '(' ( STRING )+ ')' -> ^( CHOOSE ( STRING )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:112:7: CHOOSE '(' ( STRING )+ ')'
            {
            	retval.move = new Move();
            					

            CHOOSE12=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_choose_move472);  
            stream_CHOOSE.add(CHOOSE12);


            char_literal13=(Token)match(input,14,FOLLOW_14_in_choose_move474);  
            stream_14.add(char_literal13);


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:114:13: ( STRING )+
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
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:114:14: STRING
            	    {
            	    STRING14=(Token)match(input,STRING,FOLLOW_STRING_in_choose_move477);  
            	    stream_STRING.add(STRING14);


            	    	retval.move.addMove((STRING14!=null?STRING14.getText():null));
            	    					

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


            char_literal15=(Token)match(input,15,FOLLOW_15_in_choose_move486);  
            stream_15.add(char_literal15);


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
            // 117:2: -> ^( CHOOSE ( STRING )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:117:5: ^( CHOOSE ( STRING )+ )
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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:120:1: attack returns [Attack attack] : (c_a= choose_attack | STRING ) ;
    public final SAFParser.attack_return attack() throws RecognitionException {
        SAFParser.attack_return retval = new SAFParser.attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING16=null;
        SAFParser.choose_attack_return c_a =null;


        Object STRING16_tree=null;

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:121:2: ( (c_a= choose_attack | STRING ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:121:4: (c_a= choose_attack | STRING )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:121:4: (c_a= choose_attack | STRING )
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
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:121:6: c_a= choose_attack
                    {
                    pushFollow(FOLLOW_choose_attack_in_attack515);
                    c_a=choose_attack();

                    state._fsp--;

                    adaptor.addChild(root_0, c_a.getTree());

                    	retval.attack = (c_a!=null?c_a.attack:null);
                    					

                    }
                    break;
                case 2 :
                    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:123:4: STRING
                    {
                    STRING16=(Token)match(input,STRING,FOLLOW_STRING_in_attack523); 
                    STRING16_tree = 
                    (Object)adaptor.create(STRING16)
                    ;
                    adaptor.addChild(root_0, STRING16_tree);


                    	retval.attack = new Attack();
                    						retval.attack.addAttack((STRING16!=null?STRING16.getText():null));
                    					

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
    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:129:1: choose_attack returns [Attack attack] : CHOOSE '(' ( STRING )+ ')' -> ^( CHOOSE ( STRING )+ ) ;
    public final SAFParser.choose_attack_return choose_attack() throws RecognitionException {
        SAFParser.choose_attack_return retval = new SAFParser.choose_attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE17=null;
        Token char_literal18=null;
        Token STRING19=null;
        Token char_literal20=null;

        Object CHOOSE17_tree=null;
        Object char_literal18_tree=null;
        Object STRING19_tree=null;
        Object char_literal20_tree=null;
        RewriteRuleTokenStream stream_CHOOSE=new RewriteRuleTokenStream(adaptor,"token CHOOSE");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:130:2: ( CHOOSE '(' ( STRING )+ ')' -> ^( CHOOSE ( STRING )+ ) )
            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:130:7: CHOOSE '(' ( STRING )+ ')'
            {
            	retval.attack = new Attack();
            					

            CHOOSE17=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_choose_attack551);  
            stream_CHOOSE.add(CHOOSE17);


            char_literal18=(Token)match(input,14,FOLLOW_14_in_choose_attack553);  
            stream_14.add(char_literal18);


            // D:\\Master\\Software Construction\\ANTLR\\SAF.g:132:13: ( STRING )+
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
            	    // D:\\Master\\Software Construction\\ANTLR\\SAF.g:132:14: STRING
            	    {
            	    STRING19=(Token)match(input,STRING,FOLLOW_STRING_in_choose_attack556);  
            	    stream_STRING.add(STRING19);


            	    	retval.attack.addAttack((STRING19!=null?STRING19.getText():null));
            	    					

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


            char_literal20=(Token)match(input,15,FOLLOW_15_in_choose_attack565);  
            stream_15.add(char_literal20);


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
            // 134:9: -> ^( CHOOSE ( STRING )+ )
            {
                // D:\\Master\\Software Construction\\ANTLR\\SAF.g:134:12: ^( CHOOSE ( STRING )+ )
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
    public static final BitSet FOLLOW_personality_in_spec147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_spec158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strength_in_personality182 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_personality184 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_personality188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour220 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_behaviour222 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_move_in_behaviour226 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_attack_in_behaviour230 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_behaviour232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_strength262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_or_in_condition285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_and_in_condition296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_condition304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_condition_or334 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OR_in_condition_or342 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_condition_or346 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_STRING_in_condition_and388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_condition_and396 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_condition_and400 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_choose_move_in_move436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_move444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_choose_move472 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_choose_move474 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_choose_move477 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_choose_move486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_attack_in_attack515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_attack523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_choose_attack551 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_choose_attack553 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_choose_attack556 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_choose_attack565 = new BitSet(new long[]{0x0000000000000002L});

}