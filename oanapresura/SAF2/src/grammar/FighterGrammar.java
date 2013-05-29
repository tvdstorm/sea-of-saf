/* Generated By:JJTree&JavaCC: Do not edit this line. FighterGrammar.java */
package grammar;
import ast.*;
import interpreter.*;
import constants.*;
import visitor.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class FighterGrammar implements/*@bgen(jjtree)*/ FighterGrammarTreeConstants,CorrectValues, FighterGrammarConstants {/*@bgen(jjtree)*/
  protected static JJTFighterGrammarState jjtree = new JJTFighterGrammarState();
  private SAF saf;
  private Interpreter i;
  private VisitorTest vt;

  public FighterGrammar(){
  }

  //public static void main(String args [])
  public int run()
  {
    try{
                String file = "input.txt";
                InputStream input = new FileInputStream("input.txt");
                System.out.println("[Parser]Parsing from file ... ");
                FighterGrammar parser = new FighterGrammar(input);
                saf = parser.Parse();
                i = new Interpreter(saf.getBot1(), saf.getBot2());
                boolean result = i.interpret();
                vt = new VisitorTest();
                vt.startVisit(saf.getBot1(),saf.getBot2());
                if (result == true)
                        System.out.println("[Interpreter]Healthy fighters!");

                System.out.println("[Parser]Done!");
                return 0;
    }

        catch(Exception e)
        {
                System.out.println("[Parser]Oops! ");
                System.out.println(e.getMessage());
                e.printStackTrace();
        }
    return -1;
  }

public SAF getSaf() {
	return saf;
}

/** Root production. */
  static final public SAF Parse() throws ParseException {
 /*@bgen(jjtree) Parse */
        SimpleNode jjtn000 = new SimpleNode(JJTPARSE);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);Bot bot1;
        Bot bot2;
    try {
      bot1 = getBot();
      bot2 = getBot();
      jj_consume_token(0);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
                SAF saf = new SAF();
                saf.setBot1(bot1);
                saf.setBot2(bot2);
                {if (true) return saf;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static final public Bot getBot() throws ParseException {
 /*@bgen(jjtree) getBot */
        SimpleNode jjtn000 = new SimpleNode(JJTGETBOT);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);BehaviourItem i;
        Token name = new Token();
        Personality p = new Personality();
        Behaviour b = new Behaviour();
        Strength s = new Strength();
        Bot bot = new Bot();
    try {
      name = jj_consume_token(IDENTIFIER);
                  bot.setName(name.toString());
      jj_consume_token(LBRACE);
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        if (jj_2_1(2)) {
          s = Strength();
                    p.addStrength(s);
        } else {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case IDENTIFIER:
            i = BehaviourItem();
                    b.addCondition(i);
            break;
          default:
            jj_la1[1] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      }
      jj_consume_token(RBRACE);
                  bot.setBehaviour(b);
                  bot.setPersonality(p);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          {if (true) return bot;}
    } catch (Throwable jjte000) {
                  if (jjtc000) {
                    jjtree.clearNodeScope(jjtn000);
                    jjtc000 = false;
                  } else {
                    jjtree.popNode();
                  }
                  if (jjte000 instanceof RuntimeException) {
                    {if (true) throw (RuntimeException)jjte000;}
                  }
                  if (jjte000 instanceof ParseException) {
                    {if (true) throw (ParseException)jjte000;}
                  }
                  {if (true) throw (Error)jjte000;}
    } finally {
                  if (jjtc000) {
                    jjtree.closeNodeScope(jjtn000, true);
                  }
    }
    throw new Error("Missing return statement in function");
  }

  static final public Strength Strength() throws ParseException {
 /*@bgen(jjtree) Strength */
        SimpleNode jjtn000 = new SimpleNode(JJTSTRENGTH);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);Token strength = new Token();
        Token value = new Token();
    try {
      strength = jj_consume_token(IDENTIFIER);
      jj_consume_token(ASSIGN);
      value = jj_consume_token(VALUE);
           jjtree.closeNodeScope(jjtn000, true);
           jjtc000 = false;
                {if (true) return new Strength(strength.toString(), Integer.valueOf(value.toString()));}
    } finally {
           if (jjtc000) {
             jjtree.closeNodeScope(jjtn000, true);
           }
    }
    throw new Error("Missing return statement in function");
  }

  static final public BehaviourItem BehaviourItem() throws ParseException {
 /*@bgen(jjtree) BehaviourItem */
        SimpleNode jjtn000 = new SimpleNode(JJTBEHAVIOURITEM);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);Condition condition = new Condition();
        Action action1;
        Action action2;
    try {
      Condition(condition);
      jj_consume_token(LSQBRACKET);
      action1 = Action();
      action2 = Action();
      jj_consume_token(RSQBRACKET);
           jjtree.closeNodeScope(jjtn000, true);
           jjtc000 = false;
                action1.setFlag(CorrectValues.MOVE_TYPE);
                action2.setFlag(CorrectValues.ATTACK_TYPE);
                {if (true) return new BehaviourItem(condition, action1, action2);}
    } catch (Throwable jjte000) {
           if (jjtc000) {
             jjtree.clearNodeScope(jjtn000);
             jjtc000 = false;
           } else {
             jjtree.popNode();
           }
           if (jjte000 instanceof RuntimeException) {
             {if (true) throw (RuntimeException)jjte000;}
           }
           if (jjte000 instanceof ParseException) {
             {if (true) throw (ParseException)jjte000;}
           }
           {if (true) throw (Error)jjte000;}
    } finally {
           if (jjtc000) {
             jjtree.closeNodeScope(jjtn000, true);
           }
    }
    throw new Error("Missing return statement in function");
  }

  static final public void Condition(Condition c) throws ParseException {
 /*@bgen(jjtree) Condition */
        SimpleNode jjtn000 = new SimpleNode(JJTCONDITION);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);Token condition = new Token();
    try {
      condition = jj_consume_token(IDENTIFIER);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
                c.setCondition(condition.toString());
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  static final public Action Action() throws ParseException {
 /*@bgen(jjtree) Action */
        SimpleNode jjtn000 = new SimpleNode(JJTACTION);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);Action a;
        Token action = new Token();
        Token action1 = new Token();
        Token action2 = new Token();
        boolean choice;
    try {
      if (jj_2_2(2)) {
        jj_consume_token(CHOOSE);
        jj_consume_token(LBRACKET);
        action1 = jj_consume_token(IDENTIFIER);
        action2 = jj_consume_token(IDENTIFIER);
        jj_consume_token(RBRACKET);
                        choice = true;
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
          action = jj_consume_token(IDENTIFIER);
                        choice = false;
          break;
        default:
          jj_la1[2] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
                if (choice)
                {

                        a = new Action(action1.toString(),action2.toString());
                        /* System.out.println(action1.toString() + " " + action2.toString()); */
                }
                else
                {

                        a = new Action(action.toString());
                        /* System.out.println(action.toString()); */
                }
                {if (true) return a;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_3_1() {
    if (jj_3R_2()) return true;
    return false;
  }

  static private boolean jj_3_2() {
    if (jj_scan_token(CHOOSE)) return true;
    if (jj_scan_token(LBRACKET)) return true;
    return false;
  }

  static private boolean jj_3R_2() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(ASSIGN)) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public FighterGrammarTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[3];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x20000,0x20000,0x20000,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[2];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public FighterGrammar(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public FighterGrammar(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new FighterGrammarTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public FighterGrammar(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new FighterGrammarTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public FighterGrammar(FighterGrammarTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(FighterGrammarTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[19];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 3; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 19; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 2; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}