// $ANTLR 3.4 D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g 2012-03-06 12:54:55

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BEHAVIOUR", "CHARACTERISTIC", "CHOOSE", "CONDITION_TYPE", "DIGIT", "EQ", "FIGHTER", "FIGHT_ACTION", "ID", "L_BRACKET", "L_CURLY", "L_PAR", "MOVE_ACTION", "OR", "PROGRAM", "R_BRACKET", "R_CURLY", "R_PAR", "WS"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int BEHAVIOUR=5;
    public static final int CHARACTERISTIC=6;
    public static final int CHOOSE=7;
    public static final int CONDITION_TYPE=8;
    public static final int DIGIT=9;
    public static final int EQ=10;
    public static final int FIGHTER=11;
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


            CHARACTERISTIC6=(Token)match(input,CHARACTERISTIC,FOLLOW_CHARACTERISTIC_in_characteristic182); 
            CHARACTERISTIC6_tree = 
            (Object)adaptor.create(CHARACTERISTIC6)
            ;
            adaptor.addChild(root_0, CHARACTERISTIC6_tree);


            EQ7=(Token)match(input,EQ,FOLLOW_EQ_in_characteristic184); 
            EQ7_tree = 
            (Object)adaptor.create(EQ7)
            ;
            adaptor.addChild(root_0, EQ7_tree);


            DIGIT8=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_characteristic186); 
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
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:49:1: behaviour returns [Behaviour beha] : condi= condition ;
    public final safParser.behaviour_return behaviour() throws RecognitionException {
        safParser.behaviour_return retval = new safParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        safParser.condition_return condi =null;



        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:50:3: (condi= condition )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:51:3: condi= condition
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_condition_in_behaviour208);
            condi=condition();

            state._fsp--;

            adaptor.addChild(root_0, condi.getTree());

             

               retval.beha = new Behaviour((condi!=null?condi.ct:null),(condi!=null?condi.action:null).get(0), (condi!=null?condi.action:null).get(1));
              

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
        public ArrayList<Action> action;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:58:1: condition returns [ConditionType ct, ArrayList<Action> action] : c= conditionType L_BRACKET a= action R_BRACKET ;
    public final safParser.condition_return condition() throws RecognitionException {
        safParser.condition_return retval = new safParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token L_BRACKET9=null;
        Token R_BRACKET10=null;
        safParser.conditionType_return c =null;

        safParser.action_return a =null;


        Object L_BRACKET9_tree=null;
        Object R_BRACKET10_tree=null;

        retval.action = new ArrayList<Action>();
        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:59:3: (c= conditionType L_BRACKET a= action R_BRACKET )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:60:3: c= conditionType L_BRACKET a= action R_BRACKET
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditionType_in_condition236);
            c=conditionType();

            state._fsp--;

            adaptor.addChild(root_0, c.getTree());

            L_BRACKET9=(Token)match(input,L_BRACKET,FOLLOW_L_BRACKET_in_condition238); 
            L_BRACKET9_tree = 
            (Object)adaptor.create(L_BRACKET9)
            ;
            adaptor.addChild(root_0, L_BRACKET9_tree);


            pushFollow(FOLLOW_action_in_condition243);
            a=action();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());

            R_BRACKET10=(Token)match(input,R_BRACKET,FOLLOW_R_BRACKET_in_condition245); 
            R_BRACKET10_tree = 
            (Object)adaptor.create(R_BRACKET10)
            ;
            adaptor.addChild(root_0, R_BRACKET10_tree);



                retval.ct =(c!=null?c.condType:null);
                retval.action =(a!=null?a.action:null);
              

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
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:67:1: conditionType returns [ConditionType condType] : CONDITION_TYPE ;
    public final safParser.conditionType_return conditionType() throws RecognitionException {
        safParser.conditionType_return retval = new safParser.conditionType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONDITION_TYPE11=null;

        Object CONDITION_TYPE11_tree=null;

        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:68:3: ( CONDITION_TYPE )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:69:3: CONDITION_TYPE
            {
            root_0 = (Object)adaptor.nil();


            CONDITION_TYPE11=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_conditionType268); 
            CONDITION_TYPE11_tree = 
            (Object)adaptor.create(CONDITION_TYPE11)
            ;
            adaptor.addChild(root_0, CONDITION_TYPE11_tree);



              retval.condType = new ConditionType(CONDITION_TYPE11.getText());
              System.out.println("The condition is> " + retval.condType.getName());
              

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
        public ArrayList<Action> action;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:76:1: action returns [ArrayList<Action> action] : (mac= moveAction fac= fightAction |cho1= chooseAction cho2= chooseAction |mac= moveAction cho2= chooseAction |cho= chooseAction fac= fightAction );
    public final safParser.action_return action() throws RecognitionException {
        safParser.action_return retval = new safParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        safParser.moveAction_return mac =null;

        safParser.fightAction_return fac =null;

        safParser.chooseAction_return cho1 =null;

        safParser.chooseAction_return cho2 =null;

        safParser.chooseAction_return cho =null;



        retval.action = new ArrayList<Action>();
        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:77:3: (mac= moveAction fac= fightAction |cho1= chooseAction cho2= chooseAction |mac= moveAction cho2= chooseAction |cho= chooseAction fac= fightAction )
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

                if ( (LA3_2==L_PAR) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==MOVE_ACTION) ) {
                        int LA3_6 = input.LA(4);

                        if ( (LA3_6==MOVE_ACTION) ) {
                            int LA3_8 = input.LA(5);

                            if ( (LA3_8==R_PAR) ) {
                                int LA3_10 = input.LA(6);

                                if ( (LA3_10==CHOOSE) ) {
                                    alt3=2;
                                }
                                else if ( (LA3_10==FIGHT_ACTION) ) {
                                    alt3=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 10, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 6, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA3_5==FIGHT_ACTION) ) {
                        int LA3_7 = input.LA(4);

                        if ( (LA3_7==FIGHT_ACTION) ) {
                            int LA3_9 = input.LA(5);

                            if ( (LA3_9==R_PAR) ) {
                                int LA3_10 = input.LA(6);

                                if ( (LA3_10==CHOOSE) ) {
                                    alt3=2;
                                }
                                else if ( (LA3_10==FIGHT_ACTION) ) {
                                    alt3=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 10, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 9, input);

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
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:78:3: mac= moveAction fac= fightAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_moveAction_in_action296);
                    mac=moveAction();

                    state._fsp--;

                    adaptor.addChild(root_0, mac.getTree());

                    pushFollow(FOLLOW_fightAction_in_action300);
                    fac=fightAction();

                    state._fsp--;

                    adaptor.addChild(root_0, fac.getTree());

                    retval.action.add((mac!=null?mac.mova:null));retval.action.add((fac!=null?fac.figa:null));

                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:80:3: cho1= chooseAction cho2= chooseAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_chooseAction_in_action314);
                    cho1=chooseAction();

                    state._fsp--;

                    adaptor.addChild(root_0, cho1.getTree());

                    pushFollow(FOLLOW_chooseAction_in_action318);
                    cho2=chooseAction();

                    state._fsp--;

                    adaptor.addChild(root_0, cho2.getTree());

                    retval.action.add((cho1!=null?cho1.cha:null));retval.action.add((cho2!=null?cho2.cha:null));

                    }
                    break;
                case 3 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:81:3: mac= moveAction cho2= chooseAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_moveAction_in_action329);
                    mac=moveAction();

                    state._fsp--;

                    adaptor.addChild(root_0, mac.getTree());

                    pushFollow(FOLLOW_chooseAction_in_action333);
                    cho2=chooseAction();

                    state._fsp--;

                    adaptor.addChild(root_0, cho2.getTree());

                    retval.action.add((mac!=null?mac.mova:null));retval.action.add((cho2!=null?cho2.cha:null));

                    }
                    break;
                case 4 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:82:3: cho= chooseAction fac= fightAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_chooseAction_in_action344);
                    cho=chooseAction();

                    state._fsp--;

                    adaptor.addChild(root_0, cho.getTree());

                    pushFollow(FOLLOW_fightAction_in_action348);
                    fac=fightAction();

                    state._fsp--;

                    adaptor.addChild(root_0, fac.getTree());

                    retval.action.add((cho1!=null?cho1.cha:null));retval.action.add((fac!=null?fac.figa:null));

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
        public ChooseAction cha;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chooseAction"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:85:1: chooseAction returns [ChooseAction cha] : CHOOSE L_PAR ap= actionPair R_PAR ;
    public final safParser.chooseAction_return chooseAction() throws RecognitionException {
        safParser.chooseAction_return retval = new safParser.chooseAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE12=null;
        Token L_PAR13=null;
        Token R_PAR14=null;
        safParser.actionPair_return ap =null;


        Object CHOOSE12_tree=null;
        Object L_PAR13_tree=null;
        Object R_PAR14_tree=null;

        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:86:3: ( CHOOSE L_PAR ap= actionPair R_PAR )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:87:3: CHOOSE L_PAR ap= actionPair R_PAR
            {
            root_0 = (Object)adaptor.nil();


            CHOOSE12=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_chooseAction372); 
            CHOOSE12_tree = 
            (Object)adaptor.create(CHOOSE12)
            ;
            adaptor.addChild(root_0, CHOOSE12_tree);


            L_PAR13=(Token)match(input,L_PAR,FOLLOW_L_PAR_in_chooseAction374); 
            L_PAR13_tree = 
            (Object)adaptor.create(L_PAR13)
            ;
            adaptor.addChild(root_0, L_PAR13_tree);


            pushFollow(FOLLOW_actionPair_in_chooseAction378);
            ap=actionPair();

            state._fsp--;

            adaptor.addChild(root_0, ap.getTree());

            R_PAR14=(Token)match(input,R_PAR,FOLLOW_R_PAR_in_chooseAction380); 
            R_PAR14_tree = 
            (Object)adaptor.create(R_PAR14)
            ;
            adaptor.addChild(root_0, R_PAR14_tree);



               retval.cha = new ChooseAction(ap.actionPair);
              

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


    public static class actionPair_return extends ParserRuleReturnScope {
        public ArrayList<Action> actionPair;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "actionPair"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:93:1: actionPair returns [ArrayList<Action> actionPair] : (movepair= moveActionPair |fightpair= fightActionPair ) ;
    public final safParser.actionPair_return actionPair() throws RecognitionException {
        safParser.actionPair_return retval = new safParser.actionPair_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        safParser.moveActionPair_return movepair =null;

        safParser.fightActionPair_return fightpair =null;



        retval.actionPair = new ArrayList<Action>();
        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:94:3: ( (movepair= moveActionPair |fightpair= fightActionPair ) )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:95:3: (movepair= moveActionPair |fightpair= fightActionPair )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:95:3: (movepair= moveActionPair |fightpair= fightActionPair )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==MOVE_ACTION) ) {
                alt4=1;
            }
            else if ( (LA4_0==FIGHT_ACTION) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:95:4: movepair= moveActionPair
                    {
                    pushFollow(FOLLOW_moveActionPair_in_actionPair414);
                    movepair=moveActionPair();

                    state._fsp--;

                    adaptor.addChild(root_0, movepair.getTree());

                    }
                    break;
                case 2 :
                    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:95:32: fightpair= fightActionPair
                    {
                    pushFollow(FOLLOW_fightActionPair_in_actionPair422);
                    fightpair=fightActionPair();

                    state._fsp--;

                    adaptor.addChild(root_0, fightpair.getTree());

                    }
                    break;

            }



               if (! movepair.actionList.isEmpty()){
                retval.actionPair.addAll(movepair.actionList);
               }
               else{
                retval.actionPair.addAll(fightpair.actionList);
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
    // $ANTLR end "actionPair"


    public static class moveActionPair_return extends ParserRuleReturnScope {
        public ArrayList<Action> actionList;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moveActionPair"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:106:1: moveActionPair returns [ArrayList<Action> actionList] : ma1= moveAction ma2= moveAction ;
    public final safParser.moveActionPair_return moveActionPair() throws RecognitionException {
        safParser.moveActionPair_return retval = new safParser.moveActionPair_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        safParser.moveAction_return ma1 =null;

        safParser.moveAction_return ma2 =null;



        retval.actionList = new ArrayList<Action>();
        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:107:3: (ma1= moveAction ma2= moveAction )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:108:3: ma1= moveAction ma2= moveAction
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_moveAction_in_moveActionPair455);
            ma1=moveAction();

            state._fsp--;

            adaptor.addChild(root_0, ma1.getTree());

            pushFollow(FOLLOW_moveAction_in_moveActionPair459);
            ma2=moveAction();

            state._fsp--;

            adaptor.addChild(root_0, ma2.getTree());


               retval.actionList.add(ma1.mova);
               retval.actionList.add(ma2.mova);
              

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
    // $ANTLR end "moveActionPair"


    public static class fightActionPair_return extends ParserRuleReturnScope {
        public ArrayList<Action> actionList;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fightActionPair"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:115:1: fightActionPair returns [ArrayList<Action> actionList] : fa1= fightAction fa2= fightAction ;
    public final safParser.fightActionPair_return fightActionPair() throws RecognitionException {
        safParser.fightActionPair_return retval = new safParser.fightActionPair_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        safParser.fightAction_return fa1 =null;

        safParser.fightAction_return fa2 =null;



        retval.actionList = new ArrayList<Action>();
        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:116:3: (fa1= fightAction fa2= fightAction )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:117:3: fa1= fightAction fa2= fightAction
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_fightAction_in_fightActionPair489);
            fa1=fightAction();

            state._fsp--;

            adaptor.addChild(root_0, fa1.getTree());

            pushFollow(FOLLOW_fightAction_in_fightActionPair493);
            fa2=fightAction();

            state._fsp--;

            adaptor.addChild(root_0, fa2.getTree());


               retval.actionList.add(fa1.figa);
               retval.actionList.add(fa2.figa);
              

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
    // $ANTLR end "fightActionPair"


    public static class moveAction_return extends ParserRuleReturnScope {
        public MoveAction mova;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moveAction"
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:124:1: moveAction returns [MoveAction mova] : MOVE_ACTION ;
    public final safParser.moveAction_return moveAction() throws RecognitionException {
        safParser.moveAction_return retval = new safParser.moveAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MOVE_ACTION15=null;

        Object MOVE_ACTION15_tree=null;

        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:125:3: ( MOVE_ACTION )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:126:3: MOVE_ACTION
            {
            root_0 = (Object)adaptor.nil();


            MOVE_ACTION15=(Token)match(input,MOVE_ACTION,FOLLOW_MOVE_ACTION_in_moveAction519); 
            MOVE_ACTION15_tree = 
            (Object)adaptor.create(MOVE_ACTION15)
            ;
            adaptor.addChild(root_0, MOVE_ACTION15_tree);



                retval.mova = new MoveAction(MOVE_ACTION15.getText());
              

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
    // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:132:1: fightAction returns [FightAction figa] : FIGHT_ACTION ;
    public final safParser.fightAction_return fightAction() throws RecognitionException {
        safParser.fightAction_return retval = new safParser.fightAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FIGHT_ACTION16=null;

        Object FIGHT_ACTION16_tree=null;

        try {
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:133:3: ( FIGHT_ACTION )
            // D:\\SAF\\workspace\\SC12\\src\\gram\\saf.g:134:3: FIGHT_ACTION
            {
            root_0 = (Object)adaptor.nil();


            FIGHT_ACTION16=(Token)match(input,FIGHT_ACTION,FOLLOW_FIGHT_ACTION_in_fightAction542); 
            FIGHT_ACTION16_tree = 
            (Object)adaptor.create(FIGHT_ACTION16)
            ;
            adaptor.addChild(root_0, FIGHT_ACTION16_tree);



                retval.figa = new FightAction(FIGHT_ACTION16.getText());
              

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
    public static final BitSet FOLLOW_L_CURLY_in_fighter133 = new BitSet(new long[]{0x0000000000200140L});
    public static final BitSet FOLLOW_characteristic_in_fighter135 = new BitSet(new long[]{0x0000000000200140L});
    public static final BitSet FOLLOW_behaviour_in_fighter139 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_R_CURLY_in_fighter154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTERISTIC_in_characteristic182 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_characteristic184 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DIGIT_in_characteristic186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_condition236 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_L_BRACKET_in_condition238 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_action_in_condition243 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_R_BRACKET_in_condition245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_conditionType268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveAction_in_action296 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_fightAction_in_action300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chooseAction_in_action314 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_chooseAction_in_action318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveAction_in_action329 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_chooseAction_in_action333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chooseAction_in_action344 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_fightAction_in_action348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_chooseAction372 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_L_PAR_in_chooseAction374 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_actionPair_in_chooseAction378 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_R_PAR_in_chooseAction380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveActionPair_in_actionPair414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fightActionPair_in_actionPair422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveAction_in_moveActionPair455 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_moveAction_in_moveActionPair459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fightAction_in_fightActionPair489 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_fightAction_in_fightActionPair493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_ACTION_in_moveAction519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGHT_ACTION_in_fightAction542 = new BitSet(new long[]{0x0000000000000002L});

}