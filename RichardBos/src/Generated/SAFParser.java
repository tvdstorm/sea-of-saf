// $ANTLR 3.4 C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g 2012-01-24 11:33:59

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CHAR", "CHOOSE", "DIGIT", "ID", "INT", "NEWLINE", "OR", "WHITESPACE", "WS", "'('", "')'", "'='", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int AND=4;
    public static final int CHAR=5;
    public static final int CHOOSE=6;
    public static final int DIGIT=7;
    public static final int ID=8;
    public static final int INT=9;
    public static final int NEWLINE=10;
    public static final int OR=11;
    public static final int WHITESPACE=12;
    public static final int WS=13;

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


    public static class bots_return extends ParserRuleReturnScope {
        public Bots bots;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bots"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:17:1: bots returns [Bots bots] : (b= bot )* ;
    public final SAFParser.bots_return bots() throws RecognitionException {
        SAFParser.bots_return retval = new SAFParser.bots_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SAFParser.bot_return b =null;



        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:17:26: ( (b= bot )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:17:41: (b= bot )*
            {
            root_0 = (CommonTree)adaptor.nil();


                 retval.bots = new Bots();
                                                    

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:19:3: (b= bot )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:19:4: b= bot
            	    {
            	    pushFollow(FOLLOW_bot_in_bots78);
            	    b=bot();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());

            	         retval.bots.getBots().add(b.bot); 
            	                                            

            	    }
            	    break;

            	default :
            	    break loop1;
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


            pushFollow(FOLLOW_name_in_bot130);
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
            	    NEWLINE1=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_bot132); 
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


                 retval.bot = new Bot(n.name); 
                                                    

            char_literal2=(Token)match(input,19,FOLLOW_19_in_bot163); 
            char_literal2_tree = 
            (CommonTree)adaptor.create(char_literal2)
            ;
            adaptor.addChild(root_0, char_literal2_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:25:9: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:25:9: NEWLINE
            	    {
            	    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_bot165); 
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


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:26:7: (b= behavior |c= characteristic )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:26:9: b= behavior
            	    {
            	    pushFollow(FOLLOW_behavior_in_bot180);
            	    b=behavior();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());

            	         retval.bot.getBehaviors().add(b.behavior); 
            	                                            

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:28:9: c= characteristic
            	    {
            	    pushFollow(FOLLOW_characteristic_in_bot215);
            	    c=characteristic();

            	    state._fsp--;

            	    adaptor.addChild(root_0, c.getTree());

            	         retval.bot.getCharacteristics().add(c.character); 
            	                                            

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


            char_literal4=(Token)match(input,20,FOLLOW_20_in_bot247); 
            char_literal4_tree = 
            (CommonTree)adaptor.create(char_literal4)
            ;
            adaptor.addChild(root_0, char_literal4_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:31:9: ( NEWLINE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==NEWLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:31:9: NEWLINE
            	    {
            	    NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_bot249); 
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
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:33:1: name returns [String name] : ID (sn= subname )* ;
    public final SAFParser.name_return name() throws RecognitionException {
        SAFParser.name_return retval = new SAFParser.name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID6=null;
        SAFParser.subname_return sn =null;


        CommonTree ID6_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:33:27: ( ID (sn= subname )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:34:3: ID (sn= subname )*
            {
            root_0 = (CommonTree)adaptor.nil();


            ID6=(Token)match(input,ID,FOLLOW_ID_in_name267); 
            ID6_tree = 
            (CommonTree)adaptor.create(ID6)
            ;
            adaptor.addChild(root_0, ID6_tree);


                 retval.name = (ID6!=null?ID6.getText():null);
                                                    

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:36:3: (sn= subname )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= ID && LA6_0 <= INT)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:36:4: sn= subname
            	    {
            	    pushFollow(FOLLOW_subname_in_name311);
            	    sn=subname();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sn.getTree());

            	         retval.name += (sn!=null?sn.name:null);
            	                                            

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "name"


    public static class subname_return extends ParserRuleReturnScope {
        public String name;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subname"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:39:1: subname returns [String name] : ( ID | INT ) ;
    public final SAFParser.subname_return subname() throws RecognitionException {
        SAFParser.subname_return retval = new SAFParser.subname_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID7=null;
        Token INT8=null;

        CommonTree ID7_tree=null;
        CommonTree INT8_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:39:30: ( ( ID | INT ) )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:40:3: ( ID | INT )
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:40:3: ( ID | INT )
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
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:40:5: ID
                    {
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_subname358); 
                    ID7_tree = 
                    (CommonTree)adaptor.create(ID7)
                    ;
                    adaptor.addChild(root_0, ID7_tree);


                         retval.name = (ID7!=null?ID7.getText():null); 
                                                            

                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:42:5: INT
                    {
                    INT8=(Token)match(input,INT,FOLLOW_INT_in_subname399); 
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
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:46:1: characteristic returns [Characteristic character] : ( WS )* ( ID )+ ( WS )* '=' ( WS )* INT NEWLINE ;
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
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:46:50: ( ( WS )* ( ID )+ ( WS )* '=' ( WS )* INT NEWLINE )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:3: ( WS )* ( ID )+ ( WS )* '=' ( WS )* INT NEWLINE
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:3: ( WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:3: WS
            	    {
            	    WS9=(Token)match(input,WS,FOLLOW_WS_in_characteristic450); 
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


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:7: ( ID )+
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
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:7: ID
            	    {
            	    ID10=(Token)match(input,ID,FOLLOW_ID_in_characteristic453); 
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


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:11: ( WS )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==WS) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:11: WS
            	    {
            	    WS11=(Token)match(input,WS,FOLLOW_WS_in_characteristic456); 
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


            char_literal12=(Token)match(input,16,FOLLOW_16_in_characteristic459); 
            char_literal12_tree = 
            (CommonTree)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:19: ( WS )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:47:19: WS
            	    {
            	    WS13=(Token)match(input,WS,FOLLOW_WS_in_characteristic461); 
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


            INT14=(Token)match(input,INT,FOLLOW_INT_in_characteristic464); 
            INT14_tree = 
            (CommonTree)adaptor.create(INT14)
            ;
            adaptor.addChild(root_0, INT14_tree);


            NEWLINE15=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_characteristic466); 
            NEWLINE15_tree = 
            (CommonTree)adaptor.create(NEWLINE15)
            ;
            adaptor.addChild(root_0, NEWLINE15_tree);


                 retval.character = new Characteristic((ID10!=null?ID10.getText():null));
                                                          retval.character.setValue(Integer.parseInt((INT14!=null?INT14.getText():null)));
                                                    

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
        public Behavior behavior;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "behavior"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:51:1: behavior returns [Behavior behavior] : ( WS )* c= condition '[' (id1= ID |c1= chooseMove ) WS (id2= ID |c2= chooseFight ) ']' NEWLINE ;
    public final SAFParser.behavior_return behavior() throws RecognitionException {
        SAFParser.behavior_return retval = new SAFParser.behavior_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token id1=null;
        Token id2=null;
        Token WS16=null;
        Token char_literal17=null;
        Token WS18=null;
        Token char_literal19=null;
        Token NEWLINE20=null;
        SAFParser.condition_return c =null;

        SAFParser.chooseMove_return c1 =null;

        SAFParser.chooseFight_return c2 =null;


        CommonTree id1_tree=null;
        CommonTree id2_tree=null;
        CommonTree WS16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree WS18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree NEWLINE20_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:51:37: ( ( WS )* c= condition '[' (id1= ID |c1= chooseMove ) WS (id2= ID |c2= chooseFight ) ']' NEWLINE )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:52:3: ( WS )* c= condition '[' (id1= ID |c1= chooseMove ) WS (id2= ID |c2= chooseFight ) ']' NEWLINE
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:52:3: ( WS )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==WS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:52:3: WS
            	    {
            	    WS16=(Token)match(input,WS,FOLLOW_WS_in_behavior487); 
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


            pushFollow(FOLLOW_condition_in_behavior492);
            c=condition();

            state._fsp--;

            adaptor.addChild(root_0, c.getTree());

            char_literal17=(Token)match(input,17,FOLLOW_17_in_behavior494); 
            char_literal17_tree = 
            (CommonTree)adaptor.create(char_literal17)
            ;
            adaptor.addChild(root_0, char_literal17_tree);


                 retval.behavior = new Behavior();
                                                          retval.behavior.setCondition((c!=null?c.condition:null)); 
                                                    

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:55:3: (id1= ID |c1= chooseMove )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==CHOOSE) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:55:5: id1= ID
                    {
                    id1=(Token)match(input,ID,FOLLOW_ID_in_behavior524); 
                    id1_tree = 
                    (CommonTree)adaptor.create(id1)
                    ;
                    adaptor.addChild(root_0, id1_tree);


                         retval.behavior.setMoveAction(new Action(new MoveAction((id1!=null?id1.getText():null))));
                                                            

                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:57:5: c1= chooseMove
                    {
                    pushFollow(FOLLOW_chooseMove_in_behavior564);
                    c1=chooseMove();

                    state._fsp--;

                    adaptor.addChild(root_0, c1.getTree());

                         retval.behavior.setMoveAction((c1!=null?c1.action:null));
                                                            

                    }
                    break;

            }


            WS18=(Token)match(input,WS,FOLLOW_WS_in_behavior591); 
            WS18_tree = 
            (CommonTree)adaptor.create(WS18)
            ;
            adaptor.addChild(root_0, WS18_tree);


            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:60:3: (id2= ID |c2= chooseFight )
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
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:60:5: id2= ID
                    {
                    id2=(Token)match(input,ID,FOLLOW_ID_in_behavior601); 
                    id2_tree = 
                    (CommonTree)adaptor.create(id2)
                    ;
                    adaptor.addChild(root_0, id2_tree);


                         retval.behavior.setFightAction(new Action(new FightAction((id2!=null?id2.getText():null))));
                                                            

                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:62:5: c2= chooseFight
                    {
                    pushFollow(FOLLOW_chooseFight_in_behavior641);
                    c2=chooseFight();

                    state._fsp--;

                    adaptor.addChild(root_0, c2.getTree());

                         retval.behavior.setFightAction((c2!=null?c2.action:null));
                                                            

                    }
                    break;

            }


            char_literal19=(Token)match(input,18,FOLLOW_18_in_behavior669); 
            char_literal19_tree = 
            (CommonTree)adaptor.create(char_literal19)
            ;
            adaptor.addChild(root_0, char_literal19_tree);


            NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_behavior671); 
            NEWLINE20_tree = 
            (CommonTree)adaptor.create(NEWLINE20)
            ;
            adaptor.addChild(root_0, NEWLINE20_tree);


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


    public static class chooseMove_return extends ParserRuleReturnScope {
        public Action action;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chooseMove"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:67:1: chooseMove returns [Action action] : CHOOSE '(' ( ( WS )* ID )+ ')' ;
    public final SAFParser.chooseMove_return chooseMove() throws RecognitionException {
        SAFParser.chooseMove_return retval = new SAFParser.chooseMove_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CHOOSE21=null;
        Token char_literal22=null;
        Token WS23=null;
        Token ID24=null;
        Token char_literal25=null;

        CommonTree CHOOSE21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree WS23_tree=null;
        CommonTree ID24_tree=null;
        CommonTree char_literal25_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:67:35: ( CHOOSE '(' ( ( WS )* ID )+ ')' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:68:3: CHOOSE '(' ( ( WS )* ID )+ ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            CHOOSE21=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_chooseMove684); 
            CHOOSE21_tree = 
            (CommonTree)adaptor.create(CHOOSE21)
            ;
            adaptor.addChild(root_0, CHOOSE21_tree);


            char_literal22=(Token)match(input,14,FOLLOW_14_in_chooseMove687); 
            char_literal22_tree = 
            (CommonTree)adaptor.create(char_literal22)
            ;
            adaptor.addChild(root_0, char_literal22_tree);


                 retval.action = new Action();
                                                    

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:70:3: ( ( WS )* ID )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==ID||LA16_0==WS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:71:5: ( WS )* ID
            	    {
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:71:5: ( WS )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==WS) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:71:5: WS
            	    	    {
            	    	    WS23=(Token)match(input,WS,FOLLOW_WS_in_chooseMove725); 
            	    	    WS23_tree = 
            	    	    (CommonTree)adaptor.create(WS23)
            	    	    ;
            	    	    adaptor.addChild(root_0, WS23_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);


            	    ID24=(Token)match(input,ID,FOLLOW_ID_in_chooseMove728); 
            	    ID24_tree = 
            	    (CommonTree)adaptor.create(ID24)
            	    ;
            	    adaptor.addChild(root_0, ID24_tree);


            	         retval.action.getValues().add(new MoveAction((ID24!=null?ID24.getText():null))); 
            	                                            

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            char_literal25=(Token)match(input,15,FOLLOW_15_in_chooseMove768); 
            char_literal25_tree = 
            (CommonTree)adaptor.create(char_literal25)
            ;
            adaptor.addChild(root_0, char_literal25_tree);


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
    // $ANTLR end "chooseMove"


    public static class chooseFight_return extends ParserRuleReturnScope {
        public Action action;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chooseFight"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:1: chooseFight returns [Action action] : CHOOSE '(' ( ( WS )* ID )+ ')' ;
    public final SAFParser.chooseFight_return chooseFight() throws RecognitionException {
        SAFParser.chooseFight_return retval = new SAFParser.chooseFight_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CHOOSE26=null;
        Token char_literal27=null;
        Token WS28=null;
        Token ID29=null;
        Token char_literal30=null;

        CommonTree CHOOSE26_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree WS28_tree=null;
        CommonTree ID29_tree=null;
        CommonTree char_literal30_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:76:36: ( CHOOSE '(' ( ( WS )* ID )+ ')' )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:77:3: CHOOSE '(' ( ( WS )* ID )+ ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            CHOOSE26=(Token)match(input,CHOOSE,FOLLOW_CHOOSE_in_chooseFight781); 
            CHOOSE26_tree = 
            (CommonTree)adaptor.create(CHOOSE26)
            ;
            adaptor.addChild(root_0, CHOOSE26_tree);


            char_literal27=(Token)match(input,14,FOLLOW_14_in_chooseFight784); 
            char_literal27_tree = 
            (CommonTree)adaptor.create(char_literal27)
            ;
            adaptor.addChild(root_0, char_literal27_tree);


                 retval.action = new Action();
                                                    

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:79:3: ( ( WS )* ID )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ID||LA18_0==WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:80:5: ( WS )* ID
            	    {
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:80:5: ( WS )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==WS) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:80:5: WS
            	    	    {
            	    	    WS28=(Token)match(input,WS,FOLLOW_WS_in_chooseFight822); 
            	    	    WS28_tree = 
            	    	    (CommonTree)adaptor.create(WS28)
            	    	    ;
            	    	    adaptor.addChild(root_0, WS28_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);


            	    ID29=(Token)match(input,ID,FOLLOW_ID_in_chooseFight825); 
            	    ID29_tree = 
            	    (CommonTree)adaptor.create(ID29)
            	    ;
            	    adaptor.addChild(root_0, ID29_tree);


            	         retval.action.getValues().add(new FightAction((ID29!=null?ID29.getText():null))); 
            	                                            

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            char_literal30=(Token)match(input,15,FOLLOW_15_in_chooseFight865); 
            char_literal30_tree = 
            (CommonTree)adaptor.create(char_literal30)
            ;
            adaptor.addChild(root_0, char_literal30_tree);


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
    // $ANTLR end "chooseFight"


    public static class condition_return extends ParserRuleReturnScope {
        public Condition condition;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:85:1: condition returns [Condition condition] : cr1= conditionRule ( OR WS cr2= conditionRule )* ;
    public final SAFParser.condition_return condition() throws RecognitionException {
        SAFParser.condition_return retval = new SAFParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR31=null;
        Token WS32=null;
        SAFParser.conditionRule_return cr1 =null;

        SAFParser.conditionRule_return cr2 =null;


        CommonTree OR31_tree=null;
        CommonTree WS32_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:85:40: (cr1= conditionRule ( OR WS cr2= conditionRule )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:86:4: cr1= conditionRule ( OR WS cr2= conditionRule )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionRule_in_condition881);
            cr1=conditionRule();

            state._fsp--;

            adaptor.addChild(root_0, cr1.getTree());

                 retval.condition = (cr1!=null?cr1.condition:null);
                                                    

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:88:4: ( OR WS cr2= conditionRule )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==OR) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:88:6: OR WS cr2= conditionRule
            	    {
            	    OR31=(Token)match(input,OR,FOLLOW_OR_in_condition909); 
            	    OR31_tree = 
            	    (CommonTree)adaptor.create(OR31)
            	    ;
            	    adaptor.addChild(root_0, OR31_tree);


            	    WS32=(Token)match(input,WS,FOLLOW_WS_in_condition911); 
            	    WS32_tree = 
            	    (CommonTree)adaptor.create(WS32)
            	    ;
            	    adaptor.addChild(root_0, WS32_tree);


            	    pushFollow(FOLLOW_conditionRule_in_condition915);
            	    cr2=conditionRule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cr2.getTree());

            	         ChoiceCondition cc = new ChoiceCondition(ChoiceCondition.ChoiceType.OR);
            	                                                  cc.setCondition((cr1!=null?cr1.condition:null));
            	                                                  cc.setSecondCondition((cr2!=null?cr2.condition:null));
            	                                                  retval.condition = cc;
            	                                            

            	    }
            	    break;

            	default :
            	    break loop19;
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
        public Condition condition;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionRule"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:95:1: conditionRule returns [Condition condition] : v1= var ( AND WS v2= var )* ;
    public final SAFParser.conditionRule_return conditionRule() throws RecognitionException {
        SAFParser.conditionRule_return retval = new SAFParser.conditionRule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND33=null;
        Token WS34=null;
        SAFParser.var_return v1 =null;

        SAFParser.var_return v2 =null;


        CommonTree AND33_tree=null;
        CommonTree WS34_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:95:44: (v1= var ( AND WS v2= var )* )
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:96:4: v1= var ( AND WS v2= var )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_var_in_conditionRule953);
            v1=var();

            state._fsp--;

            adaptor.addChild(root_0, v1.getTree());

                 retval.condition = (v1!=null?v1._condition:null);
                                                    

            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:98:4: ( AND WS v2= var )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AND) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:98:6: AND WS v2= var
            	    {
            	    AND33=(Token)match(input,AND,FOLLOW_AND_in_conditionRule992); 
            	    AND33_tree = 
            	    (CommonTree)adaptor.create(AND33)
            	    ;
            	    adaptor.addChild(root_0, AND33_tree);


            	    WS34=(Token)match(input,WS,FOLLOW_WS_in_conditionRule994); 
            	    WS34_tree = 
            	    (CommonTree)adaptor.create(WS34)
            	    ;
            	    adaptor.addChild(root_0, WS34_tree);


            	    pushFollow(FOLLOW_var_in_conditionRule998);
            	    v2=var();

            	    state._fsp--;

            	    adaptor.addChild(root_0, v2.getTree());

            	         ChoiceCondition cc = new ChoiceCondition(ChoiceCondition.ChoiceType.AND);
            	                                                  cc.setCondition(retval.condition);
            	                                                  cc.setSecondCondition((v2!=null?v2._condition:null));
            	    							                                retval.condition = cc;    
            	    							                          

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "conditionRule"


    public static class var_return extends ParserRuleReturnScope {
        public Condition _condition;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var"
    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:105:1: var returns [Condition _condition] : ( ID ( WS )* | '(' ( WS )* c= condition ( WS )* ')' ( WS )* );
    public final SAFParser.var_return var() throws RecognitionException {
        SAFParser.var_return retval = new SAFParser.var_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID35=null;
        Token WS36=null;
        Token char_literal37=null;
        Token WS38=null;
        Token WS39=null;
        Token char_literal40=null;
        Token WS41=null;
        SAFParser.condition_return c =null;


        CommonTree ID35_tree=null;
        CommonTree WS36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree WS38_tree=null;
        CommonTree WS39_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree WS41_tree=null;

        try {
            // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:105:35: ( ID ( WS )* | '(' ( WS )* c= condition ( WS )* ')' ( WS )* )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==14) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:106:4: ID ( WS )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID35=(Token)match(input,ID,FOLLOW_ID_in_var1044); 
                    ID35_tree = 
                    (CommonTree)adaptor.create(ID35)
                    ;
                    adaptor.addChild(root_0, ID35_tree);


                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:106:7: ( WS )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==WS) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:106:7: WS
                    	    {
                    	    WS36=(Token)match(input,WS,FOLLOW_WS_in_var1046); 
                    	    WS36_tree = 
                    	    (CommonTree)adaptor.create(WS36)
                    	    ;
                    	    adaptor.addChild(root_0, WS36_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                         retval._condition = new StringCondition((ID35!=null?ID35.getText():null));   
                                                            

                    }
                    break;
                case 2 :
                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:108:6: '(' ( WS )* c= condition ( WS )* ')' ( WS )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal37=(Token)match(input,14,FOLLOW_14_in_var1086); 
                    char_literal37_tree = 
                    (CommonTree)adaptor.create(char_literal37)
                    ;
                    adaptor.addChild(root_0, char_literal37_tree);


                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:108:10: ( WS )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==WS) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:108:10: WS
                    	    {
                    	    WS38=(Token)match(input,WS,FOLLOW_WS_in_var1088); 
                    	    WS38_tree = 
                    	    (CommonTree)adaptor.create(WS38)
                    	    ;
                    	    adaptor.addChild(root_0, WS38_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    pushFollow(FOLLOW_condition_in_var1093);
                    c=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, c.getTree());

                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:108:26: ( WS )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==WS) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:108:26: WS
                    	    {
                    	    WS39=(Token)match(input,WS,FOLLOW_WS_in_var1095); 
                    	    WS39_tree = 
                    	    (CommonTree)adaptor.create(WS39)
                    	    ;
                    	    adaptor.addChild(root_0, WS39_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    char_literal40=(Token)match(input,15,FOLLOW_15_in_var1098); 
                    char_literal40_tree = 
                    (CommonTree)adaptor.create(char_literal40)
                    ;
                    adaptor.addChild(root_0, char_literal40_tree);


                    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:108:34: ( WS )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==WS) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\Grammar\\SAF.g:108:34: WS
                    	    {
                    	    WS41=(Token)match(input,WS,FOLLOW_WS_in_var1100); 
                    	    WS41_tree = 
                    	    (CommonTree)adaptor.create(WS41)
                    	    ;
                    	    adaptor.addChild(root_0, WS41_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                         retval._condition = (c!=null?c.condition:null);    
                                                            

                    }
                    break;

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
    // $ANTLR end "var"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\7\uffff";
    static final String DFA4_eofS =
        "\7\uffff";
    static final String DFA4_minS =
        "\1\10\1\uffff\1\10\1\4\1\uffff\1\4\1\uffff";
    static final String DFA4_maxS =
        "\1\24\1\uffff\1\16\1\21\1\uffff\1\21\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\3\2\uffff\1\1\1\uffff\1\2";
    static final String DFA4_specialS =
        "\7\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\4\uffff\1\2\1\4\5\uffff\1\1",
            "",
            "\1\3\4\uffff\1\2\1\4",
            "\1\4\3\uffff\1\6\2\uffff\1\4\1\uffff\1\5\2\uffff\1\6\1\4",
            "",
            "\1\4\6\uffff\1\4\1\uffff\1\5\2\uffff\1\6\1\4",
            ""
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
            return "()+ loopback of 26:7: (b= behavior |c= characteristic )+";
        }
    }
 

    public static final BitSet FOLLOW_bot_in_bots78 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_name_in_bot130 = new BitSet(new long[]{0x0000000000080400L});
    public static final BitSet FOLLOW_NEWLINE_in_bot132 = new BitSet(new long[]{0x0000000000080400L});
    public static final BitSet FOLLOW_19_in_bot163 = new BitSet(new long[]{0x0000000000006500L});
    public static final BitSet FOLLOW_NEWLINE_in_bot165 = new BitSet(new long[]{0x0000000000006500L});
    public static final BitSet FOLLOW_behavior_in_bot180 = new BitSet(new long[]{0x0000000000106100L});
    public static final BitSet FOLLOW_characteristic_in_bot215 = new BitSet(new long[]{0x0000000000106100L});
    public static final BitSet FOLLOW_20_in_bot247 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_NEWLINE_in_bot249 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ID_in_name267 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_subname_in_name311 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_ID_in_subname358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_subname399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_characteristic450 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_ID_in_characteristic453 = new BitSet(new long[]{0x0000000000012100L});
    public static final BitSet FOLLOW_WS_in_characteristic456 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_characteristic459 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_WS_in_characteristic461 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_INT_in_characteristic464 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_characteristic466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_behavior487 = new BitSet(new long[]{0x0000000000006100L});
    public static final BitSet FOLLOW_condition_in_behavior492 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_behavior494 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_ID_in_behavior524 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_chooseMove_in_behavior564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_WS_in_behavior591 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_ID_in_behavior601 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_chooseFight_in_behavior641 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_behavior669 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NEWLINE_in_behavior671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_chooseMove684 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_chooseMove687 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_WS_in_chooseMove725 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_ID_in_chooseMove728 = new BitSet(new long[]{0x000000000000A100L});
    public static final BitSet FOLLOW_15_in_chooseMove768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOOSE_in_chooseFight781 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_chooseFight784 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_WS_in_chooseFight822 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_ID_in_chooseFight825 = new BitSet(new long[]{0x000000000000A100L});
    public static final BitSet FOLLOW_15_in_chooseFight865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionRule_in_condition881 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_OR_in_condition909 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_WS_in_condition911 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_conditionRule_in_condition915 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_var_in_conditionRule953 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_conditionRule992 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_WS_in_conditionRule994 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_var_in_conditionRule998 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ID_in_var1044 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_WS_in_var1046 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_14_in_var1086 = new BitSet(new long[]{0x0000000000006100L});
    public static final BitSet FOLLOW_WS_in_var1088 = new BitSet(new long[]{0x0000000000006100L});
    public static final BitSet FOLLOW_condition_in_var1093 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_WS_in_var1095 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_var1098 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_WS_in_var1100 = new BitSet(new long[]{0x0000000000002002L});

}