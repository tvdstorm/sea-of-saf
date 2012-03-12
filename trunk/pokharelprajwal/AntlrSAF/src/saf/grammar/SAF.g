grammar SAF;

@header {
  package saf;
  import saf.ast.*;
  import saf.ast.action.*;
}

@lexer::header {
  package saf; 
}


bot returns [Bot fighter]
	:	
		{  Personality personality = new Personality();  Behaviour behaviour = new Behaviour(); }
		
		IDENT '{'  
					(  c = characterstics { personality.addCharacterstics(c); }   | r = rule { behaviour.addRule(r); } )*  
			  '}' 
		{ 
			$fighter = new Bot($IDENT.text, personality , behaviour); 
		} 
	;


characterstics returns[Characterstics characterstics]
	:
		IDENT '=' INTEGER  { $characterstics = new Characterstics($IDENT.text, $INTEGER.text);}
	;		


rule returns[Rule rule]
	:{ Rule r = new Rule(); }
	 (a = action { r.AddAction(a); } | '(' (r1 = rule { r.AddRule(r1); }) * ')') ( o = operator r2 = rule { r.AddOperator($o.text, a, r2); } )?
	 { $rule = r; }
	;	

	
action returns[Action action]
	:
	 IDENT { $action = new Ident($IDENT.text); }
	|f = function { $action = f; } 
	|c = choose {$action = c ;}
	;

				
function returns[Function function]
	:
	 IDENT '[' p = parameters ']' { $function = new Function($IDENT.text, p); }
	;


choose returns[Choose choose]
	:
	 'choose(' i1 = IDENT i2 = IDENT ')' { $choose = new Choose($i1.text, $i2.text); }
	;
		

parameters returns[Parameters parameters]
	:
	 i1 = IDENT i2 = IDENT { $parameters = new Parameters($i1.text, $i2.text); }
	|c1 = choose i3 = IDENT { $parameters = new Parameters(c1, $i3.text); }
	|i4 = IDENT c2 = choose { $parameters = new Parameters($i4.text, c2); }
	|c3 = choose c4 = choose { $parameters = new Parameters(c3, c4); }
	;
	

operator
	:
	 'and'	
	|'or'
	;


INTEGER : '0'..'9'+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9'| '_')*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};