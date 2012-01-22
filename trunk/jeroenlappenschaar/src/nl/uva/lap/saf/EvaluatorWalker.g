tree grammar EvaluatorWalker;

options 
{
  language = Java;
  tokenVocab = SAF;
  ASTLabelType = CommonTree;
}


@members
{
	private Fighter fighter = new Fighter();
}

@header
{
	package nl.uva.lap.saf;
}

evaluator : e=expression EOF;

expression :
	| IDENT {fighter.setName($IDENT.text);}
	;
