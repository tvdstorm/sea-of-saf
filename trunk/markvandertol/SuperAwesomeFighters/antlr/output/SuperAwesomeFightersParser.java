// $ANTLR 3.4 C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g 2012-01-17 18:31:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SuperAwesomeFightersParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "ASSIGNMENT", "CONDITION", "DIGIT", "NAME", "NEWLINE", "PROGRAM", "WS", "'('", "')'", "'='", "'['", "']'", "'always'", "'and'", "'block_high'", "'block_low'", "'crouch'", "'even'", "'far'", "'jump'", "'kickPower'", "'kickReach'", "'kick_high'", "'kick_low'", "'much_stronger'", "'much_weaker'", "'near'", "'or'", "'punchPower'", "'punchReach'", "'punch_high'", "'punch_low'", "'run_away'", "'run_towards'", "'stand'", "'stronger'", "'walk_away'", "'walk_towards'", "'weaker'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int ACTION=4;
    public static final int ASSIGNMENT=5;
    public static final int CONDITION=6;
    public static final int DIGIT=7;
    public static final int NAME=8;
    public static final int NEWLINE=9;
    public static final int PROGRAM=10;
    public static final int WS=11;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SuperAwesomeFightersParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SuperAwesomeFightersParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SuperAwesomeFightersParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:1: prog : ( ws )? NAME ( ws )? '{' ws ( assignment endline ( ws )? )* ( action endline ( ws )? )* '}' ( ws )? -> ^( PROGRAM NAME ( assignment )* ( action )* ) ;
    public final SuperAwesomeFightersParser.prog_return prog() throws RecognitionException {
        SuperAwesomeFightersParser.prog_return retval = new SuperAwesomeFightersParser.prog_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NAME2=null;
        Token char_literal4=null;
        Token char_literal12=null;
        SuperAwesomeFightersParser.ws_return ws1 =null;

        SuperAwesomeFightersParser.ws_return ws3 =null;

        SuperAwesomeFightersParser.ws_return ws5 =null;

        SuperAwesomeFightersParser.assignment_return assignment6 =null;

        SuperAwesomeFightersParser.endline_return endline7 =null;

        SuperAwesomeFightersParser.ws_return ws8 =null;

        SuperAwesomeFightersParser.action_return action9 =null;

        SuperAwesomeFightersParser.endline_return endline10 =null;

        SuperAwesomeFightersParser.ws_return ws11 =null;

        SuperAwesomeFightersParser.ws_return ws13 =null;


        Object NAME2_tree=null;
        Object char_literal4_tree=null;
        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_endline=new RewriteRuleSubtreeStream(adaptor,"rule endline");
        RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:6: ( ( ws )? NAME ( ws )? '{' ws ( assignment endline ( ws )? )* ( action endline ( ws )? )* '}' ( ws )? -> ^( PROGRAM NAME ( assignment )* ( action )* ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:8: ( ws )? NAME ( ws )? '{' ws ( assignment endline ( ws )? )* ( action endline ( ws )? )* '}' ( ws )?
            {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:8: ( ws )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==NEWLINE||LA1_0==WS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:8: ws
                    {
                    pushFollow(FOLLOW_ws_in_prog45);
                    ws1=ws();

                    state._fsp--;

                    stream_ws.add(ws1.getTree());

                    }
                    break;

            }


            NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_prog48);  
            stream_NAME.add(NAME2);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:17: ( ws )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NEWLINE||LA2_0==WS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:17: ws
                    {
                    pushFollow(FOLLOW_ws_in_prog50);
                    ws3=ws();

                    state._fsp--;

                    stream_ws.add(ws3.getTree());

                    }
                    break;

            }


            char_literal4=(Token)match(input,44,FOLLOW_44_in_prog53);  
            stream_44.add(char_literal4);


            pushFollow(FOLLOW_ws_in_prog55);
            ws5=ws();

            state._fsp--;

            stream_ws.add(ws5.getTree());

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:28: ( assignment endline ( ws )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= 25 && LA4_0 <= 26)||(LA4_0 >= 33 && LA4_0 <= 34)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:29: assignment endline ( ws )?
            	    {
            	    pushFollow(FOLLOW_assignment_in_prog58);
            	    assignment6=assignment();

            	    state._fsp--;

            	    stream_assignment.add(assignment6.getTree());

            	    pushFollow(FOLLOW_endline_in_prog60);
            	    endline7=endline();

            	    state._fsp--;

            	    stream_endline.add(endline7.getTree());

            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:48: ( ws )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==NEWLINE||LA3_0==WS) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:48: ws
            	            {
            	            pushFollow(FOLLOW_ws_in_prog62);
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


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:54: ( action endline ( ws )? )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12||LA6_0==17||(LA6_0 >= 22 && LA6_0 <= 23)||(LA6_0 >= 29 && LA6_0 <= 31)||LA6_0==40||LA6_0==43) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:55: action endline ( ws )?
            	    {
            	    pushFollow(FOLLOW_action_in_prog68);
            	    action9=action();

            	    state._fsp--;

            	    stream_action.add(action9.getTree());

            	    pushFollow(FOLLOW_endline_in_prog70);
            	    endline10=endline();

            	    state._fsp--;

            	    stream_endline.add(endline10.getTree());

            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:70: ( ws )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==NEWLINE||LA5_0==WS) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:14:70: ws
            	            {
            	            pushFollow(FOLLOW_ws_in_prog72);
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


            char_literal12=(Token)match(input,45,FOLLOW_45_in_prog79);  
            stream_45.add(char_literal12);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:15:7: ( ws )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NEWLINE||LA7_0==WS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:15:7: ws
                    {
                    pushFollow(FOLLOW_ws_in_prog81);
                    ws13=ws();

                    state._fsp--;

                    stream_ws.add(ws13.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: action, assignment, NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 15:11: -> ^( PROGRAM NAME ( assignment )* ( action )* )
            {
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:15:14: ^( PROGRAM NAME ( assignment )* ( action )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NAME.nextNode()
                );

                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:15:29: ( assignment )*
                while ( stream_assignment.hasNext() ) {
                    adaptor.addChild(root_1, stream_assignment.nextTree());

                }
                stream_assignment.reset();

                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:15:41: ( action )*
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
    // $ANTLR end "prog"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:17:1: assignment : strengths ( ws )? '=' ( ws )? ( DIGIT )+ -> ^( ASSIGNMENT strengths ( DIGIT )+ ) ;
    public final SuperAwesomeFightersParser.assignment_return assignment() throws RecognitionException {
        SuperAwesomeFightersParser.assignment_return retval = new SuperAwesomeFightersParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal16=null;
        Token DIGIT18=null;
        SuperAwesomeFightersParser.strengths_return strengths14 =null;

        SuperAwesomeFightersParser.ws_return ws15 =null;

        SuperAwesomeFightersParser.ws_return ws17 =null;


        Object char_literal16_tree=null;
        Object DIGIT18_tree=null;
        RewriteRuleTokenStream stream_DIGIT=new RewriteRuleTokenStream(adaptor,"token DIGIT");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleSubtreeStream stream_strengths=new RewriteRuleSubtreeStream(adaptor,"rule strengths");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:18:2: ( strengths ( ws )? '=' ( ws )? ( DIGIT )+ -> ^( ASSIGNMENT strengths ( DIGIT )+ ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:18:4: strengths ( ws )? '=' ( ws )? ( DIGIT )+
            {
            pushFollow(FOLLOW_strengths_in_assignment105);
            strengths14=strengths();

            state._fsp--;

            stream_strengths.add(strengths14.getTree());

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:18:14: ( ws )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NEWLINE||LA8_0==WS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:18:14: ws
                    {
                    pushFollow(FOLLOW_ws_in_assignment107);
                    ws15=ws();

                    state._fsp--;

                    stream_ws.add(ws15.getTree());

                    }
                    break;

            }


            char_literal16=(Token)match(input,14,FOLLOW_14_in_assignment110);  
            stream_14.add(char_literal16);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:18:22: ( ws )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NEWLINE||LA9_0==WS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:18:22: ws
                    {
                    pushFollow(FOLLOW_ws_in_assignment112);
                    ws17=ws();

                    state._fsp--;

                    stream_ws.add(ws17.getTree());

                    }
                    break;

            }


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:18:26: ( DIGIT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DIGIT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:18:26: DIGIT
            	    {
            	    DIGIT18=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_assignment115);  
            	    stream_DIGIT.add(DIGIT18);


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            // AST REWRITE
            // elements: strengths, DIGIT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 19:4: -> ^( ASSIGNMENT strengths ( DIGIT )+ )
            {
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:19:7: ^( ASSIGNMENT strengths ( DIGIT )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT")
                , root_1);

                adaptor.addChild(root_1, stream_strengths.nextTree());

                if ( !(stream_DIGIT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_DIGIT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DIGIT.nextNode()
                    );

                }
                stream_DIGIT.reset();

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
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:21:1: action : condition ( ws )? '[' move ws attack ( ws )? ']' -> ^( ACTION condition move attack ) ;
    public final SuperAwesomeFightersParser.action_return action() throws RecognitionException {
        SuperAwesomeFightersParser.action_return retval = new SuperAwesomeFightersParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal21=null;
        Token char_literal26=null;
        SuperAwesomeFightersParser.condition_return condition19 =null;

        SuperAwesomeFightersParser.ws_return ws20 =null;

        SuperAwesomeFightersParser.move_return move22 =null;

        SuperAwesomeFightersParser.ws_return ws23 =null;

        SuperAwesomeFightersParser.attack_return attack24 =null;

        SuperAwesomeFightersParser.ws_return ws25 =null;


        Object char_literal21_tree=null;
        Object char_literal26_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_attack=new RewriteRuleSubtreeStream(adaptor,"rule attack");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:21:9: ( condition ( ws )? '[' move ws attack ( ws )? ']' -> ^( ACTION condition move attack ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:21:11: condition ( ws )? '[' move ws attack ( ws )? ']'
            {
            pushFollow(FOLLOW_condition_in_action139);
            condition19=condition();

            state._fsp--;

            stream_condition.add(condition19.getTree());

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:21:21: ( ws )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NEWLINE||LA11_0==WS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:21:21: ws
                    {
                    pushFollow(FOLLOW_ws_in_action141);
                    ws20=ws();

                    state._fsp--;

                    stream_ws.add(ws20.getTree());

                    }
                    break;

            }


            char_literal21=(Token)match(input,15,FOLLOW_15_in_action144);  
            stream_15.add(char_literal21);


            pushFollow(FOLLOW_move_in_action146);
            move22=move();

            state._fsp--;

            stream_move.add(move22.getTree());

            pushFollow(FOLLOW_ws_in_action148);
            ws23=ws();

            state._fsp--;

            stream_ws.add(ws23.getTree());

            pushFollow(FOLLOW_attack_in_action150);
            attack24=attack();

            state._fsp--;

            stream_attack.add(attack24.getTree());

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:21:44: ( ws )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NEWLINE||LA12_0==WS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:21:44: ws
                    {
                    pushFollow(FOLLOW_ws_in_action152);
                    ws25=ws();

                    state._fsp--;

                    stream_ws.add(ws25.getTree());

                    }
                    break;

            }


            char_literal26=(Token)match(input,16,FOLLOW_16_in_action155);  
            stream_16.add(char_literal26);


            // AST REWRITE
            // elements: attack, condition, move
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 22:3: -> ^( ACTION condition move attack )
            {
                // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:22:6: ^( ACTION condition move attack )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ACTION, "ACTION")
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
    // $ANTLR end "action"


    public static class ws_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ws"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:24:1: ws : ( NEWLINE | WS )+ ;
    public final SuperAwesomeFightersParser.ws_return ws() throws RecognitionException {
        SuperAwesomeFightersParser.ws_return retval = new SuperAwesomeFightersParser.ws_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set27=null;

        Object set27_tree=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:24:4: ( ( NEWLINE | WS )+ )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:24:6: ( NEWLINE | WS )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:24:6: ( NEWLINE | WS )+
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
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:
            	    {
            	    set27=(Token)input.LT(1);

            	    if ( input.LA(1)==NEWLINE||input.LA(1)==WS ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set27)
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
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:25:1: endline : ( WS )* NEWLINE ;
    public final SuperAwesomeFightersParser.endline_return endline() throws RecognitionException {
        SuperAwesomeFightersParser.endline_return retval = new SuperAwesomeFightersParser.endline_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WS28=null;
        Token NEWLINE29=null;

        Object WS28_tree=null;
        Object NEWLINE29_tree=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:25:9: ( ( WS )* NEWLINE )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:25:11: ( WS )* NEWLINE
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:25:11: ( WS )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==WS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:25:11: WS
            	    {
            	    WS28=(Token)match(input,WS,FOLLOW_WS_in_endline191); 
            	    WS28_tree = 
            	    (Object)adaptor.create(WS28)
            	    ;
            	    adaptor.addChild(root_0, WS28_tree);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            NEWLINE29=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_endline194); 
            NEWLINE29_tree = 
            (Object)adaptor.create(NEWLINE29)
            ;
            adaptor.addChild(root_0, NEWLINE29_tree);


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


    public static class strengths_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "strengths"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:27:1: strengths : ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' ) ;
    public final SuperAwesomeFightersParser.strengths_return strengths() throws RecognitionException {
        SuperAwesomeFightersParser.strengths_return retval = new SuperAwesomeFightersParser.strengths_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set30=null;

        Object set30_tree=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:28:2: ( ( 'punchReach' | 'kickReach' | 'kickPower' | 'punchPower' ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:
            {
            root_0 = (Object)adaptor.nil();


            set30=(Token)input.LT(1);

            if ( (input.LA(1) >= 25 && input.LA(1) <= 26)||(input.LA(1) >= 33 && input.LA(1) <= 34) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set30)
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
    // $ANTLR end "strengths"


    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:30:1: move : ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' ) ;
    public final SuperAwesomeFightersParser.move_return move() throws RecognitionException {
        SuperAwesomeFightersParser.move_return retval = new SuperAwesomeFightersParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set31=null;

        Object set31_tree=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:30:6: ( ( 'jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away' ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:
            {
            root_0 = (Object)adaptor.nil();


            set31=(Token)input.LT(1);

            if ( input.LA(1)==21||input.LA(1)==24||(input.LA(1) >= 37 && input.LA(1) <= 39)||(input.LA(1) >= 41 && input.LA(1) <= 42) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set31)
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
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:32:1: attack : ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' ) ;
    public final SuperAwesomeFightersParser.attack_return attack() throws RecognitionException {
        SuperAwesomeFightersParser.attack_return retval = new SuperAwesomeFightersParser.attack_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set32=null;

        Object set32_tree=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:32:9: ( ( 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high' ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:
            {
            root_0 = (Object)adaptor.nil();


            set32=(Token)input.LT(1);

            if ( (input.LA(1) >= 19 && input.LA(1) <= 20)||(input.LA(1) >= 27 && input.LA(1) <= 28)||(input.LA(1) >= 35 && input.LA(1) <= 36) ) {
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
    // $ANTLR end "attack"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:34:1: condition : ( '(' c= condition ')' -> ^( CONDITION $c) |first= conditioni ( WS )+ operator ( WS )+ second= condition -> ^( CONDITION $first operator $second) |p= conditioni -> ^( CONDITION $p) );
    public final SuperAwesomeFightersParser.condition_return condition() throws RecognitionException {
        SuperAwesomeFightersParser.condition_return retval = new SuperAwesomeFightersParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal33=null;
        Token char_literal34=null;
        Token WS35=null;
        Token WS37=null;
        SuperAwesomeFightersParser.condition_return c =null;

        SuperAwesomeFightersParser.conditioni_return first =null;

        SuperAwesomeFightersParser.condition_return second =null;

        SuperAwesomeFightersParser.conditioni_return p =null;

        SuperAwesomeFightersParser.operator_return operator36 =null;


        Object char_literal33_tree=null;
        Object char_literal34_tree=null;
        Object WS35_tree=null;
        Object WS37_tree=null;
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_conditioni=new RewriteRuleSubtreeStream(adaptor,"rule conditioni");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:35:2: ( '(' c= condition ')' -> ^( CONDITION $c) |first= conditioni ( WS )+ operator ( WS )+ second= condition -> ^( CONDITION $first operator $second) |p= conditioni -> ^( CONDITION $p) )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:35:4: '(' c= condition ')'
                    {
                    char_literal33=(Token)match(input,12,FOLLOW_12_in_condition294);  
                    stream_12.add(char_literal33);


                    pushFollow(FOLLOW_condition_in_condition298);
                    c=condition();

                    state._fsp--;

                    stream_condition.add(c.getTree());

                    char_literal34=(Token)match(input,13,FOLLOW_13_in_condition300);  
                    stream_13.add(char_literal34);


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
                    // 35:24: -> ^( CONDITION $c)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:35:27: ^( CONDITION $c)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONDITION, "CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_c.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:36:4: first= conditioni ( WS )+ operator ( WS )+ second= condition
                    {
                    pushFollow(FOLLOW_conditioni_in_condition316);
                    first=conditioni();

                    state._fsp--;

                    stream_conditioni.add(first.getTree());

                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:36:21: ( WS )+
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
                    	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:36:21: WS
                    	    {
                    	    WS35=(Token)match(input,WS,FOLLOW_WS_in_condition318);  
                    	    stream_WS.add(WS35);


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


                    pushFollow(FOLLOW_operator_in_condition321);
                    operator36=operator();

                    state._fsp--;

                    stream_operator.add(operator36.getTree());

                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:36:34: ( WS )+
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
                    	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:36:34: WS
                    	    {
                    	    WS37=(Token)match(input,WS,FOLLOW_WS_in_condition323);  
                    	    stream_WS.add(WS37);


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


                    pushFollow(FOLLOW_condition_in_condition328);
                    second=condition();

                    state._fsp--;

                    stream_condition.add(second.getTree());

                    // AST REWRITE
                    // elements: second, operator, first
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
                    // 36:55: -> ^( CONDITION $first operator $second)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:36:58: ^( CONDITION $first operator $second)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONDITION, "CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_first.nextTree());

                        adaptor.addChild(root_1, stream_operator.nextTree());

                        adaptor.addChild(root_1, stream_second.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:37:4: p= conditioni
                    {
                    pushFollow(FOLLOW_conditioni_in_condition349);
                    p=conditioni();

                    state._fsp--;

                    stream_conditioni.add(p.getTree());

                    // AST REWRITE
                    // elements: p
                    // token labels: 
                    // rule labels: retval, p
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 37:17: -> ^( CONDITION $p)
                    {
                        // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:37:20: ^( CONDITION $p)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CONDITION, "CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_p.nextTree());

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
    // $ANTLR end "condition"


    public static class operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operator"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:39:1: operator : ( 'and' | 'or' ) ;
    public final SuperAwesomeFightersParser.operator_return operator() throws RecognitionException {
        SuperAwesomeFightersParser.operator_return retval = new SuperAwesomeFightersParser.operator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set38=null;

        Object set38_tree=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:40:2: ( ( 'and' | 'or' ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:
            {
            root_0 = (Object)adaptor.nil();


            set38=(Token)input.LT(1);

            if ( input.LA(1)==18||input.LA(1)==32 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set38)
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
    // $ANTLR end "operator"


    public static class conditioni_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditioni"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:42:1: conditioni : ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' ) ;
    public final SuperAwesomeFightersParser.conditioni_return conditioni() throws RecognitionException {
        SuperAwesomeFightersParser.conditioni_return retval = new SuperAwesomeFightersParser.conditioni_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set39=null;

        Object set39_tree=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:43:2: ( ( 'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always' ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr\\SuperAwesomeFighters.g:
            {
            root_0 = (Object)adaptor.nil();


            set39=(Token)input.LT(1);

            if ( input.LA(1)==17||(input.LA(1) >= 22 && input.LA(1) <= 23)||(input.LA(1) >= 29 && input.LA(1) <= 31)||input.LA(1)==40||input.LA(1)==43 ) {
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
    // $ANTLR end "conditioni"

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\6\uffff";
    static final String DFA17_eofS =
        "\6\uffff";
    static final String DFA17_minS =
        "\1\14\1\uffff\2\11\2\uffff";
    static final String DFA17_maxS =
        "\1\53\1\uffff\1\17\1\40\2\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2";
    static final String DFA17_specialS =
        "\6\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\4\uffff\1\2\4\uffff\2\2\5\uffff\3\2\10\uffff\1\2\2\uffff"+
            "\1\2",
            "",
            "\1\4\1\uffff\1\3\1\uffff\1\4\1\uffff\1\4",
            "\1\4\1\uffff\1\3\3\uffff\1\4\2\uffff\1\5\15\uffff\1\5",
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
            return "34:1: condition : ( '(' c= condition ')' -> ^( CONDITION $c) |first= conditioni ( WS )+ operator ( WS )+ second= condition -> ^( CONDITION $first operator $second) |p= conditioni -> ^( CONDITION $p) );";
        }
    }
 

    public static final BitSet FOLLOW_ws_in_prog45 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NAME_in_prog48 = new BitSet(new long[]{0x0000100000000A00L});
    public static final BitSet FOLLOW_ws_in_prog50 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_prog53 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_ws_in_prog55 = new BitSet(new long[]{0x00002906E6C21000L});
    public static final BitSet FOLLOW_assignment_in_prog58 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_endline_in_prog60 = new BitSet(new long[]{0x00002906E6C21A00L});
    public static final BitSet FOLLOW_ws_in_prog62 = new BitSet(new long[]{0x00002906E6C21000L});
    public static final BitSet FOLLOW_action_in_prog68 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_endline_in_prog70 = new BitSet(new long[]{0x00002900E0C21A00L});
    public static final BitSet FOLLOW_ws_in_prog72 = new BitSet(new long[]{0x00002900E0C21000L});
    public static final BitSet FOLLOW_45_in_prog79 = new BitSet(new long[]{0x0000000000000A02L});
    public static final BitSet FOLLOW_ws_in_prog81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strengths_in_assignment105 = new BitSet(new long[]{0x0000000000004A00L});
    public static final BitSet FOLLOW_ws_in_assignment107 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_assignment110 = new BitSet(new long[]{0x0000000000000A80L});
    public static final BitSet FOLLOW_ws_in_assignment112 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DIGIT_in_assignment115 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_condition_in_action139 = new BitSet(new long[]{0x0000000000008A00L});
    public static final BitSet FOLLOW_ws_in_action141 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_action144 = new BitSet(new long[]{0x000006E001200000L});
    public static final BitSet FOLLOW_move_in_action146 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_ws_in_action148 = new BitSet(new long[]{0x0000001818180000L});
    public static final BitSet FOLLOW_attack_in_action150 = new BitSet(new long[]{0x0000000000010A00L});
    public static final BitSet FOLLOW_ws_in_action152 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_action155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_endline191 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_NEWLINE_in_endline194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_condition294 = new BitSet(new long[]{0x00000900E0C21000L});
    public static final BitSet FOLLOW_condition_in_condition298 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_condition300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditioni_in_condition316 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_WS_in_condition318 = new BitSet(new long[]{0x0000000100040800L});
    public static final BitSet FOLLOW_operator_in_condition321 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_WS_in_condition323 = new BitSet(new long[]{0x00000900E0C21800L});
    public static final BitSet FOLLOW_condition_in_condition328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditioni_in_condition349 = new BitSet(new long[]{0x0000000000000002L});

}