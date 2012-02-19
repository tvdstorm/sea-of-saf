grammar SAF;

options {
  language = Java;
}

@header 
{
  package nl.uva.lap.saf;
  import nl.uva.lap.saf.ast.action.Action;
  import nl.uva.lap.saf.ast.action.Choose;
  import nl.uva.lap.saf.ast.Ident;
  import nl.uva.lap.saf.ast.action.SimpleAction;
  import nl.uva.lap.saf.ast.fighter.Behaviour;
  import nl.uva.lap.saf.ast.fighter.Fighter;
  import nl.uva.lap.saf.ast.fighter.Personality;
  import nl.uva.lap.saf.ast.condition.Condition;
  import nl.uva.lap.saf.ast.condition.SimpleCondition;
  import nl.uva.lap.saf.ast.condition.And;
  import nl.uva.lap.saf.ast.condition.Or;
}

@lexer::header 
{
  package nl.uva.lap.saf;
}

@parser::members
{
	Fighter fighter;
	List<Personality> personalities = new ArrayList<Personality>();
	List<Behaviour> behaviours = new ArrayList<Behaviour>();
}

//fighters : fighter*;

fighter returns [Fighter fighter]: name=IDENT '{' statement* '}' 
	{fighter = new Fighter($name.text, personalities, behaviours);};

statement: personalityStatement | behaviourStatement;

personalityStatement: personality=IDENT '=' value=INTEGER 
	{personalities.add(new Personality($personality.text, $value.text));};

behaviourStatement : cond=conditions '[' action1=actionStatement action2=actionStatement? ']'
	{
		if(action2 == null)
			behaviours.add(new Behaviour(cond, action1));
		else
			behaviours.add(new Behaviour(cond, action1, action2));
	};

simpleCondition returns [Condition simple] : cond=IDENT {$simple=new SimpleCondition($cond.text);};
connectCondition returns[Condition connect] :	(
		'(' lhs=conditions ')' op=('and'|'or') rhs=conditions
		| lhs=simpleCondition op=('and'|'or') '(' rhs=conditions ')'
		| lhs=simpleCondition op=('and'|'or') rhs=simpleCondition)
	{	
		if($op.text.equals("and"))
			connect = new And(lhs, rhs);
		else
			connect = new Or(lhs, rhs);
	};

conditions returns [Condition cond]
	: simpleCondition {cond=$simpleCondition.simple;}
	| connectCondition {cond=$connectCondition.connect;};



simpleAction returns [Action simple]: action=IDENT {simple = new SimpleAction($action.text);}; 
	
chooseAction returns[Action choose] 
	@init{List actions = new ArrayList<Action>();}
	: 'choose' '(' (simple=simpleAction{actions.add(simple);})+ ')' 
	{choose = new Choose(actions);};


actionStatement returns [Action action]
	:	simple=simpleAction {action=simple;} 
	|	choose=chooseAction {action=choose;};

INTEGER : (('1' '0'?) | '2'..'9'); //1 to 10 inclusive
IDENT : ('0'..'9')*('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9' | '-' | '_')*; //identifier has to have atleast one character

//ignore all whitespace and comments:
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMENT : '//' .* ('\n'|'\r') {$channel = HIDDEN;};
MULTICOMMENT : '/*' .* '*/' {$channel = HIDDEN;};