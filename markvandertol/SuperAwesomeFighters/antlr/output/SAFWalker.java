// $ANTLR 3.4 C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g 2012-01-30 14:52:47

	package saf.parser;
	
	import saf.ast.*;
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


    	private FighterDefinition fighter = new FighterDefinition();
    	
    	private List<String> errorList;
    	private Stack<Condition> conditions = new Stack<Condition>();
    	
    	public void setErrorList(List<String> errorList) {
    		this.errorList = errorList;
    	}
    	
    	@Override
    	public void emitErrorMessage(String msg) {
    		errorList.add("Walker error: " + msg);
    	}
    	
    	public FighterDefinition getFighterDefinition() {
    		return fighter;
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
    		fighter.getBehaviourRules().add(behaviourRule);
    	}
    	
    	private void createCondition(String state) {
    		try {
    			State s = State.valueOf(state);
    			conditions.push(new ConcreteCondition(s));
    		} catch(IllegalArgumentException ex) {
    			emitErrorMessage("Unknown state: " + state);
    		}
    	}
    	
    	private void createCombinedCondition(boolean requireBoth) {
    		conditions.push(new CombinedCondition(conditions.pop(), conditions.pop(), requireBoth));
    	}
    	



    // $ANTLR start "fighter"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:70:1: fighter : ^( FIGHTER name= IDENTIFIER ( assignment )* ( action )* ) ;
    public final void fighter() throws RecognitionException {
        CommonTree name=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:70:10: ( ^( FIGHTER name= IDENTIFIER ( assignment )* ( action )* ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:70:12: ^( FIGHTER name= IDENTIFIER ( assignment )* ( action )* )
            {
            match(input,FIGHTER,FOLLOW_FIGHTER_in_fighter44); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fighter48); 

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:70:38: ( assignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ASSIGNMENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:70:38: assignment
            	    {
            	    pushFollow(FOLLOW_assignment_in_fighter50);
            	    assignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:70:50: ( action )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ACTION) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:70:50: action
            	    {
            	    pushFollow(FOLLOW_action_in_fighter53);
            	    action();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input, Token.UP, null); 


             fighter.setName((name!=null?name.getText():null));

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
    // $ANTLR end "fighter"



    // $ANTLR start "assignment"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:72:1: assignment : ^( ASSIGNMENT key= IDENTIFIER value= DIGIT ) ;
    public final void assignment() throws RecognitionException {
        CommonTree key=null;
        CommonTree value=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:73:2: ( ^( ASSIGNMENT key= IDENTIFIER value= DIGIT ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:73:4: ^( ASSIGNMENT key= IDENTIFIER value= DIGIT )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment67); 

            match(input, Token.DOWN, null); 
            key=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment71); 

            value=(CommonTree)match(input,DIGIT,FOLLOW_DIGIT_in_assignment75); 

            match(input, Token.UP, null); 


             fighter.setProperty((key!=null?key.getText():null), Integer.parseInt((value!=null?value.getText():null))); 

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
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:75:1: action : ^( ACTION condition move= IDENTIFIER attack= IDENTIFIER ) ;
    public final void action() throws RecognitionException {
        CommonTree move=null;
        CommonTree attack=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:75:9: ( ^( ACTION condition move= IDENTIFIER attack= IDENTIFIER ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:75:11: ^( ACTION condition move= IDENTIFIER attack= IDENTIFIER )
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
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:77:1: condition : ( ^( RCONDITION c= condition ) | ^( ANDCONDITION condition condition ) | ^( ORCONDITION condition condition ) | ^( CONDITION c2= IDENTIFIER ) );
    public final void condition() throws RecognitionException {
        CommonTree c2=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:78:2: ( ^( RCONDITION c= condition ) | ^( ANDCONDITION condition condition ) | ^( ORCONDITION condition condition ) | ^( CONDITION c2= IDENTIFIER ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RCONDITION:
                {
                alt3=1;
                }
                break;
            case ANDCONDITION:
                {
                alt3=2;
                }
                break;
            case ORCONDITION:
                {
                alt3=3;
                }
                break;
            case CONDITION:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:78:4: ^( RCONDITION c= condition )
                    {
                    match(input,RCONDITION,FOLLOW_RCONDITION_in_condition112); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_condition116);
                    condition();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     /* No action */ 

                    }
                    break;
                case 2 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:79:4: ^( ANDCONDITION condition condition )
                    {
                    match(input,ANDCONDITION,FOLLOW_ANDCONDITION_in_condition125); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_condition127);
                    condition();

                    state._fsp--;


                    pushFollow(FOLLOW_condition_in_condition129);
                    condition();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     createCombinedCondition(true); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:80:4: ^( ORCONDITION condition condition )
                    {
                    match(input,ORCONDITION,FOLLOW_ORCONDITION_in_condition138); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_condition140);
                    condition();

                    state._fsp--;


                    pushFollow(FOLLOW_condition_in_condition142);
                    condition();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     createCombinedCondition(false); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:81:4: ^( CONDITION c2= IDENTIFIER )
                    {
                    match(input,CONDITION,FOLLOW_CONDITION_in_condition151); 

                    match(input, Token.DOWN, null); 
                    c2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_condition155); 

                    match(input, Token.UP, null); 


                     createCondition((c2!=null?c2.getText():null)); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_FIGHTER_in_fighter44 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fighter48 = new BitSet(new long[]{0x0000000000000058L});
    public static final BitSet FOLLOW_assignment_in_fighter50 = new BitSet(new long[]{0x0000000000000058L});
    public static final BitSet FOLLOW_action_in_fighter53 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assignment71 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DIGIT_in_assignment75 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACTION_in_action88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_action90 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_action94 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_action98 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RCONDITION_in_condition112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANDCONDITION_in_condition125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition127 = new BitSet(new long[]{0x00000000000030A0L});
    public static final BitSet FOLLOW_condition_in_condition129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORCONDITION_in_condition138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition140 = new BitSet(new long[]{0x00000000000030A0L});
    public static final BitSet FOLLOW_condition_in_condition142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_condition151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_condition155 = new BitSet(new long[]{0x0000000000000008L});

}