// $ANTLR 3.4 C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g 2012-02-13 14:05:43

	package saf.parser;
	
	import saf.ast.*;
	import java.util.Map;
	import java.util.HashMap;
	import java.util.AbstractMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFWalker extends TreeParser {
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


    	private List<String> errorList;
    	
    	public void setErrorList(List<String> errorList) {
    		this.errorList = errorList;
    	}
    	
    	@Override
    	public void emitErrorMessage(String msg) {
    		errorList.add("Walker error: " + msg);
    	}	



    // $ANTLR start "fighter"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:31:1: fighter returns [FighterDefinition f] : ^( FIGHTER name= IDENTIFIER (a= assignment )+ (b= rule )+ ) ;
    public final FighterDefinition fighter() throws RecognitionException {
        FighterDefinition f = null;


        CommonTree name=null;
        AbstractMap.SimpleEntry<String, Integer> a =null;

        BehaviourRule b =null;



        	Map<String, Integer> assignments = new HashMap<String, Integer>();
        	List<BehaviourRule> behaviourRules = new ArrayList<BehaviourRule>();

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:36:2: ( ^( FIGHTER name= IDENTIFIER (a= assignment )+ (b= rule )+ ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:36:4: ^( FIGHTER name= IDENTIFIER (a= assignment )+ (b= rule )+ )
            {
            match(input,FIGHTER,FOLLOW_FIGHTER_in_fighter53); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fighter57); 

            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:36:30: (a= assignment )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ASSIGNMENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:36:31: a= assignment
            	    {
            	    pushFollow(FOLLOW_assignment_in_fighter62);
            	    a=assignment();

            	    state._fsp--;


            	    assignments.put(a.getKey(), a.getValue());

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


            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:36:91: (b= rule )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:36:92: b= rule
            	    {
            	    pushFollow(FOLLOW_rule_in_fighter71);
            	    b=rule();

            	    state._fsp--;


            	    behaviourRules.add(b);

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


            match(input, Token.UP, null); 


             f = new FighterDefinition((name!=null?name.getText():null), assignments, behaviourRules);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return f;
    }
    // $ANTLR end "fighter"



    // $ANTLR start "assignment"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:39:1: assignment returns [AbstractMap.SimpleEntry<String, Integer> a] : ^( ASSIGNMENT key= IDENTIFIER value= DIGIT ) ;
    public final AbstractMap.SimpleEntry<String, Integer> assignment() throws RecognitionException {
        AbstractMap.SimpleEntry<String, Integer> a = null;


        CommonTree key=null;
        CommonTree value=null;

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:40:2: ( ^( ASSIGNMENT key= IDENTIFIER value= DIGIT ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:40:4: ^( ASSIGNMENT key= IDENTIFIER value= DIGIT )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment94); 

            match(input, Token.DOWN, null); 
            key=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment98); 

            value=(CommonTree)match(input,DIGIT,FOLLOW_DIGIT_in_assignment102); 

            match(input, Token.UP, null); 


             a = new AbstractMap.SimpleEntry<String, Integer>((key!=null?key.getText():null), Integer.parseInt((value!=null?value.getText():null))); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return a;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "rule"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:43:1: rule returns [BehaviourRule r] : ^( RULE con= condition move= moves attack= attacks ) ;
    public final BehaviourRule rule() throws RecognitionException {
        BehaviourRule r = null;


        Condition con =null;

        List<String> move =null;

        List<String> attack =null;


        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:44:2: ( ^( RULE con= condition move= moves attack= attacks ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:44:4: ^( RULE con= condition move= moves attack= attacks )
            {
            match(input,RULE,FOLLOW_RULE_in_rule123); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_condition_in_rule127);
            con=condition();

            state._fsp--;


            pushFollow(FOLLOW_moves_in_rule131);
            move=moves();

            state._fsp--;


            pushFollow(FOLLOW_attacks_in_rule135);
            attack=attacks();

            state._fsp--;


            match(input, Token.UP, null); 


             r = new BehaviourRule(con, move, attack);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "rule"



    // $ANTLR start "moves"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:47:1: moves returns [List<String> l] : ^( MOVES (move= IDENTIFIER )+ ) ;
    public final List<String> moves() throws RecognitionException {
        List<String> l = null;


        CommonTree move=null;


        	l = new ArrayList<String>();

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:51:2: ( ^( MOVES (move= IDENTIFIER )+ ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:51:4: ^( MOVES (move= IDENTIFIER )+ )
            {
            match(input,MOVES,FOLLOW_MOVES_in_moves161); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:51:12: (move= IDENTIFIER )+
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
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:51:13: move= IDENTIFIER
            	    {
            	    move=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_moves166); 

            	     l.add((move!=null?move.getText():null)); 

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


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return l;
    }
    // $ANTLR end "moves"



    // $ANTLR start "attacks"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:53:1: attacks returns [List<String> l] : ^( ATTACKS (attack= IDENTIFIER )+ ) ;
    public final List<String> attacks() throws RecognitionException {
        List<String> l = null;


        CommonTree attack=null;


        	l = new ArrayList<String>();

        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:57:2: ( ^( ATTACKS (attack= IDENTIFIER )+ ) )
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:57:4: ^( ATTACKS (attack= IDENTIFIER )+ )
            {
            match(input,ATTACKS,FOLLOW_ATTACKS_in_attacks191); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:57:14: (attack= IDENTIFIER )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IDENTIFIER) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:57:15: attack= IDENTIFIER
            	    {
            	    attack=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_attacks196); 

            	     l.add((attack!=null?attack.getText():null)); 

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


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return l;
    }
    // $ANTLR end "attacks"



    // $ANTLR start "condition"
    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:59:1: condition returns [Condition cresult] : ( ^( RCONDITION c= condition ) | ^( ANDCONDITION andc1= condition andc2= condition ) | ^( ORCONDITION orc1= condition orc2= condition ) | ^( CONDITION c2= IDENTIFIER ) );
    public final Condition condition() throws RecognitionException {
        Condition cresult = null;


        CommonTree c2=null;
        Condition c =null;

        Condition andc1 =null;

        Condition andc2 =null;

        Condition orc1 =null;

        Condition orc2 =null;


        try {
            // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:60:2: ( ^( RCONDITION c= condition ) | ^( ANDCONDITION andc1= condition andc2= condition ) | ^( ORCONDITION orc1= condition orc2= condition ) | ^( CONDITION c2= IDENTIFIER ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RCONDITION:
                {
                alt5=1;
                }
                break;
            case ANDCONDITION:
                {
                alt5=2;
                }
                break;
            case ORCONDITION:
                {
                alt5=3;
                }
                break;
            case CONDITION:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:60:4: ^( RCONDITION c= condition )
                    {
                    match(input,RCONDITION,FOLLOW_RCONDITION_in_condition215); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_condition219);
                    c=condition();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     cresult = c; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:61:4: ^( ANDCONDITION andc1= condition andc2= condition )
                    {
                    match(input,ANDCONDITION,FOLLOW_ANDCONDITION_in_condition228); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_condition232);
                    andc1=condition();

                    state._fsp--;


                    pushFollow(FOLLOW_condition_in_condition236);
                    andc2=condition();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     cresult = new CombinedCondition(andc1, andc2, true); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:62:4: ^( ORCONDITION orc1= condition orc2= condition )
                    {
                    match(input,ORCONDITION,FOLLOW_ORCONDITION_in_condition245); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_condition_in_condition249);
                    orc1=condition();

                    state._fsp--;


                    pushFollow(FOLLOW_condition_in_condition253);
                    orc2=condition();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     cresult = new CombinedCondition(orc1, orc2, false); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\mark\\jworkspace\\SuperAwesomeFighters\\antlr/SAFWalker.g:63:4: ^( CONDITION c2= IDENTIFIER )
                    {
                    match(input,CONDITION,FOLLOW_CONDITION_in_condition262); 

                    match(input, Token.DOWN, null); 
                    c2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_condition266); 

                    match(input, Token.UP, null); 


                     cresult = new ConcreteCondition((c2!=null?c2.getText():null)); 

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
        return cresult;
    }
    // $ANTLR end "condition"

    // Delegated rules


 

    public static final BitSet FOLLOW_FIGHTER_in_fighter53 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fighter57 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_assignment_in_fighter62 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule_in_fighter71 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment94 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_assignment98 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DIGIT_in_assignment102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RULE_in_rule123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_rule127 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_moves_in_rule131 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_attacks_in_rule135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVES_in_moves161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_moves166 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_ATTACKS_in_attacks191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_attacks196 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_RCONDITION_in_condition215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANDCONDITION_in_condition228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition232 = new BitSet(new long[]{0x0000000000003090L});
    public static final BitSet FOLLOW_condition_in_condition236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORCONDITION_in_condition245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition249 = new BitSet(new long[]{0x0000000000003090L});
    public static final BitSet FOLLOW_condition_in_condition253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_condition262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_condition266 = new BitSet(new long[]{0x0000000000000008L});

}