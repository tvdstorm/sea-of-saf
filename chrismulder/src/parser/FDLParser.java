// $ANTLR 3.4 C:\\Users\\Chris\\school\\SAFplayer\\FDL.g 2012-01-17 14:44:26

 package parser;
 import AST.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALWAYS", "AND", "BLOCK_HIGH", "BLOCK_LOW", "CHOOSE", "CROUCH", "DIGIT", "EQ", "EVEN", "FAR", "JUMP", "KICKPOWER", "KICKREACH", "KICK_HIGH", "KICK_LOW", "LDELIM", "LPARAM", "LSQUARE", "MUCH_STRONGER", "MUCH_WEAKER", "NAME", "NEAR", "NUMBER", "OR", "PUCHPOWER", "PUCHREACH", "PUNCH_HIGH", "PUNCH_LOW", "RDELIM", "RPARAM", "RSQUARE", "RUN_AWAY", "RUN_TOWARDS", "STAND", "STRONGER", "WALK_AWAY", "WALK_TOWARDS", "WEAKER", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int ALWAYS=4;
    public static final int AND=5;
    public static final int BLOCK_HIGH=6;
    public static final int BLOCK_LOW=7;
    public static final int CHOOSE=8;
    public static final int CROUCH=9;
    public static final int DIGIT=10;
    public static final int EQ=11;
    public static final int EVEN=12;
    public static final int FAR=13;
    public static final int JUMP=14;
    public static final int KICKPOWER=15;
    public static final int KICKREACH=16;
    public static final int KICK_HIGH=17;
    public static final int KICK_LOW=18;
    public static final int LDELIM=19;
    public static final int LPARAM=20;
    public static final int LSQUARE=21;
    public static final int MUCH_STRONGER=22;
    public static final int MUCH_WEAKER=23;
    public static final int NAME=24;
    public static final int NEAR=25;
    public static final int NUMBER=26;
    public static final int OR=27;
    public static final int PUCHPOWER=28;
    public static final int PUCHREACH=29;
    public static final int PUNCH_HIGH=30;
    public static final int PUNCH_LOW=31;
    public static final int RDELIM=32;
    public static final int RPARAM=33;
    public static final int RSQUARE=34;
    public static final int RUN_AWAY=35;
    public static final int RUN_TOWARDS=36;
    public static final int STAND=37;
    public static final int STRONGER=38;
    public static final int WALK_AWAY=39;
    public static final int WALK_TOWARDS=40;
    public static final int WEAKER=41;
    public static final int WHITESPACE=42;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public FDLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public FDLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return FDLParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Chris\\school\\SAFplayer\\FDL.g"; }


        private ArrayList<Node> nodes;
        
        private void addNode(Node n)	 {
        	if (nodes == null) {
        		nodes = new ArrayList<Node>();
        	}
        	nodes.add(n);
        }
        
        public static void main(String[] args) throws Exception {
            FDLLexer lex = new FDLLexer(new ANTLRFileStream(args[0]));
           	CommonTokenStream tokens = new CommonTokenStream(lex);
           	


            FDLParser parser = new FDLParser(tokens);

            try {
    	    System.out.println("Start parsing...");
                parser.saf();
            } catch (RecognitionException e)  {
                e.printStackTrace();
            }
        }


    public static class saf_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "saf"
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:85:1: saf : NAME LDELIM property_list RDELIM ;
    public final FDLParser.saf_return saf() throws RecognitionException {
        FDLParser.saf_return retval = new FDLParser.saf_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NAME1=null;
        Token LDELIM2=null;
        Token RDELIM4=null;
        FDLParser.property_list_return property_list3 =null;


        Object NAME1_tree=null;
        Object LDELIM2_tree=null;
        Object RDELIM4_tree=null;

        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:85:4: ( NAME LDELIM property_list RDELIM )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:85:7: NAME LDELIM property_list RDELIM
            {
            root_0 = (Object)adaptor.nil();


            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_saf366); 
            NAME1_tree = 
            (Object)adaptor.create(NAME1)
            ;
            adaptor.addChild(root_0, NAME1_tree);


            LDELIM2=(Token)match(input,LDELIM,FOLLOW_LDELIM_in_saf368); 
            LDELIM2_tree = 
            (Object)adaptor.create(LDELIM2)
            ;
            adaptor.addChild(root_0, LDELIM2_tree);


            pushFollow(FOLLOW_property_list_in_saf371);
            property_list3=property_list();

            state._fsp--;

            adaptor.addChild(root_0, property_list3.getTree());

            RDELIM4=(Token)match(input,RDELIM,FOLLOW_RDELIM_in_saf373); 
            RDELIM4_tree = 
            (Object)adaptor.create(RDELIM4)
            ;
            adaptor.addChild(root_0, RDELIM4_tree);



            	System.out.println("found saf: "+input.toString(retval.start,input.LT(-1)));
            	SafNode n =  new SafNode();
            	n.setText(input.toString(retval.start,input.LT(-1)));
            	addNode(n);
            	System.out.println(nodes);
            	
            	


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
    // $ANTLR end "saf"


    public static class property_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property_list"
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:94:1: property_list : ( property )* ;
    public final FDLParser.property_list_return property_list() throws RecognitionException {
        FDLParser.property_list_return retval = new FDLParser.property_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FDLParser.property_return property5 =null;



        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:94:14: ( ( property )* )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:94:17: ( property )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:94:17: ( property )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ALWAYS||(LA1_0 >= EVEN && LA1_0 <= FAR)||(LA1_0 >= KICKPOWER && LA1_0 <= KICKREACH)||(LA1_0 >= MUCH_STRONGER && LA1_0 <= MUCH_WEAKER)||LA1_0==NEAR||(LA1_0 >= PUCHPOWER && LA1_0 <= PUCHREACH)||LA1_0==STRONGER||LA1_0==WEAKER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:94:18: property
            	    {
            	    pushFollow(FOLLOW_property_in_property_list383);
            	    property5=property();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property5.getTree());

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
    // $ANTLR end "property_list"


    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property"
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:95:1: property : ( strength | behaviour );
    public final FDLParser.property_return property() throws RecognitionException {
        FDLParser.property_return retval = new FDLParser.property_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FDLParser.strength_return strength6 =null;

        FDLParser.behaviour_return behaviour7 =null;



        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:95:9: ( strength | behaviour )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= KICKPOWER && LA2_0 <= KICKREACH)||(LA2_0 >= PUCHPOWER && LA2_0 <= PUCHREACH)) ) {
                alt2=1;
            }
            else if ( (LA2_0==ALWAYS||(LA2_0 >= EVEN && LA2_0 <= FAR)||(LA2_0 >= MUCH_STRONGER && LA2_0 <= MUCH_WEAKER)||LA2_0==NEAR||LA2_0==STRONGER||LA2_0==WEAKER) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:95:11: strength
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_strength_in_property391);
                    strength6=strength();

                    state._fsp--;

                    adaptor.addChild(root_0, strength6.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:95:22: behaviour
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_behaviour_in_property395);
                    behaviour7=behaviour();

                    state._fsp--;

                    adaptor.addChild(root_0, behaviour7.getTree());

                    }
                    break;

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


    public static class strength_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "strength"
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:96:1: strength : ( KICKREACH | PUCHREACH | KICKPOWER | PUCHPOWER ) EQ NUMBER ;
    public final FDLParser.strength_return strength() throws RecognitionException {
        FDLParser.strength_return retval = new FDLParser.strength_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set8=null;
        Token EQ9=null;
        Token NUMBER10=null;

        Object set8_tree=null;
        Object EQ9_tree=null;
        Object NUMBER10_tree=null;

        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:96:9: ( ( KICKREACH | PUCHREACH | KICKPOWER | PUCHPOWER ) EQ NUMBER )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:96:11: ( KICKREACH | PUCHREACH | KICKPOWER | PUCHPOWER ) EQ NUMBER
            {
            root_0 = (Object)adaptor.nil();


            set8=(Token)input.LT(1);

            if ( (input.LA(1) >= KICKPOWER && input.LA(1) <= KICKREACH)||(input.LA(1) >= PUCHPOWER && input.LA(1) <= PUCHREACH) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set8)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            EQ9=(Token)match(input,EQ,FOLLOW_EQ_in_strength416); 
            EQ9_tree = 
            (Object)adaptor.create(EQ9)
            ;
            adaptor.addChild(root_0, EQ9_tree);


            NUMBER10=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_strength418); 
            NUMBER10_tree = 
            (Object)adaptor.create(NUMBER10)
            ;
            adaptor.addChild(root_0, NUMBER10_tree);


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


    public static class behaviour_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:97:1: behaviour : condition LSQUARE action RSQUARE ;
    public final FDLParser.behaviour_return behaviour() throws RecognitionException {
        FDLParser.behaviour_return retval = new FDLParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LSQUARE12=null;
        Token RSQUARE14=null;
        FDLParser.condition_return condition11 =null;

        FDLParser.action_return action13 =null;


        Object LSQUARE12_tree=null;
        Object RSQUARE14_tree=null;

        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:97:10: ( condition LSQUARE action RSQUARE )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:97:12: condition LSQUARE action RSQUARE
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_condition_in_behaviour424);
            condition11=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition11.getTree());

            LSQUARE12=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_behaviour426); 
            LSQUARE12_tree = 
            (Object)adaptor.create(LSQUARE12)
            ;
            adaptor.addChild(root_0, LSQUARE12_tree);


            pushFollow(FOLLOW_action_in_behaviour428);
            action13=action();

            state._fsp--;

            adaptor.addChild(root_0, action13.getTree());

            RSQUARE14=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_behaviour430); 
            RSQUARE14_tree = 
            (Object)adaptor.create(RSQUARE14)
            ;
            adaptor.addChild(root_0, RSQUARE14_tree);



            	System.out.println("found behaviour: "+input.toString(retval.start,input.LT(-1)));
            	BehaviourNode n =  new BehaviourNode();
            	n.setText(input.toString(retval.start,input.LT(-1)));
            	addNode(n);
            	System.out.println(nodes);


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


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:104:1: condition : term ( OR term )* ;
    public final FDLParser.condition_return condition() throws RecognitionException {
        FDLParser.condition_return retval = new FDLParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR16=null;
        FDLParser.term_return term15 =null;

        FDLParser.term_return term17 =null;


        Object OR16_tree=null;

        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:104:10: ( term ( OR term )* )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:104:12: term ( OR term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_condition437);
            term15=term();

            state._fsp--;

            adaptor.addChild(root_0, term15.getTree());

            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:104:17: ( OR term )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==OR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:104:20: OR term
            	    {
            	    OR16=(Token)match(input,OR,FOLLOW_OR_in_condition442); 
            	    OR16_tree = 
            	    (Object)adaptor.create(OR16)
            	    ;
            	    adaptor.addChild(root_0, OR16_tree);


            	    pushFollow(FOLLOW_term_in_condition445);
            	    term17=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term17.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "condition"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:105:1: term : condition_atom ( AND condition_atom )* ;
    public final FDLParser.term_return term() throws RecognitionException {
        FDLParser.term_return retval = new FDLParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND19=null;
        FDLParser.condition_atom_return condition_atom18 =null;

        FDLParser.condition_atom_return condition_atom20 =null;


        Object AND19_tree=null;

        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:105:5: ( condition_atom ( AND condition_atom )* )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:105:8: condition_atom ( AND condition_atom )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_condition_atom_in_term456);
            condition_atom18=condition_atom();

            state._fsp--;

            adaptor.addChild(root_0, condition_atom18.getTree());

            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:105:23: ( AND condition_atom )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==AND) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:105:25: AND condition_atom
            	    {
            	    AND19=(Token)match(input,AND,FOLLOW_AND_in_term460); 
            	    AND19_tree = 
            	    (Object)adaptor.create(AND19)
            	    ;
            	    adaptor.addChild(root_0, AND19_tree);


            	    pushFollow(FOLLOW_condition_atom_in_term462);
            	    condition_atom20=condition_atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, condition_atom20.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "term"


    public static class condition_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_atom"
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:106:1: condition_atom : ( STRONGER | WEAKER | MUCH_STRONGER | MUCH_WEAKER | EVEN | NEAR | FAR | ALWAYS );
    public final FDLParser.condition_atom_return condition_atom() throws RecognitionException {
        FDLParser.condition_atom_return retval = new FDLParser.condition_atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set21=null;

        Object set21_tree=null;

        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:106:15: ( STRONGER | WEAKER | MUCH_STRONGER | MUCH_WEAKER | EVEN | NEAR | FAR | ALWAYS )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:
            {
            root_0 = (Object)adaptor.nil();


            set21=(Token)input.LT(1);

            if ( input.LA(1)==ALWAYS||(input.LA(1) >= EVEN && input.LA(1) <= FAR)||(input.LA(1) >= MUCH_STRONGER && input.LA(1) <= MUCH_WEAKER)||input.LA(1)==NEAR||input.LA(1)==STRONGER||input.LA(1)==WEAKER ) {
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
    // $ANTLR end "condition_atom"


    public static class action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:107:1: action : ( move | fight | move fight );
    public final FDLParser.action_return action() throws RecognitionException {
        FDLParser.action_return retval = new FDLParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FDLParser.move_return move22 =null;

        FDLParser.fight_return fight23 =null;

        FDLParser.move_return move24 =null;

        FDLParser.fight_return fight25 =null;



        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:107:7: ( move | fight | move fight )
            int alt5=3;
            switch ( input.LA(1) ) {
            case CHOOSE:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==LPARAM) ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==CROUCH||LA5_4==JUMP||(LA5_4 >= RUN_AWAY && LA5_4 <= STAND)||(LA5_4 >= WALK_AWAY && LA5_4 <= WALK_TOWARDS)) ) {
                        int LA5_7 = input.LA(4);

                        if ( (LA5_7==CROUCH||LA5_7==JUMP||(LA5_7 >= RUN_AWAY && LA5_7 <= STAND)||(LA5_7 >= WALK_AWAY && LA5_7 <= WALK_TOWARDS)) ) {
                            int LA5_8 = input.LA(5);

                            if ( (LA5_8==RPARAM) ) {
                                int LA5_9 = input.LA(6);

                                if ( (LA5_9==RSQUARE) ) {
                                    alt5=1;
                                }
                                else if ( ((LA5_9 >= BLOCK_HIGH && LA5_9 <= CHOOSE)||(LA5_9 >= KICK_HIGH && LA5_9 <= KICK_LOW)||(LA5_9 >= PUNCH_HIGH && LA5_9 <= PUNCH_LOW)) ) {
                                    alt5=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 9, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 7, input);

                            throw nvae;

                        }
                    }
                    else if ( ((LA5_4 >= BLOCK_HIGH && LA5_4 <= BLOCK_LOW)||(LA5_4 >= KICK_HIGH && LA5_4 <= KICK_LOW)||(LA5_4 >= PUNCH_HIGH && LA5_4 <= PUNCH_LOW)) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
                }
                break;
            case CROUCH:
            case JUMP:
            case RUN_AWAY:
            case RUN_TOWARDS:
            case STAND:
            case WALK_AWAY:
            case WALK_TOWARDS:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RSQUARE) ) {
                    alt5=1;
                }
                else if ( ((LA5_2 >= BLOCK_HIGH && LA5_2 <= CHOOSE)||(LA5_2 >= KICK_HIGH && LA5_2 <= KICK_LOW)||(LA5_2 >= PUNCH_HIGH && LA5_2 <= PUNCH_LOW)) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }
                }
                break;
            case BLOCK_HIGH:
            case BLOCK_LOW:
            case KICK_HIGH:
            case KICK_LOW:
            case PUNCH_HIGH:
            case PUNCH_LOW:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:107:10: move
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_move_in_action506);
                    move22=move();

                    state._fsp--;

                    adaptor.addChild(root_0, move22.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:107:17: fight
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fight_in_action510);
                    fight23=fight();

                    state._fsp--;

                    adaptor.addChild(root_0, fight23.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:107:25: move fight
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_move_in_action514);
                    move24=move();

                    state._fsp--;

                    adaptor.addChild(root_0, move24.getTree());

                    pushFollow(FOLLOW_fight_in_action516);
                    fight25=fight();

                    state._fsp--;

                    adaptor.addChild(root_0, fight25.getTree());

                    }
                    break;

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
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:108:1: move : ( CHOOSE LPARAM move_atom move_atom RPARAM | move_atom );
    public final FDLParser.move_return move() throws RecognitionException {
        FDLParser.move_return retval = new FDLParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE26=null;
        Token LPARAM27=null;
        Token RPARAM30=null;
        FDLParser.move_atom_return move_atom28 =null;

        FDLParser.move_atom_return move_atom29 =null;

        FDLParser.move_atom_return move_atom31 =null;


        Object CHOOSE26_tree=null;
        Object LPARAM27_tree=null;
        Object RPARAM30_tree=null;

        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:108:5: ( CHOOSE LPARAM move_atom move_atom RPARAM | move_atom )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CHOOSE) ) {
                alt6=1;
            }
            else if ( (LA6_0==CROUCH||LA6_0==JUMP||(LA6_0 >= RUN_AWAY && LA6_0 <= STAND)||(LA6_0 >= WALK_AWAY && LA6_0 <= WALK_TOWARDS)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:108:8: CHOOSE LPARAM move_atom move_atom RPARAM
                    {
                    root_0 = (Object)adaptor.nil();


                    CHOOSE26=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_move523); 
                    CHOOSE26_tree = 
                    (Object)adaptor.create(CHOOSE26)
                    ;
                    adaptor.addChild(root_0, CHOOSE26_tree);


                    LPARAM27=(Token)match(input,LPARAM,FOLLOW_LPARAM_in_move525); 
                    LPARAM27_tree = 
                    (Object)adaptor.create(LPARAM27)
                    ;
                    adaptor.addChild(root_0, LPARAM27_tree);


                    pushFollow(FOLLOW_move_atom_in_move527);
                    move_atom28=move_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, move_atom28.getTree());

                    pushFollow(FOLLOW_move_atom_in_move529);
                    move_atom29=move_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, move_atom29.getTree());

                    RPARAM30=(Token)match(input,RPARAM,FOLLOW_RPARAM_in_move531); 
                    RPARAM30_tree = 
                    (Object)adaptor.create(RPARAM30)
                    ;
                    adaptor.addChild(root_0, RPARAM30_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:108:51: move_atom
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_move_atom_in_move535);
                    move_atom31=move_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, move_atom31.getTree());

                    }
                    break;

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


    public static class move_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move_atom"
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:109:1: move_atom : ( JUMP | CROUCH | STAND | RUN_TOWARDS | RUN_AWAY | WALK_TOWARDS | WALK_AWAY );
    public final FDLParser.move_atom_return move_atom() throws RecognitionException {
        FDLParser.move_atom_return retval = new FDLParser.move_atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set32=null;

        Object set32_tree=null;

        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:109:10: ( JUMP | CROUCH | STAND | RUN_TOWARDS | RUN_AWAY | WALK_TOWARDS | WALK_AWAY )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:
            {
            root_0 = (Object)adaptor.nil();


            set32=(Token)input.LT(1);

            if ( input.LA(1)==CROUCH||input.LA(1)==JUMP||(input.LA(1) >= RUN_AWAY && input.LA(1) <= STAND)||(input.LA(1) >= WALK_AWAY && input.LA(1) <= WALK_TOWARDS) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set32)
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
    // $ANTLR end "move_atom"


    public static class fight_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fight"
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:110:1: fight : ( CHOOSE LPARAM fight_atom fight_atom RPARAM | fight_atom );
    public final FDLParser.fight_return fight() throws RecognitionException {
        FDLParser.fight_return retval = new FDLParser.fight_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE33=null;
        Token LPARAM34=null;
        Token RPARAM37=null;
        FDLParser.fight_atom_return fight_atom35 =null;

        FDLParser.fight_atom_return fight_atom36 =null;

        FDLParser.fight_atom_return fight_atom38 =null;


        Object CHOOSE33_tree=null;
        Object LPARAM34_tree=null;
        Object RPARAM37_tree=null;

        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:110:6: ( CHOOSE LPARAM fight_atom fight_atom RPARAM | fight_atom )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CHOOSE) ) {
                alt7=1;
            }
            else if ( ((LA7_0 >= BLOCK_HIGH && LA7_0 <= BLOCK_LOW)||(LA7_0 >= KICK_HIGH && LA7_0 <= KICK_LOW)||(LA7_0 >= PUNCH_HIGH && LA7_0 <= PUNCH_LOW)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:110:9: CHOOSE LPARAM fight_atom fight_atom RPARAM
                    {
                    root_0 = (Object)adaptor.nil();


                    CHOOSE33=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_fight574); 
                    CHOOSE33_tree = 
                    (Object)adaptor.create(CHOOSE33)
                    ;
                    adaptor.addChild(root_0, CHOOSE33_tree);


                    LPARAM34=(Token)match(input,LPARAM,FOLLOW_LPARAM_in_fight576); 
                    LPARAM34_tree = 
                    (Object)adaptor.create(LPARAM34)
                    ;
                    adaptor.addChild(root_0, LPARAM34_tree);


                    pushFollow(FOLLOW_fight_atom_in_fight578);
                    fight_atom35=fight_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, fight_atom35.getTree());

                    pushFollow(FOLLOW_fight_atom_in_fight580);
                    fight_atom36=fight_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, fight_atom36.getTree());

                    RPARAM37=(Token)match(input,RPARAM,FOLLOW_RPARAM_in_fight582); 
                    RPARAM37_tree = 
                    (Object)adaptor.create(RPARAM37)
                    ;
                    adaptor.addChild(root_0, RPARAM37_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:110:54: fight_atom
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fight_atom_in_fight586);
                    fight_atom38=fight_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, fight_atom38.getTree());

                    }
                    break;

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
    // $ANTLR end "fight"


    public static class fight_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fight_atom"
    // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:111:1: fight_atom : ( PUNCH_LOW | PUNCH_HIGH | KICK_LOW | KICK_HIGH | BLOCK_LOW | BLOCK_HIGH );
    public final FDLParser.fight_atom_return fight_atom() throws RecognitionException {
        FDLParser.fight_atom_return retval = new FDLParser.fight_atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set39=null;

        Object set39_tree=null;

        try {
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:111:11: ( PUNCH_LOW | PUNCH_HIGH | KICK_LOW | KICK_HIGH | BLOCK_LOW | BLOCK_HIGH )
            // C:\\Users\\Chris\\school\\SAFplayer\\FDL.g:
            {
            root_0 = (Object)adaptor.nil();


            set39=(Token)input.LT(1);

            if ( (input.LA(1) >= BLOCK_HIGH && input.LA(1) <= BLOCK_LOW)||(input.LA(1) >= KICK_HIGH && input.LA(1) <= KICK_LOW)||(input.LA(1) >= PUNCH_HIGH && input.LA(1) <= PUNCH_LOW) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set39)
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
    // $ANTLR end "fight_atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_NAME_in_saf366 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LDELIM_in_saf368 = new BitSet(new long[]{0x0000024132C1B010L});
    public static final BitSet FOLLOW_property_list_in_saf371 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RDELIM_in_saf373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_property_list383 = new BitSet(new long[]{0x0000024032C1B012L});
    public static final BitSet FOLLOW_strength_in_property391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behaviour_in_property395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_strength401 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQ_in_strength416 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_NUMBER_in_strength418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour424 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LSQUARE_in_behaviour426 = new BitSet(new long[]{0x000001B8C00643C0L});
    public static final BitSet FOLLOW_action_in_behaviour428 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RSQUARE_in_behaviour430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_condition437 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_OR_in_condition442 = new BitSet(new long[]{0x0000024002C03010L});
    public static final BitSet FOLLOW_term_in_condition445 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_condition_atom_in_term456 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_term460 = new BitSet(new long[]{0x0000024002C03010L});
    public static final BitSet FOLLOW_condition_atom_in_term462 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_move_in_action506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fight_in_action510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_action514 = new BitSet(new long[]{0x00000000C00601C0L});
    public static final BitSet FOLLOW_fight_in_action516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_move523 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPARAM_in_move525 = new BitSet(new long[]{0x000001B800004200L});
    public static final BitSet FOLLOW_move_atom_in_move527 = new BitSet(new long[]{0x000001B800004200L});
    public static final BitSet FOLLOW_move_atom_in_move529 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RPARAM_in_move531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_atom_in_move535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_fight574 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LPARAM_in_fight576 = new BitSet(new long[]{0x00000000C00600C0L});
    public static final BitSet FOLLOW_fight_atom_in_fight578 = new BitSet(new long[]{0x00000000C00600C0L});
    public static final BitSet FOLLOW_fight_atom_in_fight580 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RPARAM_in_fight582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fight_atom_in_fight586 = new BitSet(new long[]{0x0000000000000002L});

}