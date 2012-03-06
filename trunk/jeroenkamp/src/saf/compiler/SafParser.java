// Output created by jacc on Tue Mar 06 17:03:53 CET 2012

package saf.compiler;

import saf.compiler.types.*;
import saf.compiler.common.*;

class SafParser implements SafTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private SafObject[] yysv;
    private SafObject yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new SafObject[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 38:
                    switch (yytok) {
                        case VAR:
                            yyn = 2;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 39:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 76;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 40:
                    switch (yytok) {
                        case '{':
                            yyn = 3;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 41:
                    switch (yytok) {
                        case VAR:
                            yyn = 8;
                            continue;
                        case '(':
                            yyn = 9;
                            continue;
                        case '}':
                            yyn = 10;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 42:
                    switch (yytok) {
                        case '[':
                            yyn = 11;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 43:
                    switch (yytok) {
                        case VAR:
                            yyn = 8;
                            continue;
                        case '(':
                            yyn = 9;
                            continue;
                        case '}':
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 44:
                    switch (yytok) {
                        case '}':
                            yyn = 13;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    switch (yytok) {
                        case AND:
                            yyn = 14;
                            continue;
                        case OR:
                            yyn = 15;
                            continue;
                        case '[':
                        case ')':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 46:
                    switch (yytok) {
                        case '=':
                            yyn = 16;
                            continue;
                        case '[':
                        case OR:
                        case AND:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 47:
                    switch (yytok) {
                        case '(':
                            yyn = 9;
                            continue;
                        case VAR:
                            yyn = 18;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    switch (yytok) {
                        case CHOOSE:
                            yyn = 20;
                            continue;
                        case VAR:
                            yyn = 21;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    switch (yytok) {
                        case '}':
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    switch (yytok) {
                        case '(':
                            yyn = 9;
                            continue;
                        case VAR:
                            yyn = 18;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    switch (yytok) {
                        case '(':
                            yyn = 9;
                            continue;
                        case VAR:
                            yyn = 18;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 24;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    switch (yytok) {
                        case ')':
                            yyn = 25;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    switch (yytok) {
                        case '[':
                        case ')':
                        case OR:
                        case AND:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    switch (yytok) {
                        case CHOOSE:
                            yyn = 27;
                            continue;
                        case VAR:
                            yyn = 28;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    switch (yytok) {
                        case '(':
                            yyn = 29;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    switch (yytok) {
                        case VAR:
                        case ')':
                        case CHOOSE:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    switch (yytok) {
                        case '(':
                        case '}':
                        case VAR:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    switch (yytok) {
                        case '[':
                        case ')':
                        case OR:
                        case AND:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    switch (yytok) {
                        case ']':
                            yyn = 30;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    switch (yytok) {
                        case '(':
                            yyn = 31;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    switch (yytok) {
                        case ']':
                        case VAR:
                        case ')':
                        case CHOOSE:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    switch (yytok) {
                        case CHOOSE:
                            yyn = 20;
                            continue;
                        case VAR:
                            yyn = 21;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    switch (yytok) {
                        case '(':
                        case '}':
                        case VAR:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    switch (yytok) {
                        case CHOOSE:
                            yyn = 27;
                            continue;
                        case VAR:
                            yyn = 28;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    switch (yytok) {
                        case CHOOSE:
                            yyn = 20;
                            continue;
                        case VAR:
                            yyn = 21;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    switch (yytok) {
                        case CHOOSE:
                            yyn = 27;
                            continue;
                        case VAR:
                            yyn = 28;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    switch (yytok) {
                        case ')':
                            yyn = 36;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 73:
                    switch (yytok) {
                        case ')':
                            yyn = 37;
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    switch (yytok) {
                        case VAR:
                        case ')':
                        case CHOOSE:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
                    switch (yytok) {
                        case ']':
                        case VAR:
                        case ')':
                        case CHOOSE:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 79;
                    continue;

                case 76:
                    return true;
                case 77:
                    yyerror("stack overflow");
                case 78:
                    return false;
                case 79:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        SafObject[] newyysv = new SafObject[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yyr1() { // prog : VAR '{' statements '}'
        {yyrv =new Fighter((StringValue)yysv[yysp-4],(Statements)yysv[yysp-2]);}
        yysv[yysp-=4] = yyrv;
        return 1;
    }

    private int yyr2() { // prog : VAR '{' '}'
        {yyrv =new Fighter((StringValue)yysv[yysp-3]);}
        yysv[yysp-=3] = yyrv;
        return 1;
    }

    private int yyr11() { // condition : subcondition AND condition
        { yyrv=new AndCondition((ICondition)yysv[yysp-3],(ICondition) yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypcondition();
    }

    private int yyr12() { // condition : subcondition OR condition
        { yyrv=new OrCondition((ICondition)yysv[yysp-3], (ICondition)yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypcondition();
    }

    private int yyr13() { // condition : subcondition
        yysp -= 1;
        return yypcondition();
    }

    private int yypcondition() {
        switch (yyst[yysp-1]) {
            case 15: return 23;
            case 14: return 22;
            case 9: return 17;
            default: return 4;
        }
    }

    private int yyr9() { // move : CHOOSE '(' move move ')'
        {yyrv=new ChooseMoveAction((IMoveAction)yysv[yysp-3],(IMoveAction)yysv[yysp-2]);}
        yysv[yysp-=5] = yyrv;
        return yypmove();
    }

    private int yyr10() { // move : VAR
        {yyrv = new MoveAction((StringValue)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return yypmove();
    }

    private int yypmove() {
        switch (yyst[yysp-1]) {
            case 29: return 32;
            case 11: return 19;
            default: return 34;
        }
    }

    private int yyr7() { // action : CHOOSE '(' action action ')'
        {yyrv=new ChooseAction((IFightAction)yysv[yysp-3],(IFightAction)yysv[yysp-2]);}
        yysv[yysp-=5] = yyrv;
        return yypaction();
    }

    private int yyr8() { // action : VAR
        {yyrv = new Action((StringValue)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return yypaction();
    }

    private int yypaction() {
        switch (yyst[yysp-1]) {
            case 31: return 33;
            case 19: return 26;
            default: return 35;
        }
    }

    private int yyr5() { // statement : VAR '=' INTEGER
        {yyrv=new VariableStatement((NamesValue)yysv[yysp-3],(IntValue) yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return 5;
    }

    private int yyr6() { // statement : condition '[' move action ']'
        {yyrv=new ActionStatement((ICondition)yysv[yysp-5],(IMoveAction) yysv[yysp-3],(IFightAction) yysv[yysp-2]);}
        yysv[yysp-=5] = yyrv;
        return 5;
    }

    private int yyr3() { // statements : statement statements
        {yyrv=new Statements((Statement)yysv[yysp-2],(Statements) yysv[yysp-1]);}
        yysv[yysp-=2] = yyrv;
        return yypstatements();
    }

    private int yyr4() { // statements : statement
        {yyrv = new Statements((Statement)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return yypstatements();
    }

    private int yypstatements() {
        switch (yyst[yysp-1]) {
            case 3: return 6;
            default: return 12;
        }
    }

    private int yyr14() { // subcondition : '(' condition ')'
        yysp -= 3;
        return 7;
    }

    private int yyr15() { // subcondition : VAR
        { yyrv=new Condition((StringValue)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return 7;
    }

    protected String[] yyerrmsgs = {
    };

  private SafLexer lexer;
  public SafParser(SafLexer lexer) { this.lexer = lexer; }
  private void yyerror(String msg) {
    ErrorModule.addError(ErrorType.FatalError, yyerrno<0 ? msg : yyerrmsgs[yyerrno]);
  }
  public SafObject getRootNode(){
        return yyrv;
  }

}
