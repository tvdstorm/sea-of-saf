// $ANTLR 3.4 C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g 2012-01-30 14:52:47

package saf.parser;
import java.util.List;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "ANDCONDITION", "ASSIGNMENT", "CONDITION", "DIGIT", "FIGHTER", "IDENTIFIER", "NEWLINE", "ORCONDITION", "RCONDITION", "WS", "'('", "')'", "'='", "'['", "']'", "'and'", "'or'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int ACTION=4;
    public static final int ANDCONDITION=5;
    public static final int ASSIGNMENT=6;
    public static final int CONDITION=7;
    public static final int DIGIT=8;
    public static final int FIGHTER=9;
    public static final int IDENTIFIER=10;
    public static final int NEWLINE=11;
    public static final int ORCONDITION=12;
    public static final int RCONDITION=13;
    public static final int WS=14;

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
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:1: fighter : ( ws )? IDENTIFIER ( ws )? '{' ws ( assignment endline ( ws )? )* ( action endline ( ws )? )* '}' ( ws )? -> ^( FIGHTER IDENTIFIER ( assignment )* ( action )* ) ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER2=null;
        Token char_literal4=null;
        Token char_literal12=null;
        SAFParser.ws_return ws1 =null;

        SAFParser.ws_return ws3 =null;

        SAFParser.ws_return ws5 =null;

        SAFParser.assignment_return assignment6 =null;

        SAFParser.endline_return endline7 =null;

        SAFParser.ws_return ws8 =null;

        SAFParser.action_return action9 =null;

        SAFParser.endline_return endline10 =null;

        SAFParser.ws_return ws11 =null;

        SAFParser.ws_return ws13 =null;


        Object IDENTIFIER2_tree=null;
        Object char_literal4_tree=null;
        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_endline=new RewriteRuleSubtreeStream(adaptor,"rule endline");
        RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:9: ( ( ws )? IDENTIFIER ( ws )? '{' ws ( assignment endline ( ws )? )* ( action endline ( ws )? )* '}' ( ws )? -> ^( FIGHTER IDENTIFIER ( assignment )* ( action )* ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:11: ( ws )? IDENTIFIER ( ws )? '{' ws ( assignment endline ( ws )? )* ( action endline ( ws )? )* '}' ( ws )?
            {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:11: ( ws )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==NEWLINE||LA1_0==WS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:11: ws
                    {
                    pushFollow(FOLLOW_ws_in_fighter89);
                    ws1=ws();

                    state._fsp--;

                    stream_ws.add(ws1.getTree());

                    }
                    break;

            }


            IDENTIFIER2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fighter92);  
            stream_IDENTIFIER.add(IDENTIFIER2);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:26: ( ws )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NEWLINE||LA2_0==WS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:26: ws
                    {
                    pushFollow(FOLLOW_ws_in_fighter94);
                    ws3=ws();

                    state._fsp--;

                    stream_ws.add(ws3.getTree());

                    }
                    break;

            }


            char_literal4=(Token)match(input,22,FOLLOW_22_in_fighter97);  
            stream_22.add(char_literal4);


            pushFollow(FOLLOW_ws_in_fighter99);
            ws5=ws();

            state._fsp--;

            stream_ws.add(ws5.getTree());

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:37: ( assignment endline ( ws )? )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:38: assignment endline ( ws )?
            	    {
            	    pushFollow(FOLLOW_assignment_in_fighter102);
            	    assignment6=assignment();

            	    state._fsp--;

            	    stream_assignment.add(assignment6.getTree());

            	    pushFollow(FOLLOW_endline_in_fighter104);
            	    endline7=endline();

            	    state._fsp--;

            	    stream_endline.add(endline7.getTree());

            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:57: ( ws )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==NEWLINE||LA3_0==WS) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:57: ws
            	            {
            	            pushFollow(FOLLOW_ws_in_fighter106);
            	            ws8=ws();

            	            state._fsp--;

            	            stream_ws.add(ws8.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:63: ( action endline ( ws )? )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENTIFIER||LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:64: action endline ( ws )?
            	    {
            	    pushFollow(FOLLOW_action_in_fighter112);
            	    action9=action();

            	    state._fsp--;

            	    stream_action.add(action9.getTree());

            	    pushFollow(FOLLOW_endline_in_fighter114);
            	    endline10=endline();

            	    state._fsp--;

            	    stream_endline.add(endline10.getTree());

            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:79: ( ws )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==NEWLINE||LA5_0==WS) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:53:79: ws
            	            {
            	            pushFollow(FOLLOW_ws_in_fighter116);
            	            ws11=ws();

            	            state._fsp--;

            	            stream_ws.add(ws11.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            char_literal12=(Token)match(input,23,FOLLOW_23_in_fighter123);  
            stream_23.add(char_literal12);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:54:7: ( ws )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NEWLINE||LA7_0==WS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:54:7: ws
                    {
                    pushFollow(FOLLOW_ws_in_fighter125);
                    ws13=ws();

                    state._fsp--;

                    stream_ws.add(ws13.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: action, IDENTIFIER, assignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 54:11: -> ^( FIGHTER IDENTIFIER ( assignment )* ( action )* )
            {
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:54:14: ^( FIGHTER IDENTIFIER ( assignment )* ( action )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIGHTER, "FIGHTER")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:54:35: ( assignment )*
                while ( stream_assignment.hasNext() ) {
                    adaptor.addChild(root_1, stream_assignment.nextTree());

                }
                stream_assignment.reset();

                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:54:47: ( action )*
                while ( stream_action.hasNext() ) {
                    adaptor.addChild(root_1, stream_action.nextTree());

                }
                stream_action.reset();

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
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:56:1: assignment : IDENTIFIER ( ws )? '=' ( ws )? DIGIT -> ^( ASSIGNMENT IDENTIFIER DIGIT ) ;
    public final SAFParser.assignment_return assignment() throws RecognitionException {
        SAFParser.assignment_return retval = new SAFParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER14=null;
        Token char_literal16=null;
        Token DIGIT18=null;
        SAFParser.ws_return ws15 =null;

        SAFParser.ws_return ws17 =null;


        Object IDENTIFIER14_tree=null;
        Object char_literal16_tree=null;
        Object DIGIT18_tree=null;
        RewriteRuleTokenStream stream_DIGIT=new RewriteRuleTokenStream(adaptor,"token DIGIT");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:57:2: ( IDENTIFIER ( ws )? '=' ( ws )? DIGIT -> ^( ASSIGNMENT IDENTIFIER DIGIT ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:57:4: IDENTIFIER ( ws )? '=' ( ws )? DIGIT
            {
            IDENTIFIER14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment149);  
            stream_IDENTIFIER.add(IDENTIFIER14);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:57:15: ( ws )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NEWLINE||LA8_0==WS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:57:15: ws
                    {
                    pushFollow(FOLLOW_ws_in_assignment151);
                    ws15=ws();

                    state._fsp--;

                    stream_ws.add(ws15.getTree());

                    }
                    break;

            }


            char_literal16=(Token)match(input,17,FOLLOW_17_in_assignment154);  
            stream_17.add(char_literal16);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:57:23: ( ws )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NEWLINE||LA9_0==WS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:57:23: ws
                    {
                    pushFollow(FOLLOW_ws_in_assignment156);
                    ws17=ws();

                    state._fsp--;

                    stream_ws.add(ws17.getTree());

                    }
                    break;

            }


            DIGIT18=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_assignment159);  
            stream_DIGIT.add(DIGIT18);


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
            // 58:4: -> ^( ASSIGNMENT IDENTIFIER DIGIT )
            {
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:58:7: ^( ASSIGNMENT IDENTIFIER DIGIT )
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


    public static class action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:60:1: action : condition ( ws )? '[' ( ws )? move= IDENTIFIER ws attack= IDENTIFIER ( ws )? ']' -> ^( ACTION condition $move $attack) ;
    public final SAFParser.action_return action() throws RecognitionException {
        SAFParser.action_return retval = new SAFParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token move=null;
        Token attack=null;
        Token char_literal21=null;
        Token char_literal25=null;
        SAFParser.condition_return condition19 =null;

        SAFParser.ws_return ws20 =null;

        SAFParser.ws_return ws22 =null;

        SAFParser.ws_return ws23 =null;

        SAFParser.ws_return ws24 =null;


        Object move_tree=null;
        Object attack_tree=null;
        Object char_literal21_tree=null;
        Object char_literal25_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:60:9: ( condition ( ws )? '[' ( ws )? move= IDENTIFIER ws attack= IDENTIFIER ( ws )? ']' -> ^( ACTION condition $move $attack) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:60:11: condition ( ws )? '[' ( ws )? move= IDENTIFIER ws attack= IDENTIFIER ( ws )? ']'
            {
            pushFollow(FOLLOW_condition_in_action181);
            condition19=condition();

            state._fsp--;

            stream_condition.add(condition19.getTree());

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:60:21: ( ws )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NEWLINE||LA10_0==WS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:60:21: ws
                    {
                    pushFollow(FOLLOW_ws_in_action183);
                    ws20=ws();

                    state._fsp--;

                    stream_ws.add(ws20.getTree());

                    }
                    break;

            }


            char_literal21=(Token)match(input,18,FOLLOW_18_in_action186);  
            stream_18.add(char_literal21);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:60:29: ( ws )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NEWLINE||LA11_0==WS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:60:29: ws
                    {
                    pushFollow(FOLLOW_ws_in_action188);
                    ws22=ws();

                    state._fsp--;

                    stream_ws.add(ws22.getTree());

                    }
                    break;

            }


            move=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_action193);  
            stream_IDENTIFIER.add(move);


            pushFollow(FOLLOW_ws_in_action195);
            ws23=ws();

            state._fsp--;

            stream_ws.add(ws23.getTree());

            attack=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_action199);  
            stream_IDENTIFIER.add(attack);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:60:70: ( ws )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NEWLINE||LA12_0==WS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:60:70: ws
                    {
                    pushFollow(FOLLOW_ws_in_action201);
                    ws24=ws();

                    state._fsp--;

                    stream_ws.add(ws24.getTree());

                    }
                    break;

            }


            char_literal25=(Token)match(input,19,FOLLOW_19_in_action204);  
            stream_19.add(char_literal25);


            // AST REWRITE
            // elements: condition, attack, move
            // token labels: attack, move
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_attack=new RewriteRuleTokenStream(adaptor,"token attack",attack);
            RewriteRuleTokenStream stream_move=new RewriteRuleTokenStream(adaptor,"token move",move);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:3: -> ^( ACTION condition $move $attack)
            {
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:61:6: ^( ACTION condition $move $attack)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ACTION, "ACTION")
                , root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_1, stream_move.nextNode());

                adaptor.addChild(root_1, stream_attack.nextNode());

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
    // $ANTLR end "action"


    public static class ws_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ws"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:63:1: ws : ( NEWLINE | WS )+ ;
    public final SAFParser.ws_return ws() throws RecognitionException {
        SAFParser.ws_return retval = new SAFParser.ws_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set26=null;

        Object set26_tree=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:63:4: ( ( NEWLINE | WS )+ )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:63:6: ( NEWLINE | WS )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:63:6: ( NEWLINE | WS )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==NEWLINE||LA13_0==WS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:
            	    {
            	    set26=(Token)input.LT(1);

            	    if ( input.LA(1)==NEWLINE||input.LA(1)==WS ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set26)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // $ANTLR end "ws"


    public static class endline_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "endline"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:64:1: endline : ( WS )* NEWLINE ;
    public final SAFParser.endline_return endline() throws RecognitionException {
        SAFParser.endline_return retval = new SAFParser.endline_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WS27=null;
        Token NEWLINE28=null;

        Object WS27_tree=null;
        Object NEWLINE28_tree=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:64:9: ( ( WS )* NEWLINE )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:64:11: ( WS )* NEWLINE
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:64:11: ( WS )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==WS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:64:11: WS
            	    {
            	    WS27=(Token)match(input,WS,FOLLOW_WS_in_endline242); 
            	    WS27_tree = 
            	    (Object)adaptor.create(WS27)
            	    ;
            	    adaptor.addChild(root_0, WS27_tree);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            NEWLINE28=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_endline245); 
            NEWLINE28_tree = 
            (Object)adaptor.create(NEWLINE28)
            ;
            adaptor.addChild(root_0, NEWLINE28_tree);


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
    // $ANTLR end "endline"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:66:1: condition : first= andcondition ( ( WS )+ 'or' ( WS )+ second= condition -> ^( ORCONDITION $first $second) | -> ^( RCONDITION $first) ) ;
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WS29=null;
        Token string_literal30=null;
        Token WS31=null;
        SAFParser.andcondition_return first =null;

        SAFParser.condition_return second =null;


        Object WS29_tree=null;
        Object string_literal30_tree=null;
        Object WS31_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_andcondition=new RewriteRuleSubtreeStream(adaptor,"rule andcondition");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:67:2: (first= andcondition ( ( WS )+ 'or' ( WS )+ second= condition -> ^( ORCONDITION $first $second) | -> ^( RCONDITION $first) ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:67:4: first= andcondition ( ( WS )+ 'or' ( WS )+ second= condition -> ^( ORCONDITION $first $second) | -> ^( RCONDITION $first) )
            {
            pushFollow(FOLLOW_andcondition_in_condition257);
            first=andcondition();

            state._fsp--;

            stream_andcondition.add(first.getTree());

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:67:23: ( ( WS )+ 'or' ( WS )+ second= condition -> ^( ORCONDITION $first $second) | -> ^( RCONDITION $first) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:67:24: ( WS )+ 'or' ( WS )+ second= condition
                    {
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:67:24: ( WS )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==WS) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:67:24: WS
                    	    {
                    	    WS29=(Token)match(input,WS,FOLLOW_WS_in_condition260);  
                    	    stream_WS.add(WS29);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    string_literal30=(Token)match(input,21,FOLLOW_21_in_condition263);  
                    stream_21.add(string_literal30);


                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:67:33: ( WS )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==WS) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:67:33: WS
                    	    {
                    	    WS31=(Token)match(input,WS,FOLLOW_WS_in_condition265);  
                    	    stream_WS.add(WS31);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    pushFollow(FOLLOW_condition_in_condition270);
                    second=condition();

                    state._fsp--;

                    stream_condition.add(second.getTree());

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
                    // 67:54: -> ^( ORCONDITION $first $second)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:67:57: ^( ORCONDITION $first $second)
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
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:67:89: 
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
                    // 67:89: -> ^( RCONDITION $first)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:67:92: ^( RCONDITION $first)
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
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:70:1: andcondition : first= pcondition ( ( WS )+ 'and' ( WS )+ second= andcondition -> ^( ANDCONDITION $first $second) | -> ^( RCONDITION $first) ) ;
    public final SAFParser.andcondition_return andcondition() throws RecognitionException {
        SAFParser.andcondition_return retval = new SAFParser.andcondition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WS32=null;
        Token string_literal33=null;
        Token WS34=null;
        SAFParser.pcondition_return first =null;

        SAFParser.andcondition_return second =null;


        Object WS32_tree=null;
        Object string_literal33_tree=null;
        Object WS34_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleSubtreeStream stream_pcondition=new RewriteRuleSubtreeStream(adaptor,"rule pcondition");
        RewriteRuleSubtreeStream stream_andcondition=new RewriteRuleSubtreeStream(adaptor,"rule andcondition");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:71:2: (first= pcondition ( ( WS )+ 'and' ( WS )+ second= andcondition -> ^( ANDCONDITION $first $second) | -> ^( RCONDITION $first) ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:71:4: first= pcondition ( ( WS )+ 'and' ( WS )+ second= andcondition -> ^( ANDCONDITION $first $second) | -> ^( RCONDITION $first) )
            {
            pushFollow(FOLLOW_pcondition_in_andcondition307);
            first=pcondition();

            state._fsp--;

            stream_pcondition.add(first.getTree());

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:71:21: ( ( WS )+ 'and' ( WS )+ second= andcondition -> ^( ANDCONDITION $first $second) | -> ^( RCONDITION $first) )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:71:22: ( WS )+ 'and' ( WS )+ second= andcondition
                    {
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:71:22: ( WS )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==WS) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:71:22: WS
                    	    {
                    	    WS32=(Token)match(input,WS,FOLLOW_WS_in_andcondition310);  
                    	    stream_WS.add(WS32);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    string_literal33=(Token)match(input,20,FOLLOW_20_in_andcondition313);  
                    stream_20.add(string_literal33);


                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:71:32: ( WS )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==WS) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:71:32: WS
                    	    {
                    	    WS34=(Token)match(input,WS,FOLLOW_WS_in_andcondition315);  
                    	    stream_WS.add(WS34);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    pushFollow(FOLLOW_andcondition_in_andcondition320);
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
                    // 71:56: -> ^( ANDCONDITION $first $second)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:71:59: ^( ANDCONDITION $first $second)
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
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:71:92: 
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
                    // 71:92: -> ^( RCONDITION $first)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:71:95: ^( RCONDITION $first)
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
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:74:1: pcondition : ( '(' c= condition ')' -> ^( RCONDITION $c) |p= IDENTIFIER -> ^( CONDITION $p) );
    public final SAFParser.pcondition_return pcondition() throws RecognitionException {
        SAFParser.pcondition_return retval = new SAFParser.pcondition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token p=null;
        Token char_literal35=null;
        Token char_literal36=null;
        SAFParser.condition_return c =null;


        Object p_tree=null;
        Object char_literal35_tree=null;
        Object char_literal36_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:75:2: ( '(' c= condition ')' -> ^( RCONDITION $c) |p= IDENTIFIER -> ^( CONDITION $p) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            else if ( (LA21_0==IDENTIFIER) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:75:4: '(' c= condition ')'
                    {
                    char_literal35=(Token)match(input,15,FOLLOW_15_in_pcondition356);  
                    stream_15.add(char_literal35);


                    pushFollow(FOLLOW_condition_in_pcondition360);
                    c=condition();

                    state._fsp--;

                    stream_condition.add(c.getTree());

                    char_literal36=(Token)match(input,16,FOLLOW_16_in_pcondition362);  
                    stream_16.add(char_literal36);


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
                    // 75:24: -> ^( RCONDITION $c)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:75:27: ^( RCONDITION $c)
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
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:76:4: p= IDENTIFIER
                    {
                    p=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pcondition378);  
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
                    // 76:17: -> ^( CONDITION $p)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAF.g:76:20: ^( CONDITION $p)
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA4_eotS =
        "\6\uffff";
    static final String DFA4_eofS =
        "\6\uffff";
    static final String DFA4_minS =
        "\1\12\1\uffff\3\13\1\uffff";
    static final String DFA4_maxS =
        "\1\27\1\uffff\1\22\1\25\1\22\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\2\3\uffff\1\1";
    static final String DFA4_specialS =
        "\6\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\4\uffff\1\1\7\uffff\1\1",
            "",
            "\1\4\2\uffff\1\3\2\uffff\1\5\1\1",
            "\1\4\2\uffff\1\3\2\uffff\1\5\1\1\1\uffff\2\1",
            "\1\4\2\uffff\1\4\2\uffff\1\5\1\1",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 53:37: ( assignment endline ( ws )? )*";
        }
    }
    static final String DFA17_eotS =
        "\4\uffff";
    static final String DFA17_eofS =
        "\4\uffff";
    static final String DFA17_minS =
        "\2\13\2\uffff";
    static final String DFA17_maxS =
        "\1\22\1\25\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA17_specialS =
        "\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\2\uffff\1\1\1\uffff\1\2\1\uffff\1\2",
            "\1\2\2\uffff\1\1\3\uffff\1\2\2\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "67:23: ( ( WS )+ 'or' ( WS )+ second= condition -> ^( ORCONDITION $first $second) | -> ^( RCONDITION $first) )";
        }
    }
    static final String DFA20_eotS =
        "\4\uffff";
    static final String DFA20_eofS =
        "\4\uffff";
    static final String DFA20_minS =
        "\2\13\2\uffff";
    static final String DFA20_maxS =
        "\1\22\1\25\2\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA20_specialS =
        "\4\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\2\uffff\1\1\1\uffff\1\2\1\uffff\1\2",
            "\1\2\2\uffff\1\1\3\uffff\1\2\1\uffff\1\3\1\2",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "71:21: ( ( WS )+ 'and' ( WS )+ second= andcondition -> ^( ANDCONDITION $first $second) | -> ^( RCONDITION $first) )";
        }
    }
 

    public static final BitSet FOLLOW_ws_in_fighter89 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fighter92 = new BitSet(new long[]{0x0000000000404800L});
    public static final BitSet FOLLOW_ws_in_fighter94 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_fighter97 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_ws_in_fighter99 = new BitSet(new long[]{0x0000000000808400L});
    public static final BitSet FOLLOW_assignment_in_fighter102 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_endline_in_fighter104 = new BitSet(new long[]{0x000000000080CC00L});
    public static final BitSet FOLLOW_ws_in_fighter106 = new BitSet(new long[]{0x0000000000808400L});
    public static final BitSet FOLLOW_action_in_fighter112 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_endline_in_fighter114 = new BitSet(new long[]{0x000000000080CC00L});
    public static final BitSet FOLLOW_ws_in_fighter116 = new BitSet(new long[]{0x0000000000808400L});
    public static final BitSet FOLLOW_23_in_fighter123 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ws_in_fighter125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assignment149 = new BitSet(new long[]{0x0000000000024800L});
    public static final BitSet FOLLOW_ws_in_assignment151 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_assignment154 = new BitSet(new long[]{0x0000000000004900L});
    public static final BitSet FOLLOW_ws_in_assignment156 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DIGIT_in_assignment159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_action181 = new BitSet(new long[]{0x0000000000044800L});
    public static final BitSet FOLLOW_ws_in_action183 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_action186 = new BitSet(new long[]{0x0000000000004C00L});
    public static final BitSet FOLLOW_ws_in_action188 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_action193 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_ws_in_action195 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_action199 = new BitSet(new long[]{0x0000000000084800L});
    public static final BitSet FOLLOW_ws_in_action201 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_action204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_endline242 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_NEWLINE_in_endline245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andcondition_in_condition257 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_WS_in_condition260 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_21_in_condition263 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_condition265 = new BitSet(new long[]{0x000000000000C400L});
    public static final BitSet FOLLOW_condition_in_condition270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pcondition_in_andcondition307 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_WS_in_andcondition310 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_20_in_andcondition313 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_andcondition315 = new BitSet(new long[]{0x000000000000C400L});
    public static final BitSet FOLLOW_andcondition_in_andcondition320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_pcondition356 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_condition_in_pcondition360 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_pcondition362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pcondition378 = new BitSet(new long[]{0x0000000000000002L});

}