// $ANTLR 3.4 C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g 2012-02-07 12:31:05

package saf.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANDCONDITION", "ASSIGNMENT", "ATTACKS", "CONDITION", "DIGIT", "FIGHTER", "IDENTIFIER", "MOVES", "ORCONDITION", "RCONDITION", "RULE", "WS", "'('", "')'", "'='", "'['", "']'", "'and'", "'or'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int ANDCONDITION=4;
    public static final int ASSIGNMENT=5;
    public static final int ATTACKS=6;
    public static final int CONDITION=7;
    public static final int DIGIT=8;
    public static final int FIGHTER=9;
    public static final int IDENTIFIER=10;
    public static final int MOVES=11;
    public static final int ORCONDITION=12;
    public static final int RCONDITION=13;
    public static final int RULE=14;
    public static final int WS=15;

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
    public String getGrammarFileName() { return "C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g"; }


    	private List<String> errorList;
    	
    	public void setErrorList(List<String> errorList) {
    		this.errorList = errorList;
    	}
    	
    	@Override
    	public void emitErrorMessage(String msg) {
    		errorList.add("Parser error: " + msg);
    	}


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:1: fighter : IDENTIFIER '{' ( assignment )* ( rule )* '}' -> ^( FIGHTER IDENTIFIER ( assignment )* ( rule )* ) ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER1=null;
        Token char_literal2=null;
        Token char_literal5=null;
        SAFParser.assignment_return assignment3 =null;

        SAFParser.rule_return rule4 =null;


        Object IDENTIFIER1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal5_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_rule=new RewriteRuleSubtreeStream(adaptor,"rule rule");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:9: ( IDENTIFIER '{' ( assignment )* ( rule )* '}' -> ^( FIGHTER IDENTIFIER ( assignment )* ( rule )* ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:11: IDENTIFIER '{' ( assignment )* ( rule )* '}'
            {
            IDENTIFIER1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fighter99);  
            stream_IDENTIFIER.add(IDENTIFIER1);


            char_literal2=(Token)match(input,23,FOLLOW_23_in_fighter101);  
            stream_23.add(char_literal2);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:27: ( assignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENTIFIER) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==18) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:27: assignment
            	    {
            	    pushFollow(FOLLOW_assignment_in_fighter104);
            	    assignment3=assignment();

            	    state._fsp--;

            	    stream_assignment.add(assignment3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:40: ( rule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENTIFIER||LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:40: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_fighter108);
            	    rule4=rule();

            	    state._fsp--;

            	    stream_rule.add(rule4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            char_literal5=(Token)match(input,24,FOLLOW_24_in_fighter111);  
            stream_24.add(char_literal5);


            // AST REWRITE
            // elements: rule, assignment, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 53:50: -> ^( FIGHTER IDENTIFIER ( assignment )* ( rule )* )
            {
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:53: ^( FIGHTER IDENTIFIER ( assignment )* ( rule )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIGHTER, "FIGHTER")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:74: ( assignment )*
                while ( stream_assignment.hasNext() ) {
                    adaptor.addChild(root_1, stream_assignment.nextTree());

                }
                stream_assignment.reset();

                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:86: ( rule )*
                while ( stream_rule.hasNext() ) {
                    adaptor.addChild(root_1, stream_rule.nextTree());

                }
                stream_rule.reset();

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


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:55:1: assignment : IDENTIFIER '=' DIGIT -> ^( ASSIGNMENT IDENTIFIER DIGIT ) ;
    public final SAFParser.assignment_return assignment() throws RecognitionException {
        SAFParser.assignment_return retval = new SAFParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER6=null;
        Token char_literal7=null;
        Token DIGIT8=null;

        Object IDENTIFIER6_tree=null;
        Object char_literal7_tree=null;
        Object DIGIT8_tree=null;
        RewriteRuleTokenStream stream_DIGIT=new RewriteRuleTokenStream(adaptor,"token DIGIT");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:56:2: ( IDENTIFIER '=' DIGIT -> ^( ASSIGNMENT IDENTIFIER DIGIT ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:56:4: IDENTIFIER '=' DIGIT
            {
            IDENTIFIER6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment134);  
            stream_IDENTIFIER.add(IDENTIFIER6);


            char_literal7=(Token)match(input,18,FOLLOW_18_in_assignment136);  
            stream_18.add(char_literal7);


            DIGIT8=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_assignment138);  
            stream_DIGIT.add(DIGIT8);


            // AST REWRITE
            // elements: IDENTIFIER, DIGIT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 57:4: -> ^( ASSIGNMENT IDENTIFIER DIGIT )
            {
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:57:7: ^( ASSIGNMENT IDENTIFIER DIGIT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_DIGIT.nextNode()
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
    // $ANTLR end "assignment"


    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:59:1: rule : condition '[' moves attacks ']' -> ^( RULE condition moves attacks ) ;
    public final SAFParser.rule_return rule() throws RecognitionException {
        SAFParser.rule_return retval = new SAFParser.rule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal10=null;
        Token char_literal13=null;
        SAFParser.condition_return condition9 =null;

        SAFParser.moves_return moves11 =null;

        SAFParser.attacks_return attacks12 =null;


        Object char_literal10_tree=null;
        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_moves=new RewriteRuleSubtreeStream(adaptor,"rule moves");
        RewriteRuleSubtreeStream stream_attacks=new RewriteRuleSubtreeStream(adaptor,"rule attacks");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:59:7: ( condition '[' moves attacks ']' -> ^( RULE condition moves attacks ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:59:9: condition '[' moves attacks ']'
            {
            pushFollow(FOLLOW_condition_in_rule160);
            condition9=condition();

            state._fsp--;

            stream_condition.add(condition9.getTree());

            char_literal10=(Token)match(input,19,FOLLOW_19_in_rule162);  
            stream_19.add(char_literal10);


            pushFollow(FOLLOW_moves_in_rule164);
            moves11=moves();

            state._fsp--;

            stream_moves.add(moves11.getTree());

            pushFollow(FOLLOW_attacks_in_rule166);
            attacks12=attacks();

            state._fsp--;

            stream_attacks.add(attacks12.getTree());

            char_literal13=(Token)match(input,20,FOLLOW_20_in_rule168);  
            stream_20.add(char_literal13);


            // AST REWRITE
            // elements: moves, condition, attacks
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:3: -> ^( RULE condition moves attacks )
            {
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:60:6: ^( RULE condition moves attacks )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RULE, "RULE")
                , root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_1, stream_moves.nextTree());

                adaptor.addChild(root_1, stream_attacks.nextTree());

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
    // $ANTLR end "rule"


    public static class moves_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moves"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:62:1: moves : (move= IDENTIFIER -> ^( MOVES $move) | '(' (move= IDENTIFIER )+ ')' -> ^( MOVES ( $move)+ ) );
    public final SAFParser.moves_return moves() throws RecognitionException {
        SAFParser.moves_return retval = new SAFParser.moves_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token move=null;
        Token char_literal14=null;
        Token char_literal15=null;

        Object move_tree=null;
        Object char_literal14_tree=null;
        Object char_literal15_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:62:8: (move= IDENTIFIER -> ^( MOVES $move) | '(' (move= IDENTIFIER )+ ')' -> ^( MOVES ( $move)+ ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENTIFIER) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:62:10: move= IDENTIFIER
                    {
                    move=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_moves195);  
                    stream_IDENTIFIER.add(move);


                    // AST REWRITE
                    // elements: move
                    // token labels: move
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_move=new RewriteRuleTokenStream(adaptor,"token move",move);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 62:26: -> ^( MOVES $move)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:62:29: ^( MOVES $move)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MOVES, "MOVES")
                        , root_1);

                        adaptor.addChild(root_1, stream_move.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:63:5: '(' (move= IDENTIFIER )+ ')'
                    {
                    char_literal14=(Token)match(input,16,FOLLOW_16_in_moves210);  
                    stream_16.add(char_literal14);


                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:63:9: (move= IDENTIFIER )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==IDENTIFIER) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:63:10: move= IDENTIFIER
                    	    {
                    	    move=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_moves215);  
                    	    stream_IDENTIFIER.add(move);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    char_literal15=(Token)match(input,17,FOLLOW_17_in_moves219);  
                    stream_17.add(char_literal15);


                    // AST REWRITE
                    // elements: move
                    // token labels: move
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_move=new RewriteRuleTokenStream(adaptor,"token move",move);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 63:32: -> ^( MOVES ( $move)+ )
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:63:35: ^( MOVES ( $move)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MOVES, "MOVES")
                        , root_1);

                        if ( !(stream_move.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_move.hasNext() ) {
                            adaptor.addChild(root_1, stream_move.nextNode());

                        }
                        stream_move.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "moves"


    public static class attacks_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attacks"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:65:1: attacks : (attack= IDENTIFIER -> ^( ATTACKS $attack) | '(' (attack= IDENTIFIER )+ ')' -> ^( ATTACKS ( $attack)+ ) );
    public final SAFParser.attacks_return attacks() throws RecognitionException {
        SAFParser.attacks_return retval = new SAFParser.attacks_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token attack=null;
        Token char_literal16=null;
        Token char_literal17=null;

        Object attack_tree=null;
        Object char_literal16_tree=null;
        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:65:9: (attack= IDENTIFIER -> ^( ATTACKS $attack) | '(' (attack= IDENTIFIER )+ ')' -> ^( ATTACKS ( $attack)+ ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:65:11: attack= IDENTIFIER
                    {
                    attack=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_attacks241);  
                    stream_IDENTIFIER.add(attack);


                    // AST REWRITE
                    // elements: attack
                    // token labels: attack
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_attack=new RewriteRuleTokenStream(adaptor,"token attack",attack);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:29: -> ^( ATTACKS $attack)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:65:32: ^( ATTACKS $attack)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ATTACKS, "ATTACKS")
                        , root_1);

                        adaptor.addChild(root_1, stream_attack.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:66:5: '(' (attack= IDENTIFIER )+ ')'
                    {
                    char_literal16=(Token)match(input,16,FOLLOW_16_in_attacks256);  
                    stream_16.add(char_literal16);


                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:66:9: (attack= IDENTIFIER )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==IDENTIFIER) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:66:10: attack= IDENTIFIER
                    	    {
                    	    attack=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_attacks261);  
                    	    stream_IDENTIFIER.add(attack);


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


                    char_literal17=(Token)match(input,17,FOLLOW_17_in_attacks265);  
                    stream_17.add(char_literal17);


                    // AST REWRITE
                    // elements: attack
                    // token labels: attack
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_attack=new RewriteRuleTokenStream(adaptor,"token attack",attack);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:34: -> ^( ATTACKS ( $attack)+ )
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:66:37: ^( ATTACKS ( $attack)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ATTACKS, "ATTACKS")
                        , root_1);

                        if ( !(stream_attack.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_attack.hasNext() ) {
                            adaptor.addChild(root_1, stream_attack.nextNode());

                        }
                        stream_attack.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "attacks"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:68:1: condition : first= andcondition ( 'or' second= condition -> ^( ORCONDITION $first $second) | -> ^( RCONDITION $first) ) ;
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal18=null;
        SAFParser.andcondition_return first =null;

        SAFParser.condition_return second =null;


        Object string_literal18_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_andcondition=new RewriteRuleSubtreeStream(adaptor,"rule andcondition");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:69:2: (first= andcondition ( 'or' second= condition -> ^( ORCONDITION $first $second) | -> ^( RCONDITION $first) ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:69:4: first= andcondition ( 'or' second= condition -> ^( ORCONDITION $first $second) | -> ^( RCONDITION $first) )
            {
            pushFollow(FOLLOW_andcondition_in_condition287);
            first=andcondition();

            state._fsp--;

            stream_andcondition.add(first.getTree());

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:69:23: ( 'or' second= condition -> ^( ORCONDITION $first $second) | -> ^( RCONDITION $first) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==17||LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:69:25: 'or' second= condition
                    {
                    string_literal18=(Token)match(input,22,FOLLOW_22_in_condition291);  
                    stream_22.add(string_literal18);


                    pushFollow(FOLLOW_condition_in_condition295);
                    second=condition();

                    state._fsp--;

                    stream_condition.add(second.getTree());

                    // AST REWRITE
                    // elements: first, second
                    // token labels: 
                    // rule labels: retval, second, first
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_second=new RewriteRuleSubtreeStream(adaptor,"rule second",second!=null?second.tree:null);
                    RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 69:47: -> ^( ORCONDITION $first $second)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:69:50: ^( ORCONDITION $first $second)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ORCONDITION, "ORCONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_first.nextTree());

                        adaptor.addChild(root_1, stream_second.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:69:82: 
                    {
                    // AST REWRITE
                    // elements: first
                    // token labels: 
                    // rule labels: retval, first
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 69:82: -> ^( RCONDITION $first)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:69:85: ^( RCONDITION $first)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(RCONDITION, "RCONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_first.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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


    public static class andcondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andcondition"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:71:1: andcondition : first= pcondition ( 'and' second= andcondition -> ^( ANDCONDITION $first $second) | -> ^( RCONDITION $first) ) ;
    public final SAFParser.andcondition_return andcondition() throws RecognitionException {
        SAFParser.andcondition_return retval = new SAFParser.andcondition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal19=null;
        SAFParser.pcondition_return first =null;

        SAFParser.andcondition_return second =null;


        Object string_literal19_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleSubtreeStream stream_pcondition=new RewriteRuleSubtreeStream(adaptor,"rule pcondition");
        RewriteRuleSubtreeStream stream_andcondition=new RewriteRuleSubtreeStream(adaptor,"rule andcondition");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:72:2: (first= pcondition ( 'and' second= andcondition -> ^( ANDCONDITION $first $second) | -> ^( RCONDITION $first) ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:72:4: first= pcondition ( 'and' second= andcondition -> ^( ANDCONDITION $first $second) | -> ^( RCONDITION $first) )
            {
            pushFollow(FOLLOW_pcondition_in_andcondition331);
            first=pcondition();

            state._fsp--;

            stream_pcondition.add(first.getTree());

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:72:21: ( 'and' second= andcondition -> ^( ANDCONDITION $first $second) | -> ^( RCONDITION $first) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==17||LA8_0==19||LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:72:23: 'and' second= andcondition
                    {
                    string_literal19=(Token)match(input,21,FOLLOW_21_in_andcondition335);  
                    stream_21.add(string_literal19);


                    pushFollow(FOLLOW_andcondition_in_andcondition339);
                    second=andcondition();

                    state._fsp--;

                    stream_andcondition.add(second.getTree());

                    // AST REWRITE
                    // elements: second, first
                    // token labels: 
                    // rule labels: retval, second, first
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_second=new RewriteRuleSubtreeStream(adaptor,"rule second",second!=null?second.tree:null);
                    RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:49: -> ^( ANDCONDITION $first $second)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:72:52: ^( ANDCONDITION $first $second)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ANDCONDITION, "ANDCONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_first.nextTree());

                        adaptor.addChild(root_1, stream_second.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:72:85: 
                    {
                    // AST REWRITE
                    // elements: first
                    // token labels: 
                    // rule labels: retval, first
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:85: -> ^( RCONDITION $first)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:72:88: ^( RCONDITION $first)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(RCONDITION, "RCONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_first.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "andcondition"


    public static class pcondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pcondition"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:75:1: pcondition : ( '(' c= condition ')' -> ^( RCONDITION $c) |p= IDENTIFIER -> ^( CONDITION $p) );
    public final SAFParser.pcondition_return pcondition() throws RecognitionException {
        SAFParser.pcondition_return retval = new SAFParser.pcondition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token p=null;
        Token char_literal20=null;
        Token char_literal21=null;
        SAFParser.condition_return c =null;


        Object p_tree=null;
        Object char_literal20_tree=null;
        Object char_literal21_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:76:2: ( '(' c= condition ')' -> ^( RCONDITION $c) |p= IDENTIFIER -> ^( CONDITION $p) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==IDENTIFIER) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:76:4: '(' c= condition ')'
                    {
                    char_literal20=(Token)match(input,16,FOLLOW_16_in_pcondition375);  
                    stream_16.add(char_literal20);


                    pushFollow(FOLLOW_condition_in_pcondition379);
                    c=condition();

                    state._fsp--;

                    stream_condition.add(c.getTree());

                    char_literal21=(Token)match(input,17,FOLLOW_17_in_pcondition381);  
                    stream_17.add(char_literal21);


                    // AST REWRITE
                    // elements: c
                    // token labels: 
                    // rule labels: retval, c
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:24: -> ^( RCONDITION $c)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:76:27: ^( RCONDITION $c)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(RCONDITION, "RCONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_c.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:77:4: p= IDENTIFIER
                    {
                    p=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pcondition397);  
                    stream_IDENTIFIER.add(p);


                    // AST REWRITE
                    // elements: p
                    // token labels: p
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 77:17: -> ^( CONDITION $p)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:77:20: ^( CONDITION $p)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONDITION, "CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_p.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "pcondition"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENTIFIER_in_fighter99 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_fighter101 = new BitSet(new long[]{0x0000000001010400L});
    public static final BitSet FOLLOW_assignment_in_fighter104 = new BitSet(new long[]{0x0000000001010400L});
    public static final BitSet FOLLOW_rule_in_fighter108 = new BitSet(new long[]{0x0000000001010400L});
    public static final BitSet FOLLOW_24_in_fighter111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assignment134 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_assignment136 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DIGIT_in_assignment138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_rule160 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rule162 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_moves_in_rule164 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_attacks_in_rule166 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rule168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_moves195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_moves210 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_moves215 = new BitSet(new long[]{0x0000000000020400L});
    public static final BitSet FOLLOW_17_in_moves219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_attacks241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_attacks256 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_attacks261 = new BitSet(new long[]{0x0000000000020400L});
    public static final BitSet FOLLOW_17_in_attacks265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andcondition_in_condition287 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_condition291 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_condition_in_condition295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pcondition_in_andcondition331 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_andcondition335 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_andcondition_in_andcondition339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_pcondition375 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_condition_in_pcondition379 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_pcondition381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pcondition397 = new BitSet(new long[]{0x0000000000000002L});

}