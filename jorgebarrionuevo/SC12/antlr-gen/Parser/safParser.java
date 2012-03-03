// $ANTLR 3.4 D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g 2012-03-03 18:09:06

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BEHAVIOUR", "BETWEEN", "CHARACTERISTIC", "CHOOSE", "CONDITION_TYPE", "DIGIT", "EQ", "FIGHT_ACTION", "ID", "L_BRACKET", "L_CURLY", "L_PAR", "MOVE_ACTION", "OR", "PROGRAM", "R_BRACKET", "R_CURLY", "R_PAR", "WS"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int BEHAVIOUR=5;
    public static final int BETWEEN=6;
    public static final int CHARACTERISTIC=7;
    public static final int CHOOSE=8;
    public static final int CONDITION_TYPE=9;
    public static final int DIGIT=10;
    public static final int EQ=11;
    public static final int FIGHT_ACTION=12;
    public static final int ID=13;
    public static final int L_BRACKET=14;
    public static final int L_CURLY=15;
    public static final int L_PAR=16;
    public static final int MOVE_ACTION=17;
    public static final int OR=18;
    public static final int PROGRAM=19;
    public static final int R_BRACKET=20;
    public static final int R_CURLY=21;
    public static final int R_PAR=22;
    public static final int WS=23;

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
        public Behaviour beha;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:58:1: behaviour returns [Behaviour beha] : condi= condition L_BRACKET action action R_BRACKET ;
    public final safParser.behaviour_return behaviour() throws RecognitionException {
        safParser.behaviour_return retval = new safParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token L_BRACKET9=null;
        Token R_BRACKET12=null;
        safParser.condition_return condi =null;

        safParser.action_return action10 =null;

        safParser.action_return action11 =null;


        Object L_BRACKET9_tree=null;
        Object R_BRACKET12_tree=null;

        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:59:3: (condi= condition L_BRACKET action action R_BRACKET )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:60:3: condi= condition L_BRACKET action action R_BRACKET
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_condition_in_behaviour215);
            condi=condition();

            state._fsp--;

            adaptor.addChild(root_0, condi.getTree());

            L_BRACKET9=(Token)match(input,L_BRACKET,FOLLOW_L_BRACKET_in_behaviour221); 
            L_BRACKET9_tree = 
            (Object)adaptor.create(L_BRACKET9)
            ;
            adaptor.addChild(root_0, L_BRACKET9_tree);


            pushFollow(FOLLOW_action_in_behaviour223);
            action10=action();

            state._fsp--;

            adaptor.addChild(root_0, action10.getTree());

            pushFollow(FOLLOW_action_in_behaviour225);
            action11=action();

            state._fsp--;

            adaptor.addChild(root_0, action11.getTree());

            R_BRACKET12=(Token)match(input,R_BRACKET,FOLLOW_R_BRACKET_in_behaviour227); 
            R_BRACKET12_tree = 
            (Object)adaptor.create(R_BRACKET12)
            ;
            adaptor.addChild(root_0, R_BRACKET12_tree);


             
                      retval.beha = new Behaviour((condi!=null?condi.ct:null), $moveAction.mova , new FightAction($FIGHT_ACTION.getText()));
                    

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
        public ConditionType ct;
        public MoveAction ma;
        public FightAction fa;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:67:1: condition returns [ConditionType ct, MoveAction ma, FightAction fa] : c= conditionType a= action ;
    public final safParser.condition_return condition() throws RecognitionException {
        safParser.condition_return retval = new safParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        safParser.conditionType_return c =null;

        safParser.action_return a =null;



        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:68:3: (c= conditionType a= action )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:69:3: c= conditionType a= action
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditionType_in_condition258);
            c=conditionType();

            state._fsp--;

            adaptor.addChild(root_0, c.getTree());

            pushFollow(FOLLOW_action_in_condition262);
            a=action();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());


                retval.ct =(c!=null?c.condType:null);

              

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


    public static class conditionType_return extends ParserRuleReturnScope {
        public ConditionType condType;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionType"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:76:1: conditionType returns [ConditionType condType] : CONDITION_TYPE ;
    public final safParser.conditionType_return conditionType() throws RecognitionException {
        safParser.conditionType_return retval = new safParser.conditionType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONDITION_TYPE13=null;

        Object CONDITION_TYPE13_tree=null;

        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:77:3: ( CONDITION_TYPE )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:78:3: CONDITION_TYPE
            {
            root_0 = (Object)adaptor.nil();


            CONDITION_TYPE13=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_conditionType285); 
            CONDITION_TYPE13_tree = 
            (Object)adaptor.create(CONDITION_TYPE13)
            ;
            adaptor.addChild(root_0, CONDITION_TYPE13_tree);



              retval.condType = new ConditionType(CONDITION_TYPE13.getText());
              

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
    // $ANTLR end "conditionType"


    public static class action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:84:1: action : ( moveAction fightAction | chooseAction chooseAction | moveAction chooseAction | chooseAction fightAction );
    public final safParser.action_return action() throws RecognitionException {
        safParser.action_return retval = new safParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        safParser.moveAction_return moveAction14 =null;

        safParser.fightAction_return fightAction15 =null;

        safParser.chooseAction_return chooseAction16 =null;

        safParser.chooseAction_return chooseAction17 =null;

        safParser.moveAction_return moveAction18 =null;

        safParser.chooseAction_return chooseAction19 =null;

        safParser.chooseAction_return chooseAction20 =null;

        safParser.fightAction_return fightAction21 =null;



        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:85:3: ( moveAction fightAction | chooseAction chooseAction | moveAction chooseAction | chooseAction fightAction )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==MOVE_ACTION) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==FIGHT_ACTION) ) {
                    alt3=1;
                }
                else if ( (LA3_1==CHOOSE) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==CHOOSE) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==R_CURLY) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==MOVE_ACTION) ) {
                        int LA3_6 = input.LA(4);

                        if ( (LA3_6==MOVE_ACTION) ) {
                            int LA3_7 = input.LA(5);

                            if ( (LA3_7==L_CURLY) ) {
                                int LA3_8 = input.LA(6);

                                if ( (LA3_8==CHOOSE) ) {
                                    alt3=2;
                                }
                                else if ( (LA3_8==FIGHT_ACTION) ) {
                                    alt3=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 8, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 7, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

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
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:86:3: moveAction fightAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_moveAction_in_action304);
                    moveAction14=moveAction();

                    state._fsp--;

                    adaptor.addChild(root_0, moveAction14.getTree());

                    pushFollow(FOLLOW_fightAction_in_action306);
                    fightAction15=fightAction();

                    state._fsp--;

                    adaptor.addChild(root_0, fightAction15.getTree());

                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:86:28: chooseAction chooseAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_chooseAction_in_action310);
                    chooseAction16=chooseAction();

                    state._fsp--;

                    adaptor.addChild(root_0, chooseAction16.getTree());

                    pushFollow(FOLLOW_chooseAction_in_action312);
                    chooseAction17=chooseAction();

                    state._fsp--;

                    adaptor.addChild(root_0, chooseAction17.getTree());

                    }
                    break;
                case 3 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:86:56: moveAction chooseAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_moveAction_in_action316);
                    moveAction18=moveAction();

                    state._fsp--;

                    adaptor.addChild(root_0, moveAction18.getTree());

                    pushFollow(FOLLOW_chooseAction_in_action318);
                    chooseAction19=chooseAction();

                    state._fsp--;

                    adaptor.addChild(root_0, chooseAction19.getTree());

                    }
                    break;
                case 4 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:86:82: chooseAction fightAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_chooseAction_in_action322);
                    chooseAction20=chooseAction();

                    state._fsp--;

                    adaptor.addChild(root_0, chooseAction20.getTree());

                    pushFollow(FOLLOW_fightAction_in_action324);
                    fightAction21=fightAction();

                    state._fsp--;

                    adaptor.addChild(root_0, fightAction21.getTree());

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


    public static class chooseAction_return extends ParserRuleReturnScope {
        public ChooseAction ch;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chooseAction"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:89:1: chooseAction returns [ChooseAction ch] : CHOOSE R_CURLY ma1= moveAction ma2= moveAction L_CURLY ;
    public final safParser.chooseAction_return chooseAction() throws RecognitionException {
        safParser.chooseAction_return retval = new safParser.chooseAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE22=null;
        Token R_CURLY23=null;
        Token L_CURLY24=null;
        safParser.moveAction_return ma1 =null;

        safParser.moveAction_return ma2 =null;


        Object CHOOSE22_tree=null;
        Object R_CURLY23_tree=null;
        Object L_CURLY24_tree=null;

        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:90:3: ( CHOOSE R_CURLY ma1= moveAction ma2= moveAction L_CURLY )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:91:3: CHOOSE R_CURLY ma1= moveAction ma2= moveAction L_CURLY
            {
            root_0 = (Object)adaptor.nil();


            CHOOSE22=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_chooseAction345); 
            CHOOSE22_tree = 
            (Object)adaptor.create(CHOOSE22)
            ;
            adaptor.addChild(root_0, CHOOSE22_tree);


            R_CURLY23=(Token)match(input,R_CURLY,FOLLOW_R_CURLY_in_chooseAction347); 
            R_CURLY23_tree = 
            (Object)adaptor.create(R_CURLY23)
            ;
            adaptor.addChild(root_0, R_CURLY23_tree);


            pushFollow(FOLLOW_moveAction_in_chooseAction351);
            ma1=moveAction();

            state._fsp--;

            adaptor.addChild(root_0, ma1.getTree());

            pushFollow(FOLLOW_moveAction_in_chooseAction355);
            ma2=moveAction();

            state._fsp--;

            adaptor.addChild(root_0, ma2.getTree());

            L_CURLY24=(Token)match(input,L_CURLY,FOLLOW_L_CURLY_in_chooseAction357); 
            L_CURLY24_tree = 
            (Object)adaptor.create(L_CURLY24)
            ;
            adaptor.addChild(root_0, L_CURLY24_tree);



               retval.ch = new ChooseAction(ma1.mova, ma2.mova);
              

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
    // $ANTLR end "chooseAction"


    public static class moveAction_return extends ParserRuleReturnScope {
        public MoveAction mova;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moveAction"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:97:1: moveAction returns [MoveAction mova] : MOVE_ACTION ;
    public final safParser.moveAction_return moveAction() throws RecognitionException {
        safParser.moveAction_return retval = new safParser.moveAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MOVE_ACTION25=null;

        Object MOVE_ACTION25_tree=null;

        retval.mova = new MoveAction();
        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:98:3: ( MOVE_ACTION )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:99:3: MOVE_ACTION
            {
            root_0 = (Object)adaptor.nil();


            MOVE_ACTION25=(Token)match(input,MOVE_ACTION,FOLLOW_MOVE_ACTION_in_moveAction385); 
            MOVE_ACTION25_tree = 
            (Object)adaptor.create(MOVE_ACTION25)
            ;
            adaptor.addChild(root_0, MOVE_ACTION25_tree);



                retval.mova = new MoveAction(MOVE_ACTION25.getText());
              

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
    // $ANTLR end "moveAction"


    public static class fightAction_return extends ParserRuleReturnScope {
        public FightAction figa;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fightAction"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:105:1: fightAction returns [FightAction figa] : FIGHT_ACTION ;
    public final safParser.fightAction_return fightAction() throws RecognitionException {
        safParser.fightAction_return retval = new safParser.fightAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FIGHT_ACTION26=null;

        Object FIGHT_ACTION26_tree=null;

        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:106:3: ( FIGHT_ACTION )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:107:3: FIGHT_ACTION
            {
            root_0 = (Object)adaptor.nil();


            FIGHT_ACTION26=(Token)match(input,FIGHT_ACTION,FOLLOW_FIGHT_ACTION_in_fightAction407); 
            FIGHT_ACTION26_tree = 
            (Object)adaptor.create(FIGHT_ACTION26)
            ;
            adaptor.addChild(root_0, FIGHT_ACTION26_tree);



                retval.figa = new FightAction(FIGHT_ACTION26.getText());
              

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
    // $ANTLR end "fightAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_fighter_in_program103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fighter131 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_L_CURLY_in_fighter133 = new BitSet(new long[]{0x0000000000200280L});
    public static final BitSet FOLLOW_characteristic_in_fighter135 = new BitSet(new long[]{0x0000000000200280L});
    public static final BitSet FOLLOW_behaviour_in_fighter139 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_R_CURLY_in_fighter154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTERISTIC_in_characteristic180 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQ_in_characteristic182 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DIGIT_in_characteristic184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour215 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_L_BRACKET_in_behaviour221 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_action_in_behaviour223 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_action_in_behaviour225 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_R_BRACKET_in_behaviour227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_condition258 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_action_in_condition262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_conditionType285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveAction_in_action304 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_fightAction_in_action306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chooseAction_in_action310 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_chooseAction_in_action312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveAction_in_action316 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_chooseAction_in_action318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chooseAction_in_action322 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_fightAction_in_action324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_chooseAction345 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_R_CURLY_in_chooseAction347 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_moveAction_in_chooseAction351 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_moveAction_in_chooseAction355 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_L_CURLY_in_chooseAction357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_ACTION_in_moveAction385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGHT_ACTION_in_fightAction407 = new BitSet(new long[]{0x0000000000000002L});

}