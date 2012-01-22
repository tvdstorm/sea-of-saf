grammar SAF;

fighter returns [String name]
@init {
	name = "";
}
	: ( 
		fighterName=ID {$name = $fighterName.text;} 
		'{' '}'
	  );

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

NEWLINE :   '\r'? '\n';