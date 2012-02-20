/* Generated By:JavaCC: Do not edit this line. Saf.java */
package saf.parser;

import java.util.List;
import java.util.ArrayList;

import saf.ast.*;

public class Saf implements SafConstants {

  final public List<Fighter> Parse() throws ParseException {
        ArrayList<Fighter> fighters = new ArrayList<Fighter>();
        Fighter fighter = new Fighter();

        Token fighterName = new Token();
        Strength fighterStrength = new Strength();
        List<Behavior> fighterBehaviors = new ArrayList<Behavior>();
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
      fighterName = jj_consume_token(IDENTIFIER);
                                       fighter = new Fighter(fighterName.toString());
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
        fighterName = jj_consume_token(IDENTIFIER);
                                       fighter.appendName(fighterName.toString());
      }
      jj_consume_token(OPENCURLYBRACKET);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[2] = jj_gen;
          break label_3;
        }
        if (jj_2_1(2)) {
          fighterStrength = Strength();
                                                     fighter.addStrength(fighterStrength);
        } else {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case IDENTIFIER:
            fighterBehaviors = Behaviors();
                                                       fighter.addBehaviors(fighterBehaviors);
            break;
          default:
            jj_la1[3] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      }
      jj_consume_token(CLOSECURLYBRACKET);
                  fighters.add(fighter);
    }
    jj_consume_token(0);
          {if (true) return fighters;}
    throw new Error("Missing return statement in function");
  }

  final public Strength Strength() throws ParseException {
    Token name = new Token();
    Token value = new Token();
    name = jj_consume_token(IDENTIFIER);
    jj_consume_token(ASSIGNMENT);
    value = jj_consume_token(PROPERTYVALUE);
                                {if (true) return new Strength(name.toString(),Integer.valueOf(value.toString()));}
    throw new Error("Missing return statement in function");
  }

  final public List<Behavior> Behaviors() throws ParseException {
    Condition condition = new Condition();

    List<Move> moves = new ArrayList<Move>();
    List<Attack> attacks = new ArrayList<Attack>();

    List<Behavior> behaviors = new ArrayList<Behavior>();
    condition = Condition();
    jj_consume_token(OPENSQAREBRACKET);
    moves = Moves();
    attacks = Attacks();
    jj_consume_token(CLOSESQAREBRACKET);
        for(Move move : moves)
        {
            for(Attack attack : attacks)
            {
                behaviors.add(new Behavior(condition,move,attack));
            }
        }
        {if (true) return behaviors;}
    throw new Error("Missing return statement in function");
  }

  final public Condition Condition() throws ParseException {
    Token conditionToken = new Token();
    Token secondConditionToken = new Token();

    Condition condition;
    if (jj_2_3(2)) {
      if (jj_2_2(2)) {
        conditionToken = jj_consume_token(IDENTIFIER);
        jj_consume_token(AND);
        secondConditionToken = jj_consume_token(IDENTIFIER);
                    condition = new AndCondition();
                    ((AndCondition)condition).setCondition(conditionToken.toString());
                    ((AndCondition)condition).setAndCondition(secondConditionToken.toString());
                    {if (true) return condition;}
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
          conditionToken = jj_consume_token(IDENTIFIER);
          jj_consume_token(OR);
          secondConditionToken = jj_consume_token(IDENTIFIER);
                    condition = new OrCondition();
                    ((OrCondition)condition).setCondition(conditionToken.toString());
                    ((OrCondition)condition).setOrCondition(secondConditionToken.toString());
                    {if (true) return condition;}
          break;
        default:
          jj_la1[4] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIFIER:
        conditionToken = jj_consume_token(IDENTIFIER);
                    condition = new Condition();
                    condition.setName(conditionToken.toString());
                    {if (true) return condition;}
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    throw new Error("Missing return statement in function");
  }

  final public List<Move> Moves() throws ParseException {
        Token moveToken = new Token();
        List<Move> moves = new ArrayList<Move>();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
      moveToken = jj_consume_token(IDENTIFIER);
                                   moves.add(new Move(moveToken.toString())); {if (true) return moves;}
      break;
    case CHOOSE:
      jj_consume_token(CHOOSE);
      jj_consume_token(OPENPARENTHESIS);
      label_4:
      while (true) {
        moveToken = jj_consume_token(IDENTIFIER);
                                      moves.add(new Move(moveToken.toString()));
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[6] = jj_gen;
          break label_4;
        }
      }
      jj_consume_token(CLOSEPARENTHESIS);
      {if (true) return moves;}
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public List<Attack> Attacks() throws ParseException {
    Token attackToken = new Token();
    ArrayList<Attack> attacks = new ArrayList<Attack>();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
      attackToken = jj_consume_token(IDENTIFIER);
                                     attacks.add(new Attack(attackToken.toString())); {if (true) return attacks;}
      break;
    case CHOOSE:
      jj_consume_token(CHOOSE);
      jj_consume_token(OPENPARENTHESIS);
      label_5:
      while (true) {
        attackToken = jj_consume_token(IDENTIFIER);
                                        attacks.add(new Attack(attackToken.toString()));
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[8] = jj_gen;
          break label_5;
        }
      }
      jj_consume_token(CLOSEPARENTHESIS);
      {if (true) return attacks;}
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_3R_7() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(OR)) return true;
    return false;
  }

  private boolean jj_3R_6() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(ASSIGNMENT)) return true;
    return false;
  }

  private boolean jj_3_1() {
    if (jj_3R_6()) return true;
    return false;
  }

  private boolean jj_3_3() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3R_7()) return true;
    }
    return false;
  }

  private boolean jj_3_2() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(AND)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public SafTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[10];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x400,0x400,0x400,0x400,0x400,0x400,0x400,0x600,0x400,0x600,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[3];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Saf(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Saf(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SafTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Saf(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SafTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Saf(SafTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(SafTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
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
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
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
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
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
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[19];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 10; i++) {
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
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 3; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
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
