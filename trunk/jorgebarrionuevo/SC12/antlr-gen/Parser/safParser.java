// $ANTLR 3.4 D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g 2012-04-11 20:42:36

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CHARACTERISTIC", "CHOOSE", "CONDITION_TYPE", "EQ", "FIGHT_ACTION", "ID", "L_BRACKET", "L_CURLY", "L_PAR", "MOVE_ACTION", "NUMBER", "OR", "R_BRACKET", "R_CURLY", "R_PAR", "WS"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int CHARACTERISTIC=5;
    public static final int CHOOSE=6;
    public static final int CONDITION_TYPE=7;
    public static final int EQ=8;
    public static final int FIGHT_ACTION=9;
    public static final int ID=10;
    public static final int L_BRACKET=11;
    public static final int L_CURLY=12;
    public static final int L_PAR=13;
    public static final int MOVE_ACTION=14;
    public static final int NUMBER=15;
    public static final int OR=16;
    public static final int R_BRACKET=17;
    public static final int R_CURLY=18;
    public static final int R_PAR=19;
    public static final int WS=20;

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
    public String getGrammarFileName() { return "D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g"; }


    Fighter fighter;


    public static class fighter_return extends ParserRuleReturnScope {
        public Fighter fighter;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:26:1: fighter returns [Fighter fighter] : ID L_CURLY ( characteristic )* ( behaviour )* R_CURLY ;
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
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:27:3: ( ID L_CURLY ( characteristic )* ( behaviour )* R_CURLY )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:28:5: ID L_CURLY ( characteristic )* ( behaviour )* R_CURLY
            {
            root_0 = (Object)adaptor.nil();


            ID1=(Token)match(input,ID,FOLLOW_ID_in_fighter81); 
            ID1_tree = 
            (Object)adaptor.create(ID1)
            ;
            adaptor.addChild(root_0, ID1_tree);



                  retval.fighter.setName((ID1!=null?ID1.getText():null));
                

            L_CURLY2=(Token)match(input,L_CURLY,FOLLOW_L_CURLY_in_fighter94); 
            L_CURLY2_tree = 
            (Object)adaptor.create(L_CURLY2)
            ;
            adaptor.addChild(root_0, L_CURLY2_tree);


            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:33:5: ( characteristic )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CHARACTERISTIC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:33:6: characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_fighter102);
            	    characteristic3=characteristic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, characteristic3.getTree());


            	          retval.fighter.addCharacteristic((characteristic3!=null?characteristic3.c:null));
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:38:5: ( behaviour )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CONDITION_TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:38:6: behaviour
            	    {
            	    pushFollow(FOLLOW_behaviour_in_fighter124);
            	    behaviour4=behaviour();

            	    state._fsp--;

            	    adaptor.addChild(root_0, behaviour4.getTree());


            	          retval.fighter.addBehaviour((behaviour4!=null?behaviour4.beha:null));
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            R_CURLY5=(Token)match(input,R_CURLY,FOLLOW_R_CURLY_in_fighter143); 
            R_CURLY5_tree = 
            (Object)adaptor.create(R_CURLY5)
            ;
            adaptor.addChild(root_0, R_CURLY5_tree);


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
    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:47:1: characteristic returns [Characteristic c] : CHARACTERISTIC EQ NUMBER ;
    public final safParser.characteristic_return characteristic() throws RecognitionException {
        safParser.characteristic_return retval = new safParser.characteristic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHARACTERISTIC6=null;
        Token EQ7=null;
        Token NUMBER8=null;

        Object CHARACTERISTIC6_tree=null;
        Object EQ7_tree=null;
        Object NUMBER8_tree=null;

        try {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:48:3: ( CHARACTERISTIC EQ NUMBER )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:49:3: CHARACTERISTIC EQ NUMBER
            {
            root_0 = (Object)adaptor.nil();


            CHARACTERISTIC6=(Token)match(input,CHARACTERISTIC,FOLLOW_CHARACTERISTIC_in_characteristic169); 
            CHARACTERISTIC6_tree = 
            (Object)adaptor.create(CHARACTERISTIC6)
            ;
            adaptor.addChild(root_0, CHARACTERISTIC6_tree);


            EQ7=(Token)match(input,EQ,FOLLOW_EQ_in_characteristic171); 
            EQ7_tree = 
            (Object)adaptor.create(EQ7)
            ;
            adaptor.addChild(root_0, EQ7_tree);


            NUMBER8=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_characteristic173); 
            NUMBER8_tree = 
            (Object)adaptor.create(NUMBER8)
            ;
            adaptor.addChild(root_0, NUMBER8_tree);



              retval.c = new Characteristic(CHARACTERISTIC6.getText(),Integer.parseInt(NUMBER8.getText()));
              

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
    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:55:1: behaviour returns [Behaviour beha] : condi= condition ;
    public final safParser.behaviour_return behaviour() throws RecognitionException {
        safParser.behaviour_return retval = new safParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        safParser.condition_return condi =null;



        try {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:56:3: (condi= condition )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:57:3: condi= condition
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_condition_in_behaviour199);
            condi=condition();

            state._fsp--;

            adaptor.addChild(root_0, condi.getTree());

             
               retval.beha = new Behaviour((condi!=null?condi.ct:null),(condi!=null?condi.act1:null), (condi!=null?condi.act2:null));
              

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
        public Condition ct;
        public Action act1;
        public Action act2;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:63:1: condition returns [Condition ct, Action act1, Action act2] : (c= conditionType L_BRACKET a1= action a2= action R_BRACKET |o= operand L_BRACKET a1= action a2= action R_BRACKET );
    public final safParser.condition_return condition() throws RecognitionException {
        safParser.condition_return retval = new safParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token L_BRACKET9=null;
        Token R_BRACKET10=null;
        Token L_BRACKET11=null;
        Token R_BRACKET12=null;
        safParser.conditionType_return c =null;

        safParser.action_return a1 =null;

        safParser.action_return a2 =null;

        safParser.operand_return o =null;


        Object L_BRACKET9_tree=null;
        Object R_BRACKET10_tree=null;
        Object L_BRACKET11_tree=null;
        Object R_BRACKET12_tree=null;

        try {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:64:3: (c= conditionType L_BRACKET a1= action a2= action R_BRACKET |o= operand L_BRACKET a1= action a2= action R_BRACKET )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CONDITION_TYPE) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==L_BRACKET) ) {
                    alt3=1;
                }
                else if ( (LA3_1==AND||LA3_1==OR) ) {
                    alt3=2;
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
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:65:3: c= conditionType L_BRACKET a1= action a2= action R_BRACKET
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditionType_in_condition225);
                    c=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, c.getTree());

                    L_BRACKET9=(Token)match(input,L_BRACKET,FOLLOW_L_BRACKET_in_condition227); 
                    L_BRACKET9_tree = 
                    (Object)adaptor.create(L_BRACKET9)
                    ;
                    adaptor.addChild(root_0, L_BRACKET9_tree);


                    pushFollow(FOLLOW_action_in_condition232);
                    a1=action();

                    state._fsp--;

                    adaptor.addChild(root_0, a1.getTree());

                    pushFollow(FOLLOW_action_in_condition236);
                    a2=action();

                    state._fsp--;

                    adaptor.addChild(root_0, a2.getTree());

                    R_BRACKET10=(Token)match(input,R_BRACKET,FOLLOW_R_BRACKET_in_condition238); 
                    R_BRACKET10_tree = 
                    (Object)adaptor.create(R_BRACKET10)
                    ;
                    adaptor.addChild(root_0, R_BRACKET10_tree);



                        retval.ct =(c!=null?c.condType:null);
                        retval.act1 =(a1!=null?a1.act:null);
                        retval.act2 =(a2!=null?a2.act:null);
                      

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:72:3: o= operand L_BRACKET a1= action a2= action R_BRACKET
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_operand_in_condition252);
                    o=operand();

                    state._fsp--;

                    adaptor.addChild(root_0, o.getTree());

                    L_BRACKET11=(Token)match(input,L_BRACKET,FOLLOW_L_BRACKET_in_condition254); 
                    L_BRACKET11_tree = 
                    (Object)adaptor.create(L_BRACKET11)
                    ;
                    adaptor.addChild(root_0, L_BRACKET11_tree);


                    pushFollow(FOLLOW_action_in_condition259);
                    a1=action();

                    state._fsp--;

                    adaptor.addChild(root_0, a1.getTree());

                    pushFollow(FOLLOW_action_in_condition263);
                    a2=action();

                    state._fsp--;

                    adaptor.addChild(root_0, a2.getTree());

                    R_BRACKET12=(Token)match(input,R_BRACKET,FOLLOW_R_BRACKET_in_condition265); 
                    R_BRACKET12_tree = 
                    (Object)adaptor.create(R_BRACKET12)
                    ;
                    adaptor.addChild(root_0, R_BRACKET12_tree);



                        retval.ct =(o!=null?o.log:null);
                        retval.act1 =(a1!=null?a1.act:null);
                        retval.act2 =(a2!=null?a2.act:null);
                      

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


    public static class operand_return extends ParserRuleReturnScope {
        public ConditionLogic log;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operand"
    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:79:1: operand returns [ConditionLogic log] : (cl= conditionType OR cr= conditionType |cl= conditionType AND cr= conditionType );
    public final safParser.operand_return operand() throws RecognitionException {
        safParser.operand_return retval = new safParser.operand_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR13=null;
        Token AND14=null;
        safParser.conditionType_return cl =null;

        safParser.conditionType_return cr =null;


        Object OR13_tree=null;
        Object AND14_tree=null;

        try {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:80:3: (cl= conditionType OR cr= conditionType |cl= conditionType AND cr= conditionType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CONDITION_TYPE) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==OR) ) {
                    alt4=1;
                }
                else if ( (LA4_1==AND) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:81:3: cl= conditionType OR cr= conditionType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditionType_in_operand289);
                    cl=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, cl.getTree());

                    OR13=(Token)match(input,OR,FOLLOW_OR_in_operand291); 
                    OR13_tree = 
                    (Object)adaptor.create(OR13)
                    ;
                    adaptor.addChild(root_0, OR13_tree);


                    pushFollow(FOLLOW_conditionType_in_operand295);
                    cr=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, cr.getTree());


                        retval.log = new Or((cl!=null?cl.condType:null),(cr!=null?cr.condType:null));
                      

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:85:3: cl= conditionType AND cr= conditionType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditionType_in_operand307);
                    cl=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, cl.getTree());

                    AND14=(Token)match(input,AND,FOLLOW_AND_in_operand309); 
                    AND14_tree = 
                    (Object)adaptor.create(AND14)
                    ;
                    adaptor.addChild(root_0, AND14_tree);


                    pushFollow(FOLLOW_conditionType_in_operand313);
                    cr=conditionType();

                    state._fsp--;

                    adaptor.addChild(root_0, cr.getTree());


                        retval.log = new And((cl!=null?cl.condType:null),(cr!=null?cr.condType:null));
                      

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
    // $ANTLR end "operand"


    public static class conditionType_return extends ParserRuleReturnScope {
        public ConditionType condType;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionType"
    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:91:1: conditionType returns [ConditionType condType] : CONDITION_TYPE ;
    public final safParser.conditionType_return conditionType() throws RecognitionException {
        safParser.conditionType_return retval = new safParser.conditionType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONDITION_TYPE15=null;

        Object CONDITION_TYPE15_tree=null;

        try {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:92:3: ( CONDITION_TYPE )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:93:3: CONDITION_TYPE
            {
            root_0 = (Object)adaptor.nil();


            CONDITION_TYPE15=(Token)match(input,CONDITION_TYPE,FOLLOW_CONDITION_TYPE_in_conditionType340); 
            CONDITION_TYPE15_tree = 
            (Object)adaptor.create(CONDITION_TYPE15)
            ;
            adaptor.addChild(root_0, CONDITION_TYPE15_tree);



              retval.condType = new ConditionType(CONDITION_TYPE15.getText());
              

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
        public Action act;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:99:1: action returns [Action act] : (choa= chooseAction |simac= simpleAction );
    public final safParser.action_return action() throws RecognitionException {
        safParser.action_return retval = new safParser.action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        safParser.chooseAction_return choa =null;

        safParser.simpleAction_return simac =null;



        try {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:100:3: (choa= chooseAction |simac= simpleAction )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CHOOSE) ) {
                alt5=1;
            }
            else if ( (LA5_0==FIGHT_ACTION||LA5_0==MOVE_ACTION) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:102:3: choa= chooseAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_chooseAction_in_action368);
                    choa=chooseAction();

                    state._fsp--;

                    adaptor.addChild(root_0, choa.getTree());

                    retval.act =choa.cha;

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:103:3: simac= simpleAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simpleAction_in_action377);
                    simac=simpleAction();

                    state._fsp--;

                    adaptor.addChild(root_0, simac.getTree());

                    retval.act =simac.siac;

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
    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:106:1: chooseAction returns [ChooseAction cha] : CHOOSE L_PAR sa1= simpleAction sa2= simpleAction R_PAR ;
    public final safParser.chooseAction_return chooseAction() throws RecognitionException {
        safParser.chooseAction_return retval = new safParser.chooseAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE16=null;
        Token L_PAR17=null;
        Token R_PAR18=null;
        safParser.simpleAction_return sa1 =null;

        safParser.simpleAction_return sa2 =null;


        Object CHOOSE16_tree=null;
        Object L_PAR17_tree=null;
        Object R_PAR18_tree=null;

        try {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:107:3: ( CHOOSE L_PAR sa1= simpleAction sa2= simpleAction R_PAR )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:108:3: CHOOSE L_PAR sa1= simpleAction sa2= simpleAction R_PAR
            {
            root_0 = (Object)adaptor.nil();


            CHOOSE16=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_chooseAction401); 
            CHOOSE16_tree = 
            (Object)adaptor.create(CHOOSE16)
            ;
            adaptor.addChild(root_0, CHOOSE16_tree);


            L_PAR17=(Token)match(input,L_PAR,FOLLOW_L_PAR_in_chooseAction403); 
            L_PAR17_tree = 
            (Object)adaptor.create(L_PAR17)
            ;
            adaptor.addChild(root_0, L_PAR17_tree);


            pushFollow(FOLLOW_simpleAction_in_chooseAction407);
            sa1=simpleAction();

            state._fsp--;

            adaptor.addChild(root_0, sa1.getTree());

            pushFollow(FOLLOW_simpleAction_in_chooseAction411);
            sa2=simpleAction();

            state._fsp--;

            adaptor.addChild(root_0, sa2.getTree());

            R_PAR18=(Token)match(input,R_PAR,FOLLOW_R_PAR_in_chooseAction413); 
            R_PAR18_tree = 
            (Object)adaptor.create(R_PAR18)
            ;
            adaptor.addChild(root_0, R_PAR18_tree);



               retval.cha = new ChooseAction((sa1!=null?sa1.siac:null), (sa2!=null?sa2.siac:null));
              

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


    public static class simpleAction_return extends ParserRuleReturnScope {
        public SimpleAction siac;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleAction"
    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:114:1: simpleAction returns [SimpleAction siac] : ( moveAction | fightAction );
    public final safParser.simpleAction_return simpleAction() throws RecognitionException {
        safParser.simpleAction_return retval = new safParser.simpleAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        safParser.moveAction_return moveAction19 =null;

        safParser.fightAction_return fightAction20 =null;



        try {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:115:3: ( moveAction | fightAction )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==MOVE_ACTION) ) {
                alt6=1;
            }
            else if ( (LA6_0==FIGHT_ACTION) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:116:3: moveAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_moveAction_in_simpleAction442);
                    moveAction19=moveAction();

                    state._fsp--;

                    adaptor.addChild(root_0, moveAction19.getTree());


                        retval.siac = (moveAction19!=null?moveAction19.moac:null);
                      

                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:120:5: fightAction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fightAction_in_simpleAction453);
                    fightAction20=fightAction();

                    state._fsp--;

                    adaptor.addChild(root_0, fightAction20.getTree());


                        retval.siac = (fightAction20!=null?fightAction20.fiac:null);
                      

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
    // $ANTLR end "simpleAction"


    public static class moveAction_return extends ParserRuleReturnScope {
        public MoveAction moac;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moveAction"
    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:126:1: moveAction returns [MoveAction moac] : MOVE_ACTION ;
    public final safParser.moveAction_return moveAction() throws RecognitionException {
        safParser.moveAction_return retval = new safParser.moveAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MOVE_ACTION21=null;

        Object MOVE_ACTION21_tree=null;

        try {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:127:3: ( MOVE_ACTION )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:128:3: MOVE_ACTION
            {
            root_0 = (Object)adaptor.nil();


            MOVE_ACTION21=(Token)match(input,MOVE_ACTION,FOLLOW_MOVE_ACTION_in_moveAction476); 
            MOVE_ACTION21_tree = 
            (Object)adaptor.create(MOVE_ACTION21)
            ;
            adaptor.addChild(root_0, MOVE_ACTION21_tree);



                retval.moac = new MoveAction(MOVE_ACTION21.getText());
              

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
        public FightAction fiac;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fightAction"
    // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:134:1: fightAction returns [FightAction fiac] : FIGHT_ACTION ;
    public final safParser.fightAction_return fightAction() throws RecognitionException {
        safParser.fightAction_return retval = new safParser.fightAction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FIGHT_ACTION22=null;

        Object FIGHT_ACTION22_tree=null;

        try {
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:135:3: ( FIGHT_ACTION )
            // D:\\Dropbox\\Dropbox\\Software Construction\\workspace\\SC12\\src\\gram\\saf.g:136:3: FIGHT_ACTION
            {
            root_0 = (Object)adaptor.nil();


            FIGHT_ACTION22=(Token)match(input,FIGHT_ACTION,FOLLOW_FIGHT_ACTION_in_fightAction501); 
            FIGHT_ACTION22_tree = 
            (Object)adaptor.create(FIGHT_ACTION22)
            ;
            adaptor.addChild(root_0, FIGHT_ACTION22_tree);



                retval.fiac = new FightAction(FIGHT_ACTION22.getText());
              

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


 

    public static final BitSet FOLLOW_ID_in_fighter81 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_L_CURLY_in_fighter94 = new BitSet(new long[]{0x00000000000400A0L});
    public static final BitSet FOLLOW_characteristic_in_fighter102 = new BitSet(new long[]{0x00000000000400A0L});
    public static final BitSet FOLLOW_behaviour_in_fighter124 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_R_CURLY_in_fighter143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTERISTIC_in_characteristic169 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQ_in_characteristic171 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_NUMBER_in_characteristic173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_behaviour199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_condition225 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_L_BRACKET_in_condition227 = new BitSet(new long[]{0x0000000000004240L});
    public static final BitSet FOLLOW_action_in_condition232 = new BitSet(new long[]{0x0000000000004240L});
    public static final BitSet FOLLOW_action_in_condition236 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_R_BRACKET_in_condition238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operand_in_condition252 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_L_BRACKET_in_condition254 = new BitSet(new long[]{0x0000000000004240L});
    public static final BitSet FOLLOW_action_in_condition259 = new BitSet(new long[]{0x0000000000004240L});
    public static final BitSet FOLLOW_action_in_condition263 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_R_BRACKET_in_condition265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_operand289 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OR_in_operand291 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_conditionType_in_operand295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionType_in_operand307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_operand309 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_conditionType_in_operand313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_TYPE_in_conditionType340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chooseAction_in_action368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleAction_in_action377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_chooseAction401 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_L_PAR_in_chooseAction403 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_simpleAction_in_chooseAction407 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_simpleAction_in_chooseAction411 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_R_PAR_in_chooseAction413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveAction_in_simpleAction442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fightAction_in_simpleAction453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_ACTION_in_moveAction476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGHT_ACTION_in_fightAction501 = new BitSet(new long[]{0x0000000000000002L});

}