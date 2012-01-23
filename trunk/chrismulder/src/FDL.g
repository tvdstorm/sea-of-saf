grammar FDL;
options { output=AST; }
tokens {
	LDELIM 	= '{' ;
	RDELIM	= '}' ;
	LSQUARE = '[';
	RSQUARE = ']';
	EQ	= '=' ;
	/*KICKREACH = 'kickReach';
        PUCHREACH = 'punchReach';
        KICKPOWER = 'kickPower';
        PUCHPOWER = 'punchPower';
        STRONGER = 'stronger';
	WEAKER = 'weaker';
	MUCH_STRONGER = 'much_stronger';
	MUCH_WEAKER = 'much_weaker';
	EVEN = 'even';
	NEAR = 'near';
	FAR = 'far';*/
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
	SAF_NODE;
	BEHAVIOUR_NODE;
	STRENGTH_NODE;
	CONDITION_NODE;
	ACTION_NODE;
}

@header {
 package parser;
 import AST.*;
}

@lexer::header {
 package parser;
}

@init {
	
}

@members {
    private ArrayList<Node> nodes;
    
    private void addNode(Node n)	 {
    	if (nodes == null) {
    		nodes = new ArrayList<Node>();
    	}
    	nodes.add(n);
    }
    
    public static void main(String[] args) throws Exception {
        FDLLexer lex = new FDLLexer(new ANTLRFileStream(args[0]));
       	CommonTokenStream tokens = new CommonTokenStream(lex);
       	


        FDLParser parser = new FDLParser(tokens);

        try {
	    System.out.println("Start parsing...");
            parser.saf();
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
    }
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

saf:		NAME LDELIM  property_list RDELIM -> ^(NAME property_list);
property_list: 	(property)*;
property:	strength  | behaviour;
strength:	STRENGTH_TOKEN EQ NUMBER -> ^(STRENGTH_NODE STRENGTH_TOKEN NUMBER);
/*strength:	STRENGTH_TOKEN EQ NUMBER -> ^(STRENGTH_TOKEN NUMBER);*/
/*strength_atom:	KICKREACH | PUCHREACH | KICKPOWER | PUCHPOWER;*/

condition:	term (  OR  term )* -> ^(term ( OR term));
behaviour:	condition LSQUARE action RSQUARE -> ^(BEHAVIOUR_NODE condition action);
term:		CONDITION_TOKEN ( AND CONDITION_TOKEN )* -> ^(CONDITION_NODE CONDITION_TOKEN ( AND CONDITION_TOKEN )*);
/*condition_atom:	STRONGER | WEAKER | MUCH_STRONGER | MUCH_WEAKER | EVEN | NEAR | FAR | ALWAYS;*/
action:		move | fight | move fight;
move:		CHOOSE LPARAM move_atom move_atom RPARAM | move_atom; 
move_atom:	JUMP | CROUCH | STAND | RUN_TOWARDS | RUN_AWAY | WALK_TOWARDS | WALK_AWAY; // |
fight:		CHOOSE LPARAM fight_atom fight_atom RPARAM | fight_atom; 
fight_atom:	PUNCH_LOW | PUNCH_HIGH | KICK_LOW | KICK_HIGH | BLOCK_LOW | BLOCK_HIGH; // |

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

NUMBER	: (DIGIT)+ ;
STRENGTH_TOKEN:	'kickReach' | 'punchReach' | 'kickPower' | 'punchPower';
CONDITION_TOKEN:'stronger'| 'weaker'| 'much_stronger' | 'much_weaker'| 'even'| 'near'| 'far'| 'always';
WHITESPACE : ( '\t' | ' ' | '\u000C' | '\r' | '\n')+ 	{ $channel = HIDDEN; } ;
NAME :	'a'..'z'+ ;
fragment DIGIT	: '0'..'9' ;
