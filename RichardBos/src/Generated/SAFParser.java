// $ANTLR 3.4 C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g 2012-01-17 12:08:59

  package Generated;
  import SAF.Structure.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SAFParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHOOSE", "ID", "INT", "NEWLINE", "WS", "'('", "')'", "'='", "'['", "']'", "'and'", "'or'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int CHOOSE=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int NEWLINE=7;
    public static final int WS=8;

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
    public String getGrammarFileName() { return "C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g"; }


    /** Map variable name to Integer object holding value */
    Bots bots = new Bots();


    public static class bots_return extends ParserRuleReturnScope {
        public Bots bots;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bots"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:20:1: bots returns [Bots bots] : (b= bot )* ;
    public final SAFParser.bots_return bots() throws RecognitionException {
        SAFParser.bots_return retval = new SAFParser.bots_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.bot_return b =null;



        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:20:26: ( (b= bot )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:21:3: (b= bot )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:21:4: (b= bot )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:21:4: b= bot
            	    {
            	    pushFollow(FOLLOW_bot_in_bots53);
            	    b=bot();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


             retval.bots.ChildBots.add(b.bot); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bots"


    public static class bot_return extends ParserRuleReturnScope {
        public Bot bot;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bot"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:22:1: bot returns [Bot bot] : n= name ( NEWLINE )* '{' ( NEWLINE )* (b= behavior |c= characteristic )+ '}' ( NEWLINE )* ;
    public final SAFParser.bot_return bot() throws RecognitionException {
        SAFParser.bot_return retval = new SAFParser.bot_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEWLINE1=null;
        Token char_literal2=null;
        Token NEWLINE3=null;
        Token char_literal4=null;
        Token NEWLINE5=null;
        SAFParser.name_return n =null;

        SAFParser.behavior_return b =null;

        SAFParser.characteristic_return c =null;


        CommonTree NEWLINE1_tree=null;
        CommonTree char_literal2_tree=null;
        CommonTree NEWLINE3_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree NEWLINE5_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:22:22: (n= name ( NEWLINE )* '{' ( NEWLINE )* (b= behavior |c= characteristic )+ '}' ( NEWLINE )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:23:3: n= name ( NEWLINE )* '{' ( NEWLINE )* (b= behavior |c= characteristic )+ '}' ( NEWLINE )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_name_in_bot87);
            n=name();

            state._fsp--;

            adaptor.addChild(root_0, n.getTree());

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:23:10: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:23:10: NEWLINE
            	    {
            	    NEWLINE1=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_bot89); 
            	    NEWLINE1_tree = 
            	    (CommonTree)adaptor.create(NEWLINE1)
            	    ;
            	    adaptor.addChild(root_0, NEWLINE1_tree);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


             retval.bot.name = n.name; 

            char_literal2=(Token)match(input,16,FOLLOW_16_in_bot106); 
            char_literal2_tree = 
            (CommonTree)adaptor.create(char_literal2)
            ;
            adaptor.addChild(root_0, char_literal2_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:24:9: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:24:9: NEWLINE
            	    {
            	    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_bot108); 
            	    NEWLINE3_tree = 
            	    (CommonTree)adaptor.create(NEWLINE3)
            	    ;
            	    adaptor.addChild(root_0, NEWLINE3_tree);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:25:7: (b= behavior |c= characteristic )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:25:9: b= behavior
            	    {
            	    pushFollow(FOLLOW_behavior_in_bot123);
            	    b=behavior();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());

            	     retval.bot.Behavior.add(b.rule); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:26:9: c= characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_bot144);
            	    c=characteristic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, c.getTree());

            	     retval.bot.Characteristics.add(c.character); 

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


            char_literal4=(Token)match(input,17,FOLLOW_17_in_bot162); 
            char_literal4_tree = 
            (CommonTree)adaptor.create(char_literal4)
            ;
            adaptor.addChild(root_0, char_literal4_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:28:9: ( NEWLINE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==NEWLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:28:9: NEWLINE
            	    {
            	    NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_bot164); 
            	    NEWLINE5_tree = 
            	    (CommonTree)adaptor.create(NEWLINE5)
            	    ;
            	    adaptor.addChild(root_0, NEWLINE5_tree);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bot"


    public static class name_return extends ParserRuleReturnScope {
        public String name;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:30:1: name returns [String name] : ID (sn= subname )* ;
    public final SAFParser.name_return name() throws RecognitionException {
        SAFParser.name_return retval = new SAFParser.name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID6=null;
        SAFParser.subname_return sn =null;


        CommonTree ID6_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:30:27: ( ID (sn= subname )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:31:3: ID (sn= subname )*
            {
            root_0 = (CommonTree)adaptor.nil();


            ID6=(Token)match(input,ID,FOLLOW_ID_in_name182); 
            ID6_tree = 
            (CommonTree)adaptor.create(ID6)
            ;
            adaptor.addChild(root_0, ID6_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:31:8: (sn= subname )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= ID && LA6_0 <= INT)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:31:8: sn= subname
            	    {
            	    pushFollow(FOLLOW_subname_in_name186);
            	    sn=subname();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sn.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


             retval.name = (ID6!=null?ID6.getText():null) + (sn!=null?sn.name:null); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "name"


    public static class subname_return extends ParserRuleReturnScope {
        public String name;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subname"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:32:1: subname returns [String name] : ( ID | INT ) ;
    public final SAFParser.subname_return subname() throws RecognitionException {
        SAFParser.subname_return retval = new SAFParser.subname_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID7=null;
        Token INT8=null;

        CommonTree ID7_tree=null;
        CommonTree INT8_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:32:30: ( ( ID | INT ) )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:33:3: ( ID | INT )
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:33:3: ( ID | INT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:33:5: ID
                    {
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_subname212); 
                    ID7_tree = 
                    (CommonTree)adaptor.create(ID7)
                    ;
                    adaptor.addChild(root_0, ID7_tree);


                     retval.name = (ID7!=null?ID7.getText():null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:34:5: INT
                    {
                    INT8=(Token)match(input,INT,FOLLOW_INT_in_subname239); 
                    INT8_tree = 
                    (CommonTree)adaptor.create(INT8)
                    ;
                    adaptor.addChild(root_0, INT8_tree);


                     retval.name = (INT8!=null?INT8.getText():null); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subname"


    public static class characteristic_return extends ParserRuleReturnScope {
        public Characteristic character;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "characteristic"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:37:1: characteristic returns [Characteristic character] : ( WS )* ( ID )+ ( WS )* '=' ( WS )* INT NEWLINE ;
    public final SAFParser.characteristic_return characteristic() throws RecognitionException {
        SAFParser.characteristic_return retval = new SAFParser.characteristic_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WS9=null;
        Token ID10=null;
        Token WS11=null;
        Token char_literal12=null;
        Token WS13=null;
        Token INT14=null;
        Token NEWLINE15=null;

        CommonTree WS9_tree=null;
        CommonTree ID10_tree=null;
        CommonTree WS11_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree WS13_tree=null;
        CommonTree INT14_tree=null;
        CommonTree NEWLINE15_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:37:50: ( ( WS )* ( ID )+ ( WS )* '=' ( WS )* INT NEWLINE )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:38:3: ( WS )* ( ID )+ ( WS )* '=' ( WS )* INT NEWLINE
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:38:3: ( WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:38:3: WS
            	    {
            	    WS9=(Token)match(input,WS,FOLLOW_WS_in_characteristic279); 
            	    WS9_tree = 
            	    (CommonTree)adaptor.create(WS9)
            	    ;
            	    adaptor.addChild(root_0, WS9_tree);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:38:7: ( ID )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:38:7: ID
            	    {
            	    ID10=(Token)match(input,ID,FOLLOW_ID_in_characteristic282); 
            	    ID10_tree = 
            	    (CommonTree)adaptor.create(ID10)
            	    ;
            	    adaptor.addChild(root_0, ID10_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:38:11: ( WS )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==WS) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:38:11: WS
            	    {
            	    WS11=(Token)match(input,WS,FOLLOW_WS_in_characteristic285); 
            	    WS11_tree = 
            	    (CommonTree)adaptor.create(WS11)
            	    ;
            	    adaptor.addChild(root_0, WS11_tree);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            char_literal12=(Token)match(input,11,FOLLOW_11_in_characteristic288); 
            char_literal12_tree = 
            (CommonTree)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:38:19: ( WS )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:38:19: WS
            	    {
            	    WS13=(Token)match(input,WS,FOLLOW_WS_in_characteristic290); 
            	    WS13_tree = 
            	    (CommonTree)adaptor.create(WS13)
            	    ;
            	    adaptor.addChild(root_0, WS13_tree);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            INT14=(Token)match(input,INT,FOLLOW_INT_in_characteristic293); 
            INT14_tree = 
            (CommonTree)adaptor.create(INT14)
            ;
            adaptor.addChild(root_0, INT14_tree);


            NEWLINE15=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_characteristic295); 
            NEWLINE15_tree = 
            (CommonTree)adaptor.create(NEWLINE15)
            ;
            adaptor.addChild(root_0, NEWLINE15_tree);


             retval.character.Name = (ID10!=null?ID10.getText():null);
                                        retval.character.Value = Integer.parseInt((INT14!=null?INT14.getText():null));

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "characteristic"


    public static class behavior_return extends ParserRuleReturnScope {
        public BehaviorRule rule;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behavior"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:42:1: behavior returns [BehaviorRule rule] : ( WS )* c= condition '[' ( ( ID )+ | choose ) WS ( ( ID )+ | choose ) ']' NEWLINE ;
    public final SAFParser.behavior_return behavior() throws RecognitionException {
        SAFParser.behavior_return retval = new SAFParser.behavior_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WS16=null;
        Token char_literal17=null;
        Token ID18=null;
        Token WS20=null;
        Token ID21=null;
        Token char_literal23=null;
        Token NEWLINE24=null;
        SAFParser.condition_return c =null;

        SAFParser.choose_return choose19 =null;

        SAFParser.choose_return choose22 =null;


        CommonTree WS16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree ID18_tree=null;
        CommonTree WS20_tree=null;
        CommonTree ID21_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree NEWLINE24_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:42:37: ( ( WS )* c= condition '[' ( ( ID )+ | choose ) WS ( ( ID )+ | choose ) ']' NEWLINE )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:43:3: ( WS )* c= condition '[' ( ( ID )+ | choose ) WS ( ( ID )+ | choose ) ']' NEWLINE
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:43:3: ( WS )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==WS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:43:3: WS
            	    {
            	    WS16=(Token)match(input,WS,FOLLOW_WS_in_behavior336); 
            	    WS16_tree = 
            	    (CommonTree)adaptor.create(WS16)
            	    ;
            	    adaptor.addChild(root_0, WS16_tree);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            pushFollow(FOLLOW_condition_in_behavior341);
            c=condition();

            state._fsp--;

            adaptor.addChild(root_0, c.getTree());

            char_literal17=(Token)match(input,12,FOLLOW_12_in_behavior343); 
            char_literal17_tree = 
            (CommonTree)adaptor.create(char_literal17)
            ;
            adaptor.addChild(root_0, char_literal17_tree);


             retval.rule.condition = (c!=null?c.condition:null); 

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:44:3: ( ( ID )+ | choose )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==CHOOSE) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:44:4: ( ID )+
                    {
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:44:4: ( ID )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:44:4: ID
                    	    {
                    	    ID18=(Token)match(input,ID,FOLLOW_ID_in_behavior354); 
                    	    ID18_tree = 
                    	    (CommonTree)adaptor.create(ID18)
                    	    ;
                    	    adaptor.addChild(root_0, ID18_tree);


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
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:45:5: choose
                    {
                    pushFollow(FOLLOW_choose_in_behavior362);
                    choose19=choose();

                    state._fsp--;

                    adaptor.addChild(root_0, choose19.getTree());

                    }
                    break;

            }


            WS20=(Token)match(input,WS,FOLLOW_WS_in_behavior365); 
            WS20_tree = 
            (CommonTree)adaptor.create(WS20)
            ;
            adaptor.addChild(root_0, WS20_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:46:3: ( ( ID )+ | choose )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==CHOOSE) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:46:4: ( ID )+
                    {
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:46:4: ( ID )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:46:4: ID
                    	    {
                    	    ID21=(Token)match(input,ID,FOLLOW_ID_in_behavior371); 
                    	    ID21_tree = 
                    	    (CommonTree)adaptor.create(ID21)
                    	    ;
                    	    adaptor.addChild(root_0, ID21_tree);


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


                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:5: choose
                    {
                    pushFollow(FOLLOW_choose_in_behavior379);
                    choose22=choose();

                    state._fsp--;

                    adaptor.addChild(root_0, choose22.getTree());

                    }
                    break;

            }


            char_literal23=(Token)match(input,13,FOLLOW_13_in_behavior385); 
            char_literal23_tree = 
            (CommonTree)adaptor.create(char_literal23)
            ;
            adaptor.addChild(root_0, char_literal23_tree);


            NEWLINE24=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_behavior387); 
            NEWLINE24_tree = 
            (CommonTree)adaptor.create(NEWLINE24)
            ;
            adaptor.addChild(root_0, NEWLINE24_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "behavior"


    public static class condition_return extends ParserRuleReturnScope {
        public Condition condition;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:50:1: condition returns [Condition condition] : ID (c= conditionRule )* ;
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID25=null;
        SAFParser.conditionRule_return c =null;


        CommonTree ID25_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:50:40: ( ID (c= conditionRule )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:51:4: ID (c= conditionRule )*
            {
            root_0 = (CommonTree)adaptor.nil();


            ID25=(Token)match(input,ID,FOLLOW_ID_in_condition401); 
            ID25_tree = 
            (CommonTree)adaptor.create(ID25)
            ;
            adaptor.addChild(root_0, ID25_tree);


             retval.condition = new StringCondition((ID25!=null?ID25.getText():null));

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:52:4: (c= conditionRule )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:52:5: c= conditionRule
            	    {
            	    pushFollow(FOLLOW_conditionRule_in_condition432);
            	    c=conditionRule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, c.getTree());

            	     (c!=null?c.choiceCondition:null).condition = retval.condition;
            	                                 retval.condition = (c!=null?c.choiceCondition:null).condition;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class conditionRule_return extends ParserRuleReturnScope {
        public ChoiceCondition choiceCondition;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionRule"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:61:1: conditionRule returns [ChoiceCondition choiceCondition] : ( conditionTerm ( conditionRest )* ) ;
    public final SAFParser.conditionRule_return conditionRule() throws RecognitionException {
        SAFParser.conditionRule_return retval = new SAFParser.conditionRule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.conditionTerm_return conditionTerm26 =null;

        SAFParser.conditionRest_return conditionRest27 =null;



        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:61:56: ( ( conditionTerm ( conditionRest )* ) )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:62:3: ( conditionTerm ( conditionRest )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:62:3: ( conditionTerm ( conditionRest )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:63:5: conditionTerm ( conditionRest )*
            {
            pushFollow(FOLLOW_conditionTerm_in_conditionRule476);
            conditionTerm26=conditionTerm();

            state._fsp--;

            adaptor.addChild(root_0, conditionTerm26.getTree());

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:63:19: ( conditionRest )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:63:19: conditionRest
            	    {
            	    pushFollow(FOLLOW_conditionRest_in_conditionRule478);
            	    conditionRest27=conditionRest();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conditionRest27.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionRule"


    public static class conditionRest_return extends ParserRuleReturnScope {
        public Condition condition;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionRest"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:65:1: conditionRest returns [Condition condition] : ( WS )+ 'or' ( WS )+ ct= conditionTerm ;
    public final SAFParser.conditionRest_return conditionRest() throws RecognitionException {
        SAFParser.conditionRest_return retval = new SAFParser.conditionRest_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WS28=null;
        Token string_literal29=null;
        Token WS30=null;
        SAFParser.conditionTerm_return ct =null;


        CommonTree WS28_tree=null;
        CommonTree string_literal29_tree=null;
        CommonTree WS30_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:65:44: ( ( WS )+ 'or' ( WS )+ ct= conditionTerm )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:66:5: ( WS )+ 'or' ( WS )+ ct= conditionTerm
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:66:5: ( WS )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==WS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:66:5: WS
            	    {
            	    WS28=(Token)match(input,WS,FOLLOW_WS_in_conditionRest498); 
            	    WS28_tree = 
            	    (CommonTree)adaptor.create(WS28)
            	    ;
            	    adaptor.addChild(root_0, WS28_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            string_literal29=(Token)match(input,15,FOLLOW_15_in_conditionRest501); 
            string_literal29_tree = 
            (CommonTree)adaptor.create(string_literal29)
            ;
            adaptor.addChild(root_0, string_literal29_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:66:14: ( WS )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==WS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:66:14: WS
            	    {
            	    WS30=(Token)match(input,WS,FOLLOW_WS_in_conditionRest503); 
            	    WS30_tree = 
            	    (CommonTree)adaptor.create(WS30)
            	    ;
            	    adaptor.addChild(root_0, WS30_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            pushFollow(FOLLOW_conditionTerm_in_conditionRest508);
            ct=conditionTerm();

            state._fsp--;

            adaptor.addChild(root_0, ct.getTree());

             $choiceCondition = new ChoiceCondition(ChoiceCondition.ConditionType.AND, $ct.condition));

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionRest"


    public static class conditionTerm_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionTerm"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:68:1: conditionTerm : ( ID ( conditionTermRest )* ) ;
    public final SAFParser.conditionTerm_return conditionTerm() throws RecognitionException {
        SAFParser.conditionTerm_return retval = new SAFParser.conditionTerm_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID31=null;
        SAFParser.conditionTermRest_return conditionTermRest32 =null;


        CommonTree ID31_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:68:14: ( ( ID ( conditionTermRest )* ) )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:69:3: ( ID ( conditionTermRest )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:69:3: ( ID ( conditionTermRest )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:69:5: ID ( conditionTermRest )*
            {
            ID31=(Token)match(input,ID,FOLLOW_ID_in_conditionTerm521); 
            ID31_tree = 
            (CommonTree)adaptor.create(ID31)
            ;
            adaptor.addChild(root_0, ID31_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:69:8: ( conditionTermRest )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:69:8: conditionTermRest
            	    {
            	    pushFollow(FOLLOW_conditionTermRest_in_conditionTerm523);
            	    conditionTermRest32=conditionTermRest();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conditionTermRest32.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionTerm"


    public static class conditionTermRest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionTermRest"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:70:1: conditionTermRest : ( WS )+ 'and' ( WS )+ (id1= ID )+ ;
    public final SAFParser.conditionTermRest_return conditionTermRest() throws RecognitionException {
        SAFParser.conditionTermRest_return retval = new SAFParser.conditionTermRest_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token id1=null;
        Token WS33=null;
        Token string_literal34=null;
        Token WS35=null;

        CommonTree id1_tree=null;
        CommonTree WS33_tree=null;
        CommonTree string_literal34_tree=null;
        CommonTree WS35_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:70:18: ( ( WS )+ 'and' ( WS )+ (id1= ID )+ )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:71:5: ( WS )+ 'and' ( WS )+ (id1= ID )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:71:5: ( WS )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==WS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:71:5: WS
            	    {
            	    WS33=(Token)match(input,WS,FOLLOW_WS_in_conditionTermRest536); 
            	    WS33_tree = 
            	    (CommonTree)adaptor.create(WS33)
            	    ;
            	    adaptor.addChild(root_0, WS33_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            string_literal34=(Token)match(input,14,FOLLOW_14_in_conditionTermRest539); 
            string_literal34_tree = 
            (CommonTree)adaptor.create(string_literal34)
            ;
            adaptor.addChild(root_0, string_literal34_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:71:15: ( WS )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==WS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:71:15: WS
            	    {
            	    WS35=(Token)match(input,WS,FOLLOW_WS_in_conditionTermRest541); 
            	    WS35_tree = 
            	    (CommonTree)adaptor.create(WS35)
            	    ;
            	    adaptor.addChild(root_0, WS35_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:71:22: (id1= ID )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:71:22: id1= ID
            	    {
            	    id1=(Token)match(input,ID,FOLLOW_ID_in_conditionTermRest546); 
            	    id1_tree = 
            	    (CommonTree)adaptor.create(id1)
            	    ;
            	    adaptor.addChild(root_0, id1_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


             $choiceCondition = new ChoiceCondition(ChoiceCondition.ConditionType.OR, new StringCondition((id1!=null?id1.getText():null))); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionTermRest"


    public static class choose_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "choose"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:73:1: choose : CHOOSE '(' ( ID )+ ( chooseEnd )+ ')' ;
    public final SAFParser.choose_return choose() throws RecognitionException {
        SAFParser.choose_return retval = new SAFParser.choose_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CHOOSE36=null;
        Token char_literal37=null;
        Token ID38=null;
        Token char_literal40=null;
        SAFParser.chooseEnd_return chooseEnd39 =null;


        CommonTree CHOOSE36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree ID38_tree=null;
        CommonTree char_literal40_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:73:7: ( CHOOSE '(' ( ID )+ ( chooseEnd )+ ')' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:74:3: CHOOSE '(' ( ID )+ ( chooseEnd )+ ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            CHOOSE36=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_choose560); 
            CHOOSE36_tree = 
            (CommonTree)adaptor.create(CHOOSE36)
            ;
            adaptor.addChild(root_0, CHOOSE36_tree);


            char_literal37=(Token)match(input,9,FOLLOW_9_in_choose563); 
            char_literal37_tree = 
            (CommonTree)adaptor.create(char_literal37)
            ;
            adaptor.addChild(root_0, char_literal37_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:74:15: ( ID )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:74:15: ID
            	    {
            	    ID38=(Token)match(input,ID,FOLLOW_ID_in_choose565); 
            	    ID38_tree = 
            	    (CommonTree)adaptor.create(ID38)
            	    ;
            	    adaptor.addChild(root_0, ID38_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:74:20: ( chooseEnd )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==WS) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:74:21: chooseEnd
            	    {
            	    pushFollow(FOLLOW_chooseEnd_in_choose570);
            	    chooseEnd39=chooseEnd();

            	    state._fsp--;

            	    adaptor.addChild(root_0, chooseEnd39.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            char_literal40=(Token)match(input,10,FOLLOW_10_in_choose574); 
            char_literal40_tree = 
            (CommonTree)adaptor.create(char_literal40)
            ;
            adaptor.addChild(root_0, char_literal40_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "choose"


    public static class chooseEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chooseEnd"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:75:1: chooseEnd : WS ( ID )+ ;
    public final SAFParser.chooseEnd_return chooseEnd() throws RecognitionException {
        SAFParser.chooseEnd_return retval = new SAFParser.chooseEnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WS41=null;
        Token ID42=null;

        CommonTree WS41_tree=null;
        CommonTree ID42_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:75:10: ( WS ( ID )+ )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:3: WS ( ID )+
            {
            root_0 = (CommonTree)adaptor.nil();


            WS41=(Token)match(input,WS,FOLLOW_WS_in_chooseEnd582); 
            WS41_tree = 
            (CommonTree)adaptor.create(WS41)
            ;
            adaptor.addChild(root_0, WS41_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:6: ( ID )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:6: ID
            	    {
            	    ID42=(Token)match(input,ID,FOLLOW_ID_in_chooseEnd584); 
            	    ID42_tree = 
            	    (CommonTree)adaptor.create(ID42)
            	    ;
            	    adaptor.addChild(root_0, ID42_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "chooseEnd"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA4_eotS =
        "\10\uffff";
    static final String DFA4_eofS =
        "\10\uffff";
    static final String DFA4_minS =
        "\1\5\1\uffff\3\5\2\uffff\1\10";
    static final String DFA4_maxS =
        "\1\21\1\uffff\1\10\2\14\2\uffff\1\17";
    static final String DFA4_acceptS =
        "\1\uffff\1\3\3\uffff\1\1\1\2\1\uffff";
    static final String DFA4_specialS =
        "\10\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\2\uffff\1\2\10\uffff\1\1",
            "",
            "\1\3\2\uffff\1\2",
            "\1\4\2\uffff\1\6\2\uffff\1\6\1\5",
            "\1\4\2\uffff\1\7\2\uffff\1\6\1\5",
            "",
            "",
            "\1\7\2\uffff\1\6\2\uffff\2\5"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()+ loopback of 25:7: (b= behavior |c= characteristic )+";
        }
    }
    static final String DFA21_eotS =
        "\4\uffff";
    static final String DFA21_eofS =
        "\4\uffff";
    static final String DFA21_minS =
        "\1\5\1\10\2\uffff";
    static final String DFA21_maxS =
        "\1\14\1\17\2\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA21_specialS =
        "\4\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\2\uffff\1\1\3\uffff\1\2",
            "\1\1\5\uffff\1\3\1\2",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 69:8: ( conditionTermRest )*";
        }
    }
 

    public static final BitSet FOLLOW_bot_in_bots53 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_name_in_bot87 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_NEWLINE_in_bot89 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_16_in_bot106 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_NEWLINE_in_bot108 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_behavior_in_bot123 = new BitSet(new long[]{0x0000000000020120L});
    public static final BitSet FOLLOW_characteristic_in_bot144 = new BitSet(new long[]{0x0000000000020120L});
    public static final BitSet FOLLOW_17_in_bot162 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_NEWLINE_in_bot164 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_name182 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_subname_in_name186 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ID_in_subname212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_subname239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_characteristic279 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_ID_in_characteristic282 = new BitSet(new long[]{0x0000000000000920L});
    public static final BitSet FOLLOW_WS_in_characteristic285 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_11_in_characteristic288 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_WS_in_characteristic290 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_INT_in_characteristic293 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_characteristic295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_behavior336 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_condition_in_behavior341 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_behavior343 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ID_in_behavior354 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_choose_in_behavior362 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_behavior365 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ID_in_behavior371 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_choose_in_behavior379 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_behavior385 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_behavior387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_condition401 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_conditionRule_in_condition432 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_conditionTerm_in_conditionRule476 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_conditionRest_in_conditionRule478 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_WS_in_conditionRest498 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_15_in_conditionRest501 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_conditionRest503 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_conditionTerm_in_conditionRest508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_conditionTerm521 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_conditionTermRest_in_conditionTerm523 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_WS_in_conditionTermRest536 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_14_in_conditionTermRest539 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_conditionTermRest541 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_ID_in_conditionTermRest546 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_CHOOSE_in_choose560 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_choose563 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_choose565 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_chooseEnd_in_choose570 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_10_in_choose574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_chooseEnd582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_chooseEnd584 = new BitSet(new long[]{0x0000000000000022L});

}