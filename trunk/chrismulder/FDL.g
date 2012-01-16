grammar FDL;
tokens {
	LDELIM 	= '{' ;
	RDELIM	= '}' ;
	LSQUARE = '[';
	RSQUARE = ']';
	EQ	= '=' ;
	KICKREACH = 'kickReach';
        PUCHREACH = 'punchReach';
        KICKPOWER = 'kickPower';
        PUCHPOWER = 'punchPower';
        STRONGER = 'stronger';
	WEAKER = 'weaker';
	MUCH_STRONGER = 'much_stronger';
	MUCH_WEAKER = 'much_weaker';
	EVEN = 'even';
	NEAR = 'near';
	FAR = 'far';
	ALWAYS = 'always';
	PUNCH_LOW = 'punch_low';
	PUNCH_HIGH = 'punch_high';
	KICK_LOW = 'kick_low';
	KICK_HIGH = 'kick_high';
	BLOCK_LOW = 'block_low';
	BLOCK_HIGH = 'block_high';
	JUMP = 'jump';
	CROUCH = 'crouch';
	STAND = 'stand';
	RUN_TOWARDS = 'run_towards';
	RUN_AWAY = 'run_away';
	WALK_TOWARDS = 'walk_towards';
	WALK_AWAY = 'walk_away';
	CHOOSE = 'choose';
	LPARAM  = '(';
	RPARAM = ')';
	AND = 'and';
	OR = 'or';
}

@members {
    public static void main(String[] args) throws Exception {
        FDLLexer lex = new FDLLexer(new ANTLRFileStream(args[0]));
       	CommonTokenStream tokens = new CommonTokenStream(lex);

        FDLParser parser = new FDLParser(tokens);

        try {
            parser.saf();
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
    }
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

saf:		 NAME LDELIM  property_list RDELIM ;
property_list: 	(property)*;
property:	strength | behaviour ;
strength: 	(KICKREACH| PUCHREACH | KICKPOWER | PUCHPOWER) EQ NUMBER;
behaviour:	condition LSQUARE action RSQUARE;
condition:	term (  OR  term )* ;
term: 		condition_atom ( AND condition_atom )*;
condition_atom:	STRONGER | WEAKER | MUCH_STRONGER | MUCH_WEAKER | EVEN | NEAR | FAR | ALWAYS;
action:       	move | fight | move fight;
fight_atom:	PUNCH_LOW | PUNCH_HIGH | KICK_LOW | KICK_HIGH | BLOCK_LOW | BLOCK_HIGH; // |
move_atom: 	JUMP | CROUCH | STAND | RUN_TOWARDS | RUN_AWAY | WALK_TOWARDS | WALK_AWAY; // |
move:		CHOOSE LPARAM move_atom move_atom RPARAM | move_atom; 
fight:		CHOOSE LPARAM fight_atom fight_atom RPARAM | fight_atom; 

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

NUMBER	: (DIGIT)+ ;

WHITESPACE : ( '\t' | ' ' | '\u000C' | '\r' | '\n')+ 	{ $channel = HIDDEN; } ;
NAME :	'a'..'z'+ ;
fragment DIGIT	: '0'..'9' ;