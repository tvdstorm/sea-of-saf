tree grammar SAFWalker;

options
{
	language = Java;
	tokenVocab = SAF;
	ASTLabelType = CommonTree;
}

@header 
{
  package com.blommesteijn.uva.sc.saf;
  import com.blommesteijn.uva.sc.saf.ast.types.*;
  import java.util.LinkedList;
}

@members 
{
	private List<AstNode> _fighters = new LinkedList<AstNode>();
	private List<AstNode> _properties = null;
	private List<AstNode> _behaviours = null;
	private List<AstNode> _rules = null;
	private List<AstNode> _actions = null;
}


astNode returns [List<AstNode> astNodes]
	:	
		{astNodes = new LinkedList<AstNode>();}
		fighter*
		//perhaps just assign fighters to astNodes...
		{astNodes.addAll((List<AstNode>)_fighters);}
		EOF
	;

fighter returns [Fighter fighter]
	:
		{_properties = new LinkedList<AstNode>();}
		{_behaviours = new LinkedList<AstNode>();}
		^(IDENT property* behaviour*)
		{fighter = new Fighter($IDENT.getLine(), $IDENT.text);}
		{fighter.append(_properties);}
		{fighter.append(_behaviours);}
		{_fighters.add(fighter);}
	;
	
	
property returns [Property property]
	:
	 	^(BECOMES IDENT INTEGER)
		{property = new Property($IDENT.getLine(), $IDENT.text, Integer.parseInt($INTEGER.text));}
	 	{_properties.add(property);}
	;

behaviour returns [Behaviour behaviour]
	:
		{_rules = new LinkedList<AstNode>();}
		{_actions = new LinkedList<AstNode>();}
		^(r1=IDENT operator* action+)
		{behaviour = new Behaviour(r1.getLine(), r1.getText());}
		{behaviour.append(_actions);}
		{behaviour.append(_rules);}
		{_behaviours.add(behaviour);}	
	;

operator
	:
		^(i1=IDENT i2=IDENT)
		{_rules.add(new Condition(i2.getLine(), i2.getText()));}
		{_rules.add(new Operator(i1.getLine(), i1.getText()));}
	;

action returns [Action action]
	:
		IDENT
		{action = new Action($IDENT.getLine(), $IDENT.text);}
		{_actions.add(action);}
	;


	