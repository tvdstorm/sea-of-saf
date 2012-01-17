// $ANTLR 3.4 src/SAF.g 2012-01-17 09:39:02



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "AND", "BEHAVIOURS", "CONDITION", "CURLY_CLOSE", "CURLY_OPEN", "EQUAL", "LEVEL", "NAME", "OR", "SAF", "SQUARE_CLOSE", "SQUARE_OPEN", "STRING", "TRAITS", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int ACTION=4;
    public static final int AND=5;
    public static final int BEHAVIOURS=6;
    public static final int CONDITION=7;
    public static final int CURLY_CLOSE=8;
    public static final int CURLY_OPEN=9;
    public static final int EQUAL=10;
    public static final int LEVEL=11;
    public static final int NAME=12;
    public static final int OR=13;
    public static final int SAF=14;
    public static final int SQUARE_CLOSE=15;
    public static final int SQUARE_OPEN=16;
    public static final int STRING=17;
    public static final int TRAITS=18;
    public static final int WHITESPACE=19;

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
    public String getGrammarFileName() { return "src/SAF.g"; }


    //    class V extends CommonTree {
    //        public V(Token t) { token=t;}                 // for 'int'<V>
    //        public V(V node) { super(node); }             // for dupNode
    //        public V(int tType, String name) { token=new CommonToken(tType, name); }
    //        public Tree dupNode() { return new V(this); } // for dup'ing type
    //        public String toString() { return token.getText()+"<V>";}
    //    }


    public static class parse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parse"
    // src/SAF.g:45:1: parse : super_awesome_fighter -> ^( SAF[\"SAF\"] super_awesome_fighter ) ;
    public final SAFParser.parse_return parse() throws RecognitionException {
        SAFParser.parse_return retval = new SAFParser.parse_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.super_awesome_fighter_return super_awesome_fighter1 =null;


        RewriteRuleSubtreeStream stream_super_awesome_fighter=new RewriteRuleSubtreeStream(adaptor,"rule super_awesome_fighter");
        try {
            // src/SAF.g:46:5: ( super_awesome_fighter -> ^( SAF[\"SAF\"] super_awesome_fighter ) )
            // src/SAF.g:46:7: super_awesome_fighter
            {
            pushFollow(FOLLOW_super_awesome_fighter_in_parse238);
            super_awesome_fighter1=super_awesome_fighter();

            state._fsp--;

            stream_super_awesome_fighter.add(super_awesome_fighter1.getTree());

            // AST REWRITE
            // elements: super_awesome_fighter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 46:29: -> ^( SAF[\"SAF\"] super_awesome_fighter )
            {
                // src/SAF.g:46:32: ^( SAF[\"SAF\"] super_awesome_fighter )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new SafFighter(SAF, "SAF")
                , root_1);

                adaptor.addChild(root_1, stream_super_awesome_fighter.nextTree());

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
    // $ANTLR end "parse"


    public static class super_awesome_fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "super_awesome_fighter"
    // src/SAF.g:49:1: super_awesome_fighter : name CURLY_OPEN traits behaviour CURLY_CLOSE EOF -> ^( NAME[$name.text] ) ^( TRAITS[$traits.text] traits ) ^( BEHAVIOURS behaviour ) ;
    public final SAFParser.super_awesome_fighter_return super_awesome_fighter() throws RecognitionException {
        SAFParser.super_awesome_fighter_return retval = new SAFParser.super_awesome_fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CURLY_OPEN3=null;
        Token CURLY_CLOSE6=null;
        Token EOF7=null;
        SAFParser.name_return name2 =null;

        SAFParser.traits_return traits4 =null;

        SAFParser.behaviour_return behaviour5 =null;


        Object CURLY_OPEN3_tree=null;
        Object CURLY_CLOSE6_tree=null;
        Object EOF7_tree=null;
        RewriteRuleTokenStream stream_CURLY_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_OPEN");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_CURLY_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_CLOSE");
        RewriteRuleSubtreeStream stream_behaviour=new RewriteRuleSubtreeStream(adaptor,"rule behaviour");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_traits=new RewriteRuleSubtreeStream(adaptor,"rule traits");
        try {
            // src/SAF.g:50:5: ( name CURLY_OPEN traits behaviour CURLY_CLOSE EOF -> ^( NAME[$name.text] ) ^( TRAITS[$traits.text] traits ) ^( BEHAVIOURS behaviour ) )
            // src/SAF.g:50:7: name CURLY_OPEN traits behaviour CURLY_CLOSE EOF
            {
            pushFollow(FOLLOW_name_in_super_awesome_fighter268);
            name2=name();

            state._fsp--;

            stream_name.add(name2.getTree());

            CURLY_OPEN3=(Token)match(input,CURLY_OPEN,FOLLOW_CURLY_OPEN_in_super_awesome_fighter270);  
            stream_CURLY_OPEN.add(CURLY_OPEN3);


            pushFollow(FOLLOW_traits_in_super_awesome_fighter272);
            traits4=traits();

            state._fsp--;

            stream_traits.add(traits4.getTree());

            pushFollow(FOLLOW_behaviour_in_super_awesome_fighter274);
            behaviour5=behaviour();

            state._fsp--;

            stream_behaviour.add(behaviour5.getTree());

            CURLY_CLOSE6=(Token)match(input,CURLY_CLOSE,FOLLOW_CURLY_CLOSE_in_super_awesome_fighter276);  
            stream_CURLY_CLOSE.add(CURLY_CLOSE6);


            EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_super_awesome_fighter278);  
            stream_EOF.add(EOF7);


            // AST REWRITE
            // elements: traits, behaviour
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:56: -> ^( NAME[$name.text] ) ^( TRAITS[$traits.text] traits ) ^( BEHAVIOURS behaviour )
            {
                // src/SAF.g:50:59: ^( NAME[$name.text] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new SafName(NAME, (name2!=null?input.toString(name2.start,name2.stop):null))
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

                // src/SAF.g:50:88: ^( TRAITS[$traits.text] traits )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new SafTraits(TRAITS, (traits4!=null?input.toString(traits4.start,traits4.stop):null))
                , root_1);

                adaptor.addChild(root_1, stream_traits.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // src/SAF.g:50:130: ^( BEHAVIOURS behaviour )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BEHAVIOURS, "BEHAVIOURS")
                , root_1);

                adaptor.addChild(root_1, stream_behaviour.nextTree());

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
    // $ANTLR end "super_awesome_fighter"


    public static class name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // src/SAF.g:53:1: name : STRING ;
    public final SAFParser.name_return name() throws RecognitionException {
        SAFParser.name_return retval = new SAFParser.name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING8=null;

        Object STRING8_tree=null;

        try {
            // src/SAF.g:54:5: ( STRING )
            // src/SAF.g:54:7: STRING
            {
            root_0 = (Object)adaptor.nil();


            STRING8=(Token)match(input,STRING,FOLLOW_STRING_in_name321); 
            STRING8_tree = 
            (Object)adaptor.create(STRING8)
            ;
            adaptor.addChild(root_0, STRING8_tree);


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
    // $ANTLR end "name"


    public static class traits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "traits"
    // src/SAF.g:57:1: traits : ( property EQUAL LEVEL )+ -> ( ^( property LEVEL ) )+ ;
    public final SAFParser.traits_return traits() throws RecognitionException {
        SAFParser.traits_return retval = new SAFParser.traits_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUAL10=null;
        Token LEVEL11=null;
        SAFParser.property_return property9 =null;


        Object EQUAL10_tree=null;
        Object LEVEL11_tree=null;
        RewriteRuleTokenStream stream_LEVEL=new RewriteRuleTokenStream(adaptor,"token LEVEL");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_property=new RewriteRuleSubtreeStream(adaptor,"rule property");
        try {
            // src/SAF.g:58:5: ( ( property EQUAL LEVEL )+ -> ( ^( property LEVEL ) )+ )
            // src/SAF.g:58:7: ( property EQUAL LEVEL )+
            {
            // src/SAF.g:58:7: ( property EQUAL LEVEL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==EQUAL) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // src/SAF.g:58:8: property EQUAL LEVEL
            	    {
            	    pushFollow(FOLLOW_property_in_traits339);
            	    property9=property();

            	    state._fsp--;

            	    stream_property.add(property9.getTree());

            	    EQUAL10=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_traits341);  
            	    stream_EQUAL.add(EQUAL10);


            	    LEVEL11=(Token)match(input,LEVEL,FOLLOW_LEVEL_in_traits343);  
            	    stream_LEVEL.add(LEVEL11);


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


            // AST REWRITE
            // elements: LEVEL, property
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 58:31: -> ( ^( property LEVEL ) )+
            {
                if ( !(stream_LEVEL.hasNext()||stream_property.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_LEVEL.hasNext()||stream_property.hasNext() ) {
                    // src/SAF.g:58:34: ^( property LEVEL )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(stream_property.nextNode(), root_1);

                    adaptor.addChild(root_1, 
                    stream_LEVEL.nextNode()
                    );

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_LEVEL.reset();
                stream_property.reset();

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
    // $ANTLR end "traits"


    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property"
    // src/SAF.g:61:1: property : STRING ;
    public final SAFParser.property_return property() throws RecognitionException {
        SAFParser.property_return retval = new SAFParser.property_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING12=null;

        Object STRING12_tree=null;

        try {
            // src/SAF.g:62:5: ( STRING )
            // src/SAF.g:62:7: STRING
            {
            root_0 = (Object)adaptor.nil();


            STRING12=(Token)match(input,STRING,FOLLOW_STRING_in_property371); 
            STRING12_tree = 
            (Object)adaptor.create(STRING12)
            ;
            adaptor.addChild(root_0, STRING12_tree);


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
    // $ANTLR end "property"


    public static class behaviour_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // src/SAF.g:65:1: behaviour : ( complex_condition action )+ -> ( ^( CONDITION complex_condition ^( ACTION action ) ) )+ ;
    public final SAFParser.behaviour_return behaviour() throws RecognitionException {
        SAFParser.behaviour_return retval = new SAFParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SAFParser.complex_condition_return complex_condition13 =null;

        SAFParser.action_return action14 =null;


        RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
        RewriteRuleSubtreeStream stream_complex_condition=new RewriteRuleSubtreeStream(adaptor,"rule complex_condition");
        try {
            // src/SAF.g:66:5: ( ( complex_condition action )+ -> ( ^( CONDITION complex_condition ^( ACTION action ) ) )+ )
            // src/SAF.g:66:7: ( complex_condition action )+
            {
            // src/SAF.g:66:7: ( complex_condition action )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/SAF.g:66:8: complex_condition action
            	    {
            	    pushFollow(FOLLOW_complex_condition_in_behaviour389);
            	    complex_condition13=complex_condition();

            	    state._fsp--;

            	    stream_complex_condition.add(complex_condition13.getTree());

            	    pushFollow(FOLLOW_action_in_behaviour391);
            	    action14=action();

            	    state._fsp--;

            	    stream_action.add(action14.getTree());

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


            // AST REWRITE
            // elements: complex_condition, action
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:35: -> ( ^( CONDITION complex_condition ^( ACTION action ) ) )+
            {
                if ( !(stream_complex_condition.hasNext()||stream_action.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_complex_condition.hasNext()||stream_action.hasNext() ) {
                    // src/SAF.g:66:38: ^( CONDITION complex_condition ^( ACTION action ) )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(CONDITION, "CONDITION")
                    , root_1);

                    adaptor.addChild(root_1, stream_complex_condition.nextTree());

                    // src/SAF.g:66:68: ^( ACTION action )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(ACTION, "ACTION")
                    , root_2);

                    adaptor.addChild(root_2, stream_action.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_complex_condition.reset();
                stream_action.reset();

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


    public static class complex_condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "complex_condition"
    // src/SAF.g:69:1: complex_condition : ( condition ( ( AND | OR ) ^ condition )* ) ;
    public final SAFParser.complex_condition_return complex_condition() throws RecognitionException {
        SAFParser.complex_condition_return retval = new SAFParser.complex_condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set16=null;
        SAFParser.condition_return condition15 =null;

        SAFParser.condition_return condition17 =null;


        Object set16_tree=null;

        try {
            // src/SAF.g:70:5: ( ( condition ( ( AND | OR ) ^ condition )* ) )
            // src/SAF.g:70:7: ( condition ( ( AND | OR ) ^ condition )* )
            {
            root_0 = (Object)adaptor.nil();


            // src/SAF.g:70:7: ( condition ( ( AND | OR ) ^ condition )* )
            // src/SAF.g:70:8: condition ( ( AND | OR ) ^ condition )*
            {
            pushFollow(FOLLOW_condition_in_complex_condition426);
            condition15=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition15.getTree());

            // src/SAF.g:70:18: ( ( AND | OR ) ^ condition )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AND||LA3_0==OR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/SAF.g:70:19: ( AND | OR ) ^ condition
            	    {
            	    set16=(Token)input.LT(1);

            	    set16=(Token)input.LT(1);

            	    if ( input.LA(1)==AND||input.LA(1)==OR ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set16)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_condition_in_complex_condition436);
            	    condition17=condition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, condition17.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "complex_condition"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // src/SAF.g:73:1: condition : STRING ;
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING18=null;

        Object STRING18_tree=null;

        try {
            // src/SAF.g:74:5: ( STRING )
            // src/SAF.g:74:7: STRING
            {
            root_0 = (Object)adaptor.nil();


            STRING18=(Token)match(input,STRING,FOLLOW_STRING_in_condition457); 
            STRING18_tree = 
            (Object)adaptor.create(STRING18)
            ;
            adaptor.addChild(root_0, STRING18_tree);


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


    public static class action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // src/SAF.g:77:1: action : SQUARE_OPEN move attack SQUARE_CLOSE -> move attack ;
    public final SAFParser.action_return action() throws RecognitionException {
        SAFParser.action_return retval = new SAFParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SQUARE_OPEN19=null;
        Token SQUARE_CLOSE22=null;
        SAFParser.move_return move20 =null;

        SAFParser.attack_return attack21 =null;


        Object SQUARE_OPEN19_tree=null;
        Object SQUARE_CLOSE22_tree=null;
        RewriteRuleTokenStream stream_SQUARE_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_OPEN");
        RewriteRuleTokenStream stream_SQUARE_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_CLOSE");
        RewriteRuleSubtreeStream stream_attack=new RewriteRuleSubtreeStream(adaptor,"rule attack");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        try {
            // src/SAF.g:78:5: ( SQUARE_OPEN move attack SQUARE_CLOSE -> move attack )
            // src/SAF.g:78:7: SQUARE_OPEN move attack SQUARE_CLOSE
            {
            SQUARE_OPEN19=(Token)match(input,SQUARE_OPEN,FOLLOW_SQUARE_OPEN_in_action474);  
            stream_SQUARE_OPEN.add(SQUARE_OPEN19);


            pushFollow(FOLLOW_move_in_action476);
            move20=move();

            state._fsp--;

            stream_move.add(move20.getTree());

            pushFollow(FOLLOW_attack_in_action478);
            attack21=attack();

            state._fsp--;

            stream_attack.add(attack21.getTree());

            SQUARE_CLOSE22=(Token)match(input,SQUARE_CLOSE,FOLLOW_SQUARE_CLOSE_in_action480);  
            stream_SQUARE_CLOSE.add(SQUARE_CLOSE22);


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
            // 78:44: -> move attack
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
    // $ANTLR end "action"


    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // src/SAF.g:81:1: move : STRING ;
    public final SAFParser.move_return move() throws RecognitionException {
        SAFParser.move_return retval = new SAFParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING23=null;

        Object STRING23_tree=null;

        try {
            // src/SAF.g:82:5: ( STRING )
            // src/SAF.g:82:7: STRING
            {
            root_0 = (Object)adaptor.nil();


            STRING23=(Token)match(input,STRING,FOLLOW_STRING_in_move503); 
            STRING23_tree = 
            (Object)adaptor.create(STRING23)
            ;
            adaptor.addChild(root_0, STRING23_tree);


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
    // src/SAF.g:85:1: attack : STRING ;
    public final SAFParser.attack_return attack() throws RecognitionException {
        SAFParser.attack_return retval = new SAFParser.attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING24=null;

        Object STRING24_tree=null;

        try {
            // src/SAF.g:86:5: ( STRING )
            // src/SAF.g:86:7: STRING
            {
            root_0 = (Object)adaptor.nil();


            STRING24=(Token)match(input,STRING,FOLLOW_STRING_in_attack520); 
            STRING24_tree = 
            (Object)adaptor.create(STRING24)
            ;
            adaptor.addChild(root_0, STRING24_tree);


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


 

    public static final BitSet FOLLOW_super_awesome_fighter_in_parse238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_super_awesome_fighter268 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CURLY_OPEN_in_super_awesome_fighter270 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_traits_in_super_awesome_fighter272 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_behaviour_in_super_awesome_fighter274 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CURLY_CLOSE_in_super_awesome_fighter276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_super_awesome_fighter278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_traits339 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_traits341 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LEVEL_in_traits343 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_STRING_in_property371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complex_condition_in_behaviour389 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_action_in_behaviour391 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_condition_in_complex_condition426 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_set_in_complex_condition429 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_condition_in_complex_condition436 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_STRING_in_condition457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_OPEN_in_action474 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_move_in_action476 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_attack_in_action478 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SQUARE_CLOSE_in_action480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_move503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_attack520 = new BitSet(new long[]{0x0000000000000002L});

}