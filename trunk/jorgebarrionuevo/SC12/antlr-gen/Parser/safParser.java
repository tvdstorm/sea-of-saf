// $ANTLR 3.4 D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g 2012-03-03 13:04:30

  package Parser;
  import model.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class safParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BEHAVIOUR", "BETWEEN", "CHARACTERISTIC", "CONDITION_TYPE", "DIGIT", "EQ", "FIGHT_ACTION", "ID", "L_BRACKET", "L_CURLY", "L_PAR", "MOVE_ACTION", "OR", "PROGRAM", "R_BRACKET", "R_CURLY", "R_PAR", "WS"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int BEHAVIOUR=5;
    public static final int BETWEEN=6;
    public static final int CHARACTERISTIC=7;
    public static final int CONDITION_TYPE=8;
    public static final int DIGIT=9;
    public static final int EQ=10;
    public static final int FIGHT_ACTION=11;
    public static final int ID=12;
    public static final int L_BRACKET=13;
    public static final int L_CURLY=14;
    public static final int L_PAR=15;
    public static final int MOVE_ACTION=16;
    public static final int OR=17;
    public static final int PROGRAM=18;
    public static final int R_BRACKET=19;
    public static final int R_CURLY=20;
    public static final int R_PAR=21;
    public static final int WS=22;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public safParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public safParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return safParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g"; }


    Fighter fighter;


    public static class program_return extends ParserRuleReturnScope {
        public Arena arena;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:28:1: program returns [Arena arena] : f= fighter ;
    public final safParser.program_return program() throws RecognitionException {
        safParser.program_return retval = new safParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        safParser.fighter_return f =null;



        retval.arena = new Arena();
        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:29:3: (f= fighter )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:30:5: f= fighter
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_fighter_in_program103);
            f=fighter();

            state._fsp--;

            adaptor.addChild(root_0, f.getTree());

            retval.arena.addFighter((f!=null?f.fighter:null));

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
    // $ANTLR end "program"


    public static class fighter_return extends ParserRuleReturnScope {
        public Fighter fighter;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:32:1: fighter returns [Fighter fighter] : ID L_CURLY ( characteristic )* ( behaviour )* R_CURLY ;
    public final safParser.fighter_return fighter() throws RecognitionException {
        safParser.fighter_return retval = new safParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID1=null;
        Token L_CURLY2=null;
        Token R_CURLY5=null;
        safParser.characteristic_return characteristic3 =null;

        safParser.behaviour_return behaviour4 =null;


        Object ID1_tree=null;
        Object L_CURLY2_tree=null;
        Object R_CURLY5_tree=null;

         retval.fighter = new Fighter();
        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:33:3: ( ID L_CURLY ( characteristic )* ( behaviour )* R_CURLY )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:34:5: ID L_CURLY ( characteristic )* ( behaviour )* R_CURLY
            {
            root_0 = (Object)adaptor.nil();


            ID1=(Token)match(input,ID,FOLLOW_ID_in_fighter131); 
            ID1_tree = 
            (Object)adaptor.create(ID1)
            ;
            adaptor.addChild(root_0, ID1_tree);


            L_CURLY2=(Token)match(input,L_CURLY,FOLLOW_L_CURLY_in_fighter133); 
            L_CURLY2_tree = 
            (Object)adaptor.create(L_CURLY2)
            ;
            adaptor.addChild(root_0, L_CURLY2_tree);


            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:34:16: ( characteristic )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CHARACTERISTIC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:34:16: characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_fighter135);
            	    characteristic3=characteristic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, characteristic3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:34:33: ( behaviour )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CONDITION_TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:34:33: behaviour
            	    {
            	    pushFollow(FOLLOW_behaviour_in_fighter139);
            	    behaviour4=behaviour();

            	    state._fsp--;

            	    adaptor.addChild(root_0, behaviour4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



                  retval.fighter.addCharacteristic((characteristic3!=null?characteristic3.c:null));
                

            R_CURLY5=(Token)match(input,R_CURLY,FOLLOW_R_CURLY_in_fighter154); 
            R_CURLY5_tree = 
            (Object)adaptor.create(R_CURLY5)
            ;
            adaptor.addChild(root_0, R_CURLY5_tree);



                  retval.fighter.setName((ID1!=null?ID1.getText():null));
                

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


    public static class characteristic_return extends ParserRuleReturnScope {
        public Characteristic c;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:44:1: characteristic returns [Characteristic c] : CHARACTERISTIC EQ DIGIT ;
    public final safParser.characteristic_return characteristic() throws RecognitionException {
        safParser.characteristic_return retval = new safParser.characteristic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHARACTERISTIC6=null;
        Token EQ7=null;
        Token DIGIT8=null;

        Object CHARACTERISTIC6_tree=null;
        Object EQ7_tree=null;
        Object DIGIT8_tree=null;

        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:45:3: ( CHARACTERISTIC EQ DIGIT )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:46:3: CHARACTERISTIC EQ DIGIT
            {
            root_0 = (Object)adaptor.nil();


            CHARACTERISTIC6=(Token)match(input,CHARACTERISTIC,FOLLOW_CHARACTERISTIC_in_characteristic180); 
            CHARACTERISTIC6_tree = 
            (Object)adaptor.create(CHARACTERISTIC6)
            ;
            adaptor.addChild(root_0, CHARACTERISTIC6_tree);


            EQ7=(Token)match(input,EQ,FOLLOW_EQ_in_characteristic182); 
            EQ7_tree = 
            (Object)adaptor.create(EQ7)
            ;
            adaptor.addChild(root_0, EQ7_tree);


            DIGIT8=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_characteristic184); 
            DIGIT8_tree = 
            (Object)adaptor.create(DIGIT8)
            ;
            adaptor.addChild(root_0, DIGIT8_tree);


            retval.c = new Characteristic(CHARACTERISTIC6.getText(),Integer.parseInt(DIGIT8.getText()));

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
    // $ANTLR end "characteristic"


    public static class behaviour_return extends ParserRuleReturnScope {
        public Behaviour b;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:49:1: behaviour returns [Behaviour b] : CONDITION_TYPE L_BRACKET MOVE_ACTION FIGHT_ACTION R_BRACKET ;
    public final safParser.behaviour_return behaviour() throws RecognitionException {
        safParser.behaviour_return retval = new safParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONDITION_TYPE9=null;
        Token L_BRACKET10=null;
        Token MOVE_ACTION11=null;
        Token FIGHT_ACTION12=null;
        Token R_BRACKET13=null;

        Object CONDITION_TYPE9_tree=null;
        Object L_BRACKET10_tree=null;
        Object MOVE_ACTION11_tree=null;
        Object FIGHT_ACTION12_tree=null;
        Object R_BRACKET13_tree=null;

        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:50:3: ( CONDITION_TYPE L_BRACKET MOVE_ACTION FIGHT_ACTION R_BRACKET )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:51:3: CONDITION_TYPE L_BRACKET MOVE_ACTION FIGHT_ACTION R_BRACKET
            {
            root_0 = (Object)adaptor.nil();


            CONDITION_TYPE9=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_behaviour204); 
            CONDITION_TYPE9_tree = 
            (Object)adaptor.create(CONDITION_TYPE9)
            ;
            adaptor.addChild(root_0, CONDITION_TYPE9_tree);


            L_BRACKET10=(Token)match(input,L_BRACKET,FOLLOW_L_BRACKET_in_behaviour211); 
            L_BRACKET10_tree = 
            (Object)adaptor.create(L_BRACKET10)
            ;
            adaptor.addChild(root_0, L_BRACKET10_tree);


            MOVE_ACTION11=(Token)match(input,MOVE_ACTION,FOLLOW_MOVE_ACTION_in_behaviour213); 
            MOVE_ACTION11_tree = 
            (Object)adaptor.create(MOVE_ACTION11)
            ;
            adaptor.addChild(root_0, MOVE_ACTION11_tree);


            FIGHT_ACTION12=(Token)match(input,FIGHT_ACTION,FOLLOW_FIGHT_ACTION_in_behaviour215); 
            FIGHT_ACTION12_tree = 
            (Object)adaptor.create(FIGHT_ACTION12)
            ;
            adaptor.addChild(root_0, FIGHT_ACTION12_tree);


            R_BRACKET13=(Token)match(input,R_BRACKET,FOLLOW_R_BRACKET_in_behaviour217); 
            R_BRACKET13_tree = 
            (Object)adaptor.create(R_BRACKET13)
            ;
            adaptor.addChild(root_0, R_BRACKET13_tree);


             
                      retval.b = new Behaviour(new ConditionType(CONDITION_TYPE9.getText()), new MoveAction(MOVE_ACTION11.getText()), new FightAction(FIGHT_ACTION12.getText()));
                    

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

    // Delegated rules


 

    public static final BitSet FOLLOW_fighter_in_program103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fighter131 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_L_CURLY_in_fighter133 = new BitSet(new long[]{0x0000000000100180L});
    public static final BitSet FOLLOW_characteristic_in_fighter135 = new BitSet(new long[]{0x0000000000100180L});
    public static final BitSet FOLLOW_behaviour_in_fighter139 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_R_CURLY_in_fighter154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTERISTIC_in_characteristic180 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_characteristic182 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DIGIT_in_characteristic184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_behaviour204 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_L_BRACKET_in_behaviour211 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_MOVE_ACTION_in_behaviour213 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_FIGHT_ACTION_in_behaviour215 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_R_BRACKET_in_behaviour217 = new BitSet(new long[]{0x0000000000000002L});

}