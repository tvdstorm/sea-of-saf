// $ANTLR 3.4 /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g 2012-01-23 10:21:27

  package SAF; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTRIBUTE", "CHOOSE", "CONDITIONTYPE", "DIGIT", "EQUALS", "FIGHTACTIONTYPE", "IDENT", "LEFT_BRACKET", "LEFT_CURLY", "LEFT_PAREN", "MOVEACTIONTYPE", "ONEDIGIT", "RIGHT_BRACKET", "RIGHT_CURLY", "RIGHT_PAREN", "WS"
    };

    public static final int EOF=-1;
    public static final int ATTRIBUTE=4;
    public static final int CHOOSE=5;
    public static final int CONDITIONTYPE=6;
    public static final int DIGIT=7;
    public static final int EQUALS=8;
    public static final int FIGHTACTIONTYPE=9;
    public static final int IDENT=10;
    public static final int LEFT_BRACKET=11;
    public static final int LEFT_CURLY=12;
    public static final int LEFT_PAREN=13;
    public static final int MOVEACTIONTYPE=14;
    public static final int ONEDIGIT=15;
    public static final int RIGHT_BRACKET=16;
    public static final int RIGHT_CURLY=17;
    public static final int RIGHT_PAREN=18;
    public static final int WS=19;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public FDLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public FDLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return FDLParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g"; }


    public static class fighter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fighter"
    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:16:1: fighter : ( ( ( IDENT )+ ) ^ LEFT_CURLY personality behaviour RIGHT_CURLY ) ^;
    public final FDLParser.fighter_return fighter() throws RecognitionException {
        FDLParser.fighter_return retval = new FDLParser.fighter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT1=null;
        Token LEFT_CURLY2=null;
        Token RIGHT_CURLY5=null;
        FDLParser.personality_return personality3 =null;

        FDLParser.behaviour_return behaviour4 =null;


        Object IDENT1_tree=null;
        Object LEFT_CURLY2_tree=null;
        Object RIGHT_CURLY5_tree=null;

        try {
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:17:2: ( ( ( ( IDENT )+ ) ^ LEFT_CURLY personality behaviour RIGHT_CURLY ) ^)
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:18:3: ( ( ( IDENT )+ ) ^ LEFT_CURLY personality behaviour RIGHT_CURLY ) ^
            {
            root_0 = (Object)adaptor.nil();


            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:18:3: ( ( ( IDENT )+ ) ^ LEFT_CURLY personality behaviour RIGHT_CURLY )
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:19:4: ( ( IDENT )+ ) ^ LEFT_CURLY personality behaviour RIGHT_CURLY
            {
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:19:4: ( ( IDENT )+ )
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:19:5: ( IDENT )+
            {
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:19:5: ( IDENT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:19:5: IDENT
            	    {
            	    IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fighter56); 
            	    IDENT1_tree = 
            	    (Object)adaptor.create(IDENT1)
            	    ;
            	    adaptor.addChild(root_0, IDENT1_tree);


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


            }


            LEFT_CURLY2=(Token)match(input,LEFT_CURLY,FOLLOW_LEFT_CURLY_in_fighter64); 
            LEFT_CURLY2_tree = 
            (Object)adaptor.create(LEFT_CURLY2)
            ;
            adaptor.addChild(root_0, LEFT_CURLY2_tree);


            pushFollow(FOLLOW_personality_in_fighter69);
            personality3=personality();

            state._fsp--;

            adaptor.addChild(root_0, personality3.getTree());

            pushFollow(FOLLOW_behaviour_in_fighter74);
            behaviour4=behaviour();

            state._fsp--;

            adaptor.addChild(root_0, behaviour4.getTree());

            RIGHT_CURLY5=(Token)match(input,RIGHT_CURLY,FOLLOW_RIGHT_CURLY_in_fighter79); 
            RIGHT_CURLY5_tree = 
            (Object)adaptor.create(RIGHT_CURLY5)
            ;
            adaptor.addChild(root_0, RIGHT_CURLY5_tree);


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
    // $ANTLR end "fighter"


    public static class personality_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "personality"
    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:28:1: personality : ( characteristic )* ;
    public final FDLParser.personality_return personality() throws RecognitionException {
        FDLParser.personality_return retval = new FDLParser.personality_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FDLParser.characteristic_return characteristic6 =null;



        try {
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:29:2: ( ( characteristic )* )
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:29:4: ( characteristic )*
            {
            root_0 = (Object)adaptor.nil();


            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:29:4: ( characteristic )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ATTRIBUTE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:29:4: characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_personality96);
            	    characteristic6=characteristic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, characteristic6.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
    // $ANTLR end "personality"


    public static class characteristic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:32:1: characteristic : ATTRIBUTE EQUALS ONEDIGIT ;
    public final FDLParser.characteristic_return characteristic() throws RecognitionException {
        FDLParser.characteristic_return retval = new FDLParser.characteristic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATTRIBUTE7=null;
        Token EQUALS8=null;
        Token ONEDIGIT9=null;

        Object ATTRIBUTE7_tree=null;
        Object EQUALS8_tree=null;
        Object ONEDIGIT9_tree=null;

        try {
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:33:2: ( ATTRIBUTE EQUALS ONEDIGIT )
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:33:4: ATTRIBUTE EQUALS ONEDIGIT
            {
            root_0 = (Object)adaptor.nil();


            ATTRIBUTE7=(Token)match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_characteristic108); 
            ATTRIBUTE7_tree = 
            (Object)adaptor.create(ATTRIBUTE7)
            ;
            adaptor.addChild(root_0, ATTRIBUTE7_tree);


            EQUALS8=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_characteristic110); 
            EQUALS8_tree = 
            (Object)adaptor.create(EQUALS8)
            ;
            adaptor.addChild(root_0, EQUALS8_tree);


            ONEDIGIT9=(Token)match(input,ONEDIGIT,FOLLOW_ONEDIGIT_in_characteristic112); 
            ONEDIGIT9_tree = 
            (Object)adaptor.create(ONEDIGIT9)
            ;
            adaptor.addChild(root_0, ONEDIGIT9_tree);


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
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behaviour"
    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:36:1: behaviour : ( rule )* ;
    public final FDLParser.behaviour_return behaviour() throws RecognitionException {
        FDLParser.behaviour_return retval = new FDLParser.behaviour_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        FDLParser.rule_return rule10 =null;



        try {
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:37:2: ( ( rule )* )
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:37:4: ( rule )*
            {
            root_0 = (Object)adaptor.nil();


            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:37:4: ( rule )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CONDITIONTYPE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:37:4: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_behaviour124);
            	    rule10=rule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rule10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // $ANTLR end "behaviour"


    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:40:1: rule : CONDITIONTYPE LEFT_BRACKET ( MOVEACTIONTYPE | chooseMoveActionType ) ( FIGHTACTIONTYPE | chooseFightActionType ) RIGHT_BRACKET ;
    public final FDLParser.rule_return rule() throws RecognitionException {
        FDLParser.rule_return retval = new FDLParser.rule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONDITIONTYPE11=null;
        Token LEFT_BRACKET12=null;
        Token MOVEACTIONTYPE13=null;
        Token FIGHTACTIONTYPE15=null;
        Token RIGHT_BRACKET17=null;
        FDLParser.chooseMoveActionType_return chooseMoveActionType14 =null;

        FDLParser.chooseFightActionType_return chooseFightActionType16 =null;


        Object CONDITIONTYPE11_tree=null;
        Object LEFT_BRACKET12_tree=null;
        Object MOVEACTIONTYPE13_tree=null;
        Object FIGHTACTIONTYPE15_tree=null;
        Object RIGHT_BRACKET17_tree=null;

        try {
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:41:2: ( CONDITIONTYPE LEFT_BRACKET ( MOVEACTIONTYPE | chooseMoveActionType ) ( FIGHTACTIONTYPE | chooseFightActionType ) RIGHT_BRACKET )
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:41:5: CONDITIONTYPE LEFT_BRACKET ( MOVEACTIONTYPE | chooseMoveActionType ) ( FIGHTACTIONTYPE | chooseFightActionType ) RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();


            CONDITIONTYPE11=(Token)match(input,CONDITIONTYPE,FOLLOW_CONDITIONTYPE_in_rule137); 
            CONDITIONTYPE11_tree = 
            (Object)adaptor.create(CONDITIONTYPE11)
            ;
            adaptor.addChild(root_0, CONDITIONTYPE11_tree);


            LEFT_BRACKET12=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_rule142); 
            LEFT_BRACKET12_tree = 
            (Object)adaptor.create(LEFT_BRACKET12)
            ;
            adaptor.addChild(root_0, LEFT_BRACKET12_tree);


            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:43:4: ( MOVEACTIONTYPE | chooseMoveActionType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==MOVEACTIONTYPE) ) {
                alt4=1;
            }
            else if ( (LA4_0==CHOOSE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:43:5: MOVEACTIONTYPE
                    {
                    MOVEACTIONTYPE13=(Token)match(input,MOVEACTIONTYPE,FOLLOW_MOVEACTIONTYPE_in_rule149); 
                    MOVEACTIONTYPE13_tree = 
                    (Object)adaptor.create(MOVEACTIONTYPE13)
                    ;
                    adaptor.addChild(root_0, MOVEACTIONTYPE13_tree);


                    }
                    break;
                case 2 :
                    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:43:22: chooseMoveActionType
                    {
                    pushFollow(FOLLOW_chooseMoveActionType_in_rule153);
                    chooseMoveActionType14=chooseMoveActionType();

                    state._fsp--;

                    adaptor.addChild(root_0, chooseMoveActionType14.getTree());

                    }
                    break;

            }


            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:43:44: ( FIGHTACTIONTYPE | chooseFightActionType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==FIGHTACTIONTYPE) ) {
                alt5=1;
            }
            else if ( (LA5_0==CHOOSE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:43:45: FIGHTACTIONTYPE
                    {
                    FIGHTACTIONTYPE15=(Token)match(input,FIGHTACTIONTYPE,FOLLOW_FIGHTACTIONTYPE_in_rule157); 
                    FIGHTACTIONTYPE15_tree = 
                    (Object)adaptor.create(FIGHTACTIONTYPE15)
                    ;
                    adaptor.addChild(root_0, FIGHTACTIONTYPE15_tree);


                    }
                    break;
                case 2 :
                    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:43:63: chooseFightActionType
                    {
                    pushFollow(FOLLOW_chooseFightActionType_in_rule161);
                    chooseFightActionType16=chooseFightActionType();

                    state._fsp--;

                    adaptor.addChild(root_0, chooseFightActionType16.getTree());

                    }
                    break;

            }


            RIGHT_BRACKET17=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_rule166); 
            RIGHT_BRACKET17_tree = 
            (Object)adaptor.create(RIGHT_BRACKET17)
            ;
            adaptor.addChild(root_0, RIGHT_BRACKET17_tree);


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
    // $ANTLR end "rule"


    public static class chooseFightActionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chooseFightActionType"
    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:47:1: chooseFightActionType : CHOOSE LEFT_PAREN ( FIGHTACTIONTYPE )+ RIGHT_PAREN ;
    public final FDLParser.chooseFightActionType_return chooseFightActionType() throws RecognitionException {
        FDLParser.chooseFightActionType_return retval = new FDLParser.chooseFightActionType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE18=null;
        Token LEFT_PAREN19=null;
        Token FIGHTACTIONTYPE20=null;
        Token RIGHT_PAREN21=null;

        Object CHOOSE18_tree=null;
        Object LEFT_PAREN19_tree=null;
        Object FIGHTACTIONTYPE20_tree=null;
        Object RIGHT_PAREN21_tree=null;

        try {
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:48:2: ( CHOOSE LEFT_PAREN ( FIGHTACTIONTYPE )+ RIGHT_PAREN )
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:48:4: CHOOSE LEFT_PAREN ( FIGHTACTIONTYPE )+ RIGHT_PAREN
            {
            root_0 = (Object)adaptor.nil();


            CHOOSE18=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_chooseFightActionType178); 
            CHOOSE18_tree = 
            (Object)adaptor.create(CHOOSE18)
            ;
            adaptor.addChild(root_0, CHOOSE18_tree);


            LEFT_PAREN19=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_chooseFightActionType183); 
            LEFT_PAREN19_tree = 
            (Object)adaptor.create(LEFT_PAREN19)
            ;
            adaptor.addChild(root_0, LEFT_PAREN19_tree);


            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:50:4: ( FIGHTACTIONTYPE )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==FIGHTACTIONTYPE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:50:4: FIGHTACTIONTYPE
            	    {
            	    FIGHTACTIONTYPE20=(Token)match(input,FIGHTACTIONTYPE,FOLLOW_FIGHTACTIONTYPE_in_chooseFightActionType189); 
            	    FIGHTACTIONTYPE20_tree = 
            	    (Object)adaptor.create(FIGHTACTIONTYPE20)
            	    ;
            	    adaptor.addChild(root_0, FIGHTACTIONTYPE20_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            RIGHT_PAREN21=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_chooseFightActionType195); 
            RIGHT_PAREN21_tree = 
            (Object)adaptor.create(RIGHT_PAREN21)
            ;
            adaptor.addChild(root_0, RIGHT_PAREN21_tree);


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
    // $ANTLR end "chooseFightActionType"


    public static class chooseMoveActionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chooseMoveActionType"
    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:54:1: chooseMoveActionType : CHOOSE LEFT_PAREN ( MOVEACTIONTYPE )+ RIGHT_PAREN ;
    public final FDLParser.chooseMoveActionType_return chooseMoveActionType() throws RecognitionException {
        FDLParser.chooseMoveActionType_return retval = new FDLParser.chooseMoveActionType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHOOSE22=null;
        Token LEFT_PAREN23=null;
        Token MOVEACTIONTYPE24=null;
        Token RIGHT_PAREN25=null;

        Object CHOOSE22_tree=null;
        Object LEFT_PAREN23_tree=null;
        Object MOVEACTIONTYPE24_tree=null;
        Object RIGHT_PAREN25_tree=null;

        try {
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:55:2: ( CHOOSE LEFT_PAREN ( MOVEACTIONTYPE )+ RIGHT_PAREN )
            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:55:4: CHOOSE LEFT_PAREN ( MOVEACTIONTYPE )+ RIGHT_PAREN
            {
            root_0 = (Object)adaptor.nil();


            CHOOSE22=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_chooseMoveActionType207); 
            CHOOSE22_tree = 
            (Object)adaptor.create(CHOOSE22)
            ;
            adaptor.addChild(root_0, CHOOSE22_tree);


            LEFT_PAREN23=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_chooseMoveActionType212); 
            LEFT_PAREN23_tree = 
            (Object)adaptor.create(LEFT_PAREN23)
            ;
            adaptor.addChild(root_0, LEFT_PAREN23_tree);


            // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:57:4: ( MOVEACTIONTYPE )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==MOVEACTIONTYPE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/jorrite/School/Software Construction/sea-of-saf/mrjorrit/src/SAF/FDL.g:57:4: MOVEACTIONTYPE
            	    {
            	    MOVEACTIONTYPE24=(Token)match(input,MOVEACTIONTYPE,FOLLOW_MOVEACTIONTYPE_in_chooseMoveActionType218); 
            	    MOVEACTIONTYPE24_tree = 
            	    (Object)adaptor.create(MOVEACTIONTYPE24)
            	    ;
            	    adaptor.addChild(root_0, MOVEACTIONTYPE24_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            RIGHT_PAREN25=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_chooseMoveActionType224); 
            RIGHT_PAREN25_tree = 
            (Object)adaptor.create(RIGHT_PAREN25)
            ;
            adaptor.addChild(root_0, RIGHT_PAREN25_tree);


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
    // $ANTLR end "chooseMoveActionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_fighter56 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_LEFT_CURLY_in_fighter64 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_personality_in_fighter69 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_behaviour_in_fighter74 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHT_CURLY_in_fighter79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_characteristic_in_personality96 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_characteristic108 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQUALS_in_characteristic110 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ONEDIGIT_in_characteristic112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_behaviour124 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CONDITIONTYPE_in_rule137 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_rule142 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_MOVEACTIONTYPE_in_rule149 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_chooseMoveActionType_in_rule153 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_FIGHTACTIONTYPE_in_rule157 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_chooseFightActionType_in_rule161 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_rule166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_chooseFightActionType178 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_chooseFightActionType183 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_FIGHTACTIONTYPE_in_chooseFightActionType189 = new BitSet(new long[]{0x0000000000040200L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_chooseFightActionType195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_chooseMoveActionType207 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_chooseMoveActionType212 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MOVEACTIONTYPE_in_chooseMoveActionType218 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_chooseMoveActionType224 = new BitSet(new long[]{0x0000000000000002L});

}