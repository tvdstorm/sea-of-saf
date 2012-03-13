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
  private List<Fighter> _fighters = null;
  private List<Property> _properties = null;
  private List<Behaviour> _behaviours = null;
  private List<Action> _actions = null;
  private Conditions _conditions = null;
}


astNode returns [AstNode astNode]
  : 
    {astNode = new AstNode();}
    {_fighters = new LinkedList<Fighter>();}
    fighter*
    //perhaps just assign fighters to astNodes...
    {astNode.addFighters(_fighters);}
    EOF
  ;

fighter returns [Fighter fighter]
  :
    {_properties = new LinkedList<Property>();}
    {_behaviours = new LinkedList<Behaviour>();}
    ^(IDENT property* behaviour*)
    {fighter = new Fighter($IDENT.getLine(), $IDENT.text);}
    {fighter.addProperties(_properties);}
    {fighter.addBehaviours(_behaviours);}
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
    {_actions = new LinkedList<Action>();}
    {_conditions = new Conditions();}
    ^(r1=IDENT operator* action+)
    {behaviour = new Behaviour(r1.getLine(), _conditions);}
    {_conditions.addFirstCondition(new Condition(r1.getLine(), r1.getText()));}
    {behaviour.addActions(_actions);}
    {_behaviours.add(behaviour);} 
  ;

operator
  :
    ^(i1=IDENT i2=IDENT)
    {_conditions.addOperator(new Operator(i1.getLine(), i1.getText())); }
    {_conditions.addCondition(new Condition(i2.getLine(), i2.getText())); }
  ;

action returns [Action action]
  :
    IDENT
    {action = new Action($IDENT.getLine(), $IDENT.text);}
    {_actions.add(action);}
  ;


  