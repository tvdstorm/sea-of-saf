tree grammar SAFTreeWalker;

options {
  language = Java;
  tokenVocab = SAF;
  ASTLabelType = CommonTree;
}

@header {
	package parser;
	import data.*;
}

fighter returns [Fighter result]
	:	
		IDENTIFIER 
			p=personality
			//b=behaviour
		{ result = new Fighter($IDENTIFIER.text, p, null); }
	;

personality returns [Personality result]
	: { result = new Personality(); }
		c=characteristic { result.addCharacteristic(c); System.out.println("bla bla"); }
	;
	
characteristic returns [Characteristic result]
	: 	CHARACTERISTIC_TYPE NUMBER
	{ 
		result = new Characteristic($CHARACTERISTIC_TYPE.text, Integer.parseInt($NUMBER.text));
		System.out.println("made a characteristic");
	}
	;
	//: 	bla=characteristicType '=' NUMBER
	//	{ result = new Characteristic(); 
	//		result.setKickPower(Integer.parseInt($NUMBER.text));
	//	}
	//;
	
//characteristicType returns [String result]
//	: 	'punchReach' { result = "punchReach"; }
//	|	'punchPower' { result = "punchPower"; }
//	|	'kickReach' { result = "kickReach"; }
//	|	'kickPower' { result = "kickPower"; }
//	;
	
//behaviour returns [Behaviour result]
//	: { result = new Behaviour(); }
//	;
