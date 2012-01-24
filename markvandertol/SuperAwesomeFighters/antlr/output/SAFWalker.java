// $ANTLR 3.4 C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g 2012-01-24 15:31:50

	package saf.parser;
	
	import saf.entities.*;
	import java.util.Stack;
	import java.util.List;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "ASSIGNMENT", "CONDITION", "DIGIT", "IDENTIFIER", "NEWLINE", "PROGRAM", "WS", "'('", "')'", "'='", "'['", "']'", "'and'", "'or'", "'{'", "'}'"
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
    public static final int ACTION=4;
    public static final int ASSIGNMENT=5;
    public static final int CONDITION=6;
    public static final int DIGIT=7;
    public static final int IDENTIFIER=8;
    public static final int NEWLINE=9;
    public static final int PROGRAM=10;
    public static final int WS=11;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SAFWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SAFWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SAFWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g"; }


    	private BotDefinition bot = new BotDefinition();
    	
    	private List<String> errorList;
    	private Stack<Condition> conditions = new Stack<Condition>();
    	
    	public void setErrorList(List<String> errorList) {
    		this.errorList = errorList;
    	}
    	
    	@Override
    	public void emitErrorMessage(String msg) {
    		errorList.add("Walker error: " + msg);
    	}
    	
    	public BotDefinition getBotDefinition() {
    		return bot;
    	}
    	
    	private void createAction(String move, String attack) {	
    		BehaviourRule behaviourRule = new BehaviourRule();
    		try {
    			MoveAction moveAction = MoveAction.valueOf(move);
    			behaviourRule.setMoveAction(moveAction);
    		} catch(IllegalArgumentException ex) {
    			emitErrorMessage("Unknown move action: " + move);
    		}
    		
    		try {
    			FightAction fightAction = FightAction.valueOf(attack);
    			behaviourRule.setFightAction(fightAction);
    		} catch(IllegalArgumentException ex) {
    			emitErrorMessage("Unknown fight action: " + attack);
    		}
    		behaviourRule.setCondition(conditions.pop());
    		bot.getBehaviourRules().add(behaviourRule);
    	}
    	
    	private void createCondition(String state) {
    		try {
    			State s = State.valueOf(state);
    			conditions.push(new ConcreteCondition(s));
    		} catch(IllegalArgumentException ex) {
    			emitErrorMessage("Unknown state: " + state);
    		}
    	}
    	
    	private void createCombinedCondition(String state, String operator) {
    		Condition c = null;
    		try {
    			State s = State.valueOf(state);
    			c = new ConcreteCondition(s);
    		} catch(IllegalArgumentException ex) {
    			emitErrorMessage("Unknown state: " + state);
    		}
    		boolean requireBoth = false;
    		if ("and".equals(operator))
    			requireBoth = true;
    		else if ("or".equals(operator))
    			requireBoth = false;
    		else
    			emitErrorMessage("Unknown operator: " + operator);
    		
    		conditions.push(new CombinedCondition(c, conditions.pop(), requireBoth));
    	}
    	



    // $ANTLR start "prog"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:85:1: prog : ^( PROGRAM name= IDENTIFIER ( assignment )* ( action )* ) ;
    public final void prog() throws RecognitionException {
        CommonTree name=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:85:7: ( ^( PROGRAM name= IDENTIFIER ( assignment )* ( action )* ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:85:9: ^( PROGRAM name= IDENTIFIER ( assignment )* ( action )* )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_prog44); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_prog48); 

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:85:35: ( assignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ASSIGNMENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:85:35: assignment
            	    {
            	    pushFollow(FOLLOW_assignment_in_prog50);
            	    assignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:85:47: ( action )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ACTION) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:85:47: action
            	    {
            	    pushFollow(FOLLOW_action_in_prog53);
            	    action();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input, Token.UP, null); 


             bot.setName((name!=null?name.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "assignment"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:87:1: assignment : ^( ASSIGNMENT key= IDENTIFIER value= DIGIT ) ;
    public final void assignment() throws RecognitionException {
        CommonTree key=null;
        CommonTree value=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:88:2: ( ^( ASSIGNMENT key= IDENTIFIER value= DIGIT ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:88:4: ^( ASSIGNMENT key= IDENTIFIER value= DIGIT )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment67); 

            match(input, Token.DOWN, null); 
            key=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment71); 

            value=(CommonTree)match(input,DIGIT,FOLLOW_DIGIT_in_assignment75); 

            match(input, Token.UP, null); 


             bot.setProperty((key!=null?key.getText():null), Integer.parseInt((value!=null?value.getText():null))); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "action"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:90:1: action : ^( ACTION condition move= IDENTIFIER attack= IDENTIFIER ) ;
    public final void action() throws RecognitionException {
        CommonTree move=null;
        CommonTree attack=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:90:9: ( ^( ACTION condition move= IDENTIFIER attack= IDENTIFIER ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:90:11: ^( ACTION condition move= IDENTIFIER attack= IDENTIFIER )
            {
            match(input,ACTION,FOLLOW_ACTION_in_action88); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_condition_in_action90);
            condition();

            state._fsp--;


            move=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_action94); 

            attack=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_action98); 

            match(input, Token.UP, null); 


             createAction((move!=null?move.getText():null), (attack!=null?attack.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "action"



    // $ANTLR start "condition"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:92:1: condition : ( ^( CONDITION c= condition ) | ^( CONDITION c2= IDENTIFIER ) | ^( CONDITION c3= IDENTIFIER op= operator condition ) );
    public final void condition() throws RecognitionException {
        CommonTree c2=null;
        CommonTree c3=null;
        SAFWalker.operator_return op =null;


        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:93:2: ( ^( CONDITION c= condition ) | ^( CONDITION c2= IDENTIFIER ) | ^( CONDITION c3= IDENTIFIER op= operator condition ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CONDITION) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==IDENTIFIER) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==UP) ) {
                            alt3=2;
                        }
                        else if ( ((LA3_3 >= 17 && LA3_3 <= 18)) ) {
                            alt3=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA3_2==CONDITION) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;

                    }
                }
                else {
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
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:93:4: ^( CONDITION c= condition )
                    {
                    match(input,CONDITION,FOLLOW_CONDITION_in_condition112); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_condition116);
                    condition();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     /* No action */ 

                    }
                    break;
                case 2 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:94:4: ^( CONDITION c2= IDENTIFIER )
                    {
                    match(input,CONDITION,FOLLOW_CONDITION_in_condition125); 

                    match(input, Token.DOWN, null); 
                    c2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_condition129); 

                    match(input, Token.UP, null); 


                     createCondition((c2!=null?c2.getText():null)); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:95:4: ^( CONDITION c3= IDENTIFIER op= operator condition )
                    {
                    match(input,CONDITION,FOLLOW_CONDITION_in_condition138); 

                    match(input, Token.DOWN, null); 
                    c3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_condition142); 

                    pushFollow(FOLLOW_operator_in_condition146);
                    op=operator();

                    state._fsp--;


                    pushFollow(FOLLOW_condition_in_condition148);
                    condition();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     createCombinedCondition((c3!=null?c3.getText():null), (op!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(op.start),input.getTreeAdaptor().getTokenStopIndex(op.start))):null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "condition"


    public static class operator_return extends TreeRuleReturnScope {
    };


    // $ANTLR start "operator"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:97:1: operator : ( 'and' | 'or' ) ;
    public final SAFWalker.operator_return operator() throws RecognitionException {
        SAFWalker.operator_return retval = new SAFWalker.operator_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:98:2: ( ( 'and' | 'or' ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:
            {
            if ( (input.LA(1) >= 17 && input.LA(1) <= 18) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operator"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_prog44 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_prog48 = new BitSet(new long[]{0x0000000000000038L});
    public static final BitSet FOLLOW_assignment_in_prog50 = new BitSet(new long[]{0x0000000000000038L});
    public static final BitSet FOLLOW_action_in_prog53 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assignment71 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DIGIT_in_assignment75 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACTION_in_action88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_action90 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_action94 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IDENTIFIER_in_action98 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_condition112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_condition125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_condition129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_condition138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_condition142 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_operator_in_condition146 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_condition_in_condition148 = new BitSet(new long[]{0x0000000000000008L});

}