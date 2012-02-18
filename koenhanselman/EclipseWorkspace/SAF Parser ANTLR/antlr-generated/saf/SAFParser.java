// $ANTLR 3.4 C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g 2012-02-17 02:38:24

  package saf;
  import saf.evaluators.*;
  import saf.objecttypes.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "DIGIT", "IDENT", "LEFT_BRACK", "LEFT_CURLY", "LEFT_PAREN", "LETTER", "OR", "RIGHT_BRACK", "RIGHT_CURLY", "RIGHT_PAREN", "WS", "'='", "'choose'"
    };

    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int AND=4;
    public static final int DIGIT=5;
    public static final int IDENT=6;
    public static final int LEFT_BRACK=7;
    public static final int LEFT_CURLY=8;
    public static final int LEFT_PAREN=9;
    public static final int LETTER=10;
    public static final int OR=11;
    public static final int RIGHT_BRACK=12;
    public static final int RIGHT_CURLY=13;
    public static final int RIGHT_PAREN=14;
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
    public String getGrammarFileName() { return "C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g"; }


        Fighter fighter;
        List<Characteristic> personality = new ArrayList<Characteristic>();
        List<Rule> behaviour = new ArrayList<Rule>();


    public static class fighter_return extends ParserRuleReturnScope {
        CommenTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:25:1: fighter : IDENT LEFT_CURLY personality behaviour RIGHT_CURLY ;
    public final SAFParser.fighter_return fighter() throws RecognitionException {
        SAFParser.fighter_return retval = new SAFParser.fighter_return();
        retval.start = input.LT(1);


        CommenTree root_0 = null;

        Token IDENT1=null;
        Token LEFT_CURLY2=null;
        Token RIGHT_CURLY5=null;
        SAFParser.personality_return personality3 =null;

        SAFParser.behaviour_return behaviour4 =null;


        CommenTree IDENT1_tree=null;
        CommenTree LEFT_CURLY2_tree=null;
        CommenTree RIGHT_CURLY5_tree=null;

        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:26:2: ( IDENT LEFT_CURLY personality behaviour RIGHT_CURLY )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:26:4: IDENT LEFT_CURLY personality behaviour RIGHT_CURLY
            {
            root_0 = (CommenTree)adaptor.nil();


            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter67); 
            IDENT1_tree = 
            (CommenTree)adaptor.create(IDENT1)
            ;
            adaptor.addChild(root_0, IDENT1_tree);


            LEFT_CURLY2=(Token)match(input,LEFT_CURLY,FOLLOW_LEFT_CURLY_in_fighter69); 
            LEFT_CURLY2_tree = 
            (CommenTree)adaptor.create(LEFT_CURLY2)
            ;
            adaptor.addChild(root_0, LEFT_CURLY2_tree);


            pushFollow(FOLLOW_personality_in_fighter74);
            personality3=personality();

            state._fsp--;

            adaptor.addChild(root_0, personality3.getTree());

            pushFollow(FOLLOW_behaviour_in_fighter79);
            behaviour4=behaviour();

            state._fsp--;

            adaptor.addChild(root_0, behaviour4.getTree());

            RIGHT_CURLY5=(Token)match(input,RIGHT_CURLY,FOLLOW_RIGHT_CURLY_in_fighter83); 
            RIGHT_CURLY5_tree = 
            (CommenTree)adaptor.create(RIGHT_CURLY5)
            ;
            adaptor.addChild(root_0, RIGHT_CURLY5_tree);


             
            	        String fightername = (IDENT1!=null?IDENT1.getText():null);
            	        Personality personality = new Personality(personality);
            	        Behaviour behaviour = new Behaviour(behaviour);
            	        
            	        Fighter fighter = new Fighter(fightername, personality, behaviour);
                    

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommenTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommenTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fighter"


    public static class personality_return extends ParserRuleReturnScope {
        CommenTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:39:1: personality : ( characteristic )* ;
    public final SAFParser.personality_return personality() throws RecognitionException {
        SAFParser.personality_return retval = new SAFParser.personality_return();
        retval.start = input.LT(1);


        CommenTree root_0 = null;

        SAFParser.characteristic_return characteristic6 =null;



        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:40:2: ( ( characteristic )* )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:40:4: ( characteristic )*
            {
            root_0 = (CommenTree)adaptor.nil();


            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:40:4: ( characteristic )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==16) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:40:4: characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_personality98);
            	    characteristic6=characteristic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, characteristic6.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommenTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommenTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "personality"


    public static class characteristic_return extends ParserRuleReturnScope {
        CommenTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:43:1: characteristic : IDENT '=' DIGIT ;
    public final SAFParser.characteristic_return characteristic() throws RecognitionException {
        SAFParser.characteristic_return retval = new SAFParser.characteristic_return();
        retval.start = input.LT(1);


        CommenTree root_0 = null;

        Token IDENT7=null;
        Token char_literal8=null;
        Token DIGIT9=null;

        CommenTree IDENT7_tree=null;
        CommenTree char_literal8_tree=null;
        CommenTree DIGIT9_tree=null;

        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:44:2: ( IDENT '=' DIGIT )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:44:4: IDENT '=' DIGIT
            {
            root_0 = (CommenTree)adaptor.nil();


            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_characteristic111); 
            IDENT7_tree = 
            (CommenTree)adaptor.create(IDENT7)
            ;
            adaptor.addChild(root_0, IDENT7_tree);


            char_literal8=(Token)match(input,16,FOLLOW_16_in_characteristic113); 
            char_literal8_tree = 
            (CommenTree)adaptor.create(char_literal8)
            ;
            adaptor.addChild(root_0, char_literal8_tree);


            DIGIT9=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_characteristic115); 
            DIGIT9_tree = 
            (CommenTree)adaptor.create(DIGIT9)
            ;
            adaptor.addChild(root_0, DIGIT9_tree);



            	        Characteristic characteristic = new Characteristic((IDENT7!=null?IDENT7.getText():null), Integer.parseInt((DIGIT9!=null?DIGIT9.getText():null)));
            	        personality.add(characteristic);
            	    

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommenTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommenTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "characteristic"


    public static class behaviour_return extends ParserRuleReturnScope {
        CommenTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:51:1: behaviour : ( rule )+ ;
    public final SAFParser.behaviour_return behaviour() throws RecognitionException {
        SAFParser.behaviour_return retval = new SAFParser.behaviour_return();
        retval.start = input.LT(1);


        CommenTree root_0 = null;

        SAFParser.rule_return rule10 =null;



        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:52:2: ( ( rule )+ )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:52:4: ( rule )+
            {
            root_0 = (CommenTree)adaptor.nil();


            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:52:4: ( rule )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT||LA2_0==LEFT_PAREN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:52:4: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_behaviour130);
            	    rule10=rule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rule10.getTree());

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


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommenTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommenTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "behaviour"


    public static class rule_return extends ParserRuleReturnScope {
        CommenTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:55:1: rule : condition LEFT_BRACK a1= action a2= action RIGHT_BRACK ;
    public final SAFParser.rule_return rule() throws RecognitionException {
        SAFParser.rule_return retval = new SAFParser.rule_return();
        retval.start = input.LT(1);


        CommenTree root_0 = null;

        Token LEFT_BRACK12=null;
        Token RIGHT_BRACK13=null;
        SAFParser.action_return a1 =null;

        SAFParser.action_return a2 =null;

        SAFParser.condition_return condition11 =null;


        CommenTree LEFT_BRACK12_tree=null;
        CommenTree RIGHT_BRACK13_tree=null;

        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:56:2: ( condition LEFT_BRACK a1= action a2= action RIGHT_BRACK )
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:56:4: condition LEFT_BRACK a1= action a2= action RIGHT_BRACK
            {
            root_0 = (CommenTree)adaptor.nil();


            pushFollow(FOLLOW_condition_in_rule143);
            condition11=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition11.getTree());

            LEFT_BRACK12=(Token)match(input,LEFT_BRACK,FOLLOW_LEFT_BRACK_in_rule145); 
            LEFT_BRACK12_tree = 
            (CommenTree)adaptor.create(LEFT_BRACK12)
            ;
            adaptor.addChild(root_0, LEFT_BRACK12_tree);


            pushFollow(FOLLOW_action_in_rule149);
            a1=action();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());

            pushFollow(FOLLOW_action_in_rule153);
            a2=action();

            state._fsp--;

            adaptor.addChild(root_0, a2.getTree());

            RIGHT_BRACK13=(Token)match(input,RIGHT_BRACK,FOLLOW_RIGHT_BRACK_in_rule155); 
            RIGHT_BRACK13_tree = 
            (CommenTree)adaptor.create(RIGHT_BRACK13)
            ;
            adaptor.addChild(root_0, RIGHT_BRACK13_tree);



            	        Rule rule = new Rule((condition11!=null?condition11.condition:null),
            	        					new Move((a1!=null?input.toString(a1.start,a1.stop):null)), 
            	                            new Attack((a2!=null?input.toString(a2.start,a2.stop):null)));
            	        behaviour.add(rule);
            	    

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommenTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommenTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rule"


    public static class action_return extends ParserRuleReturnScope {
        CommenTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:65:1: action : ( 'choose' LEFT_PAREN i1= IDENT (i2= IDENT )+ RIGHT_PAREN | IDENT );
    public final SAFParser.action_return action() throws RecognitionException {
        SAFParser.action_return retval = new SAFParser.action_return();
        retval.start = input.LT(1);


        CommenTree root_0 = null;

        Token i1=null;
        Token i2=null;
        Token string_literal14=null;
        Token LEFT_PAREN15=null;
        Token RIGHT_PAREN16=null;
        Token IDENT17=null;

        CommenTree i1_tree=null;
        CommenTree i2_tree=null;
        CommenTree string_literal14_tree=null;
        CommenTree LEFT_PAREN15_tree=null;
        CommenTree RIGHT_PAREN16_tree=null;
        CommenTree IDENT17_tree=null;

        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:66:2: ( 'choose' LEFT_PAREN i1= IDENT (i2= IDENT )+ RIGHT_PAREN | IDENT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==IDENT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:66:4: 'choose' LEFT_PAREN i1= IDENT (i2= IDENT )+ RIGHT_PAREN
                    {
                    root_0 = (CommenTree)adaptor.nil();


                    string_literal14=(Token)match(input,17,FOLLOW_17_in_action171); 
                    string_literal14_tree = 
                    (CommenTree)adaptor.create(string_literal14)
                    ;
                    adaptor.addChild(root_0, string_literal14_tree);


                    LEFT_PAREN15=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_action173); 
                    LEFT_PAREN15_tree = 
                    (CommenTree)adaptor.create(LEFT_PAREN15)
                    ;
                    adaptor.addChild(root_0, LEFT_PAREN15_tree);


                    i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_action177); 
                    i1_tree = 
                    (CommenTree)adaptor.create(i1)
                    ;
                    adaptor.addChild(root_0, i1_tree);


                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:66:35: (i2= IDENT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==IDENT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:66:35: i2= IDENT
                    	    {
                    	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_action181); 
                    	    i2_tree = 
                    	    (CommenTree)adaptor.create(i2)
                    	    ;
                    	    adaptor.addChild(root_0, i2_tree);


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


                    RIGHT_PAREN16=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_action184); 
                    RIGHT_PAREN16_tree = 
                    (CommenTree)adaptor.create(RIGHT_PAREN16)
                    ;
                    adaptor.addChild(root_0, RIGHT_PAREN16_tree);


                    }
                    break;
                case 2 :
                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:67:4: IDENT
                    {
                    root_0 = (CommenTree)adaptor.nil();


                    IDENT17=(Token)match(input,IDENT,FOLLOW_IDENT_in_action189); 
                    IDENT17_tree = 
                    (CommenTree)adaptor.create(IDENT17)
                    ;
                    adaptor.addChild(root_0, IDENT17_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommenTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommenTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "action"


    public static class condition_return extends ParserRuleReturnScope {
        public Condition condition;
        CommenTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:70:1: condition returns [Condition condition] : ( '(' c1= condition (op= AND |op= OR ) c2= condition ')' | IDENT );
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        CommenTree root_0 = null;

        Token op=null;
        Token char_literal18=null;
        Token char_literal19=null;
        Token IDENT20=null;
        SAFParser.condition_return c1 =null;

        SAFParser.condition_return c2 =null;


        CommenTree op_tree=null;
        CommenTree char_literal18_tree=null;
        CommenTree char_literal19_tree=null;
        CommenTree IDENT20_tree=null;

        try {
            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:71:5: ( '(' c1= condition (op= AND |op= OR ) c2= condition ')' | IDENT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LEFT_PAREN) ) {
                alt6=1;
            }
            else if ( (LA6_0==IDENT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:71:7: '(' c1= condition (op= AND |op= OR ) c2= condition ')'
                    {
                    root_0 = (CommenTree)adaptor.nil();


                    char_literal18=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_condition208); 
                    char_literal18_tree = 
                    (CommenTree)adaptor.create(char_literal18)
                    ;
                    adaptor.addChild(root_0, char_literal18_tree);


                    pushFollow(FOLLOW_condition_in_condition212);
                    c1=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, c1.getTree());

                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:71:24: (op= AND |op= OR )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==AND) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==OR) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:71:25: op= AND
                            {
                            op=(Token)match(input,AND,FOLLOW_AND_in_condition217); 
                            op_tree = 
                            (CommenTree)adaptor.create(op)
                            ;
                            adaptor.addChild(root_0, op_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:71:34: op= OR
                            {
                            op=(Token)match(input,OR,FOLLOW_OR_in_condition223); 
                            op_tree = 
                            (CommenTree)adaptor.create(op)
                            ;
                            adaptor.addChild(root_0, op_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_condition_in_condition228);
                    c2=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, c2.getTree());

                    char_literal19=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_condition230); 
                    char_literal19_tree = 
                    (CommenTree)adaptor.create(char_literal19)
                    ;
                    adaptor.addChild(root_0, char_literal19_tree);



                    	        if ((op!=null?op.getText():null).equals("and"))
                    	        {
                    	            retval.condition = new ConditionAnd($l1.condition, $l2.condition);
                    	        } 
                    	        else
                    	        {
                    	            retval.condition = new ConditionOr($l1.condition, $l2.condition);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // C:\\Werkmap\\Documenten\\School\\SoftwareConstruction\\svn\\koenhanselman\\EclipseWorkspace\\SAF Parser ANTLR\\src\\saf\\SAF.g:82:7: IDENT
                    {
                    root_0 = (CommenTree)adaptor.nil();


                    IDENT20=(Token)match(input,IDENT,FOLLOW_IDENT_in_condition245); 
                    IDENT20_tree = 
                    (CommenTree)adaptor.create(IDENT20)
                    ;
                    adaptor.addChild(root_0, IDENT20_tree);


                     retval.condition = new Condition((IDENT20!=null?IDENT20.getText():null)); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommenTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommenTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighter67 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LEFT_CURLY_in_fighter69 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_personality_in_fighter74 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_behaviour_in_fighter79 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RIGHT_CURLY_in_fighter83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_personality98 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENT_in_characteristic111 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_characteristic113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DIGIT_in_characteristic115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_behaviour130 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_condition_in_rule143 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACK_in_rule145 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_action_in_rule149 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_action_in_rule153 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_BRACK_in_rule155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_action171 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_action173 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_action177 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_action181 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_action184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_action189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_condition208 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_condition_in_condition212 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_AND_in_condition217 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_OR_in_condition223 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_condition_in_condition228 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_condition230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_condition245 = new BitSet(new long[]{0x0000000000000002L});

}